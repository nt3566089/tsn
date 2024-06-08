package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * 不適品在庫調査表DTOクラス
 */
public class NonconformityStockReportListDto extends ReportDto {

	/** 在庫調査日 */
	public String inventoryDt;
	/** 銘柄区分 */
	public String userNum4;
	/** 内外区分(ソートキー) */
	public String fcFlg;
	/** 銘柄コード */
	public String prodctCd;
	/** 銘柄名称 */
	public String productAbbr;
	/** 累計過不足_返品 */
	public BigDecimal diffqtyHenpin1;
	/** 累計過不足_国税還付品 */
	public BigDecimal diffqtyTaxRefond1;
	/** 不適品在庫計 */
	public BigDecimal nonconformityStockTotalNum1;
	/** ケース */
	public BigDecimal stockCaseSu1;
	/** カートン */
	public BigDecimal stockCartonSu1;
	/** 個装 */
	public BigDecimal monthStatusSu1;
	/** り災品 */
	public BigDecimal suffErerQty1;
	/** 梱包数 */
	public BigDecimal packingNum1;
	/** 国税還付品 */
	public BigDecimal refundItemQty1;
	/** 一般出力順 */
	public String userNum;
	/** 過剰_返品 */
	public BigDecimal diffqtyHenpin2;
	/** 過剰_国税還付品 */
	public BigDecimal diffqtyTaxRefond2;
	/** 不足_返品 */
	public BigDecimal diffqtyHenpin3;
	/** 不足_国税還付品 */
	public BigDecimal diffqtyTaxRefond3;
	/** 不適品在庫_合計 */
	public BigDecimal nonconformityStockTotalNum2;
	/** ケース_合計 */
	public BigDecimal stockCaseSu2;
	/** カートン_合計 */
	public BigDecimal stockCartonSu2;
	/** 個装_合計 */
	public BigDecimal monthStatusSu2;
	/** り災品_合計 */
	public BigDecimal suffErerQty2;
	/** 梱包数_合計 */
	public BigDecimal packingNum2;
	/** 国税還付品_合計 */
	public BigDecimal refundItemQty2;
	/** 拠点コ－ド */
	public String centerCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;
	/** たばこ商品区分 */
	public String cggdId;
	/** たばこ商品区分(ソートキー) */
	public String cggdId2;

	// ===== 以下、ゲッタ・セッタ =====

	public String getInventoryDt() {
		return inventoryDt;
	}

	public void setInventoryDt(String inventoryDt) {
		this.inventoryDt = inventoryDt;
	}

	public String getUserNum4() {
		return userNum4;
	}

	public void setUserNum4(String userNum4) {
		this.userNum4 = userNum4;
	}

	public String getFcFlg() {
		return fcFlg;
	}

	public void setFcFlg(String fcFlg) {
		this.fcFlg = fcFlg;
	}

	public String getProdctCd() {
		return prodctCd;
	}

	public void setProdctCd(String prodctCd) {
		this.prodctCd = prodctCd;
	}

	public String getProductAbbr() {
		return productAbbr;
	}

	public void setProductAbbr(String productAbbr) {
		this.productAbbr = productAbbr;
	}

	public BigDecimal getDiffqtyHenpin1() {
		return diffqtyHenpin1;
	}

	public void setDiffqtyHenpin1(BigDecimal diffqtyHenpin1) {
		this.diffqtyHenpin1 = diffqtyHenpin1;
	}

	public BigDecimal getDiffqtyTaxRefond1() {
		return diffqtyTaxRefond1;
	}

	public void setDiffqtyTaxRefond1(BigDecimal diffqtyTaxRefond1) {
		this.diffqtyTaxRefond1 = diffqtyTaxRefond1;
	}

	public BigDecimal getNonconformityStockTotalNum1() {
		return nonconformityStockTotalNum1;
	}

	public void setNonconformityStockTotalNum1(BigDecimal nonconformityStockTotalNum1) {
		this.nonconformityStockTotalNum1 = nonconformityStockTotalNum1;
	}

	public BigDecimal getStockCaseSu1() {
		return stockCaseSu1;
	}

	public void setStockCaseSu1(BigDecimal stockCaseSu1) {
		this.stockCaseSu1 = stockCaseSu1;
	}

