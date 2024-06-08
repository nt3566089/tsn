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
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dto.TInventoryRDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryWorkListPrintDto extends PrintParamDto {

	public static TInventoryHDto chaseTInventoryHDto() {
		return chaseTInventoryHDto(new TInventoryHDto());
	}

	public static TInventoryHDto chaseTInventoryHDto(TInventoryHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
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
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMCustomerByDepositId() == null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
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
		return dto;
	}

	public static TInventoryRDto chaseTInventoryRDto() {
		return chaseTInventoryRDto(new TInventoryRDto());
	}

	public static TInventoryRDto chaseTInventoryRDto(TInventoryRDto dto) {
		return dto;
	}

	public static class InventoryWorkListData implements Serializable {
		//棚卸ヘッダDTO
		public TInventoryHDto head = chaseTInventoryHDto();
		//棚卸ボディDTO
		public TInventoryBDto body = chaseTInventoryBDto();
		//棚卸指示DTO
		public TInventoryInstDto inst = chaseTInventoryInstDto();
		//棚卸帳票DTO
		public TInventoryRDto report = chaseTInventoryRDto();
	};

	public InventoryWorkListData data = new InventoryWorkListData();
}
