package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class UserClientDto extends BaseDto {

	public static class DropDownListData implements Serializable {
		
		public String clientNm;
		
		public String clientCd;
		
	};
	
	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
