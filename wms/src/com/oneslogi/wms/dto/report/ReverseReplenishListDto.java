package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 逆転補充リストDTOクラス
 */
public class ReverseReplenishListDto extends ReportDto {

	/** 仕分補充区分 */
	public String sortStockKbn;
	/** 補充先 */
	public String sotedUnit;
	/** 仕分ラック番号 */
	public String sortLackNo;
	/** 仕分ロケNo. */
	public String sortLocationNo;
	/** 銘柄CD */
	public String itemCd;
	/** 銘柄名称 */
	public String sName;
	/** 仕分ロケ内製造年月日 */
	public String soManufactureDate;
	/** 補充製品製造年月日 */
	public String stManufactureDate;
	/** 月替り記号 */
	public String monthDifferenceMark;
	/** 補充先ソートキー */
	public String rmaNo;
	/** 内外区分 */
	public String userNum1;
	/** 一般出力順 */
	public String userNum3;
	/** 拠点CD */
	public String centerCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザCD */
	public String userCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getSortStockKbn() {
		return sortStockKbn;
	}

	public void setSortStockKbn(String sortStockKbn) {
		this.sortStockKbn = sortStockKbn;
	}

	public String getSotedUnit() {
		return sotedUnit;
	}

	public void setSotedUnit(String sotedUnit) {
		this.sotedUnit = sotedUnit;
	}

	public String getSortLackNo() {
		return sortLackNo;
	}

	public void setSortLackNo(String sortLackNo) {
		this.sortLackNo = sortLackNo;
	}

	public String getSortLocationNo() {
		return sortLocationNo;
	}

	public void setSortLocationNo(String sortLocationNo) {
		this.sortLocationNo = sortLocationNo;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public String getSoManufactureDate() {
		return soManufactureDate;
	}

	public void setSoManufactureDate(String soManufactureDate) {
		this.soManufactureDate = soManufactureDate;
	}

	public String getStManufactureDate() {
		return stManufactureDate;
	}

	public void setStManufactureDate(String stManufactureDate) {
		this.stManufactureDate = stManufactureDate;
	}

	public String getMonthDifferenceMark() {
		return monthDifferenceMark;
	}

	public void setMonthDifferenceMark(String monthDifferenceMark) {
		this.monthDifferenceMark = monthDifferenceMark;
	}

	public String getRmaNo() {
		return rmaNo;
	}

	public void setRmaNo(String rmaNo) {
		this.rmaNo = rmaNo;
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

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

}
