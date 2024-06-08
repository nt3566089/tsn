package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingStatusProgressDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.StatusDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingStatusProgressDto extends StatusDto {

	public static TShippingInstHDto chaseTShippingInstHDto() {
		return chaseTShippingInstHDto(new TShippingInstHDto());
	}

	public static TShippingInstHDto chaseTShippingInstHDto(TShippingInstHDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMDeliveryCourse() == null) {
			dto.setMDeliveryCourse(new MDeliveryCourseDto());
		}
		return dto;
	}

	public static class SearchConditionData implements Serializable {
		//検索条件を入れるDTO
		public TShippingInstHDto search = chaseTShippingInstHDto();
		//検索結果を入れるDTO（外だしＳＱＬ）
		public List<SqlShippingStatusProgressDto> list = new ArrayList<SqlShippingStatusProgressDto>();
	};

	public SearchConditionData data = new SearchConditionData();
}
