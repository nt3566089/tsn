package com.oneslogi.ht.wms.dto.stock;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 移動入庫(入庫ラベルNo)画面情報を保持します
 *
 */
public class StockMoveInLabelNoDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start					

	/** 入庫ラベルNo */
	@QueryParam("labelNo")
	private String labelNo;

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja End					

	/**
	 * @return labelNo
	 */
	public String getLabelNo() {
		return labelNo;
	}

	/**
	 * @param labelNo セットする labelNo
	 */
	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}
}
