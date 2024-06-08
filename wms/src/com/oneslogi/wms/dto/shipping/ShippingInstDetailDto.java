package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingInstDetailDto extends PagingDto {

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
		if (dto.getMCustomerBySupplyCustomerId() == null) {
			dto.setMCustomerBySupplyCustomerId(new MCustomerDto());
		}
		return dto;
	}

	public static class ShippingInstDetailData implements Serializable {
		//検索条件を入れるDTO
		public TShippingInstHDto head = chaseTShippingInstHDto();
		//検索結果を入れるDTO
		public List<TShippingInstBDto> list = new ArrayList<TShippingInstBDto>();

		public TShippingInstBDto blankRow = new TShippingInstBDto();
	};

	public ShippingInstDetailData data = new ShippingInstDetailData();
}
