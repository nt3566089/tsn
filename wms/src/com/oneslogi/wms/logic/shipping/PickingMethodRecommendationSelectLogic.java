package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmd;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ピッキング提案データ取得ロジッククラス
 */
public class PickingMethodRecommendationSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPicMthdRcmdBhv tPicMthdRcmdBhv;
	@Inject
	private TPicMthdRcmdDataBhv tPicMthdRcmdDataBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;

	/**
	 * <h2>ピッキング提案を取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースからピッキング提案のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param header ピッキング提案：荷主ID、センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPicMthdRcmd> ピッキング提案リスト
	 */
	public List<TPicMthdRcmd> select(TPicMthdRcmd header, ErrorStatus errSts) {

		// =====  ピッキング提案データ取得 =====

		// 検索条件の設定
		TPicMthdRcmdCB cb = tPicMthdRcmdBhv.newMyConditionBean();

		cb.setupSelect_BClassDtlByRcmdPickingCls().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByEmergencyFlg().withVDict(getCultureId());

		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(header.getClientId());
		cb.query().setCenterId_Equal(header.getCenterId());

		cb.query().addOrderBy_PicMthdRcmdId_Asc();

		// 検索実行
		List<TPicMthdRcmd> selectList = tPicMthdRcmdBhv.selectList(cb);

		// ===== ０件チェック =====
		if (selectList.isEmpty()) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return selectList;
	}

	/**
	 * <h2>ピッキングリスト発行チェック.</h2>
	 * <pre>
	 * 梱包ステータスのチェックとピッキングリストが未発行かをチェックする。
	 * ケースピッキングリストの場合は
	 * ケース梱包の梱包ステータスとケースピッキングリストが未発行かをチェックする。
	 *
	 * </pre>
	 * @param picMthdRcmdId ピッキング提案ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkPrint(long picMthdRcmdId, ErrorStatus errSts) {

		// 検索対象テーブル
		TPicMthdRcmdDataCB cb = tPicMthdRcmdDataBhv.newConditionBean();

		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TPicMthdRcmd();

		cb.query().setPicMthdRcmdId_Equal(picMthdRcmdId);

		// 検索実行
		List<TPicMthdRcmdData> picMthdRcmdDataList = tPicMthdRcmdDataBhv.selectList(cb);

		// ===== ０件チェック =====

		if (picMthdRcmdDataList.isEmpty()) {

			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// [#6818][OSS] 検索結果が0件だった時に処理が終了するように修正 2019.11.11 tsuboi Start
			return;
			// [#6818][OSS] 検索結果が0件だった時に処理が終了するように修正 2019.11.11 tsuboi End
		}

		TPicMthdRcmd tPicMthdRcmd = picMthdRcmdDataList.get(0).getTPicMthdRcmd();

		final boolean isCasePicking;
		if (tPicMthdRcmd.isRcmdPickingCls$6()) {
			// ケースピッキング

			isCasePicking = true;
		} else {

			isCasePicking = false;
		}

		List<TPickingH> pickingHList = tPicMthdRcmdDataBhv.pulloutTPickingH(picMthdRcmdDataList);
		tPickingHBhv.loadTPackingHList(pickingHList, new ConditionBeanSetupper<TPackingHCB>() {

			@Override
			public void setup(TPackingHCB packingBCb) {
				if (isCasePicking) {
					packingBCb.query().setMixedFlg_Equal_$0();
				} else {
					packingBCb.query().setMixedFlg_Equal_$1();
				}
			}
		});

		for (TPicMthdRcmdData data : picMthdRcmdDataList) {

			// ===== 梱包ステータスのチェック =====

			List<TPackingH> packingHList = data.getTPickingH().getTPackingHList();
			for (TPackingH packingH : packingHList) {

				if (!packingH.isPackingStatus$25()) {
					// 出庫指示済以外

					this.getErrorManager().add(errSts, WmsMessageConst.PMR_PICKING_LIST_CANNOT_PRINT_ILLEGAL_SHIP_STATUS_ERROR);
					return;
				}
			}

			// ===== ピッキングリスト発行フラグのチェック =====

			if (isCasePicking) {

				// ケースピッキングリスト発行済の出庫ヘッダあり
				if (data.getTPickingH().getTPickingRAsOne().isCaseOutFlg$1()) {

					this.getErrorManager().add(errSts, WmsMessageConst.PMR_PICKING_LIST_CANNOT_PRINT_ALREADY_PRINTED_CASE_ERROR);
					return;
				}
			} else {

				// 1次ピッキングリスト発行済の出庫ヘッダあり
				if (data.getTPickingH().getTPickingRAsOne().isPl1OutFlg$1()) {

					this.getErrorManager().add(errSts, WmsMessageConst.PMR_PICKING_LIST_CANNOT_PRINT_ALREADY_PRINTED_ERROR);
					return;
				}
			}
		}
	}

	/**
	 * <h2>ピッキング提案データの取得.</h2>
	 * <pre>
	 * 引数を条件にデータベースからピッキング提案データテーブルを検索する。
	 *
	 * 検索対象が見つからない場合、
	 * 0件エラーをエラーステータスに設定する。
	 *</pre>
	 *
	 * @param picMthdRcmdId ピッキング提案ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPicMthdRcmdData> 対象のピッキング提案データリスト
	 */
	public List<TPicMthdRcmdData> selectTPicMthdRcmdData(long picMthdRcmdId, ErrorStatus errSts) {

		// 検索対象テーブル
		TPicMthdRcmdDataCB cb = tPicMthdRcmdDataBhv.newConditionBean();
		cb.setupSelect_TPickingH().withTPickingRAsOne();

		cb.setupSelect_TPicMthdRcmd();

		cb.query().setPicMthdRcmdId_Equal(picMthdRcmdId);

		// 検索実行
		List<TPicMthdRcmdData> result = tPicMthdRcmdDataBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}

	/**
	 * <h2>ピッキング提案件数の取得.</h2>
	 * <pre>
	 * 検索条件のピッキング提案件数を取得する。
	 * </pre>
	 * @param header ピッキング提案：荷主ID、センタID
	 * @return ピッキング提案件数
	 */
	public int selectCount(TPicMthdRcmd header) {

		TPicMthdRcmdCB cb = tPicMthdRcmdBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(header.getClientId());
		cb.query().setCenterId_Equal(header.getCenterId());

		return tPicMthdRcmdBhv.selectCount(cb);
	}
}
