package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品格納(伝票ＮＯ入力)画面の情報を保持します。
 *
 */
public class ReceiveInspecStoreWorkNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja Start					

	/** 伝票ＮＯ */
	@QueryParam("htWorkNo")
	public String htWorkNo;

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja End					

	/**
	 * @return htWorkNo
	 */
	public String getHtWorkNo() {
		return htWorkNo;
	}

	/**
	 * @param htWorkNo セットする htWorkNo
	 */
	public void setHtWorkNo(String htWorkNo) {
		this.htWorkNo = htWorkNo;
	}
}