package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShapeGroupMasterListDto extends PagingDto {

	public static MShapeGrpDto chaseMShapeGrpDto() {
		return chaseMShapeGrpDto(new MShapeGrpDto());
	}

	public static MShapeGrpDto chaseMShapeGrpDto(MShapeGrpDto dto) {

		if(dto.getMClient() == null){
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static MShapeGrpDto chaseMShapeBodyDto() {
		return chaseMShapeGrpBodyDto(new MShapeGrpDto());
	}

	public static MShapeGrpDto chaseMShapeGrpBodyDto(MShapeGrpDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}
	public static class ShapeGrpData implements Serializable {
		//検索条件
		public MShapeGrpDto head = chaseMShapeGrpDto();
		//検索結果
		public List<MShapeGrpDto> shapeGroupMasterList = new ArrayList<MShapeGrpDto>();

	};

	public ShapeGrpData data = new ShapeGrpData();

}
