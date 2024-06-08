package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DeliveryCourseMasterListDto extends PagingDto {

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

	public static class DeliveryCourseMasterListData implements Serializable {
		//検索条件
		public MDeliveryCourseDto head = chaseMDeliveryCourseDto();
		//検索結果
		public List<MDeliveryCourseDto> body = new ArrayList<MDeliveryCourseDto>();
	};

	public DeliveryCourseMasterListData data = new DeliveryCourseMasterListData();
}
