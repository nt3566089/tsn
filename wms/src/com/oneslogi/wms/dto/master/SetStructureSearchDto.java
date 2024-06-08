package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MSetParentDto;
import com.oneslogi.base.dto.PagingDto;

public class SetStructureSearchDto extends PagingDto {

	public static MSetParentDto chaseMSetParentBodyDto() {
		return chaseMSetParentBodyDto(new MSetParentDto());
	}

	public static MSetParentDto chaseMSetParentBodyDto(MSetParentDto dto) {
		
		if(dto.getMProduct()==null){
			dto.setMProduct(new MProductDto());
		}
		
		if(dto.getMProduct().getMClient() == null){
			dto.getMProduct().setMClient(new MClientDto());
		}
		return dto;
	}
	
	public static class SetStructureData implements Serializable {
		//検索条件
		public MSetParentDto head = chaseMSetParentBodyDto();
		
		public List<MSetParentDto> body = new ArrayList<MSetParentDto>();
		
	};

	public SetStructureData data = new SetStructureData();

}
