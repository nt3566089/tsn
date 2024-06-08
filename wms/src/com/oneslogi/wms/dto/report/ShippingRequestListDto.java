package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 出庫依頼書DTOクラス
 */
public class ShippingRequestListDto extends ReportDto {

	/** 出庫先CD */
	public String shipToCode;
	/** 出庫先名称 */
	public String planName;
	/** 特約店CD */
	public String originalPONo;
	/** 納品日 */
	public String deliveryDate;
	/** 発注番号 */
	public String purchaseNumber;
	/** 出庫伝票番号 */
	public String ownerDirectNo;
	/** 受注日 */
	public String orderDate;
	/** 指図日 */
	public String instructionsDate;
	/** 受注番号 */
	public String orderNumber;
	/** 銘柄テキスト */
	public String planItemName;
	/** SKU Code */
	public String skuCode;
	/** 受注数量 */
	public Long expectQty;
	/** 銘柄CD */
	public String itemCd;
	/** 段ボール */
	public Long cardBoard;
	/** カートン */
	public Long carTon;
	/** 合計（受注数） */
	public Long totalExpectQty;
	/** 合計（段ボール） */
	public Long totalCaseQty1;
	/** 合計（カートン） */
	public Long totalCarTonQty;
	/** 備考 */
	public String note;
	/** 拠点CD */
	public String centerCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザ名 */
	public String userNm;
	/** ユーザCD */
	public String userCd;
	/** フッタ項目 表示フラグ */
	public Boolean showFooterItemFlg;

	// ===== 以下、ゲッタ・セッタ =====

	public String getShipToCode() {
		return shipToCode;
	}

	public void setShipToCode(String shipToCode) {
		this.shipToCode = shipToCode;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getOriginalPONo() {
		return originalPONo;
	}

	public void setOriginalPONo(String originalPONo) {
		this.originalPONo = originalPONo;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(String purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public String getOwnerDirectNo() {
		return ownerDirectNo;
	}

	public void setOwnerDirectNo(String ownerDirectNo) {
		this.ownerDirectNo = ownerDirectNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getInstructionsDate() {
		return instructionsDate;
	}

	public void setInstructionsDate(String instructionsDate) {
		this.instructionsDate = instructionsDate;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPlanItemName() {
		return planItemName;
	}

	public void setPlanItemName(String planItemName) {
		this.planItemName = planItemName;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Long getExpectQty() {
		return expectQty;
	}

	public void setExpectQty(Long expectQty) {
		this.expectQty = expectQty;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public Long getCardBoard() {
		return cardBoard;
	}

	public void setCardBoard(Long cardBoard) {
		this.cardBoard = cardBoard;
	}

	public Long getCarTon() {
		return carTon;
	}

	public void setCarTon(Long carTon) {
		this.carTon = carTon;
	}

	public Long getTotalExpectQty() {
		return totalExpectQty;
	}

	public void setTotalExpectQty(Long totalExpectQty) {
		this.totalExpectQty = totalExpectQty;
	}

	public Long getTotalCaseQty1() {
		return totalCaseQty1;
	}

	public void setTotalCaseQty1(Long totalCaseQty1) {
		this.totalCaseQty1 = totalCaseQty1;
	}

	public Long getTotalCarTonQty() {
		return totalCarTonQty;
	}

	public void setTotalCarTonQty(Long totalCarTonQty) {
		this.totalCarTonQty = totalCarTonQty;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public Boolean getShowFooterItemFlg() {
		return showFooterItemFlg;
	}

	public void setShowFooterItemFlg(Boolean showFooterItemFlg) {
		this.showFooterItemFlg = showFooterItemFlg;
	}

}
