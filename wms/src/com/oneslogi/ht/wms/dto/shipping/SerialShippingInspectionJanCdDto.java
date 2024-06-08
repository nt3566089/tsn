package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(ｿｰｽCD)画面情報を保持します
 *
 */
public class SerialShippingInspectionJanCdDto extends HandyBaseDto {

	/** JANCD */
	@QueryParam("janCd")
	private String janCd;

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
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End