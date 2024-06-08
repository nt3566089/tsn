package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫受払共通ロジッククラス
 */
public class TransactionDataCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;

	/**
	 * <h2>トランザクション存在チェック.</h2>
	 * <pre>
	 * 入荷、出荷のトランザクションデータが存在するかをチェックする。
	 * </pre>
	 * @param mCustomer 取引先マスタ : 取引先ID
	 * @return true : トランザクションに存在
	 */
	public boolean existTran(MCustomer mCustomer) {

		if (mCustomer.getCustomerId() == null) {
			return false;
		}

		final long customerId = mCustomer.getCustomerId();

		// ===== 入荷 =====
		{
			TStoreRecordHCB cb = tStoreRecordHBhv.newMyConditionBean();
			cb.orScopeQuery(new OrQuery<TStoreRecordHCB>() {
				@Override
				public void query(TStoreRecordHCB orCb) {
					// 仕入先
					orCb.query().setSupplierId_Equal(customerId);
					// 預託
					orCb.query().setDepositId_Equal(customerId);
					// 予定仕入先
					orCb.query().queryTReceivePlanH().setPlanSupplierId_Equal(customerId);
					// 予定預託
					orCb.query().queryTReceivePlanH().setPlanDepositId_Equal(customerId);
				}
			});

			if (0 < tStoreRecordHBhv.selectCount(cb)) {
				return true;
			}
		}

		// ===== 出荷 =====
		{
			TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
			cb.orScopeQuery(new OrQuery<TAllocInstBCB>() {

				@Override
				public void query(TAllocInstBCB orCb) {
					// 納品先
					orCb.query().queryTAllocInstH().setSupplyCustomerId_Equal(customerId);
					// 届先
					orCb.query().queryTAllocInstH().setDelivCustomerId_Equal(customerId);
					// 預託
					orCb.query().setDepositId_Equal(customerId);
				}
			});

			if (0 < tAllocInstBBhv.selectCount(cb)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>トランザクション存在チェック.</h2>
	 * <pre>
	 * 入荷、出荷のトランザクションデータが存在するかをチェックする。
	 * </pre>
	 * @param mProduct 商品マスタ : 商品ID
	 * @return true : トランザクションに存在
	 */
	public boolean existTran(MProduct mProduct) {

		if (mProduct.getProductId() == null) {
			return false;
		}

		final long productId = mProduct.getProductId();

		// ===== 入荷 =====
		{
			TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
			cb.query().queryTReceivePlanB().setProductId_Equal(productId);

			if (0 < tStoreRecordBBhv.selectCount(cb)) {
				return true;
			}
		}

		// ===== 出荷 =====
		{
			TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
			cb.query().setProductId_Equal(productId);

			if (0 < tAllocInstBBhv.selectCount(cb)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>トランザクション存在チェック.</h2>
	 * <pre>
	 * 入荷、出荷のトランザクションデータが存在するかをチェックする。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ : 倉庫ID
	 * @return true : トランザクションに存在
	 */
	public boolean existTran(MWarehouse mWarehouse) {

		if (mWarehouse.getWarehouseId() == null) {
			return false;
		}

		final long warehouseId = mWarehouse.getWarehouseId();

		// ===== 入荷 =====
		{
			TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
			cb.query().queryTReceivePlanB().setPlanWarehouseId_Equal(warehouseId);

			if (0 < tStoreRecordBBhv.selectCount(cb)) {
				return true;
			}
		}

		// ===== 出荷 =====
		{
			TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
			cb.query().setWarehouseId_Equal(warehouseId);

			if (0 < tAllocInstBBhv.selectCount(cb)) {
				return true;
			}
		}

		// ===== 入荷実績・出荷実績 =====
		{
			TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
			cb.query().queryTStock().queryMLocation().queryMZone().setWarehouseId_Equal(warehouseId);
			cb.orScopeQuery(new OrQuery<TStockInoutCB>() {
				@Override
				public void query(TStockInoutCB orCb) {
					orCb.query().setStoreRecordBId_IsNotNull();
					orCb.query().setAllocInstBId_IsNotNull();
				}
			});

			if (0 < tStockInoutBhv.selectCount(cb)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>トランザクション存在チェック.</h2>
	 * <pre>
	 * 入荷、出荷のトランザクションデータが存在するかをチェックする。
	 * </pre>
	 * @param mLocation ロケーションマスタ : ロケーションID
	 * @return true : トランザクションに存在
	 */
	public boolean existTran(MLocation mLocation) {

		if (mLocation.getLocationId() == null) {
			return false;
		}

		final long locationId = mLocation.getLocationId();

		// ===== 入荷 =====
		{
			TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
			cb.orScopeQuery(new OrQuery<TStoreRecordBCB>() {

				@Override
				public void query(TStoreRecordBCB orCb) {
					orCb.query().queryTReceivePlanB().setPlanLocationId_Equal(locationId);
					orCb.query().setStoreLocationId_Equal(locationId);
				}
			});

			if (0 < tStoreRecordBBhv.selectCount(cb)) {
				return true;
			}
		}

		// ===== 出荷 =====
		{
			TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
			cb.query().setLocationId_Equal(locationId);

			if (0 < tAllocInstBBhv.selectCount(cb)) {
				return true;
			}
		}

		// ===== 入荷実績・出荷実績 =====
		{
			TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
			cb.query().queryTStock().setLocationId_Equal(locationId);
			cb.orScopeQuery(new OrQuery<TStockInoutCB>() {
				@Override
				public void query(TStockInoutCB orCb) {
					orCb.query().setStoreRecordBId_IsNotNull();
					orCb.query().setAllocInstBId_IsNotNull();
				}
			});

			if (0 < tStockInoutBhv.selectCount(cb)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>トランザクション存在チェック.</h2>
	 * <pre>
	 * 入荷、出荷のトランザクションデータが存在するかをチェックする。
	 * </pre>
	 * @param mDeliveryCourse 配送コースマスタ : 配送コースID
	 * @return true : トランザクションに存在
	 */
	public boolean existTran(MDeliveryCourse mDeliveryCourse) {

		if (mDeliveryCourse.getDeliveryCourseId() == null) {
			return false;
		}

		final long deliveryCourseId = mDeliveryCourse.getDeliveryCourseId();

		// ===== 出荷 =====
		{
			TAllocInstHCB cb = tAllocInstHBhv.newMyConditionBean();
			cb.query().setDeliveryCourseId_Equal(deliveryCourseId);

			if (0 < tAllocInstHBhv.selectCount(cb)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>トランザクション存在チェック.</h2>
	 * <pre>
	 * 入荷、出荷のトランザクションデータが存在するかをチェックする。
	 * </pre>
	 * @param mBox 荷材マスタ : 荷材ID
	 * @return true : トランザクションに存在
	 */
	public boolean existTran(MBox mBox) {

		if (mBox.getBoxId() == null) {
			return false;
		}

		final long boxId = mBox.getBoxId();

		// ===== 出荷 =====
		{
			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.query().setBoxId_Equal(boxId);

			if (0 < tPackingHBhv.selectCount(cb)) {
				return true;
			}
		}

		return false;
	}
}