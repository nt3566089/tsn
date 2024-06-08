package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫共通ロジッククラス
 */
public class StockLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫を取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に在庫データを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param tStock 在庫：在庫ID
	 * @return TStock 在庫
	 */
	public TStock getPkEntity(TStock tStock) {
		if (tStock.getStockId() == null) {
			return null;
		}
		return tStockBhv.selectByPKValueWithDeletedCheck(tStock.getStockId());
	}

	/**
	 * <h2>在庫を取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に在庫データを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param tStock 在庫：在庫ID
	 * @return TStock 在庫
	 */
	public TStock getUkEntityWithDeletedCheck(TStock tStock) {
		if (tStock.getLocationId() == null) {
			return null;
		}
		if (tStock.getStoreNoId() == null) {
			return null;
		}

		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.query().setLocationId_Equal(tStock.getLocationId());
		cb.query().setStoreNoId_Equal(tStock.getStoreNoId());

		return tStockBhv.selectEntityWithDeletedCheck(cb);
	}

}