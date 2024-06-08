package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(数量入力)画面の情報を保持します。
 *
 */
public class InventoryInputProductQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start					

	/** 数量 */
	@QueryParam("qty")
	public String qty;

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja End					

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

}
