package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsWHtShippingPicking;

/**
 * The entity of w_ht_shipping_picking.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingPicking extends BsWHtShippingPicking {

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

    // [Ver3.0] unit of measure対応 2017.11.29 王 Start

    protected Long _unitNum;

    public Long getUnitNum() {
        return _unitNum;
    }

    public void setUnitNum(Long _unitNum) {
        this._unitNum = _unitNum;
    }
 // [Ver3.0] unit of measure対応 2017.11.29 王 End
}
