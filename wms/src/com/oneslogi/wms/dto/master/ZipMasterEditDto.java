package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dto.PagingDto;

public class ZipMasterEditDto extends PagingDto {

	public static MZipDto chaseMZipDto() {
		return new MZipDto();
	}

	public static class MZipData implements Serializable {
		public MZipDto head = chaseMZipDto();
	};

	public MZipData data = new MZipData();
}
