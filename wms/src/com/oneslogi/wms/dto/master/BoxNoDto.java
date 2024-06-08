package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class BoxNoDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public String boxNoCd;

		public String boxNoNm;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();
}
