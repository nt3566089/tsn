package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dto.BaseDto;

public class ClientCenterDto extends BaseDto {

	public static class ClientCenterData implements Serializable {

		public MClientCenterDto mClientCenter = new MClientCenterDto();

	}

	public static class DropDownListData implements Serializable {
		
		public String centerNm;
		
		public String centerCd;
		
	};
	
	public List<DropDownListData> listdata = new ArrayList<DropDownListData>();
	public ClientCenterData data = new ClientCenterData();
}
