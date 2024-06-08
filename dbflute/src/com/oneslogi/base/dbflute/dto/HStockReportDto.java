package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsHStockReportDto;

/**
 * The entity of h_stock_report.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HStockReportDto extends BsHStockReportDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

 // [Ver3.0] unit of measure対応 2017.11.28 駱 Start
    /** 商品単位 */
    private String productUnit;

    /** 入数内訳 */
    private String unitNumBreakdown;

    /** 在庫内訳 */
    private String stockBreakdown;

    /** 引当可能内訳 */
    private String chargeBreakdown;

    /** 引当済内訳 */
    private String allocBreakdown;

    /** 作業中内訳 */
    private String moveBreakdown;

    /** 積送中内訳 */
    private String transitBreakdown;

    /** 内訳 */
    private String breakdown;

    /** 入数 */
    private String stringUnitNum;

    /** 最小梱包単位 */
    private String minimumPackingUnit;

    // [Ver3.0] unit of measure対応 2017.11.28 駱 Start
    public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	public String getStockBreakdown() {
		return stockBreakdown;
	}

	public void setStockBreakdown(String stockBreakdown) {
		this.stockBreakdown = stockBreakdown;
	}

	public String getChargeBreakdown() {
		return chargeBreakdown;
	}

	public void setChargeBreakdown(String chargeBreakdown) {
		this.chargeBreakdown = chargeBreakdown;
	}

	public String getAllocBreakdown() {
		return allocBreakdown;
	}

	public void setAllocBreakdown(String allocBreakdown) {
		this.allocBreakdown = allocBreakdown;
	}

	public String getMoveBreakdown() {
		return moveBreakdown;
	}

	public void setMoveBreakdown(String moveBreakdown) {
		this.moveBreakdown = moveBreakdown;
	}

	public String getTransitBreakdown() {
		return transitBreakdown;
	}

	public void setTransitBreakdown(String transitBreakdown) {
		this.transitBreakdown = transitBreakdown;
	}

	public String getBreakdown() {
		return breakdown;
	}

	public void setBreakdown(String breakdown) {
		this.breakdown = breakdown;
	}

	public String getStringUnitNum() {
		return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
		this.stringUnitNum = stringUnitNum;
	}

	public String getMinimumPackingUnit() {
		return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
		this.minimumPackingUnit = minimumPackingUnit;
	}
    // [Ver3.0] unit of measure対応 2017.11.28 駱 End
}
