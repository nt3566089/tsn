package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 棚出リストDTOクラス
 */
public class BondedPickingListDto extends ReportDto {

	/** 単品・端数区分 */
	public String listKbn;
	/** 拠点コード */
	public String warehouseCd;
	/** 拠点名称 */
	public String centerNm;
	/** 出庫予定日(開始) */
	public String shipSchDateMin;
	/** 出庫予定日(終了) */
	public String shipSchDateMax;
	/** 棚出リストキー */
	public String workAllocateId;
	/** フロア */
	public String floor;
	/** バーコード文字列 */
	public String barcode39;
	/** ロケ */
	public String locCd;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名称 */
	public String productNm;
	/** 商社搬入番号 */
	public String lot1;
	/** 製造年月 */
	public String lot4;
	/** 製造記号 */
	public String lot2;
	/** 在庫区分 */
	public String otherLot1;
	/** デザイン */
	public String lot3;
	/** パレット(単品) */
	public Long palletQty;
	/** ケース(単品) */
	public Long caseQty;
	/** ケース(仕分場受入数) */
	public Long sortReceivedCaseQty;
	/** カートン(仕分場受入数) */
	public Long sortReceivedCartonQty;
	/** パレット(ピッキング数) */
	public Long pickedPalletQty;
	/** ケース(ピッキング数) */
	public Long pickedCaseQty;
	/** カートン(ピッキング数) */
	public Long pickedCartonQty;
	/** TSN在庫 */
	public String clientNm;
	/** 一般出力順 */
	public String userNum3;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getListKbn() {
		return listKbn;
	}

	public void setListKbn(String listKbn) {
		this.listKbn = listKbn;
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

	public String getShipSchDateMin() {
		return shipSchDateMin;
	}

	public void setShipSchDateMin(String shipSchDateMin) {
		this.shipSchDateMin = shipSchDateMin;
	}

	public String getShipSchDateMax() {
		return shipSchDateMax;
	}

	public void setShipSchDateMax(String shipSchDateMax) {
		this.shipSchDateMax = shipSchDateMax;
	}

	public String getWorkAllocateId() {
		return workAllocateId;
	}

	public void setWorkAllocateId(String workAllocateId) {
		this.workAllocateId = workAllocateId;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getBarcode39() {
		return barcode39;
	}

	public void setBarcode39(String barcode39) {
		this.barcode39 = barcode39;
	}

	public String getLocCd() {
		return locCd;
	}

	public void setLocCd(String locCd) {
		this.locCd = locCd;
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

	public String getLot2() {
		return lot2;
	}

	public void setLot2(String lot2) {
		this.lot2 = lot2;
	}

	public String getOtherLot1() {
		return otherLot1;
	}

	public void setOtherLot1(String otherLot1) {
		this.otherLot1 = otherLot1;
	}

	public String getLot3() {
		return lot3;
	}

	public void setLot3(String lot3) {
		this.lot3 = lot3;
	}

	public Long getPalletQty() {
		return palletQty;
	}

	public void setPalletQty(Long palletQty) {
		this.palletQty = palletQty;
	}

	public Long getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	public Long getSortReceivedCaseQty() {
		return sortReceivedCaseQty;
	}

	public void setSortReceivedCaseQty(Long sortReceivedCaseQty) {
		this.sortReceivedCaseQty = sortReceivedCaseQty;
	}

	public Long getSortReceivedCartonQty() {
		return sortReceivedCartonQty;
	}

	public void setSortReceivedCartonQty(Long sortReceivedCartonQty) {
		this.sortReceivedCartonQty = sortReceivedCartonQty;
	}

	public Long getPickedPalletQty() {
		return pickedPalletQty;
	}

	public void setPickedPalletQty(Long pickedPalletQty) {
		this.pickedPalletQty = pickedPalletQty;
	}

	public Long getPickedCaseQty() {
		return pickedCaseQty;
	}

	public void setPickedCaseQty(Long pickedCaseQty) {
		this.pickedCaseQty = pickedCaseQty;
	}

	public Long getPickedCartonQty() {
		return pickedCartonQty;
	}

	public void setPickedCartonQty(Long pickedCartonQty) {
		this.pickedCartonQty = pickedCartonQty;
	}

	public String getClientNm() {
		return clientNm;
	}

	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
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

}
