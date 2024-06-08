package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.WReplenishInstInputDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReplenishInstBulkInputDto extends PagingDto {

	public static WReplenishInstInputDto chaseWReplenishInstInputDto() {
		return chaseWReplenishInstInputDto(new WReplenishInstInputDto());
	}

	public static WReplenishInstInputDto chaseWReplenishInstInputDto(WReplenishInstInputDto dto) {
		return dto;
	}

	public static class ReplenishInstBulkInputData implements Serializable {
		public String receiveCd;
		public int dataCount;
		public int errorCount;
		public WReplenishInstInputDto head = chaseWReplenishInstInputDto();
		public List<WReplenishInstInputDto> bodyList = new ArrayList<WReplenishInstInputDto>();
		public WReplenishInstInputDto blankRow = chaseWReplenishInstInputDto();
	};

	public ReplenishInstBulkInputData data = new ReplenishInstBulkInputData();
}