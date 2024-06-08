package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsHShippingBDto;

/**
 * The entity of H_SHIPPING_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HShippingBDto extends BsHShippingBDto {

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

    // [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
 	// 指定ロケーションNM(From)
    private String locationNmFrom;

 	// 指定ロケーションNM(To)
    private String locationNmTo;
    // [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

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

 	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	public String getLocationNmFrom() {
		return locationNmFrom;
	}

	public void setLocationNmFrom(String locationNmFrom) {
		this.locationNmFrom = locationNmFrom;
	}

	public String getLocationNmTo() {
		return locationNmTo;
	}

	public void setLocationNmTo(String locationNmTo) {
		this.locationNmTo = locationNmTo;
	}
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
}
