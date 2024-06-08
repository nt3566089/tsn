package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBRole;

/**
 * The entity of B_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BRole extends BsBRole {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 権限グループ名 */
    private String dictName;

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
}
