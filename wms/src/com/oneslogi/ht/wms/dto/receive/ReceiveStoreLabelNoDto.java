package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

public class ReceiveStoreLabelNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.07 sja Start	

	/** 入庫ラベルNo: */
	@QueryParam("onsNum")
	public String onsNum;

	// [#575] ValidateチェックのHT国際化 2017.02.07 sja End	

	/**
	 * @return onsNum
	 */
	public String getOnsNum() {
		return onsNum;
	}

	/**
	 * @param onsNum セットする onsNum
	 */
	public void setOnsNum(String onsNum) {
		this.onsNum = onsNum;
	}


}
