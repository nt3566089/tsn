package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.OutputDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class TotalStockListDto extends OutputDto {

	public static TStockDto chaseTStockDto() {
		return chaseTStockDataDto(new TStockDto());
	}

	public static TStockDto chaseTStockDataDto(TStockDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getMLocation().getMCenter() == null) {
			dto.getMLocation().setMCenter(new MCenterDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}

		return dto;
	}

	public static class StockData implements Serializable {
		public TStockDto head = chaseTStockDto();
		public List<TStockDto> body = new ArrayList<TStockDto>();
	};

	public StockData data = new StockData();
}
