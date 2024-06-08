package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(JAN入力)画面の情報を保持します。
 *
 */
public class ShippingPickingProductJanCdDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start					

	/** JAN/商品 */
	@QueryParam("janCd")
	public String janCd;

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
	public void setJan(String janCd) {
		this.janCd = janCd;
	}

}
