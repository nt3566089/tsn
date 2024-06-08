package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

public class ShippingLoadingInspectionNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.15 sja Start					

	@QueryParam("traceOrPackingNo")
	private String traceOrPackingNo;

	// [#575] ValidateチェックのHT国際化 2017.02.15 sja Start					

	/**
	 * @return traceOrPackingNo
	 */
	public String getTraceOrPackingNo() {
		return traceOrPackingNo;
	}

	/**
	 * @param traceOrPackingNo セットする traceOrPackingNo
	 */
	public void setTraceOrPackingNo(String traceOrPackingNo) {
		this.traceOrPackingNo = traceOrPackingNo;
	}
}
