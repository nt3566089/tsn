package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(預託選択)画面情報を保持します
 *
 */
public class ReceiveNoPlanInspectionDepositSelectDto extends HandyBaseDto {

	/** 預託区分 */
	@QueryParam("deposit")
	private String deposit;

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

}
