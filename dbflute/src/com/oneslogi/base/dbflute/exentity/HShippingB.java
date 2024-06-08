package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsHShippingB;

/**
 * The entity of H_SHIPPING_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HShippingB extends BsHShippingB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // Parameter修正 2016.10.17 Myo Min Oo Add Start
    // 期限日(From)
    private String limitDtFrom;

	// 期限日(To)
    private String limitDtTo;

	// 指定ロケーション(From)
    private String locationCdFrom;

	// 指定ロケーション(To)
    private String locationCdTo;

    public String getLimitDtFrom() {
		return limitDtFrom;
	}

	public void setLimitDtFrom(String limitDtFrom) {
		this.limitDtFrom = limitDtFrom;
	}

	public String getLimitDtTo() {
		return limitDtTo;
	}

	public void setLimitDtTo(String limitDtTo) {
		this.limitDtTo = limitDtTo;
	}

	public String getLocationCdFrom() {
		return locationCdFrom;
	}

	public void setLocationCdFrom(String locationCdFrom) {
		this.locationCdFrom = locationCdFrom;
	}

	public String getLocationCdTo() {
		return locationCdTo;
	}

	public void setLocationCdTo(String locationCdTo) {
		this.locationCdTo = locationCdTo;
	}
	// Parameter修正 2016.10.17 Myo Min Oo Add End
}
