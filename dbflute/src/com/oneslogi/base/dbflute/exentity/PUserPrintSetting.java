package com.oneslogi.base.dbflute.exentity;

import java.util.Set;

import com.oneslogi.base.dbflute.bsentity.BsPUserPrintSetting;

/**
 * The entity of p_user_print_setting.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PUserPrintSetting extends BsPUserPrintSetting {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;


	// [#6677][v3.1] 端末別印刷設定情報の保存機能の追加 2019.10.07 kawana Start
	/** 端末識別CD */
	private String terminalAssignCd;

	/**
	 * 変更列のリセット
	 * @param modifiedPropertyNames 新規変更列の列名リスト
	 */
	public void resetMymodifiedProperties(Set<String> modifiedPropertyNames) {

		clearModifiedInfo();
		for (String propName : modifiedPropertyNames) {
			registerModifiedProperty(propName);
		}
	}
	// [#6677][v3.1] 端末別印刷設定情報の保存機能の追加 2019.10.07 kawana End

	public String getTerminalAssignCd() {
		return terminalAssignCd;
	}

	public void setTerminalAssignCd(String terminalAssignCd) {
		this.terminalAssignCd = terminalAssignCd;
	}

}
