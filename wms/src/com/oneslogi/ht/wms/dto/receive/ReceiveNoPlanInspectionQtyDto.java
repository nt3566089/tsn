package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(数量)画面の情報を保持します。
 *
 */
public class ReceiveNoPlanInspectionQtyDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start

	/** ケース数 */
	@QueryParam("caseQty")
	public String caseQty;

	/** バラ数 */
	@QueryParam("spgQtyOns")
	public String spgQtyOns;

	// [#575] ValidateチェックのHT国際化 2017.02.09 sja End

	/**
	 * @return caseQty
	 */
	public String getCaseQty() {
		return caseQty;
	}

	/**
	 * @param caseQty セットする caseQty
	 */
	public void setCaseQty(String caseQty) {
		this.caseQty = caseQty;
	}

	/**
	 * @return spgQtyOns
	 */
	public String getSpgQtyOns() {
		return spgQtyOns;
	}

	/**
	 * @param spgQtyOns セットする spgQtyOns
	 */
	public void setSpgQtyOns(String spgQtyOns) {
		this.spgQtyOns = spgQtyOns;
	}

	// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Start
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
	// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 End
}