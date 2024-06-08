package com.oneslogi.wms.logic.stock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTStock;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockSelectLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockSelectLotCondition;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.LotLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 在庫調整データ取得ロジッククラス
 */
public class StockAdjustSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TInventoryBBhv tInventoryBBhv;

	// ===== 使用ロジック =====

	// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ParamLogic paramLogic;
	// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei End
	// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja Start
	// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
	// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja End
	// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana Start
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private LotLogic lotLogic;
	@Inject
	private StockSelectLogic stockSelectLogic;
	// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana End
	// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete
	@Inject
	private ProductShapeLogic productShapeLogic;
	// [Ver3.0] unit of measure対応 2017.11.27 ライ END


	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 受取ったデータより、在庫調整データを取得する（複数件データが存在する場合、１件目の在庫データを返す）。
	 * ・引数の棚卸ボディIDがある場合、棚卸による在庫調整とする。
	 * ・引数の棚卸ボディIDあり、又在庫IDがNULLの場合、棚卸（行追加）による在庫調整とする。
	 * ・引数の在庫IDがNULL、且つ棚卸ボディIDがNULLの場合、在庫調整(新規)による在庫調整とする。
	 * ・上記以外は、通常の在庫調整とする。
	 *
	 *  棚卸の場合、棚卸ボディと結合して、在庫調整データを取得する。
	 *  棚卸の「行追加」以外の場合、棚卸ボディの入庫No.IDより在庫を検索し、
	 *  データ未存在又検索された在庫のロケ、ロット、在庫区分、預託、期限日、仕入先が棚卸ボディと違う場合、
	 *  不一致エラーをステータス情報に設定する。
	 *
	 *  棚卸の「行追加」と「在庫調整(新規)」で、入庫No.マージの場合、
	 *  下記の条件で在庫からデータを検索し、対象が存在する場合、既に在庫存在エラーをエラーステータス情報に設定する。
	 *  在庫存在チェックの検索条件：センタID・荷主ID・ロケID・商品ID・預託ID・ロット・期限日・在庫区分ID・仕入先ID・荷姿ID・引当可能数+移動数+引当済＞0
	 *
	 *  入庫ラベルNo.入力ある場合、入庫ラベルNo.が在庫を検索し、
	 *  商品、在庫区分、預託、ロット、期限日、仕入先が受取った引数と異なる場合、
	 *  入庫ラベルNo.使用不可エラーをステータス情報に設定する。
	 *
	 * </pre>
	 * @param tStock      在庫：在庫ID・倉庫ID・荷主ID・商品ID・ロケーション・在庫区分ID・荷姿ID・預託ID・入数
	 *                    ロケーションマスタ：センタID・ピックロケフラグ、商品マスタ：入庫No.マージ区分、
	 *                    ロット：ロット・期限日、取引先マスタ：取引先ID、入庫No：入庫ラベルNo.
	 * @param mWarehouse  倉庫マスタ
	 * @param mCustomer   取引先マスタ：取引先ID
	 * @param tLot        ロット：ロット・期限日
	 * @param tStoreNo    入庫No.：仕入先ID
	 * @param tInventoryB 棚卸ボディ：棚卸ボディID・在庫ID
	 * @param errSts      エラー時に設定するエラーステータス
	 * @return TStock     在庫エンティティ
	 */
	public TStock select(TStock tStock,
			                   MWarehouse mWarehouse,
			                   MCustomer mCustomer,
			                   TLot tLot,
			                   TStoreNo tStoreNo,
			                   TInventoryB tInventoryB,
			                   ErrorStatus errSts) {

		// ===== tInventoryB．棚卸ボディIDがnull以外かつtInventoryB．在庫IDがNull場合、 =====

		TInventoryB tInventoryB_A  = null;
		TInventoryBCB bcb =tInventoryBBhv.newMyConditionBean();

		if (tInventoryB != null && tInventoryB.getInventoryBId() != null ){

			bcb.setupSelect_MProduct().withMClient();
			bcb.setupSelect_MLocation();
			bcb.setupSelect_MLocation().withMCenter();
			bcb.setupSelect_MCustomerByDepositId();
			bcb.setupSelect_MCustomerBySupplierId();
			bcb.setupSelect_TStoreNo();
			bcb.setupSelect_TStoreNo().withMCustomer();
			bcb.setupSelect_MStockType();
			bcb.setupSelect_TLot();
			bcb.setupSelect_TStoreNo().withTStoreNoSelf();
			bcb.setupSelect_MStockType();
			bcb.setupSelect_MShape();
			bcb.setupSelect_MWarehouse();
			bcb.query().setInventoryBId_Equal(tInventoryB.getInventoryBId());
			tInventoryB_A = tInventoryBBhv.selectEntity(bcb);

		}

		TStock result = new TStock();

		// ===== 在庫調整データ取得=====

		// ===== 検索条件の設定 =====
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
		// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL

        // ===== 商品荷姿マスタの商品ID最大値 =====
        cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			public void query(MProductShapeCB subCB) {
				subCB.specify().columnProductId();
				setDelFlg(subCB);
			}
        }, TStock.ALIAS_maxProductId);

        // ===== tInventoryB．在庫IDがnull以外場合、以下条件を追加 =====
        if (tInventoryB != null && tInventoryB.getStockId() != null){
        	if (tInventoryB_A != null){
        		if ("1".equals(tInventoryB_A.getStockAdjustFlg())){
        			this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
    				return null;
        		}
        	}

        	cb.query().setStockId_Equal(tInventoryB.getStockId());
        }else if (tInventoryB != null && tInventoryB.getInventoryBId() != null && tInventoryB.getStockId() ==null){

        	// ===== 棚卸による在庫追加 =====

			// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana Start

			if (tInventoryB_A == null) {

				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
			}

			if ("1".equals(tInventoryB_A.getStockAdjustFlg())) {
				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
			}

			// ロットID設定
			if (tInventoryB_A.getLotId() == null) {

				// ロット検索
				TLot lot = selectLot(tInventoryB_A.getProductId(), tInventoryB_A.getLot(), tInventoryB_A.getLimitDt());

				if (lot != null) {
					tInventoryB_A.setLotId(lot.getLotId());
					tInventoryB_A.setTLot(lot);
				}
			}

			// パラメータマスタ取得
			MClientCenter conditionEntity = new MClientCenter();
			conditionEntity.setClientId(tInventoryB_A.getMProduct().getClientId());
			conditionEntity.setCenterId(tInventoryB_A.getMLocation().getCenterId());
			MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);
			MParam param = paramLogic.getUkEntityWithDeletedCheck(entity);

			String storeLabelNo = tInventoryB_A.chaseTStoreNo().getStoreLabelNo();
			if (storeLabelNo != null) {
				// 入庫ラベルNo.の設定あり

				// 入庫ラベルNo.チェック
				checkStoreLabelNo(storeLabelNo, tInventoryB_A, param, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}

				// 在庫存在チェック
				TStock stock = stockSelectLogic.selectByStoreNoAndLocation(tInventoryB_A.getStoreNoId(), tInventoryB_A.getLocationId(), errSts);
				if (stock != null && existsStockNum(stock)) {
					//既に存在する入庫ラベルNoです。
					this.getErrorManager().add(errSts, WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STORE_NO_EXISTS_ERROR);
					return null;
				}
			}

			if (tInventoryB_A.getLotId() != null) {
				// ロット登録あり  (ロットの登録がない場合は在庫は存在しない)

				// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana Start
				// 在庫をマージするかを判定
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
				CDef.StoreNoMergeFlg mergeFlg = stockUpdateCheckLogic.onsNumMergeCheck(param, tInventoryB_A.getMProduct(), tInventoryB_A.getMLocation());
				if (mergeFlg == CDef.StoreNoMergeFlg.$1) {
					// 在庫をマージする

					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
					// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana End

					// マージ先の在庫存在チェック
					StockSelectLotCondition.Builder lotCondition = StockSelectLotCondition.builder()
							.clientId(tInventoryB_A.getMProduct().getClientId())
							.productId(tInventoryB_A.getProductId())
							.stockTypeId(tInventoryB_A.getStockTypeId())
							.locationId(tInventoryB_A.getLocationId())
							.depositId(tInventoryB_A.getDepositId())
							.lotId(tInventoryB_A.getLotId())
							.shapeId(tInventoryB_A.getShapeId())
							.selectMerge(true);

					if (param.isStoreDtFlg$1()) {
						// 入庫日管理あり

						lotCondition.storeDt(tInventoryB_A.getStoreDt());
					}

					List<TStock> stockList = stockSelectLogic.selectListByLot(lotCondition.build());

					if (0 < stockList.size()) {
						// 在庫が存在する場合はエラー

						this.getErrorManager().add(errSts, WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR);
						return null;
					}
				}
			}

			//荷主
			result.setClientId(tInventoryB_A.getMProduct().getClientId());
			result.setMClient(tInventoryB_A.getMProduct().getMClient());

			//センタ
			result.setMLocation(tInventoryB_A.getMLocation());
			if (tInventoryB_A.getMLocation() != null) {
				result.getMLocation().setCenterId(tInventoryB_A.getMLocation().getCenterId());
				result.getMLocation().setMCenter(tInventoryB_A.getMLocation().getMCenter());
			}

			//倉庫
			result.setWarehouseId(tInventoryB_A.getWarehouseId());
			result.setMWarehouse(tInventoryB_A.getMWarehouse());

			//商品
			result.setProductId(tInventoryB_A.getProductId());
			result.setMProduct(tInventoryB_A.getMProduct());

			//預託在庫区分
			result.setDepositId(tInventoryB_A.getDepositId());
			result.setMCustomer(tInventoryB_A.getMCustomerByDepositId());

			//在庫区分
			result.setStockTypeId(tInventoryB_A.getStockId());
			result.setMStockType(tInventoryB_A.getMStockType());

			//ロケーション
			result.setLocationId(tInventoryB_A.getLocationId());
			result.setMLocation(tInventoryB_A.getMLocation());

			//ロット
			if (tInventoryB_A.getTLot() == null) {
				result.setTLot(new TLot());
				result.getTLot().setLimitDt(tInventoryB_A.getLimitDt());
				result.getTLot().setLot(tInventoryB_A.getLot());
			} else {
				result.setTLot(tInventoryB_A.getTLot());
			}

			//入庫ラベルNo.
			result.setStoreNoId(tInventoryB_A.getStoreNoId());
			result.setTStoreNo(tInventoryB_A.getTStoreNo());

			//仕入先コード、元入庫ラベルNo.
			if (tInventoryB_A.getTStoreNo() == null) {
				result.setTStoreNo(new TStoreNo());
				result.getTStoreNo().setMCustomer(tInventoryB_A.getMCustomerBySupplierId());
			} else {
				result.getTStoreNo().setMCustomer(tInventoryB_A.getTStoreNo().getMCustomer());
				result.getTStoreNo().setTStoreNoSelf(tInventoryB_A.getTStoreNo().getTStoreNoSelf());
			}

			// [エンハンス PH2.0] 入庫日を追加する 2015.12.08 sja Start
			// 入庫日
			result.getTStoreNo().setStoreDt(tInventoryB_A.getStoreDt());
			// [エンハンス PH2.0] 入庫日を追加する 2015.12.08 sja End

			//元入庫ラベルNo.
			//if(tInventoryB_A.getTStoreNo() != null){
			//	result.getTStoreNo().setTStoreNoSelf(tInventoryB_A.getTStoreNo().getTStoreNoSelf());
			//}

			//荷姿
			result.setShapeId(tInventoryB_A.getShapeId());
			result.setMShape(tInventoryB_A.getMShape());

			//引当可能数 ＜ 棚卸数
			if (WCC.isLessThan(tInventoryB_A.getChargeNum(), tInventoryB_A.getInventoryNum())) {
				result.setChargeNum(WCC.ZERO);
				result.setChargeNum_A(WCC.subtract(tInventoryB_A.getInventoryNum(), tInventoryB_A.getChargeNum()));
				result.setAdjNum(WCC.subtract(tInventoryB_A.getInventoryNum(), tInventoryB_A.getChargeNum()));
				result.setProcessTypeCd("24");
				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
				// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja Start
				// 入数の設定値
				MProductShape productShape = new MProductShape();
				productShape.setClientId(result.getClientId());
				productShape.setCenterId(result.getMWarehouse().getCenterId());
				productShape.setProductId(result.getProductId());
				productShape.setCaseFlg("1");
				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
				// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja End
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				tStockBhv.load(result, new ReferrerLoaderHandler<LoaderOfTStock>() {
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
			}

			return result;

			// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana End

        }else if (tInventoryB == null || (tInventoryB.getInventoryBId() == null && tInventoryB.getStockId() ==null)){

        	// ===== 新規在庫追加 =====

			// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana Start

			// ロットID設定
			if (tStock.getLotId() == null) {

				// ロット検索
				TLot lot = selectLot(tStock.getProductId(), tStock.getTLot().getLot(), tStock.getTLot().getLimitDt());

				if (lot != null) {
					tStock.setLotId(lot.getLotId());
					tStock.setTLot(lot);
				}
			}

			// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana End


        	// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei Start
    		//在庫調整(新規)の在庫調整
			//パラメータマスタ.入庫No.マージ区分の取得
			MClientCenter conditionEntity = new MClientCenter();
			conditionEntity.setClientId(tStock.getClientId());
			conditionEntity.setCenterId(tStock.getMLocation().getCenterId());
			MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);
			MParam paramEntity = paramLogic.getUkEntityWithDeletedCheck(entity);

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			tStockBhv.load(tStock, new ReferrerLoaderHandler<LoaderOfTStock>() {
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

			// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana Start

			// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana Start
			// 在庫をマージするかを判定
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.StoreNoMergeFlg mergeFlg = stockUpdateCheckLogic.onsNumMergeCheck(paramEntity, tStock.getMProduct(), tStock.getMLocation());
			// [Ver3.0] unit of measure対応 2017.11.27 ライ START
			MProductShape mProductShape = new MProductShape();
			mProductShape.setProductId(tStock.getProductId());
			mProductShape.setClientId(tStock.getClientId());
			mProductShape.setCenterId(tStock.getMLocation().getCenterId());
			mProductShape.setPieceFlg("1");
			mProductShape = productShapeLogic.getMProductShape(mProductShape);
			// [Ver3.0] unit of measure対応 2017.11.27 ライ END
			if (mergeFlg == CDef.StoreNoMergeFlg.$1) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana End

				// マージする場合、マージ先在庫の存在チェック (存在する場合は新規追加不可)

				// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana Start

				if (tStock.getLotId() != null) {
					// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana End

					// ロット登録有り (ロットの登録がない場合は在庫は存在しないので在庫検索不要)

					// マージ先在庫検索
					StockSelectLotCondition.Builder lotCondition = StockSelectLotCondition.builder()
							.clientId(tStock.getClientId())
							.productId(tStock.getProductId())
							.stockTypeId(tStock.getStockTypeId())
							.locationId(tStock.getLocationId())
							.depositId(tStock.getDepositId())
				// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana Start
							.lotId(tStock.getLotId())
				// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana End
				// [Ver3.0] unit of measure対応 2017.11.27 ライ START
							.shapeId(mProductShape.chaseMShapeGrpDtl().getShapeId())
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END
							.selectMerge(true);

					if (paramEntity.isStoreDtFlg$1()) {
						// 入庫日管理あり

						lotCondition.storeDt(tStock.getTStoreNo().getStoreDt());
					}

					List<TStock> stockList = stockSelectLogic.selectListByLot(lotCondition.build());

					if (0 < stockList.size()) {
						// 在庫が存在する場合はエラー

						this.getErrorManager().add(errSts, WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR);
						return tStock;
					}
				}
			}

			// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana End

			//入庫ラベルNo.入力あり場合、入庫ラベルNoが存在するかどうかチェック
			if(tStock.getTStoreNo() != null){

				// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana Start
				final String storeLabelNo = tStock.getTStoreNo().getStoreLabelNo();
				if (storeLabelNo != null) {

					// 入庫ラベルNo.チェック
					checkStoreLabelNo(storeLabelNo, tStock, paramEntity, errSts);
					if (0 < getErrorManager().size()) {
						return null;
					}
					// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana End

					// ===== 検索条件の設定 =====
					TStockCB cbCheck = tStockBhv.newMyConditionBean();
					cbCheck.setupSelect_MProduct();
					cbCheck.setupSelect_MLocation();
					cbCheck.setupSelect_MLocation().withMCenter();
					cbCheck.setupSelect_MCustomer();
					cbCheck.setupSelect_TStoreNo();
					cbCheck.setupSelect_TStoreNo().withMCustomer();
					cbCheck.setupSelect_MStockType();
					cbCheck.setupSelect_TLot();
					cbCheck.setupSelect_TStoreNo().withTStoreNoSelf();
					cbCheck.setupSelect_MClient();
					cbCheck.setupSelect_MShape();
					cbCheck.setupSelect_MWarehouse();

			        // ===== 商品荷姿マスタの荷姿ID最大値 =====
					// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL

			        // ===== 商品荷姿マスタの商品ID最大値 =====
					cbCheck.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
						public void query(MProductShapeCB subCB) {
							subCB.specify().columnProductId();
							setDelFlg(subCB);
						}
			        }, TStock.ALIAS_maxProductId);

					cbCheck.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
					// 引当可能数
					cbCheck.orScopeQuery(new OrQuery<TStockCB>() {
						public void query(TStockCB orCB) {
							//引当可能数
							orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
							//引当済数
							orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
							//移動中数
							orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
						}
					});
			        // ===== 検索実行 =====
					List<TStock>  tCheckList = tStockBhv .selectList(cbCheck);
					if(tCheckList.size() != 0){
						//既に存在する入庫ラベルNoです。
						this.getErrorManager().add(errSts, WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STORE_NO_EXISTS_ERROR);
						return tStock;
					}
				}
			}
    		// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei End

        	// ===== tInventoryB．在庫IDがnullかつtInventoryB．棚卸ボディIDがnull場合、以下条件を追加 =====
        	cb.query().setStockId_Equal(tStock.getStockId());
        	cb.query().setClientId_Equal(tStock.getClientId());
        	cb.query().setLocationId_Equal(tStock.getLocationId());
        	cb.query().queryMLocation().setCenterId_Equal(tStock.getMLocation().getCenterId());
        	cb.query().setWarehouseId_Equal(tStock.getWarehouseId());
        	cb.query().setProductId_Equal(tStock.getProductId());
        	cb.query().setDepositId_Equal(tStock.getDepositId());

        	cb.query().setStockTypeId_Equal(tStock.getStockTypeId());

    		// [ON推-品向-447] ロットの検索条件間違いを修正 2014.12.17 kawana Start
			if (tLot == null) {
				cb.query().queryTLot().setLot_IsNull();
				cb.query().queryTLot().setLimitDt_IsNull();
			} else {

				// ロット
				if (tLot.getLot() == null) {
					cb.query().queryTLot().setLot_IsNull();
				} else {
					cb.query().queryTLot().setLot_Equal(tLot.getLot());
				}

				// 期限日
				if (tLot.getLimitDt() == null) {
					cb.query().queryTLot().setLimitDt_IsNull();
				} else {
					cb.query().queryTLot().setLimitDt_Equal(tLot.getLimitDt());
				}
			}
    		// [ON推-品向-447] ロットの検索条件間違いを修正 2014.12.17 kawana End

        	if(mCustomer != null){
        		cb.query().queryMCustomer().setCustomerId_Equal(mCustomer.getCustomerId());
        	}
        	if(tStoreNo != null){

//        		if(tStoreNo.getStoreNoId() == null){
        		if(tStoreNo.getStoreLabelNo() == null){
        			cb.query().queryTStoreNo().setStoreNoId_IsNull();
        		}else{
        			cb.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
        		}
        	}

        	//cb.query().queryTStoreNo().queryMCustomer().setCustomerId_Equal(tStock.getTStoreNo().getMCustomer().getCustomerId());
        	cb.query().setShapeId_Equal(tStock.getShapeId());

        	// 引当可能数
			cb.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCB) {
					//引当可能数
					orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
					//引当済数
					orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
					//移動中数
					orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				}
			});
        }

        // ===== 検索実行 =====

		List<TStock>  tStockList = tStockBhv .selectList(cb);

		// =====リターンの在庫件数＝0の場合 =====
		if (tStockList.size() == 0) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== リターンの在庫件数が1件以上の場合 =====
		if (tStockList.size() > 1) {
			//this.getErrorManager().add(errSts, WmsMessageConst.DATA_PLURAL_FOUND_ERROR);
			//return null;
		}
		// [#2799][Ver3.0] unit of measure 対応 2017.12.05 Add Start
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
		// [#2799][Ver3.0] unit of measure 対応 2017.12.05 Add Start
		result = tStockList .get(0);

		if(tStoreNo != null){
			//result.setStockId(tStoreNo.getStoreNoId());
			result.setStoreNoId(tStoreNo.getStoreNoId());
		}

		// ===== tInventoryB．棚卸ボディIDがnull以外の場合、 =====
		if (tInventoryB != null && tInventoryB.getInventoryBId() != null){

			if(tInventoryB_A.getStoreNoId() != null){

				// [#1073] 在庫数 0 のデータを棚卸入力画面から在庫調整するとエラー発生 2017.03.07 kawana Start

				// 入庫No.の在庫情報が一致しているかをチェック

				TStockCB cbChk = tStockBhv.newMyConditionBean();
				cbChk.query().setStoreNoId_Equal(tInventoryB_A.getStoreNoId());
				cbChk.fetchFirst(1);

				TStock stockChk = tStockBhv.selectEntityWithDeletedCheck(cbChk);

				if (!stockChk.getProductId().equals(tInventoryB_A.getProductId()) ||
						!stockChk.getStockTypeId().equals(tInventoryB_A.getStockTypeId()) ||
						!stockChk.getDepositId().equals(tInventoryB_A.getDepositId()) ||
						!stockChk.getLotId().equals(tInventoryB_A.getLotId())) {
					this.getErrorManager().add(errSts, WmsMessageConst.STORE_ITEM_UNMATCH_ERROR);
					return null;
				}

				// [#1073] 在庫数 0 のデータを棚卸入力画面から在庫調整するとエラー発生 2017.03.07 kawana End
			}

			//引当可能数 ＜ 棚卸数
			if(WCC.isLessEqual(result.getChargeNum(), tInventoryB_A.getInventoryNum())){

				result.setChargeNum_A(tInventoryB_A.getInventoryNum());
				result.setAdjNum(WCC.subtract(tInventoryB_A.getInventoryNum(), result.getChargeNum()));
				result.setProcessTypeCd("24");
			}else if(WCC.isGreaterThan(result.getChargeNum(), tInventoryB_A.getInventoryNum())){
				result.setChargeNum_A(tInventoryB_A.getInventoryNum());
				result.setAdjNum(WCC.subtract(result.getChargeNum(), tInventoryB_A.getInventoryNum()));
				result.setProcessTypeCd("23");
			}
		}

		// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja Start
		// 入数の設定値

		MProductShape productShape = new MProductShape();
		productShape.setClientId(result.getClientId());
		productShape.setCenterId(result.getMWarehouse().getCenterId());
		productShape.setProductId(result.getProductId());
		productShape.setCaseFlg("1");
		// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja End

		// [Ver3.0] unit of measure対応 2017.10.20 ライ Start

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
    	// [Ver3.0] unit of measure対応 2017.10.20 ライ END
		return result;
	}

	// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana Start
	// [ON推-品向-534] 既存の入庫ラベルNo.チェックを追加 2014.12.16 kawana Start

	/**
	 * ロットテーブル検索
	 */
	private TLot selectLot(long productId, String lot, String limitDt) {

		// ロット検索
		TLot cb = new TLot();
		cb.setProductId(productId);
		cb.setLot(lot);
		cb.setLimitDt(limitDt);

		TLot tLot = lotLogic.getUkEntity(cb);
		return tLot;
	}

	/**
	 * 入庫ラベルNo.不正チェック
	 */
	private void checkStoreLabelNo(String storeLabelNo, TInventoryB inveontoryB, MParam param, ErrorStatus errSts) {

		TStock checkStock = new TStock();
		checkStock.setClientId(inveontoryB.getMProduct().getClientId());
		checkStock.setProductId(inveontoryB.getProductId());
		checkStock.setStockTypeId(inveontoryB.getStockTypeId());
		checkStock.setDepositId(inveontoryB.getDepositId());
		checkStock.setLotId(inveontoryB.getLotId());
		checkStock.setLocationId(inveontoryB.getLocationId());
		TStoreNo checkStoreNo = new TStoreNo();
		checkStoreNo.setSupplierId(inveontoryB.getSupplierId());
		checkStoreNo.setStoreDt(inveontoryB.getStoreDt());
		checkStock.setTStoreNo(checkStoreNo);

		checkStoreLabelNo(storeLabelNo, checkStock, param, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * 入庫ラベルNo.不正チェック
	 */
	private void checkStoreLabelNo(String storeLabelNo, TStock checkStock, MParam param, ErrorStatus errSts) {

		stockUpdateCheckLogic.checkStoreLabelNo(storeLabelNo, checkStock, param.getStoreDtFlgAsStoreDtFlg(), errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	// [ON推-品向-534] 既存の入庫ラベルNo.チェックを追加 2014.12.16 kawana End

	/**
	 * 在庫存在チェック
	 */
	private boolean existsStockNum(TStock stock) {

		if (WCC.isPositive(CU.nullToZero(stock.getChargeNum()))) {
			return true;
		}

		if (WCC.isPositive(CU.nullToZero(stock.getAllocNum()))) {
			return true;
		}

		if (WCC.isPositive(CU.nullToZero(stock.getMoveNum()))) {
			return true;
		}

		return false;
	}

	// [#4285] 入庫ラベル指定での行追加で致命的エラー発生 2018.04.13 kawana End
}
