package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dto.PagingDto;

public class CustomerMasterListDto extends PagingDto {

	public static MCustomerDto chaseMCustomerDto() {
		return chaseMCustomerDto(new MCustomerDto());
	}

	public static MCustomerDto chaseMCustomerDto(MCustomerDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
//		if (dto.getMCustomerSubAsOne() == null) {
//			dto.setMCustomerSubAsOne(new MCustomerSubDto());
//		}
		return dto;
	}

	public static class MStopListData implements Serializable {
		public MCustomerDto head = chaseMCustomerDto();
		public List<MCustomerDto> body = new ArrayList<MCustomerDto>();
		public List<String> logisticsName  = new ArrayList<String>();

	};

	public MStopListData data = new MStopListData();

}
