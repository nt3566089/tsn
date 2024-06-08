package com.oneslogi.ht.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * ケースピッキング検品取得ロジッククラス
 */
public class ShippingCasePickingSelectLogic extends AbstractWmsLogic {

	/* 出荷ピッキングワーク */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// [#975] 不要になった変数を削除(出庫ボディ) 2017.02.21 kawana

	/* センタ区分値明細マスタ */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	/* 梱包ボディ */
	@Inject
	private TPackingBBhv tPackingBBhv;
	//[ON推-品向-1111] 修正対応 2016.4.15 chou Mod Start
	/* 商品荷姿マスタ */
	@Inject
	private MProductShapeBhv mProductShapeBhv;

	//[ON推-品向-1111] 修正対応 2016.4.15 chou Mod End

	/* パラメータマスタに対するロジッククラス */
	@Inject
	private ParamLogic paramLogic;


	/**
	 * <h2>出荷ピッキングワークデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークから出庫済以外のデータを検索し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * 取得した１件目のデータを返却する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス
	 * @param casePickingNo ケースピッキングNo
	 * @return WHtShippingPicking 出荷ピッキングワーク
	 */
	public WHtShippingPicking selectWorkData(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		Collection<Long> PickingBIdList = this.getPickingBIdList(wHtShippingPicking.getClientId(), wHtShippingPicking.getCenterId(), casePickingNo);

		if (PickingBIdList == null || PickingBIdList.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return wHtShippingPicking;
		}

		//出荷ピッキングワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();

		wHtShippingPickingCB.setupSelect_MProduct();
		wHtShippingPickingCB.setupSelect_TLot();
		wHtShippingPickingCB.setupSelect_MLocation();
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.21 fujiwara Start
		wHtShippingPickingCB.setupSelect_MProduct().withMShapeGrp();
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.21 fujiwara End

		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingBId_InScope(PickingBIdList);
		wHtShippingPickingCB.query().setPickingFlg_NotEqual("1");   //出庫フラグ:出庫済は除く

		//スキップ ＞ 出荷ピッキングワークIDの順で表示
		wHtShippingPickingCB.query().addOrderBy_SkipNum_Asc();
		wHtShippingPickingCB.query().addOrderBy_HtShippingPickingId_Asc();


		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return wHtShippingPicking;
		}

		//1件目のデータを取得
		WHtShippingPicking tmpShip = lstWHtShippingPicking.get(0);

