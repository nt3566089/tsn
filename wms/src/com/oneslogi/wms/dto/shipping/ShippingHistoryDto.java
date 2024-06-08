package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.HShippingBDto;
import com.oneslogi.base.dbflute.dto.HShippingHDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingHistoryDto extends PagingDto {

	public static HShippingHDto chaseHShippingHDto() {
		return chaseHShippingHDto(new HShippingHDto());
	}

	public static HShippingHDto chaseHShippingHDto(HShippingHDto dto) {
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}
		return dto;
	}

	public static HShippingBDto chaseHShippingBDto() {
		return chaseHShippingBDataDto(new HShippingBDto());
	}

	public static HShippingBDto chaseHShippingBDataDto(HShippingBDto dto) {
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		return dto;
	}

	public static class ShippingHistoryData implements Serializable {
		// 検索条件を入れるDTO
		public HShippingHDto head = chaseHShippingHDto();
		public HShippingBDto body = chaseHShippingBDto();

		//検索結果
		public List<HShippingBDto> bodyList = new ArrayList<HShippingBDto>();
	};

	public ShippingHistoryData data = new ShippingHistoryData();
}