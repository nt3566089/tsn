package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMNumberingCenter;

/**
 * The entity of M_NUMBERING_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MNumberingCenter extends BsMNumberingCenter {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// キャッシュ使用数
	private Long cashUseCount;

    /**
	 * @return cashUseCount
	 */
	public Long getCashUseCount() {
		return cashUseCount;
	}

	/**
	 * @param cashUseCount セットする cashUseCount
	 */
	public void setCashUseCount(Long cashUseCount) {
		this.cashUseCount = cashUseCount;
	}
}
