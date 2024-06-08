package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * パラピッキング(出庫作業No入力)画面の情報を保持します。
 *
 */
public class SerialReceiveInspectionWorkNoDto extends HandyBaseDto {
	/** WMS入荷伝票No. */
	@QueryParam("receiveSlipNo")
	private String receiveSlipNo;
	
	/** 仕入先CD */
	@QueryParam("supplierCd")
	private String supplierCd;

	public String getReceiveSlipNo() {
		return receiveSlipNo;
	}

	public void setReceiveSlipNo(String receiveSlipNo) {
		this.receiveSlipNo = receiveSlipNo;
	}

	public String getSupplierCd() {
		return supplierCd;
	}

	public void setSupplierCd(String supplierCd) {
		this.supplierCd = supplierCd;
	}
}
