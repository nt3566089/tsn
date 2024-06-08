package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.TCcopamDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.dto.report.DeliveryListDto;

public class DispatchRecordInputEditDto extends PrintParamDto {

	public static TCcopamDto chaseTCcopamDto() {
		return chaseTCcopamDto(null);
	}

	public static TCcopamDto chaseTCcopamDto(TCcopamDto dto) {
		if (dto == null) {
			dto = new TCcopamDto();
			
		}
		return dto;
	}

	public static class DispatchRecordInputEditData implements Serializable {
		public TCcopamDto head = chaseTCcopamDto();
		
		// 輸送帳票アウトプットデータ
		public List<DeliveryListDto> printList = new ArrayList<DeliveryListDto>();	
	};

	public DispatchRecordInputEditData data = new DispatchRecordInputEditData();
}
