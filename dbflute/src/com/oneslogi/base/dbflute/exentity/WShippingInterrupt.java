package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsWShippingInterrupt;

/**
 * The entity of w_shipping_interrupt.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WShippingInterrupt extends BsWShippingInterrupt {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public static final String ALIAS_MAX_UNIT_NUM = "MAX_UNIT_NUM";
    private Long maxUnitNum ;
    public Long getMaxUnitNum() {
		return maxUnitNum;
	}
    public void setMaxUnitNum(Long maxUnitNum) {
		this.maxUnitNum = maxUnitNum;
	}

}
