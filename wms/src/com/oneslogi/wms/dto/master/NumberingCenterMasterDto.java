package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MNumberingCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class NumberingCenterMasterDto extends PagingDto {
	public static MNumberingCenterDto chaseMNumberingCenterDto() {
		return chaseMNumberingCenterDto(new MNumberingCenterDto());
	}

	public static MNumberingCenterDto chaseMNumberingCenterDto(MNumberingCenterDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class NumberingCenterMasterData implements Serializable {
		public MNumberingCenterDto head = chaseMNumberingCenterDto();
		public List<MNumberingCenterDto> list = new ArrayList<MNumberingCenterDto>();
		public MNumberingCenterDto blankRow = chaseMNumberingCenterDto();
	};

	public NumberingCenterMasterData data = new NumberingCenterMasterData();
}
