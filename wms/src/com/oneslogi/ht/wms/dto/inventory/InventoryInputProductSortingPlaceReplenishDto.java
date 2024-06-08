package com.oneslogi.ht.wms.dto.inventory;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]
 * ◆仕分場調査入力画面情報
 *
 */
public class InventoryInputProductSortingPlaceReplenishDto extends HandyBaseDto {

    /** ﾗｲﾝ */
    @QueryParam("line")
    private String line;

    /**
     * @return line
     */
    public String getLine() {
        return line;
    }

    /**
     * @param set line
     */
    public void setLine(String line) {
        this.line = line;
    }

    /** ﾌﾞﾛｯｸ */
    @QueryParam("block")
    private String block;

    /**
     * @return block
     */
    public String getBlock() {
        return block;
    }

    /**
     * @param set block
     */
    public void setBlock(String block) {
        this.block = block;
    }

}
