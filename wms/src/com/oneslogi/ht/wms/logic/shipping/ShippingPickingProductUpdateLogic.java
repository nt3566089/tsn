package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.wms.core.WCC;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラオーダーピッキング検品(商品)更新ロジッククラス
 */
public class ShippingPickingProductUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

//	/* 出荷検品ワーク     */
//	@Inject
//	private WHtShippingBhv wHtShippingBhv;

	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingProductCheckLogic checkLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End


	//【C-CWMS-0041】 出荷検品フラグの更新に「出荷検品ワーク」を使用するから「出荷ピッキングワーク」に変更 2015/09/14 Nay Zaw Update Start
	/**
	 * <h2>出荷ピッキングワークを更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークのデータを取得し、
	 * 検品済数、出庫フラグ、スキップ回数を設定後、出荷ピッキングワークを更新する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス・出庫作業No.・ロケーションID
	 *                                               ・商品ID・ロットID・検品済数・出庫フラグ・スキップ回数
	 */
	public void updateWkPickingFlg(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
	//  wHtShippingPickingCB.query().setSpgInspectionFlg_Equal(wHtShippingPicking.getSpgInspectionFlg());  //不要
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setLocationId_Equal(wHtShippingPicking.getLocationId());
		wHtShippingPickingCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		wHtShippingPickingCB.query().setLotId_Equal(wHtShippingPicking.getLotId());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		//出荷検品ワークテーブル更新
		List<WHtShippingPicking> updList = new ArrayList<WHtShippingPicking>();
		for(WHtShippingPicking updHtShipping:lstWHtShippingPicking){
			updHtShipping.setSpgQtyOns(wHtShippingPicking.getSpgQtyOns());
			updHtShipping.setPickingFlg(wHtShippingPicking.getPickingFlg());
			updHtShipping.setSkipNum(wHtShippingPicking.getSkipNum());
			updList.add(updHtShipping);
		}
		wHtShippingPickingBhv.batchUpdate(updList);

		return;
	}

	/**
	 * <h2>出荷ピッキングワークを更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークのデータを取得し、【出荷共通.出庫作業No.か出荷梱包No.かのチェック】を行う。
	 * 出庫作業No. の場合
	 *  出庫ボディからデータを検索し、出庫数の合計数と【バラオーダーピッキング検品(商品)チェック.検品済数取得】の検品済数が一致した場合、
	 *  梱包ボディの出庫フラグを"1"(出庫済)で更新する。
	 *  【バラオーダーピッキング検品(商品)チェック.全てピッキング済の判定】を行って、結果を返す。
	 *  出庫作業NO.の単位で全てピッキング済の場合、【出荷共通.出荷ステータスの更新】（出庫ステータス：ピッキング済）を呼び出す。
	 *
	 *
	 * 出荷梱包No.の場合
	 *  梱包ボディからデータを検索し、梱包数の合計数と【バラオーダーピッキング検品(商品)チェック.検品済数取得】の検品済数が一致した場合、
	 *  梱包ボディの出庫フラグを"1"(出庫済)で更新する。
	 * 【バラオーダーピッキング検品(商品)チェック.全てピッキング済の判定】を行って、結果を返す。
	 *  出荷梱包No.の単位で全てピッキング済の場合、【出荷共通.出荷ステータスの更新】（梱包ステータス：ピッキング済）を呼び出す。
	 *
	 *
	 * 【出荷共通.出庫作業No.か出荷梱包No.かのチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShippingPicking) 出庫作業No.か出荷梱包No.かのチェックメソッド}を呼び出す。
	 *
	 * 【バラオーダーピッキング検品(商品)チェック.検品済数取得】
	 * ・{@link ShippingPickingProductCheckLogic#selectSpgQtyOns(WHtShippingPicking) 検品済数取得メソッド}を呼び出す。
	 *
	 * 【バラオーダーピッキング検品(商品)チェック.全てピッキング済の判定】
	 * ・{@link ShippingPickingProductCheckLogic#checkAllPickingFlg(WHtShippingPicking) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * 【出荷共通.出荷ステータスの更新】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShippingPicking, CDef.CenterPickingStatus) 出荷ステータスの更新メソッド}を呼び出す。
	 *
	 * 【出荷共通.出荷ステータスの更新】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShippingPicking, CDef.CenterPackingStatus) 出荷ステータスの更新メソッド}を呼び出す。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス・出庫作業No.・ロケーションID・商品ID・ロットID
	 * @return boolean true:全てピッキング済;false:一部ピッキング済
	 */
	public boolean updatePickingFlg(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setLocationId_Equal(wHtShippingPicking.getLocationId());
		wHtShippingPickingCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		wHtShippingPickingCB.query().setLotId_Equal(wHtShippingPicking.getLotId());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		WHtShippingPicking entity = lstWHtShippingPicking.get(0);
		boolean complete = false;

		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.15 NayZaw Start

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// [SK2-026] 同一出荷作業Noの同一入庫ラベルNoで複数伝票を入れることができるため、それらのデータをすべて更新する watanabe Start
			TPickingBCB pickingBCB = tPickingBBhv.newMyConditionBean();
			pickingBCB.query().queryTPickingH().setCenterId_Equal(entity.getCenterId());
			pickingBCB.query().queryTPickingH().setClientId_Equal(entity.getClientId());
			pickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(entity.getPickingWorkNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			pickingBCB.query().queryTStock().queryMLocation().setLocationId_Equal(entity.getLocationId());
			pickingBCB.query().queryTStock().queryMProduct().setProductId_Equal(entity.getProductId());
			pickingBCB.query().queryTStock().queryTLot().setLotId_Equal(entity.getLotId());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			// [C-CWMS-0051] 荷姿がケース以外を検索  2015.12.17 NayZaw Start
			pickingBCB.query().setShapeId_IsNull();
			// [C-CWMS-0051] 荷姿がケース以外を検索  2015.12.17 NayZaw End

			List<TPickingB> tmpPickBEntity = tPickingBBhv.selectList(pickingBCB);
			BigDecimal sumPickNum = WCC.ZERO;
			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
			ArrayList<Long> pickingBIdList = new ArrayList<Long>();
			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
			for (TPickingB tmpPickB : tmpPickBEntity) {
				sumPickNum = WCC.add(sumPickNum, tmpPickB.getPickingNum());
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
				pickingBIdList.add(tmpPickB.getPickingBId());
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
			}
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			if (WCC.isEqual(sumPickNum, checkLogic.selectSpgQtyOns(wHtShippingPicking))) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End

				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

				// ===== 出庫フラグを出庫済に変更 =====

				// 更新条件
				TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
				packingBCb.checkInvalidQuery();
				packingBCb.query().setPickingBId_InScope(pickingBIdList);
				// 更新値(出庫フラグ)
				TPackingB updatePackingB = new TPackingB();
				updatePackingB.setPickingFlg_$1();
				// 出庫ボディ 更新実行
				tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
			}
			//全件完了したかチェック
			complete = checkLogic.checkAllPickingFlg(wHtShippingPicking);
			if (complete) {
				//ピッキング完了
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				shippingLogic.updatePickingStatus(wHtShippingPicking, CDef.PickingStatus.$35);
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			}
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			TPackingBCB packingBCB = tPackingBBhv.newMyConditionBean();
			packingBCB.query().queryTPackingH().setCenterId_Equal(entity.getCenterId());
			packingBCB.query().queryTPackingH().setClientId_Equal(entity.getClientId());
			packingBCB.query().queryTPackingH().setShippingPackingNo_Equal(entity.getPickingWorkNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			packingBCB.query().queryTPickingB().queryTStock().queryMLocation().setLocationId_Equal(entity.getLocationId());
			packingBCB.query().queryTPickingB().queryTStock().queryMProduct().setProductId_Equal(entity.getProductId());
			packingBCB.query().queryTPickingB().queryTStock().queryTLot().setLotId_Equal(entity.getLotId());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			List<TPackingB> tmpPackBEntity = tPackingBBhv.selectList(packingBCB);
			BigDecimal sumPickNum = WCC.ZERO;
			ArrayList<Long> packingBIdList = new ArrayList<Long>();
			for (TPackingB tmpPackB : tmpPackBEntity) {
				sumPickNum = WCC.add(sumPickNum, tmpPackB.getPackingNum());
				packingBIdList.add(tmpPackB.getPackingBId());
				//pickingBIdList.add(tmpPackB.getPickingBId());
			}
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			if (WCC.isEqual(sumPickNum, checkLogic.selectSpgQtyOns(wHtShippingPicking))) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				// ===== 出庫フラグを出庫済に変更 =====

				// 更新条件
				TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
				packingBCb.checkInvalidQuery();
				packingBCb.query().setPackingBId_InScope(packingBIdList);
				// 更新値(出庫フラグ)
				TPackingB updatePackingB = new TPackingB();
				updatePackingB.setPickingFlg_$1();
				// 出庫ボディ 更新実行
				tPackingBBhv.queryUpdate(updatePackingB, packingBCb);
			}
			//全件完了したかチェック
			complete = checkLogic.checkAllPickingFlg(wHtShippingPicking);
			if (complete) {
				//ピッキング完了
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				shippingLogic.updatePackingStatus(wHtShippingPicking, CDef.PackingStatus.$35);
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			}

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		return complete;
		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.15 NayZaw End
	}
}