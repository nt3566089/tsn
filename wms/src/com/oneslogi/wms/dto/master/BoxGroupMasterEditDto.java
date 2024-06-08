package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MBoxGrpDto;
import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MBoxGrpDtlDto;
import com.oneslogi.base.dto.PagingDto;

public class BoxGroupMasterEditDto extends PagingDto {

	public static MBoxGrpDto chasMBoxGrpBodyDto() {
		return chasMBoxGrpBodyDto(new MBoxGrpDto());
	}

	public static MBoxGrpDto chasMBoxGrpBodyDto(MBoxGrpDto dto) {
		
		
		if(dto.getMBox()==null){
			dto.setMBox(new MBoxDto());
		}
		
		if(dto.getMBox().getMCenter() == null){
			dto.getMBox().setMCenter(new MCenterDto());
		}
		
		return dto;
	}
	
	public static MBoxGrpDtlDto chaseMBoxGrpDtlBodyDto() {
		return chaseMBoxGrpDtlBodyDto(new MBoxGrpDtlDto());
	}
	
    public static MBoxGrpDtlDto chaseMBoxGrpDtlBodyDto(MBoxGrpDtlDto dto) {
		
	if(dto.getMBox()==null){
		dto.setMBox(new MBoxDto());
	}
		return dto;
	}

	public static class BoxGroupMasterData implements Serializable {
		//検索条件
		public MBoxGrpDto head = chasMBoxGrpBodyDto();
		
		public List<MBoxGrpDtlDto> body = new ArrayList<MBoxGrpDtlDto>();
		
		//空行
		public MBoxGrpDtlDto blankRow = chaseMBoxGrpDtlBodyDto();
	};

	public BoxGroupMasterData data = new BoxGroupMasterData();

}
