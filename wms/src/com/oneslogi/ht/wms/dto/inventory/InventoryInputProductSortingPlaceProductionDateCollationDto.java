package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆製造年月日照合画面情報
 *
 */
public class InventoryInputProductSortingPlaceProductionDateCollationDto extends HandyBaseDto {

    /** 製造年月日 */
    @QueryParam("manufactureDate")
    private String manufactureDate;

    /**
     * @return manufactureDate
     */
    public String getManufactureDate() {
        return manufactureDate;
    }

    /**
     * @param set manufactureDate
     */
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
