package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMShape;

/**
 * The entity of M_SHAPE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MShape extends BsMShape {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public VDict chaseVDictByShapeDictId() {
		return _vDictByShapeDictId != null ? _vDictByShapeDictId : new VDict();
	}

	// ======================================================
}
