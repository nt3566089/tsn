package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品格納(数量)画面の情報を保持します。
 *
 */
public class ReceiveInspecStoreQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja Start
	// [Ver3.0] unit of measure対応 2017.11.27 王 Start
	/** 数量 */
	@QueryParam("qty")
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.27 王 End

	// [Ver3.0] unit of measure対応 2017.11.27 王 Del

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja End
	// [Ver3.0] unit of measure対応 2017.11.27 王 Start
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
	}
	// [Ver3.0] unit of measure対応 2017.11.27 王 End

	// [Ver3.0] unit of measure対応 2017.11.27 王 Del

}