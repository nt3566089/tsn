package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ImportTypeDto extends BaseDto {
	public static class ImportTypeData implements Serializable {
		public List<MImportTypeDto> mImportType = new ArrayList<MImportTypeDto>() ;
	};
	public ImportTypeData data = new ImportTypeData();
}
