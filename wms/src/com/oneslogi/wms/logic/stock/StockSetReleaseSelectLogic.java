package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * セット解除指示データ取得ロジッククラス
 */
public class StockSetReleaseSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private MSetStructureBhv mSetStructureBhv;

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数をキーに親商品の在庫データを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param tStock 在庫：センタID・荷主ID・商品ID・預託ID・在庫区分ID・ロケーションID・入庫日・指示数量
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStock> 在庫リスト
	 */
	public List<TStock> selectStockList(TStock tStock, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		TStockCB cb = tStockBhv.newMyConditionBean();

		// ====== データ取得テーブル ======
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		cb.setupSelect_TLot();
		cb.setupSelect_TStoreNo();
		//荷主センタ変更対応 2017.02.20 sja Start
		cb.setupSelect_MClient();
		cb.setupSelect_MLocation().withMCenter();
		//荷主センタ変更対応 2017.02.20 sja End

		// ====== 検索条件 ======
		// センタID
		cb.query().queryMLocation().queryMCenter().setCenterId_Equal(tStock.getMLocation().getMCenter().getCenterId());
		// 荷主ID
		cb.query().queryMClient().setClientId_Equal(tStock.getClientId());
		// 商品ID
		cb.query().queryMProduct().queryMSetParentAsOne().setProductId_Equal(tStock.getProductId());
		// 預託ID
		cb.query().queryMCustomer().setCustomerId_Equal(tStock.getDepositId());
		// 在庫区分ID
		cb.query().queryMStockType().setStockTypeId_Equal(tStock.getStockTypeId());
		// ロケーションID
		cb.query().queryMLocation().setLocationId_Equal(tStock.getLocationId());
		// 入庫日
		cb.query().queryTStoreNo().setStoreDt_Equal(tStock.getTStoreNo().getStoreDt());
		// 指示数量
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
		cb.query().setChargeNum_GreaterEqual(new BigDecimal(1));
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End

		// ====== ソート順 ======
		// 親商品CD
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
		// 入庫日
		cb.query().queryTStoreNo().addOrderBy_StoreDt_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ====== 検索実行 ======
		List<TStock> result = selectList(tStockBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		// ===== ０件チェック =====
		if (result.size() == 0) {
			// [#2167] 親商品の在庫がない場合のメッセージを変更 2017.07.25 kawana Start
			this.getErrorManager().add(errSts, WmsMessageConst.PARENT_STOCK_NOT_FOUND_ERROR);
			// [#2167] 親商品の在庫がない場合のメッセージを変更 2017.07.25 kawana End
		}

		return result;
	}

	/**
	 * <h2>セット品構成マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにセット品構成データを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param tStock 在庫：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MSetStructure> セット品構成マスタリスト
	 */
	public List<MSetStructure> selectStructure(TStock tStock, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		MSetStructureCB cb = mSetStructureBhv.newMyConditionBean();

		// ====== データ取得テーブル ======
		cb.setupSelect_MSetParent();
		cb.setupSelect_MProduct();
		//荷主センタ変更対応 2017.02.20 sja Start
		cb.setupSelect_MProduct().withMClient();
		//荷主センタ変更対応 2017.02.20 sja End

		// ====== 検索条件 ======
		cb.query().queryMSetParent().setProductId_Equal(tStock.getProductId());

		// ====== ソート順 ======
		// 構成品CD
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();

		// ====== 検索実行 ======
		List<MSetStructure> result = mSetStructureBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}