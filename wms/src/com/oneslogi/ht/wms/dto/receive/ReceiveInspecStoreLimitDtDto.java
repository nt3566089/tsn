package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品格納(詳細)期限日入力画面の情報を保持します。
 *
 */
public class ReceiveInspecStoreLimitDtDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja Start					

	/** 期限日 */
	@QueryParam("limitDt")
	private String limitDt;

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja End					

	/**
	 * @return limitDt
	 */
	public String getLimitDt() {
		return limitDt;
	}

	/**
	 * @param limitDt セットする limitDt
	 */
	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

}