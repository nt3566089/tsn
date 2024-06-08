package com.oneslogi.wms.dto.report;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 荷札DTO(佐川用)
 */
public class TagLabelSgwDto extends TagLabelDto {

	/** データ種別 */
	private String tagType;
	/** データ種別名称 */
	private String tagNm;
	/** 文字コード */
	private String characterCd;
	/** お客様コード */
	private String slipCustomerCd;
	/** WebAPIリクエストURL */
	private String webApiRequestUrl;
	/** カスタマーID */
	private String customerId;
	/** ログインパスワード */
	private String loginPassword;
	/** 部署・担当者 */
	private String deptConsignorNm;
	/** 荷送人電話番号 */
	private String consignorTelNo;
	/** ご依頼主電話番号 */
	private String slipClientTelNo;
	/** ご依頼主郵便番号 */
	private String slipClientZipCd;
	/** ご依頼主住所1 */
	private String slipClientAddress1;
	/** ご依頼主住所2 */
	private String slipClientAddress2;
	/** ご依頼主名称1 */
	private String slipClientNm1;
	/** ご依頼主名称2 */
	private String slipClientNm2;
	/** 荷姿コード */
	private String slipShapeCd;
	/** 品名1 */
	private String slipItemNm1;
	/** 品名2 */
	private String slipItemNm2;
	/** 品名3 */
	private String slipItemNm3;
	/** 品名4 */
	private String slipItemNm4;
	/** 品名5 */
	private String slipItemNm5;
	/** 便種(スピードで選択) */
	private String transportTypeSpeed;
	/** 便種(商品) */
	private String transportTypeItem;
	/** 決済種別 */
	private String settlementType;
	/** 指定シール1 */
	private String sealType1;
	/** 指定シール2 */
	private String sealType2;
	/** 指定シール3 */
	private String sealType3;
	/** 元着区分 */
	private String codCls;
	/** 発店CD */
	private String sendCd;
	/** WebAPI送り状コード */
	private String apiOkuriCode;
	/** WebAPI便種コード */
	private String apiBinsyuCode;
	/** WebAPI代引フラグ */
	private String apiDaibikiFlg;
	/** WebAPI代引支払方法区分 */
	private String apiDaibikiType;
	/** WebAPI重量コード1 */
	private String apiWeightCd1;
	/** WebAPI重量コード2 */
	private String apiWeightCd2;
	/** WebAPI営止フラグ */
	private String apiEidomeFlg;
	/** 出力梱包番号リスト(個口分子) */
	private Set<Integer> outPackingIndexSet = new LinkedHashSet<Integer>();
	/** ダウンロード済フラグ */
	private boolean isDownloaded = false;;
	// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana Start
	/** 利用者側管理番号 */
	private String userManageNumber;
	// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana End

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

	public String getSlipCustomerCd() {
		return slipCustomerCd;
	}

	public void setSlipCustomerCd(String slipCustomerCd) {
		this.slipCustomerCd = slipCustomerCd;
	}

	public String getWebApiRequestUrl() {
		return webApiRequestUrl;
	}

