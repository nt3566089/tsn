package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ケースピッキング(入庫No.入力)画面の情報を保持します。
 *
 */
public class ShippingCasePickingStoreLabelNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start					

	/** 入庫No */
	@QueryParam("storeLabelNo")
	public String storeLabelNo;

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End					

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
