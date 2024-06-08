package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ZoneMasterDto extends PagingDto {

	public static MZoneDto chaseMZoneDto() {
		return chaseMZoneDto(new MZoneDto());
	}

	public static MZoneDto chaseMZoneDto(MZoneDto dto) {
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMWarehouse().getMCenter() == null) {
			dto.getMWarehouse().setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static MZoneDto chaseMZoneBodyDto() {
		return chaseMZoneBodyDto(new MZoneDto());
	}

	public static MZoneDto chaseMZoneBodyDto(MZoneDto dto) {
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		// 荷主センタ変更対応 2017.04.21 sja Start
		if (dto.getMWarehouse().getMCenter() == null) {
			dto.getMWarehouse().setMCenter(new MCenterDto());
		}
		// 荷主センタ変更対応 2017.04.21 sja End
		return dto;
	}

	public static class ZoneData implements Serializable {
		//検索条件
		public MZoneDto zoneMasterSearch = chaseMZoneDto();
		//検索結果
		public List<MZoneDto> zoneList = new ArrayList<MZoneDto>();
		//空行
		public MZoneDto blankRow = chaseMZoneBodyDto();
	};

	public ZoneData data = new ZoneData();

}
