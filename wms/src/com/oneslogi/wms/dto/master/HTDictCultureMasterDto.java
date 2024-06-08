package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.BDictCultureDto;
import com.oneslogi.base.dbflute.dto.MHtDictCultureDto;
import com.oneslogi.base.dto.PagingDto;

public class HTDictCultureMasterDto extends PagingDto {

	public static class HTDictCultureMasterListData implements Serializable {

		public MHtDictCultureDto head = new MHtDictCultureDto();

		public List<BDictCultureDto> body = new ArrayList<BDictCultureDto>();

	}

	public HTDictCultureMasterListData data = new HTDictCultureMasterListData();

}
