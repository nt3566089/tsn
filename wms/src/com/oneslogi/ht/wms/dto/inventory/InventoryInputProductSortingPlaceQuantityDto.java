package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆仕分場調査入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceQuantityDto extends HandyBaseDto {

    /** ｹｰｽ */
    @QueryParam("caseQty")
    private String caseQty;

    /**
     * @return caseQty
     */
    public String getCaseQty() {
        return caseQty;
    }

    /**
     * @param set caseQty
     */
    public void setCaseQty(String caseQty) {
        this.caseQty = caseQty;
    }

    /** ｶｰﾄﾝ */
    @QueryParam("cartonQty")
    private String cartonQty;

    /**
     * @return cartonQty
     */
    public String getCartonQty() {
        return cartonQty;
    }

    /**
     * @param set cartonQty
     */
    public void setCartonQty(String cartonQty) {
        this.cartonQty = cartonQty;
    }

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
