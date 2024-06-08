package com.oneslogi.wms.dto.shipping.pmrapi;

import java.util.List;

public class PmrApiResponseDto {

	/** ステータスコード */
	private Integer statusCode;
	/** 問合せ番号 */
	private String referenceNo;
	/** エラーリスト */
	private List<PmrApiErrorDto> errorList;
	/** ピッキング種別リスト */
	private List<PmrApiPickingTypeDto> pickingTypeList;

	// ===== 以下、ゲッタとセッタ =====

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public List<PmrApiErrorDto> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<PmrApiErrorDto> errorList) {
		this.errorList = errorList;
	}

	public List<PmrApiPickingTypeDto> getPickingTypeList() {
		return pickingTypeList;
	}

	public void setPickingTypeList(List<PmrApiPickingTypeDto> pickingTypeList) {
		this.pickingTypeList = pickingTypeList;
	}
}
