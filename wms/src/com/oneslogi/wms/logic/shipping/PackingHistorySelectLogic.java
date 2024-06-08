package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.HPackingBCB;
import com.oneslogi.base.dbflute.exbhv.HPackingBBhv;
import com.oneslogi.base.dbflute.exentity.HPackingB;
import com.oneslogi.base.dbflute.exentity.HPackingH;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 梱包履歴データ取得ロジッククラス
 */
public class PackingHistorySelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private HPackingBBhv hPackingBBhv;

	/**
	 * <h2>梱包履歴データ取得。</h2>
	 * <pre>
	 * 梱包履歴データ取得する。
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・0件チェック
	 *
	 * 【データ取得テーブル】
	 * ・梱包ボディ履歴
	 * ・梱包ヘッダ履歴	- 梱包ボディ履歴
	 * ・出荷ヘッダ履歴	- 梱包ヘッダ履歴
	 * ・在庫履歴		- 梱包ボディ履歴
	 *
	 * 【パラメータの使用項目】
	 *  (梱包ヘッダ履歴)
	 *  . 貨物追跡No.
	 *  (出荷ヘッダ履歴)
	 *  ・荷主ID       : 必須
	 *  ・センタID     : 必須
	 *  ・出荷日
	 *  ・作業日
	 *  ・処理区分
	 *  ・顧客出荷指示No.
	 *  ・WMS出荷伝票No.
	 *  ・納品先CD
	 *  ・届先CD
	 *  ・配送コースCD
	 *  ・運送業者
	 *  (在庫履歴)
	 *  ・商品CD
	 *  ・ロット
	 *  ・期限日(From)
	 *  ・期限日(To)
	 *  ・在庫区分
	 * </pre>
	 * @param hPackingH 梱包ヘッダ履歴
	 * @param hPackingB 梱包ボディ履歴
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<HPackingB> 梱包ボディ履歴リスト
	 */
	public PagingResultBean<HPackingB> select(HPackingH hPackingH, HPackingB hPackingB, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<HPackingB> resultHPackingB = null;

		// ===== 梱包履歴データ取得=====
		HPackingBCB cb = hPackingBBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_HPackingH().withHShippingH().withMProcessType().withVDict(getCultureId());
		cb.setupSelect_HStock().withMStockType().withVDict(getCultureId());

		// ===== 検索条件 =====

		// センタCD
		cb.query().queryHPackingH().queryHShippingH().setCenterCd_Equal(hPackingH.getHShippingH().getCenterCd());
		// 荷主CD
		cb.query().queryHPackingH().queryHShippingH().setClientCd_Equal(hPackingH.getHShippingH().getClientCd());
		// 出荷日
		cb.query().queryHPackingH().queryHShippingH().setShippingDt_Equal(hPackingH.getHShippingH().getShippingDt());
		// 作業日
		cb.query().queryHPackingH().queryHShippingH().setWorkDt_Equal(hPackingH.getHShippingH().getWorkDt());
		// 処理区分
		cb.query().queryHPackingH().setProcessTypeId_Equal(hPackingH.getProcessTypeId());
		// 顧客出荷指示No.
		cb.query().queryHPackingH().queryHShippingH().setClientShippingNo_PrefixSearch(hPackingH.getHShippingH().getClientShippingNo());
		// WMS出荷伝票No.
		cb.query().queryHPackingH().queryHShippingH().setShippingSlipNo_PrefixSearch(hPackingH.getHShippingH().getShippingSlipNo());
		// 納品先CD
		cb.query().queryHPackingH().queryHShippingH().setSupplyCustomerCd_PrefixSearch(hPackingH.getHShippingH().getSupplyCustomerCd());
		// 届先CD
		cb.query().queryHPackingH().queryHShippingH().setDelivCustomerCd_PrefixSearch(hPackingH.getHShippingH().getDelivCustomerCd());
		// 配送コースCD
		cb.query().queryHPackingH().queryHShippingH().setDeliveryCourseCd_Equal(hPackingH.getHShippingH().getDeliveryCourseCd());
		// 運送業者
		cb.query().queryHPackingH().queryHShippingH().setCarrierCd_Equal(hPackingH.getHShippingH().getCarrierCd());
		// 商品CD
		cb.query().queryHStock().setProductCd_PrefixSearch(hPackingB.getHStock().getProductCd());
		// ロット
		cb.query().queryHStock().setLot_PrefixSearch(hPackingB.getHStock().getLot());
		// 期限日(From)
		cb.query().queryHStock().setLimitDt_GreaterEqual(hPackingB.getHStock().getLimitDtFrom());
		// 期限日(To)
		cb.query().queryHStock().setLimitDt_LessEqual(hPackingB.getHStock().getLimitDtTo());
		// 在庫区分
		cb.query().queryHStock().queryMStockType().setStockTypeCd_Equal(hPackingB.getHStock().getMStockType().getStockTypeCd());
		// 貨物追跡No.
		cb.query().queryHPackingH().setCarrierTraceNum_PrefixSearch(hPackingH.getCarrierTraceNum());

		// ===== ソート順 =====
		cb.query().queryHPackingH().queryHShippingH().addOrderBy_HistDt_Asc();
		cb.query().queryHPackingH().queryHShippingH().addOrderBy_ShippingDt_Asc();
		cb.query().queryHPackingH().queryHShippingH().addOrderBy_WorkDt_Asc();
		cb.query().queryHPackingH().queryHShippingH().addOrderBy_SupplyCustomerCd_Asc();
		cb.query().queryHPackingH().queryHShippingH().addOrderBy_DelivCustomerCd_Asc();
		cb.query().queryHPackingH().queryHShippingH().addOrderBy_ShippingSlipNo_Asc();
		cb.query().addOrderBy_PackingHId_Asc();
		cb.query().queryHStock().addOrderBy_ProductCd_Asc();
		cb.query().queryHStock().addOrderBy_Lot_Asc();
		cb.query().queryHStock().addOrderBy_LimitDt_Asc();
		cb.query().queryHStock().addOrderBy_StoreDt_Asc();
		cb.query().queryHStock().addOrderBy_StoreLabelNo_Asc();

		// ===== 検索実行 =====
		resultHPackingB = selectPage(hPackingBBhv, cb, paging);

		// ===== ０件チェック =====
		if (resultHPackingB.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultHPackingB;
		}

		return resultHPackingB;
	}
}