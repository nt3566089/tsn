package com.oneslogi.ht.wms.dto.system;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * @author za.nay.km
 *
 */
public class PrinterSelectTrayDto extends HandyBaseDto {
	/** プリンタ */
	@QueryParam("printerAttributeId")
	private Long printerAttributeId;

	/**
	 * @return printerAttributeId
	 */
	public Long getPrinterAttributeId() {
		return printerAttributeId;
	}

	/**
	 * @param printerAttributeId セットする printerAttributeId
	 */
	public void setPrinterAttributeId(Long printerAttributeId) {
		this.printerAttributeId = printerAttributeId;
	}


}
