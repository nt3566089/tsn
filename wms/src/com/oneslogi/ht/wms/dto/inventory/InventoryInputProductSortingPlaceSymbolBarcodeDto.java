package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceSymbolBarcodeDto extends HandyBaseDto {

    /** 2次元ﾊﾞｰｺｰﾄﾞ */
    @QueryParam("barcode")
    private String barcode;

    /**
     * @return barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param set barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}