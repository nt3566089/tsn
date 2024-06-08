package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class WarehouseMasterDto extends PagingDto {

	public static MWarehouseDto chaseMWarehouseDto() {
		return chaseMWarehouseDto(new MWarehouseDto());
	}

	public static MWarehouseDto chaseMWarehouseDto(MWarehouseDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static MWarehouseDto chaseMWarehouseBodyDto() {
		return chaseMWarehouseBodyDto(new MWarehouseDto());
	}

	public static MWarehouseDto chaseMWarehouseBodyDto(MWarehouseDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class WarehouseData implements Serializable {
		//検索条件
		public MWarehouseDto warehouseMasterSearch = chaseMWarehouseDto();
		//検索結果
		public List<MWarehouseDto> warehouseList = new ArrayList<MWarehouseDto>();
		//空行
		public MWarehouseDto blankRow = chaseMWarehouseBodyDto();
	};

	public WarehouseData data = new WarehouseData();

}
