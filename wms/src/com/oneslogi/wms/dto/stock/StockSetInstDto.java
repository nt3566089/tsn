package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MSetParentDto;
import com.oneslogi.base.dbflute.dto.MSetStructureDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockSetInstDto extends PagingDto {

	public static TStockDto chaseTStockDto() {
		return chaseTStockDataDto(new TStockDto());
	}

	public static TStockDto chaseTStockDataDto(TStockDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
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
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}
		return dto;
	}

	public static MSetStructureDto chaseM_Set_StructureDto() {
		return chaseM_Set_StructureDto(new MSetStructureDto());
	}

	public static MSetStructureDto chaseM_Set_StructureDto(MSetStructureDto dto) {
		if (dto.getMSetParent() == null) {
			dto.setMSetParent(new MSetParentDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		return dto;
	}

	public static class StockInstData implements Serializable {
		public TStockDto head = chaseTStockDto();
		public List<MSetStructureDto> setStructureList = new ArrayList<MSetStructureDto>();
		public List<TStockDto> stockList = new ArrayList<TStockDto>();
	};

	public StockInstData data = new StockInstData();
}
