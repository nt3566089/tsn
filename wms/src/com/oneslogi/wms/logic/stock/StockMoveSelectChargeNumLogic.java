package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫数取得ロジッククラス
 */
public class StockMoveSelectChargeNumLogic extends AbstractWmsLogic {

	CommonUtil util = new CommonUtil();

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫数を取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫の引当可能数を取得する。
	 * 対象が見つからない場合、０を返す。
	 * データが複数件の場合、引当可能数の合計値を返す。
	 * </pre>
	 * @param tStock     在庫：在庫ID・荷主ID・倉庫ID・商品ID・在庫区分ID・ロケーションID・預託ID・入庫No.
	 * @param mCenter    センタマスタ：センタID
	 * @param mCustomer  取引先マスタ：取引先ID
	 * @param tLot       ロット：ロット・期限日
	 * @param tStoreNo   入庫No.：入庫ラベルNo.
	 * @param errSts     エラー時に設定するエラーステータス
	 * @return Long      在庫数
	 */
	public BigDecimal selectChargeNum(TStock tStock,
	                           MCenter mCenter,
	                           MCustomer mCustomer,
	                           TLot tLot,
	                           TStoreNo tStoreNo,
	                           ErrorStatus errSts) {

		BigDecimal intRetult = WCC.ZERO;
		List<TStock> tStockList = new ArrayList<TStock>();

		// ===== 在庫移動データ取得=====

		// ===== 検索テーブルの設定 =====
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MLocation().withMCenter();
		cb.setupSelect_MCustomer();
		cb.setupSelect_TStoreNo();
		cb.setupSelect_TStoreNo().withMCustomer();
        cb.setupSelect_MStockType();
        cb.setupSelect_TLot();
        cb.setupSelect_TStoreNo().withTStoreNoSelf();
        cb.setupSelect_MClient();
        cb.setupSelect_MShape();
        cb.setupSelect_MWarehouse();

        // ===== 商品荷姿マスタの荷姿ID最大値 =====
        // [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
        cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			public void query(MProductShapeCB subCB) {
				subCB.specify().specifyMShapeGrpDtl().specifyMShape().columnShapeId();
				setDelFlg(subCB);
			}
        }, TStock.ALIAS_maxSharpId);
        // [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End

        // ===== 商品荷姿マスタの商品ID最大値 =====
        cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			public void query(MProductShapeCB subCB) {
				subCB.specify().columnProductId();
				setDelFlg(subCB);
			}
        }, TStock.ALIAS_maxProductId);

    	// ===== 検索条件の設定 =====
    	cb.query().setStockId_Equal(tStock.getStockId());
    	cb.query().setClientId_Equal(tStock.getClientId());
    	if(mCenter != null){
    		cb.query().queryMLocation().queryMCenter().setCenterId_Equal(mCenter.getCenterId());
    	}
    	cb.query().setWarehouseId_Equal(tStock.getWarehouseId());
    	cb.query().setProductId_Equal(tStock.getProductId());
    	cb.query().setDepositId_Equal(tStock.getDepositId());
    	cb.query().setLocationId_Equal(tStock.getLocationId());
    	cb.query().setStockTypeId_Equal(tStock.getStockTypeId());

    	if(mCustomer != null){
    		cb.query().queryMCustomer().setCustomerId_Equal(mCustomer.getCustomerId());
    	}
    	if(tLot != null){
    		cb.query().queryTLot().setLot_Equal(tLot.getLot());
    		cb.query().queryTLot().setLimitDt_Equal(tLot.getLimitDt());
    	}
    	if(tStoreNo != null){
    		cb.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
    	}
    	cb.query().queryTStoreNo().queryMCustomer().setCustomerCd_Equal(tStock.getTStoreNo().getMCustomer().getCustomerCd());
    	cb.query().setChargeNum_GreaterThan(WCC.ZERO);

        // ===== 検索実行 =====
    	tStockList = tStockBhv.selectList(cb);

		// ===== ０件チェック =====

		if (tStockList.size() == 0) {
			return WCC.ZERO;
		}else {

			for(TStock tStockEnt : tStockList){

				intRetult = WCC.add(intRetult, CU.nullToZero(tStockEnt.getChargeNum()));

			}
		}
		return intRetult;
	}

}
