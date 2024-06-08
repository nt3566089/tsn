package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * 店別段ボール配達品明細リスト(紙) DTOクラス
 */
public class ShopCardboardDeriveriesDtlListDto extends ReportDto {

	/** 仕分作業回数 */
	public BigDecimal sortingQty;
	/** ライン名 */
	public String lineNm;
	/** 配達日 */
	public String deliveryDate;
	/** 配達拠点コード */
	public String centerCd;
	/** 配達拠点名 */
	public String centerNm;
	/** 方面 */
	public String directionCd;
	/** 通番 */
	public String serialNum;
	/** お得意様コード */
	public String customerCd;
	/** お得意様名 */
	public String customerNm;
	/** 段ボール数_集計値 */
	public BigDecimal totalSerialNumCaseQty;
	/** 銘柄名 */
	public String itemNm;
	/** 段ボール数 */
	public BigDecimal caseQty;
	/** 方面計 */
	public BigDecimal totalDirectionCaseQty;
	/** 通番枝番 */
	public BigDecimal serialBranchNum;
	/** 内外区分 */
	public String classification;
	/** 一般出力順 */
	public BigDecimal outputOrder;

	// ===== 以下、ゲッタ・セッタ =====

	public BigDecimal getSortingQty() {
		return sortingQty;
	}

	public void setSortingQty(BigDecimal sortingQty) {
		this.sortingQty = sortingQty;
	}

	public String getLineNm() {
		return lineNm;
	}

	public void setLineNm(String lineNm) {
		this.lineNm = lineNm;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
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

	public String getDirectionCd() {
		return directionCd;
	}

	public void setDirectionCd(String directionCd) {
		this.directionCd = directionCd;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}

	public BigDecimal getTotalSerialNumCaseQty() {
		return totalSerialNumCaseQty;
	}

	public void setTotalSerialNumCaseQty(BigDecimal totalSerialNumCaseQty) {
		this.totalSerialNumCaseQty = totalSerialNumCaseQty;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public BigDecimal getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(BigDecimal caseQty) {
		this.caseQty = caseQty;
	}

	public BigDecimal getTotalDirectionCaseQty() {
		return totalDirectionCaseQty;
	}

	public void setTotalDirectionCaseQty(BigDecimal totalDirectionCaseQty) {
		this.totalDirectionCaseQty = totalDirectionCaseQty;
	}

	public BigDecimal getSerialBranchNum() {
		return serialBranchNum;
	}

	public void setSerialBranchNum(BigDecimal serialBranchNum) {
		this.serialBranchNum = serialBranchNum;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public BigDecimal getOutputOrder() {
		return outputOrder;
	}

	public void setOutputOrder(BigDecimal outputOrder) {
		this.outputOrder = outputOrder;
	}

}
