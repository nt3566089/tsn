package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsHInventoryB;

/**
 * The entity of H_INVENTORY_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HInventoryB extends BsHInventoryB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // Parameter修正 2016.10.17 Myo Min Oo Add Start
    //  ロケーション(From)
    private String locationCdFrom;

	// ロケーション(To)
    private String locationCdTo;

	// 期限日(From)
    private String limitDtFrom;

	// 期限日(To)
    private String limitDtTo;

	// 入庫日(From)
    private String storeDtFrom;

	// 入庫日(To)
    private String storeDtTo;

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

	public String getStoreDtFrom() {
		return storeDtFrom;
	}

	public void setStoreDtFrom(String storeDtFrom) {
		this.storeDtFrom = storeDtFrom;
	}

	public String getStoreDtTo() {
		return storeDtTo;
	}

	public void setStoreDtTo(String storeDtTo) {
		this.storeDtTo = storeDtTo;
	}
	// Parameter修正 2016.10.17 Myo Min Oo Add End
}
