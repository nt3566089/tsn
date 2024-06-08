package com.oneslogi.wms.dto.report;


/**
 * 荷札DTO(ヤマト用)
 */
public class TagLabelYmtDto extends TagLabelDto {

	/** データ種別 */
	private String tagType;
	/** データ種別名称 */
	private String tagNm;
	/** 文字コード */
	private String characterCd;
	/** 送り状種別 */
	private String slipType;
	/** クール区分 */
	private String coolCls;
	/** クール区分表示名 */
	private String coolClsNm;
	/** 敬称 */
	private String honorific;
	/** 個数口表示フラグ */
	private String packingShowFlg;
	/** ご依頼主電話番号 */
	private String slipClientTelNo;
	/** ご依頼主郵便番号 */
	private String slipClientZipCd;
	/** ご依頼主住所(都道府県) */
	private String slipClientAddress1;
	/** ご依頼主住所(市区郡町村) */
	private String slipClientAddress2;
	/** ご依頼主住所(町域) */
	private String slipClientAddress3;
	/** ご依頼主住所(アパートマンション名) */
	private String slipClientAddress4;
	/** ご依頼主名 */
	private String slipClientNm;
	/** 品名コード1 */
	private String slipItemCd1;
	/** 品名1 */
	private String slipItemNm1;
	/** 品名コード2 */
	private String slipItemCd2;
	/** 品名2 */
	private String slipItemNm2;
	/** 荷扱い1 */
	private String freightHandling1;
	/** 荷扱い2 */
	private String freightHandling2;
	/** 記事 */
	private String article;
	/** ご請求先顧客コード */
	private String billingCustomerCd;
	/** 運賃管理番号 */
	private String fareNo;
	/** 発店CD */
	private String sendCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getTagType() {
		return tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getTagNm() {
		return tagNm;
	}

	public void setTagNm(String tagNm) {
		this.tagNm = tagNm;
	}

	public String getCharacterCd() {
		return characterCd;
	}

	public void setCharacterCd(String characterCd) {
		this.characterCd = characterCd;
	}

	public String getSlipType() {
		return slipType;
	}

	public void setSlipType(String slipType) {
		this.slipType = slipType;
	}

	public String getCoolCls() {
		return coolCls;
	}

	public void setCoolCls(String coolCls) {
		this.coolCls = coolCls;
	}

	public String getCoolClsNm() {
		return coolClsNm;
	}

	public void setCoolClsNm(String coolClsNm) {
		this.coolClsNm = coolClsNm;
	}

	public String getHonorific() {
		return honorific;
	}

	public void setHonorific(String honorific) {
		this.honorific = honorific;
	}

	public String getPackingShowFlg() {
		return packingShowFlg;
	}

	public void setPackingShowFlg(String packingShowFlg) {
		this.packingShowFlg = packingShowFlg;
	}

	public String getSlipClientTelNo() {
		return slipClientTelNo;
	}

	public void setSlipClientTelNo(String slipClientTelNo) {
		this.slipClientTelNo = slipClientTelNo;
	}

	public String getSlipClientZipCd() {
		return slipClientZipCd;
	}

	public void setSlipClientZipCd(String slipClientZipCd) {
		this.slipClientZipCd = slipClientZipCd;
	}

	public String getSlipClientAddress1() {
		return slipClientAddress1;
	}

	public void setSlipClientAddress1(String slipClientAddress1) {
		this.slipClientAddress1 = slipClientAddress1;
	}

	public String getSlipClientAddress2() {
		return slipClientAddress2;
	}

	public void setSlipClientAddress2(String slipClientAddress2) {
		this.slipClientAddress2 = slipClientAddress2;
	}

	public String getSlipClientAddress3() {
		return slipClientAddress3;
	}

	public void setSlipClientAddress3(String slipClientAddress3) {
		this.slipClientAddress3 = slipClientAddress3;
	}

	public String getSlipClientAddress4() {
		return slipClientAddress4;
	}

	public void setSlipClientAddress4(String slipClientAddress4) {
		this.slipClientAddress4 = slipClientAddress4;
	}

	public String getSlipClientNm() {
		return slipClientNm;
	}

	public void setSlipClientNm(String slipClientNm) {
		this.slipClientNm = slipClientNm;
	}

	public String getSlipItemCd1() {
		return slipItemCd1;
	}

	public void setSlipItemCd1(String slipItemCd1) {
		this.slipItemCd1 = slipItemCd1;
	}

	public String getSlipItemNm1() {
		return slipItemNm1;
	}

	public void setSlipItemNm1(String slipItemNm1) {
		this.slipItemNm1 = slipItemNm1;
	}

	public String getSlipItemCd2() {
		return slipItemCd2;
	}

	public void setSlipItemCd2(String slipItemCd2) {
		this.slipItemCd2 = slipItemCd2;
	}

	public String getSlipItemNm2() {
		return slipItemNm2;
	}

	public void setSlipItemNm2(String slipItemNm2) {
		this.slipItemNm2 = slipItemNm2;
	}

	public String getFreightHandling1() {
		return freightHandling1;
	}

	public void setFreightHandling1(String freightHandling1) {
		this.freightHandling1 = freightHandling1;
	}

	public String getFreightHandling2() {
		return freightHandling2;
	}

	public void setFreightHandling2(String freightHandling2) {
		this.freightHandling2 = freightHandling2;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getBillingCustomerCd() {
		return billingCustomerCd;
	}

	public void setBillingCustomerCd(String billingCustomerCd) {
		this.billingCustomerCd = billingCustomerCd;
	}

	public String getFareNo() {
		return fareNo;
	}

	public void setFareNo(String fareNo) {
		this.fareNo = fareNo;
	}

	public String getSendCd() {
		return sendCd;
	}

	public void setSendCd(String sendCd) {
		this.sendCd = sendCd;
	}
}
