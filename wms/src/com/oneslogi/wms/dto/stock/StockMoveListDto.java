package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.TMoveInstHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockMoveListDto extends PagingDto {

	public static TMoveInstHDto chaseTMoveInstHDto() {
		return chaseTMoveInstHDataDto(new TMoveInstHDto());
	}

	public static TMoveInstHDto chaseTMoveInstHDataDto(TMoveInstHDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if(dto.getMProcessType() == null){
			dto.setMProcessType(new MProcessTypeDto());
		}
		return dto;
	}

	public static class StockSetReleaseData implements Serializable {
		public TMoveInstHDto head = chaseTMoveInstHDto();
		public List<TMoveInstHDto> list = new ArrayList<TMoveInstHDto>();
		// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama Start
		public PrintParamDto directionsPrintParam = new PrintParamDto();
		// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama End
	};

	public StockSetReleaseData data = new StockSetReleaseData();
}
