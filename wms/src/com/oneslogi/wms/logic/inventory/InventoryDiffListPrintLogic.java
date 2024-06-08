package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTInventoryB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 棚卸差異リスト発行ロジッククラス
 */
public class InventoryDiffListPrintLogic extends AbstractWmsLogic {

	//ON推-CT4-115 SJA-ZHENG UPD 2014/11/20 S

	/** プラス/マイナス区分:0 */
	private static final Long PLUS_MINUS_TYPE_ZERO = 0L;
	/** プラス/マイナス区分:1 */
	private static final Long PLUS_MINUS_TYPE_POSITIVE = 1L;
	/** プラス/マイナス区分:-1 */
	private static final Long PLUS_MINUS_TYPE_NEGATIVE = -1L;
	//ON推-CT4-115 SJA-ZHENG UPD 2014/11/20 E

	// ===== 使用テーブル =====
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	// [Ver3.0] unit of measure対応 2017.12.01 REN Del
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	/**
	 * <h2>棚卸差異リストデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースから棚卸差異リスト発行データを取得する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：ロケーションCD(From)・ロケーションCD(To)・ピース以上数・ケース以上数・差異比較条件（ロケーション単位の差異or商品単位の差異）
	 * @param tInventoryB 棚卸ボディ：倉庫ID・預託ID・在庫区分ID・商品ID・引当可能数・棚卸数・ケース入数
	 * @param zoneIdList ゾーンマスタリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TInventoryB> 棚卸ボディリスト
	 */
	// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
	public List<TInventoryB> select(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst,List<Long> zoneIdList,  ErrorStatus errSts) {
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		// ===== 初期処理 =====
		List<TInventoryB> result = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// ===== 棚卸差異リストデータ取得 =====
		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.setupSelect_TInventoryH();
		cb.setupSelect_TInventoryH().withMClient();
		cb.setupSelect_TInventoryH().withMCenter();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation();
		cb.setupSelect_MLocation().withMZone();
		cb.setupSelect_MProduct();
		cb.setupSelect_TStoreNo();
		cb.setupSelect_TLot();
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		cb.setupSelect_MCustomerByDepositId();
		// 商品荷姿．入数
		cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			@Override
			public void query(MProductShapeCB SubCB) {
				SubCB.specify().columnUnitNum();
				setDelFlg(SubCB);
			}
		}, TInventoryB.SHAPE_UnitNum );
		// 棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		// 荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		// センタID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		// 倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		// 預託ID
		cb.query().setDepositId_Equal(tInventoryB.getDepositId());
		// 在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryB.getStockTypeId());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// ゾーンID
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End
		// 商品ID
		cb.query().setProductId_Equal(tInventoryB.getProductId());
		// ソート条件
		cb.query().queryTInventoryH().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		/*cb.query().queryTInventoryH().addOrderBy_InventoryDt_Asc();*/
		cb.query().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		cb.query().queryMCustomerByDepositId().addOrderBy_CustomerCd_Asc();
		cb.query().queryTLot().addOrderBy_Lot_Asc();
		cb.query().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStoreNo().addOrderBy_StoreNoId_Asc();



		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// 検索実行
		result = selectListToReport(tInventoryBBhv, cb);
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// [エンハンス PH2.0] 入数の設定値を変更 2015.12.10 sja Start
		for(TInventoryB inventoryB : result){
			MProductShape mProductShape = new MProductShape();
			mProductShape.setProductId(inventoryB.getMProduct().getProductId());
			mProductShape.setClientId(tInventoryH.getClientId());
			mProductShape.setCenterId(tInventoryH.getCenterId());
			mProductShape.setCaseFlg("1");
			// [Ver3.0] unit of measure対応 2017.12.01 REN Del
		}
		// [エンハンス PH2.0] 入数の設定値を変更 2015.12.10 sja End

		result = getListEditor(result, tInventoryInst);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// [Ver3.0] unit of measure対応 2017.11.29 REN Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tInventoryBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTInventoryB>() {
			@Override
			public void handle(LoaderOfTInventoryB loader) {
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

		for (TInventoryB inventoryB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, inventoryB.getMProduct());
			//入数
			inventoryB.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, inventoryB.getMProduct()));
			//在庫内訳
			inventoryB.setStockBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, inventoryB.getChargeNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap, inventoryB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//棚卸内訳
			inventoryB.setInventoryBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, inventoryB.getInventoryNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap, inventoryB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			inventoryB.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, inventoryB.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.29 REN End

		return result;
	}
	/**
	 * 検索結果リストのデータを編集
	 * @param list 棚卸ボディリスト
	 * @param tInventoryInst 棚卸指示
	 * @return List<TInventoryB> 棚卸ボディリスト
	 */
	private List<TInventoryB> getListEditor(List<TInventoryB> list, TInventoryInst tInventoryInst) {
		List<TInventoryB> result = new ArrayList<TInventoryB>();

		// [ON推-品向-563] 1行の場合と複数行の場合で差異数が違う問題を修正(1行用の処理を削除) 2015.07.10 kawana

		// 商品単位またはロケーション単位に商品数を合計する
		List<TInventoryB> newList = getNumSum(list, tInventoryInst);

		int i = 0;

		//[#3725][Ver3.0]比較条件差異の状態毎に処理を分岐するよう修正 2018.02.16 Miyabe upd Start
		Map<Long, BigDecimal> totalInventoryMap = new HashMap<>();
		Map<Long, BigDecimal> totalChargeMap = new HashMap<>();
		// 比較条件差異が『0』(商品単位)の時、商品単位の引当可能数と棚卸数を計算
		if(tInventoryInst.getInventoryLocationProduct().equals("0")){
			for(TInventoryB tInventoryB :newList) {
				Long productId = tInventoryB.getProductId();
				if(!totalInventoryMap.containsKey(productId)){
					totalInventoryMap.put(productId, tInventoryB.getInventoryNum());
				} else {
					totalInventoryMap.put(productId, WCC.add(totalInventoryMap.get(productId), tInventoryB.getInventoryNum()));
				}
				if(!totalChargeMap.containsKey(productId)){
					totalChargeMap.put(productId, tInventoryB.getChargeNum());
				} else {
					totalChargeMap.put(productId, WCC.add(totalChargeMap.get(productId), tInventoryB.getChargeNum()));
				}
			}
		}

		for(TInventoryB tInventoryB :newList) {
			// 差異数の設定
			tInventoryB.setNumDiff(WCC.subtract(tInventoryB.getInventoryNum(), tInventoryB.getChargeNum()));
			//ON推-CT4-115 SJA-ZHENG UPD 2014/11/20 S
			// プラス/マイナス区分の設定
			if (WCC.isPositive(tInventoryB.getNumDiff())) {
				tInventoryB.setPlusMinusType(PLUS_MINUS_TYPE_POSITIVE);
			} else if (WCC.isZero(tInventoryB.getNumDiff())) {
				tInventoryB.setPlusMinusType(PLUS_MINUS_TYPE_ZERO);
			} else {
				tInventoryB.setPlusMinusType(PLUS_MINUS_TYPE_NEGATIVE);
			}
			//ON推-CT4-115 SJA-ZHENG UPD 2014/11/20 E
			// 差異数ソートの設定
			tInventoryB.setNumDiffSort(tInventoryB.getNumDiff().abs());
			newList.set(i, tInventoryB);
			i++;
		}
		// [Ver3.0] unit of measure対応 2017.11.29 REN Start
		// 差異数(以上)が指定されている場合
		if (tInventoryInst.getDiffQtyUp() != null && WCC.isPositive(tInventoryInst.getDiffQtyUp())) {
			i = 0;
			//[#3725][Ver3.0]商品毎、ロケーション毎のサマリを正確に行うよう修正 2018.02.27 Miyabe upd Start
			Map<String, BigDecimal> locationTotalInventoryMap = new HashMap<>();
			Map<String, BigDecimal> locationTotalChargeMap = new HashMap<>();
			// 比較条件差異が『1』(ロケーション単位)の時
			// ロケーションごとに棚卸数、引当可能数をサマリしたMapを作成
			if(tInventoryInst.getInventoryLocationProduct().equals("1")){
				for (TInventoryB tInventoryB : newList) {
					String stringLocationId = tInventoryB.getLocationId().toString();
					String stringProductId = tInventoryB.getProductId().toString();
					StringBuilder mapKey = new StringBuilder();
					mapKey.append(stringLocationId).append(",").append(stringProductId);
					String stringMapKey = mapKey.toString();
					if(!locationTotalInventoryMap.containsKey(stringMapKey)){
						locationTotalInventoryMap.put(stringMapKey, tInventoryB.getInventoryNum());
					}else{
						locationTotalInventoryMap.put(stringMapKey, WCC.add(locationTotalInventoryMap.get(stringMapKey), tInventoryB.getInventoryNum()));
					}
					if(!locationTotalChargeMap.containsKey(stringMapKey)){
						locationTotalChargeMap.put(stringMapKey, tInventoryB.getChargeNum());
					}else{
						locationTotalChargeMap.put(stringMapKey, WCC.add(locationTotalChargeMap.get(stringMapKey), tInventoryB.getChargeNum()));
					}
				}
			}

			for(TInventoryB tInventoryB :newList) {
				BigDecimal totalQtyDiff = WCC.ZERO;
				// 比較条件差異が『0』(商品単位)の時
				if(tInventoryInst.getInventoryLocationProduct().equals("0")){
					Long productId = tInventoryB.getProductId();
					totalQtyDiff =  WCC.subtract(totalChargeMap.get(productId), totalInventoryMap.get(productId));
				} else if(tInventoryInst.getInventoryLocationProduct().equals("1")){
					// 比較条件差異が『1』(ロケーション単位)の時
					String stringLocationId = tInventoryB.getLocationId().toString();
					String stringProductId = tInventoryB.getProductId().toString();
					StringBuilder mapKey = new StringBuilder();
					mapKey.append(stringLocationId).append(",").append(stringProductId);
					String stringMapKey = mapKey.toString();
					totalQtyDiff =  WCC.subtract(locationTotalChargeMap.get(stringMapKey), locationTotalInventoryMap.get(stringMapKey));
				}

				if(WCC.isLessThan(totalQtyDiff, 0)){
					totalQtyDiff = WCC.multiply(totalQtyDiff, -1);
				}
				if(WCC.isLessEqual(tInventoryInst.getDiffQtyUp(),  totalQtyDiff)) {
					result.add(i, tInventoryB);
					i++;
				}
			}
			//[#3725][Ver3.0]商品毎、ロケーション毎のサマリを正確に行うよう修正 2018.02.27 Miyabe upd End

			//[#3725][Ver3.0]比較条件差異の状態毎に処理を分岐するよう修正 2018.02.16 Miyabe upd End
			// [Ver3.0] unit of measure対応 2017.11.29 REN End
			// [Ver3.0] unit of measure対応 2017.11.29 REN Del
		} else {
			i = 0;
			for(TInventoryB tInventoryB :newList) {
				Long productId = tInventoryB.getProductId();
				// [ON推-CT4-250] ロケーション単位の差異で差異が無い行は印字されない仕様です。 2014.11.28 SJA-ZHENG Start
				if(WCC.ZERO.compareTo(WCC.subtract(tInventoryB.getChargeNumSum(), tInventoryB.getInventoryNumSum()).abs()) != 0
						&& WCC.ZERO.compareTo(tInventoryB.getNumDiff().abs()) != 0){
					// 比較条件差異が『0』(商品単位)かつ差異が存在する場合
					if(tInventoryInst.getInventoryLocationProduct().equals("0")
							&& WCC.subtract(totalChargeMap.get(productId), totalInventoryMap.get(productId)).compareTo(WCC.ZERO) != 0 ){
						result.add(i, tInventoryB);
						i++;
						// 比較条件差異が『1』(ロケーション単位)の時
					} else if(tInventoryInst.getInventoryLocationProduct().equals("1")){
						result.add(i, tInventoryB);
						i++;
					}
				}
				// [ON推-CT4-250] ロケーション単位の差異で差異が無い行は印字されない仕様です。 2014.11.28 SJA-ZHENG End
			}
		}
		return getTInventoryB(result);
	}

	private List<TInventoryB> getNumSum(List<TInventoryB> list, TInventoryInst tInventoryInst) {
		List<TInventoryB> tInventoryBList = list;
		List<TInventoryB> result = null;

		// [ON推-品向-563] 1行の場合と複数行の場合で差異数が違う問題を修正 2015.07.10 kawana Start
		// 商品単位の場合
		if ("0".equals(tInventoryInst.getInventoryLocationProduct())) {

			// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana Start
			// 商品単位合計計算
			setProductNumSum(tInventoryBList, NumSum.SetField.SUM);
			// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana End

			// ロケーション単位の場合
		} else if ("1".equals(tInventoryInst.getInventoryLocationProduct())) {

			// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana Start
			// ロケーション単位合計計算
			setLocationNumSum(tInventoryBList, NumSum.SetField.SUM);

			// 商品単位合計計算
			setProductNumSum(tInventoryBList, NumSum.SetField.PRODUCT_SUM);
			// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana End
		}
		// [ON推-品向-563] 1行の場合と複数行の場合で差異数が違う問題を修正 2015.07.10 kawana End

		// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete

		result = tInventoryBList;
		return result;
	}

	// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana Start

	// [ON推-品向-563] 1行の場合と複数行の場合で差異数が違う問題を修正 2015.07.10 kawana Start
	/**
	 * 引当可能数、棚卸数を商品単位に合計する
	 */
	private void setProductNumSum(List<TInventoryB> tInventoryBList, NumSum.SetField setField) {

		// ===== 合計を加算してく =====

		Map<ProductNumSumKey, NumSum> productNumSumMap = new HashMap<ProductNumSumKey, NumSum>();
		for (TInventoryB inventoryB : tInventoryBList) {

			// [ON推-品向-1041] 合計のキーに預託を追加 2016.04.28 kawana Start
			long depositId = inventoryB.getDepositId();
			// [ON推-品向-1041] 合計のキーに預託を追加 2016.04.28 kawana End
			long stockTypeId = inventoryB.getStockTypeId();
			long productId = inventoryB.getProductId();

			ProductNumSumKey key = new ProductNumSumKey(depositId, stockTypeId, productId);

			NumSum sumClass;
			if (productNumSumMap.containsKey(key)) {

				sumClass = productNumSumMap.get(key);
			} else {

				sumClass = new NumSum();
				productNumSumMap.put(key, sumClass);
			}

			sumClass.add(inventoryB);
		}

		// ===== 合計を対象フィールドに設定 =====

		for (NumSum sumClss : productNumSumMap.values()) {

			sumClss.setTotalNum(setField);
		}
	}

	// [ON推-品向-563] 1行の場合と複数行の場合で差異数が違う問題を修正 2015.07.10 kawana End

	/**
	 * 引当可能数、棚卸数をロケーション単位に合計する
	 */
	private void setLocationNumSum(List<TInventoryB> tInventoryBList, NumSum.SetField setField) {

		// ===== 合計を加算してく =====

		Map<LocationNumSumKey, NumSum> numSumMap = new HashMap<LocationNumSumKey, NumSum>();
		for (TInventoryB inventoryB : tInventoryBList) {

			long depositId = inventoryB.getDepositId();
			long stockTypeId = inventoryB.getStockTypeId();
			long locationId = inventoryB.getLocationId();
			long productId = inventoryB.getProductId();

			LocationNumSumKey key = new LocationNumSumKey(depositId, stockTypeId, locationId, productId);

			NumSum sumClass;
			if (numSumMap.containsKey(key)) {

				sumClass = numSumMap.get(key);
			} else {

				sumClass = new NumSum();
				numSumMap.put(key, sumClass);
			}

			sumClass.add(inventoryB);
		}

		// ===== 合計を対象フィールドに設定 =====

		for (NumSum sumClss : numSumMap.values()) {

			sumClss.setTotalNum(setField);
		}
	}

	// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana End

	/**
	 * ターンの棚卸ボディリストのソート編集
	 * @param List<TInventoryB> 棚卸ボディリスト
	 * @return List<TInventoryB> 棚卸ボディリスト
	 */
	private List<TInventoryB> getTInventoryB(List<TInventoryB> tInventoryB) {
		Collections.sort(tInventoryB, new Comparator<TInventoryB>() {
			public int compare(TInventoryB arg0, TInventoryB arg1) {
				// [ON推-品向-450] ソートの場合、nullでエラーが発生。 2014.12.18 KI Start
				Long TStoreNo0 = 0L;
				Long TStoreNo1 = 0L;

				String Lot0 = "";
				String Lot1 = "";
				String LimitDt0 = "";
				String LimitDt1 = "";

				if (arg0.getTStoreNo() != null){
					TStoreNo0 = arg0.getTStoreNo().getStoreNoId();
				}else{
					TStoreNo0 = 99999999999L ;
				}
				if (arg1.getTStoreNo() != null){
					TStoreNo1 = arg1.getTStoreNo().getStoreNoId();
				}else{
					TStoreNo1 = 99999999999L ;
				}

				if (arg0.getTLot() != null){
					Lot0 = arg0.getTLot().getLot();
					LimitDt0 = arg0.getTLot().getLimitDt();
				}else{
					Lot0 = arg0.getLot() ;
					LimitDt0 = arg0.getLimitDt();
				}
				if (arg1.getTLot() != null){
					Lot1 = arg1.getTLot().getLot();
					LimitDt1 = arg1.getTLot().getLimitDt();
				}else{
					Lot1 = arg1.getLot() ;
					LimitDt1 = arg1.getLimitDt();
				}

				// [#1153] ロット、期限日がnullの場合に致命的エラー発生 2017.03.09 kawana Start
				Lot0 = CU.nullToStr(Lot0);
				Lot1 = CU.nullToStr(Lot1);
				LimitDt0 = CU.nullToStr(LimitDt0);
				LimitDt1 = CU.nullToStr(LimitDt1);
				// [#1153] ロット、期限日がnullの場合に致命的エラー発生 2017.03.09 kawana End

				// [ON推-品向-450] ソートの場合、nullでエラーが発生。 2014.12.18 KI End
				//荷主
				if (arg0.getTInventoryH().getMClient().getClientCd().compareTo(arg1.getTInventoryH().getMClient().getClientCd()) == 0) {
					//センタ
					if(arg0.getTInventoryH().getMCenter().getCenterCd().compareTo(arg1.getTInventoryH().getMCenter().getCenterCd()) == 0){
						//倉庫
						if (arg0.getMWarehouse().getWarehouseCd().compareTo(arg1.getMWarehouse().getWarehouseCd()) == 0) {
							//ゾーンMピッキング順序
							if (arg0.getMLocation().getMZone().getPickingOrder().compareTo(arg1.getMLocation().getMZone().getPickingOrder()) == 0){
								//ロケMピッキング順序
								if(arg0.getMLocation().getPickingOrder().compareTo(arg1.getMLocation().getPickingOrder())== 0){
									//ゾーンCD
									if (arg0.getMLocation().getMZone().getZoneCd().compareTo(arg1.getMLocation().getMZone().getZoneCd()) == 0){
										//ロケCD
										if (arg0.getMLocation().getLocationCd().compareTo(arg1.getMLocation().getLocationCd()) == 0) {
											//商品CD
											if (arg0.getMProduct().getProductCd().compareTo(arg1.getMProduct().getProductCd()) == 0) {
												//在庫区分
												if (arg0.getMStockType().getStockTypeCd().compareTo(arg1.getMStockType().getStockTypeCd()) == 0) {
													//預託
													if (arg0.getMCustomerByDepositId().getCustomerCd().compareTo(arg1.getMCustomerByDepositId().getCustomerCd()) == 0) {
														//ロット
														if (Lot0.compareTo(Lot1) == 0) {
															//期限日
															if(LimitDt0.compareTo(LimitDt1) == 0){
																//在庫ラベルNo
																if (TStoreNo0.compareTo(TStoreNo1) == 0) {
																	//商品の差異数合計
																	if (arg1.getProductSort().compareTo(arg0.getProductSort()) == 0) {
																		//差異数絶対値（降順）
																		if (arg1.getPlusMinusType().compareTo(arg0.getPlusMinusType()) == 0) {
																			return arg1.getNumDiffSort().compareTo(arg0.getNumDiffSort());
																		}
																		//プラス/マイナス区分（降順）
																		else{
																			return arg1.getPlusMinusType().compareTo(arg0.getPlusMinusType());
																		}
																	}else{
																		return arg1.getProductSort().compareTo(arg0.getProductSort());
																	}
																}else{
																	return TStoreNo0.compareTo(TStoreNo1);
																}
															}else{
																return LimitDt0.compareTo(LimitDt1);
															}
														} else {
															return Lot0.compareTo(Lot1);
														}
													} else {
														return arg0.getMCustomerByDepositId().getCustomerCd().compareTo(arg1.getMCustomerByDepositId().getCustomerCd());
													}
												} else {
													return arg0.getMStockType().getStockTypeCd().compareTo(arg1.getMStockType().getStockTypeCd());
												}
											} else {
												return arg0.getMProduct().getProductCd().compareTo(arg1.getMProduct().getProductCd());
											}
										}else{
											return arg0.getMLocation().getLocationCd().compareTo(arg1.getMLocation().getLocationCd());
										}
									} else {
										return arg0.getMLocation().getMZone().getZoneCd().compareTo(arg1.getMLocation().getMZone().getZoneCd());
									}
								} else {
									return arg0.getMLocation().getPickingOrder().compareTo(arg1.getMLocation().getPickingOrder());
								}
							} else {
								return arg0.getMLocation().getMZone().getPickingOrder().compareTo(arg1.getMLocation().getMZone().getPickingOrder());
							}
						} else {
							return arg0.getMWarehouse().getWarehouseCd().compareTo(arg1.getMWarehouse().getWarehouseCd());
						}
					}else{
						return arg0.getTInventoryH().getMCenter().getCenterCd().compareTo(arg1.getTInventoryH().getMCenter().getCenterCd());
					}
				} else {
					return arg0.getTInventoryH().getMClient().getClientCd().compareTo(arg1.getTInventoryH().getMClient().getClientCd());
				}
			}
		});
		return tInventoryB;
	}

	// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete

