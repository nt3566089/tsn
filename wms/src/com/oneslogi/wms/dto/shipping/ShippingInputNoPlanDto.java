package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingInputNoPlanDto extends BaseDto {

	public static TShippingInstHDto chaseTShippingInstHDto() {
		return chaseTShippingInstHDto(new TShippingInstHDto());
	}

	public static TShippingInstHDto chaseTShippingInstHDto(TShippingInstHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}
		if (dto.getMCustomerBySupplyCustomerId() == null) {
			dto.setMCustomerBySupplyCustomerId(new MCustomerDto());
		}
		if (dto.getMDeliveryCourse() == null) {
			dto.setMDeliveryCourse(new MDeliveryCourseDto());
		}
		return dto;
	}

	public static TShippingInstBDto chaseTShippingInstBDto() {
		return chaseTShippingInstBDto(new TShippingInstBDto());
	}

	public static TShippingInstBDto chaseTShippingInstBDto(TShippingInstBDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
//		dto.setChargeNum(0l);
		return dto;
	}

	public static class ShippingInputNoPlanData implements Serializable {
		// ヘッダー部用DTO
		public TShippingInstHDto head = chaseTShippingInstHDto();
		// 明細部用DTO
		public List<TShippingInstBDto> list = new ArrayList<TShippingInstBDto>();

		public TShippingInstBDto blankRow = chaseTShippingInstBDto();
	};

	public ShippingInputNoPlanData data = new ShippingInputNoPlanData();
}
