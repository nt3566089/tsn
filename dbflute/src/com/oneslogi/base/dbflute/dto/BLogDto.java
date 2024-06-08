package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBLogDto;

/**
 * The entity of B_LOG.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BLogDto extends BsBLogDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	public String getProcessDtTo() {
		return processDtTo;
	}

	public void setProcessDtTo(String processDtTo) {
		this.processDtTo = processDtTo;
	}

	public String getProcessDtFrom() {
		return processDtFrom;
	}

	public void setProcessDtFrom(String processDtFrom) {
		this.processDtFrom = processDtFrom;
	}

	public String getPgm() {
		return pgm;
	}

	public void setPgm(String pgm) {
		this.pgm = pgm;
	}

	public String getChk() {
		return chk;
	}

	public void setChk(String chk) {
		this.chk = chk;
	}

	private String processDtTo;

	private String processDtFrom;

	private String pgm;

	private String chk;

}
