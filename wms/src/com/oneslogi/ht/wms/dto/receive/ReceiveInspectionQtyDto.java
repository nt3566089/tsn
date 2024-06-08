package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品(数量)画面の情報を保持します。
 *
 */
public class ReceiveInspectionQtyDto extends HandyBaseDto {

	// [#2379][Ver3.0] 複数荷姿対応 2017.11.09 miyabe Start
	/** ケース数 */
	@QueryParam("qty")
	public String qty;

	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param caseQty セットする qty
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}
	// [#2379][Ver3.0] 複数荷姿対応 2017.11.09 miyabe End

}