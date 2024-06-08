package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTStock;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.shipping.StockDataSelectLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 在庫移動データ取得ロジッククラス
 */
public class StockMoveSelectLogic extends AbstractWmsLogic {

	CommonUtil util = new CommonUtil();

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private StockDataSelectLogic logic;
	// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja Start
	// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
	// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja End
	// [C-CWMS-0050] 補充管理件対応 2016.2.19 nayzaw Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [C-CWMS-0050] 補充管理件対応 2016.2.19 nayzaw End
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete
	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫データを検索し、在庫の引当可能数を合計する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 *
	 * 出荷指示ヘッダ、出荷指示ボディを作成後、
	 * 【在庫数データの取得】を行い、
	 * データが存在する場合、引当可能数が引当可能数合計値に加算後在庫に設定する。
	 *
	 * ケース入数取得後在庫に設定する。
	 *
	 * 【在庫数データの取得】
	 * ・{@link StockDataSelectLogic#select(TShippingInstH, TShippingInstB, Boolean, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫数データの取得メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tStock     在庫：荷主ID・倉庫ID・商品ID・在庫区分ID・ロケーションID・預託ID・入庫No.ID
	 * @param mCenter    センタマスタ：センタID
	 * @param mCustomer  取引先マスタ：取引先ID
	 * @param tLot       ロット：ロット・期限日
	 * @param tStoreNo   入庫No.：入庫ラベルNo.
	 * @param errSts     エラー時に設定するエラーステータス
	 * @return TStock    在庫
	 */
	public TStock select(TStock tStock,
	                     MCenter mCenter,
	                     MCustomer mCustomer,
	                     TLot tLot,
	                     TStoreNo tStoreNo,
	                     ErrorStatus errSts) {

		TStock result = null;
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
     // [Ver3.0] unit of measure対応 2017.11.20 ライ DEL

        // ===== 商品荷姿マスタの商品ID最大値 =====
        cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			public void query(MProductShapeCB subCB) {
				subCB.specify().columnProductId();
				setDelFlg(subCB);
			}
        }, TStock.ALIAS_maxProductId);

    	// ===== 検索条件の設定 =====

        // ===== tStock．在庫IDがnull以外場合、以下条件を追加 =====
        if (tStock != null && tStock.getStockId() != null){
        	cb.query().setStockId_Equal(tStock.getStockId());
        }else{
        	cb.query().setStockId_Equal(tStock.getStockId());
        	cb.query().setClientId_Equal(tStock.getClientId());
        	if(mCenter != null){
        		cb.query().queryMLocation().setCenterId_Equal(mCenter.getCenterId());
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

//        	if(tStoreNo != null){
//
//        		if(tStoreNo.getStoreNoId() == null){
//        			cb.query().queryTStoreNo().setStoreNoId_IsNull();
//        		}else{
//        			cb.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
//        		}
//        	}
			if(tStock.getTStoreNo() != null){
				if(tStock.getTStoreNo().getMCustomer() != null){
					cb.query().queryTStoreNo().queryMCustomer().setCustomerId_Equal(tStock.getTStoreNo().getMCustomer().getCustomerId());
				}
			}
        }

    	cb.query().setChargeNum_GreaterThan(WCC.ZERO);

        // ===== 検索実行 =====
    	tStockList = tStockBhv.selectList(cb);

		// ===== ０件チェック =====

		if (tStockList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}else {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			tStockBhv.load(tStockList, new ReferrerLoaderHandler<LoaderOfTStock>() {
				@Override
				public void handle(LoaderOfTStock loader) {
					loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
						@Override
						public void setup(MProductShapeCB subCB) {
							subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
							subCB.query().setDelFlg_Equal_$0();
							subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						}
					});
				}
			});
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			int count = 0 ;
			BigDecimal lonChargeNum = WCC.ZERO;

			for(TStock tStockEnt : tStockList){
				result = tStockEnt ;

				if ( WCC.isPositive(WCC.add(CU.nullToZero(tStockEnt.getChargeNum()),
						CU.nullToZero(tStockEnt.getAllocNum()),
						CU.nullToZero(tStockEnt.getMoveNum()))) ) {
						count  = count  +1 ;
						lonChargeNum = WCC.add(lonChargeNum, CU.nullToZero(tStockEnt.getChargeNum()));
			    }
			}

//			if (count > 1 ) {
//				this.getErrorManager().add(errSts, WmsMessageConst.DATA_PLURAL_FOUND_ERROR);
//				return null;
//			}else{
//				result = tStockList.get(0);
//			}

			result = tStockList.get(0);
			result.setChargeNum(lonChargeNum);
			result.setRowCount(count);
		}


		if(tStock.getStockId() == null){
			if(tStoreNo == null || tStoreNo.getStoreLabelNo() == null){
				result.setStoreNoId(null);
				result.getTStoreNo().setStoreLabelNo(null);
			}
		}

		BigDecimal lonSumChargeNum = WCC.ZERO;
		// ===== 出荷指示ヘッダ設定 =====
		TShippingInstH head = new TShippingInstH();
		head.setClientId(result.getClientId());
		head.setCenterId(result.getMWarehouse().getCenterId());
		// ===== 出荷指示ボディ設定 =====
		TShippingInstB body = new TShippingInstB();
		body.setWarehouseId(result.getWarehouseId());
		body.setLotId(result.getLotId());
		body.setProductId(result.getProductId());
		body.setDepositId(result.getDepositId());
		body.setLocationId(result.getLocationId());
		body.setStockTypeId(result.getStockTypeId());

		// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
		List<TStock> resultStock = logic.select(head,body,false,errSts);
		// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End
		if(resultStock.size() != 0){

			for(TStock sto : resultStock){
				lonSumChargeNum = WCC.add(lonSumChargeNum, CU.nullToZero(sto.getChargeNum()));
			}

//			TStock ret = resultStock.get(0);
//			result.setSumChargeNum(ret.getChargeNum());
		}

		result.setSumChargeNum(lonSumChargeNum);

		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja Start
		// 入数の設定値
		MProductShape productShape = new MProductShape();
		productShape.setClientId(result.getClientId());
		productShape.setCenterId(result.getMWarehouse().getCenterId());
		productShape.setProductId(result.getProductId());
		productShape.setCaseFlg("1");
		// [Ver3.0] unit of measure対応 2017.11.20 ライ DEL
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja End
		// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
		WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, result.getMProduct());

		//商品单位
		result.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, result.getMProduct()));
		// 入数内訳
		result.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, result.getMProduct()));
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		// [Ver3.0] unit of measure対応 2017.11.20 ライ END
		return result;
	}

	/**
	 * <h2>荷主センタマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに荷主センタマスタからデータ取得する。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getClientCenterInfo(Long clientId,Long centerId){
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(clientId);
		clientCenterC.setCenterId(centerId);
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);

		return clientCenter;
	}

}
