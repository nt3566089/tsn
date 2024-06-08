package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CenterDto extends PagingDto {
	public static class CenterData implements Serializable {
		public MCenterDto mCenter = new MCenterDto();
	};
	public CenterData data = new CenterData();
}
