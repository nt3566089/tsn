package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫格納送信前在庫データ取得ロジッククラス
 */
public class ReceiveStoreSendSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫受払データを取得する。</h2>
	 * <pre>
	 * 引数を条件に未格納、入庫仮ロケーションの在庫受払データを取得する。
	 *
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：ロット・期限日・商品CD・仕入先ID・預託ID・在庫区分ID・仮ロケーションCD・入庫ＮＯ・荷主ID・センタID
	 * @return List<TStockInout> 在庫受払リスト
	 */
	public List<TStockInout> storeRecordBSelect(WHtReceiveStore wHtReceiveStore) {

		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();

		tStockInoutCB.setupSelect_TStock();
		tStockInoutCB.setupSelect_TStock().withMClient();
		tStockInoutCB.setupSelect_TStock().withMWarehouse();
		tStockInoutCB.setupSelect_TStock().withTLot();
		tStockInoutCB.setupSelect_TStock().withMStockType();
		tStockInoutCB.setupSelect_TStock().withMProduct();
		tStockInoutCB.setupSelect_TStock().withMLocation();
		tStockInoutCB.setupSelect_TStock().withMCustomer();
		tStockInoutCB.setupSelect_TStock().withTStoreNo();
		tStockInoutCB.setupSelect_TStock().withTStoreNo().withMCustomer();
		tStockInoutCB.setupSelect_TStock().withMShape();
		tStockInoutCB.setupSelect_TStoreRecordB().withTReceivePlanB().withTReceivePlanH().withMProcessType().withMStockType().withVDict(getCultureId());
		tStockInoutCB.setupSelect_TStoreRecordB().withTStoreRecordH().withMProcessType().withMStockType().withVDict(getCultureId());
		tStockInoutCB.query().queryTStoreRecordB().setLot_Equal(wHtReceiveStore.getLot());
		tStockInoutCB.query().queryTStoreRecordB().setLimitDt_Equal(wHtReceiveStore.getLimitDt());
		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().setProductCd_Equal(wHtReceiveStore.getProductCd());
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
//		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().queryTReceivePlanH().setReceiveSlipNo_Equal(wHtReceiveStore.getOnsNum());
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
		tStockInoutCB.query().queryTStoreRecordB().setStoreFlg_Equal_$0();
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationType_Equal_$01();

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
		tStockInoutCB.query().queryTStock().queryTStoreNo().setSupplierId_Equal(wHtReceiveStore.getSupplierId());
		tStockInoutCB.query().queryTStock().setDepositId_Equal(wHtReceiveStore.getDepositId());
		tStockInoutCB.query().queryTStock().setStockTypeId_Equal(wHtReceiveStore.getStockTypeId());
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationCd_Equal(wHtReceiveStore.getKariLocCd());
		tStockInoutCB.query().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtReceiveStore.getOnsNum());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setClientId_Equal(wHtReceiveStore.getClientId());
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */

		tStockInoutCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
		List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(tStockInoutCB);

		return tStockInoutList;

	}
	//[新WMS-112-051]同一商品複数行の格納でエラーとなる対応 2015.11.27 Yokosuka [S]
	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫仮ロケーションで引当可能数＞0の在庫データを取得する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：ロット・期限日・商品CD・荷主ID・センタID・預託ID・在庫区分ID・仮ロケーションCD・入庫ＮＯ
	 * @return List<TStock> 在庫リスト
	 */
	public List<TStock> stockSelect(WHtReceiveStore wHtReceiveStore) {

		TStockCB tStockCB = tStockBhv.newMyConditionBean();

		tStockCB.setupSelect_MClient();
		tStockCB.setupSelect_MWarehouse();
		tStockCB.setupSelect_TLot();
		tStockCB.setupSelect_MStockType();
		tStockCB.setupSelect_MProduct();
		tStockCB.setupSelect_MLocation();
		tStockCB.setupSelect_MCustomer();
		tStockCB.setupSelect_TStoreNo();
		tStockCB.setupSelect_TStoreNo().withMCustomer();
		tStockCB.setupSelect_MShape();
		tStockCB.query().queryTLot().setLot_Equal(wHtReceiveStore.getLot());
		tStockCB.query().queryTLot().setLimitDt_Equal(wHtReceiveStore.getLimitDt());
		tStockCB.query().queryMProduct().setProductCd_Equal(wHtReceiveStore.getProductCd());
		tStockCB.query().queryMLocation().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tStockCB.query().setClientId_Equal(wHtReceiveStore.getClientId());
		tStockCB.query().queryMLocation().setLocationType_Equal_$01();
		// 入庫格納でセンター間移動の場合「入庫No」テーブルの「仕入先ID」が無い為検索条件から外す 2016.3.22 nayzaw
		tStockCB.query().setDepositId_Equal(wHtReceiveStore.getDepositId());
		tStockCB.query().setStockTypeId_Equal(wHtReceiveStore.getStockTypeId());
		tStockCB.query().queryMLocation().setLocationCd_Equal(wHtReceiveStore.getKariLocCd());
		tStockCB.query().queryTStoreNo().setStoreLabelNo_Equal(wHtReceiveStore.getOnsNum());
		tStockCB.query().setChargeNum_GreaterThan(WCC.ZERO);
		tStockCB.query().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
		List<TStock> tStockList = tStockBhv.selectList(tStockCB);

		return tStockList;

	}

	/**
	 * <h2>在庫受払データを取得する。</h2>
	 * <pre>
	 * 引数を条件に未格納、入庫仮ロケーションの在庫受払データを取得する。
	 * </pre>
	 * @param tStock 在庫：ロット・期限日・商品CD・入庫ラベルNo.・荷主ID・センタID
	 * @return List<TStockInout> 在庫受払リスト
	 */
	public List<TStockInout> tStoreRecordBSelect(TStock tStock) {

		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();

		tStockInoutCB.setupSelect_TStock();
		tStockInoutCB.setupSelect_TStock().withMClient();
		tStockInoutCB.setupSelect_TStock().withMWarehouse();
		tStockInoutCB.setupSelect_TStock().withTLot();
		tStockInoutCB.setupSelect_TStock().withMStockType();
		tStockInoutCB.setupSelect_TStock().withMProduct();
		tStockInoutCB.setupSelect_TStock().withMLocation();
		tStockInoutCB.setupSelect_TStock().withMCustomer();
		tStockInoutCB.setupSelect_TStock().withTStoreNo();
		tStockInoutCB.setupSelect_TStock().withTStoreNo().withMCustomer();
		tStockInoutCB.setupSelect_TStock().withMShape();
		tStockInoutCB.setupSelect_TStoreRecordB().withTReceivePlanB().withTReceivePlanH().withMProcessType().withMStockType().withVDict(getCultureId());
		tStockInoutCB.setupSelect_TStoreRecordB().withTStoreRecordH().withMProcessType().withMStockType().withVDict(getCultureId());
		tStockInoutCB.query().queryTStoreRecordB().setLot_Equal(tStock.getTLot().getLot());
		tStockInoutCB.query().queryTStoreRecordB().setLimitDt_Equal(tStock.getTLot().getLimitDt());
		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().setProductCd_Equal(tStock.getMProduct().getProductCd());
		tStockInoutCB.query().queryTStoreRecordB().setStoreFlg_Equal_$0();
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationType_Equal_$01();
		tStockInoutCB.query().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(tStock.getTStoreNo().getStoreLabelNo());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setCenterId_Equal(tStock.getMLocation().getCenterId());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setClientId_Equal(tStock.getClientId());
		tStockInoutCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
		List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(tStockInoutCB);

		return tStockInoutList;

	}
	//[新WMS-112-051]同一商品複数行の格納でエラーとなる対応 2015.11.27 Yokosuka [E]

}
