package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆指示ﾘｽﾄ入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceInstListDto extends HandyBaseDto {

    /** 指示ﾘｽﾄ */
    @QueryParam("inventoryKey")
    private String inventoryKey;

    /**
     * @return inventoryKey
     */
    public String getInventoryKey() {
        return inventoryKey;
    }

    /**
     * @param set inventoryKey
     */
    public void setInventoryKey(String inventoryKey) {
        this.inventoryKey = inventoryKey;
    }
}
