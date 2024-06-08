package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 *不適品リストTOクラス
 */
public class NonconformityLabelDto extends ReportDto {

	/**  対象月*/
	public String invYmd;
	/**  返送先名称*/
	public String skPlc;
	/**  ラベル番号(国産)*/
	public String trbadItemCaseId;
	/**  銘柄CD*/
	public String productCd;
	/**  不適品バーコード文字列*/
	public String barcode;
	/**  銘柄名称*/
	public String productNm;
	/**  拠点CD*/
	public String centerCd;
	/**  拠点名称*/
	public String centerNm;
	/**  ケース当個総数*/
	public BigDecimal caseNum;
	/**  作成年月日*/
	public String recdMkda;
	/**  PM／BATフラグ*/
	public String allOcPolicyKey;
	/**  ラベル番号(輸入または商品)*/
	public String barcodeLabelId;
	/**  内外区分*/
	public String inOutKbn;
	/**  一般出力順*/
	public String userNum3;
	/**  銘柄区分*/
	public String userNum4;



	// ===== 以下、ゲッタ・セッタ =====

	public String getInvYmd() {
		return invYmd;
	}

	public void setInvYmd(String invYmd) {
		this.invYmd = invYmd;
	}

	public String getSkPlc() {
		return skPlc;
	}

	public void setSkPlc(String skPlc) {
		this.skPlc = skPlc;
	}

	public String getTrbadItemCaseId() {
		return trbadItemCaseId;
	}

	public void setTrbadItemCaseId(String trbadItemCaseId) {
		this.trbadItemCaseId = trbadItemCaseId;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public BigDecimal getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(BigDecimal caseNum) {
		this.caseNum = caseNum;
	}

	public String getRecdMkda() {
		return recdMkda;
	}

	public void setRecdMkda(String recdMkda) {
		this.recdMkda = recdMkda;
	}

	public String getAllOcPolicyKey() {
		return allOcPolicyKey;
	}

	public void setAllOcPolicyKey(String allOcPolicyKey) {
		this.allOcPolicyKey = allOcPolicyKey;
	}

	public String getBarcodeLabelId() {
		return barcodeLabelId;
	}

	public void setBarcodeLabelId(String barcodeLabelId) {
		this.barcodeLabelId = barcodeLabelId;
	}

	public String geInOutKbn() {
		return inOutKbn;
	}

	public void setInOutKbn(String inOutKbn) {
		this.inOutKbn = inOutKbn;
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


}
