package com.oneslogi.wms.dto.stock;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockMoveDto extends BaseDto {

	public static TStockDto chaseTStockFromDto() {
		return chaseTStockFromDataDto(new TStockDto());
	}

	public static TStockDto chaseTStockFromDataDto(TStockDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getMLocation().getMCenter() == null) {
			dto.getMLocation().setMCenter(new MCenterDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getTStoreNo().getMCustomer() == null) {
			dto.getTStoreNo().setMCustomer(new MCustomerDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
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

	public static TStockDto chaseTStockToDto() {
		return chaseTStockToDataDto(new TStockDto());
	}

	public static TStockDto chaseTStockToDataDto(TStockDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getMLocation().getMCenter() == null) {
			dto.getMLocation().setMCenter(new MCenterDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getTStoreNo().getMCustomer() == null) {
			dto.getTStoreNo().setMCustomer(new MCustomerDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
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
		public TStockDto fromDto = chaseTStockFromDto();
		public TStockDto toDto = chaseTStockToDto();

	};

	public StockData data = new StockData();
}