/*	private Long zeroToOne(Long value) {
		Long zero = 0L;
		if (zero.compareTo(value) == 0) {
			return 1L;
		}
		return value;
	}*/

	// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana Start

	/**
	 * ロケーション単位の合計キー
	 */
	private static class LocationNumSumKey {

		long depositId;
		long stockTypeId;
		long locationId;
		long productId;

		public LocationNumSumKey(long depositId, long stockTypeId, long locationId, long productId) {
			this.depositId = depositId;
			this.stockTypeId = stockTypeId;
			this.locationId = locationId;
			this.productId = productId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (depositId ^ (depositId >>> 32));
			result = prime * result + (int) (locationId ^ (locationId >>> 32));
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
			LocationNumSumKey other = (LocationNumSumKey) obj;
			if (depositId != other.depositId)
				return false;
			if (locationId != other.locationId)
				return false;
			if (productId != other.productId)
				return false;
			if (stockTypeId != other.stockTypeId)
				return false;
			return true;
		}
	}

	/**
	 * 商品単位の合計キー
	 */
	private static class ProductNumSumKey {

		long depositId;
		long stockTypeId;
		long productId;

		public ProductNumSumKey(long depositId, long stockTypeId, long productId) {
			this.depositId = depositId;
			this.stockTypeId = stockTypeId;
			this.productId = productId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (depositId ^ (depositId >>> 32));
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
			ProductNumSumKey other = (ProductNumSumKey) obj;
			if (depositId != other.depositId)
				return false;
			if (productId != other.productId)
				return false;
			if (stockTypeId != other.stockTypeId)
				return false;
			return true;
		}
	}

	/**
	 * 引当可能数、棚卸数 合計クラス
	 */
	private static class NumSum {

		public enum SetField {
			SUM,
			PRODUCT_SUM,
		}

		// [#5306][v3.0] 小数対応 2018.09.10 kawana Start
		BigDecimal totalChargeNum = WCC.ZERO;
		BigDecimal totalInventoryNum = WCC.ZERO;
		// [#5306][v3.0] 小数対応 2018.09.10 kawana End
		List<TInventoryB> targetList = new ArrayList<TInventoryB>();

		public void add(TInventoryB inventoryB) {

			// [#5306][v3.0] 小数対応 2018.09.10 kawana Start
			totalChargeNum = WCC.add(totalChargeNum, inventoryB.getChargeNum());
			totalInventoryNum = WCC.add(totalInventoryNum, CU.nullToZero(inventoryB.getInventoryNum()));
			// [#5306][v3.0] 小数対応 2018.09.10 kawana End
			targetList.add(inventoryB);
		}

		public void setTotalNum(SetField setField) {

			for (TInventoryB b : targetList) {

				switch (setField) {
				case SUM:
					b.setChargeNumSum(totalChargeNum);
					b.setInventoryNumSum(totalInventoryNum);
					break;
				case PRODUCT_SUM:
					b.setChargeNumProductSum(totalChargeNum);
					b.setInventoryNumProductSum(totalInventoryNum);
					break;
				}
			}
		}
	}

	// [#5305][v2.2] 差異数の合計不良を修正 2018.09.10 kawana End
}
