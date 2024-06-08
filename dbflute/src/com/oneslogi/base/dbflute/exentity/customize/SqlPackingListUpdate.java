package com.oneslogi.base.dbflute.exentity.customize;

import com.oneslogi.base.dbflute.bsentity.customize.BsSqlPackingListUpdate;

/**
 * The entity of SqlPackingListUpdate.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlPackingListUpdate extends BsSqlPackingListUpdate {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    private String boxNo;

    private String updateRow;
  //[Ver3.0] unit of measure対応 2017.11.22 ライ Start
    private String productUnit;
    // [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
    private String unitNumBreakdown;
	// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
    //[Ver3.0] unit of measure対応 2017.11.22 ライ END
	// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
    private Long boxId;
	// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getUpdateRow() {
		return updateRow;
	}

	public void setUpdateRow(String updateRow) {
		this.updateRow = updateRow;
	}

	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	public Long getBoxId() {
		return boxId;
	}

	public void setBoxId(Long boxId) {
		this.boxId = boxId;
	}
}

