package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(入庫No.入力)画面の情報を保持します。
 *
 */
public class ShippingPickingStoreLabelNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.13 sja Start					

	/** 入庫No */
	@QueryParam("storeLabelNo")
	public String storeLabelNo;

	// [#575] ValidateチェックのHT国際化 2017.02.13 sja End					

	/**
	 * @return storeLabelNo
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	/**
	 * @param storeLabelNo セットする storeLabelNo
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

}
