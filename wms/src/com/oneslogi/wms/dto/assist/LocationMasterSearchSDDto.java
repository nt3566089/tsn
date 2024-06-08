package com.oneslogi.wms.dto.assist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class LocationMasterSearchSDDto extends PagingDto{

	public static MLocationDto chaseMLocationDto() {
		return chaseMLocationDto(new MLocationDto());
	}

	public static MLocationDto chaseMLocationDto(MLocationDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
		if(dto.getMZone() == null){
			dto.setMZone(new MZoneDto());
		}

		if(dto.getMZone().getMWarehouse() == null){
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End

		return dto;
	}

	public static class LocationMasterSearchData implements Serializable {
		public MLocationDto head = chaseMLocationDto();
		public List<MLocationDto> list = new ArrayList<MLocationDto>();
	}

	public LocationMasterSearchData data = new LocationMasterSearchData();
}
