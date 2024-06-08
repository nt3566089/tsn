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

/**
 * バラオーダーピッキング検品更新ロジッククラス
 */
public class ShippingPickingUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingLogic shippingLogic;

	@Inject
	private ShippingPickingCheckLogic checkLogic;

	//【C-CWMS-0041】「出庫フラグの更新」作業で引数を「出荷検品ワーク」から「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE Start

	/**
	 * <h2>出荷ピッキングワークデータを更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークテーブルを取得し、
	 * 荷姿IDが空白(ケース荷姿以外)の出庫ボディデータを取得する。
	 * 出庫数の合計値を計算し、【バラオーダーピッキング検品チェック.ピッキング済数取得】と一致する場合、
	 * 梱包ボディの 出庫フラグを"1"(出庫済)で更新する。
	 *
	 * 【バラオーダーピッキング検品チェック.全てピッキング済の判定】を行って、結果を返す。
	 * 全部出庫済の場合、【出荷共通ロジック.出荷ステータス更新】（出庫ステータス：ピッキング済）を行う。
	 *
	 * 【バラオーダーピッキング検品チェック.ピッキング済数取得】
	 * ・{@link ShippingPickingCheckLogic#selectSpgQtyOns(WHtShippingPicking) ピッキング済数取得メソッド}を呼び出す。
	 *
	 * 【バラオーダーピッキング検品チェック.全てピッキング済の判定】
	 * ・{@link ShippingPickingCheckLogic#checkAllPickingFlg(WHtShippingPicking) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShippingPicking, CDef.CenterPickingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス・出庫作業No.・入庫ラベルNo.
	 * @return boolean true:出庫作業No.全部ピッキング済;false:出庫作業No.一部ピッキング済
	 */
	public boolean updatePickingFlg(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		WHtShippingPicking entity = lstWHtShippingPicking.get(0);
		// [SK2-026] 同一出荷作業Noの同一入庫ラベルNoで複数伝票を入れることができるため、それらのデータをすべて更新する watanabe Start
		TPickingBCB pickingBCB = tPickingBBhv.newMyConditionBean();
		pickingBCB.query().queryTPickingH().setCenterId_Equal(entity.getCenterId());
		pickingBCB.query().queryTPickingH().setClientId_Equal(entity.getClientId());
		pickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(entity.getPickingWorkNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		pickingBCB.query().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(entity.getStoreLabelNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// [C-CWMS-0051] 荷姿がケース以外を検索  2015.12.17 NayZaw Start
		pickingBCB.query().setShapeId_IsNull();
		// [C-CWMS-0051] 荷姿がケース以外を検索  2015.12.17 NayZaw End

		List<TPickingB> tmpPickBEntity = tPickingBBhv.selectList(pickingBCB);
		BigDecimal sumPickNum = WCC.ZERO;
		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
		ArrayList<Long> pickingBIdList = new ArrayList<Long>();
		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

		for(TPickingB tmpPickB:tmpPickBEntity){
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
		// [SK2-026] 同一出荷作業Noの同一入庫ラベルNoで複数伝票を入れることができるため、それらのデータをすべて更新する watanabe End

		boolean complete = checkLogic.checkAllPickingFlg(wHtShippingPicking);
		if (complete) {
			//ピッキング完了
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePickingStatus(wHtShippingPicking, CDef.PickingStatus.$35);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}

		return complete;
	}

	// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.16 NayZaw Start
	/**
	 * <h2>出荷ピッキングワークデータを更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークテーブルを取得し、梱包ボディデータを取得する。
	 * 梱包数の合計値を計算し、【バラオーダーピッキング検品チェック.ピッキング済数取得】と一致する場合、
	 * 梱包ボディの 出庫フラグを"1"(出庫済)で更新する。
	 *
	 * 【バラオーダーピッキング検品チェック.全てピッキング済の判定】を行って、結果を返す。
	 * 全部出庫済の場合、【出荷共通ロジック.出荷ステータス更新】（梱包ステータス：ピッキング済）を呼出す。
	 *
	 * 【バラオーダーピッキング検品チェック.ピッキング済数取得】
	 * ・{@link ShippingPickingCheckLogic#selectSpgQtyOns(WHtShippingPicking) ピッキング済数取得メソッド}を呼び出す。
	 *
	 * 【バラオーダーピッキング検品チェック.全てピッキング済の判定】
	 * ・{@link ShippingPickingCheckLogic#checkAllPickingFlg(WHtShippingPicking) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShippingPicking, CDef.CenterPackingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・MACアドレス・荷主ID・センタID・入庫ラベルNo.
	 * @return boolean true:出庫作業NO全部出庫済;false:出庫作業NO一部出庫済
	 */
	public boolean updatePickingFlgByPackingNo(WHtShippingPicking wHtShippingPicking){
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		WHtShippingPicking entity = lstWHtShippingPicking.get(0);

		//出荷梱包No.で検品する場合の処理
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(entity.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(entity.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(entity.getPickingWorkNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(entity.getStoreLabelNo());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		List<TPackingB> tmpPackBEntity = tPackingBBhv.selectList(tPackingBCB);
		BigDecimal sumPackNum = WCC.ZERO;

		ArrayList<Long> packingBIdList = new ArrayList<Long>();

		for(TPackingB tmpPackB : tmpPackBEntity){
			sumPackNum = WCC.add(sumPackNum, tmpPackB.getPackingNum());
			packingBIdList.add(tmpPackB.getPackingBId());
		}

		// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
		if(WCC.isEqual(sumPackNum, checkLogic.selectSpgQtyOns(wHtShippingPicking))){
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
		boolean complete = checkLogic.checkAllPickingFlg(wHtShippingPicking);
		if (complete) {
			//ピッキング完了
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePackingStatus(wHtShippingPicking, CDef.PackingStatus.$35);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}

		return complete;
	}
	// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.16 NayZaw End
}