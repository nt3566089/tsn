package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * AGV移動完了データ取込更新ロジッククラス
 */
public class AmsMoveResultInputLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;
	/* 梱包ボディ         */
	@Inject
	private TPackingBBhv tPackingBBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingLogic shippingLogic;

	/**
	 * <h2>出荷ピッキングワークデータを更新する。</h2>
	 * <pre>
	 * 引数を条件に出庫ボディデータを取得し、梱包ボディの 出庫フラグを"1"(出庫済)で更新する。
	 * 【出荷共通ロジック.出荷ステータス更新】（出庫ステータス：ピッキング済）を行う。
	 *
	 * 【出荷共通ロジック.出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShippingPicking, CDef.CenterPickingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param pickingWorkNoList 出庫作業No.リスト
	 * @return
	 */
	public void updatePickingFlg(Long clientId, Long centerId, List<String> pickingWorkNoList) {
		ArrayList<Long> pickingBIdList = new ArrayList<Long>();
		List<String> targetNoList = new ArrayList<String>();
		for (String pickingWorkNo : pickingWorkNoList) {
			//更新対象の出荷ボディ抽出
			TPickingBCB pickingBCB = tPickingBBhv.newMyConditionBean();
			pickingBCB.query().queryTPickingH().setCenterId_Equal(centerId);
			pickingBCB.query().queryTPickingH().setClientId_Equal(clientId);
			pickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);
			List<TPickingB> tmpPickBEntity = tPickingBBhv.selectList(pickingBCB);
			for(TPickingB tmpPickB:tmpPickBEntity){
				pickingBIdList.add(tmpPickB.getPickingBId());
				if (!targetNoList.contains(pickingWorkNo)){
					targetNoList.add(pickingWorkNo);
				}
			}
		}

		// ===== 出庫フラグを出庫済に変更 =====
		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();
		packingBCb.query().setPickingBId_InScope(pickingBIdList);
		// 更新値(出庫フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$1();
		// 梱包ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		// ステータスをピッキング完了に更新
		for (String targetNo : targetNoList) {
			WHtShipping wHtShipping = new WHtShipping();
			wHtShipping.setCenterId(centerId);
			wHtShipping.setClientId(clientId);
			wHtShipping.setPickingWorkNo(targetNo);
			shippingLogic.updatePickingStatus(wHtShipping, CDef.PickingStatus.$35);
		}

		return;
	}

	/**
	 * <h2>出荷ピッキングワークデータを更新する。</h2>
	 * <pre>
	 * 引数を条件に梱包ボディデータを取得し、梱包ボディの 出庫フラグを"1"(出庫済)で更新する。
	 * 【出荷共通ロジック.出荷ステータス更新】（梱包ステータス：ピッキング済）を呼出す。
	 *
	 * 【出荷共通ロジック.出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShippingPicking, CDef.CenterPackingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param shippingPackingNoList 出荷梱包No.リスト
	 * @return
	 */
	public boolean updatePickingFlgByPackingNo(Long clientId, Long centerId, List<String> shippingPackingNoList){
		//出荷梱包No.で検品する場合の処理
		ArrayList<Long> packingBIdList = new ArrayList<Long>();
		List<String> targetNoList = new ArrayList<String>();
		for (String shippingPackingNo : shippingPackingNoList) {
			//更新対象の梱包ボディ抽出
			TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
			tPackingBCB.query().queryTPackingH().setCenterId_Equal(clientId);
			tPackingBCB.query().queryTPackingH().setClientId_Equal(centerId);
			tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);
			List<TPackingB> tmpPackBEntity = tPackingBBhv.selectList(tPackingBCB);
			for(TPackingB tmpPackB : tmpPackBEntity){
				packingBIdList.add(tmpPackB.getPackingBId());
				targetNoList.add(shippingPackingNo);
			}
		}

		// ===== 出庫フラグを出庫済に変更 =====
		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();
		packingBCb.query().setPackingBId_InScope(packingBIdList);
		// 更新値(出庫フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$1();
		// 梱包ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		// ステータスをピッキング完了に更新
		for (String targetNo : targetNoList) {
			WHtShipping wHtShipping = new WHtShipping();
			wHtShipping.setCenterId(centerId);
			wHtShipping.setClientId(clientId);
			wHtShipping.setPickingWorkNo(targetNo);
			shippingLogic.updatePackingStatus(wHtShipping, CDef.PackingStatus.$35);
		}
		return true;
	}
}