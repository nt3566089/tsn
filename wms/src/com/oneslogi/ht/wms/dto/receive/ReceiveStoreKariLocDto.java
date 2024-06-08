package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

public class ReceiveStoreKariLocDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start		
	
	/** 仮ロケ: */
	@QueryParam("kariLocCd")
	public String kariLocCd;
	
	// [#575] ValidateチェックのHT国際化2017.02.08 sja End			

	/**
	 * @return kariLocCd
	 */
	public String getKariLocCd() {
		return kariLocCd;
	}

	/**
	 * @param kariLocCd
	 */
	public void setKariLocCd(String kariLocCd) {
		this.kariLocCd = kariLocCd;
	}



}
