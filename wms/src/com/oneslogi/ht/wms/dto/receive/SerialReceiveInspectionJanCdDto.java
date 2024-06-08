package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(出庫作業No入力)画面の情報を保持します。
 *
 */
public class SerialReceiveInspectionJanCdDto extends HandyBaseDto {
	/** ｿｰｽCD */
	@QueryParam("productCd")
	private String productCd;

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

}
