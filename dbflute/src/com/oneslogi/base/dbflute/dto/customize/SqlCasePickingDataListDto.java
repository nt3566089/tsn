package com.oneslogi.base.dbflute.dto.customize;

import com.oneslogi.base.dbflute.dto.bs.customize.BsSqlCasePickingDataListDto;

/**
 * The entity of SqlCasePickingDataList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlCasePickingDataListDto extends BsSqlCasePickingDataListDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod Start
	/** 商品単位 */
	private String productUnit;
	/** 入数内訳 */
	private String unitNumBreakdown;
	/** ピック数(ケース) */
	private String caseBreakdown;
	/** ピック数(バラ) */
	private String baraBreakdown;

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
	public String getCaseBreakdown() {
		return caseBreakdown;
	}
	public void setCaseBreakdown(String caseBreakdown) {
		this.caseBreakdown = caseBreakdown;
	}
	public String getBaraBreakdown() {
		return baraBreakdown;
	}
	public void setBaraBreakdown(String baraBreakdown) {
		this.baraBreakdown = baraBreakdown;
	}
	// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod End
}
