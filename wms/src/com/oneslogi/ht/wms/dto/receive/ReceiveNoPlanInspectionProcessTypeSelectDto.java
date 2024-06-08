package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷(処理区分)画面情報を保持します
 *
 */
public class ReceiveNoPlanInspectionProcessTypeSelectDto extends HandyBaseDto {

	/** 処理区分 */
	@QueryParam("processType")
	private String processType;

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

}
