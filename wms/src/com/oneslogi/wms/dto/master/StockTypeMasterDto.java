package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockTypeMasterDto extends PagingDto {

	public static MStockTypeDto chaseMStockTypeDto() {
		return chaseMStockTypeDto(new MStockTypeDto());
	}

	public static MStockTypeDto chaseMStockTypeDto(MStockTypeDto dto) {
		return dto;
	}

	public static MStockTypeDto chaseMStockTypeBodyDto() {
		return chaseMStockTypeBodyDto(new MStockTypeDto());
	}

	public static MStockTypeDto chaseMStockTypeBodyDto(MStockTypeDto dto) {
		return dto;
	}

	public static class StockTypeData implements Serializable {
		//検索条件
		public MStockTypeDto stockTypeMasterSearch = chaseMStockTypeDto();
		//検索結果
		public List<MStockTypeDto> stockTypeList = new ArrayList<MStockTypeDto>();
		//空行
		public MStockTypeDto blankRow = chaseMStockTypeBodyDto();
	};

	public StockTypeData data = new StockTypeData();

}
