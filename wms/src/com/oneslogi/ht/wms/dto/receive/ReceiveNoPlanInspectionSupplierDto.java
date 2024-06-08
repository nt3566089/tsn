package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(仕入先)画面情報を保持します
 *
 */
public class ReceiveNoPlanInspectionSupplierDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start						

	/** 仕入先 */
	@QueryParam("supplier")
	private String supplier;
	
	/** 顧客入荷指示No.  */
	@QueryParam("clientReceiveNo")
	private String clientReceiveNo;

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja End					

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

	/**
	 * @return clientReceiveNo
	 */
	public String getClientReceiveNo() {
		return clientReceiveNo;
	}

	/**
	 * @param clientReceiveNo セットする clientReceiveNo
	 */
	public void setClientReceiveNo(String clientReceiveNo) {
		this.clientReceiveNo = clientReceiveNo;
	}

}
