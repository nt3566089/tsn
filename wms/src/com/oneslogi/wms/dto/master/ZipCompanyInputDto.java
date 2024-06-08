package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WZipCompanyInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ZipCompanyInputDto extends BaseDto {
	
	public static WZipCompanyInput chaseWZipCompanyInput() {
		return new WZipCompanyInput();
	}

	public static class ZipCompanyInputData implements Serializable {
		public List<WZipCompanyInput> dataRows = new ArrayList<WZipCompanyInput>();
		public WZipCompanyInput blankRow = chaseWZipCompanyInput();
	};
	
	public ZipCompanyInputData data = new ZipCompanyInputData();
}
