package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * パレット明細（単品）DTOクラス
 */
public class PalleteDtlSingleDto extends ReportDto {

	/** ロケコード */
	public String locCd;
	/** 出力順(組織) */
	public String transportPriority;
	/** 棚出リストキー */
	public String workAllocateId;
	/** 一般出力順 */
	public String userNum;
	/** 拠点名称 */
	public String centerNm;
	/** 輸送形態 */
	public String otherRefNo1;
	/** 整理番号 */
	public String referenceNo;
	/** 問合番号 */
	public String rmaNo;
	/** 出庫予定日 */
	public String shipSchDate;
	/** パレット番号 */
	public String soPalletNo;
	/** 受入先 */
	public String customerNm;
	/** 銘柄コード */
	public String itemCd;
	/** IF銘柄コード */
	public String ifItemCd;
	/** 銘柄名称 */
	public String productNm;
	/** 商社搬入番号 */
	public String lot1;
	/** 製造年月 */
	public String lot4;
	/** 出庫予定数量(ケース) */
	public Long expectQty;
	/** 製造記号 */
	public String lot2;
	/** デザイン区分 */
	public String lot3;
	/** バーコード文字列 */
	public String barcode39;
	/** 在庫区分名称 */
	public String stkClsNm;
	/** 出庫時備考 */
	public String spgWorkComment;
	/** 特約店フラグ */
	public Boolean isSpecialAgents;

	// ===== 以下、ゲッタ・セッタ =====

	public String getLocCd() {
		return locCd;
	}

	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}

	public String getTransportPriority() {
		return transportPriority;
	}

	public void setTransportPriority(String transportPriority) {
		this.transportPriority = transportPriority;
	}

	public String getWorkAllocateId() {
		return workAllocateId;
	}

	public void setWorkAllocateId(String workAllocateId) {
		this.workAllocateId = workAllocateId;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
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

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getRmaNo() {
		return rmaNo;
	}

	public void setRmaNo(String rmaNo) {
		this.rmaNo = rmaNo;
	}

	public String getShipSchDate() {
		return shipSchDate;
	}

	public void setShipSchDate(String shipSchDate) {
		this.shipSchDate = shipSchDate;
	}

	public String getSoPalletNo() {
		return soPalletNo;
	}

	public void setSoPalletNo(String soPalletNo) {
		this.soPalletNo = soPalletNo;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
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

	public Long getExpectQty() {
		return expectQty;
	}

	public void setExpectQty(Long expectQty) {
		this.expectQty = expectQty;
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

	public String getBarcode39() {
		return barcode39;
	}

	public void setBarcode39(String barcode39) {
		this.barcode39 = barcode39;
	}

	public String getStkClsNm() {
		return stkClsNm;
	}

	public void setStkClsNm(String stkClsNm) {
		this.stkClsNm = stkClsNm;
	}

	public String getSpgWorkComment() {
		return spgWorkComment;
	}

	public void setSpgWorkComment(String spgWorkComment) {
		this.spgWorkComment = spgWorkComment;
	}

	public Boolean getIsSpecialAgents() {
		return isSpecialAgents;
	}

	public void setIsSpecialAgents(Boolean isSpecialAgents) {
		this.isSpecialAgents = isSpecialAgents;
	}

}
