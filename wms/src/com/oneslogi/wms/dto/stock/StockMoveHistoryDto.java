package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.HMoveBDto;
import com.oneslogi.base.dbflute.dto.HMoveHDto;
import com.oneslogi.base.dbflute.dto.HStockDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockMoveHistoryDto extends PagingDto {

	public static HMoveBDto chaseHMoveBDto() {
		return chaseHMoveBDataDto(new HMoveBDto());
	}

	public static HMoveBDto chaseHMoveBDataDto(HMoveBDto dto) {
		if (dto.getHStock() == null) {
			dto.setHStock(new HStockDto());
		}
		if (dto.getHStock().getMStockType() == null) {
			dto.getHStock().setMStockType(new MStockTypeDto());
		}
		if (dto.getHMoveH() == null) {
			dto.setHMoveH(new HMoveHDto());
		}
		if (dto.getHMoveH().getMProcessType() == null) {
			dto.getHMoveH().setMProcessType(new MProcessTypeDto());
		}
		return dto;
	}

	public static class StockMoveHistoryData implements Serializable {
		// 検索条件を入れるDTO
		public HMoveBDto head = chaseHMoveBDto();

		//検索結果
		public List<HMoveBDto> list = new ArrayList<HMoveBDto>();
	};

	public StockMoveHistoryData data = new StockMoveHistoryData();
}
