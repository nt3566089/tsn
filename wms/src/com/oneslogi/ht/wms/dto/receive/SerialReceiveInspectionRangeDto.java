package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(出庫作業No入力)画面の情報を保持します。
 *
 */
public class SerialReceiveInspectionRangeDto extends HandyBaseDto {
	/** 数量 */
	@QueryParam("serialNum")
	public String  serialNum = "";
	
	/** ｼﾘｱﾙ */
	@QueryParam("endSerialNo")
	public String endSerialNo;
	
	public String getEndSerialNo() {
		return endSerialNo;
	}

	public void setEndSerialNo(String endSerialNo) {
		this.endSerialNo = endSerialNo;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
}
