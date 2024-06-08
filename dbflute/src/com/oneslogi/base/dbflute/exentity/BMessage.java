package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBMessage;

/**
 * The entity of B_MESSAGE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BMessage extends BsBMessage {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MHtMessage chaseMHtMessageAsOne() {
		return _mHtMessageAsOne != null ? _mHtMessageAsOne : new MHtMessage();
	}

	// ======================================================

    private String cultureCd;

	public String getCultureCd() {
		return cultureCd;
	}

	public void setCultureCd(String cultureCd) {
		this.cultureCd = cultureCd;
	}
}
