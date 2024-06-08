package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(No)画面の情報を保持します。
 *
 */
public class SerialShippingInspectionWorkNoDto extends HandyBaseDto {

	/** 出庫作業No */
	@QueryParam("pickingWorkNo")
	private String pickingWorkNo;

	/** 納品先 */
	@QueryParam("supplierCustomerCd")
	private String supplierCustomerCd;

	/**
	 * @return pickingWorkNo
	 */
	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	/**
	 * @param pickingWorkNo セットする pickingWorkNo
	 */
	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	/**
	 * @return supplierCustomerCd
	 */
	public String getSupplierCustomerCd() {
		return supplierCustomerCd;
	}

	/**
	 * @param supplierCustomerCd セットする supplierCustomerCd
	 */
	public void setSupplierCustomerCd(String supplierCustomerCd) {
		this.supplierCustomerCd = supplierCustomerCd;
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End