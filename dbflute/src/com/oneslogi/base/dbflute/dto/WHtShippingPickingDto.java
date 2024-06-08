package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsWHtShippingPickingDto;

/**
 * The entity of w_ht_shipping_picking.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingPickingDto extends BsWHtShippingPickingDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

 // [Ver3.0] unit of measure対応 2017.11.29 王 Start

    protected Long _unitNum;

    public Long getUnitNum() {
        return _unitNum;
    }

    public void setUnitNum(Long _unitNum) {
        this._unitNum = _unitNum;
    }
 // [Ver3.0] unit of measure対応 2017.11.29 王 End

}
