package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(仕入先選択)画面情報を保持します
 *
 */
public class ReceiveNoPlanInspectionSupplierSelectDto extends HandyBaseDto {

	/** 仕入先 */
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
