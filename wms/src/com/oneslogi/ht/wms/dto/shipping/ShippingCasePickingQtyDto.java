package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ケースピッキング(数量入力)画面の情報を保持します。
 *
 */
public class ShippingCasePickingQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
	// [Ver3.0] unit of measure対応 2017.11.29 王 Start
	/** ケース数 */
	@QueryParam("qty")
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.29 王 End
	// [Ver3.0] unit of measure対応 2017.11.27 王 Del

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End
	// [Ver3.0] unit of measure対応 2017.11.29 王 Start
	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty セットする qty
	 */
	public void setCaseNum(String qty) {
		this.qty = qty;
	}
	// [Ver3.0] unit of measure対応 2017.11.29 王 End
	// [Ver3.0] unit of measure対応 2017.11.27 王 Del

}
