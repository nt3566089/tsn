package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(出庫作業No入力)画面の情報を保持します。
 *
 */
public class SerialReceiveInspectionSerialNoDto extends HandyBaseDto {
	/** ｼﾘｱﾙNo */
	@QueryParam("serialNo")
	private String serialNo;

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
}
