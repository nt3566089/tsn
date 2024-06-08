package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(汎用)画面の情報を保持します。
 *
 */
public class ReceiveNoPlanInspectionLabelInputDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start						

	/** 汎用ラベルNo */
	@QueryParam("storeLabelNo")
	public String storeLabelNo;

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja End						

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