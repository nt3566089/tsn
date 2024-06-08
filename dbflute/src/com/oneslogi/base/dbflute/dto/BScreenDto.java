package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBScreenDto;

/**
 * The entity of B_SCREEN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BScreenDto extends BsBScreenDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===== 検索条件 =====

    //センタ・荷主区分
    private String centerClientCls;

    //センタ・荷主CD
    private String centerOrClientCd;

    //センタ・荷主ID
    private Long centerOrClientId;

    //画面リソースCD
    private String screenListCd;

    //センタ・荷主別 画面名
    private String centerOrClientScreenNm;

    //センタ・荷主別 表示可否
    private String centerOrClientScreenVisible;

    //センタ・荷主画面ID
    private Long centerOrClientScreenId;

	// 行番号
	private String lineNo;

	// システム種別名称
	private String systemTypeNm;
	
	//表示可否
	private String visible;

    public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
	// ===== 以下Eclipse自動生成のアクセサメソッド =====
	public String getCenterClientCls() {
		return centerClientCls;
	}
	public void setCenterClientCls(String centerClientCls) {
		this.centerClientCls = centerClientCls;
	}
	public String getCenterOrClientCd() {
		return centerOrClientCd;
	}
	public void setCenterOrClientCd(String centerOrClientCd) {
		this.centerOrClientCd = centerOrClientCd;
	}
	public Long getCenterOrClientId() {
		return centerOrClientId;
	}
	public void setCenterOrClientId(Long centerOrClientId) {
		this.centerOrClientId = centerOrClientId;
	}
	public String getScreenListCd() {
		return screenListCd;
	}
	public void setScreenListCd(String screenListCd) {
		this.screenListCd = screenListCd;
	}
	public String getCenterOrClientScreenNm() {
		return centerOrClientScreenNm;
	}
	public void setCenterOrClientScreenNm(String centerOrClientScreenNm) {
		this.centerOrClientScreenNm = centerOrClientScreenNm;
	}
	public String getCenterOrClientScreenVisible() {
		return centerOrClientScreenVisible;
	}
	public void setCenterOrClientScreenVisible(String centerOrClientScreenVisible) {
		this.centerOrClientScreenVisible = centerOrClientScreenVisible;
	}
	public Long getCenterOrClientScreenId() {
		return centerOrClientScreenId;
	}
	public void setCenterOrClientScreenId(Long centerOrClientScreenId) {
		this.centerOrClientScreenId = centerOrClientScreenId;
	}
		public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	public String getSystemTypeNm() {
		return systemTypeNm;
	}
	public void setSystemTypeNm(String systemTypeNm) {
		this.systemTypeNm = systemTypeNm;
	}
}
