package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.HReceiveBDto;
import com.oneslogi.base.dbflute.dto.HReceiveHDto;
import com.oneslogi.base.dbflute.dto.HStockDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveHistoryDto extends PagingDto {

	public static HReceiveHDto chaseHReceiveHDto() {
		return chaseHReceiveHDto(new HReceiveHDto());
	}

	public static HReceiveHDto chaseHReceiveHDto(HReceiveHDto dto) {
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}
		return dto;
	}

	public static HReceiveBDto chaseHReceiveBDto() {
		return chaseHReceiveBDto(new HReceiveBDto());
	}

	public static HReceiveBDto chaseHReceiveBDto(HReceiveBDto dto) {
		if (dto.getHStock() == null) {
			dto.setHStock(new HStockDto());
		}
		if (dto.getHStock().getMStockType() == null) {
			dto.getHStock().setMStockType(new MStockTypeDto());
		}
		if (dto.getHReceiveH() == null) {
			dto.setHReceiveH(new HReceiveHDto());
		}
		if (dto.getHReceiveH().getMProcessType() == null) {
			dto.getHReceiveH().setMProcessType(new MProcessTypeDto());
		}

		return dto;
	}

	public static class ReceiveHistoryData implements Serializable {
		// 検索条件を入れるDTO
		public HReceiveHDto head = chaseHReceiveHDto();
		public HReceiveBDto body = chaseHReceiveBDto();

		// 検索結果
		public List<HReceiveBDto> bodyList = new ArrayList<HReceiveBDto>();
	};

	public ReceiveHistoryData data = new ReceiveHistoryData();
}
