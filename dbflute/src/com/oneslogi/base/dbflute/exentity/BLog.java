package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBLog;

/**
 * The entity of B_LOG.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BLog extends BsBLog {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	public String getProcessDtFrom() {
		return processDtFrom;
	}

	public void setProcessDtFrom(String processDtFrom) {
		this.processDtFrom = processDtFrom;
	}

	public String getProcessDtTo() {
		return processDtTo;
	}

	public void setProcessDtTo(String processDtTo) {
		this.processDtTo = processDtTo;
	}

	public String getPgm() {
		return pgm;
	}

	public void setPgm(String pgm) {
		this.pgm = pgm;
	}

	private String processDtFrom;

	private String processDtTo;

	private String pgm;

}
