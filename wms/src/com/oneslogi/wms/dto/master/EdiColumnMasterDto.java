package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MEdiColumnDto;
import com.oneslogi.base.dbflute.dto.MEdiDto;
import com.oneslogi.base.dto.PagingDto;

public class EdiColumnMasterDto extends PagingDto {

	public static class EdiColumnMasterEditData implements Serializable {

		public MEdiDto head = new MEdiDto();

		public List<MEdiColumnDto> body = new ArrayList<MEdiColumnDto>();

		//空行
		public MEdiColumnDto blankRow =  new MEdiColumnDto();

	}

	public EdiColumnMasterEditData data = new EdiColumnMasterEditData();
}
