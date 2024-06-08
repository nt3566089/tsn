package com.oneslogi.wms.logic.shipping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;

/**
 * コントロールNo.更新(出荷)ロジッククラス
 */
public class UpdateControlNoLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	// 入荷予定ヘッダのコントロールNo.更新 2016.3.15 nayzaw Start
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	// 入荷予定ヘッダのコントロールNo.更新 2016.3.15 nayzaw End
	// 出荷指示ボディのコントロールNo.更新 2016.4.22 nayzaw Start
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// 出荷指示ボディのコントロールNo.更新 2016.4.22 nayzaw End

	// [C-CWMS-0066] 非同期処理化 2016.11.09 kawana Start

	// ===== 使用ロジック =====

	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;
	// [C-CWMS-0066] 非同期処理化 2016.11.09 kawana End

	/**
	 * <h2>出荷指示ヘッダのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出荷指示ヘッダのコントロールNo.を更新する。
	 * </pre>
	 * @param list 出荷指示ヘッダリスト：出荷指示ヘッダID・センタID・荷主ID・出庫作業No.・コントロールNo.・更新日時
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数合計
	 */
	public int update(List<TShippingInstH> list, Long controlNo, ErrorStatus errSts) {

		// ===== 出荷指示ヘッダデータ取得 =====
		int reUpdCnt = 0;

		Set<String> set = new HashSet<String>();

		for (TShippingInstH tShippingInstH : list) {
			// 検索条件の設定
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();

			if (controlNo != null) {
				//コントロールNo.設定処理

				// [横並-109] 出庫作業No.の場合、検索条件を追加 2014.11.26 楊寧 Start
				if (!CU.isNullOrEmpty(tShippingInstH.getPickingWorkNo())) {

					if (set.contains(tShippingInstH.getPickingWorkNo())) {
						continue;
					}
					set.add(tShippingInstH.getPickingWorkNo());

					cb.query().setClientId_Equal(tShippingInstH.getClientId());
					cb.query().setCenterId_Equal(tShippingInstH.getCenterId());
					cb.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(tShippingInstH.getPickingWorkNo());
				} else {
					cb.query().setShippingInstHId_Equal(tShippingInstH.getShippingInstHId());
				}
				// [横並-109] 出庫作業No.の場合、検索条件を追加 2014.11.26 楊寧 End

				//コントロールNoがNull(他で使用していない)確認条件追加 2016.3.16 nayzaw Start
				cb.query().setControlNo_IsNull();
				//コントロールNoがNull(他で使用していない)確認条件追加 2016.3.16 nayzaw End
				cb.query().setUpdDt_LessEqual(tShippingInstH.getUpdDt());

			} else {
				//コントロールNo.による一括更新
				cb.query().setControlNo_Equal(tShippingInstH.getControlNo());
			}

			TShippingInstH updateTShippingInstH = new TShippingInstH();
			updateTShippingInstH.setControlNo(controlNo);
			int count = tShippingInstHBhv.queryUpdate(updateTShippingInstH, cb);
			reUpdCnt = reUpdCnt + count;
		}

		return reUpdCnt;
	}

	// [C-CWMS-0066] 非同期処理化 2016.11.09 kawana Start

	/**
	 * <h2>出荷指示ヘッダのコントロールNo.更新。</h2>
	 * <pre>
	 * 出荷指示ヘッダのコントロールNo.を空(null)にする。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @return int 更新件数
	 */
	public int clearShippingInstH(long controlNo) {

		// 検索条件の設定
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		TShippingInstH updateTShippingInstH = new TShippingInstH();
		updateTShippingInstH.setControlNo(null);

		// デッドロック対策メソッドを使用
		int count = queryUpdateLogic.queryUpdateWithSelect(tShippingInstHBhv, updateTShippingInstH, cb, queryUpdateSettingsLogic.getQuerySetter(tShippingInstHBhv));

		return count;
	}

	// [C-CWMS-0066] 非同期処理化 2016.11.09 kawana End

	// 出荷指示ヘッダのコントロールNo更新処理追加 2016.5.24 nayzaw Start
	/**
	 * <h2>出荷指示ヘッダのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出荷指示ヘッダのコントロールNo.を更新する。
	 * </pre>
	 * @param oldControlNo 現在DBに保存しているコントロールNo.
	 * @param controlNo 更新したいコントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
	public int updateTShippingInstHeader(Long oldControlNo, Long controlNo, ErrorStatus errSts){
		// 検索条件の設定
		int reUpdCnt = 0;
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(oldControlNo);
		TShippingInstH updateTShippingInstH = new TShippingInstH();
		updateTShippingInstH.setControlNo(controlNo);
		reUpdCnt = tShippingInstHBhv.queryUpdate(updateTShippingInstH, cb);
		return reUpdCnt;
	}
	// 出荷指示ヘッダのコントロールNo更新処理追加 2016.5.24 nayzaw End
	// 出荷指示ボディのコントロール更新処理追加 2016.4.22 nayzaw Start
	/**
	 * <h2>出荷指示ボディのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出荷指示ヘッダのコントロールNo.を更新する。
	 *
	 * </pre>
	 * @param oldControlNo 現在DBに保存しているコントロールNo.
	 * @param newControlNo 更新したいコントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
	public int updateTShippingInstBody(Long oldControlNo, Long newControlNo, ErrorStatus errSts){
		// ===== 出荷指示ボディデータ取得 =====
		int reUpdCnt = 0;

		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(oldControlNo);
		TShippingInstB updateTShippingInstB = new TShippingInstB();
		updateTShippingInstB.setControlNo(newControlNo);
		reUpdCnt = tShippingInstBBhv.queryUpdate(updateTShippingInstB, cb);

		return reUpdCnt;
	}
	// 出荷指示ボディのコントロール更新処理追加 2016.4.22 nayzaw End

	/**
	 * <h2>出庫ヘッダのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫ヘッダのコントロールNo.を更新する。
	 * </pre>
	 * @param pickingHeaderList 出庫ヘッダリスト：センタID・荷主ID・出庫作業No.・コントロールNo.・更新日時・出荷確定解除フラグ
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数の合計
	 */
	public int updateTPickingH(List<TPickingH> pickingHeaderList, Long controlNo, ErrorStatus errSts) {

		// ===== 出庫ヘッダデータ取得 =====
		int reUpdCnt = 0;
		//		ListResultBean<TPickingH> result = null;
		for (TPickingH tPickingH : pickingHeaderList) {
			// 検索条件の設定
			TPickingHCB cb = tPickingHBhv.newMyConditionBean();

			//コントロールNo.の設定
			cb.query().setControlNo_Equal(tPickingH.getControlNo());
			if (controlNo != null) {
				cb.query().setClientId_Equal(tPickingH.getClientId());
				cb.query().setCenterId_Equal(tPickingH.getCenterId());
				cb.query().setUpdDt_LessEqual(tPickingH.getUpdDt());
				cb.query().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());

				if ("00".equals(tPickingH.getConfirmCancelFlg())) {
					cb.query().setPickingStatus_Equal_$50();

				} else if ("20".equals(tPickingH.getConfirmCancelFlg())) {
					cb.query().setPickingStatus_Equal_$55();
				}
			}

			TPickingH updateTPickingH = new TPickingH();
			updateTPickingH.setControlNo(controlNo);
			int count = tPickingHBhv.queryUpdate(updateTPickingH, cb);
			reUpdCnt = reUpdCnt + count;
		}
		return reUpdCnt;
	}

	// 入荷予定ヘッダのコントロールNo.更新 2016.3.15 nayzaw Start
	/**
	 * <h2>入荷予定ヘッダのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、入荷予定ヘッダのコントロールNo.を更新する。
	 * </pre>
	 * @param list 入荷予定ヘッダリスト：入荷予定ヘッダID・センタID・荷主ID・コントロールNo.
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数の合計
	 */
	public int updateTReceivePlanH(List<TReceivePlanH> list, Long controlNo, ErrorStatus errSts){

		// ===== 入荷予定ヘッダデータ取得 ====
		int reUpdCnt = 0;

		for(TReceivePlanH tReceivePlanH : list){
			// 検索条件の設定

			TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
			if(controlNo != null){
				//コントロールNo.設定処理

				cb.query().setClientId_Equal(tReceivePlanH.getClientId());
				cb.query().setCenterId_Equal(tReceivePlanH.getCenterId());
				cb.query().setReceivePlanHId_Equal(tReceivePlanH.getReceivePlanHId());
				// コントロールNoがNull(他で使用していない)確認条件
				cb.query().setControlNo_IsNull();
			}
			else{
				cb.query().setControlNo_Equal(tReceivePlanH.getControlNo());
			}
			TReceivePlanH updateTReceivePlanH = new TReceivePlanH();
			updateTReceivePlanH.setControlNo(controlNo);
			int count = tReceivePlanHBhv.queryUpdate(updateTReceivePlanH, cb);
			reUpdCnt = reUpdCnt + count;
		}
		return reUpdCnt;
	}
	// 入荷予定ヘッダのコントロールNo.更新 2016.3.15 nayzaw End

	// 入荷予定ヘッダのコントロールNo更新処理追加 2016.5.27 nayzaw Start
		/**
		 * <h2>入荷予定ヘッダのコントロールNo.を更新する。</h2>
		 * <pre>
		 * 引数を絞り込み条件に設定し、入荷予定ヘッダのコントロールNo.を更新する。
		 * </pre>
		 * @param oldControlNo 現在DBに保存しているコントロールNo.
		 * @param controlNo コントロールNo.
		 * @param errSts エラー時に設定するエラーステータス
		 * @return int 更新件数
		 */
		public int updateTReceivePlanHByControlNo(Long oldControlNo, Long controlNo, ErrorStatus errSts){
			// 検索条件の設定
			int reUpdCnt = 0;
			TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
			cb.query().setControlNo_Equal(oldControlNo);
			TReceivePlanH updateTReceivePlanH = new TReceivePlanH();
			updateTReceivePlanH.setControlNo(controlNo);
			reUpdCnt = tReceivePlanHBhv.queryUpdate(updateTReceivePlanH, cb);
			return reUpdCnt;
		}
		// 入荷予定ヘッダのコントロールNo更新処理追加 2016.5.27 nayzaw End


}