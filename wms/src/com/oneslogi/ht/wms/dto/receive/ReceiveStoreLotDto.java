package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入庫格納(ロット入力)画面情報を保持します
 *
 */
public class ReceiveStoreLotDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start					

	/** lot */
	@QueryParam("lot")
	private String lot;

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja End				

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
