package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dto.PagingDto;

public class ZipMasterDto extends PagingDto{

	public static MZipDto chaseMZipDto() {
		return new MZipDto();
	}

	public static MZipDto chaseMZipBodyDto() {
		return new MZipDto();
	}

	public static class ZipData implements Serializable {
		// 検索条件
		public MZipDto head = chaseMZipDto();
		// 検索結果
		public List<MZipDto> body = new ArrayList<MZipDto>();
		// 空行
		public MZipDto blankRow = chaseMZipBodyDto();

	}

	public ZipData data = new ZipData();
}
