package com.oneslogi.ht.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.dbflute.exentity.WShippingInterrupt;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

// 【C-CWMS-0040】 「出荷検品中断」テーブルのデータクリア  2015/09/11  Nay Zaw Start
/**
 * バラ出荷検品（梱包計算なし）クリアロジッククラス
 */
public class ShippingNoPackingClearLogic extends AbstractWmsLogic {

	// 【C-CWMS-0040】 「出荷検品中断」テーブルのデータクリア  2015/09/11  Nay Zaw Start

	// ===== 使用テーブル =====
	/* 出荷検品中断 */
	@Inject
	private WShippingInterruptBhv wHtShippingInterruptBhv;

	/**
	 * <h2>出荷検品中断データを削除する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品中断データを取得し、対象データを削除する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・荷主ID・センタID
	 */
	public void clearWShippingInterrupt(WHtShipping wHtShipping) {
		//出荷検品中断ワークテーブルの取得
		WShippingInterruptCB wShippingInterruptCB = wHtShippingInterruptBhv.newMyConditionBean();
//		wHtShippingInterruptCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wShippingInterruptCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wShippingInterruptCB.query().setClientId_Equal(wHtShipping.getClientId());
		wShippingInterruptCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
//		wHtShippingInterruptCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		List<WShippingInterrupt> lstWShippingInterrupt = wHtShippingInterruptBhv.selectList(wShippingInterruptCB);

		//出荷検品中断テーブルのクリア
		wHtShippingInterruptBhv.batchDelete(lstWShippingInterrupt);
	}
	// 【C-CWMS-0040】 「出荷検品中断」テーブルのデータクリア  2015/09/11  Nay Zaw End
}