package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dto.TMoveInstHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockMoveInstListDto extends PagingDto {

	public static TMoveInstHDto chaseTMoveInstH() {
		return chaseTMoveInstH(new TMoveInstHDto());
	}

	public static TMoveInstHDto chaseTMoveInstH(TMoveInstHDto dto) {
		
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		
		return dto;
	}

	public static class StockData implements Serializable {
		public TMoveInstHDto head = chaseTMoveInstH();
		public List<TMoveInstBDto> body = new ArrayList<TMoveInstBDto>();
	};

	public StockData data = new StockData();
}
