package com.oneslogi.ht.wms.dto.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 商品棚卸入力情報を保持します
 *
 */
public class InventoryInputProductDto extends HandyBaseDto {

	public static WHtInventoryInputProdDto chaseWHtInventoryInputProdDto() {
		return chaseWHtInventoryInputProdDto(new WHtInventoryInputProdDto());
	}

	public static WHtInventoryInputProdDto chaseWHtInventoryInputProdDto(WHtInventoryInputProdDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
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

		return dto;
	}

	public static class InventoryData implements Serializable {

		/** 商品棚卸ワーク */
		public WHtInventoryInputProdDto wHtInventoryInputProdDto = chaseWHtInventoryInputProdDto();

		/** 商品棚卸ワーク一覧 */
		public List<WHtInventoryInputProdDto> lstWHtInventoryInputProdDto = new ArrayList<WHtInventoryInputProdDto>();

		/** 預託データ */
		public List<MCustomerDto> lstMCustomerDto = new ArrayList<MCustomerDto>();

		/** 在庫区分データ */
		public List<MStockTypeDto> lstMStockTypeDto = new ArrayList<MStockTypeDto>();
	};


	/**
	 * @return lstWHtInventoryInputProdDto
	 */
	public List<WHtInventoryInputProdDto> getLstWHtInventoryInputProdDto() {
		return data.lstWHtInventoryInputProdDto;
	}

	/**
	 * @param lstWHtInventoryInputProdDto セットする lstWHtInventoryInputProdDto
	 */
	public void setLstWHtInventoryInputProdDto(List<WHtInventoryInputProdDto> lstWHtInventoryInputProdDto) {
		this.data.lstWHtInventoryInputProdDto = lstWHtInventoryInputProdDto;
	}


	public InventoryData data = new InventoryData();

	/**  期限日 */
	public String limitDt;

	/**
	 * @return limitDt
	 */
	public String getLimitDt() {
		return limitDt;
	}

	/**
	 * @param limitDt セットする limitDt
	 */
	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

	/**
	 * @return wHtInventoryInputProdDto
	 */
	public WHtInventoryInputProdDto getwHtInventoryInputProdDto() {
		return data.wHtInventoryInputProdDto;
	}

	/**
	 * @param wHtInventoryInputProdDto セットする wHtInventoryInputProdDto
	 */
	public void setwHtInventoryInputProdDto(WHtInventoryInputProdDto wHtInventoryInputProdDto) {
		this.data.wHtInventoryInputProdDto = wHtInventoryInputProdDto;
	}

	/**
	 * @return lstMCustomerDto
	 */
	public List<MCustomerDto> getLstMCustomerDto() {
		return data.lstMCustomerDto;
	}

	/**
	 * @param lstMCustomerDto セットする lstMCustomerDto
	 */
	public void setMCustomerDto(List<MCustomerDto> lstMCustomerDto) {
		this.data.lstMCustomerDto = lstMCustomerDto;
	}

	/**
	 * @return lstMStockTypeDto
	 */
	public List<MStockTypeDto> getLstMStockTypeDto() {
		return data.lstMStockTypeDto;
	}

	/**
	 * @param lstMStockTypeDto セットする lstMStockTypeDto
	 */
	public void setMStockTypeDto(List<MStockTypeDto> lstMStockTypeDto) {
		this.data.lstMStockTypeDto = lstMStockTypeDto;
	}


	/**  預託区分 */
	public String deposit;

	/**  在庫区分 */
	public String stockType;

	/**  JAN/商品CD */
	public String janProdCd;

	/**
	 * @return janProdCd
	 */
	public String getJanProdCd() {
		return janProdCd;
	}

	/**
	 * @param janProdCd セットする janProdCd
	 */
	public void setJanProdCd(String janProdCd) {
		this.janProdCd = janProdCd;
	}

	/**
	 * @return deposit
	 */
	public String getDeposit() {
		return deposit;
	}

	/**
	 * @param deposit セットする deposit
	 */
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	/**
	 * @return stockType
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param stockType セットする stockType
	 */
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	/**  数量 */
	public String qty;

	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty セットする qty
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}

	/**  ロット期限日管理  */
	//0:ロット期限日管理なし 1:ロット期限日管理  2:ロット管理  3:期限日管理
	public String lotLimitDt;

	/**
	 * @return lotLimitDt
	 */
	public String getLotLimitDt() {
		return lotLimitDt;
	}

	/**
	 * @param lotLimitDt セットする lotLimitDt
	 */
	public void setLotLimitDt(String lotLimitDt) {
		this.lotLimitDt = lotLimitDt;
	}



}
