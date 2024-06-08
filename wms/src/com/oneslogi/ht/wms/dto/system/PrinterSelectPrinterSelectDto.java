package com.oneslogi.ht.wms.dto.system;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * @author za.nay.km
 *
 */
public class PrinterSelectPrinterSelectDto extends HandyBaseDto {
	/** プリンタ */
	@QueryParam("printerId")
	private Long printerId;

	/**
	 * @return printerId
	 */
	public Long getPrinterId() {
		return printerId;
	}

	/**
	 * @param printerId セットする printerId
	 */
	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}
}
