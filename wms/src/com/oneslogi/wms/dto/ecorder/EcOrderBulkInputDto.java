package com.oneslogi.wms.dto.ecorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.InputDto.ColumnDefsData;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class EcOrderBulkInputDto extends BaseDto {

	public static MImportTypeDto chaseMImportTypeDto() {
		return chaseMImportTypeDto(new MImportTypeDto());
	}

	public static MImportTypeDto chaseMImportTypeDto(MImportTypeDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class EcOrderBulkInputData implements Serializable {
		public MImportTypeDto base = chaseMImportTypeDto();
		public List<Object> order = new ArrayList<Object>();
		public String jsonData;
		public Long clientId;
		public Long centerId;
		// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.29 kawana Start
		public List<Object> orderHeader = new ArrayList<Object>();
		public List<Object> orderBody = new ArrayList<Object>();
		public String jsonDataHeader;
		public String jsonDataBody;
		public List<ColumnDefsData> columnDefs;
		// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.29 kawana End
	};

	public EcOrderBulkInputData data = new EcOrderBulkInputData();

}
