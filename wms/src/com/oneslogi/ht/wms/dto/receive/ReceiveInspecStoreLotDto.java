package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品格納(詳細)ロット入力画面の情報を保持します。
 *
 */
public class ReceiveInspecStoreLotDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja Start					

	/** ロット */
	@QueryParam("lot")
	private String lot;

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja End					

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

}