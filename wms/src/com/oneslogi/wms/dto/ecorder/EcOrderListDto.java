package com.oneslogi.wms.dto.ecorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dbflute.dto.TEcOrderHDto;
import com.oneslogi.base.dbflute.dto.TEcOrderRDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class EcOrderListDto extends PrintParamDto {

	public static TEcOrderHDto chaseSearchDto(TEcOrderHDto dto) {

		if (dto == null) {
			dto = new TEcOrderHDto();
		}

		if (dto.getTEcOrderRAsOne() == null) {
			dto.setTEcOrderRAsOne(new TEcOrderRDto());
		}

		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		if (dto.getMImportType() == null) {
			dto.setMImportType(new MImportTypeDto());
		}

		if (dto.getTShippingInstH() == null) {
			dto.setTShippingInstH(new TShippingInstHDto());
		}

		if (dto.getTShippingInstH().getMDeliveryCourse() == null) {
			dto.getTShippingInstH().setMDeliveryCourse(new MDeliveryCourseDto());
		}

		return dto;
	}

	public static class EcOrderListData implements Serializable {
		//検索条件を入れるDTO
		public TEcOrderHDto search = chaseSearchDto(new TEcOrderHDto());
		//検索結果を入れるDTO
		public List<TEcOrderHDto> list = new ArrayList<TEcOrderHDto>();
	};

	public EcOrderListData data = new EcOrderListData();
}
