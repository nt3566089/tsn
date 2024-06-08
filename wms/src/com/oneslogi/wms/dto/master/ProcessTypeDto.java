package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class ProcessTypeDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public String processTypeNm;

		public String processTypeCd;

		public String defaultFlg;

		public String stockTypeCd;
	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
