package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 製造年月日調査逆転リスト（仕分場）DTOクラス
 */
public class ProductionDateReverseListSortingPlaceDto extends ReportDto {

	/** 在庫調査日 */
	public String inventoryDate;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名称 */
	public String itemNm;
	/** 補充先 */
	public String repLocation;
	/** 仕分ラック番号 */
	public String sortingRackNum;
	/** 仕分ロケーションNo. */
	public String sortingLocationNum;
	/** 前回入力製造年月日 */
	public String bfManufactureDate;
	/** 月替り記号 */
	public String monthMark;
	/** 今回入力製造年月日 */
	public String afManufactureDate;
	/** 拠点コード */
	public String centerCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;
	/** 内外区分 */
	public String insideOutsideKbn;
	/** 一般出力順 */
	public String itemOrderby;
	/** 補充先ソートキー */
	public String assortedno;

	// ===== 以下、ゲッタ・セッタ =====

	public String getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public String getRepLocation() {
		return repLocation;
	}

	public void setRepLocation(String repLocation) {
		this.repLocation = repLocation;
	}

	public String getSortingRackNum() {
		return sortingRackNum;
	}

	public void setSortingRackNum(String sortingRackNum) {
		this.sortingRackNum = sortingRackNum;
	}

	public String getSortingLocationNum() {
		return sortingLocationNum;
	}

	public void setSortingLocationNum(String sortingLocationNum) {
		this.sortingLocationNum = sortingLocationNum;
	}

	public String getBfManufactureDate() {
		return bfManufactureDate;
	}

	public void setBfManufactureDate(String bfManufactureDate) {
		this.bfManufactureDate = bfManufactureDate;
	}

	public String getMonthMark() {
		return monthMark;
	}

	public void setMonthMark(String monthMark) {
		this.monthMark = monthMark;
	}

	public String getAfManufactureDate() {
		return afManufactureDate;
	}

	public void setAfManufactureDate(String afManufactureDate) {
		this.afManufactureDate = afManufactureDate;
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

	public String getInsideOutsideKbn() {
		return insideOutsideKbn;
	}

	public void setInsideOutsideKbn(String insideOutsideKbn) {
		this.insideOutsideKbn = insideOutsideKbn;
	}

	public String getItemOrderby() {
		return itemOrderby;
	}

	public void setItemOrderby(String itemOrderby) {
		this.itemOrderby = itemOrderby;
	}

	public String getAssortedno() {
		return assortedno;
	}

	public void setAssortedno(String assortedno) {
		this.assortedno = assortedno;
	}

}
