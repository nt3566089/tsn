package com.oneslogi.ht.wms.dto.stock;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫移動入庫(JAN入力)画面情報を保持します
 *
 */
public class StockMoveInJanCdDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start					

	/** JAN/商品 */
	@QueryParam("janCd")
	private String janCd;

	// [#575] ValidateチェックのHT国際化 2017.02.16 sja End					

	/**
	 * @return janCd
	 */
	public String getJanCd() {
		return janCd;
	}

	/**
	 * @param janCd セットする janCd
	 */
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}
}
