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
public class VendorMasterSearchSDDto extends PagingDto {

	public static MCustomerDto chaseVendorMasterSearchDto() {
		return chaseVendorMasterSearchDto(new MCustomerDto());
	}

	public static MCustomerDto chaseVendorMasterSearchDto(MCustomerDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class VendorMasterData implements Serializable {

		public MCustomerDto head = chaseVendorMasterSearchDto();

		public List<MCustomerDto> list = new ArrayList<MCustomerDto>();

	}
	public VendorMasterData data = new VendorMasterData();

}