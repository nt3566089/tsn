package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 単行出荷検品(箱登録)画面情報を保持します。
 */
public class SingleRowShippingNoPackingBoxDto extends HandyBaseDto {

	@QueryParam("boxCd")
	private String boxCd;
	private String message;

	public String getBoxCd() {
		return boxCd;
	}

	public void setBoxCd(String boxCd) {
		this.boxCd = boxCd;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
