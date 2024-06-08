package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dto.PagingDto;

public class CenterRelatedCopyDto extends PagingDto {

	public static MClientCenterDto chaseMClientCenterDto() {
		return chaseMClientCenterDto(new MClientCenterDto());
	}

	public static MClientCenterDto chaseMClientCenterDto(MClientCenterDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		if (dto.getMParamAsOne() == null) {
			dto.setMParamAsOne(new MParamDto());
		}

		return dto;
	}

	public static class CenterRelatedCopyData implements Serializable {

		public MCenterDto mCenterFrom = new MCenterDto();
		public MClientCenterDto mClientFrom = chaseMClientCenterDto();
		public MCenterDto mCenterTo = new MCenterDto();
		public MClientDto mClientTo = new MClientDto();
		public List<BClassDtlDto> body = new ArrayList<BClassDtlDto>();

	}

	public CenterRelatedCopyData data = new CenterRelatedCopyData();

}
