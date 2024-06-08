package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WZipInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ZipInputDto extends BaseDto {
	
	public static WZipInput chaseWZipInput() {
		return new WZipInput();
	}

	public static class ZipInputData implements Serializable {
		public List<WZipInput> dataRows = new ArrayList<WZipInput>();
		public WZipInput blankRow = chaseWZipInput();
	};
	
	public ZipInputData data = new ZipInputData();
}
