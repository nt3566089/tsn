package com.oneslogi.wms.dto.shipping;

import java.util.List;


public class SdsCooperationDto {
	// ShippingSendFromSdsDtoList
	public List<ShippingSendFromSdsDto> resultList;
	// エラーコード
	public int errCd;

	public List<ShippingSendFromSdsDto> getResultList() {
		return resultList;
	}

	public void setTShippingInstBDtoList(List<ShippingSendFromSdsDto> resultList) {
		this.resultList = resultList;
	}

	public int getErrCd() {
		return errCd;
	}

	public void setErrCd(int errCd) {
		this.errCd = errCd;
	}
}
