package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 単行出荷検品(商品)画面情報を保持します。
 */
public class SingleRowShippingNoPackingProductDto extends HandyBaseDto {

	/**	ソースCD */
	@QueryParam("janCd")
	private String janCd;

	public String getJanCd() {
		return janCd;
	}

	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

}
