package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 不適品過不足報告書(国産)DTOクラス
 */
public class ExcessOrDeficiencyReportListDomesticDto extends ReportDto {

	/** 拠点名称 */
	public String centerAbbr;
	/** 棚卸実施日.年 */
	public String invDateYear;
	/** 棚卸実施日.月 */
	public String invDateMonth;
	/** 棚卸実施日.日 */
	public String invDateDay;
	/** 銘柄コード */
	public String productCd;
	/** 銘柄名称 */
	public String productNm;
	/** たばこ商品区分 */
	public String cggdId;
	/** 過剰数量 */
	public Long diffQty;
	/** 内外区分 */
	public String inOutKbn;
	/** 過不足発生場所 */
	public String diffOccArea;
	/** 一般出力順 */
	public String userNum3;
	/** 銘柄区分 */
	public String userNum4;
	/** 拠点コ－ド */
	public String centerCd;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;
	/** 合計項目 表示フラグ */
	public Boolean showSumItemFlg;
	/** 該当なし判定フラグ */
	public Boolean nothingFlg;

	// ===== 以下、ゲッタ・セッタ =====

	public String getCenterAbbr() {
		return centerAbbr;
	}

	public void setCenterAbbr(String centerAbbr) {
		this.centerAbbr = centerAbbr;
	}

	public String getInvDateYear() {
		return invDateYear;
	}

	public void setInvDateYear(String invDateYear) {
		this.invDateYear = invDateYear;
	}

	public String getInvDateMonth() {
		return invDateMonth;
	}

	public void setInvDateMonth(String invDateMonth) {
		this.invDateMonth = invDateMonth;
	}

	public String getInvDateDay() {
		return invDateDay;
	}

	public void setInvDateDay(String invDateDay) {
		this.invDateDay = invDateDay;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getCggdId() {
		return cggdId;
	}

	public void setCggdId(String cggdId) {
		this.cggdId = cggdId;
	}

	public Long getDiffQty() {
		return diffQty;
	}

	public void setDiffQty(Long diffQty) {
		this.diffQty = diffQty;
	}

	public String getInOutKbn() {
		return inOutKbn;
	}

	public void setInOutKbn(String inOutKbn) {
		this.inOutKbn = inOutKbn;
	}

	public String getDiffOccArea() {
		return diffOccArea;
	}

	public void setDiffOccArea(String diffOccArea) {
		this.diffOccArea = diffOccArea;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getUserNum4() {
		return userNum4;
	}

	public void setUserNum4(String userNum4) {
		this.userNum4 = userNum4;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
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

	public Boolean getShowSumItemFlg() {
		return showSumItemFlg;
	}

	public void setShowSumItemFlg(Boolean showSumItemFlg) {
		this.showSumItemFlg = showSumItemFlg;
	}

	public Boolean getNothingFlg() {
		return nothingFlg;
	}

	public void setNothingFlg(Boolean nothingFlg) {
		this.nothingFlg = nothingFlg;
	}

}
