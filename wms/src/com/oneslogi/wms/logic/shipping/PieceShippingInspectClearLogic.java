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
 * 出荷検品クリア処理クラス
 */
public class PieceShippingInspectClearLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;
	// [C-CWMS-0051] 出荷梱包No.で検品する為、処理追加 2015/12/03 NayZaw Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	// [C-CWMS-0051] 出荷梱包No.で検品する為、処理追加 2015/12/03 NayZaw End

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

		// [C-CWMS-0051] 出荷梱包No.で検品する為、処理追加 2015/12/03 NayZaw Start

		// ===== 更新データを取得する =====
		// 荷主ID、センタID、出庫作業No.の取得
		long clientId = tPickingH.getClientId();
		long centerId = tPickingH.getCenterId();
		String pickingWorkNo = tPickingH.getPickingWorkNo();

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (commonLogic.isPickingWorkNo(centerId, pickingWorkNo)) {
			// 出庫作業No.で検品する場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
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

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, pickingWorkNo)) {
			//出荷梱包No．で検品する場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
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
		// [C-CWMS-0051] 出荷梱包No.で検品する為、処理追加 2015/12/03 NayZaw End

		// ===== 出荷検品中断の削除実行 =====
		//W_SHIPPING_INTERRUPT
		WShippingInterruptCB wShippingInterruptCB = wShippingInterruptBhv.newMyConditionBean();
		wShippingInterruptCB.checkInvalidQuery();
		wShippingInterruptCB.query().setClientId_Equal(clientId);
		wShippingInterruptCB.query().setCenterId_Equal(centerId);
		wShippingInterruptCB.query().setPickingWorkNo_Equal(pickingWorkNo);
		wShippingInterruptBhv.queryDelete(wShippingInterruptCB);
	}
}