		return tmpShip;
	}


	/**
	 * <h2>出庫ボディIDのリストを取得する。</h2>
	 * <pre>
	 * 引数の条件で梱包ボディを検索し
	 * 検索した梱包ボディの出庫ボディIDリストを返却する。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param casePickingNo ケースピッキングNO
	 * @return PickingBIdList 出庫ボディIDのリスト
	 */
	public Collection<Long> getPickingBIdList(Long clientId, Long centerId, String casePickingNo) {

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		// 出庫ボディIDのみ
		cb.specify().columnPickingBId();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		List<TPackingB> list = tPackingBBhv.selectList(cb);

		if (list == null || list.size() == 0) {
			return null;
		}

		Collection<Long> pickingBIdList = new HashSet<Long>();
		for (TPackingB data : list) {
			pickingBIdList.add(data.getPickingBId());
		}

		return pickingBIdList;

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	}


	/**
	 * <h2>出荷ピッキングワークデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出庫ボディIDのリストを取得し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 *
	 * 出庫ボディIDと引数より、出荷ピッキングワークデータを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス
	 * @param casePickingNo ケースピッキングNo.
	 * @return List<WHtShippingPicking> 出荷ピッキングワークリスト
	 */
	public List<WHtShippingPicking> selectList(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		List<WHtShippingPicking> lstWHtShippingPicking = new ArrayList<WHtShippingPicking>();

		Collection<Long> PickingBIdList = this.getPickingBIdList(wHtShippingPicking.getClientId(), wHtShippingPicking.getCenterId(), casePickingNo);

		if (PickingBIdList == null || PickingBIdList.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtShippingPicking;
		}

		//出荷ピッキングワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.setupSelect_MProduct();
		wHtShippingPickingCB.setupSelect_TLot();
		wHtShippingPickingCB.setupSelect_MLocation();

		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingBId_InScope(PickingBIdList);

		wHtShippingPickingCB.query().addOrderBy_HtShippingPickingId_Asc();

		lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking == null || lstWHtShippingPicking.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtShippingPicking;
		}

		return lstWHtShippingPicking;

	}

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	/**
	 * <h2>区分値マスタ情報を取得する。</h2>
	 * <pre>
	 * 引数を条件に区分値マスタ情報を取得し、
	 * 区分値マスタ情報のマップを返却する。
	 * </pre>
	 * @param classCdList 区分値CDリスト
	 * @return centerClassMap センタ区分値マスタ情報のマップ
	 */
	public Map<String, Map<String, String>> getBClassInfo(List<String> classCdList) {

		// 区分値マスタより取得
		if(classCdList == null || classCdList.isEmpty()){
			return null;
		}

		BClassDtlCB bClassDtlCB = bClassDtlBhv.newConditionBean();
		bClassDtlCB.specify().columnClassDtlCd();
		bClassDtlCB.specify().columnDictId();
		bClassDtlCB.setupSelect_BClass();
		bClassDtlCB.specify().specifyBClass().columnClassCd();
		bClassDtlCB.setupSelect_VDict(super.getCultureId());
		bClassDtlCB.specify().specifyVDict().columnDictNm();
		bClassDtlCB.query().queryBClass().setClassCd_InScope(classCdList);
		bClassDtlCB.query().queryBClass().addOrderBy_ClassCd_Asc();
		bClassDtlCB.query().addOrderBy_ClassDtlCd_Asc();

		List<BClassDtl> bClassList = bClassDtlBhv.selectList(bClassDtlCB);

		Map<String, Map<String, String>> centerClassMap = new HashMap<String, Map<String, String>>();

		String classCd = "";
		Map<String, String> bClassDtlMap = new HashMap<String, String>();

		for(int i = 0; i < bClassList.size(); i ++) {

			BClassDtl bClassDtl = bClassList.get(i);

			if(!classCd.equals(bClassDtl.getBClass().getClassCd())) {

				if(!bClassDtlMap.isEmpty()) {
					centerClassMap.put(classCd, bClassDtlMap);
					bClassDtlMap = new HashMap<String, String>();
				}

				classCd = bClassDtl.getBClass().getClassCd();
			}

			bClassDtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());

			if(i == bClassList.size() - 1){
				centerClassMap.put(classCd, bClassDtlMap);
			}

		}

		return centerClassMap;

	}

	/**
	 * <h2>区分値明細の情報を取得する。</h2>
	 * <pre>
	 * 引数を条件にセンタ区分値明細マスタの情報を取得し返却する。
	 * </pre>
	 * @param bClassMap センタ区分値マスタ情報のマップ
	 * @param classCd 区分値CD
	 * @param classDtlCd 区分値明細CD
	 * @return BClassDtl 区分値明細マスタ
	 */
	public BClassDtl getBClassDtl(Map<String, Map<String, String>> bClassMap, String classCd, String classDtlCd) {

		BClassDtl bClassDtl = new BClassDtl();
		VDict vDict = new VDict();

		if (bClassMap != null && bClassMap.containsKey(classCd)) {
			if (bClassMap.get(classCd).containsKey(classDtlCd)) {
				vDict.setDictNm(bClassMap.get(classCd).get(classDtlCd));
			}
		}

		bClassDtl.setVDict(vDict);

		return bClassDtl;

	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

	/**
	 * <h2>出庫フラグを取得する。</h2>
	 * <pre>
	 * 引数をキーに梱包ボディの出庫フラグを取得する。
	 * </pre>
	 * @param pickingBId 出庫ボディID
	 * @return String 出庫フラグ
	 */
	public String getPickingFlg(Long pickingBId) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.query().setPickingBId_Equal(pickingBId);

		List<TPackingB> list = tPackingBBhv.selectList(cb);
		if(list == null || list.size() == 0) {
			return null;
		}else {
			return list.get(0).getPickingFlg();
		}

	}

	/**
	 * <h2>入庫No.管理フラグを取得する。</h2>
	 * <pre>
	 * ログイン情報を取得し、
	 * パラメータマスタから入庫No.管理フラグを取得する。
	 * @param ses Session
	 * @return String 入庫No.管理フラグ
	 */
	public String getStoreNoFlg(HttpSession ses) {
		String storeNoFlg = "0";

		//ログイン情報取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		if(loginInfo == null){
			return storeNoFlg;
		}
		//パラメータマスタ情報の取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(loginInfo.getClientId());
		mClientCenter.setCenterId(loginInfo.getCenterId());

		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		storeNoFlg = CommonUtil.nullOrEmptyToZero(mParam.getStoreNoFlg());

		return storeNoFlg;

	}

	//[ON推-品向-1111] 修正対応 2016.4.18 chou Mod Start
	/**
	 * <h2>商品荷姿マスタリストを取得する。</h2>
	 * <pre>
	 * 引数を条件に商品荷姿マスタリストを取得する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク
	 * @return List<MProductShape> 商品荷姿マスタリスト
	 */
	public List<MProductShape> getMProductShapeInfo(WHtShippingPicking wHtShippingPicking) {

		MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		mProductShapeCB.setupSelect_MProduct();
		mProductShapeCB.setupSelect_MShapeGrpDtl();
		// [Ver3.0] unit of measure対応 2017.11.29 王 Del
		mProductShapeCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		mProductShapeCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		List<MProductShape> list = mProductShapeBhv.selectList(mProductShapeCB);

		return list;
	}
	//[ON推-品向-1111] 修正対応 2016.4.18 chou Mod End

}