package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBInfoDto;

/**
 * The entity of B_INFO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BInfoDto extends BsBInfoDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public String clientCd;
	public String centerCd;
	// お知らせ日From
	private String infoDtFrom;

	// お知らせ日To
	private String infoDtTo;

	// 終了したお知らせの表示
	private String infoEnd;

	// ===== 導出カラム =====

	// 行番号
	private String lineNo;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getInfoEnd() {
		return infoEnd;
	}

	public void setInfoEnd(String infoEnd) {
		this.infoEnd = infoEnd;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getLineNo() {
		return lineNo;
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
	public String getClientCd() {
		return clientCd;
	}
	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
	public String getCenterCd() {
		return centerCd;
	}
	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
}
