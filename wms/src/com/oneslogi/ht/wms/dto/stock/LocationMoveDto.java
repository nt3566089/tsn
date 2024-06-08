package com.oneslogi.ht.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ロケ変更情報を保持します
 *
 */
public class LocationMoveDto extends HandyBaseDto {

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

		return dto;
	}

	public static class LocationMoveOutData implements Serializable {

		/** 在庫 */
		public TStockDto tStockDto = chaseTStockDto();

		/** 在庫一覧 */
		public List<TStockDto> lstTStockDto = new ArrayList<TStockDto>();

	};

	public LocationMoveOutData data = new LocationMoveOutData();

	/** JAN/商品 */
	public String janCdProd;
	/** 数量 */
	public String instNum;

	/** ロケ */
	private Long locationId;
	
	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/** ロケ */
	private String locationCd;
	/**
	 * @return the locationCd
	 */
	public String getLocationCd() {
		return locationCd;
	}

	/**
	 * @param locationCd the locationCd to set
	 */
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	/**
	 * @return the locationNm
	 */
	public String getLocationNm() {
		return locationNm;
	}

	/**
	 * @param locationNm the locationNm to set
	 */
	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	/** ロケ名称 */
	private String locationNm;

	/**
	 * @return tStockDto
	 */
	public TStockDto getTStockDto() {
		return data.tStockDto;
	}

	/**
	 * @param tStockDto セットする tStockDto
	 */
	public void setTStockDto(TStockDto tStockDto) {
		this.data.tStockDto = tStockDto;
	}

	/**
	 * @return lstTStockDto
	 */
	public List<TStockDto> getLstTStockDto() {
		return data.lstTStockDto;
	}

	/**
	 * @param lstTStockDto セットする lstTStockDto
	 */
	public void setLstTStockDto(List<TStockDto> lstTStockDto) {
		this.data.lstTStockDto = lstTStockDto;
	}

	/**
	 * @return janCdProd
	 */
	public String getJanCdProd() {
		return janCdProd;
	}

	/**
	 * @param janCdProd セットする janCdProd
	 */
	public void setJanCdProd(String janCdProd) {
		this.janCdProd = janCdProd;
	}
}
