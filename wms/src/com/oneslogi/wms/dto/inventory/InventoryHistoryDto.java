package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.HInventoryBDto;
import com.oneslogi.base.dbflute.dto.HInventoryHDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryHistoryDto extends PagingDto {

	public static HInventoryHDto chaseHInventoryHDto() {
		return chaseHInventoryHDto(new HInventoryHDto());
	}

	public static HInventoryHDto chaseHInventoryHDto(HInventoryHDto dto) {
		return dto;
	}

	public static HInventoryBDto chaseHInventoryBDto() {
		return chaseHInventoryBDto(new HInventoryBDto());
	}

	public static HInventoryBDto chaseHInventoryBDto(HInventoryBDto dto) {
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		return dto;
	}

	public static class InventoryHistoryData implements Serializable {
		// 検索条件を入れるDTO
		public HInventoryHDto head = chaseHInventoryHDto();
		public HInventoryBDto body = chaseHInventoryBDto();

		//検索結果
		public List<HInventoryBDto> bodyList = new ArrayList<HInventoryBDto>();
	};

	public InventoryHistoryData data = new InventoryHistoryData();
}
