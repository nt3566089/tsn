package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBItemRoleDto;

/**
 * The entity of B_ITEM_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BItemRoleDto extends BsBItemRoleDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** 権限CD */
	private String roleCd;
	/** 画面CD */
    private String screenCd;

	public String getScreenCd() {
		return screenCd;
	}

	public void setScreenCd(String screenCd) {
		this.screenCd = screenCd;
	}

	public String getRoleCd() {
		return roleCd;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

}
