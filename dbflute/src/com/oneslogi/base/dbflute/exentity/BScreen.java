package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBScreen;

/**
 * The entity of B_SCREEN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BScreen extends BsBScreen {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public VDict chaseVDict() {
        return _vDict != null ? _vDict : new VDict();
    }

    public VHtDict chaseVHtDict() {
        return _vHtDict != null ? _vHtDict : new VHtDict();
    }

   	// ======================================================

    // ===== 検索条件 =====

    //センタ・荷主区分
    private String centerClientCls;

    //センタ・荷主
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

    // システム種別名称
    private String systemTypeNm;

    //表示可否
    private String visible;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====
    public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

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
	public void setScreenListCd(String screenListCd) {
		this.screenListCd = screenListCd;
	}
	public String getScreenListCd() {
		return screenListCd;
	}
	public void setCenterOrClientScreenNm(String centerOrClientScreenNm) {
		this.centerOrClientScreenNm = centerOrClientScreenNm;
	}
	public String getCenterOrClientScreenNm() {
		return centerOrClientScreenNm;
	}
	public void setCenterOrClientScreenVisible(String centerOrClientScreenVisible) {
		this.centerOrClientScreenVisible = centerOrClientScreenVisible;
	}
	public String getCenterOrClientScreenVisible() {
		return centerOrClientScreenVisible;
	}
	public Long getCenterOrClientScreenId() {
		return centerOrClientScreenId;
	}
	public void setCenterOrClientScreenId(Long centerOrClientScreenId) {
		this.centerOrClientScreenId = centerOrClientScreenId;
	}
	public String getSystemTypeNm() {
		return systemTypeNm;
	}
	public void setSystemTypeNm(String systemTypeNm) {
		this.systemTypeNm = systemTypeNm;
	}
}
