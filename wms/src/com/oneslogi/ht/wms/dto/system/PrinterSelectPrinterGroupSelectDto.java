package com.oneslogi.ht.wms.dto.system;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * @author za.nay.km
 *
 */
public class PrinterSelectPrinterGroupSelectDto extends HandyBaseDto {

	/** プリンタグループ */
	@QueryParam("printerGroupId")
	private Long printerGroupId;

	/**
	 * @return printerGroupId
	 */
	public Long getPrinterGroupId() {
		return printerGroupId;
	}

	/**
	 * @param printerGroupId セットする printerGroupId
	 */
	public void setPrinterGroupId(Long printerGroupId) {
		this.printerGroupId = printerGroupId;
	}
}
