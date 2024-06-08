package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入庫格納(JAN)画面情報を保持します
 *
 */
public class ReceiveStoreJanCdDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start		

	/** janProdCd */
	@QueryParam("janProdCd")
	private String janProdCd;

	// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start			

	/**
	 * @return janProdCd
	 */
	public String getJanProdCd() {
		return janProdCd;
	}

	/**
	 * @param janProdCd セットする janProdCd
	 */
	public void setJanProdCd(String janProdCd) {
		this.janProdCd = janProdCd;
	}

}
