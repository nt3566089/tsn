package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(数量入力)画面の情報を保持します。
 *
 */
public class ShippingPickingQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.13 sja Start

	// [Ver3.0] unit of measure対応 2017.11.22 王  Start

	/** 数量 */
	@QueryParam("qty")
	public String qty;

	// [#575] ValidateチェックのHT国際化 2017.02.13 sja End

	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty セットする qty
	 */
	public void setQty(String qty) {
		this.qty = qty;
	// [Ver3.0] unit of measure対応 2017.11.22 王  End
	}

}
