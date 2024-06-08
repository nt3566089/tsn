package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(ロケ)画面情報を保持します
 *
 */
public class ReceiveNoPlanInspectionLocDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start						

	/** Loc */
	@QueryParam("loc")
	private String loc;

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja End						

	/**
	 * @return loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc セットする loc
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
