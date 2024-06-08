package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class UserCenterDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public Long centerId;

		public String centerNm;

		public String centerCd;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
