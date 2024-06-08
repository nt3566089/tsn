package com.oneslogi.base.dbflute.dto.customize;

import com.oneslogi.base.dbflute.dto.bs.customize.BsSqlOrderPickingDataListDto;

/**
 * The entity of SqlOrderPickingDataList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlOrderPickingDataListDto extends BsSqlOrderPickingDataListDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
	/** 商品単位 */
	private String productUnit;
	/** 入数内訳 */
	private String unitNumBreakdown;
	/** 出荷内訳 */
	private String pickingBreakdown;
	/** 引当内訳 */
	private String chargeBreakdown;

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
	public String getPickingBreakdown() {
		return pickingBreakdown;
	}
	public void setPickingBreakdown(String pickingBreakdown) {
		this.pickingBreakdown = pickingBreakdown;
	}
	public String getChargeBreakdown() {
		return chargeBreakdown;
	}
	public void setChargeBreakdown(String chargeBreakdown) {
		this.chargeBreakdown = chargeBreakdown;
	}
	// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End
}
