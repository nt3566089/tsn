package com.oneslogi.ht.wms.dto.stock;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫移動入庫(先ロケ入力)画面情報を保持します
 *
 */
public class StockMoveOutInLocDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start					

	/** ロケ */
	@QueryParam("locationCd")
	private String locationCd;

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja End					

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
