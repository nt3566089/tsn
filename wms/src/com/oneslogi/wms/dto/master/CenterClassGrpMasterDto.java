package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterClassDto;
import com.oneslogi.base.dbflute.dto.MCenterClassGrpDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CenterClassGrpMasterDto extends PagingDto {

	public static MCenterClassDto chaseMCenterClass() {
		return chaseMCenterClassDataDto(new MCenterClassDto());
	}

	public static MCenterClassDto chaseMCenterClassDataDto(MCenterClassDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		return dto;
	}

	public static class CenterClassGrpData implements Serializable {
		// センタ区分値グループマスタメンテナンス情報
		public MCenterClassDto head = chaseMCenterClass();
		// センタ区分値グループマスタメンテナンス明細情報
		public List<MCenterClassGrpDto> body = new ArrayList<MCenterClassGrpDto>();
		// センタ区分値グループマスタメンテナンス明細空行情報
		public MCenterClassGrpDto blankRow = new MCenterClassGrpDto();
	};

	public CenterClassGrpData data = new CenterClassGrpData();

}
