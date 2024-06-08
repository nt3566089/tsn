package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanDeleteLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanInsertLogic;

/**
 * 出荷確定ロジッククラス
 */
public class ShipCompleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;

	// ===== 使用ロジック =====
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private ReceivePlanInsertLogic receivePlanInsertLogic;
	@Inject
	private ReceivePlanDeleteLogic receivePlanDeleteLogic;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

	/**
	 * <h2>通常出荷確定処理を実行する。</h2>
	 * <pre>
	 * 引数をチェック後、出庫ヘッダのコントロールNo.で対象データを取得し、
	 *【在庫更新.出庫確定［黒］】処理を実行する。
	 *
	 * センタ間移動の場合、入荷予定を作成する。
	 * 出庫ヘッダの強制確定フラグ（0:通常確定）で更新し、
	 *【出荷ステータス更新.出荷確定】を実行する。
	 *
	 *【在庫更新.出庫確定［黒］】
	 *・{@link StockUpdateLogic#shipCompleted(TPickingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.出庫確定［黒］メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷確定】
	 * ・{@link ShipStatusUpdateLogic#shipCompleted(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷確定のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param pickingHeader 出庫ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ShipComplete(TPickingH pickingHeader, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// ===== 引数チェック =====

		// pickingHeader.コントロールNo.がNULLの場合
		if ( pickingHeader.getControlNo() == null ) {
			// 致命的例外をスローする(パラメータ不正)
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 通常確定 =====

		// 出荷確定.通常確定メソッドを呼出し
		Complete(pickingHeader, errSts);

		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * <h2>通常出荷確定を実行する。</h2>
	 * <pre>
	 * 出庫ヘッダのコントロールNo.で対象データを取得し、
	 *【在庫更新.出庫確定［黒］】処理を実行する。
	 *
	 * センタ間移動の場合、入荷予定を作成する。
	 * 出庫ヘッダの強制確定フラグ（0:通常確定）で更新し、
	 *【出荷ステータス更新.出荷確定】を実行する。
	 *
	 *【在庫更新.出庫確定［黒］】
	 *・{@link StockUpdateLogic#shipCompleted(TPickingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.出庫確定［黒］メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷確定】
	 * ・{@link ShipStatusUpdateLogic#shipCompleted(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷確定のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param pickingHeader 出庫ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void Complete(TPickingH pickingHeader, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// 繰返用List変数宣言
		List<TPickingH> tPickingList = null;
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>();


		// ===== 出庫ヘッダ検索（コントロールNo.） =====

		// 検索条件の設定
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(pickingHeader.getControlNo());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
		cb.setupSelect_TAllocInstH();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

		// 検索実行
		tPickingList = tPickingHBhv.selectList(cb);

		// ===== 出庫ヘッダ.検索件数＝０ =====
		if (tPickingList.size() == 0) {
			// ===== 致命的例外をスロー =====

			// 致命的例外をスローする(パラメータ不正)
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
		// 出庫ボディを検索
		tPickingHBhv.loadTPickingBList(tPickingList, new ConditionBeanSetupper<TPickingBCB>() {

			@Override
			public void setup(TPickingBCB pickingBodyCb) {
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				pickingBodyCb.setupSelect_TStock().withMProduct();
				pickingBodyCb.setupSelect_TStock().withMCustomer();
				pickingBodyCb.setupSelect_TStock().withTLot();
				pickingBodyCb.setupSelect_TStock().withTStoreNo();
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
				pickingBodyCb.setupSelect_TShippingInstB().withTShippingInstH();
			}
		});
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

		int i = 0;
		for (TPickingH entity : tPickingList){

			// ===== 在庫更新.出庫確定［黒］ =====
			stockUpdateLogic.shipCompleted(entity,errSts);

			// エラーが登録されている場合
			if (this.getErrorManager().size() > 0) {
				return;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			// 荷主センタマスタ取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(entity.getClientId());
			mClientCenter.setCenterId(entity.getCenterId());
			mClientCenter = clientCenterLogic.getUkEntityWithCustomer(mClientCenter);

			// ===== 入荷予定作成(センタ間移動の場合) =====
			if (entity.isCenterTransitFlg$1()) {
				MCustomer selfCustomer = mClientCenter.getMCustomer();
				insertReceivePlan(entity, entity.getTPickingBList(), selfCustomer, errSts);
				if (this.getErrorManager().size() > 0) {
					return;
				}
			}

			// ===== 出庫ヘッダ更新（通常確定→強制確定フラグ） =====

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

			// 更新項目の設定
			entity.setForceFixedFlg_$0();
			entity.setShippingFixedDt(mClientCenter.getSystemDt());

			// 強制確定フラグを0:通常確定に更新
			tPickingHBhv.update(entity);

			tPickingHList.add(i,entity);

			i++;
		}

		// ===== 出荷ステータス更新.出荷確定 =====
		shipStatusUpdateLogic.shipCompleted(tPickingHList,errSts);

		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * <h2>強制出荷確定を実行する。</h2>
	 * <pre>
	 * 出庫ヘッダのコントロールNo.で対象データを取得し、
	 *【在庫更新.出庫確定［黒］】処理を実行する。
	 *
	 * センタ間移動の場合、入荷予定を作成する。
	 * 出庫ヘッダの強制確定フラグを（1:強制確定）で更新する。
	 *【出荷ステータス更新.出荷確定】を実行する。
	 *
	 *【在庫更新.出庫確定［黒］】
	 *・{@link StockUpdateLogic#shipCompleted(TPickingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.出庫確定［黒］メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷確定】
	 * ・{@link ShipStatusUpdateLogic#shipCompleted(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷確定のステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param pickingHeader 出庫ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ForcedShipComplete(TPickingH pickingHeader, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// ===== 引数チェック =====

		// pickingHeader.コントロールNo.がNULLの場合
		if ( pickingHeader.getControlNo() == null ) {
			// 致命的例外をスローする(パラメータ不正)
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 強制確定 =====

		// 出荷確定.強制確定メソッドを呼出し
		ForcedComplete(pickingHeader, errSts);

		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * <h2>強制出荷確定を実行する。</h2>
	 * <pre>
	 * 出庫ヘッダのコントロールNo.で対象データを取得し、
	 *【在庫更新.出庫確定［黒］】処理を実行する。
	 *
	 * センタ間移動の場合、入荷予定を作成する。
	 * 出庫ヘッダの強制確定フラグを（1:強制確定）で更新する。
	 *【出荷ステータス更新.出荷確定】を実行する。
	 *
	 *【在庫更新.出庫確定［黒］】
	 *・{@link StockUpdateLogic#shipCompleted(TPickingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.出庫確定［黒］メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷確定】
	 * ・{@link ShipStatusUpdateLogic#shipCompleted(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷確定のステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param pickingHeader 出庫ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ForcedComplete(TPickingH pickingHeader, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// 繰返用List変数宣言
		List<TPickingH> tPickingList = null;
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>();

		// ===== 出庫ヘッダ検索（コントロールNo.） =====

		// 検索条件の設定
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(pickingHeader.getControlNo());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
		cb.setupSelect_TAllocInstH();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

		// 検索実行
		tPickingList = tPickingHBhv.selectList(cb);

		// ===== 出庫ヘッダ.検索件数＝０ =====
		if (tPickingList.size() == 0) {
			// ===== 致命的例外をスロー =====

			// 致命的例外をスローする(パラメータ不正)
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
		// 出庫ボディを検索
		tPickingHBhv.loadTPickingBList(tPickingList, new ConditionBeanSetupper<TPickingBCB>() {

			@Override
			public void setup(TPickingBCB pickingBodyCb) {
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				pickingBodyCb.setupSelect_TStock().withMProduct();
				pickingBodyCb.setupSelect_TStock().withMCustomer();
				pickingBodyCb.setupSelect_TStock().withTLot();
				pickingBodyCb.setupSelect_TStock().withTStoreNo();
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
				pickingBodyCb.setupSelect_TShippingInstB().withTShippingInstH();
			}
		});
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

		int i = 0;
		for (TPickingH entity : tPickingList){

			// ===== 在庫更新.出庫確定［黒］ =====
			stockUpdateLogic.shipCompleted(entity,errSts);

			// エラーが登録されている場合
			if (this.getErrorManager().size() > 0) {
				return;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start

			// 荷主センタマスタ取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(entity.getClientId());
			mClientCenter.setCenterId(entity.getCenterId());
			mClientCenter = clientCenterLogic.getUkEntityWithCustomer(mClientCenter);

			// ===== 入荷予定作成(センタ間移動の場合) =====
			if (entity.isCenterTransitFlg$1()) {
				MCustomer selfCustomer = mClientCenter.getMCustomer();
				insertReceivePlan(entity, entity.getTPickingBList(), selfCustomer, errSts);
				if (this.getErrorManager().size() > 0) {
					return;
				}
			}

			// ===== 出庫ヘッダ更新（強制確定→強制確定フラグ） =====

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

			// 更新項目の設定
			entity.setForceFixedFlg_$1();
			entity.setShippingFixedDt(mClientCenter.getSystemDt());

			// 強制確定フラグを1:強制確定に更新
			tPickingHBhv.update(entity);

			tPickingHList.add(i,entity);

			i++;

		}

		// ===== 出荷ステータス更新.出荷確定 =====
		shipStatusUpdateLogic.shipCompleted(tPickingHList,errSts);

		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * <h2>出荷確定解除を実行する。</h2>
	 * <pre>
	 * 引数をチェック後、出庫ヘッダのコントロールNo.で対象データを取得し、
	 *【在庫更新.出庫確定［赤］】処理を実行する。
	 *
	 * センタ間移動の場合、入荷予定を削除する。
	 * 出庫ヘッダの強制確定フラグと出荷確定日をNULLで更新し、
	 *【出荷ステータス更新.出荷確定解除】を実行する。
	 *
	 *【在庫更新.出庫確定［赤］】
	 *・{@link StockUpdateLogic#shipCompletedCancel(TPickingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.出庫確定［赤］メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷確定解除】
	 * ・{@link ShipStatusUpdateLogic#shipCompletedCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷確定解除のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param pickingHeader 出庫ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ShipCompleteCancel(TPickingH pickingHeader, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// ===== 引数チェック =====

		// pickingHeader.コントロールNo.がNULLの場合
		if ( pickingHeader.getControlNo() == null ) {
			// 致命的例外をスローする(パラメータ不正)
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 確定解除 =====

		// 出荷確定.出荷確定解除メソッドを呼出し
		Cancel(pickingHeader, errSts);

		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * <h2>出荷解除を実行する。</h2>
	 * <pre>
	 * 出庫ヘッダのコントロールNo.で対象データを取得し、
	 *【在庫更新.出庫確定［赤］】処理を実行する。
	 *
	 * センタ間移動の場合、入荷予定を削除する。
	 * 出庫ヘッダの強制確定フラグと出荷確定日をNULLで更新し、
	 *【出荷ステータス更新.出荷確定解除】を実行する。
	 *
	 *【在庫更新.出庫確定［赤］】
	 *・{@link StockUpdateLogic#shipCompletedCancel(TPickingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.出庫確定［赤］メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷確定解除】
	 * ・{@link ShipStatusUpdateLogic#shipCompletedCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷確定解除のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param pickingHeader 出庫ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void Cancel(TPickingH pickingHeader, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// 繰返用List変数宣言
		List<TPickingH> tPickingList = null;
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>();

		// ===== 出庫ヘッダ検索（コントロールNo.） =====

		// 検索条件の設定
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(pickingHeader.getControlNo());

		// 検索実行
		tPickingList = tPickingHBhv.selectList(cb);

		// ===== 出庫ヘッダ.検索件数＝０ =====
		if (tPickingList.size() == 0) {
			// ===== 致命的例外をスロー =====

			// 致命的例外をスローする(パラメータ不正)
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
		// 入荷予定ヘッダを検索
		tPickingHBhv.loadTReceivePlanHList(tPickingList, new ConditionBeanSetupper<TReceivePlanHCB>() {
			@Override
			public void setup(TReceivePlanHCB loadCb) {
				loadCb.setupSelect_TReceivePlanRAsOne();
			}
		});
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

		int i = 0;
		for (TPickingH entity : tPickingList){

			// ===== 在庫更新.出庫確定［赤］ =====
			stockUpdateLogic.shipCompletedCancel(entity,errSts);

			// エラーが登録されている場合
			if (this.getErrorManager().size() > 0) {
				return;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			// ===== 入荷予定を削除(センタ間移動の場合) =====
			if (entity.isCenterTransitFlg$1()) {
				deleteReceivePlan(entity, errSts);
				if (this.getErrorManager().size() > 0) {
					return;
				}
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

			// ===== 出庫ヘッダ更新（通常確定→強制確定フラグ） =====

			// 更新項目の設定
			entity.setForceFixedFlg(null);
			entity.setShippingFixedDt(null);

			// 強制確定フラグをNULLに更新
			tPickingHBhv.update(entity);

			tPickingHList.add(i,entity);

			i++;

		}

		// ===== 出荷ステータス更新.出荷確定解除 =====
		shipStatusUpdateLogic.shipCompletedCancel(tPickingHList,errSts);

		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start

	/**
	 * <h2>入荷予定を作成する。</h2>
	 * <pre>
	 * センタ間移動用の入荷予定を作成しDBに登録する。
	 * 登録した入荷予定ヘッダIDを返す。
	 * </pre>
	 * @param pickingH 出庫ヘッダ：荷主ID
	 * @param pickingBodyList 出庫ボディリスト
	 * @param selfCustomer 取引先マスタ：取引先CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void insertReceivePlan(TPickingH pickingH, List<TPickingB> pickingBodyList, MCustomer selfCustomer, ErrorStatus errSts) {

		if (pickingBodyList.size() == 0) {
			return;
		}

		if (selfCustomer == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR);
			return;
		}

		// 移動先のセンタを取得
		MCustomer customer = new MCustomer();
		customer.setCustomerId(pickingH.getTAllocInstH().getSupplyCustomerId());
		customer.setClientId(pickingH.getClientId());
		MCenter supplyCenter = customerLogic.getCenter(customer);

		// デフォルト処理区分、在庫区分を取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setReceiveFlg_$1();
		MProcessType defaultProcessType = processTypeLogic.getDefaultEntity(processTypeCondition);

		if (defaultProcessType == null) {
			// デフォルト設定がない場合は1件目とする
			defaultProcessType = processTypeLogic.getEntityList(processTypeCondition).get(0);
		}

		// 入荷予定の顧客指示No.
		String clientSlipNo = getClientReceiveNo(pickingBodyList);

		// 入荷予定をサマリーしながら作成する
		SummaryReceivePlan summary = new SummaryReceivePlan();

		for (TPickingB pickingB : pickingBodyList) {
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			TStock stock = pickingB.getTStock();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			long stockTypeId = stock.getStockTypeId();
			long depositId = stock.getDepositId();
			long lotId = stock.getLotId();

			// サマリーするキーを作成
			SummaryReceivePlan.HeaderKey headerKey = new SummaryReceivePlan.HeaderKey(stockTypeId, depositId);
			SummaryReceivePlan.BodyKey bodyKey = new SummaryReceivePlan.BodyKey(lotId);

			// ヘッダが未存在の場合は作成する
			if (!summary.containsHeader(headerKey)) {

				// 在庫区分から処理区分を検索
				MProcessType condition = new MProcessType();
				condition.setReceiveFlg_$1();
				condition.setStockTypeId(stockTypeId);
				List<MProcessType> processTypeList = processTypeLogic.getEntityList(condition);
				Long processTypeId;
				if (processTypeList.size() != 0) {
					processTypeId = processTypeList.get(0).getProcessTypeId();
				} else {
					processTypeId = defaultProcessType.getProcessTypeId();
				}

				// ヘッダを作成
				TReceivePlanH header = createReceivePlanH(pickingH, supplyCenter.getCenterId(), processTypeId, stockTypeId, clientSlipNo, selfCustomer, depositId, stock.getMCustomer().getCustomerCd());
				summary.putHeader(headerKey, header);
			}

			// ボディが未存在の場合は作成する
			if (!summary.containsBody(headerKey, bodyKey)) {

				// ボディを作成
				TReceivePlanB body = createReceivePlanB(summary.getNewBodyLineNo(headerKey), stock.getMProduct(), stock.getTLot(), pickingB.getPickingNum());
				summary.putBody(headerKey, bodyKey, body);
			} else {

				// ボディに加算
				TReceivePlanB body = summary.getBody(headerKey, bodyKey);
				body.setPlanNum(WCC.add(body.getPlanNum(), pickingB.getPickingNum()));
				summary.putBody(headerKey, bodyKey, body);
			}
		}

		// DBに入荷予定を登録
		for (SummaryReceivePlan.HeaderKey key : summary.getHeaderKeySet()) {

			TReceivePlanH header = summary.getHeader(key);
			List<TReceivePlanB> bodyList = summary.getBodyList(key);

			// 入荷予定登録ロジックの登録処理を実行
			receivePlanInsertLogic.insert(header, bodyList, errSts);
		}
	}

	/**
	 * <h2>入荷予定ヘッダを作成する。</h2>
	 * <pre>
	 * 入荷予定ヘッダを作成する。
	 *
	 * </pre>
	 * @param pickingH 出庫ヘッダ
	 * @param centerId センタID
	 * @param processTypeId 処理区分ID
	 * @param stockTypeId 在庫区分ID
	 * @param clientSlipNo 予定顧客入荷指示No.
	 * @param supplyCustomer 予定仕入先
	 * @param depositId 予定預託ID
	 * @param depositCd 予定預託CD
	 * @return TReceivePlanH 入荷予定ヘッダ
	 */
	private TReceivePlanH createReceivePlanH(TPickingH pickingH, long centerId, long processTypeId, long stockTypeId, String clientSlipNo, MCustomer supplyCustomer, long depositId, String depositCd) {

		// 入荷予定作成
		TReceivePlanH receivePlanH = new TReceivePlanH();
		receivePlanH.setClientId(pickingH.getClientId());
		receivePlanH.setCenterId(centerId);
		receivePlanH.setProcessTypeId(processTypeId);
		receivePlanH.setStockTypeId(stockTypeId);
		receivePlanH.setReceivePlanDt(CU.coalesce(pickingH.getTAllocInstH().getDelivDt(), pickingH.getTAllocInstH().getDelivPlanDt(), pickingH.getTAllocInstH().getShippingDt()));
		receivePlanH.setPlanClientReceiveNo(clientSlipNo);
		receivePlanH.setPlanSupplierId(supplyCustomer.getCustomerId());
		receivePlanH.setPlanSupplierCd(supplyCustomer.getCustomerCd());
		receivePlanH.setPlanDepositId(depositId);
		receivePlanH.setPlanDepositCd(depositCd);
		receivePlanH.setReceiveStatus_$01();
		receivePlanH.setInputType_$00();
		receivePlanH.setReceiveDeliveryStatus_$00();
		receivePlanH.setErrorFlg_$0();
		receivePlanH.setCenterTransitFlg_$1();
		receivePlanH.setPickingHId(pickingH.getPickingHId());

		return receivePlanH;
	}
	/**
	 * <h2>入荷予定ボディを作成する。</h2>
	 * <pre>
	 * 入荷予定ボディを作成する。
	 *
	 * </pre>
	 * @param lineNo 行No.
	 * @param product 商品マスタ
	 * @param lot ロット
	 * @param planNum 予定数
	 * @return TReceivePlanB 入荷予定ボディ
	 */

	private TReceivePlanB createReceivePlanB(int lineNo, MProduct product, TLot lot, BigDecimal planNum) {

		TReceivePlanB receivePlanB = new TReceivePlanB();
		receivePlanB.setLineNo((long) lineNo);
		receivePlanB.setReceiveStatus_$01();
		receivePlanB.setProductId(product.getProductId());
		receivePlanB.setProductCd(product.getProductCd());
		receivePlanB.setPlanLot(lot.getLot());
		receivePlanB.setPlanLimitDt(lot.getLimitDt());
		receivePlanB.setPlanNum(planNum);
		receivePlanB.setErrorFlg_$0();

		return receivePlanB;
	}

	/**
	 * <h2>出荷のトランザクションから顧客入荷指示Noを取得する。</h2>
	 * <pre>
	 * 出荷のトランザクションから顧客入荷指示Noを取得する。
	 *
	 * </pre>
	 * @param pickingBodyList 出庫ボディリスト
	 * @return String 顧客入荷指示No
	 */
	private String getClientReceiveNo(List<TPickingB> pickingBodyList) {

		String clientReceiveNo = null;
		for (TPickingB pickingB : pickingBodyList) {
			String clientShippingNo = pickingB.chaseTShippingInstB().chaseTShippingInstH().getClientShippingNo();
			if (!CU.isNullOrEmpty(clientShippingNo)) {
				// 顧客出荷指示Noを顧客入荷指示Noとする
				clientReceiveNo = clientShippingNo;
				break;
			}
		}

		if (clientReceiveNo == null) {
			// 顧客出荷指示No.が設定されていない場合はWMS出荷伝票番号を設定
			clientReceiveNo = pickingBodyList.get(0).chaseTShippingInstB().chaseTShippingInstH().getShippingSlipNo();
		}

		return clientReceiveNo;
	}

	/**
	 * <h2>センタ間移動用の入荷予定をDBから削除する。</h2>
	 * <pre>
	 * センタ間移動用の入荷予定をDBから削除する。
	 *
	 * </pre>
	 * @param pickingH 出庫ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void deleteReceivePlan(TPickingH pickingH, ErrorStatus errSts) {

		// ※ 入荷予定の削除前チェックはリソースクラスの入力チェックで実施済のため行わない ※

		List<TReceivePlanH> receivePlanHList = pickingH.getTReceivePlanHList();

		for (TReceivePlanH receivePlanH : receivePlanHList) {
			//入荷予定削除.入荷予定削除メソッドを呼出し
			receivePlanDeleteLogic.deletePhysical(receivePlanH, errSts);
			if (getErrorManager().size() > 0) {
				// 処理終了
				return;
			}
		}
	}

	/**
	 * <h2>入荷予定のサマリクラスを取得する。</h2>
	 * <pre>
	 * 入荷予定のサマリクラスを取得する。
	 *
	 * </pre>
	 *
	 */
	private static class SummaryReceivePlan {

		/**
		 * <h2>入荷予定マップ を取得する。</h2>
		 * <pre>
		 * 入荷予定マップ を取得する。
		 *
		 * </pre>
		 *
		 */
		private Map<HeaderKey, HeaderEntity> planMap = new HashMap<HeaderKey, HeaderEntity>();

		public boolean containsHeader(HeaderKey key) {
			return planMap.containsKey(key);
		}

		public TReceivePlanH getHeader(HeaderKey key) {
			if (!containsHeader(key)) {
				return null;
			}
			return planMap.get(key).header;
		}

		public List<TReceivePlanB> getBodyList(HeaderKey key) {

			if (!containsHeader(key)) {
				return null;
			}

			List<TReceivePlanB> list = new ArrayList<TReceivePlanB>();
			list.addAll(planMap.get(key).bodyMap.values());

			return list;
		}

		public void putHeader(HeaderKey key, TReceivePlanH header) {

			if (containsHeader(key)) {
				planMap.get(key).header = header;
			} else {
				HeaderEntity entity = new HeaderEntity(header);
				planMap.put(key, entity);
			}
		}

		public boolean containsBody(HeaderKey headerKey, BodyKey bodyKey) {

			if (!containsHeader(headerKey)) {
				return false;
			}

			return planMap.get(headerKey).bodyMap.containsKey(bodyKey);
		}

		public TReceivePlanB getBody(HeaderKey headerKey, BodyKey bodyKey) {

			if (!containsBody(headerKey, bodyKey)) {
				return null;
			}

			return planMap.get(headerKey).bodyMap.get(bodyKey);
		}

		public int getNewBodyLineNo(HeaderKey headerKey) {

			if (!containsHeader(headerKey)) {
				return 0;
			}

			return (planMap.get(headerKey).bodyMap.values().size() + 1);
		}

		public void putBody(HeaderKey headerKey, BodyKey bodyKey, TReceivePlanB body) {

			if (!containsHeader(headerKey)) {
				HeaderEntity entity = new HeaderEntity(null, bodyKey, body);
				planMap.put(headerKey, entity);
			} else {
				planMap.get(headerKey).bodyMap.put(bodyKey, body);
			}
		}

		public Set<HeaderKey> getHeaderKeySet() {
			return planMap.keySet();
		}

		/** ヘッダキークラス */
		public static class HeaderKey {

			/** 在庫区分ID */
			private long stockTypeId;
			/** 預託ID */
			private long depositId;

			public HeaderKey(long stockTypeId, long depositId) {
				this.stockTypeId = stockTypeId;
				this.depositId = depositId;
			}

			/* (非 Javadoc)
			 * @see java.lang.Object#hashCode()
			 */
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + (int) (depositId ^ (depositId >>> 32));
				result = prime * result + (int) (stockTypeId ^ (stockTypeId >>> 32));
				return result;
			}

			/* (非 Javadoc)
			 * @see java.lang.Object#equals(java.lang.Object)
			 */
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				HeaderKey other = (HeaderKey) obj;
				if (depositId != other.depositId)
					return false;
				if (stockTypeId != other.stockTypeId)
					return false;
				return true;
			}
		}

		/** ボディキークラス */
		public static class BodyKey {

			/** ロットID */
			private long lotId;

			public BodyKey(long lotId) {
				this.lotId = lotId;
			}

			/* (非 Javadoc)
			 * @see java.lang.Object#hashCode()
			 */
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + (int) (lotId ^ (lotId >>> 32));
				return result;
			}

			/* (非 Javadoc)
			 * @see java.lang.Object#equals(java.lang.Object)
			 */
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				BodyKey other = (BodyKey) obj;
				if (lotId != other.lotId)
					return false;
				return true;
			}
		}

		private class HeaderEntity {
			public TReceivePlanH header;
			public Map<BodyKey, TReceivePlanB> bodyMap = new HashMap<BodyKey, TReceivePlanB>();

			public HeaderEntity(TReceivePlanH header) {
				this.header = header;
			}

			public HeaderEntity(TReceivePlanH header, BodyKey bodyKey, TReceivePlanB body) {
				this.header = header;
				this.bodyMap.put(bodyKey, body);
			}
		}
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End
}
