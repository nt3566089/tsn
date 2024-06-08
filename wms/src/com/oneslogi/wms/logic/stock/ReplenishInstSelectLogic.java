package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.shipping.StockAllocateLogic;
import com.oneslogi.wms.dto.stock.ReplenishInstListDto.ReplenishInstListBodyData;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;

/**
 * 補充指示一覧データ取得ロジッククラス
 */
public class ReplenishInstSelectLogic extends AbstractWmsLogic {

	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private StockAllocateLogic stockAlllocateLogic;
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add Start
	@Inject
	private ProductShapeLogic productShapeLogic;
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add End
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu Start
	@Inject
	private LocationLogic locationLogic;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu End
	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 Start
	@Inject
	private MLocationBhv mLocationBhv;

	private Collection<Long> replenishProductIdList;
	private Collection<Long> replenishLocationIdList;
	private Collection<Long> replenishStockTypeIdList;
	private Collection<Long> replenishDepositIdList;
	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 End

	/* 補充指示一覧データ */
	private List<ReplenishInstListBodyData> searchResultList = new ArrayList<ReplenishInstListBodyData>();
	/* 定期補充単位区分 */
	private String rgReplenishUnitCls = "1";
	//補充点検索条件
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
	private String replenishMinNumCond = CDef.ReplenishSearchCls.$0.code();// 0:補充点以下
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End

