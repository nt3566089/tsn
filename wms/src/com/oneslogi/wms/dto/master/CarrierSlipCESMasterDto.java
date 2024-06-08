package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierSlipCesDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CarrierSlipCESMasterDto extends PagingDto {

	public static MCarrierSlipCesDto chaseMCarrierSlipCesDto() {
		return chaseMCarrierSlipCesDto(new MCarrierSlipCesDto());
	}

	public static MCarrierSlipCesDto chaseMCarrierSlipCesDto(MCarrierSlipCesDto dto) {
		return dto;
	}

	public static MCarrierSlipCesDto chaseMCarrierSlipBodyDto() {
		return chaseMCarrierSlipBodyDto(new MCarrierSlipCesDto());
	}

	public static MCarrierSlipCesDto chaseMCarrierSlipBodyDto(MCarrierSlipCesDto dto) {
		return dto;
	}
	public static class CarrierSlipCesData implements Serializable {
		//検索条件
		public MCarrierSlipCesDto head = chaseMCarrierSlipCesDto();
		//検索結果
		public List<MCarrierSlipCesDto> carrierSlipCESMaster = new ArrayList<MCarrierSlipCesDto>();
		//空行
		public MCarrierSlipCesDto blankRow = chaseMCarrierSlipBodyDto();

	};

	public CarrierSlipCesData data = new CarrierSlipCesData();

}
