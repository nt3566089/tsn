package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsPPrintServiceDto;

/**
 * The entity of p_print_service.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PPrintServiceDto extends BsPPrintServiceDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	private String lineNo;

	private String printerGroupNm;

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getPrinterGroupNm() {
		return printerGroupNm;
	}

	public void setPrinterGroupNm(String printerGroupNm) {
		this.printerGroupNm = printerGroupNm;
	}

}
