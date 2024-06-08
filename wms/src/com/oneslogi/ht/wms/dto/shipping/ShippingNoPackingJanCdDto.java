package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * バラ出荷検品(JAN入力)画面情報を保持します
 *
 */
public class ShippingNoPackingJanCdDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start					

	/** JANCD */
	@QueryParam("janCd")
	private String janCd;

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End					

	/**
	 * @return janCd
	 */
	public String getJanCd() {
		return janCd;
	}

	/**
	 * @param janCd セットする janCd
	 */
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}


}
