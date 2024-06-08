package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBInfo;

/**
 * The entity of B_INFO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BInfo extends BsBInfo {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// お知らせ日From
	private String infoDtFrom;

	// お知らせ日To
	private String infoDtTo;

	// 終了したお知らせの表示
	private String infoEnd;

	public String getInfoEnd() {
		return infoEnd;
	}

	public void setInfoEnd(String infoEnd) {
		this.infoEnd = infoEnd;
	}

	public String getInfoDtFrom() {
		return infoDtFrom;
	}

	public void setInfoDtFrom(String infoDtFrom) {
		this.infoDtFrom = infoDtFrom;
	}

	public String getInfoDtTo() {
		return infoDtTo;
	}

	public void setInfoDtTo(String infoDtTo) {
		this.infoDtTo = infoDtTo;
	}
}
