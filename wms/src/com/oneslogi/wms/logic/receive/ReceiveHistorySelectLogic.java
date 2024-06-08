package com.oneslogi.wms.logic.receive;

import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.HReceiveBCB;
import com.oneslogi.base.dbflute.exbhv.HReceiveBBhv;
import com.oneslogi.base.dbflute.exentity.HReceiveB;
import com.oneslogi.base.dbflute.exentity.HReceiveH;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 入荷履歴データ取得ロジッククラス
 */
public class ReceiveHistorySelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private HReceiveBBhv hReceiveBBhv;
	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.06.01 shimizu Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.06.01 shimizu End
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu Start
	// ===== 使用ロジック =====
	@Inject
	private LocationLogic locationLogic;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu End

	/**
	 * <h2>入荷履歴データ取得。</h2>
	 * <pre>
	 * 入荷履歴データ取得する。
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・0件チェック
	 *
	 * 【データ取得テーブル】
	 * ・入荷ボディ履歴
	 * ・入荷ヘッダ履歴	- 入荷ボディ履歴
	 * ・在庫履歴		- 入荷ボディ履歴
	 *
	 * 【パラメータの使用項目】
	 *  (入荷ヘッダ履歴)
	 *  ・荷主CD  : 必須
	 *  ・センタCD  : 必須
	 *  ・処理区分
	 *  .顧客入荷指示No.
	 *  .WMS入荷伝票No.
	 *  .仕入先CD
	 *  .預託CD
	 *  (在庫履歴)
	 *  ・商品CD
	 *  ・ロット
	 *  ・在庫区分
	 *  .倉庫CD
	 *  (入荷履歴画面用DTO)
	 *  .入庫日(From)
	 *  .入庫日(To)
	 *  .期限日(From)
	 *  .期限日(To)
	 *  .入庫格納ロケーション(From)
	 *  .入庫格納ロケーション(To)
	 * </pre>
	 * @param hReceiveH 入荷ヘッダ履歴
	 * @param hReceiveB 入荷ボディ履歴
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<HReceiveB> 入荷ボディ履歴リスト
	 */
	public PagingResultBean<HReceiveB> select(HReceiveH hReceiveH, HReceiveB hReceiveB, PagingData paging, ErrorStatus errSts) {

		// ===== 初期処理 =====
		PagingResultBean<HReceiveB> resultHReceiveB = null;

		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(hReceiveB.getStoreLocationCdFrom());
		mLocationExentity.setLocationCdTo(hReceiveB.getStoreLocationCdTo());
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

		// ===== 入荷履歴データ取得 =====
		HReceiveBCB cb = hReceiveBBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_HReceiveH().withMProcessType().withVDict(getCultureId());
		cb.setupSelect_HStock().withMStockType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_HReceiveH().withBClassDtlByReceiveDeliveryStatus().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// ===== 検索条件 =====
		// センタCD
		cb.query().queryHReceiveH().setCenterCd_Equal(hReceiveH.getCenterCd());
		// 荷主CD
		cb.query().queryHReceiveH().setClientCd_Equal(hReceiveH.getClientCd());
		// 処理区分
		cb.query().queryHReceiveH().queryMProcessType().setProcessTypeCd_Equal(hReceiveH.getMProcessType().getProcessTypeCd());
		// 顧客入荷指示No.
		cb.query().queryHReceiveH().setClientReceiveNo_PrefixSearch(hReceiveH.getClientReceiveNo());
		// WMS入荷伝票No.
		cb.query().queryHReceiveH().setReceiveSlipNo_PrefixSearch(hReceiveH.getReceiveSlipNo());
		// 仕入先CD
		cb.query().queryHReceiveH().setSupplierCd_PrefixSearch(hReceiveH.getSupplierCd());
		// 預託CD
		cb.query().queryHReceiveH().setDepositCd_Equal(hReceiveH.getDepositCd());
		// 入庫日(From)
		cb.query().setStoreDt_GreaterEqual(hReceiveB.getStoreDtFrom());
		// 入庫日(To)
		cb.query().setStoreDt_LessEqual(hReceiveB.getStoreDtTo());
		// 商品CD
		cb.query().queryHStock().setProductCd_PrefixSearch(hReceiveB.getHStock().getProductCd());
		// ロット
		cb.query().queryHStock().setLot_PrefixSearch(hReceiveB.getHStock().getLot());
		// 期限日(From)
		cb.query().queryHStock().setLimitDt_GreaterEqual(hReceiveB.getHStock().getLimitDtFrom());
		// 期限日(To)
		cb.query().queryHStock().setLimitDt_LessEqual(hReceiveB.getHStock().getLimitDtTo());
		// 在庫区分
		cb.query().queryHStock().queryMStockType().setStockTypeCd_Equal(hReceiveB.getHStock().getMStockType().getStockTypeCd());
		// 倉庫CD
		cb.query().queryHStock().setWarehouseCd_Equal(hReceiveB.getHStock().getWarehouseCd());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		// 入庫格納ロケーション(From)
		cb.query().setStoreLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 入庫格納ロケーション(To)
		cb.query().setStoreLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto En

		// ===== ソート順 =====
		cb.query().queryHReceiveH().addOrderBy_HistDt_Asc();
		cb.query().queryHReceiveH().addOrderBy_ReceivePlanDt_Asc();
		cb.query().queryHReceiveH().addOrderBy_SupplierCd_Asc();
		cb.query().queryHReceiveH().addOrderBy_ReceiveSlipNo_Asc();
		cb.query().addOrderBy_StoreDt_Asc();
		cb.query().queryHStock().addOrderBy_ProductCd_Asc();
		cb.query().queryHStock().addOrderBy_Lot_Asc();
		cb.query().queryHStock().addOrderBy_LimitDt_Asc();
		cb.query().queryHStock().addOrderBy_StoreDt_Asc();
		cb.query().queryHStock().addOrderBy_StoreLabelNo_Asc();

		// ===== 検索実行 =====
		resultHReceiveB = selectPage(hReceiveBBhv, cb, paging);

		// ===== ０件チェック =====
		if (resultHReceiveB.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultHReceiveB;
		}

		// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.06.01 shimizu Start
		// 入庫格納フラグ
		Map<String, String> storeFlgMap = centerClassLogic.getClassMapByCd("STORE_FLG");

		if(!storeFlgMap.isEmpty()) {
			for(HReceiveB hReceiveTargetStoreFlgNm : resultHReceiveB) {
				// 入庫格納フラグ名称の設定
				hReceiveTargetStoreFlgNm.setStoreFlgNm(!storeFlgMap.containsKey(hReceiveTargetStoreFlgNm.getStoreFlg()) ? "" : storeFlgMap.get(hReceiveTargetStoreFlgNm.getStoreFlg()));
			}
		}
		// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.06.01 shimizu End

		return resultHReceiveB;
	}

}
