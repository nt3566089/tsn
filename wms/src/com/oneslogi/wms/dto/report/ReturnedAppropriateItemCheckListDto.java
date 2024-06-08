package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 *返品適品リストDTOクラス
 */
public class ReturnedAppropriateItemCheckListDto extends ReportDto {

	/** 国産／輸入 */
	public String fromAddress1;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名称 */
	public String itemName;
	/** 仕分場製造年月日 */
	public String manufactureDate;
	/** カートン数量 */
	public BigDecimal receivedQty;
	/** 内外区分 */
	public String userNum1;
	/** 一般出力順 */
	public String userNum3;
	/** カートン数量_合計 */
	public BigDecimal receivedQtyTotal;
	/** 拠点コード */
	public String centerCd;
	/** 拠点名称 */
	public String centerAbbr;
	/** ユーザコード */
	public String userCd;


	// ===== 以下、ゲッタ・セッタ =====

	public String getFromAddress1() {
		return fromAddress1;
	}

	public void setFromAddress1(String fromAddress1) {
		this.fromAddress1 = fromAddress1;
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

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public BigDecimal getReceivedQty() {
		return receivedQty;
	}

	public void setReceivedQty(BigDecimal receivedQty) {
		this.receivedQty = receivedQty;
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

	public BigDecimal getReceivedQtyTotal() {
		return receivedQtyTotal;
	}

	public void setReceivedQtyTotal(BigDecimal receivedQtyTotal) {
		this.receivedQtyTotal = receivedQtyTotal;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCenterAbbr() {
		return centerAbbr;
	}

	public void setCenterAbbr(String centerAbbr) {
		this.centerAbbr = centerAbbr;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

}
