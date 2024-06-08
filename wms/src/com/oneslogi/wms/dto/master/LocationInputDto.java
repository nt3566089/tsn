package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WLocationInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class LocationInputDto extends BaseDto {

	/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// DTOではなく、Entityを直接扱う。
//	public static WLocationInputDto chaseWLocationInputDto() {
//		return new WLocationInputDto();
//	}
//
//	public static class LocationInputData implements Serializable {
//		public List<WLocationInputDto> dataRows = new ArrayList<WLocationInputDto>();
//		public WLocationInputDto blankRow = chaseWLocationInputDto();
//	};
	
	public static WLocationInput chaseWLocationInput() {
		return new WLocationInput();
	}

	public static class LocationInputData implements Serializable {
		public List<WLocationInput> dataRows = new ArrayList<WLocationInput>();
		public WLocationInput blankRow = chaseWLocationInput();
	};
	/* 2015/09/24 INOUE UPDATE END */
	
	public LocationInputData data = new LocationInputData();
}
