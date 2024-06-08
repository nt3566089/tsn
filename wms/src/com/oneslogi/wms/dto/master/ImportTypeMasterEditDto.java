package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MImportTypeBDto;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ImportTypeMasterEditDto extends BaseDto {

	public static MImportTypeDto chaseMImportTypeDto(MImportTypeDto dto) {

		if (dto == null) {
			dto = new MImportTypeDto();
		}

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		return dto;
	}

	public static class ColumnListData implements Serializable {

		public String columnNm;
	};

	public static class ImportTypeMasterEditData implements Serializable {
		public MImportTypeDto header = chaseMImportTypeDto(new MImportTypeDto());
		public List<MImportTypeBDto> bodyList = new ArrayList<MImportTypeBDto>();
		public List<ColumnListData> columnList = new ArrayList<ColumnListData>();
	}

	public ImportTypeMasterEditData data = new ImportTypeMasterEditData();
}
