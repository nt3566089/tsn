package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class ReceivePlanConditionDto extends BaseDto {

	public static class DropDownListData implements Serializable {
		public String conditionId;
		public String conditionNm;
	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();


}
