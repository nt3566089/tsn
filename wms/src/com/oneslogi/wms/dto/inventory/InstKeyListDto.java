package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dto.customize.SqlInstKeyListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InstKeyListDto extends PagingDto {

	public static TInventoryHDto chaseTInventoryHDto() {
		return chaseTInventoryHDto(new TInventoryHDto());
	}

	public static TInventoryHDto chaseTInventoryHDto(TInventoryHDto dto) {
		return dto;
	}

	public static TInventoryInstDto chasTInventoryInstDto() {
		return chaseTInventoryInstDtoDto(new TInventoryInstDto());
	}

	public static TInventoryInstDto chaseTInventoryInstDtoDto(TInventoryInstDto dto) {

		return dto;
	}

	public static class InstKeyListata implements Serializable {
		// 検索条件を入れるDTO
		public TInventoryHDto head = chaseTInventoryHDto();
		public TInventoryInstDto inst = chasTInventoryInstDto();
		
		public InstKeyPrintDto instKeyPrintDto =  new InstKeyPrintDto();
		
		//検索結果
		public List<SqlInstKeyListDto> bodyList = new ArrayList<SqlInstKeyListDto>();
	
	};

	public InstKeyListata data = new InstKeyListata();
}
