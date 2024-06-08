package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆製品不良数入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceDefectiveQuantityDto extends HandyBaseDto {

    /** 製品不良 */
    @QueryParam("defectiveQty")
    private String defectiveQty;

    /**
     * @return defectiveQty
     */
    public String getDefectiveQty() {
        return defectiveQty;
    }

    /**
     * @param set defectiveQty
     */
    public void setDefectiveQty(String defectiveQty) {
        this.defectiveQty = defectiveQty;
    }
}
