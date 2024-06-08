package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterClassDtlDto;
import com.oneslogi.base.dbflute.dto.MCenterClassDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.PagingDto;

public class CenterClassDtlMasterDto extends PagingDto {

	public static MCenterClassDto chaseMCenterClass() {
		return chaseMCenterClassDataDto(new MCenterClassDto());
	}

	public static MCenterClassDto chaseMCenterClassDataDto(MCenterClassDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		return dto;
	}

	public static class CenterClassMasterEditData implements Serializable {

		public MCenterClassDto head = chaseMCenterClass();

		public List<MCenterClassDtlDto> body = new ArrayList<MCenterClassDtlDto>();

		//空行
		public MCenterClassDtlDto blankRow =  new MCenterClassDtlDto();

	}

	public CenterClassMasterEditData data = new CenterClassMasterEditData();
}
