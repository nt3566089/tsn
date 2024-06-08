package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 単行出荷検品クリア処理クラス
 */
public class SingleRowShippingInspectClearLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private ShippingCommonLogic commonLogic;

	/**
	 * <h2>出荷検品をクリアする。</h2>
	 * <pre>
	 * 【出荷検品データ取得.出庫作業No.の採番固定値取得】、【出荷検品データ取得.出荷梱包No.の採番固定値取得】を行って、
	 * 採番固定値より、出庫作業No.か出荷梱包No.かを判断する。
	 * 出庫作業No.で検品する場合、出庫ヘッダから対象データを取得し、
	 * 【出荷ステータス更新.出荷検品キャンセル】を行う。
	 *
	 * 出荷梱包No.で検品する場合、梱包ヘッダから対象データを取得し、
	 * 【出荷ステータス更新.出荷検品キャンセル(出荷梱包No．で検品する場合)】を行う。
	 * 最後に、 出荷検品中断のデータを削除する。
	 *
	 *【出荷ステータス更新.出荷検品キャンセル】
	 *・{@link ShipStatusUpdateLogic#inspectCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品キャンセルテータス更新メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新.出荷検品キャンセル(出荷梱包No．で検品する場合)】
	 *・{@link ShipStatusUpdateLogic#packingInspectCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品キャンセル(出荷梱包No．で検品する場合)ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(TAllocInstH tAllocInstH,
			TPickingH tPickingH,
			ErrorStatus errSts) {


		// ===== 更新データを取得する =====
		// 荷主ID、センタID、出庫作業No.の取得
		long clientId = tPickingH.getClientId();
		long centerId = tPickingH.getCenterId();
		String pickingWorkNo = tPickingH.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, pickingWorkNo)) {
			// 出庫作業No.で検品する場合

			// 処理対象テーブル(出庫ヘッダ)
			List<TPickingH> tPickingHList = null;
			TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
			tPickingHCB.checkInvalidQuery();
			tPickingHCB.query().setClientId_Equal(clientId);
			tPickingHCB.query().setCenterId_Equal(centerId);
			tPickingHCB.query().setPickingWorkNo_Equal(pickingWorkNo);
			tPickingHList = tPickingHBhv.selectList(tPickingHCB);

			// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品キャンセルメッソドを呼出し =====
			shipStatusUpdateLogic.inspectCancel(tPickingHList, errSts);

		} else if (commonLogic.isShippingPackingNo(centerId, pickingWorkNo)) {
			//出荷梱包No．で検品する場合

			List<TPackingH> tPackingHList = null;
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
			tPackingHCB.checkInvalidQuery();
			tPackingHCB.query().setClientId_Equal(clientId);
			tPackingHCB.query().setCenterId_Equal(centerId);
			tPackingHCB.query().setShippingPackingNo_Equal(pickingWorkNo);
			tPackingHList = tPackingHBhv.selectList(tPackingHCB);
			// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品キャンセルメッソドを呼出し =====
			shipStatusUpdateLogic.packingInspectCancel(tPackingHList, errSts);
		}

		// ===== 出荷検品中断の削除実行 =====
		WShippingInterruptCB wShippingInterruptCB = wShippingInterruptBhv.newMyConditionBean();
		wShippingInterruptCB.checkInvalidQuery();
		wShippingInterruptCB.query().setClientId_Equal(clientId);
		wShippingInterruptCB.query().setCenterId_Equal(centerId);
		wShippingInterruptCB.query().setPickingWorkNo_Equal(pickingWorkNo);
		wShippingInterruptBhv.queryDelete(wShippingInterruptCB);
	}
}
