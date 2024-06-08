package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MEdiDto;
import com.oneslogi.base.dto.PagingDto;

public class EdiMasterDto extends PagingDto {

	public static class EdiMasterListData implements Serializable {

		public MEdiDto head = new MEdiDto();

		public List<MEdiDto> body = new ArrayList<MEdiDto>();

	}

	public EdiMasterListData data = new EdiMasterListData();
}
