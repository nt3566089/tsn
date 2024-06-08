package com.oneslogi.base.dbflute.exentity;

import java.util.Set;

import com.oneslogi.base.dbflute.bsentity.BsPTerminalPrintSetting;

/**
 * The entity of p_terminal_print_setting.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PTerminalPrintSetting extends BsPTerminalPrintSetting {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

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
}
