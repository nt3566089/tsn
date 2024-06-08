package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(区分選択)画面情報を保持します
 *
 */
public class ReceiveNoPlanInspectionKbnDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.04.06 sja Start					

	/** 預託区分 */
	@QueryParam("deposit")
	private String deposit;

	/** 処理区分 */
	@QueryParam("processType")
	private String processType;

	/** 在庫区分 */
	@QueryParam("stockType")
	private String stockType;

	// [#575] ValidateチェックのHT国際化 2017.04.06 sja End					

	/**
	 * @return deposit
	 */
	public String getDeposit() {
		return deposit;
	}

	/**
	 * @param deposit セットする deposit
	 */
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	/**
	 * @return processType
	 */
	public String getProcessType() {
		return processType;
	}

	/**
	 * @param processType セットする processType
	 */
	public void setProcessType(String processType) {
		this.processType = processType;
	}

	/**
	 * @return stockType
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param stockType セットする stockType
	 */
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

}
