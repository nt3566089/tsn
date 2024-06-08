package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(ロット入力)画面情報を保持します
 *
 */
public class InventoryInputProductLotDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start					

	/** ロット */
	@QueryParam("lot")
	private String lot;

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja End					

	/**
	 * @return lot
	 */
	public String getLot() {
		return lot;
	}

	/**
	 * @param lot セットする lot
	 */
	public void setLot(String lot) {
		this.lot = lot;
	}

}
