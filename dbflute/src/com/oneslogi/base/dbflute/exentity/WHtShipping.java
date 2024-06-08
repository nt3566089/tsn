package com.oneslogi.base.dbflute.exentity;

import java.util.LinkedHashSet;

import com.oneslogi.base.dbflute.bsentity.BsWHtShipping;

/**
 * The entity of w_ht_shipping.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtShipping extends BsWHtShipping {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	// ======================================================

    // [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.06 matsumoto Start
    /** 出庫作業メッセージのset */
    private LinkedHashSet<String> spgWorkCommentSet;

	public LinkedHashSet<String> getSpgWorkCommentSet() {
		return spgWorkCommentSet;
	}

	public void setSpgWorkCommentSet(LinkedHashSet<String> spgWorkCommentSet) {
		this.spgWorkCommentSet = spgWorkCommentSet;
	}
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.06 matsumoto End

}
