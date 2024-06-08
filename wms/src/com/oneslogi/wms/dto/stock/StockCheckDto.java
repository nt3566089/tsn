package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TTrhanbaiinvDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockCheckDto extends PagingDto {

	public static TTrhanbaiinvDto chaseTTrhanbaiinvDto() {
		return chaseTTrhanbaiinvDto(new TTrhanbaiinvDto());
	}

	public static TTrhanbaiinvDto chaseTTrhanbaiinvDto(TTrhanbaiinvDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class StockSetReleaseData implements Serializable {
		public TTrhanbaiinvDto head = chaseTTrhanbaiinvDto();
		public List<TTrhanbaiinvDto> list = new ArrayList<TTrhanbaiinvDto>();
	};

	public StockSetReleaseData data = new StockSetReleaseData();
}
