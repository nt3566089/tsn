package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MEdiDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class EdiDto extends BaseDto {
	public static class EdiData implements Serializable {
		public List<MEdiDto> ediList = new ArrayList<MEdiDto>() ;
	};
	public EdiData data = new EdiData();
}
