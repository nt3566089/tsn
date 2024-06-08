package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 積込リストDTOクラス
 */
public class ShippingLoadingListDto extends ReportDto {

	/** 依頼種別 */
	public String orderType;
	/** 問合番号 */
	public String rmaNo;
	/** 整理番号 */
	public String ownerSoNo;
	/** 輸送形態 */
	public String otherRefNo1;
	/** 受入先コード */
	public String shitToCd;
	/** 受入先名称 */
	public String customerNm;
	/** 出庫予定日 */
	public String shipSchDate;
	/** 号車 */
	public String carNo;
	/** バーコード文字列 */
	public String barcode39;
	/** 出力順(組織) */
	public String transportPriority;
	/** 出庫関連リストキー */
	public String trsoListKey;
	/** P/LNo. */
	public String plNo;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名称 */
	public String productNm;
	/** 商社搬入番号 */
	public String lot1;
	/** 製造年月 */
	public String lot4;
	/** デザイン */
	public String lot3;
	/** ケース数 */
	public Long caseQty;
	/** カートン数 */
	public Long cartonQty;
	/** パレタイズ順 */
	public String price2;
	/** 一般出力順 */
	public String userNum3;
	/** 拠点コード */
	public String warehouseCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;
	/** 特約店フラグ */
	public Boolean isSpecialAgents;

	// ===== 以下、ゲッタ・セッタ =====

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRmaNo() {
		return rmaNo;
	}

	public void setRmaNo(String rmaNo) {
		this.rmaNo = rmaNo;
	}

	public String getOwnerSoNo() {
		return ownerSoNo;
	}

	public void setOwnerSoNo(String ownerSoNo) {
		this.ownerSoNo = ownerSoNo;
	}

	public String getOtherRefNo1() {
		return otherRefNo1;
	}

	public void setOtherRefNo1(String otherRefNo1) {
		this.otherRefNo1 = otherRefNo1;
	}

	public String getShitToCd() {
		return shitToCd;
	}

	public void setShitToCd(String shitToCd) {
		this.shitToCd = shitToCd;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}

	public String getShipSchDate() {
		return shipSchDate;
	}

	public void setShipSchDate(String shipSchDate) {
		this.shipSchDate = shipSchDate;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getBarcode39() {
		return barcode39;
	}

	public void setBarcode39(String barcode39) {
		this.barcode39 = barcode39;
	}

	public String getTransportPriority() {
		return transportPriority;
	}

	public void setTransportPriority(String transportPriority) {
		this.transportPriority = transportPriority;
	}

	public String getTrsoListKey() {
		return trsoListKey;
	}

	public void setTrsoListKey(String trsoListKey) {
		this.trsoListKey = trsoListKey;
	}

	public String getPlNo() {
		return plNo;
	}

	public void setPlNo(String plNo) {
		this.plNo = plNo;
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

	public String getLot3() {
		return lot3;
	}

	public void setLot3(String lot3) {
		this.lot3 = lot3;
	}

	public Long getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	public Long getCartonQty() {
		return cartonQty;
	}

	public void setCartonQty(Long cartonQty) {
		this.cartonQty = cartonQty;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
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

	public Boolean getIsSpecialAgents() {
		return isSpecialAgents;
	}

	public void setIsSpecialAgents(Boolean isSpecialAgents) {
		this.isSpecialAgents = isSpecialAgents;
	}

}
