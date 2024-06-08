package com.oneslogi.ht.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラオーダーピッキング検品取得ロジッククラス
 */
public class ShippingPickingSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// [SK2-083] ロケーション情報取得するよう修正 2014.12.19 watanabe Start
	@Inject
	private TPickingBBhv pickingBBhv;
	// [SK2-083] ロケーション情報取得するよう修正 2014.12.19 watanabe End

	// [Ver3.0] unit of measure対応 2017.11.24 王 Del

// [Ver3.0] unit of measure対応 2017.11.22 王 Start
	/* 梱包ボディ         */
	@Inject
	private TPackingBBhv tPackingBBhv;
// [Ver3.0] unit of measure対応 2017.11.22 王 End

	@Inject
	private ShippingCommonLogic commonLogic;

	// [Ver3.0] unit of measure対応 2017.11.24 王 Del

	//【C-CWMS-0041】「出荷検品ワーク」から取得より「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE Start

	/**
	 * <h2>出荷ピッキングワークデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークからデータを検索し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 取得したデータに入数（ケース荷姿の入数）とロケーション名称を設定して返却する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return List<WHtShippingPicking> 出荷ピッキングワークリスト
	 */
	public List<WHtShippingPicking> selectList(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.setupSelect_MProduct();
		wHtShippingPickingCB.setupSelect_TLot();
		wHtShippingPickingCB.setupSelect_MLocation();
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());

		wHtShippingPickingCB.query().addOrderBy_StoreLabelNo_Asc();

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtShippingPicking;
		}
		// [Ver3.0] unit of measure対応 2017.11.24 王 Del

		// [SK2-083] ロケーション情報取得するよう修正 2014.12.19 watanabe Start
		List<WHtShippingPicking> returnList = new ArrayList<WHtShippingPicking>();
		for(WHtShippingPicking tmpShip:lstWHtShippingPicking){
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
		// [SK2-083] ロケーション情報取得するよう修正 2014.12.19 watanabe End
	}
	//【C-CWMS-0041】「出荷検品ワーク」から取得より「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE End

// [Ver3.0] unit of measure対応 2017.11.22 王  Start
	/**
	 * <h2>出荷ピッキングワークデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークからデータを検索し、
	 *
	 *
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・入庫NO・荷主ID・センタID
	 * @return mProduct 商品情報
	 */
	public MProduct selectProduct(WHtShippingPicking wHtShippingPicking) {

		//梱包ボディ情報の取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPickingB().withTStock();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withMProduct();
		tPackingBCB.setupSelect_TPickingB().withTPickingH();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withMProduct().withMShapeGrp();
		tPackingBCB.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingBCB.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		final String targetNo = wHtShippingPicking.getPickingWorkNo();
		if (commonLogic.isPickingWorkNo(wHtShippingPicking.getCenterId(), targetNo)) {
			tPackingBCB.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		}
		else{
			tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
		}

		// 在庫ID
		tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
		// 荷姿がケース以外
		tPackingBCB.query().queryTPickingB().setShapeId_IsNull();

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		TPackingB tPackingB = lstTPackingB.get(0);

		MProduct mProduct = tPackingB.getTPickingB().getTShippingInstB().getMProduct();

		return mProduct;
	}
// [Ver3.0] unit of measure対応 2017.11.22 王 End
}