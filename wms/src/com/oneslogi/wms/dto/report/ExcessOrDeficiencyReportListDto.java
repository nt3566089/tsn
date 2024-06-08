package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 適品過不足報告書DTOクラス
 */
public class ExcessOrDeficiencyReportListDto extends ReportDto {

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
