package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(JAN入力)画面情報を保持します
 *
 */
public class InventoryInputProductJanCdDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start	
	
	/** JAN/商品 */
	@QueryParam("janProdCd")
	private String janProdCd;
	
	// [#575] ValidateチェックのHT国際化 2017.02.22 sja End					

	/**
	 * @return janProdCd
	 */
	public String getJanProdCd() {
		return janProdCd;
	}

	/**
	 * @param janProdCd セットする janProdCd
	 */
	public void setJanProdCd(String janProdCd) {
		this.janProdCd = janProdCd;
	}


}
