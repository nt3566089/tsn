package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MDataInputTypeDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DataInputTypeDto extends BaseDto {
	public static class DataInputTypeData implements Serializable {
		public List<MDataInputTypeDto> mDataInputType = new ArrayList<MDataInputTypeDto>() ;
	};
	public DataInputTypeData data = new DataInputTypeData();
}
