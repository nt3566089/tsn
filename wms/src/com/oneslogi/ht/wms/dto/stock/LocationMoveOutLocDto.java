package com.oneslogi.ht.wms.dto.stock;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ロケ変更(出庫ロケ)画面情報を保持します
 *
 */
public class LocationMoveOutLocDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.21 sja Start					

	/** 出庫ロケ */
	@QueryParam("locationCd")
	private String locationCd;

	// [#575] ValidateチェックのHT国際化 2017.02.21 sja End					

	/**
	 * @return locationCd
	 */
	public String getLocationCd() {
		return locationCd;
	}

	/**
	 * @param locationCd セットする locationCd
	 */
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

}
