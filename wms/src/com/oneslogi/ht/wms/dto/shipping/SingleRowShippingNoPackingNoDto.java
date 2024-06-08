package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 単行出荷検品(No)画面情報を保持します。
 *
 */
public class SingleRowShippingNoPackingNoDto extends HandyBaseDto {

	/** ピッキンググループNo */
	@QueryParam("pickingGroupNo")
	private String pickingGroupNo;

	/** 仮置きNo */
	@QueryParam("tempNo")
	private String tempNo;


	public String getPickingGroupNo() {
		return pickingGroupNo;
	}

	public void setPickingGroupNo(String pickingGroupNo) {
		this.pickingGroupNo = pickingGroupNo;
	}

	public String getTempNo() {
		return tempNo;
	}

	public void setTempNo(String tempNo) {
		this.tempNo = tempNo;
	}



}
