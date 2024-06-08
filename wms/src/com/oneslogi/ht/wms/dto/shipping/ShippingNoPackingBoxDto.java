package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * バラ出荷検品(箱登録)画面情報を保持します
 *
 */
public class ShippingNoPackingBoxDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start					

	/** 箱コード */
	@QueryParam("boxCd")
	private String boxCd;

	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End					

	public String getBoxCd() {
		return boxCd;
	}

	public void setBoxCd(String boxCd) {
		this.boxCd = boxCd;
	}

}
