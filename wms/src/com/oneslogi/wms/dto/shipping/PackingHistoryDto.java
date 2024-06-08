package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.HPackingBDto;
import com.oneslogi.base.dbflute.dto.HPackingHDto;
import com.oneslogi.base.dbflute.dto.HShippingHDto;
import com.oneslogi.base.dbflute.dto.HStockDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PackingHistoryDto extends PagingDto {

	public static HPackingHDto chaseHPackingHDto() {
		return chaseHPackingHDto(new HPackingHDto());
	}

	public static HPackingHDto chaseHPackingHDto(HPackingHDto dto) {
		if (dto.getHShippingH() == null) {
			dto.setHShippingH(new HShippingHDto());
		}
		if (dto.getHShippingH().getMProcessType() == null) {
			dto.getHShippingH().setMProcessType(new MProcessTypeDto());
		}
		return dto;
	}

	public static HPackingBDto chaseHPackingBDto() {
		return chaseHPackingBDto(new HPackingBDto());
	}

	public static HPackingBDto chaseHPackingBDto(HPackingBDto dto) {
		if (dto.getHStock() == null) {
			dto.setHStock(new HStockDto());
		}
		if (dto.getHStock().getMStockType() == null) {
			dto.getHStock().setMStockType(new MStockTypeDto());
		}

		return dto;
	}

	public static class PackingHistoryData implements Serializable {
		// 検索条件を入れるDTO
		public HPackingHDto head = chaseHPackingHDto();
		public HPackingBDto body = chaseHPackingBDto();

		//検索結果
		public List<HPackingBDto> bodyList = new ArrayList<HPackingBDto>();
	};

	public PackingHistoryData data = new PackingHistoryData();
}