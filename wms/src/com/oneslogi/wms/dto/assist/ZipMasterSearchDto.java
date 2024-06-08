package com.oneslogi.wms.dto.assist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ZipMasterSearchDto extends PagingDto {

	public static MZipDto chaseMZipDto() {
		return new MZipDto();
	}

	public static class ZipMasterSearchData implements Serializable {
		public MZipDto head = chaseMZipDto();
		public List<MZipDto> body = new ArrayList<MZipDto>();
	};

	public ZipMasterSearchData data = new ZipMasterSearchData();
}
