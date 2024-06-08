package com.oneslogi.ht.wms.dto.stock;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ロケ・JAN・入庫ＮＯ入力 画面情報を保持します
 *
 */
public class StockSearchConditionDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start					

	/** ロケ */
	@QueryParam("locationCd")
	private String locationCd;

	/** JAN/商品 */
	@QueryParam("janCd")
	private String janCd;

	/** 入庫No. */
	@QueryParam("storeLabelNo")
	private String storeLabelNo;

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja End					

	/**
	 * @return storeLabelNoEnd
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	/**
	 * @return locationCd
	 */
	public String getLocationCd() {
		return locationCd;
	}

	/**
	 * @param locationCd セットする locationCd
	 */
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	/**
	 * @return janCd
	 */
	public String getJanCd() {
		return janCd;
	}

	/**
	 * @param storeLabelNo セットする storeLabelNo
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

	/**
	 * @param janCd セットする janCd
	 */
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

}
