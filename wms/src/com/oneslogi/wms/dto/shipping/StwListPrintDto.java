package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPackingHDto;
import com.oneslogi.base.dbflute.dto.TPackingRDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StwListPrintDto extends PrintParamDto {

	public static TPackingHDto chaseTPackingHDto() {
		return chaseTPackingHDto(new TPackingHDto());
	}

	public static TPackingHDto chaseTPackingHDto(TPackingHDto dto) {

		dto.setTAllocInstH(new TAllocInstHDto());

		if (dto.getTAllocInstH().getMDeliveryCourse() == null) {
			dto.getTAllocInstH().setMDeliveryCourse(new MDeliveryCourseDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getTPackingRAsOne() == null){
			dto.setTPackingRAsOne(new TPackingRDto());
		}
		if (dto.getTPickingH() == null) {
			dto.setTPickingH(new TPickingHDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}

		return dto;
	}

	public static class TPackingHListData implements Serializable {

		//検索条件を入れるDTO
		public TPackingHDto search = chaseTPackingHDto();
	};

	public TPackingHListData data = new TPackingHListData();
}