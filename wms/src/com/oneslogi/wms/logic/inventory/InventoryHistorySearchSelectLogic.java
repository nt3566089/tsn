package com.oneslogi.wms.logic.inventory;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.HInventoryBCB;
import com.oneslogi.base.dbflute.exbhv.HInventoryBBhv;
import com.oneslogi.base.dbflute.exentity.HInventoryB;
import com.oneslogi.base.dbflute.exentity.HInventoryH;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 棚卸履歴データ取得ロジッククラス
 */
public class InventoryHistorySearchSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private HInventoryBBhv hInventoryBBhv;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu Start
	// ===== 使用ロジック =====
	@Inject
	private LocationLogic locationLogic;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu End

	/**
	 * <h2>棚卸履歴データ取得。</h2>
	 * <pre>
	 * 棚卸履歴データ取得する。
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・0件チェック
	 *
	 * 【データ取得テーブル】
	 * ・棚卸ボディ履歴
	 * ・棚卸ヘッダ履歴 - 棚卸ボディ履歴
	 *
	 * 【パラメータの使用項目】
	 *  (棚卸ヘッダ履歴)
	 *  ・荷主ID       : 必須
	 *  ・センタID     : 必須
	 *  ・棚卸日(From)
	 *  ・棚卸日(To)
	 *  (棚卸ボディ履歴)
	 *  ・倉庫
	 *  ・仕入先CD
	 *  ・預託
	 *  ・在庫区分
	 *  ・ロケーション(From)
	 *  ・ロケーション(To)
	 *  ・商品CD
	 *  ・期限日(From)
	 *  ・期限日(To)
	 *  ・入庫ラベルNo.
	 *  ・入庫日(From)
	 *  ・入庫日(To)
	 * </pre>
	 * @param hInventoryH 棚卸ヘッダ履歴
	 * @param hInventoryB 棚卸ボディ履歴
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<HInventoryB> 棚卸ボディ履歴リスト
	 */
	public PagingResultBean<HInventoryB> select(HInventoryH hInventoryH, HInventoryB hInventoryB, PagingData paging, ErrorStatus errSts) {

		// ===== 初期処理 =====
		PagingResultBean<HInventoryB> resultHInventoryB = null;

		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(hInventoryB.getLocationCdFrom());
		mLocationExentity.setLocationCdTo(hInventoryB.getLocationCdTo());
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

		// ===== 棚卸履歴データ取得=====
		HInventoryBCB cb = hInventoryBBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_HInventoryH();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		// 入力区分名称と在庫調整フラグ名称取得を追加 2016/11/11 nayzaw Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByInputType().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByStockAdjustFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// 入力区分名称と在庫調整フラグ名称取得を追加 2016/11/11 nayzaw End

		// ===== 検索条件 =====

		// センタCD
		cb.query().queryHInventoryH().setCenterCd_Equal(hInventoryH.getCenterCd());
		// 荷主CD
		cb.query().queryHInventoryH().setClientCd_Equal(hInventoryH.getClientCd());
		// 倉庫
		cb.query().setWarehouseCd_Equal(hInventoryB.getWarehouseCd());
		// 棚卸日(From)
		cb.query().queryHInventoryH().setInventoryDt_GreaterEqual(hInventoryH.getInventoryDtFrom());
		// 棚卸日(To)
		cb.query().queryHInventoryH().setInventoryDt_LessEqual(hInventoryH.getInventoryDtTo());
		// 仕入先CD
		cb.query().setSupplierCd_PrefixSearch(hInventoryB.getSupplierCd());
		// 預託
		cb.query().setDepositCd_Equal(hInventoryB.getDepositCd());
		// 在庫区分
		cb.query().queryMStockType().setStockTypeCd_Equal(hInventoryB.getMStockType().getStockTypeCd());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		// ロケーション(From)
		cb.query().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// ロケーション(To)
		cb.query().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End
		// 商品CD
		cb.query().setProductCd_PrefixSearch(hInventoryB.getProductCd());
		// ロット
		cb.query().setLot_PrefixSearch(hInventoryB.getLot());
		// 期限日(From)
		cb.query().setLimitDt_GreaterEqual(hInventoryB.getLimitDtFrom());
		// 期限日(To)
		cb.query().setLimitDt_LessEqual(hInventoryB.getLimitDtTo());
		// 入庫ラベルNo.
		cb.query().setStoreLabelNo_Equal(hInventoryB.getStoreLabelNo());
		// 入庫日(From)
		cb.query().setStoreDt_GreaterEqual(hInventoryB.getStoreDtFrom());
		// 入庫日(To)
		cb.query().setStoreDt_LessEqual(hInventoryB.getStoreDtTo());

		// ===== ソート順 =====
		cb.query().queryHInventoryH().addOrderBy_HistDt_Asc();
		cb.query().queryHInventoryH().addOrderBy_InventoryDt_Asc();
		cb.query().addOrderBy_LocationCd_Asc();
		cb.query().addOrderBy_ProductCd_Asc();
		cb.query().addOrderBy_Lot_Asc();
		cb.query().addOrderBy_LimitDt_Asc();
		cb.query().addOrderBy_StoreDt_Asc();
		cb.query().addOrderBy_StoreLabelNo_Asc();

		// ===== 検索実行 =====
		resultHInventoryB = selectPage(hInventoryBBhv, cb, paging);

		// ===== ０件チェック =====
		if (resultHInventoryB.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultHInventoryB;
		}

		return resultHInventoryB;
	}
}
