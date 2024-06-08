package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsWHtReceiveInspectionDto;

/**
 * The entity of w_ht_receive_inspection.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveInspectionDto extends BsWHtReceiveInspectionDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    //実績入庫数
    private BigDecimal storeNum;

	public BigDecimal getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(BigDecimal storeNum) {
		this.storeNum = storeNum;
	}

}
