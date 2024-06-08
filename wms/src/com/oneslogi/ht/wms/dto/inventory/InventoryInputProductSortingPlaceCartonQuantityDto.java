package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆先頭ｹｰｽ数量入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceCartonQuantityDto extends HandyBaseDto {

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
}
