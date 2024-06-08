package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTStoreNo;

/**
 * The entity of t_store_no.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStoreNo extends BsTStoreNo {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomer() {
		return _mCustomer != null ? _mCustomer : new MCustomer();
	}

	public TStoreNo chaseTStoreNoSelf() {
		return _tStoreNoSelf != null ? _tStoreNoSelf : new TStoreNo();
	}

	// ======================================================
}
