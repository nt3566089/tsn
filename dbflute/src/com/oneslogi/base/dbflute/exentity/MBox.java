package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMBox;

/**
 * The entity of M_BOX.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MBox extends BsMBox {

	/** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	/** 標準荷材フラグ */
	private Boolean standardFlg;

	/**
	 * @return standardFlg
	 */
	public Boolean getStandardFlg() {
		return standardFlg;
	}

	/**
	 * @param standardFlg セットする standardFlg
	 */
	public void setStandardFlg(Boolean standardFlg) {
		this.standardFlg = standardFlg;
	}
}
