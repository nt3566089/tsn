package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTPicMthdRcmdData;

/**
 * The entity of t_pic_mthd_rcmd_data.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdData extends BsTPicMthdRcmdData {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public static final String ALIAS_slipNum = "SLIP_NUM";
	public static final String ALIAS_emergencyFlg = "EMERGENCY_FLG";

	/** 伝票枚数 */
	private Long slipNum;
	/** 緊急フラグ */
	private String emergencyFlg;
	/** 緊急フラグ名称 */
	private String emergencyFlgNm;

	// ===== 以下、ゲッタとフッタ =====

	public Long getSlipNum() {
		return slipNum;
	}

	public void setSlipNum(Long slipNum) {
		this.slipNum = slipNum;
	}

	public String getEmergencyFlg() {
		return emergencyFlg;
	}

	public void setEmergencyFlg(String emergencyFlg) {
		this.emergencyFlg = emergencyFlg;
	}

	public String getEmergencyFlgNm() {
		return emergencyFlgNm;
	}

	public void setEmergencyFlgNm(String emergencyFlgNm) {
		this.emergencyFlgNm = emergencyFlgNm;
	}
}
