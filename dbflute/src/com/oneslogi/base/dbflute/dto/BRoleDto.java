package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBRoleDto;

/**
 * The entity of B_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BRoleDto extends BsBRoleDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** 権限グループ名 */
    private String dictName;
    private String roleNm;
	public String getRoleNm() {
		return roleNm;
	}
	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
}
