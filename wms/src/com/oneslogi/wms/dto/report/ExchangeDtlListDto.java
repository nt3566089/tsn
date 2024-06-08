package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 取替明細書DTOクラス
 */
public class ExchangeDtlListDto extends ReportDto {

	/** 配達拠点 */
	public String centerNm;
	/** 配達日 */
	public String dlvYMD;
	/** 配達方面 */
	public String ded;
	/** ピストン区分 */
	public String pstnId;
	/** 配達順位 */
	public String dlvRnk;
	/** お得意様コード */
	public String ssCd;
	/** お得意様名 */
	public String ssNm;
	/** 配達拠点コード */
	public String dpCd;
	/** 銘柄名 */
	public String productNm;
	/** 数量 */
	public Long slQaCt;
	/** 端数 */
	public Long slQaNum;
	/** 段ボール */
	public Long slQaCb;
	/** 使用区分 */
	public String userNum1;
	/** 一般出力順 */
	public String userNum3;
	/** 銘柄コード */
	public String zzmatnr;
	/** グループ内のページ数 */
	public Integer groupPageNo;
	/** グループ内の総ページ数 */
	public Integer groupTotalPageNo;

	// ===== 以下、ゲッタ・セッタ =====

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getDlvYMD() {
		return dlvYMD;
	}

	public void setDlvYMD(String dlvYMD) {
		this.dlvYMD = dlvYMD;
	}

	public String getDed() {
		return ded;
	}

	public void setDed(String ded) {
		this.ded = ded;
	}

	public String getPstnId() {
		return pstnId;
	}

	public void setPstnId(String pstnId) {
		this.pstnId = pstnId;
	}

	public String getDlvRnk() {
		return dlvRnk;
	}

	public void setDlvRnk(String dlvRnk) {
		this.dlvRnk = dlvRnk;
	}

	public String getSsCd() {
		return ssCd;
	}

	public void setSsCd(String ssCd) {
		this.ssCd = ssCd;
	}

	public String getSsNm() {
		return ssNm;
	}

	public void setSsNm(String ssNm) {
		this.ssNm = ssNm;
	}

	public String getDpCd() {
		return dpCd;
	}

	public void setDpCd(String dpCd) {
		this.dpCd = dpCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public Long getSlQaCt() {
		return slQaCt;
	}

	public void setSlQaCt(Long slQaCt) {
		this.slQaCt = slQaCt;
	}

	public Long getSlQaNum() {
		return slQaNum;
	}

	public void setSlQaNum(Long slQaNum) {
		this.slQaNum = slQaNum;
	}

	public Long getSlQaCb() {
		return slQaCb;
	}

	public void setSlQaCb(Long slQaCb) {
		this.slQaCb = slQaCb;
	}

	public String getUserNum1() {
		return userNum1;
	}

	public void setUserNum1(String userNum1) {
		this.userNum1 = userNum1;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getZzmatnr() {
		return zzmatnr;
	}

	public void setZzmatnr(String zzmatnr) {
		this.zzmatnr = zzmatnr;
	}

	public Integer getGroupPageNo() {
		return groupPageNo;
	}

	public void setGroupPageNo(Integer groupPageNo) {
		this.groupPageNo = groupPageNo;
	}

	public Integer getGroupTotalPageNo() {
		return groupTotalPageNo;
	}

	public void setGroupTotalPageNo(Integer groupTotalPageNo) {
		this.groupTotalPageNo = groupTotalPageNo;
	}

}
