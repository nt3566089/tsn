package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TCcopamDto;
import com.oneslogi.base.dbflute.dto.customize.SqlDispatchRecordInputListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.dto.report.DeliveryListDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DispatchRecordInputPrintDto extends PrintParamDto {

	public static TCcopamDto chaseTCcopamDto() {
		return chaseTCcopamDto(new TCcopamDto());
	}

	public static TCcopamDto chaseTCcopamDto(TCcopamDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class DispatchRecordInputListData implements Serializable {
		// 検索条件を入れるDTO
		public TCcopamDto head = chaseTCcopamDto();

		// 検索結果
		public List<SqlDispatchRecordInputListDto> list = new ArrayList<SqlDispatchRecordInputListDto>();
		//public List<SqlTCcopamPrintUsedDto> bodyList = new ArrayList<SqlTCcopamPrintUsedDto>();
		
		// 輸送帳票アウトプットデータ
		public List<DeliveryListDto> printList = new ArrayList<DeliveryListDto>();		
		
		// システム管理日付
		public String systemDt = "";

	};

	public DispatchRecordInputListData data = new DispatchRecordInputListData();
}
