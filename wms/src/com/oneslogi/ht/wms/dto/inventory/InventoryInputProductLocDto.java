package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(ロケ入力)画面情報を保持します
 *
 */
public class InventoryInputProductLocDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start					

	/** ロケ */
	@QueryParam("loc")
	private String loc;

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja End					

	/**
	 * @return loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc セットする loc
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
