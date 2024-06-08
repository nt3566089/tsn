package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsHStock;

/**
 * The entity of H_STOCK.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HStock extends BsHStock {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // Parameter修正 2016.10.17 Myo Min Oo Add Start
    // 期限日From
    private String limitDtFrom;

 	// 期限日To
    private String limitDtTo;
 	// Parameter修正 2016.10.17 Myo Min Oo Add End

 	// Parameter修正 2016.10.12 Soe Thiha Tun Add Start
 	// ロケーション(From)
    private String locationCdFrom;

	// ロケーション(To)
    private String locationCdTo;
	// Parameter修正 2016.10.12 Soe Thiha Tun Add End

	// Parameter修正 2016.10.17 Myo Min Oo Add Start
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
	// Parameter修正 2016.10.17 Myo Min Oo Add End

	// Parameter修正 2016.10.12 Soe Thiha Tun Add Start
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
	// Parameter修正 2016.10.12 Soe Thiha Tun Add End
}
