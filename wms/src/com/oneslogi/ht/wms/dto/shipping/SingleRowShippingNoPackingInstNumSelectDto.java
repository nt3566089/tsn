package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 作業指示数選択画面情報を保持します。
 *
 */
public class SingleRowShippingNoPackingInstNumSelectDto extends HandyBaseDto {

	/** 指示数 */
	@QueryParam("instNum")
	private Long instNum;


	public Long getInstNum() {
		return instNum;
	}

	public void setInstNum(Long instNum) {
		this.instNum = instNum;
	}

}
