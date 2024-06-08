package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBColRole;

/**
 * The entity of B_COL_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BColRole extends BsBColRole {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** 画面CD */
    private String screenCd;
    /** 項目CD */
    private String itemCd;
    /**権限CD*/
    private String roleCd;


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
	public String getItemCd() {
		return itemCd;
	}
	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}
}
