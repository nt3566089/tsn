package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsWHtSerialShippingInspDto;

/**
 * The entity of w_ht_serial_shipping_insp.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtSerialShippingInspDto extends BsWHtSerialShippingInspDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	/** 商品ID **/
	private Long productId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
