package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsWSglRowShipInspB;

/**
 * The entity of w_sgl_row_ship_insp_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspB extends BsWSglRowShipInspB {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	/** 出庫作業メッセージ **/
	private String pickingWorkMessage;
	public static final String ALIAS_pickingWorkMessage = "PICKING_WORK_MESSAGE";

	/** 入力ソースCD */
	private String inputJanCd;

	// ========== 以下、セッタ・ゲッタ ==========

	public String getPickingWorkMessage() {
		return pickingWorkMessage;
	}

	public void setPickingWorkMessage(String pickingWorkMessage) {
		this.pickingWorkMessage = pickingWorkMessage;
	}

	public String getInputJanCd() {
		return inputJanCd;
	}

	public void setInputJanCd(String inputJanCd) {
		this.inputJanCd = inputJanCd;
	}
}
