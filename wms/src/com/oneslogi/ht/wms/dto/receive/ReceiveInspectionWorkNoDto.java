package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品(伝票ＮＯ・仮ロケ入力)画面の情報を保持します。
 *
 */
public class ReceiveInspectionWorkNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.01.17 kawana Start

	/** 伝票ＮＯ */
	@QueryParam("htWorkNo")
	public String htWorkNo;

	/** 仮ロケ */
	@QueryParam("rcvLocCd")
	public String rcvLocCd;

	// [#575] ValidateチェックのHT国際化 2017.01.17 kawana End

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

	/**
	 * @return rcvLocCd
	 */
	public String getRcvLocCd() {
		return rcvLocCd;
	}

	/**
	 * @param rcvLocCd セットする rcvLocCd
	 */
	public void setRcvLocCd(String rcvLocCd) {
		this.rcvLocCd = rcvLocCd;
	}

}