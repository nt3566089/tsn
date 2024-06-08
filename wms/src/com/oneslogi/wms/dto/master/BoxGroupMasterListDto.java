package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MBoxGrpDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BoxGroupMasterListDto extends PagingDto {

	public static MBoxGrpDto chaseMBoxGrpDto() {
		return chaseMBoxGrpDto(new MBoxGrpDto());
	}

	public static MBoxGrpDto chaseMBoxGrpDto(MBoxGrpDto dto) {
		if(dto.getMBox() == null){
			dto.setMBox(new MBoxDto());
		}
		if(dto.getMBox().getMCenter() == null){
			dto.getMBox().setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class BoxGrpData implements Serializable {
		//検索条件
		public MBoxGrpDto head = chaseMBoxGrpDto();
		//検索結果
		public List<MBoxGrpDto> boxGroupMasterList = new ArrayList<MBoxGrpDto>();

	};

	public BoxGrpData data = new BoxGrpData();

}
