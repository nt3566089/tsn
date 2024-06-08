package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTInventoryInpHistDto;

/**
 * The entity of T_INVENTORY_INP_HIST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInpHistDto extends BsTInventoryInpHistDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // [Ver3.0] unit of measure対応 2017.11.22 駱 Start
   	// 商品単位
   	private String productUnit;

   	// 入数内訳
   	private String unitNumBreakdown;

   	// 棚卸内訳
   	private String inventoryBeforeBreakdown;

   	// 棚卸前内訳
   	private String inventoryBreakdown;
   	// [Ver3.0] unit of measure対応 2017.11.22 駱 End


    // [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng Start
    // 入庫実績ボディの商品荷姿．入数
    public static final String SHAPE_UnitNum = "SHAPE_UNIT_NUM";
    private Long shapeUnitNum;

    public Long getShapeUnitNum() {
		return shapeUnitNum;
	}
	public void setShapeUnitNum(Long shapeUnitNum) {
		this.shapeUnitNum = shapeUnitNum;
	}

	// [Ver3.0] unit of measure対応 2017.11.22 駱 Start
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

	public String getInventoryBeforeBreakdown() {
		return inventoryBeforeBreakdown;
	}

	public void setInventoryBeforeBreakdown(String inventoryBeforeBreakdown) {
		this.inventoryBeforeBreakdown = inventoryBeforeBreakdown;
	}

	public String getInventoryBreakdown() {
		return inventoryBreakdown;
	}

	public void setInventoryBreakdown(String inventoryBreakdown) {
		this.inventoryBreakdown = inventoryBreakdown;
	}
		// [Ver3.0] unit of measure対応 2017.11.22 駱 End
	// [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng End
}
