package com.oneslogi.base.dbflute.exentity.customize;

import com.oneslogi.base.dbflute.bsentity.customize.BsSqlSLPickingListPrint;

/**
 * The entity of SqlSLPickingListPrint.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlSLPickingListPrint extends BsSqlSLPickingListPrint {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;

	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}

	public String getBreakdown() {
	return breakdown;
	}

	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
	// [Ver3.0] unit of measure対応 2017.11.23 REN End

}
