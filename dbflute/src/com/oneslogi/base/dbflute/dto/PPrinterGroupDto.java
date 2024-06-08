package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsPPrinterGroupDto;

/**
 * The entity of p_printer_group.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterGroupDto extends BsPPrinterGroupDto {

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
