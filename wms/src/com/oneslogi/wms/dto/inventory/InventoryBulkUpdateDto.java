package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryBulkUpdateDto extends PagingDto {

	public static TInventoryHDto chaseTInventoryHDto() {
		return chaseTInventoryHDto(new TInventoryHDto());
	}

	public static TInventoryHDto chaseTInventoryHDto(TInventoryHDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());;
		}

		return dto;
	}

	public static TInventoryBDto chaseTInventoryBDto() {
		return chaseTInventoryBDto(new TInventoryBDto());
	}

	public static TInventoryBDto chaseTInventoryBDto(TInventoryBDto dto) {

		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}

		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		return dto;
	}

	public static TInventoryInstDto chaseTInventoryInstDto() {
		return chaseTInventoryInstDto(new TInventoryInstDto());
	}

	public static TInventoryInstDto chaseTInventoryInstDto(TInventoryInstDto dto) {


		if (dto.getMZone() == null) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}

		return dto;
	}


	public static class InventoryBulkUpdateData implements Serializable {
		public TInventoryInstDto headInventoryInst = chaseTInventoryInstDto();
		public TInventoryBDto headInventoryB = chaseTInventoryBDto();
		public TInventoryHDto headInventoryH =  chaseTInventoryHDto();
		public MProductDto headProduct = new MProductDto();
		public List<TInventoryBDto> body = new ArrayList<TInventoryBDto>();
	};

	public InventoryBulkUpdateData data = new InventoryBulkUpdateData();
}
