package com.oneslogi.wms.dto.shipping.pmrapi;

public class PmrApiErrorDto {

	/** エラーコード */
	private Integer errorCode;
	/** 伝票番号 */
	private String slipNo;

	// ===== 以下、ゲッタとセッタ =====

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getSlipNo() {
		return slipNo;
	}

	public void setSlipNo(String slipNo) {
		this.slipNo = slipNo;
	}

}
