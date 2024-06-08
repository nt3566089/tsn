package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class LineDto extends BaseDto {

	public static class DropDownListData implements Serializable {
		public String lin;
		public String linnm;
	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
