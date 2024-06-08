package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class CarrierSlipCdDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public String tagType;
		public String tagNm;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
