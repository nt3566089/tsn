package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * セット組指示データ取得ロジッククラス
 */
public class StockSetInstSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MSetStructureBhv mSetStructureBhv;
	@Inject
	private TStockBhv tStockBhv;
	/**
	 * <h2>セット品構成マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにセット品構成マスタ情報を取得する。
	 * 対象が見つからない場合、未存在エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MSetStructure> セット品構成マスタリスト
	 */
	public List<MSetStructure> selectStructureList(MProduct mProduct, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		MSetStructureCB cb= mSetStructureBhv.newMyConditionBean();

		// ====== データ取得テーブル ======
		cb.setupSelect_MProduct();
		cb.setupSelect_MSetParent();
		//荷主センタ変更対応 2017.02.20 sja Start
		cb.setupSelect_MProduct().withMClient();
		//荷主センタ変更対応 2017.02.20 sja End

		// ====== 検索条件 ======
		// 商品ID
		cb.query().queryMSetParent().setProductId_Equal(mProduct.getProductId());

		// ====== ソート順 ======
		// 商品CD
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ====== 検索実行 ======
		List<MSetStructure> result = selectList(mSetStructureBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.PARENT_PRODUCT_CODE_NOT_FOUND_ERROR);
		}

		return result;
	}

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫データを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param mSetStructure セット品構成マスタリスト：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStock> 在庫リスト
	 */
	public List<TStock> selectStockList(long centerId, long clientId, List<MSetStructure> mSetStructure, ErrorStatus errSts){
		// ====== 商品IDリストを作成 ======
		List<Long> productIdList = new ArrayList<Long>();
		// [Ver3.0][#3472] 構成品の一部在庫が存在しない場合にエラーを表示させる 2018.03.09 matsumoto Start
		Map<Long,String> productMap = new LinkedHashMap<>();
		// [Ver3.0][#3472] 構成品の一部在庫が存在しない場合にエラーを表示させる 2018.03.09 matsumoto End

		for(MSetStructure m :mSetStructure){
			productIdList.add(m.getProductId());
			// [Ver3.0][#3472] 構成品の一部在庫が存在しない場合にエラーを表示させる 2018.03.09 matsumoto Start
			productMap.put(m.getProductId(), m.getMProduct().getProductCd());
			// [Ver3.0][#3472] 構成品の一部在庫が存在しない場合にエラーを表示させる 2018.03.09 matsumoto End
		}

		// ====== 在庫データ取得処理 ======
		TStockCB cb  = tStockBhv.newMyConditionBean();

		// ====== データ取得テーブル =====
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		cb.setupSelect_MCustomer();
		cb.setupSelect_TLot();
		cb.setupSelect_TStoreNo();
		cb.setupSelect_MWarehouse();
		//荷主センタ変更対応 2017.02.20 sja Start
		cb.setupSelect_MClient();
		cb.setupSelect_MLocation().withMCenter();
		//荷主センタ変更対応 2017.02.20 sja End

		// ====== 検索条件 =====
		// 荷主ID
		cb.query().setClientId_Equal(clientId);
		// センタID
		cb.query().queryMLocation().queryMCenter().setCenterId_Equal(centerId);
		// 商品ID
		cb.query().setProductId_InScope(productIdList);
		// 引当可能数
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		// ====== ソート順 ======
		// 商品CD
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		// 預託CD
		cb.query().queryMCustomer().addOrderBy_CustomerCd_Asc();
		// 在庫区分CD
		cb.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		// 倉庫CD
		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		// ロケーションCD
		cb.query().queryMLocation().addOrderBy_LocationCd_Asc();
		// ロット
		cb.query().queryTLot().addOrderBy_Lot_Asc();
		// 期限日
		cb.query().queryTLot().addOrderBy_LimitDt_Asc();
		// 入庫ラベルNo
		cb.query().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();

		// ====== 検索実行 ======
		List<TStock> result =  tStockBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			// [#2167] 構成品の在庫がない場合のメッセージを変更 2017.07.25 kawana Start
			this.getErrorManager().add(errSts, WmsMessageConst.STRUCTURE_STOCK_NOT_FOUND_ERROR);
			// [#2167] 構成品の在庫がない場合のメッセージを変更 2017.07.25 kawana End
		// [ver3.0][#3472] 構成品の一部の在庫が存在しない場合にエラーを表示させる 2018.03.09 matsumoto Start
		}else {
			for (Long productId : productMap.keySet()) {
				int count=0;
				for (TStock stock : result) {

					// [#5436][v3.0] Longの比較不正を修正 2018.11.01 kawana Start
					if (stock.getMProduct().getProductId().longValue() == productId.longValue()) {
						// [#5436][v3.0] Longの比較不正を修正 2018.11.01 kawana End

						count++;
						break;
					}
				}
				// 在庫が存在しない商品CDを取得
				if (count == 0) {
					this.getErrorManager().add(errSts,WmsMessageConst.STRUCTURE_PART_STOCK_NOT_FOUND_ERROR, productMap.get(productId));
				}

			}
		}
		// [ver3.0][#3472] 構成品の一部の在庫が存在しない場合にエラーを表示させる 2018.03.09 matsumoto End

		return result;
	}
}