package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;


/**
 * 入庫格納在庫データ取得ロジッククラス
 */
public class ReceiveStoreSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockInoutBhv tStockInoutBhv;

	/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA Start */
	/* パラメータマスタ         */
	@Inject
	private MParamBhv mParamBhv;

	/* パラメータマスタ         */
	@Inject
	private MLocationBhv mLocationBhv;

	/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA End */

	/**
	 * <h2>在庫受払データを取得する。</h2>
	 * <pre>
	 * 引数を条件に未格納、入庫仮ロケーションの在庫受払データを取得する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：商品CD・ロット・期限日・入庫ＮＯ・荷主ID・センタID・仮ロケーションCD
	 * @return List<TStockInout> 在庫受払リスト
	 */
	public List<TStockInout> checkExistStoreInoutSelect(WHtReceiveStore wHtReceiveStore) {
		//在庫データ情報の取得
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();

		tStockInoutCB.setupSelect_TStock();
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA Start */
		tStockInoutCB.setupSelect_TStock().withMStockType().withVDict(getCultureId());
		tStockInoutCB.setupSelect_TStock().withMProduct();
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA End */
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [S]
		tStockInoutCB.setupSelect_TStock().withTStoreNo();
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [E]

		//tStockInoutCB.setupSelect_TStoreRecordB().withTReceivePlanB().withTReceivePlanH().withMProcessType().withMStockType().withVDict(getCultureId());
		tStockInoutCB.setupSelect_TStoreRecordB().withTStoreRecordH().withMProcessType().withMStockType().withVDict(getCultureId());
		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().setProductCd_Equal(wHtReceiveStore.getProductCd());
		tStockInoutCB.query().queryTStoreRecordB().setLimitDt_Equal(wHtReceiveStore.getLimitDt());
		tStockInoutCB.query().queryTStoreRecordB().setLot_Equal(wHtReceiveStore.getLot());
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationType_Equal_$01();
		tStockInoutCB.query().queryTStoreRecordB().setStoreFlg_Equal_$0();
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA Start */
//		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().queryTReceivePlanH().setReceiveSlipNo_Equal(wHtReceiveStore.getOnsNum());
		tStockInoutCB.query().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtReceiveStore.getOnsNum());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setClientId_Equal(wHtReceiveStore.getClientId());
		if (wHtReceiveStore.getKariLocCd() != null){
			tStockInoutCB.query().queryTStock().queryMLocation().setLocationCd_Equal(wHtReceiveStore.getKariLocCd());
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA End */
		List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(tStockInoutCB);

		return tStockInoutList;
	}

	/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
	/**
	 * <h2>パラメータマスタの情報を取得する。</h2>
	 * <pre>
	 * 引数を条件にパラメータマスタデータを取得し、取得した１件目のデータを返す。
	 * データが取得できなかった場合はNULLを返す。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return MParam パラメータマスタ
	 */
	public MParam getMParam(Long clientId, Long centerId) {

		//パラメータ情報の取得
		MParamCB mParamCB = mParamBhv.newMyConditionBean();
		mParamCB.setupSelect_MClientCenter();
		mParamCB.query().queryMClientCenter().setClientId_Equal(clientId);
		mParamCB.query().queryMClientCenter().setCenterId_Equal(centerId);
		List<MParam> lstMParam = mParamBhv.selectList(mParamCB);

		if (lstMParam.size() > 0) {
			return lstMParam.get(0);
		} else {
			// 0: 管理しない
			return null;
		}
	}

	/**
	 * <h2>在庫受払データを取得する。</h2>
	 * <pre>
	 * 引数を条件に未格納、入庫仮ロケーションの在庫受払データを取得する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：仮ロケーションCD・商品CD・荷主ID・センタID
	 * @return List<TStockInout> 在庫受払リスト
	 */
	public List<TStockInout> checkExistStoreInoutSelectByKariLoc(WHtReceiveStore wHtReceiveStore) {
		//在庫データ情報の取得
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();

		tStockInoutCB.setupSelect_TStock();
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [S]
		tStockInoutCB.setupSelect_TStock().withTStoreNo();
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [E]
		tStockInoutCB.setupSelect_TStock().withMStockType().withVDict(getCultureId());
		tStockInoutCB.setupSelect_TStoreRecordB().withTStoreRecordH().withMCustomerBySupplierId();
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationType_Equal_$01();
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationCd_Equal(wHtReceiveStore.getKariLocCd());
		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().setProductCd_Equal(wHtReceiveStore.getProductCd());
		tStockInoutCB.query().queryTStoreRecordB().setStoreFlg_Equal_$0();
		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().queryTReceivePlanH();
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setClientId_Equal(wHtReceiveStore.getClientId());

		List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(tStockInoutCB);
		return tStockInoutList;
	}

	/**
	 * <h2>在庫受払データを取得する。</h2>
	 * <pre>
	 * 引数を条件に未格納、入庫仮ロケーションの在庫受払データを取得する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：仮ロケーションCD・ロット・期限日・在庫区分ID・預託ID・仕入先ID・荷主ID・センタID・商品CD
	 * @return List<TStockInout> 在庫受払リスト
	 */
	public List<TStockInout> tStockInoutSelect(WHtReceiveStore wHtReceiveStore) {

		//在庫データ情報の取得
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();

		tStockInoutCB.setupSelect_TStock();
		tStockInoutCB.setupSelect_TStock().withMStockType().withVDict(getCultureId());
		tStockInoutCB.setupSelect_TStock().withMCustomer();
		tStockInoutCB.setupSelect_TStoreRecordB().withTStoreRecordH().withMCustomerBySupplierId();

		tStockInoutCB.query().queryTStock().queryMLocation().setLocationType_Equal_$01();
		tStockInoutCB.query().queryTStock().queryMLocation().setLocationCd_Equal(wHtReceiveStore.getKariLocCd());

		if (wHtReceiveStore.getLot() != null){
			tStockInoutCB.query().queryTStoreRecordB().setLot_Equal(wHtReceiveStore.getLot());
		}
		if (wHtReceiveStore.getLimitDt() != null){
			tStockInoutCB.query().queryTStoreRecordB().setLimitDt_Equal(wHtReceiveStore.getLimitDt());
		}
		if (wHtReceiveStore.getStockTypeId() != null){
			tStockInoutCB.query().queryTStock().setStockTypeId_Equal(wHtReceiveStore.getStockTypeId());
		}
		if (wHtReceiveStore.getDepositId() != null){
			tStockInoutCB.query().queryTStock().setDepositId_Equal(wHtReceiveStore.getDepositId());
		}
		if (wHtReceiveStore.getSupplierId() != null){
			tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setSupplierId_Equal(wHtReceiveStore.getSupplierId());
		}
		tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().setProductCd_Equal(wHtReceiveStore.getProductCd());
		tStockInoutCB.query().queryTStoreRecordB().setStoreFlg_Equal_$0();
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().setClientId_Equal(wHtReceiveStore.getClientId());
		tStockInoutCB.query().queryTStoreRecordB().addOrderBy_Lot_Asc();
		tStockInoutCB.query().queryTStoreRecordB().addOrderBy_LimitDt_Asc();
		tStockInoutCB.query().queryTStock().addOrderBy_StockTypeId_Asc();
		tStockInoutCB.query().queryTStock().addOrderBy_DepositId_Asc();
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().addOrderBy_SupplierId_Asc();

		List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(tStockInoutCB);
		return tStockInoutList;

	}

	/**
	 * <h2>ロケーションマスタデータを取得する。</h2>
	 * <pre>
	 * センタIDを条件にロケーションマスタから入庫仮ロケーションを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @return List<MLocation> ロケーションマスタリスト
	 */
	public List<MLocation> tMLocationSelect(Long centerId) {

		//ロケーションマスタ情報の取得
		MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
		mLocationCB.query().setLocationType_Equal_$01();
		mLocationCB.query().setCenterId_Equal(centerId);
		List<MLocation> mLocationList = mLocationBhv.selectList(mLocationCB);
		return mLocationList;

	}
	/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
}
