package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBRoleGrpDto;

/**
 * The entity of b_role_grp.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpDto extends BsBRoleGrpDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    private String dictName;

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
}
