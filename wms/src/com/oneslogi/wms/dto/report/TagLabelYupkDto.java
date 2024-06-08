package com.oneslogi.wms.dto.report;

/**
 * 荷札(ゆうパック用)
 */
public class TagLabelYupkDto extends TagLabelDto {

	/** データ種別 */
	private String tagType;
	/** データ種別名称 */
	private String tagNm;
	/** 文字コード */
	private String characterCd;
	/** 郵便種別 */
	private String postType;
	/** 保冷種別 */
	private String coolType;
	/** 保冷種別表示名 */
	private String coolTypeNm;
	/** 元／着払／代引 */
	private String codType;
	/** 送り状種別 */
	private String carrierType;
	/** ご依頼主郵便番号 */
	private String slipClientZipCd;
	/** ご依頼主住所1 */
	private String slipClientAddress1;
	/** ご依頼主住所2 */
	private String slipClientAddress2;
	/** ご依頼主住所3 */
	private String slipClientAddress3;
	/** ご依頼主名称1 */
	private String slipClientNm1;
	/** ご依頼主電話番号 */
	private String slipClientTelNo;
	/** ご依頼主メールアドレス1 */
	private String slipClientMail;
	/** 逆さま厳禁区分 */
	private String noUpsideDownCls;
	/** 下積み厳禁区分 */
	private String noStockCls;
	/** 商品サイズ区分 */
	private String slipProductSizeCls;
	/** 商品番号(明細) */
	private String slipProductNo;
	/** 品名(明細) */
	private String slipItemNm;
	/** 発送予約データマーク */
	private String shipReserveDataMark;
	/** 配達証保存年数 */
	private Long deliCertPreYears;
	/** 発店名称 */
	private String sendNm;

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

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getCoolType() {
		return coolType;
	}

	public void setCoolType(String coolType) {
		this.coolType = coolType;
	}

	public String getCoolTypeNm() {
		return coolTypeNm;
	}

	public void setCoolTypeNm(String coolTypeNm) {
		this.coolTypeNm = coolTypeNm;
	}

	public String getCodType() {
		return codType;
	}

	public void setCodType(String codType) {
		this.codType = codType;
	}

	public String getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
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

	public String getSlipClientNm1() {
		return slipClientNm1;
	}

	public void setSlipClientNm1(String slipClientNm1) {
		this.slipClientNm1 = slipClientNm1;
	}

	public String getSlipClientTelNo() {
		return slipClientTelNo;
	}

	public void setSlipClientTelNo(String slipClientTelNo) {
		this.slipClientTelNo = slipClientTelNo;
	}

	public String getSlipClientMail() {
		return slipClientMail;
	}

	public void setSlipClientMail(String slipClientMail) {
		this.slipClientMail = slipClientMail;
	}

	public String getNoUpsideDownCls() {
		return noUpsideDownCls;
	}

	public void setNoUpsideDownCls(String noUpsideDownCls) {
		this.noUpsideDownCls = noUpsideDownCls;
	}

	public String getNoStockCls() {
		return noStockCls;
	}

	public void setNoStockCls(String noStockCls) {
		this.noStockCls = noStockCls;
	}

	public String getSlipProductSizeCls() {
		return slipProductSizeCls;
	}

	public void setSlipProductSizeCls(String slipProductSizeCls) {
		this.slipProductSizeCls = slipProductSizeCls;
	}

	public String getSlipProductNo() {
		return slipProductNo;
	}

	public void setSlipProductNo(String slipProductNo) {
		this.slipProductNo = slipProductNo;
	}

	public String getSlipItemNm() {
		return slipItemNm;
	}

	public void setSlipItemNm(String slipItemNm) {
		this.slipItemNm = slipItemNm;
	}

	public String getShipReserveDataMark() {
		return shipReserveDataMark;
	}

	public void setShipReserveDataMark(String shipReserveDataMark) {
		this.shipReserveDataMark = shipReserveDataMark;
	}

	public Long getDeliCertPreYears() {
		return deliCertPreYears;
	}

	public void setDeliCertPreYears(Long deliCertPreYears) {
		this.deliCertPreYears = deliCertPreYears;
	}

	public String getSendNm() {
		return sendNm;
	}

	public void setSendNm(String sendNm) {
		this.sendNm = sendNm;
	}
}
