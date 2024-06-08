package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.dto.report.LocationBarcodeListDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class LocationBarcodeListPrintDto extends PrintParamDto {

	public static MLocationDto chaseMLocationDto() {
		return chaseMLocationDto(new MLocationDto());
	}

	public static MLocationDto chaseMLocationDto(MLocationDto dto) {
		if (dto.getCenterId() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getZoneId() == null) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMZone().getWarehouseId() == null) {
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}
		return dto;
	}

	public static class MLocationListData implements Serializable {
		//検索条件を入れるDTO
		public MLocationDto searchCondition = chaseMLocationDto();
	};

	public static class MLocationListResultData implements Serializable {
		//検索結果を入れるDTO
		public List<LocationBarcodeListDto> list = new ArrayList<LocationBarcodeListDto>();
	};

	public MLocationListData data = new MLocationListData();

}
