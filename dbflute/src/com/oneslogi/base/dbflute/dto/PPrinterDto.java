package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsPPrinterDto;

/**
 * The entity of P_PRINTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterDto extends BsPPrinterDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	private String lineNo;

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
}
