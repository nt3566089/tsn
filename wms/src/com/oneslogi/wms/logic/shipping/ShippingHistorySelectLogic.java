package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.HShippingBCB;
import com.oneslogi.base.dbflute.exbhv.HShippingBBhv;
import com.oneslogi.base.dbflute.exentity.HShippingB;
import com.oneslogi.base.dbflute.exentity.HShippingH;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 出荷履歴データ取得ロジッククラス
 */
public class ShippingHistorySelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private HShippingBBhv hShippingBBhv;

	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu Start
	// ===== 使用ロジック =====
	@Inject
	private LocationLogic locationLogic;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu End

	/**
	 * <h2>出荷履歴データ取得。</h2>
	 * <pre>
	 * 出荷履歴データ取得する。
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・0件チェック
	 *
	 * 【データ取得テーブル】
	 * ・出荷ボディ履歴
	 * ・出荷ヘッダ履歴	- 出荷ボディ履歴
	 *
	 * 【パラメータの使用項目】
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
	 *  ・届先名称
	 *  ・配送コースCD
	 *  ・運送業者
	 *  (出荷ボディ履歴)
	 *  . 指定預託
	 *  ・商品CD
	 *  ・指定ロット
	 *  ・指定期限日(From)
	 *  ・指定期限日(To)
	 *  ・在庫区分
	 *  ・指定ロケーション(From)
	 *  ・指定ロケーション(To)
	 * </pre>
	 * @param hShippingH 出荷ヘッダ履歴
	 * @param hShippingB 出荷ボディ履歴
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<HShippingB> 出荷ボディ履歴リスト
	 */
	public PagingResultBean<HShippingB> select(HShippingH hShippingH, HShippingB hShippingB, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<HShippingB> resultHShippingB = null;

		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(hShippingB.getLocationCdFrom());
		mLocationExentity.setLocationCdTo(hShippingB.getLocationCdTo());
		// 最小・最大ロケーションを取得
		MLocation maxLocationCd = locationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = locationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End

		// ===== 出荷履歴データ取得=====
		HShippingBCB cb = hShippingBBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_HShippingH().withMProcessType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		// [#522][Ver2.1.0-開発] 納品時間帯名称を追加 2016.12.22 honma Add Start
		cb.setupSelect_HShippingH().withBClassDtlByDelivTz().withVDict(getCultureId());
		// [#522][Ver2.1.0-開発] 納品時間帯名称を追加 2016.12.22 honma Add End
		cb.setupSelect_HShippingH().withBClassDtlByEmergencyFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		cb.setupSelect_MStockType().withVDict(getCultureId());

		// ===== 検索条件 =====

		// センタCD
		cb.query().queryHShippingH().setCenterCd_Equal(hShippingH.getCenterCd());
		// 荷主CD
		cb.query().queryHShippingH().setClientCd_Equal(hShippingH.getClientCd());
		// 出荷日
		cb.query().queryHShippingH().setShippingDt_Equal(hShippingH.getShippingDt());
		// 作業日
		cb.query().queryHShippingH().setWorkDt_Equal(hShippingH.getWorkDt());
		// 処理区分
		cb.query().queryHShippingH().queryMProcessType().setProcessTypeCd_Equal(hShippingH.getMProcessType().getProcessTypeCd());
		// 顧客出荷指示No.
		cb.query().queryHShippingH().setClientShippingNo_PrefixSearch(hShippingH.getClientShippingNo());
		// WMS出荷伝票No.
		cb.query().queryHShippingH().setShippingSlipNo_PrefixSearch(hShippingH.getShippingSlipNo());
		// 納品先CD
		cb.query().queryHShippingH().setSupplyCustomerCd_PrefixSearch(hShippingH.getSupplyCustomerCd());
		// 届先CD
		cb.query().queryHShippingH().setDelivCustomerCd_PrefixSearch(hShippingH.getDelivCustomerCd());
		// 届先名称
		cb.query().queryHShippingH().setDelivCustomerNm_PrefixSearch(hShippingH.getDelivCustomerNm());
		// 配送コースCD
		cb.query().queryHShippingH().setDeliveryCourseCd_Equal(hShippingH.getDeliveryCourseCd());
		// 運送業者
		cb.query().queryHShippingH().setCarrierCd_Equal(hShippingH.getCarrierCd());
		// 指定預託
		cb.query().setDepositCd_Equal(hShippingB.getDepositCd());
		// 商品CD
		cb.query().setProductCd_PrefixSearch(hShippingB.getProductCd());
		// 指定ロット
		cb.query().setLot_PrefixSearch(hShippingB.getLot());
		// 指定期限日(From)
		cb.query().setLimitDt_GreaterEqual(hShippingB.getLimitDtFrom());
		// 指定期限日(To)
		cb.query().setLimitDt_LessEqual(hShippingB.getLimitDtTo());
		// 在庫区分
		cb.query().queryMStockType().setStockTypeCd_Equal(hShippingB.getMStockType().getStockTypeCd());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		// 指定ロケーション(From)
		cb.query().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 指定ロケーション(To)
		cb.query().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End

		// ===== ソート順 =====
		cb.query().queryHShippingH().addOrderBy_HistDt_Asc();
		cb.query().queryHShippingH().addOrderBy_ShippingDt_Asc();
		cb.query().queryHShippingH().addOrderBy_WorkDt_Asc();
		cb.query().queryHShippingH().addOrderBy_SupplyCustomerCd_Asc();
		cb.query().queryHShippingH().addOrderBy_DelivCustomerCd_Asc();
		cb.query().queryHShippingH().addOrderBy_ShippingSlipNo_Asc();
		cb.query().addOrderBy_ProductCd_Asc();

		// ===== 検索実行 =====
		resultHShippingB = selectPage(hShippingBBhv, cb, paging);

		// ===== ０件チェック =====
		if (resultHShippingB.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultHShippingB;
		}

		return resultHShippingB;
	}
}