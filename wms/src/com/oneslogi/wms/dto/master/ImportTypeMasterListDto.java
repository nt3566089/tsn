package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dto.PagingDto;

public class ImportTypeMasterListDto extends PagingDto {

	public static MImportTypeDto chaseSearchDto(MImportTypeDto dto) {

		if (dto == null) {
			dto = new MImportTypeDto();
		}

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		return dto;
	}

	public static class ImportTypeMasterListData implements Serializable {

		public MImportTypeDto search = chaseSearchDto(new MImportTypeDto());

		public List<MImportTypeDto> list = new ArrayList<MImportTypeDto>();

	}

	public ImportTypeMasterListData data = new ImportTypeMasterListData();
}
