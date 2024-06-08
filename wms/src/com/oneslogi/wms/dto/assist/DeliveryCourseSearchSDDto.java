package com.oneslogi.wms.dto.assist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DeliveryCourseSearchSDDto extends PagingDto{


	public static MDeliveryCourseDto chaseMDeliveryCourse() {
		return chaseMDeliveryCourse(new MDeliveryCourseDto());
	}

	public static MDeliveryCourseDto chaseMDeliveryCourse(MDeliveryCourseDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class DeliveryCourseSearchData implements Serializable {
		public MDeliveryCourseDto head = chaseMDeliveryCourse();
		public List<MDeliveryCourseDto> list = new ArrayList<MDeliveryCourseDto>();

	};

	public DeliveryCourseSearchData data = new DeliveryCourseSearchData();
}
