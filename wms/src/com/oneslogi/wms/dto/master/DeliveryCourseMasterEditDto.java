package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterCustomerDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DeliveryCourseMasterEditDto extends BaseDto {

	public static MDeliveryCourseDto chaseMDeliveryCourseDto() {
		return chaseMDeliveryCourseDto(new MDeliveryCourseDto());
	}

	public static MDeliveryCourseDto chaseMDeliveryCourseDto(MDeliveryCourseDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMCarrier() == null) {
			dto.setMCarrier(new MCarrierDto());
		}

		return dto;
	}

	public static MCenterCustomerDto chaseMCenterCustomerBodyDto() {
		return chaseMCenterCustomerBodyDto(new MCenterCustomerDto());
	}

	public static MCenterCustomerDto chaseMCenterCustomerBodyDto(MCenterCustomerDto dto) {
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		return dto;
	}

	public static class DeliveryCourseMasterEditData implements Serializable {
		//画面ヘッダ情報
		public MDeliveryCourseDto head = chaseMDeliveryCourseDto();
		//画面明細情報
		public List<MDeliveryCourseDto> body = new ArrayList<MDeliveryCourseDto>();
		//空行
		public MCenterCustomerDto blankRow = chaseMCenterCustomerBodyDto();

	};

	public DeliveryCourseMasterEditData data = new DeliveryCourseMasterEditData();
}
