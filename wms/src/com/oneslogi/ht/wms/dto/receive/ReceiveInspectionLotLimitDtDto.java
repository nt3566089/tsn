package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品(詳細)ロット・期限日入力画面の情報を保持します。
 *
 */
public class ReceiveInspectionLotLimitDtDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.07 sja Start	

	/** ロット */
	@QueryParam("lot")
	private String lot;

	/** 期限日 */
	@QueryParam("limitDt")
	private String limitDt;

	// [#575] ValidateチェックのHT国際化 2017.02.07 sja End	

	/**
	 * @return lot
	 */
	public String getLot() {
		return lot;
	}

	/**
	 * @param lot セットする lot
	 */
	public void setLot(String lot) {
		this.lot = lot;
	}

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