	public void setWebApiRequestUrl(String webApiRequestUrl) {
		this.webApiRequestUrl = webApiRequestUrl;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getDeptConsignorNm() {
		return deptConsignorNm;
	}

	public void setDeptConsignorNm(String deptConsignorNm) {
		this.deptConsignorNm = deptConsignorNm;
	}

	public String getConsignorTelNo() {
		return consignorTelNo;
	}

	public void setConsignorTelNo(String consignorTelNo) {
		this.consignorTelNo = consignorTelNo;
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

	public String getSlipClientNm1() {
		return slipClientNm1;
	}

	public void setSlipClientNm1(String slipClientNm1) {
		this.slipClientNm1 = slipClientNm1;
	}

	public String getSlipClientNm2() {
		return slipClientNm2;
	}

	public void setSlipClientNm2(String slipClientNm2) {
		this.slipClientNm2 = slipClientNm2;
	}

	public String getSlipShapeCd() {
		return slipShapeCd;
	}

	public void setSlipShapeCd(String slipShapeCd) {
		this.slipShapeCd = slipShapeCd;
	}

	public String getSlipItemNm1() {
		return slipItemNm1;
	}

	public void setSlipItemNm1(String slipItemNm1) {
		this.slipItemNm1 = slipItemNm1;
	}

	public String getSlipItemNm2() {
		return slipItemNm2;
	}

	public void setSlipItemNm2(String slipItemNm2) {
		this.slipItemNm2 = slipItemNm2;
	}

	public String getSlipItemNm3() {
		return slipItemNm3;
	}

	public void setSlipItemNm3(String slipItemNm3) {
		this.slipItemNm3 = slipItemNm3;
	}

	public String getSlipItemNm4() {
		return slipItemNm4;
	}

	public void setSlipItemNm4(String slipItemNm4) {
		this.slipItemNm4 = slipItemNm4;
	}

	public String getSlipItemNm5() {
		return slipItemNm5;
	}

	public void setSlipItemNm5(String slipItemNm5) {
		this.slipItemNm5 = slipItemNm5;
	}

	public String getTransportTypeSpeed() {
		return transportTypeSpeed;
	}

	public void setTransportTypeSpeed(String transportTypeSpeed) {
		this.transportTypeSpeed = transportTypeSpeed;
	}

	public String getTransportTypeItem() {
		return transportTypeItem;
	}

	public void setTransportTypeItem(String transportTypeItem) {
		this.transportTypeItem = transportTypeItem;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getSealType1() {
		return sealType1;
	}

	public void setSealType1(String sealType1) {
		this.sealType1 = sealType1;
	}

	public String getSealType2() {
		return sealType2;
	}

	public void setSealType2(String sealType2) {
		this.sealType2 = sealType2;
	}

	public String getSealType3() {
		return sealType3;
	}

	public void setSealType3(String sealType3) {
		this.sealType3 = sealType3;
	}

	public String getCodCls() {
		return codCls;
	}

	public void setCodCls(String codCls) {
		this.codCls = codCls;
	}

	public String getSendCd() {
		return sendCd;
	}

	public void setSendCd(String sendCd) {
		this.sendCd = sendCd;
	}

	public String getApiOkuriCode() {
		return apiOkuriCode;
	}

	public void setApiOkuriCode(String apiOkuriCode) {
		this.apiOkuriCode = apiOkuriCode;
	}

	public String getApiBinsyuCode() {
		return apiBinsyuCode;
	}

	public void setApiBinsyuCode(String apiBinsyuCode) {
		this.apiBinsyuCode = apiBinsyuCode;
	}

	public String getApiDaibikiFlg() {
		return apiDaibikiFlg;
	}

	public void setApiDaibikiFlg(String apiDaibikiFlg) {
		this.apiDaibikiFlg = apiDaibikiFlg;
	}

	public String getApiDaibikiType() {
		return apiDaibikiType;
	}

	public void setApiDaibikiType(String apiDaibikiType) {
		this.apiDaibikiType = apiDaibikiType;
	}

	public String getApiWeightCd1() {
		return apiWeightCd1;
	}

	public void setApiWeightCd1(String apiWeightCd1) {
		this.apiWeightCd1 = apiWeightCd1;
	}

	public String getApiWeightCd2() {
		return apiWeightCd2;
	}

	public void setApiWeightCd2(String apiWeightCd2) {
		this.apiWeightCd2 = apiWeightCd2;
	}

	public String getApiEidomeFlg() {
		return apiEidomeFlg;
	}

	public void setApiEidomeFlg(String apiEidomeFlg) {
		this.apiEidomeFlg = apiEidomeFlg;
	}

	public Set<Integer> getOutPackingIndexSet() {
		return outPackingIndexSet;
	}

	public void addOutPackingIndex(int packingIndex) {
		outPackingIndexSet.add(packingIndex);
	}

	public boolean isDownloaded() {
		return isDownloaded;
	}

	public void setDownloaded(boolean isDownloaded) {
		this.isDownloaded = isDownloaded;
	}

	public String getUserManageNumber() {
		return userManageNumber;
	}

	public void setUserManageNumber(String userManageNumber) {
		this.userManageNumber = userManageNumber;
	}
}
