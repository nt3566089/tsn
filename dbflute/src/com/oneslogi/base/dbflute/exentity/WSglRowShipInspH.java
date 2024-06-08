package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsWSglRowShipInspH;

/**
 * The entity of w_sgl_row_ship_insp_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspH extends BsWSglRowShipInspH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	/** 倉庫CD */
	private String warehouseCd;

	/** ゾーンCD */
	private String zoneCd;

	/** ユーザID */
	private Long userId;

	/** ユーザCD */
	private String userCd;

	// ========== 以下、セッタ・ゲッタ ==========

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getZoneCd() {
		return zoneCd;
	}

	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}
}
