package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力(期限日入力)画面情報を保持します
 *	
 */
public class InventoryInputProductLimitDtDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start					

	/** 期限日 */
	@QueryParam("limitDt")
	private String limitDt;

	// [#575] ValidateチェックのHT国際化 2017.02.22 sja End					

	/**
	 * @return limitDt
	 */
	public String getLimitDt() {
		return limitDt;
	}

	/**
	 * @param limitDt セットする limitDt
	 */
	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}
}
