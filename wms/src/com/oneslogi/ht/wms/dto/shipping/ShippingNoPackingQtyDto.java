package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * バラ出荷検品(数量入力)画面情報を保持します
 *
 */
public class ShippingNoPackingQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
	// [Ver3.0] unit of measure対応 2017.11.28 王 Start
	/** 検品数 */
	@QueryParam("qty")
	private String qty;

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}
	// [Ver3.0] unit of measure対応 2017.11.28 王 End
}
