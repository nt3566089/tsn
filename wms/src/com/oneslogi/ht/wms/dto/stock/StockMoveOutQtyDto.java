package com.oneslogi.ht.wms.dto.stock;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫移動出庫(数量入力)画面情報を保持します
 *
 */
public class StockMoveOutQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start
	
// [Ver3.0] unit of measure対応 2017.11.22 王  Start
	/** 数量 */
	@QueryParam("qty")
	private String qty;

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja End

	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param instNum セットする instNum
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}
// [Ver3.0] unit of measure対応 2017.11.22 王  End

}
