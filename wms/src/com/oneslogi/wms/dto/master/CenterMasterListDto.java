package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.PagingDto;

public class CenterMasterListDto extends PagingDto {

	public static MCenterDto chaseMCenterDto() {
		return chaseMCenterDto(new MCenterDto());
	}

	public static MCenterDto chaseMCenterDto(MCenterDto dto) {
		// [C-CWMS-0039] センタ間移動機能を追加により不要な処理を削除 2015.09.09 kawana
		return dto;
	}

	public static class CenterMasterListData implements Serializable {

		public MCenterDto head = chaseMCenterDto();

		public List<MCenterDto> body = new ArrayList<MCenterDto>();

	}

	public CenterMasterListData data = new CenterMasterListData();
}
