package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierSlipYupkDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CarrierSlipYupkMasterDto extends PagingDto {

	public static MCarrierSlipYupkDto chaseMCarrierSlipYupkDto() {
		return chaseMCarrierSlipYupkDto(new MCarrierSlipYupkDto());
	}

	public static MCarrierSlipYupkDto chaseMCarrierSlipYupkDto(MCarrierSlipYupkDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static MCarrierSlipYupkDto chaseMCarrierSlipYupkBodyDto() {
		return chaseMCarrierSlipYupkBodyDto(new MCarrierSlipYupkDto());
	}

	public static MCarrierSlipYupkDto chaseMCarrierSlipYupkBodyDto(MCarrierSlipYupkDto dto) {
//		if (dto.getMWarehouse() == null) {
//			dto.setMWarehouse(new MWarehouseDto());
//		}
		return dto;
	}

	public static class CarrierSlipYupkData implements Serializable {
		//検索条件
		public MCarrierSlipYupkDto carrierSlipYupkMasterSearch = chaseMCarrierSlipYupkDto();
		//検索結果
		public List<MCarrierSlipYupkDto> carrierSlipYupkList = new ArrayList<MCarrierSlipYupkDto>();
		//空行
		public MCarrierSlipYupkDto blankRow = chaseMCarrierSlipYupkBodyDto();
	};

	public CarrierSlipYupkData data = new CarrierSlipYupkData();
}
