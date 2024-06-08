package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryCreateDto extends PagingDto {


	public static TInventoryInstDto chasTInventoryInstDto() {
		return chaseTInventoryInstDtoDto(new TInventoryInstDto());
	}

	public static TInventoryInstDto chaseTInventoryInstDtoDto(TInventoryInstDto dto) {
		if(dto.getTInventoryH() == null) {
			dto.setTInventoryH(new TInventoryHDto());
		}
		if(dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if(dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if(dto.getMZone() == null) {
			dto.setMZone(new MZoneDto());
			if(dto.getMZone().getMWarehouse() == null) {
				dto.getMZone().setMWarehouse(new MWarehouseDto());
			}
		}
		if(dto.getBClassDtlByStockExistOnlyFlg() == null) {
			dto.setMZone(new MZoneDto());
		}
		return dto;
	}

	public static class InventoryCreateata implements Serializable {
		// 検索条件を入れるDTO
		public TInventoryInstDto searchCondition = chasTInventoryInstDto();
		
	
	};

	public InventoryCreateata data = new InventoryCreateata();
}
