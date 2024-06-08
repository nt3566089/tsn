package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBItem;

/**
 * The entity of B_ITEM.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BItem extends BsBItem {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====

	//センタ・荷主区分
	private String centerClientCls;

	//センタ・荷主
	private String centerOrClientCd;

	//センタ・荷主ID
	private Long centerOrClientId;

	//画面リソースCD
	private String screenListCd;

	//項目リソースCD
	private String itemListCd;

	//項目ID
	private Long screenItemId;

	//センタ・荷主別 項目名
	private String screenItemNm;

	//センタ・荷主別 表示可否
	private String screenItemVisible;

	//センタ・荷主別 編集可否
	private String screenItemEditable;

	//センタ・荷主別 必須
	private String screenItemNecessary;

	//センタ・荷主項目ID
	private Long centerOrClientItemId;
	//権限別 表示可否
	private String roleItemVisible;
	//権限別 編集可否
	private String roleItemEditable;



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
	public void setScreenItemId(Long screenItemId) {
		this.screenItemId = screenItemId;
	}
	public Long getScreenItemId() {
		return screenItemId;
	}
	public void setScreenItemNm(String screenItemNm) {
		this.screenItemNm = screenItemNm;
	}
	public String getScreenItemNm() {
		return screenItemNm;
	}
	public void setScreenItemVisible(String screenItemVisible) {
		this.screenItemVisible = screenItemVisible;
	}
	public String getScreenItemVisible() {
		return screenItemVisible;
	}
	public void setScreenItemEditable(String screenItemEditable) {
		this.screenItemEditable = screenItemEditable;
	}
	public String getScreenItemEditable() {
		return screenItemEditable;
	}
	public void setScreenItemNecessary(String screenItemNecessary) {
		this.screenItemNecessary = screenItemNecessary;
	}
	public String getScreenItemNecessary() {
		return screenItemNecessary;
	}
	public Long getCenterOrClientItemId() {
		return centerOrClientItemId;
	}
	public void setCenterOrClientItemId(Long centerOrClientItemId) {
		this.centerOrClientItemId = centerOrClientItemId;
	}
	public String getRoleItemVisible() {
		return roleItemVisible;
	}

	public void setRoleItemVisible(String roleItemVisible) {
		this.roleItemVisible = roleItemVisible;
	}

	public String getRoleItemEditable() {
		return roleItemEditable;
	}

	public void setRoleItemEditable(String roleItemEditable) {
		this.roleItemEditable = roleItemEditable;
	}
}
