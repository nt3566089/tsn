package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBItemRole;

/**
 * The entity of B_ITEM_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BItemRole extends BsBItemRole {
	/** 権限CD */
	 private String roleCd;

	 /** 画面CD */
	private String screenCd;

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    public String getRoleCd() {
		return roleCd;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

	public String getScreenCd() {
		return screenCd;
	}

	public void setScreenCd(String screenCd) {
		this.screenCd = screenCd;
	}
}
