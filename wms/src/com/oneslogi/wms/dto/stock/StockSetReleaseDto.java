package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.math.BigDecimal;
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
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockSetReleaseDto extends PagingDto {

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
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		return dto;
	}

	// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
	public static class InstInputData implements Serializable {
		// 指示数量
		private BigDecimal chargeNum;

		public BigDecimal getChargeNum() {
			return chargeNum;
		}

		public void setChargeNum(BigDecimal chargeNum) {
			this.chargeNum = chargeNum;
		}
	};
	// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End

	public static class StockSetReleaseData implements Serializable {
		public TStockDto head = chaseTStockDto();
		public TStockDto stock = chaseTStockDto();
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
		public InstInputData instInput = new InstInputData();
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End
		public List<TStockDto> stockList = new ArrayList<TStockDto>();
		public List<TStockDto> releaseInput = new ArrayList<TStockDto>();
	};

	public StockSetReleaseData data = new StockSetReleaseData();
}
