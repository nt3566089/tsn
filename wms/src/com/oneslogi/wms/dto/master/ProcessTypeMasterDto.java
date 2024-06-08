package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProcessTypeMasterDto extends PagingDto {

	public static MProcessTypeDto chaseMProcessTypeDto() {
		return chaseMProcessTypeDto(new MProcessTypeDto());
	}

	public static MProcessTypeDto chaseMProcessTypeDto(MProcessTypeDto dto) {
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		return dto;
	}

	public static MProcessTypeDto chaseMProcessTypeBodyDto() {
		return chaseMProcessTypeBodyDto(new MProcessTypeDto());
	}

	public static MProcessTypeDto chaseMProcessTypeBodyDto(MProcessTypeDto dto) {
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		return dto;
	}

	public static class ProcessTypeData implements Serializable {
		//検索条件
		public MProcessTypeDto processTypeMasterSearch = chaseMProcessTypeDto();
		//検索結果
		public List<MProcessTypeDto> processTypeList = new ArrayList<MProcessTypeDto>();
		//空行
		public MProcessTypeDto blankRow = chaseMProcessTypeBodyDto();
	};

	public ProcessTypeData data = new ProcessTypeData();

}
