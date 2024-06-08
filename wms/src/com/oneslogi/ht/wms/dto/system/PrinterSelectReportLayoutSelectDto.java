package com.oneslogi.ht.wms.dto.system;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * @author za.nay.km
 *
 */
public class PrinterSelectReportLayoutSelectDto extends HandyBaseDto {

	/** 帳票レイアウト */
	@QueryParam("reportLayoutId")
	private Long reportLayoutId;

	/**
	 * @return reportLayout
	 */
	public Long getReportLayoutId() {
		return reportLayoutId;
	}

	/**
	 * @param reportLayout セットする reportLayout
	 */
	public void setReportLayoutId(Long reportLayoutId) {
		this.reportLayoutId = reportLayoutId;
	}


}