	public BigDecimal getStockCartonSu1() {
		return stockCartonSu1;
	}

	public void setStockCartonSu1(BigDecimal stockCartonSu1) {
		this.stockCartonSu1 = stockCartonSu1;
	}

	public BigDecimal getMonthStatusSu1() {
		return monthStatusSu1;
	}

	public void setMonthStatusSu1(BigDecimal monthStatusSu1) {
		this.monthStatusSu1 = monthStatusSu1;
	}

	public BigDecimal getSuffErerQty1() {
		return suffErerQty1;
	}

	public void setSuffErerQty1(BigDecimal suffErerQty1) {
		this.suffErerQty1 = suffErerQty1;
	}

	public BigDecimal getPackingNum1() {
		return packingNum1;
	}

	public void setPackingNum1(BigDecimal packingNum1) {
		this.packingNum1 = packingNum1;
	}

	public BigDecimal getRefundItemQty1() {
		return refundItemQty1;
	}

	public void setRefundItemQty1(BigDecimal refundItemQty1) {
		this.refundItemQty1 = refundItemQty1;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public BigDecimal getDiffqtyHenpin2() {
		return diffqtyHenpin2;
	}

	public void setDiffqtyHenpin2(BigDecimal diffqtyHenpin2) {
		this.diffqtyHenpin2 = diffqtyHenpin2;
	}

	public BigDecimal getDiffqtyTaxRefond2() {
		return diffqtyTaxRefond2;
	}

	public void setDiffqtyTaxRefond2(BigDecimal diffqtyTaxRefond2) {
		this.diffqtyTaxRefond2 = diffqtyTaxRefond2;
	}

	public BigDecimal getDiffqtyHenpin3() {
		return diffqtyHenpin3;
	}

	public void setDiffqtyHenpin3(BigDecimal diffqtyHenpin3) {
		this.diffqtyHenpin3 = diffqtyHenpin3;
	}

	public BigDecimal getDiffqtyTaxRefond3() {
		return diffqtyTaxRefond3;
	}

	public void setDiffqtyTaxRefond3(BigDecimal diffqtyTaxRefond3) {
		this.diffqtyTaxRefond3 = diffqtyTaxRefond3;
	}

	public BigDecimal getNonconformityStockTotalNum2() {
		return nonconformityStockTotalNum2;
	}

	public void setNonconformityStockTotalNum2(BigDecimal nonconformityStockTotalNum2) {
		this.nonconformityStockTotalNum2 = nonconformityStockTotalNum2;
	}

	public BigDecimal getStockCaseSu2() {
		return stockCaseSu2;
	}

	public void setStockCaseSu2(BigDecimal stockCaseSu2) {
		this.stockCaseSu2 = stockCaseSu2;
	}

	public BigDecimal getStockCartonSu2() {
		return stockCartonSu2;
	}

	public void setStockCartonSu2(BigDecimal stockCartonSu2) {
		this.stockCartonSu2 = stockCartonSu2;
	}

	public BigDecimal getMonthStatusSu2() {
		return monthStatusSu2;
	}

	public void setMonthStatusSu2(BigDecimal monthStatusSu2) {
		this.monthStatusSu2 = monthStatusSu2;
	}

	public BigDecimal getSuffErerQty2() {
		return suffErerQty2;
	}

	public void setSuffErerQty2(BigDecimal suffErerQty2) {
		this.suffErerQty2 = suffErerQty2;
	}

	public BigDecimal getPackingNum2() {
		return packingNum2;
	}

	public void setPackingNum2(BigDecimal packingNum2) {
		this.packingNum2 = packingNum2;
	}

	public BigDecimal getRefundItemQty2() {
		return refundItemQty2;
	}

	public void setRefundItemQty2(BigDecimal refundItemQty2) {
		this.refundItemQty2 = refundItemQty2;
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

	public String getCggdId() {
		return cggdId;
	}

	public void setCggdId(String cggdId) {
		this.cggdId = cggdId;
	}

	public String getCggdId2() {
		return cggdId2;
	}

	public void setCggdId2(String cggdId2) {
		this.cggdId2 = cggdId2;
	}

}
