package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(預託選択)画面情報を保持します
 *
 */
public class InventoryInputProductKbnDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.03.29 sja Start					

	/** 預託区分 */
	@QueryParam("deposit")
	private String deposit;

	/** 在庫区分 */
	@QueryParam("stockType")
	private String stockType;

	// [#575] ValidateチェックのHT国際化 2017.03.29 sja End					

	/**
	 * @return deposit
	 */
	public String getDeposit() {
		return deposit;
	}

	/**
	 * @param deposit セットする deposit
	 */
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

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
