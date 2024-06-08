package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dbflute.dto.VDictDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryInputAddRowDto extends PagingDto {

	public static TInventoryHDto chaseInventoryHDto() {
		return chaseInventoryHDto(new TInventoryHDto());
	}

	public static TInventoryHDto chaseInventoryHDto(TInventoryHDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		return dto;
	}

	public static TInventoryBDto chaseInventoryBDto() {
		return chaseInventoryBDto(new TInventoryBDto());
	}

	public static TInventoryBDto chaseInventoryBDto(TInventoryBDto dto) {
		if (dto.getTInventoryH() == null) {
			dto.setTInventoryH(new TInventoryHDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMCustomerBySupplierId()== null) {
			dto.setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getMCustomerByDepositId()== null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMStockType().getVDict() == null) {
			dto.getMStockType().setVDict(new VDictDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getTStoreNo().getMCustomer() == null) {
			dto.getTStoreNo().setMCustomer(new MCustomerDto());
		}
		return dto;
	}


	public static class TInventoryAddRowData implements Serializable {
		public TInventoryHDto head = chaseInventoryHDto();
		public TInventoryBDto body = chaseInventoryBDto();

	};


	public TInventoryAddRowData data = new TInventoryAddRowData();

}
