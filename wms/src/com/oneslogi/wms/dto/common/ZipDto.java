package com.oneslogi.wms.dto.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ZipDto extends PagingDto {
	public static class ZipData implements Serializable {
		public MZipDto mZip = new MZipDto();
	};
	public ZipData data = new ZipData();
}
