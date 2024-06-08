package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class ShapeDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public String shapeCd;

		public String shapeNm;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
