package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterClassDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.PagingDto;

public class CenterClassMasterDto extends PagingDto {

	public static MCenterClassDto chaseMCenterClass() {
		return chaseMCenterClassDataDto(new MCenterClassDto());
	}

	public static MCenterClassDto chaseMCenterClassDataDto(MCenterClassDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		return dto;
	}

	public static class CenterClassMasterListData implements Serializable {

		public MCenterClassDto head = chaseMCenterClass();

		public List<MCenterClassDto> body = new ArrayList<MCenterClassDto>();

	}

	public CenterClassMasterListData data = new CenterClassMasterListData();
}
