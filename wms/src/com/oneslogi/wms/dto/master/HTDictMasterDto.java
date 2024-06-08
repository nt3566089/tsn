package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.BDictDto;
import com.oneslogi.base.dbflute.dto.MHtDictDto;
import com.oneslogi.base.dto.PagingDto;

public class HTDictMasterDto extends PagingDto {

	public static MHtDictDto chaseMHtDictDto() {

		return chaseMHtDictDto(new MHtDictDto());
	}

	public static MHtDictDto chaseMHtDictDto(MHtDictDto dto) {
		if (dto.getBDict() == null) {
			dto.setBDict(new BDictDto());
		}
		return dto;

	}

	public static class HTDictMasterListData implements Serializable {

		public MHtDictDto head = chaseMHtDictDto();

		public List<BDictDto> body = new ArrayList<BDictDto>();

		public BDictDto blankRow = new BDictDto();

	}

	public HTDictMasterListData data = new HTDictMasterListData();
}
