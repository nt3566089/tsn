package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsPUserPrintSettingDto;

/**
 * The entity of p_user_print_setting.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PUserPrintSettingDto extends BsPUserPrintSettingDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// [#6677][v3.1] 端末別印刷設定情報の保存機能の追加 2019.10.07 kawana Start
	/** 端末識別CD */
	private String terminalAssignCd;
	// [#6677][v3.1] 端末別印刷設定情報の保存機能の追加 2019.10.07 kawana End

	public String getTerminalAssignCd() {
		return terminalAssignCd;
	}

	public void setTerminalAssignCd(String terminalAssignCd) {
		this.terminalAssignCd = terminalAssignCd;
	}
}
