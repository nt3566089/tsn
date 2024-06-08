package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(出庫作業No入力)画面の情報を保持します。
 *
 */
public class ShippingPickingWorkNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.13 sja Start					

	/** 出庫作業No */
	@QueryParam("pickingWorkNo")
	public String pickingWorkNo;

	// [#575] ValidateチェックのHT国際化 2017.02.13 sja End					

	/**
	 * @return pickingWorkNo
	 */
	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	/**
	 * @param pickingWorkNo セットする pickingWorkNo
	 */
	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}


}
