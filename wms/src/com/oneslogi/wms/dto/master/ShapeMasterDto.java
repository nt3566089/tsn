package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShapeMasterDto extends PagingDto {

	public static MShapeDto chaseMShapeDto() {
		return chaseMShapeDto(new MShapeDto());
	}

	public static MShapeDto chaseMShapeDto(MShapeDto dto) {
		// [Ver3.0] unit of measure対応 2017.12.27 NING Del
		return dto;
	}

	public static MShapeDto chaseMShapeBodyDto() {
		return chaseMShapeBodyDto(new MShapeDto());
	}

	public static MShapeDto chaseMShapeBodyDto(MShapeDto dto) {
		// [Ver3.0] unit of measure対応 2017.12.27 NING Del
		return dto;
	}

	public static class ShapeMasterData implements Serializable {
		//検索条件
		public MShapeDto head = chaseMShapeDto();
		//検索結果
		public List<MShapeDto> list = new ArrayList<MShapeDto>();
		//空行
		public MShapeDto blankRow = chaseMShapeBodyDto();
	};

	public ShapeMasterData data = new ShapeMasterData();

}
