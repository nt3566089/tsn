package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * バラ出荷検品(出庫作業No入力)画面情報を保持します
 *
 */
public class ShippingNoPackingWorkNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start					

	/** 出庫作業No */
	@QueryParam("pickingWorkNo")
	private String pickingWorkNo;

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End	 				

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
