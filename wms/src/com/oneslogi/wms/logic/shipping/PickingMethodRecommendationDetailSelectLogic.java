package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出庫指示一覧データ取得ロジッククラス
 */
public class PickingMethodRecommendationDetailSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPicMthdRcmdDataBhv tPicMthdRcmdDataBhv;

	/**
	 * <h2>ピッキング提案明細データを取得する。</h2>
	 * <pre>
	 * 引数を条件にピッキング提案明細のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param header ピッキング提案：ピッキング提案ID
	 * @param paging ページング情報
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TPicMthdRcmd> ピッキング提案明細リスト
	 */
	public List<TPicMthdRcmdData> select(TPicMthdRcmdData header, PagingData paging, ErrorStatus errSts) {

		List<TPicMthdRcmdData> result = null;

		// ===== ピッキング提案明細データ取得 =====

		// 検索対象テーブル
		TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB();
		cb.setupSelect_TPicMthdRcmd().withMCenter();
		cb.setupSelect_TPicMthdRcmd().withMClient();
		cb.setupSelect_TPickingH().withTAllocInstH().withMDeliveryCourse().withMCarrier();
		cb.setupSelect_TPickingH().withTPickingRAsOne();

		cb.specify().specifyTPickingH().specifyTAllocInstH().derivedTShippingInstHList().count(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB tsihCb) {
				tsihCb.specify().columnShippingInstHId();
			}
		}, TPicMthdRcmdData.ALIAS_slipNum);
		cb.specify().specifyTPickingH().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB tsihCb) {
				tsihCb.specify().columnEmergencyFlg();
			}
		}, TPicMthdRcmdData.ALIAS_emergencyFlg);

		// 検索条件設定
		cb.query().setPicMthdRcmdId_Equal(header.getPicMthdRcmdId());

		// ソート順
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_ShippingDt_Asc();
		cb.query().queryTPicMthdRcmd().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_SupplyCustomerCd_Asc();
		cb.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();

		// 検索実行
		result = selectPage(tPicMthdRcmdDataBhv, cb, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

}
