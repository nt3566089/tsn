package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(納品先選択)画面情報を保持します
 *
 */
public class SerialShippingInspectionSupplierSelectDto extends HandyBaseDto {

	/** 納品先 */
	@QueryParam("supplier")
	private String supplier;

	/**
	 * @return supplier
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier セットする supplier
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End