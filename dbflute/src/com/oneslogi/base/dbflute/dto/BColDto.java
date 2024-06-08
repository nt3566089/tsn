package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBColDto;

/**
 * The entity of B_COL.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BColDto extends BsBColDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===== 検索条件 =====

    //センタ・荷主区分
    private String centerClientCls;

    //センタ・荷主CD
    private String centerOrClientCd;

    //センタ・荷主ID
    private Long centerOrClientId;

    //画面CD
    private String screenListCd;

    //項目CD
    private String itemListCd;

    //列ID
    private Long screenColId;

    //センタ・荷主別 列名
    private String screenColNm;

    //センタ・荷主別 表示可否
    private String screenColVisible;

    //センタ・荷主別 編集可否
    private String screenColEditable;

    //センタ・荷主別 必須
    private String screenColNecessary;

    //センタ・荷主列 ID
    private Long centerOrClientColId;
    // 列名
    private String  dictName;
    // 表示可否
    private String  visibleName;
    // 編集可否
    private String  editableName;
    //権限別 表示可否
	private String  roleColVisible;
	//権限別 編集可否
	private String  roleColEditable;
	//必須
	private String  necessaryName;

	// 送り状データ作成フラグ
	private String invoiceCreateFlgNm;

	// 緊急フラグ
	private String emergencyFlgNm;

	// 行番号
	private String lineNo;

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
	public String getItemListCd() {
		return itemListCd;
	}
	public void setItemListCd(String itemListCd) {
		this.itemListCd = itemListCd;
	}
	public void setScreenColId(Long screenColId) {
		this.screenColId = screenColId;
	}
	public Long getScreenColId() {
		return screenColId;
	}
	public void setScreenColNm(String screenColNm) {
		this.screenColNm = screenColNm;
	}
	public String getScreenColNm() {
		return screenColNm;
	}
	public void setScreenColVisible(String screenColVisible) {
		this.screenColVisible = screenColVisible;
	}
	public String getScreenColVisible() {
		return screenColVisible;
	}
	public void setScreenColEditable(String screenColEditable) {
		this.screenColEditable = screenColEditable;
	}
	public String getScreenColEditable() {
		return screenColEditable;
	}
	public void setScreenColNecessary(String screenColNecessary) {
		this.screenColNecessary = screenColNecessary;
	}
	public String getScreenColNecessary() {
		return screenColNecessary;
	}
	public Long getCenterOrClientColId() {
		return centerOrClientColId;
	}
	public void setCenterOrClientColId(Long centerOrClientColId) {
		this.centerOrClientColId = centerOrClientColId;
	}
	public String getRoleColVisible() {
		return roleColVisible;
	}
	public void setRoleColVisible(String roleColVisible) {
		this.roleColVisible = roleColVisible;
	}
	public String getRoleColEditable() {
		return roleColEditable;
	}
	public void setRoleColEditable(String roleColEditable) {
		this.roleColEditable = roleColEditable;
	}
   	public String getVisibleName() {
		return visibleName;
	}
	public void setVisibleName(String visibleName) {
		this.visibleName = visibleName;
	}
	public String getEditableName() {
		return editableName;
	}
	public void setEditableName(String editableName) {
		this.editableName = editableName;
	}
	public String getDictName() {
   		return dictName;
   	}
   	public void setDictName(String dictName) {
   		this.dictName = dictName;
   	}
	public String getNecessaryName() {
		return necessaryName;
	}
	public void setNecessaryName(String necessaryName) {
		this.necessaryName = necessaryName;
	}
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getInvoiceCreateFlgNm() {
		return invoiceCreateFlgNm;
	}

	public void setInvoiceCreateFlgNm(String invoiceCreateFlgNm) {
		this.invoiceCreateFlgNm = invoiceCreateFlgNm;
	}

	public String getEmergencyFlgNm() {
		return emergencyFlgNm;
	}

	public void setEmergencyFlgNm(String emergencyFlgNm) {
		this.emergencyFlgNm = emergencyFlgNm;
	}
}
