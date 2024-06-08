package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.customize.SqlMLocationMasterEditDto;
import com.oneslogi.base.dto.PagingDto;

public class LocationMasterEditDto extends PagingDto {


	public static class MLocationData implements Serializable {
		public SqlMLocationMasterEditDto head = new SqlMLocationMasterEditDto();
	};

	public MLocationData data = new MLocationData();
}
