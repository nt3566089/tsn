package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(在庫区分選択)画面情報を保持します
 *
 */
public class InventoryInputProductStockTypeSelectDto extends HandyBaseDto {

	/** 在庫区分 */
	@QueryParam("stockType")
	private String stockType;

	/**
	 * @return stockType
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param stockType セットする stockType
	 */
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

}