	// [バグ（ＰＧ不良） #1003] 対応修正 引数（商品マスタ）を追加 2017.2.13 nayzaw Start
	/**
	 * <h2>補充指示データを取得する。</h2>
	 * <pre>
	 * 補充するピックロケーションを検索する。
	 *
	 * 補充先、補充元の在庫情報を取得し、
	 * 補充先在庫数、補充元在庫数、補充指示済数の合計値、補充指示数を算出する。
	 * 補充指示数が０以下または、ロケーションマスタに該当するデータがないものを除き、補充指示一覧リストに設定する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：センタID・ゾーンID・ロケーションCD(From)・ロケーションCD(To)・補充商品ID
	 * @param tstock 在庫：倉庫ID、荷主ID、削除フラグ
	 * @param mClientCenter 荷主センタマスタ：荷主ID
	 * @param mClient 荷主マスタ：荷主ID・荷主CD
	 * @param mProduct 商品マスタ:商品CD
	 * @param type 処理区分（1:一覧データの通常検索用  2:補充指示データを登録前のDBチェック用）
	 * @param locationIdColtn ロケーションIDのコレクション
	 * @param productIdColtn 商品IDのコレクション
	 * @param stockTypeIdColtn 在庫区分IDのコレクション
	 * @param depositIdColtn 預託IDのコレクション
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<ReplenishInstListBodyData> 補充指示一覧リスト
	 * @throws ParseException
	 */
	public List<ReplenishInstListBodyData> select(MLocation mLocation, TStock tstock, MClientCenter mClientCenter,
			MClient mClient,MProduct mProduct, int type, Collection<Long> locationIdColtn, Collection<Long> productIdColtn,
			Collection<Long> stockTypeIdColtn, Collection<Long> depositIdColtn, ErrorStatus errSts) throws ParseException {

		// [バグ（ＰＧ不良） #1003] 対応修正 引数（商品マスタ）を追加 2017.2.13 nayzaw End

		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(mLocation.getLocationCdFrom());
		mLocationExentity.setLocationCdTo(mLocation.getLocationCdTo());
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = locationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = locationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End

		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 Start
		// 補充する必要なピックロケーションを検索
		MLocationCB locationCb = mLocationBhv.newMyConditionBean();
		locationCb.setupSelect_MZone().withMWarehouse();
		locationCb.setupSelect_MProductShapeByMaxStoreProductShapeId();
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
		locationCb.setupSelect_MProductShapeByMaxStoreProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(this.getCultureId());
		locationCb.setupSelect_MProductShapeByReplenishPProductShapeId();
		locationCb.setupSelect_MProductShapeByReplenishPProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(this.getCultureId());
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
		locationCb.setupSelect_MProduct();
		locationCb.setupSelect_MStockType().withVDict(this.getCultureId());
		locationCb.setupSelect_MCustomer();

		//荷主センタ変更対応 201７.02.10 sja Start
		locationCb.setupSelect_MCenter();
		locationCb.setupSelect_MProduct().withMClient();
		//荷主センタ変更対応 201７.02.10 sja End

		locationCb.query().queryMProduct().setClientId_Equal(mClientCenter.getClientId());
		locationCb.query().setCenterId_Equal(mLocation.getCenterId());
		locationCb.query().setZoneId_Equal(mLocation.getZoneId());
		locationCb.query().queryMZone().queryMWarehouse().setWarehouseId_Equal(tstock.getWarehouseId());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		locationCb.query().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		locationCb.query().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End
		locationCb.query().setDelFlg_Equal_$0();
		locationCb.query().setPickingLocationFlg_Equal_$1();
		// [バグ（ＰＧ不良） #1003] 対応修正 2017.2.13 nayzaw Start
		if(mProduct.getProductCd() == null){
			locationCb.query().setReplenishProductId_IsNotNull();
		}else{
			locationCb.query().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
		}
		// [バグ（ＰＧ不良） #1003] 対応修正 2017.2.13 nayzaw End

		locationCb.query().setReplenishStockTypeId_IsNotNull();
		locationCb.query().setReplenishDepositId_IsNotNull();
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.03.10 chou 追加 Start
		locationCb.query().setReplenishPProductShapeId_IsNotNull();//補充点商品荷姿IDがNULL以外
		locationCb.query().setMaxStoreProductShapeId_IsNotNull();//最大格納数商品荷姿IDがNULL以外
		locationCb.query().setMaxStoreNum_IsNotNull();
		locationCb.query().setMaxStoreNum_GreaterThan(WCC.ZERO);
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.03.10 chou 追加 End

		// ===== ソート条件 =====
		locationCb.query().addOrderBy_LocationNm_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/06 Start
		List<MLocation> replenishLocationList = selectList(mLocationBhv, locationCb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/06 End
		// ===== ０件チェック =====
		if (replenishLocationList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return this.searchResultList;
		}else {
			// 補充商品IDリストの取得
			this.replenishProductIdList = this.getIdList(replenishLocationList, 1);
			// 補充先ロケーションIDリストの取得
			this.replenishLocationIdList = this.getIdList(replenishLocationList, 2);
			// 補充在庫区分IDリストの取得
			this.replenishStockTypeIdList = this.getIdList(replenishLocationList, 3);
			// 補充預託IDリストの取得
			this.replenishDepositIdList = this.getIdList(replenishLocationList, 4);
		}

		MParam mpm = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		if (mpm != null){
			//定期補充単位区分の取得・設定(0：必要数 1：最大格納数荷姿切り上げ（格納数荷姿単位で切り上げ）)
			this.rgReplenishUnitCls = mpm.getRgReplenishUnitCls();
		}

		if (type == 2) {//補充指示データを登録前のDBチェックする場合
			this.replenishLocationIdList = locationIdColtn;
			this.replenishProductIdList = productIdColtn;
			this.replenishStockTypeIdList = stockTypeIdColtn;
			this.replenishDepositIdList = depositIdColtn;
		}

		//==== 補充先在庫情報の取得 ====
		this.searchResultList = this.getReplenishToStockInfo(mLocation, tstock, mClientCenter, mClient,
				this.replenishLocationIdList, this.replenishProductIdList, this.replenishStockTypeIdList, this.replenishDepositIdList);

		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 End

		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 削除

		//補充先在庫数、補充元在庫数、補充指示済数の合計値算出を行う為、下記の変数を定義する
		List<ReplenishInstListBodyData> mergeToList1 = new ArrayList<ReplenishInstListBodyData>();//補充先在庫数の合計値算出用
		List<ReplenishInstListBodyData> mergeToList2 = new ArrayList<ReplenishInstListBodyData>();//補充元在庫数の合計値算出用
		List<ReplenishInstListBodyData> mergeToList3 = new ArrayList<ReplenishInstListBodyData>();//補充指示済数の合計値算出用

		//補充先在庫数の合計値算出・設定
		for (ReplenishInstListBodyData tmp : this.searchResultList){
			this.calculateTotalNum(mergeToList1, tmp, 1);
		}

		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 Start
		this.addReplenishInstData(mergeToList1, replenishLocationList);
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 End

		//補充点検索条件の判断で対象外のデータを削除(補充点以下の場合)
		Iterator<ReplenishInstListBodyData> it = mergeToList1.iterator();
		while(it.hasNext()){
			ReplenishInstListBodyData tmp = it.next();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			if (CDef.ReplenishSearchCls.$0.code().equals(this.replenishMinNumCond)) {//補充点以下の場合
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				//[Ver1.1.4][ON推-補充点検索条件判断の不具合] 2016.01.27 chou 修正 Start
				if (tmp.getReplenishToStockNum().compareTo((tmp.getUnitNumP() > 0 ? WCC.multiply(tmp.getReplenishMinNum(), tmp.getUnitNumP()) : tmp.getReplenishMinNum())) > 0) {
				//[Ver1.1.4][ON推-補充点検索条件判断の不具合] 2016.01.27 chou 修正 End
					//-----「補充先在庫数＞補充点×補充点商品荷姿の入数」」のデータを削除-----
					it.remove();
				}
			}
		}

		//補充元在庫数の合計値算出・設定
		for (ReplenishInstListBodyData tmp : getReplenishFromStockChargeNum(tstock, mLocation)){
			this.calculateTotalNum(mergeToList2, tmp, 2);
		}

		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 Start
		//補充指示済数の合計値取得
		List<ReplenishInstListBodyData> replenishInstOverNumDataList = getReplenishInstOverNumTotal(mClient.getClientId(), mLocation.getCenterId(), tstock.getWarehouseId(),
				this.replenishProductIdList, this.replenishLocationIdList, this.replenishStockTypeIdList, this.replenishDepositIdList);
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 End

		//補充指示済数の合計値算出・設定
		for (ReplenishInstListBodyData tmp : replenishInstOverNumDataList){
			this.calculateTotalNum(mergeToList3, tmp, 3);
		}

		//データリストをマージする
		this.searchResultList = mergeData(mergeToList2, mergeToList1, 1);
		this.searchResultList = mergeData(mergeToList3, this.searchResultList, 2);

		//補充指示数の再計算
		for (ReplenishInstListBodyData tmp : this.searchResultList){

			//===========補充指示数の算出が開始▼===========

			//最大格納数-補充先在庫数
			//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 Start
			//最大格納数商品荷姿がピース以外（入数＞０）の場合に、「最大格納数×入数－補充先在庫数」とする。
			BigDecimal val = WCC.subtract((tmp.getUnitNum() > 0 ? WCC.multiply(tmp.getReplenishMaxNum(), tmp.getUnitNum()) : tmp.getReplenishMaxNum()), tmp.getReplenishToStockNum());
			//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 End

			//最大格納数商品荷姿の入数
			BigDecimal unitNum = new BigDecimal(tmp.getUnitNum());

			if ("1".equals(rgReplenishUnitCls)) {
				//最大格納数荷姿切り上げ（格納数荷姿単位で切り上げ）の場合、
				//最大格納数商品荷姿がピース以外（入数＞０）の場合に、補充指示数＝[(最大格納数×入数-補充先在庫数)/入数]を切上げた結果 * 入数。
				//入数≦０の場合、補充指示数＝最大格納数－補充先在庫数
				BigDecimal bd = null;
				//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 Start
				if (WCC.isPositive(unitNum)) {
					bd = WCC.multiply(WCC.divideRoundUp(val, unitNum), unitNum);
				} else {
					bd = val;
				}
				//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 End

				tmp.setReplenishInstNum(bd);

			} else if ("0".equals(rgReplenishUnitCls)) {
				//必要数の場合、補充指示数＝（最大格納数-補充先在庫数）※最大格納数商品荷姿がピース以外（入数＞０）の場合に、「最大格納数×入数－補充先在庫数」とする。
				tmp.setReplenishInstNum(val);

			}

			//===========補充指示数の算出が完了▲===========

			//補充指示数≦0の場合、補充指示数に「0」を設定
			if (WCC.isZeroOrLess(tmp.getReplenishInstNum())) {
				tmp.setReplenishInstNum(WCC.ZERO);
			}

			//補充指示数＞補充元在庫数の場合、補充指示数を再計算する
			//①切上げの場合に、補充指示数＝（補充元在庫数 ÷ 入数）の切り捨て × 入数
			//②必要数の場合に、 補充指示数＝補充元在庫数
			BigDecimal  repFromNum = tmp.getReplenishFromStockNum();
			if (WCC.isGreaterThan(tmp.getReplenishInstNum(), repFromNum)) {
				BigDecimal rs = WCC.ZERO;
				//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.02.25 chou 修正 Start
				if("1".equals(rgReplenishUnitCls) && WCC.isPositive(unitNum)) {//切上げの場合
				//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.02.25 chou 修正 End
					rs = WCC.multiply(WCC.divide(repFromNum, unitNum), unitNum);
				}else {//必要数の場合
					rs = repFromNum;
				}

				tmp.setReplenishInstNum(rs);

			}
		}

		//補充点検索条件の判断で対象外のデータを削除(補充可能の場合)
//		it = mergeToList1.iterator();
		it = this.searchResultList.iterator();
		while(it.hasNext()){
			ReplenishInstListBodyData tmp = it.next();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			if (CDef.ReplenishSearchCls.$1.code().equals(this.replenishMinNumCond)) {//補充可能の場合
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				if (!(tmp.getReplenishInstNum().compareTo(WCC.ZERO) > 0)) {
					//-----「補充指示数 <= ０」のデータを削除-----
					it.remove();
				}
			}

		}


		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 Start
		//ロケーションマスタに該当しないデータを削除
		Iterator<ReplenishInstListBodyData> iterator = this.searchResultList.iterator();
		boolean isFound = false;
		while(iterator.hasNext()){
			isFound = false;
			ReplenishInstListBodyData tmp = iterator.next();
			for(MLocation mLoc : replenishLocationList) {
				if(WCC.isEqual(tmp.getReplenishToLocationId(), mLoc.getLocationId()) &&
						WCC.isEqual(tmp.getProductId(), mLoc.getReplenishProductId()) &&
						WCC.isEqual(tmp.getStockTypeId(), mLoc.getReplenishStockTypeId()) &&
						WCC.isEqual(tmp.getDepositId(), mLoc.getReplenishDepositId())){
					isFound = true;
					break;
				}
			}
			if(!isFound) {
				iterator.remove();
			}

		}
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 End

		// ===== ０件チェック =====
		if (this.searchResultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return this.searchResultList;
	}


	/**
	 * <h2>データリストをマージする。</h2>
	 *
	 * <pre></pre>
	 * @param list1 マージ先のリストオブジェクト
	 * @param list2 マージ元のリストオブジェクト
	 * @param type 処理区分(1:補充先在庫数の合計リストと補充元在庫数の合計リストをマージする場合  2:補充指示済数の合計リストとマージする場合)
	 *
	 * @return List<ReplenishInstListBodyData> 補充指示一覧リスト
	 */
	private List<ReplenishInstListBodyData> mergeData(List<ReplenishInstListBodyData> listMergeFrom, List<ReplenishInstListBodyData> listMergeTo, int type){

		for (ReplenishInstListBodyData tmp1 : listMergeTo){

			for (ReplenishInstListBodyData tmp2 : listMergeFrom){
				if (type == 1){//補充先在庫数の合計リストと補充元在庫数の合計リストをマージする場合
					if (tmp1.getProductId().longValue() == tmp2.getProductId().longValue() &&
							tmp1.getStockTypeId().longValue() == tmp2.getStockTypeId().longValue() &&
							tmp1.getDepositId().longValue() == tmp2.getDepositId().longValue()) {
						tmp1.setReplenishFromStockNum(tmp2.getReplenishFromStockNum());
					}
				}else if (type == 2){//補充指示済数の合計リストとマージする場合
					if (tmp1.getReplenishToLocationId().longValue() == tmp2.getReplenishToLocationId().longValue() &&
							tmp1.getProductId().longValue() == tmp2.getProductId().longValue() &&
							tmp1.getStockTypeId().longValue() == tmp2.getStockTypeId().longValue() &&
							tmp1.getDepositId().longValue() == tmp2.getDepositId().longValue()) {
						tmp1.setReplenishInstOverNum(tmp2.getReplenishInstOverNum());
					}
				}

			}
		}

		return listMergeTo;

	}


	/**
	 * <h2>補充先在庫数、補充元在庫数、補充指示済数の合計算出。</h2>
	 *
	 * <pre></pre>
	 * @param list 合計結果を格納する補充指示一覧データリスト
	 * @param data 合計する前の補充指示一覧レコード
	 * @param type 処理区分（1:補充先在庫数合算の場合  2:補充元在庫数合算の場合  3:補充指示済数合算の場合）
	 */
	private void calculateTotalNum(List<ReplenishInstListBodyData> list, ReplenishInstListBodyData data, int type) {

		if (type == 1) {//補充先在庫数合算の場合

			for (int i = 0; i < list.size(); i ++) {
				if (list.get(i).getReplenishToLocationId().longValue() == data.getReplenishToLocationId().longValue() &&
						list.get(i).getProductId().longValue() == data.getProductId().longValue() &&
						list.get(i).getStockTypeId().longValue() == data.getStockTypeId().longValue() &&
						list.get(i).getDepositId().longValue() == data.getDepositId().longValue()) {

					BigDecimal replenishToStockNum = list.get(i).getReplenishToStockNum();
					replenishToStockNum = WCC.add(replenishToStockNum, data.getReplenishToStockNum());

					list.get(i).setReplenishToStockNum(replenishToStockNum);
					return;
				}

			}
		} else if (type == 2) {//補充元在庫数合算の場合
			for (int i = 0; i < list.size(); i ++) {
				if (list.get(i).getProductId().longValue() == data.getProductId().longValue() &&
						list.get(i).getStockTypeId().longValue() == data.getStockTypeId().longValue() &&
						list.get(i).getDepositId().longValue() == data.getDepositId().longValue()) {

					BigDecimal replenishFromStockNum = list.get(i).getReplenishFromStockNum();
					replenishFromStockNum = WCC.add(replenishFromStockNum, data.getReplenishFromStockNum());

					list.get(i).setReplenishFromStockNum(replenishFromStockNum);
					return;
				}

			}
		} else if (type == 3) {//補充指示済数合算の場合

			for (int i = 0; i < list.size(); i ++) {
				if (list.get(i).getReplenishToLocationId().longValue() == data.getReplenishToLocationId().longValue() &&
						list.get(i).getProductId().longValue() == data.getProductId().longValue() &&
						list.get(i).getStockTypeId().longValue() == data.getStockTypeId().longValue() &&
						list.get(i).getDepositId().longValue() == data.getDepositId().longValue()) {

					BigDecimal replenishInstOverNum = list.get(i).getReplenishInstOverNum();
					replenishInstOverNum = WCC.add(replenishInstOverNum, data.getReplenishInstOverNum());

					list.get(i).setReplenishInstOverNum(replenishInstOverNum);
					return;
				}

			}
		}

		list.add(data);
	}

	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 Start
	/**
	 * <h2>リストのIDを編集する。</h2>
	 * <pre>
	 * 受取った処理区分により、リストに補充商品ID、ロケーションID、補充在庫区分ID、補充預託IDを設定して戻る。
	 * </pre>
	 * @param list ロケーションマスタリスト：補充商品ID・ロケーションID・補充在庫区分ID・補充預託ID
	 * @param type 処理区分（1:補充商品ID指定の場合  2:補充先ロケーションID指定の場合  3:補充在庫区分ID指定の場合  4:補充預託ID指定の場合）
	 * @return Collection<Long> ID情報のリスト
	 */
	public Collection<Long> getIdList(List<MLocation> list, int type){
		Collection<Long> idList = new HashSet<Long>();

		for (MLocation data : list){
			if (type == 1){
				idList.add(data.getReplenishProductId());
			}else if (type == 2){
				idList.add(data.getLocationId());
			}else if (type == 3){
				idList.add(data.getReplenishStockTypeId());
			}else if (type == 4){
				idList.add(data.getReplenishDepositId());
			}else{
				return null;
			}

		}
		return idList;
	}
	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 End

	/**
	 * <h2>補充元在庫の引当可能数を取得。</h2>
	 *
	 * <pre></pre>
	 * @param tstock 在庫
	 * @param mLocation ロケーションマスタ
	 *
	 * @return List<ReplenishInstListBodyData> 補充指示一覧リスト
	 * @throws ParseException
	 */
	private List<ReplenishInstListBodyData> getReplenishFromStockChargeNum(TStock tstock, MLocation mLocation) throws ParseException {

		TStockCB tStockCB = tStockBhv.newMyConditionBean();
		tStockCB.setupSelect_MLocation();

		// 荷主IDの設定
		tStockCB.query().setClientId_Equal(tstock.getClientId());
		// センタIDの設定
		tStockCB.query().queryMLocation().setCenterId_Equal(mLocation.getCenterId());

		// 削除フラグの設定
		tStockCB.query().setDelFlg_Equal(tstock.getDelFlg());
		tStockCB.query().queryMLocation().setDelFlg_Equal(mLocation.getDelFlg());

		// ピックロケフラグの設定(ピックロケ以外)
		tStockCB.query().queryMLocation().setPickingLocationFlg_Equal("0");

		// 商品IDリストの設定
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 Start
		tStockCB.query().setProductId_InScope(this.replenishProductIdList);
		// 在庫区分リストIDの設定
		tStockCB.query().setStockTypeId_InScope(this.replenishStockTypeIdList);
		// 預託IDリストの設定
		tStockCB.query().setDepositId_InScope(this.replenishDepositIdList);
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 End

		// ===== ソート条件 =====
		tStockCB.query().queryMLocation().addOrderBy_LocationId_Asc();
		tStockCB.query().addOrderBy_ProductId_Asc();
		tStockCB.query().addOrderBy_StockTypeId_Asc();
		tStockCB.query().addOrderBy_DepositId_Asc();

		List<TStock> tStockResult = tStockBhv.selectList(tStockCB);

		// ===== 検索結果リスト編集 =====
		List<ReplenishInstListBodyData> retList = new ArrayList<ReplenishInstListBodyData>();

		for(TStock tsk : tStockResult){

			ReplenishInstListBodyData body = new ReplenishInstListBodyData();

			//商品ID
			body.setProductId(tsk.getProductId());
			//在庫区分ID
			body.setStockTypeId(tsk.getStockTypeId());
			//預託ID
			body.setDepositId(tsk.getDepositId());
			//補充元在庫数
			body.setReplenishFromStockNum(tsk.getChargeNum());

			retList.add(body);
		}

		return retList;


	}

	/**
	 * <h2>補充指示処理時の補充元在庫情報を取得する。</h2>
	 * <pre>
	 * 引数をキーに【補充元の引当在庫検索】を行って、在庫移動する必要な補充元在庫情報を取得する。
	 *
	 * 【補充元の引当在庫検索】
	 * ・{@link StockAllocateLogic#selectReplenishStockList(TAllocInstH, TAllocInstB) 補充元の引当在庫検索メソッド}を呼び出す。
	 * </pre>
	 * @param tstock 在庫：荷主ID・商品ID・在庫区分ID・預託ID
	 * @param mLocation ロケーションマスタ：センタID
	 * @return List<TStock> 在庫リスト
	 * @throws ParseException
	 */
	public  List<TStock> getStockInfo(TStock tstock, MLocation mLocation) throws ParseException {

		//====== 共通モジュール（StockAlllocateLogic.selectReplenishStockList）を利用して、======
		//====== 在庫移動する必要な補充元在庫情報を取得する。                              ======

		TAllocInstH allocInstHeader = new TAllocInstH();
		// 荷主IDの設定
		allocInstHeader.setClientId(tstock.getClientId());
		// センタIDの設定
		allocInstHeader.setCenterId(mLocation.getCenterId());

		TAllocInstB allocInstBody = new TAllocInstB();
		// 商品IDの設定
		allocInstBody.setProductId(tstock.getProductId());
		// 在庫区分IDの設定
		allocInstBody.setStockTypeId(tstock.getStockTypeId());
		// 預託IDの設定
		allocInstBody.setDepositId(tstock.getDepositId());

		List<TStock> tStockResult = stockAlllocateLogic.selectReplenishStockList(allocInstHeader, allocInstBody);

		return tStockResult;

	}

	/**
	 * <h2>補充指示済数の合計値を取得。</h2>
	 *
	 * <pre></pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param warehouseId 倉庫ID
	 * @param productIdList 商品IDのリスト
	 * @param locationIdList ロケーションIDのリスト
	 * @param stockTypeIdList 在庫区分IDのリスト
	 * @param depositIdList 預託IDのリスト
	 *
	 * @return List<ReplenishInstListBodyData> 補充指示一覧リスト
	 * @throws ParseException
	 */
	private List<ReplenishInstListBodyData> getReplenishInstOverNumTotal(Long clientId, Long centerId, Long warehouseId,
			Collection<Long> productIdList, Collection<Long> locationIdList, Collection<Long> stockTypeIdList, Collection<Long> depositIdList) throws ParseException {

		List<String> moveInstStatusList = new ArrayList<String>(){{add("00");add("01");}};

		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();

		tMoveInstBCB.setupSelect_TMoveInstH();
		tMoveInstBCB.setupSelect_TMoveInstH().withMProcessType();

		tMoveInstBCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		tMoveInstBCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		tMoveInstBCB.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$32.code());//処理区分CDが32:定期補充
		tMoveInstBCB.query().setWarehouseId_Equal(warehouseId);
		tMoveInstBCB.query().setProductId_InScope(productIdList);
		tMoveInstBCB.query().setStockTypeId_InScope(stockTypeIdList);
		tMoveInstBCB.query().setDepositId_InScope(depositIdList);
		tMoveInstBCB.query().setLocationId_InScope(locationIdList);
		tMoveInstBCB.query().setMoveInstStatus_InScope(moveInstStatusList);
		tMoveInstBCB.query().queryTMoveInstH().setMoveInstStatus_InScope(moveInstStatusList);

		List<TMoveInstB> tMoveInstbResult = tMoveInstBBhv.selectList(tMoveInstBCB);

		// ===== 検索結果リスト編集 =====
		List<ReplenishInstListBodyData> retList = new ArrayList<ReplenishInstListBodyData>();

		for(TMoveInstB tmb : tMoveInstbResult){

			ReplenishInstListBodyData body = new ReplenishInstListBodyData();

			//補充先ロケーションID
			body.setReplenishToLocationId(tmb.getLocationId());

			//商品ID
			body.setProductId(tmb.getProductId());

			//在庫区分ID
			body.setStockTypeId(tmb.getStockTypeId());

			//預託ID
			body.setDepositId(tmb.getDepositId());

			//補充指示済数
			body.setReplenishInstOverNum(tmb.getInstNum());

			retList.add(body);
		}

		return retList;
	}

	/**
	 * <h2>補充点検索条件を設定する。</h2>
	 * <pre>
	 * 引数で受け取ったデータで補充点検索条件を設定する。
	 * </pre>
	 * @param replenishMinNumCond 補充最小数
	 */
	public void setReplenishMinNumCond(String replenishMinNumCond) {
		this.replenishMinNumCond = replenishMinNumCond;
	}



	// [バグ（ＰＧ不良） #1003] 対応修正 引数（商品マスタ）を追加 2017.2.13 nayzaw Start

	// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei

	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 Start
	/**
	 * <h2>補充指示データリストにロケーションマスタの情報を追加。</h2>
	 *
	 * <pre></pre>
	 * @param rList 補充指示データのリスト
	 * @param mList ロケーションマスタ情報リスト
	 */
	private void addReplenishInstData(List<ReplenishInstListBodyData> rList, List<MLocation> mList){

		for(MLocation mln : mList){

			if(!this.hasDataInList(mln.getLocationId(), mln.getReplenishProductId(), mln.getReplenishStockTypeId(), mln.getReplenishDepositId(), rList)){
				ReplenishInstListBodyData data = new ReplenishInstListBodyData();
				data.setReplenishToLocationId(mln.getLocationId());//補充先ロケーションID
				data.setReplenishToLocationCd(mln.getLocationCd());//補充先ロケーションCD
				data.setReplenishToLocationNm(mln.getLocationNm());//補充先ロケーション名称
				data.setProductId(mln.getReplenishProductId());//商品ID
				data.setProductCd(mln.getMProduct() != null ? mln.getMProduct().getProductCd() : null);//商品CD
				data.setProductNm(mln.getMProduct() != null ? mln.getMProduct().getProductNm() : null);//商品名称
				data.setProductAbbr(mln.getMProduct() != null ? mln.getMProduct().getProductAbbr() : null);//商品略称
				data.setStockTypeId(mln.getReplenishStockTypeId());//在庫区分ID
				data.setStockTypeCd(mln.getMStockType().getStockTypeCd());//在庫区分CD
				data.setStockTypeNm(mln.getMStockType().getVDict().getDictNm());//在庫区分名称
				data.setDepositId(mln.getReplenishDepositId());//預託ID
				data.setDepositCd(mln.getMCustomer().getCustomerCd());//預託CD
				data.setDepositNm(mln.getMCustomer().getCustomerNm());//預託名称
				data.setReplenishToStockNum(WCC.ZERO);//補充先在庫数
				data.setReplenishMinNum(mln.getReplenishPNum());//補充点
				// 倉庫ID
				data.setWarehouseId(mln.getMZone().getMWarehouse().getWarehouseId());
				// 倉庫CD
				data.setWarehouseCd(mln.getMZone().getMWarehouse().getWarehouseCd());
				//荷主センタ変更対応 201７.02.10 sja Start
				data.setCenterId(mln.getCenterId());
				data.setCenterCd(mln.getMCenter().getCenterCd());
				data.setCenterNm(mln.getMCenter().getCenterNm());
				data.setClientId(mln.getMProduct().getClientId());
				data.setClientCd(mln.getMProduct().getMClient().getClientCd());
				data.setClientNm(mln.getMProduct().getMClient().getClientNm());
				//荷主センタ変更対応 201７.02.10 sja End

				// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
				Map<Long, MProductShape> calcProductShapeListMap = productShapeLogic.getCalcAllProductShapeListUnitNumPiece(mln.getMProduct());

				// 商品単位
				for (Entry<Long, MProductShape> calcProductShapeList : calcProductShapeListMap.entrySet()) {
					if (calcProductShapeList.getValue().getPieceFlg() == "1") {
						data.setProductUnit(calcProductShapeList.getValue().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
					}
				}

				if (mln.getMProductShapeByMaxStoreProductShapeId() != null) {
					//最大格納数商品荷姿IDで商品荷姿マスタ.入数の取得・設定
					Long unitN = calcProductShapeListMap.get(mln.getMProductShapeByMaxStoreProductShapeId().getProductShapeId()).getUnitNumPiece();
					//最大格納数商品荷姿の入数
					data.setUnitNum(unitN == null ? 0L : unitN);
				}

				if (mln.getMProductShapeByReplenishPProductShapeId() != null) {
					//補充点商品荷姿IDで商品荷姿マスタ.入数の取得・設定
					Long unitN = calcProductShapeListMap.get(mln.getMProductShapeByReplenishPProductShapeId().getProductShapeId()).getUnitNumPiece();
					//補充点商品荷姿の入数
					data.setUnitNumP(unitN == null ? 0L : unitN);
				}

				if (mln.getMProductShapeByReplenishPProductShapeId() != null &&
						mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl() != null &&
						mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape() != null &&
						mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId() != null) {
					//補充点-単位名称
					data.setReplenishMinUnit(mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
				}

				if (mln.getMProductShapeByMaxStoreProductShapeId() != null &&
						mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl() != null &&
						mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() != null &&
						mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId() != null) {
					//最大格納数-単位名称
					data.setReplenishMaxUnit(mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
				}
				// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
				data.setReplenishMaxNum(mln.getMaxStoreNum());//最大格納数

				rList.add(data);

			}
		}

		//ソートする
		Collections.sort(rList, new Comparator<ReplenishInstListBodyData>(){
			@Override
			public int compare(ReplenishInstListBodyData arg1, ReplenishInstListBodyData arg2) {
				//ソート順（昇順）：補充先ロケーション名称
				return arg1.getReplenishToLocationNm().compareTo(arg2.getReplenishToLocationNm());
			}

		});

	}

	/**
	 * <h2>リストに該当データが存在するかどうかを判定。</h2>
	 *
	 * <pre></pre>
	 * @param locationId ロケーションID
	 * @param productId 商品ID
	 * @param stockTypeId 在庫区分ID
	 * @param depositId 預託ID
	 * @param list 補充指示データのリスト
	 *
	 * @return boolean 判定結果(存在する場合：true、存在しない場合:false)
	 */
	private boolean hasDataInList(Long locationId, Long productId, Long stockTypeId, Long depositId, List<ReplenishInstListBodyData> list){
		boolean rs = false;
		Iterator<ReplenishInstListBodyData> it = list.iterator();
		while(it.hasNext()){
			ReplenishInstListBodyData tmp = it.next();
			if(locationId.longValue() == tmp.replenishToLocationId.longValue() &&
					productId.longValue() == tmp.productId.longValue() &&
					stockTypeId.longValue() == tmp.stockTypeId.longValue() &&
					depositId.longValue() == tmp.depositId.longValue()){
				rs = true;
				return rs;
			}
		}
		return rs;
	}

	/**
	 * <h2>補充先在庫情報を取得する。</h2>
	 * <pre>
	 * 引数をキーに補充先在庫情報を取得する。
	 * 検索結果を補充指示一覧リストに設定して返す。
	 * </pre>
	 * @param mLocation ロケーションマスタ：センタID・ゾーンID
	 * @param tstock 在庫：荷主ID・倉庫ID
	 * @param mClientCenter 荷主センタマスタ：（未使用）
	 * @param mClient 荷主マスタ：荷主ID・荷主CD
	 * @param locationIdColtn ロケーションIDのコレクション
	 * @param productIdColtn 商品IDのコレクション
	 * @param stockTypeIdColtn 在庫区分IDのコレクション
	 * @param depositIdColtn 預託IDのコレクション
	 * @return List<ReplenishInstListBodyData> 補充指示一覧リスト(補充先)
	 * @throws ParseException
	 */
	public List<ReplenishInstListBodyData> getReplenishToStockInfo(MLocation mLocation, TStock tstock, MClientCenter mClientCenter,
			MClient mClient, Collection<Long> locationIdColtn, Collection<Long> productIdColtn,
			Collection<Long> stockTypeIdColtn, Collection<Long> depositIdColtn) throws ParseException {

		List<ReplenishInstListBodyData> searchResult = new ArrayList<ReplenishInstListBodyData>();

		//==== 補充先在庫情報の取得 ====
		TStockCB tStockCB = tStockBhv.newMyConditionBean();

		tStockCB.setupSelect_MLocation().withMProductShapeByMaxStoreProductShapeId();
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
		tStockCB.setupSelect_MLocation().withMProductShapeByMaxStoreProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(this.getCultureId());
		tStockCB.setupSelect_MLocation().withMProductShapeByReplenishPProductShapeId();
		tStockCB.setupSelect_MLocation().withMProductShapeByReplenishPProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(this.getCultureId());
		tStockCB.setupSelect_MLocation().withMProduct();
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
		tStockCB.setupSelect_MLocation();
		tStockCB.setupSelect_MProduct();
		tStockCB.setupSelect_MStockType();
		tStockCB.setupSelect_MStockType().withVDict(this.getCultureId());
		tStockCB.setupSelect_MShape();
		tStockCB.setupSelect_MWarehouse();
		tStockCB.setupSelect_MCustomer();

		//荷主センタ変更対応 201７.02.09 sja Start
		tStockCB.setupSelect_MClient();
		tStockCB.setupSelect_MLocation().withMCenter();
		//荷主センタ変更対応 201７.02.09 sja End
		// ===== 検索条件 =====

		// 荷主IDの設定
		tStockCB.query().setClientId_Equal(tstock.getClientId());
		// センタIDの設定
		tStockCB.query().queryMLocation().setCenterId_Equal(mLocation.getCenterId());
		// 倉庫IDの設定
		tStockCB.query().setWarehouseId_Equal(tstock.getWarehouseId());
		// ゾーンIDの設定
		tStockCB.query().queryMLocation().setZoneId_Equal(mLocation.getZoneId());
		// ロケーションIDリストの設定
		tStockCB.query().setLocationId_InScope(locationIdColtn);
		// 商品IDリストの設定
		tStockCB.query().setProductId_InScope(productIdColtn);
		// 在庫区分IDリストの設定
		tStockCB.query().setStockTypeId_InScope(stockTypeIdColtn);
		// 預託IDリストの設定
		tStockCB.query().setDepositId_InScope(depositIdColtn);
		// 削除フラグの設定
		tStockCB.query().setDelFlg_Equal_$0();
		tStockCB.query().queryMLocation().setDelFlg_Equal_$0();
		// ピックロケフラグの設定(ピックロケ)
		tStockCB.query().queryMLocation().setPickingLocationFlg_Equal_$1();

		tStockCB.query().queryMLocation().setReplenishProductId_IsNotNull();
		tStockCB.query().queryMLocation().setReplenishStockTypeId_IsNotNull();
		tStockCB.query().queryMLocation().setReplenishDepositId_IsNotNull();

		// ===== ソート条件 =====
		tStockCB.query().queryMLocation().addOrderBy_LocationNm_Asc();
		tStockCB.query().queryMProduct().addOrderBy_ProductCd_Asc();
		tStockCB.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		tStockCB.query().queryMCustomer().addOrderBy_CustomerCd_Asc();

		//補充先在庫情報
		List<TStock> tStockResult = tStockBhv.selectList(tStockCB);

		//検索されたテーブルレコードを一覧データ格納用のオブジェクトに設定
		for(TStock tsk : tStockResult){

			ReplenishInstListBodyData body = new ReplenishInstListBodyData();
			//荷主センタ変更対応 201７.02.09 sja Start
			//荷主ID
			body.setClientId(tsk.getMClient().getClientId());
			//荷主CD
			body.setClientCd(tsk.getMClient().getClientCd());
			//荷主名称
			body.setClientNm(tsk.getMClient().getClientNm());
			//荷主センタ変更対応 201７.02.09 sja End
			body.setWarehouseId(tsk.getWarehouseId());

			MWarehouse mwe = tsk.getMWarehouse();
			if(mwe != null){
				body.setWarehouseCd(mwe.getWarehouseCd());
			}

			MLocation mln = tsk.getMLocation();
			if(mln != null){
				//センタID
				body.setCenterId(mln.getCenterId());

				//荷主センタ変更対応 201７.02.09 sja Start
				//センタCD
				//body.setCenterCd(mln.getMCenter() != null ? mln.getMCenter().getCenterCd() : null);
				body.setCenterCd(mln.getMCenter().getCenterCd());
				//センタ名称
				body.setCenterNm(mln.getMCenter().getCenterNm());
				//荷主センタ変更対応 201７.02.09 sja End

				//補充先ロケーションID
				body.setReplenishToLocationId(tsk.getLocationId());
				//補充先ロケーションCD
				body.setReplenishToLocationCd(mln.getLocationCd());
				//補充先ロケーション名称
				body.setReplenishToLocationNm(mln.getLocationNm());

				// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
				Map<Long, MProductShape> calcProductShapeListMap = productShapeLogic.getCalcAllProductShapeListUnitNumPiece(mln.getMProduct());

				// 商品単位
				for (Entry<Long, MProductShape> calcProductShapeList : calcProductShapeListMap.entrySet()) {
					if (calcProductShapeList.getValue().getPieceFlg() == "1") {
						body.setProductUnit(calcProductShapeList.getValue().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
					}
				}

				if (mln.getMProductShapeByMaxStoreProductShapeId() != null) {
					//最大格納数商品荷姿IDで商品荷姿マスタ.入数の取得・設定
					Long unitN = calcProductShapeListMap.get(mln.getMProductShapeByMaxStoreProductShapeId().getProductShapeId()).getUnitNumPiece();
					//最大格納数商品荷姿の入数
					body.setUnitNum(unitN == null ? 0L : unitN);
				}

				if (mln.getMProductShapeByReplenishPProductShapeId() != null) {
					//補充点商品荷姿IDで商品荷姿マスタ.入数の取得・設定
					Long unitN = calcProductShapeListMap.get(mln.getMProductShapeByReplenishPProductShapeId().getProductShapeId()).getUnitNumPiece();
					//補充点商品荷姿の入数
					body.setUnitNumP(unitN == null ? 0L : unitN);
				}

				if (mln.getMProductShapeByReplenishPProductShapeId() != null &&
						mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl() != null &&
						mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape() != null &&
						mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId() != null) {
					//補充点-単位名称
					body.setReplenishMinUnit(mln.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
				}

				if (mln.getMProductShapeByMaxStoreProductShapeId() != null &&
						mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl() != null &&
						mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() != null &&
						mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId() != null) {
					//最大格納数-単位名称
					body.setReplenishMaxUnit(mln.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
				}
				// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End

			}

			MProduct mpt = tsk.getMProduct();
			if(mpt != null){
				//商品ID
				body.setProductId(mpt.getProductId());
				//商品CD
				body.setProductCd(mpt.getProductCd());
				//商品名称
				body.setProductNm(mpt.getProductNm());
				//商品略称
				body.setProductAbbr(mpt.getProductAbbr());
			}

			MStockType mst = tsk.getMStockType();
			if(mst != null){
				//在庫区分ID
				body.setStockTypeId(mst.getStockTypeId());
				//在庫区分CD
				body.setStockTypeCd(mst.getStockTypeCd());
				//在庫区分名称
				body.setStockTypeNm(mst.getVDict() != null ? mst.getVDict().getDictNm() : null);
			}

			MCustomer ctr = tsk.getMCustomer();
			if(ctr != null){
				//取引先ID
				body.setDepositId(ctr.getCustomerId());
				//取引先CD
				body.setDepositCd(ctr.getCustomerCd());
				//取引先名称
				body.setDepositNm(ctr.getCustomerNm());
			}


			//補充先在庫数
			body.setReplenishToStockNum(tsk.getChargeNum());
			//補充点
			body.setReplenishMinNum(mln.getReplenishPNum() == null ? WCC.ZERO : mln.getReplenishPNum());
			//最大格納数
			body.setReplenishMaxNum(mln.getMaxStoreNum() == null ? WCC.ZERO : mln.getMaxStoreNum());

			//リストに追加
			searchResult.add(body);

		}

		return searchResult;
	}
	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 End

}
