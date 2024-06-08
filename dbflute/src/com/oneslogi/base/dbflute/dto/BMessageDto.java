package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBMessageDto;

/**
 * The entity of B_MESSAGE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BMessageDto extends BsBMessageDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    private String cultureCd;

    private String lineNo;

	public String getCultureCd() {
		return cultureCd;
	}

	public void setCultureCd(String cultureCd) {
		this.cultureCd = cultureCd;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
}
