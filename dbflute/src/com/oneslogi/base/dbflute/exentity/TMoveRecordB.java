package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTMoveRecordB;

/**
 * The entity of T_MOVE_RECORD_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TMoveRecordB extends BsTMoveRecordB {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TMoveInstB chaseTMoveInstB() {
		return _tMoveInstB != null ? _tMoveInstB : new TMoveInstB();
	}

	public TMoveInstH chaseTMoveInstH() {
		return _tMoveInstH != null ? _tMoveInstH : new TMoveInstH();
	}

	// ======================================================
}
