package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入庫格納(数量)画面の情報を保持します。
 *
 */
public class ReceiveStoreQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start					

	/** 格納数 */
	@QueryParam("qty")
	public String qty;

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja End				

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
