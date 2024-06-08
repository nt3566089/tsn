package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDtlDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDto;
import com.oneslogi.base.dto.PagingDto;

public class ShapeGroupMasterEditDto extends PagingDto {

	public static MShapeGrpDto chasMShapeGrpBodyDto() {
		return chasMShapeGrpBodyDto(new MShapeGrpDto());
	}

	public static MShapeGrpDto chasMShapeGrpBodyDto(MShapeGrpDto dto) {
		if(dto.getMClient() == null){
			dto.setMClient(new MClientDto());
		}

		return dto;
	}

	public static MShapeGrpDtlDto chaseMShapeGrpDtlBodyDto() {
		return chaseMShapeGrpDtlBodyDto(new MShapeGrpDtlDto());
	}

    public static MShapeGrpDtlDto chaseMShapeGrpDtlBodyDto(MShapeGrpDtlDto dto) {

	if(dto.getMShape()==null){
		dto.setMShape(new MShapeDto());
	}
		return dto;
	}

	public static class ShapeGroupMasterData implements Serializable {
		//検索条件
		public MShapeGrpDto head = chasMShapeGrpBodyDto();

		public List<MShapeGrpDtlDto> body = new ArrayList<MShapeGrpDtlDto>();

		//空行
		public MShapeGrpDtlDto blankRow = chaseMShapeGrpDtlBodyDto();

		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add Start
		// 最大荷姿件数
		public int maxShapeCount = 0;
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add End
	};

	public ShapeGroupMasterData data = new ShapeGroupMasterData();

}
