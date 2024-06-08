package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 過不足履歴簿DTOクラス
 */
public class ExcessOrDeficiencyHistoryListDto extends ReportDto {

	/** 処理見出し1 */
	public String processHeadline1;
	/** 処理見出し2 */
	public String processHeadline2;
	/** 銘柄区分 */
	public String userNum4;
	/** 登録日 */
	public String addDate;
	/** 銘柄CD */
	public String itemCd;
	/** 銘柄名称 */
	public String productNm;
	/** 過不足数 */
	public Long diffQty;
	/** 拠点コ－ド */
	public String centerCd;
	/** 拠点名称 */
	public String centerAbbr;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;
	/** 内外区分 */
	public String inoutKbn;
	/** 過不足発生場所 */
	public String diffoccArea;
	/** 一般出力順 */
	public String userNum3;

	// ===== 以下、ゲッタ・セッタ =====

	public String getProcessHeadline1() {
		return processHeadline1;
	}

	public void setProcessHeadline1(String processHeadline1) {
		this.processHeadline1 = processHeadline1;
	}

	public String getProcessHeadline2() {
		return processHeadline2;
	}

	public void setProcessHeadline2(String processHeadline2) {
		this.processHeadline2 = processHeadline2;
	}

	public String getUserNum4() {
		return userNum4;
	}

	public void setUserNum4(String userNum4) {
		this.userNum4 = userNum4;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public Long getDiffQty() {
		return diffQty;
	}

	public void setDiffQty(Long diffQty) {
		this.diffQty = diffQty;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCenterAbbr() {
		return centerAbbr;
	}

	public void setCenterAbbr(String centerAbbr) {
		this.centerAbbr = centerAbbr;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	public String getInoutKbn() {
		return inoutKbn;
	}

	public void setInoutKbn(String inoutKbn) {
		this.inoutKbn = inoutKbn;
	}

	public String getDiffoccArea() {
		return diffoccArea;
	}

	public void setDiffoccArea(String diffoccArea) {
		this.diffoccArea = diffoccArea;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

}
