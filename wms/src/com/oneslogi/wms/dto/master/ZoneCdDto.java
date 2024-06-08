package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class ZoneCdDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public String zoneNm;

		public String zoneCd;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
