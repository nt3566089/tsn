package com.oneslogi.wms.dto.assist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DeliveryMasterSearchDto extends PagingDto {

	public static MCustomerDto chaseMCustomerDto() {
		return chaseMCustomerDto(new MCustomerDto());
	}

	public static MCustomerDto chaseMCustomerDto(MCustomerDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class DeliveryMasterSearchData implements Serializable {
		public MCustomerDto head = chaseMCustomerDto();
		public List<MCustomerDto> list = new ArrayList<MCustomerDto>();
	};

	public DeliveryMasterSearchData data = new DeliveryMasterSearchData();
}
