package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MCarrierSlipCesDto;
import com.oneslogi.base.dto.PagingDto;

public class CarrierSlipCESMasterEditDto extends PagingDto {

	public static MCarrierSlipCesDto chaseMCarrierSlipCesDto() {
		return chaseMCarrierSlipCesDto(null);
	}

	public static MCarrierSlipCesDto chaseMCarrierSlipCesDto(MCarrierSlipCesDto dto) {
		if (dto == null) {
			dto = new MCarrierSlipCesDto();
		}
		return dto;
	}

	public static class MCarrierSlipCesData implements Serializable {
		public MCarrierSlipCesDto head = chaseMCarrierSlipCesDto();
	};

	public MCarrierSlipCesData data = new MCarrierSlipCesData();
}
