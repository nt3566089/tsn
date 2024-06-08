package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 融通山出しリストDTOクラス
 */
public class ReplenishStockTransferListDto extends ReportDto {

	/** バーコード文字列 */
	public String barcode39;
	/** 発送先CD */
	public String shipCd;
	/** 発送先名称 */
	public String shipName;
	/** 発送予定日 */
	public String schDate;
	/** 輸送番号 */
	public String transportCd;
	/** リストNo. */
	public String flexPickListno;
	/** 銘柄CD */
	public String itemCd;
	/** 銘柄名称 */
	public String itemName;
	/** 製造年月日 */
	public String manufacturDate;
	/** デザイン区分 */
	public String designCd;
	/** 指示数量（ケース） */
	public Long qtyCase;
	/** 指示数量（カートン） */
	public Long qtyBowl;
	/** 使用区分 */
	public String userNum1;
	/** 一般出力順 */
	public String userNum3;
	/** 拠点CD */
	public String warehouseCd;
	/** 拠点名称 */
	public String warehouseName;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getBarcode39() {
		return barcode39;
	}

	public void setBarcode39(String barcode39) {
		this.barcode39 = barcode39;
	}

	public String getShipCd() {
		return shipCd;
	}

	public void setShipCd(String shipCd) {
		this.shipCd = shipCd;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getSchDate() {
		return schDate;
	}

	public void setSchDate(String schDate) {
		this.schDate = schDate;
	}

	public String getTransportCd() {
		return transportCd;
	}

	public void setTransportCd(String transportCd) {
		this.transportCd = transportCd;
	}

	public String getFlexPickListno() {
		return flexPickListno;
	}

	public void setFlexPickListno(String flexPickListno) {
		this.flexPickListno = flexPickListno;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getManufacturDate() {
		return manufacturDate;
	}

	public void setManufacturDate(String manufacturDate) {
		this.manufacturDate = manufacturDate;
	}

	public String getDesignCd() {
		return designCd;
	}

	public void setDesignCd(String designCd) {
		this.designCd = designCd;
	}

	public Long getQtyCase() {
		return qtyCase;
	}

	public void setQtyCase(Long qtyCase) {
		this.qtyCase = qtyCase;
	}

	public Long getQtyBowl() {
		return qtyBowl;
	}

	public void setQtyBowl(Long qtyBowl) {
		this.qtyBowl = qtyBowl;
	}

	public String getUserNum1() {
		return userNum1;
	}

	public void setUserNum1(String userNum1) {
		this.userNum1 = userNum1;
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

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
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
