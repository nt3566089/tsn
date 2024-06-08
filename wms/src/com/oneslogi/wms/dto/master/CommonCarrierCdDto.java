package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class CommonCarrierCdDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public String carrierNm;

		public String carrierCd;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
