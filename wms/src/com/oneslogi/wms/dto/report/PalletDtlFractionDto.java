package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * パレット明細（端数）DTOクラス
 */
public class PalletDtlFractionDto extends ReportDto {

	/** バーコード文字列 */
	public String barcode39;
	/** 拠点名称 */
	public String centerNm;
	/** 輸送形態 */
	public String otherRefNo1;
	/** 整理番号(ヘッダ) */
	public String referenceNoHeader;
	/** 問合番号 */
	public String rmono;
	/** 出庫予定日 */
	public String shipSchDate;
	/** 受入先 */
	public String customerNm;
	/** パレット番号 */
	public String soPalletNo;
	/** 出力順(組織) */
	public String transportPriority;
	/** 銘柄コード */
	public String itemCd;
	/** IF銘柄コード */
	public String ifItemCd;
	/** 銘柄名称 */
	public String productNm;
	/** 出庫予定数量(ケース) */
	public Long expectCaseQty;
	/** 出庫予定数量(カートン) */
	public Long expectCartonQty;
	/** 商社搬入番号 */
	public String lot1;
	/** 製造年月 */
	public String lot4;
	/** 製造記号 */
	public String lot2;
	/** デザイン区分 */
	public String lot3;
	/** 整理番号 */
	public String referenceNo;
	/** 一般出力順 */
	public String userNum;
	/** パレタイズ順 */
	public String price2;
	/** 特約店フラグ */
	public Boolean isSpecialAgents;
	/** 商社搬入番号混載フラグ */
	public Boolean isMixLot1;
	/** 製造月混載フラグ */
	public Boolean isMixLot4;
	/** 整理番号混載フラグ */
	public Boolean isMixReferenceNo;

	// ===== 以下、ゲッタ・セッタ =====

	public String getBarcode39() {
		return barcode39;
	}

	public void setBarcode39(String barcode39) {
		this.barcode39 = barcode39;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getOtherRefNo1() {
		return otherRefNo1;
	}

	public void setOtherRefNo1(String otherRefNo1) {
		this.otherRefNo1 = otherRefNo1;
	}

	public String getReferenceNoHeader() {
		return referenceNoHeader;
	}

	public void setReferenceNoHeader(String referenceNoHeader) {
		this.referenceNoHeader = referenceNoHeader;
	}

	public String getRmono() {
		return rmono;
	}

	public void setRmono(String rmono) {
		this.rmono = rmono;
	}

	public String getShipSchDate() {
		return shipSchDate;
	}

	public void setShipSchDate(String shipSchDate) {
		this.shipSchDate = shipSchDate;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}

	public String getSoPalletNo() {
		return soPalletNo;
	}

	public void setSoPalletNo(String soPalletNo) {
		this.soPalletNo = soPalletNo;
	}

	public String getTransportPriority() {
		return transportPriority;
	}

	public void setTransportPriority(String transportPriority) {
		this.transportPriority = transportPriority;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getIfItemCd() {
		return ifItemCd;
	}

	public void setIfItemCd(String ifItemCd) {
		this.ifItemCd = ifItemCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public Long getExpectCaseQty() {
		return expectCaseQty;
	}

	public void setExpectCaseQty(Long expectCaseQty) {
		this.expectCaseQty = expectCaseQty;
	}

	public Long getExpectCartonQty() {
		return expectCartonQty;
	}

	public void setExpectCartonQty(Long expectCartonQty) {
		this.expectCartonQty = expectCartonQty;
	}

	public String getLot1() {
		return lot1;
	}

	public void setLot1(String lot1) {
		this.lot1 = lot1;
	}

	public String getLot4() {
		return lot4;
	}

	public void setLot4(String lot4) {
		this.lot4 = lot4;
	}

	public String getLot2() {
		return lot2;
	}

	public void setLot2(String lot2) {
		this.lot2 = lot2;
	}

	public String getLot3() {
		return lot3;
	}

	public void setLot3(String lot3) {
		this.lot3 = lot3;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}

	public Boolean getIsSpecialAgents() {
		return isSpecialAgents;
	}

	public void setIsSpecialAgents(Boolean isSpecialAgents) {
		this.isSpecialAgents = isSpecialAgents;
	}

	public Boolean getIsMixLot1() {
		return isMixLot1;
	}

	public void setIsMixLot1(Boolean isMixLot1) {
		this.isMixLot1 = isMixLot1;
	}

	public Boolean getIsMixLot4() {
		return isMixLot4;
	}

	public void setIsMixLot4(Boolean isMixLot4) {
		this.isMixLot4 = isMixLot4;
	}

	public Boolean getIsMixReferenceNo() {
		return isMixReferenceNo;
	}

	public void setIsMixReferenceNo(Boolean isMixReferenceNo) {
		this.isMixReferenceNo = isMixReferenceNo;
	}

}
