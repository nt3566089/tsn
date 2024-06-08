package com.oneslogi.ht.wms.logic.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動出庫取得ロジッククラス
 */
public class StockMoveOutSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 在庫     */
	@Inject
	private TStockBhv tStockBhv;
	/* パラメータマスタ         */
	@Inject
	private MParamBhv mParamBhv;

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから引当可能数＞0の在庫データを検索し、
	 * 取得したデータを預託、在庫区分、ロット、期限日、仕入先単位でまとめ、引当可能数の合計値を算出して設定する。
	 *
	 * 検索対象が見つからない場合、0件エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mLocation  ロケーションマスタ：センタID・ロケーションCD
	 * @param mProduct 商品マスタ：JANCD（商品CD）
	 * @param mWarehouse 倉庫マスタ
	 * @param bUser ユーザマスタ：カルチャID
	 * @param tStoreNo 入庫No.：入庫ラベルNo.
	 * @return List<TStock> 在庫データリスト
	 */
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
	//public List<TStock> SelectStock(final MClient mClient, final MLocation mLocation, final MProduct mProduct, final MWarehouse mWarehouse,
	//		final BUser bUser) {
	public List<TStock> SelectStock(final MClient mClient, final MLocation mLocation,  final MProduct mProduct, final MWarehouse mWarehouse,
			final BUser bUser, final TStoreNo tStoreNo) {
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		TStockCB tStockCB = tStockBhv.newMyConditionBean();

		tStockCB.setupSelect_MClient();
		tStockCB.setupSelect_MWarehouse();
		tStockCB.setupSelect_TLot();
		tStockCB.setupSelect_MStockType().withVDict(bUser.getCultureId());
		tStockCB.setupSelect_MProduct();
		tStockCB.setupSelect_MLocation();
		tStockCB.setupSelect_MCustomer();
		tStockCB.setupSelect_TStoreNo().withMCustomer();
		tStockCB.setupSelect_MShape();

		tStockCB.query().setClientId_Equal(mClient.getClientId());
		//tStockCB.query().queryMWarehouse().setCenterId_Equal(mWarehouse.getCenterId());
		tStockCB.query().queryMWarehouse().setCenterId_Equal(mLocation.getCenterId());
		tStockCB.query().queryMLocation().setLocationCd_Equal(mLocation.getLocationCd());
		tStockCB.query().setChargeNum_GreaterThan(WCC.ZERO);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		tStockCB.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		tStockCB.orScopeQuery(new OrQuery<TStockCB>() {
			public void query(TStockCB orCB) {
				orCB.query().queryMProduct().setJanCd_Equal(mProduct.getJanCd());
				orCB.query().queryMProduct().setProductCd_Equal(mProduct.getJanCd());
			}
		});

		tStockCB.query().queryMCustomer().addOrderBy_CustomerCd_Asc();
		tStockCB.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		tStockCB.query().queryTLot().addOrderBy_Lot_Asc();
		tStockCB.query().queryTLot().addOrderBy_LimitDt_Asc();
		tStockCB.query().queryTStoreNo().queryMCustomer().addOrderBy_CustomerCd_Asc();

		List<TStock> lstTStock = tStockBhv.selectList(tStockCB);

		if (lstTStock.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
        List<TStock> aryTStock = new ArrayList<TStock>();
		TStock temp = lstTStock.get(0);
		BigDecimal lngSumChargeNum = temp.getChargeNum();
		for (int i = 1; i < lstTStock.size(); i++) {
			TStock tStock = lstTStock.get(i);
			/* [次期エンハンス] ラッパークラス(Long) 2015.09.24 By SJA Start */
//			if (temp.getDepositId().equals(tStock.getDepositId()) &&
//					temp.getStockTypeId().equals(tStock.getStockTypeId()) &&
//					CU.equals(temp.getTLot().getLot(), tStock.getTLot().getLot()) &&
//					CU.equals(temp.getTLot().getLimitDt(), tStock.getTLot().getLimitDt()) &&
//					CU.nullToZero(temp.getTStoreNo().getSupplierId()) == CU.nullToZero(tStock.getTStoreNo().getSupplierId())) {
			if (temp.getDepositId().equals(tStock.getDepositId()) &&
					temp.getStockTypeId().equals(tStock.getStockTypeId()) &&
					CU.equals(temp.getTLot().getLot(), tStock.getTLot().getLot()) &&
					CU.equals(temp.getTLot().getLimitDt(), tStock.getTLot().getLimitDt()) &&
					// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
					CU.isNotNullAndEquals(CU.nullToZero(temp.getTStoreNo().getSupplierId()), CU.nullToZero(tStock.getTStoreNo().getSupplierId()))) {
				// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
				lngSumChargeNum = WCC.add(lngSumChargeNum, tStock.getChargeNum());
			} else {
				temp.setChargeNum(lngSumChargeNum);
				aryTStock.add(temp);
				temp = tStock;
				lngSumChargeNum = temp.getChargeNum();
			}
		}
		temp.setChargeNum(lngSumChargeNum);
		aryTStock.add(temp);

		return aryTStock;
	}

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから引当可能数＞0の在庫データを検索して返却する。
	 * 検索対象が見つからない場合、排他エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tStock 在庫：荷主ID・倉庫ID・ロケーションID・商品ID・預託ID・在庫区分ID
	 * @param tLot ロット：ロット・期限日
	 * @param tStoreNo 入庫No.：仕入先ID・入庫ラベルNo.
	 * @return List<TStock> 在庫データリスト
	 */
	public List<TStock> SelectStockData(TStock tStock, TLot tLot, TStoreNo tStoreNo) {

		TStockCB tStockCB = tStockBhv.newMyConditionBean();

		tStockCB.setupSelect_MClient();
		tStockCB.setupSelect_MWarehouse();
		tStockCB.setupSelect_TLot();
		tStockCB.setupSelect_MStockType();
		tStockCB.setupSelect_MProduct();
		tStockCB.setupSelect_MLocation();
		tStockCB.setupSelect_MCustomer();
		tStockCB.setupSelect_TStoreNo().withMCustomer();
		tStockCB.setupSelect_MShape();

		tStockCB.query().setClientId_Equal(tStock.getClientId());
		tStockCB.query().setWarehouseId_Equal(tStock.getWarehouseId());
		tStockCB.query().setLocationId_Equal(tStock.getLocationId());
		tStockCB.query().setProductId_Equal(tStock.getProductId());
		tStockCB.query().setDepositId_Equal(tStock.getDepositId());
		tStockCB.query().setStockTypeId_Equal(tStock.getStockTypeId());
		tStockCB.query().queryTLot().setLot_Equal(tLot.getLot());
		tStockCB.query().queryTLot().setLimitDt_Equal(tLot.getLimitDt());
		tStockCB.query().queryTStoreNo().setSupplierId_Equal(tStoreNo.getSupplierId());
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		tStockCB.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		tStockCB.query().setChargeNum_GreaterThan(WCC.ZERO);

		tStockCB.query().addOrderBy_StoreNoId_Asc();

		List<TStock> lstTStock = tStockBhv.selectList(tStockCB);

		if (lstTStock.size() == 0) {
			//入力内容に誤りがあります。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return null;
		}

		return lstTStock;
	}

	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
	/**
	 * <h2>パラメータマスタデータを取得する。</h2>
	 * 引数を条件にパラメータマスタデータを取得する。
	 * 取得した１件目のデータを返す。
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
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
}