package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterCustomerDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dto.PagingDto;


public class CustomerMasterEditDto extends PagingDto {

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

	public static MCenterCustomerDto chaseMCustomerBodyDto() {
		return chaseMCustomerBodyDto(new MCenterCustomerDto());
	}

	public static MCenterCustomerDto chaseMCustomerBodyDto(MCenterCustomerDto dto) {

		if (dto.getMDeliveryCourse() == null) {
			dto.setMDeliveryCourse(new MDeliveryCourseDto());
		}
		if (dto.getMCenter() == null ) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMCustomer() == null ) {
			dto.setMCustomer(new MCustomerDto());
		}
		return dto;
	}

	public static class MCustomerData implements Serializable {
		public MCustomerDto head = chaseMCustomerDto();
		public List<MCustomerDto> body = new ArrayList<MCustomerDto>();
		//空行
		public MCenterCustomerDto blankRow = chaseMCustomerBodyDto();
		// センタマスタリスト
		public List<MCenterDto> centerList = new ArrayList<MCenterDto>();
	};

	public MCustomerData data = new MCustomerData();




}
