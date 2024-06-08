package com.oneslogi.ht.wms.logic.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロケ変更取得ロジッククラス
 */
public class LocationMoveSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 在庫     */
	@Inject
	private TStockBhv tStockBhv;

	// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana Start

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に引当可能数が1以上の在庫データを検索し、
	 * 取得したデータを預託、在庫区分、ロット、期限日単位でまとめ、引当可能数の合計値を算出して設定する。
	 *
	 * 検索対象が見つからない場合、エラーを登録する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mLocation ロケーションマスタ：センタID・ロケーションCD
	 * @param bUser ユーザマスタ：カルチャID
	 *
	 * @return List<TStock> 在庫データリスト
	 */
	public List<TStock> selectStock(final MClient mClient, final MLocation mLocation, final BUser bUser) {

		TStockCB cb = tStockBhv.newMyConditionBean();

		cb.setupSelect_MClient();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_TLot();
		cb.setupSelect_MStockType().withVDict(bUser.getCultureId());
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MCustomer();
		cb.setupSelect_TStoreNo().withMCustomer();
		cb.setupSelect_MShape();

		cb.query().setClientId_Equal(mClient.getClientId());
		cb.query().queryMLocation().setCenterId_Equal(mLocation.getCenterId());
		cb.query().queryMLocation().setLocationCd_Equal(mLocation.getLocationCd());
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryMCustomer().addOrderBy_CustomerCd_Asc();
		cb.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		cb.query().queryTLot().addOrderBy_Lot_Asc();
		cb.query().queryTLot().addOrderBy_LimitDt_Asc();

		List<TStock> stockList = tStockBhv.selectList(cb);

		if (stockList.size() == 0) {
			// 該当データなし
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 商品、預託、在庫区分、ロット、期限日でまとめる =====

		List<TStock> resultStock = new ArrayList<TStock>();
		Map<ThisStockKey, TStock> stockMap = new HashMap<LocationMoveSelectLogic.ThisStockKey, TStock>();

		for (TStock stock : stockList) {
			ThisStockKey key = new ThisStockKey(stock.getProductId(), stock.getDepositId(), stock.getStockTypeId(), stock.getLotId());
			if (!stockMap.containsKey(key)) {

				resultStock.add(stock);
				stockMap.put(key, stock);
			} else {

				TStock srcStock = stockMap.get(key);
				// 引当可能数を加算
				srcStock.setChargeNum(WCC.add(srcStock.getChargeNum(), stock.getChargeNum()));
				// バージョンNo.を設定 (排他チェック用)
				// ※ バージョンはインクリメントされていくため合計値のチェックでよしとする
				//    (減ることがないため片方が増えて片方が減るみたいな現象は発生しない)
				srcStock.setVersionNo(srcStock.getVersionNo() + stock.getVersionNo());
			}
		}

		return resultStock;
	}

	// [ON推-品向-1008] 在庫の排他チェックを追加 2015.11.13 kawana Start

	/**
	 * <h2>在庫データを取得する（排他チェック込）。</h2>
	 * <pre>
	 * 引数を条件に引当可能数＞0の在庫データを取得し、引数の在庫データと比較する。
	 * 件数またはバージョンが不一致の場合、排他エラーをエラーステータスに設定し、nullを返す。
	 * 一致の場合、在庫の検索結果を返却する。
	 *
	 * </pre>
	 * @param stockCondition 在庫検索条件：荷主ID・倉庫ID・ロケーションID
	 * @param srcStockList 在庫データのリスト：全項目
	 * @return List<TStock> 在庫データリスト
	 */
	public List<TStock> selectMoveStock(TStock stockCondition, List<TStock> srcStockList) {

		// 対象在庫を在庫IDでマッピング
		Map<Long, TStock> srcStockMap = new HashMap<Long, TStock>();
		for (TStock stock : srcStockList) {
			srcStockMap.put(stock.getStockId(), stock);
		}

		// 対象在庫をデータベースから取得
		TStockCB cb = tStockBhv.newMyConditionBean();

		cb.setupSelect_MClient();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_TLot();
		cb.setupSelect_MStockType();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MCustomer();
		cb.setupSelect_TStoreNo().withMCustomer();
		cb.setupSelect_MShape();

		cb.query().setClientId_Equal(stockCondition.getClientId());
		cb.query().setWarehouseId_Equal(stockCondition.getWarehouseId());
		cb.query().setLocationId_Equal(stockCondition.getLocationId());
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		cb.query().addOrderBy_StoreNoId_Asc();

		List<TStock> selectStockList = tStockBhv.selectList(cb);

		if (selectStockList.size() == 0) {

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return null;
		}

		// ===== 引当可能数とバージョンのチェック (引当可能数は念のため) =====

		Map<ThisStockKey, TStock> checkStockMap = new HashMap<LocationMoveSelectLogic.ThisStockKey, TStock>();

		for (TStock stock : selectStockList) {
			ThisStockKey key = new ThisStockKey(stock.getProductId(), stock.getDepositId(), stock.getStockTypeId(), stock.getLotId());
			if (!checkStockMap.containsKey(key)) {
				// 返すデータが変わってしまうため複製を作成してチェック
				TStock checkStock = stock.clone();
				checkStockMap.put(key, checkStock);
			} else {

				TStock checkStock = checkStockMap.get(key);
				// 引当可能数を加算
				checkStock.setChargeNum(WCC.add(checkStock.getChargeNum(), stock.getChargeNum()));
				// バージョンNo.を設定 (排他チェック用)
				// ※ バージョンはインクリメントされていくため合計値のチェックでよしとする
				//    (減ることがないため片方が増えて片方が減るみたいな現象は発生しない)
				checkStock.setVersionNo(checkStock.getVersionNo() + stock.getVersionNo());
			}
		}

		if (checkStockMap.size() != srcStockList.size()) {

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return null;
		}

		for (TStock srcStock : srcStockList) {

			ThisStockKey key = new ThisStockKey(srcStock.getProductId(), srcStock.getDepositId(), srcStock.getStockTypeId(), srcStock.getLotId());
			TStock checkStock = checkStockMap.get(key);

			if (checkStock == null) {
				// 該当在庫が存在しない

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return null;
			}

			if (WCC.isNotEqual(srcStock.getChargeNum(), checkStock.getChargeNum())) {
				// 引当可能数相違

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return null;
			}

			if (WCC.isNotEqual(srcStock.getVersionNo(), checkStock.getVersionNo())) {
				// バージョン相違

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return null;
			}
		}

		return selectStockList;
	}

	// [ON推-品向-1008] 在庫の排他チェックを追加 2015.11.13 kawana End

	private static class ThisStockKey {
		long productId;
		long depositId;
		long stockTypeId;
		long lotId;

		public ThisStockKey(long productId, long depositId, long stockTypeId, long lotId) {
			this.productId = productId;
			this.depositId = depositId;
			this.stockTypeId = stockTypeId;
			this.lotId = lotId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (depositId ^ (depositId >>> 32));
			result = prime * result + (int) (lotId ^ (lotId >>> 32));
			result = prime * result + (int) (productId ^ (productId >>> 32));
			result = prime * result + (int) (stockTypeId ^ (stockTypeId >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ThisStockKey other = (ThisStockKey) obj;
			if (depositId != other.depositId)
				return false;
			if (lotId != other.lotId)
				return false;
			if (productId != other.productId)
				return false;
			if (stockTypeId != other.stockTypeId)
				return false;
			return true;
		}
	}

	// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana End
}