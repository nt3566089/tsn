package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTTrbaditemcaseDto;

/**
 * The entity of T_TRBADITEMCASE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TTrbaditemcaseDto extends BsTTrbaditemcaseDto {

	/** The serial version UID for object serialization. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====

	// 拠点CD
	private String centerCd;

	// 荷主CD
	private String clientCd;

	// ラベル作成日時From
	private String createddateFrom;

	// ラベル作成日時To
	private String createddateTo;

	// 当日ラベル作成枚数
	private String todayPrintOnlyFlg;

	// 銘柄名称
	private String productAbbr;

	// 特販業者
	private String allocpolicykey;

	// ケース当個装数
	private BigDecimal caseNum;

	// 当日作成ラベル枚数
	private Integer todayCnt;

	// 返送先拠点名称
	private String rtnCompanyName;

	// 銘柄区分CD
	private String itemkbn;

	// 一般出力順
	private String usernum3;

	// 拠点名称
	private String centerAbbr;

	// 荷主名称
	private String clientAbbr;

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public String getCreateddateFrom() {
		return createddateFrom;
	}

	public void setCreateddateFrom(String createddateFrom) {
		this.createddateFrom = createddateFrom;
	}

	public String getCreateddateTo() {
		return createddateTo;
	}

	public void setCreateddateTo(String createddateTo) {
		this.createddateTo = createddateTo;
	}

	public String getTodayPrintOnlyFlg() {
		return todayPrintOnlyFlg;
	}

	public void setTodayPrintOnlyFlg(String todayPrintOnlyFlg) {
		this.todayPrintOnlyFlg = todayPrintOnlyFlg;
	}

	public String getProductAbbr() {
		return productAbbr;
	}

	public void setProductAbbr(String productAbbr) {
		this.productAbbr = productAbbr;
	}

	public String getAllocpolicykey() {
		return allocpolicykey;
	}

	public void setAllocpolicykey(String allocpolicykey) {
		this.allocpolicykey = allocpolicykey;
	}

	public BigDecimal getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(BigDecimal caseNum) {
		this.caseNum = caseNum;
	}

	public Integer getTodayCnt() {
		return todayCnt;
	}

	public void setTodayCnt(Integer todayCnt) {
		this.todayCnt = todayCnt;
	}

	public String getRtnCompanyName() {
		return rtnCompanyName;
	}

	public void setRtnCompanyName(String rtnCompanyName) {
		this.rtnCompanyName = rtnCompanyName;
	}

	public String getItemkbn() {
		return itemkbn;
	}

	public void setItemkbn(String itemkbn) {
		this.itemkbn = itemkbn;
	}

	public String getUsernum3() {
		return usernum3;
	}

	public void setUsernum3(String usernum3) {
		this.usernum3 = usernum3;
	}

	public String getCenterAbbr() {
		return centerAbbr;
	}

	public void setCenterAbbr(String centerAbbr) {
		this.centerAbbr = centerAbbr;
	}

	public String getClientAbbr() {
		return clientAbbr;
	}

	public void setClientAbbr(String clientAbbr) {
		this.clientAbbr = clientAbbr;
	}
}
