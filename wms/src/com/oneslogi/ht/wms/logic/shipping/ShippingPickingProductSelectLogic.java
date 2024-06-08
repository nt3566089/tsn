package com.oneslogi.ht.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * バラオーダーピッキング検品(商品)取得ロジッククラス
 */
public class ShippingPickingProductSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

//	// ===== 使用テーブル =====
//	/* 出荷検品ワーク     */
//	@Inject
//	private WHtShippingBhv wHtShippingBhv;
	// [SK2-083] ロケーション情報取得するよう修正 2014.12.19 watanabe Start
	@Inject
	private TPickingBBhv pickingBBhv;
	// [SK2-083] ロケーション情報取得するよう修正 2014.12.19 watanabe End

/* [C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 追加 Start */
	// [Ver3.0] unit of measure対応 2017.11.24 王 Del
	/* 商品荷姿マスタ     */
	@Inject
	private MProductShapeBhv mProductShapeBhv;
/* [C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 追加 End */

	//【C-CWMS-0041】 取得先を「出荷検品ワーク」から「出荷ピッキングワーク」に変更 2015/09/14 Nay Zaw Update Start
	/**
	 * <h2>出荷ピッキングワークを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークからデータを検索し、
	 * 取得した１件目のデータにロケーション名称を設定して返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return WHtShippingPicking 出荷ピッキングワーク
	 */
	public WHtShippingPicking selectWorkData(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.19 fujiwara Start
		wHtShippingPickingCB.setupSelect_MProduct().withMShapeGrp();
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.19 fujiwara End
		wHtShippingPickingCB.setupSelect_TLot();
		wHtShippingPickingCB.setupSelect_MLocation();
//      wHtShippingPickingCB.query().setSpgInspectionFlg_Equal(wHtShippingPicking.getSpgInspectionFlg());   不要
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setPickingFlg_NotEqual("1"); //検品済は除く
		wHtShippingPickingCB.query().addOrderBy_SkipNum_Asc(); //未検品→スキップの順で表示
		wHtShippingPickingCB.query().addOrderBy_HtShippingPickingId_Asc(); //登録時にソート済みのためIDでソート      //addOrderBy_HtShippingId_Asc()→addOrderBy_HtShippingPickingId_Asc()

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return wHtShippingPicking;
		}

		//1件目のデータを取得
		WHtShippingPicking tmpShip = lstWHtShippingPicking.get(0);

		//ロケーション情報を取得
		TPickingBCB pickBCB = pickingBBhv.newMyConditionBean();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		pickBCB.setupSelect_TStock().withMLocation();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		pickBCB.query().setPickingBId_Equal(tmpShip.getPickingBId());
		TPickingB tmpPickB = pickingBBhv.selectEntity(pickBCB);
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tmpShip.setLocationNm(tmpPickB.chaseTStock().chaseMLocation().getLocationNm());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		return tmpShip;
	}

	//【C-CWMS-0041】 取得先を「出荷検品ワーク」から「出荷ピッキングワーク」に変更 2015/09/14 Nay Zaw Update Start
	/**
	 * <h2>出荷ピッキングワークを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークからデータを検索し、
	 * 取得したデータに入数（ケース荷姿の入数）とロケーション名称を設定して返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return List<WHtShippingPicking> 出荷ピッキングワーク
	 */
	public List<WHtShippingPicking> selectList(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.setupSelect_MProduct();
		wHtShippingPickingCB.setupSelect_TLot();
		wHtShippingPickingCB.setupSelect_MLocation();
	//  wHtShippingPickingCB.query().setSpgInspectionFlg_Equal(wHtShippingPicking.getSpgInspectionFlg());  不要
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().addOrderBy_HtShippingPickingId_Asc();

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtShippingPicking;
		}

		// [Ver3.0] unit of measure対応 2017.11.24 王 Del

		List<WHtShippingPicking> returnList = new ArrayList<WHtShippingPicking>();
		for(WHtShippingPicking tmpShip:lstWHtShippingPicking){
			//ロケーション情報を取得
			TPickingBCB pickBCB = pickingBBhv.newMyConditionBean();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			pickBCB.setupSelect_TStock().withMLocation();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			pickBCB.query().setPickingBId_Equal(tmpShip.getPickingBId());
			TPickingB tmpPickB = pickingBBhv.selectEntity(pickBCB);
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			tmpShip.setLocationNm(tmpPickB.chaseTStock().chaseMLocation().getLocationNm());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			// [Ver3.0] unit of measure対応 2017.11.24 王 Del

			returnList.add(tmpShip);
		}

		return returnList;

	}
//	/**
//	 * <h2>一覧画面表示項目を取得。</h2>
//	 * <pre>
//	 * </pre>
//	 * @param wHtShipping 出荷検品ワーク
//	 * @return 出荷検品ワーク一覧
//	 */
//	public List<WHtShipping> selectList(WHtShipping wHtShipping) {
//		//出荷検品ワークテーブルのデータ取得
//		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
//		wHtShippingCB.setupSelect_MProduct();
//		wHtShippingCB.setupSelect_TLot();
//		wHtShippingCB.setupSelect_MLocation();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
//		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
//		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
//		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
//		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
//		wHtShippingCB.query().addOrderBy_HtShippingId_Asc();
//
//		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);
//
//		if (lstWHtShipping.size() == 0) {
//			//該当データが存在しません。
//			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
//			return lstWHtShipping;
//		}
//
//		List<WHtShipping> returnList = new ArrayList<WHtShipping>();
//		for(WHtShipping tmpShip:lstWHtShipping){
//			//ロケーション情報を取得
//			TPickingBCB pickBCB = pickingBBhv.newMyConditionBean();
//			pickBCB.setupSelect_TStockInout().withTStock().withMLocation();
//			pickBCB.query().setPickingBId_Equal(tmpShip.getPickingBId());
//			TPickingB tmpPickB = pickingBBhv.selectEntity(pickBCB);
//			tmpShip.setLocationNm(tmpPickB.getTStockInout().chaseTStock().chaseMLocation().getLocationNm());
//			returnList.add(tmpShip);
//		}
//
//		return returnList;
//
//	}

	//[ON推-品向-1112] 修正対応 2016.4.18 chou Mod Start
	/**
	 * <h2>商品荷姿マスタリストを取得する。</h2>
	 * <pre>
	 * 引数を条件に商品荷姿マスタデータを取得する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：商品ID
	 * @return List<MProductShape> 商品荷姿マスタリスト
	 */
	public List<MProductShape> getMProductShapeInfo(WHtShippingPicking wHtShippingPicking) {

		MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.11.24 王 Del
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		mProductShapeCB.setupSelect_MShapeGrpDtl();
		mProductShapeCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
		mProductShapeCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		List<MProductShape> list = mProductShapeBhv.selectList(mProductShapeCB);

		return list;
	}
	//[ON推-品向-1112] 修正対応 2016.4.18 chou Mod End
}