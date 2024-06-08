package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆調査ﾛｹｰｼｮﾝ入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceLocationDto extends HandyBaseDto {

    /** 調査ﾛｹｰｼｮﾝ */
    @QueryParam("locationCd")
    private String locationCd;

    /**
     * @return locationCd
     */
    public String getLocationCd() {
        return locationCd;
    }

    /**
     * @param set locationCd
     */
    public void setLocationCd(String locationCd) {
        this.locationCd = locationCd;
    }
}
