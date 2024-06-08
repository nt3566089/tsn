package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品(汎用)画面の情報を保持します。
 *
 */
public class ReceiveInspectionLabelInputDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.03.29 sja Start					

	/** 汎用ラベルNo */
	@QueryParam("storeLabelNo")
	public String storeLabelNo;

	// [#575] ValidateチェックのHT国際化 2017.03.29 sja End					

	/**
	 * @return storeLabelNo
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	/**
	 * @param storeLabelNo セットする storeLabelNo
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

}