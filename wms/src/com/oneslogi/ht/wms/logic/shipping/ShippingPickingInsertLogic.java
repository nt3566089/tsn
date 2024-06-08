package com.oneslogi.ht.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *バラオーダーピッキング検品登録ロジッククラス
 */
public class ShippingPickingInsertLogic extends AbstractWmsLogic {
	// [Ver3.0] unit of measure対応 2017.11.24 王 Del

	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// [C-CWMS-0051] 出荷梱包Noでピッキングする場合為追加 2015.12.16 NayZaw Start
	/*梱包ボディ          */
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [Ver3.0] unit of measure対応 2017.11.24 王 Del

	// [C-CWMS-0051] 出荷梱包Noでピッキングする場合為追加 2015.12.16 NayZaw End

	/**
	 * <h2>出荷ピッキングワークを登録する。</h2>
	 * <pre>
	 * 引数を条件に出庫ボディ、商品マスタ、ロケーションマスタ、ロットのデータを取得し、
	 * 出荷ピッキングワークデータに設定後、登録する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・入庫ラベルNo.・MACアドレス・検品済数
	 */
	public void insertWHtShippingPicking(WHtShippingPicking wHtShippingPicking) {

		// [C-CWMS-0051]荷姿がケース以外を追加する 2015.12.16 NayZaw Start

		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TShippingInstB();
		tPickingBCB.setupSelect_TShippingInstB().withMLocation();
		tPickingBCB.setupSelect_TShippingInstB().withMProduct();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPickingBCB.setupSelect_TStock().withTLot();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPickingBCB.query().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// [C-CWMS-0051]荷姿がケース以外を追加する 2015.12.17 NayZaw Start
		tPickingBCB.query().setShapeId_IsNull();
		// [C-CWMS-0051]荷姿がケース以外を追加する 2015.12.17 NayZaw End

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		TPickingB tPickingB = lstTPickingB.get(0);
		TShippingInstB tShippingInstB = tPickingB.chaseTShippingInstB();
		MLocation mLocation = tShippingInstB.chaseMLocation();
		MProduct mProduct = tShippingInstB.getMProduct();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		TStock tStock = tPickingB.chaseTStock();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		TLot tLot = tStock.chaseTLot();
		// [Ver3.0] unit of measure対応 2017.11.24 王 Del
		WHtShippingPicking entity = new WHtShippingPicking();
		entity.setMacAddress(wHtShippingPicking.getMacAddress());
		entity.setClientId(wHtShippingPicking.getClientId());
		entity.setCenterId(wHtShippingPicking.getCenterId());
		entity.setPickingBId(tPickingB.getPickingBId());
		entity.setPickingWorkNo(wHtShippingPicking.getPickingWorkNo());
		entity.setProductId(mProduct.getProductId());
		entity.setProductCd(mProduct.getProductCd());
		entity.setProductNm(mProduct.getProductNm());
		entity.setJanCd(mProduct.getJanCd());
		// [Ver3.0] unit of measure対応 2017.11.24 王 Del
		entity.setSpgQtyOns(wHtShippingPicking.getSpgQtyOns());
		entity.setLocationId(mLocation.getLocationId());
		entity.setLocationCd(mLocation.getLocationCd());
		entity.setLocationNm(mLocation.getLocationNm());
		entity.setLotId(tLot.getLotId());
		entity.setLot(tLot.getLot());
		entity.setInstNum(tPickingB.getPickingNum());
		entity.setLimitDt(tLot.getLimitDt());
		entity.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
		entity.setWorkEndDt(AccessContext.getAccessTimestampOnThread());
		entity.setStoreLabelNo(wHtShippingPicking.getStoreLabelNo());

		wHtShippingPickingBhv.insert(entity);
	}
	// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.16 NayZaw Start
	/**
	 * <h2>出荷ピッキングワークを登録する(梱包No.で検品)。</h2>
	 * <pre>
	 * 引数を条件に梱包ボディ、商品マスタ、ケース入数、ロケーションマスタ、ロットのデータを取得し、
	 * 出荷ピッキングワークデータに設定後、登録する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・入庫ラベルNo.・MACアドレス・検品済数
	 */
	public void insertWHtShippingPickingByPackingNo(WHtShippingPicking wHtShippingPicking) {
		//梱包ヘッダから情報取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPickingB();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withMLocation();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withMProduct();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPackingBCB.setupSelect_TPickingB().withTStock();
		tPackingBCB.setupSelect_TPickingB().withTStock().withTLot();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		TPackingB tPackingB = lstTPackingB.get(0);
		TPickingB tPickingB = tPackingB.chaseTPickingB();
		TShippingInstB tShippingInstB = tPickingB.chaseTShippingInstB();
		MLocation mLocation = tShippingInstB.chaseMLocation();
		MProduct mProduct = tShippingInstB.getMProduct();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		TStock tStock = tPickingB.chaseTStock();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		TLot tLot = tStock.chaseTLot();

		// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生(同様の処理を共通化で不要になったソースを削除) 2017.01.12 kawana

		WHtShippingPicking entity = new WHtShippingPicking();
		entity.setMacAddress(wHtShippingPicking.getMacAddress());
		entity.setClientId(wHtShippingPicking.getClientId());
		entity.setCenterId(wHtShippingPicking.getCenterId());
		entity.setPickingBId(tPickingB.getPickingBId());
		entity.setPickingWorkNo(wHtShippingPicking.getPickingWorkNo());
		entity.setProductId(mProduct.getProductId());
		entity.setProductCd(mProduct.getProductCd());
		entity.setProductNm(mProduct.getProductNm());
		entity.setJanCd(mProduct.getJanCd());
		// [Ver3.0] unit of measure対応 2017.11.24 王 Del
		entity.setSpgQtyOns(wHtShippingPicking.getSpgQtyOns());
		entity.setLocationId(mLocation.getLocationId());
		entity.setLocationCd(mLocation.getLocationCd());
		entity.setLocationNm(mLocation.getLocationNm());
		entity.setLotId(tLot.getLotId());
		entity.setLot(tLot.getLot());
		entity.setInstNum(tPackingB.getPackingNum());
		entity.setLimitDt(tLot.getLimitDt());
		entity.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
		entity.setWorkEndDt(AccessContext.getAccessTimestampOnThread());
		entity.setStoreLabelNo(wHtShippingPicking.getStoreLabelNo());

		wHtShippingPickingBhv.insert(entity);
	}
	// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.16 NayZaw End
}