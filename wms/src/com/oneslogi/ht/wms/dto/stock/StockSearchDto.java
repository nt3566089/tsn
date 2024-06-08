package com.oneslogi.ht.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.BDictDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 *在庫検索一覧画面情報を保持します
 *
 */
public class StockSearchDto extends HandyBaseDto {

	public static TStockDto chaseTStockDto() {
		return chaseTStockDto(new TStockDto());
	}

	public static TStockDto chaseTStockDto(TStockDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMStockType().getBDict() == null) {
			dto.getMStockType().setBDict(new BDictDto());
		}

		return dto;
	}

	public static class StockSearchData implements Serializable {

		/**  在庫検索データ */
		public TStockDto stockDto = chaseTStockDto();

		/** 在庫検索一覧 */
		public List<TStockDto> lstStockDto = new ArrayList<TStockDto>();

	};

	public StockSearchData data = new StockSearchData();

	/**
	 * @return stockDto
	 */
	public TStockDto getStockDto() {
		return data.stockDto;
	}

	/**
	 * @param tStockDto セットする tStockDto
	 */
	public void setStockDto(TStockDto tStockDto) {
		this.data.stockDto = tStockDto;
	}

	/**
	 * @return lstWHtShippingDto
	 */
	public List<TStockDto> getLstStockDto() {
		return data.lstStockDto;
	}

	/**
	 * @param lstStockDto TStockDto
	 */
	public void setLstStockDto(List<TStockDto> lstStockDto) {
		this.data.lstStockDto = lstStockDto;
	}

	/**
	 * @return data
	 */
	public StockSearchData getData() {
		return data;
	}

	/**
	 * @param data セットする data
	 */
	public void setData(StockSearchData data) {
		this.data = data;
	}

	/** 出庫ロケ */
	private String locationCd;

	/** JAN/商品 */
	private String janCd;

	/** 入庫ラベルNo. */
	private String storeLabelNo;

	/**
	 * @return storeLabelNo
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	/**
	 * @return locationCd
	 */
	public String getLocationCd() {
		return locationCd;
	}

	/**
	 * @param locationCd セットする locationCd
	 */
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	/**
	 * @return janCd
	 */
	public String getJanCd() {
		return janCd;
	}

	/**
	 * @param storeLabelNo セットする storeLabelNo
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

	/**
	 * @param janCd セットする janCd
	 */
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

}
