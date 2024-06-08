package com.oneslogi.ht.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

public class ReceiveStoreDto extends HandyBaseDto {

	public static WHtReceiveStoreDto chaseWHtReceiveStoreDto() {
		return chaseWHtReceiveStoreDto(new WHtReceiveStoreDto());
	}

	public static WHtReceiveStoreDto chaseWHtReceiveStoreDto(WHtReceiveStoreDto dto) {
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
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}
		return dto;
	}

	public static class ReceiveStoreData implements Serializable {

		/** 入庫格納ワーク */
		public WHtReceiveStoreDto wHtReceiveStoreDto = chaseWHtReceiveStoreDto();

		/** 入庫格納ワーク一覧 */
		public List<WHtReceiveStoreDto> lstWHtReceiveStoreDto = new ArrayList<WHtReceiveStoreDto>();

	};

	public ReceiveStoreData data = new ReceiveStoreData();

	/**
	 * @return wHtReceiveStoreDto
	 */
	public WHtReceiveStoreDto getwHtReceiveStoreDto() {
		return data.wHtReceiveStoreDto;
	}

	/**
	 * @param wHtReceiveStoreDto セットする wHtReceiveStoreDto
	 */
	public void setwHtReceiveStoreDto(WHtReceiveStoreDto wHtReceiveStoreDto) {
		this.data.wHtReceiveStoreDto = wHtReceiveStoreDto;
	}

	/**
	 * @return lstWHtReceiveStoreDto
	 */
	public List<WHtReceiveStoreDto> getLstWHtReceiveStoreDto() {
		return data.lstWHtReceiveStoreDto;
	}

	/**
	 * @param lstWHtReceiveStoreDto セットする lstWHtReceiveStoreDto
	 */
	public void setLstWHtReceiveStoreDto(List<WHtReceiveStoreDto> lstWHtReceiveStoreDto) {
		this.data.lstWHtReceiveStoreDto = lstWHtReceiveStoreDto;
	}

	/** JAN/商品 */
	private String janProdCd;

	/**  ロット期限日管理  */
	//0:ロット期限日管理なし 1:ロット期限日管理  2:ロット管理  3:期限日管理
	public String lotLimitDt;

	/**  数量 */
	public String qty;

	/**  ロケ */
	public String loc;

	/**  期限日 */
	public String limitDt;

	/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
	/** 入庫No.管理フラグ */
	public String storeNoFlg;

	/** 在庫区分ID */
	public List<Long> lstStockTypeId;
	/** 在庫区分NM */
	public List<String> lstStockTypeNm;
	/** 預託ID */
	public List<Long> lstDepositId;
	/** 預託NM */
	public List<String> lstDepositNm;
	/** 仕入先ID */
	public List<Long> lstSupplierId;
	/** 仕入先NM */
	public List<String> lstSupplierNm;

	/**
	 * @return lstStockTypeId
	 */
	public List<Long> getLstStockTypeId() {
		return lstStockTypeId;
	}
	/**
	 * @param lstStockTypeId セットする lstStockTypeId
	 */
	public void setLstStockTypeId(List<Long> lstStockTypeId) {
		this.lstStockTypeId = lstStockTypeId;
	}
	/**
	 * @return lstStockTypeNm
	 */
	public List<String> getLstStockTypeNm() {
		return lstStockTypeNm;
	}
	/**
	 * @param lstStockTypeNm セットする lstStockTypeNm
	 */
	public void setLstStockTypeNm(List<String> lstStockTypeNm) {
		this.lstStockTypeNm = lstStockTypeNm;
	}
	/**
	 * @return lstDepositId
	 */
	public List<Long> getLstDepositId() {
		return lstDepositId;
	}
	/**
	 * @param lstDepositId セットする lstDepositId
	 */
	public void setLstDepositId(List<Long> lstDepositId) {
		this.lstDepositId = lstDepositId;
	}
	/**
	 * @return lstDepositNm
	 */
	public List<String> getLstDepositNm() {
		return lstDepositNm;
	}
	/**
	 * @param lstDepositNm セットする lstDepositNm
	 */
	public void setLstDepositNm(List<String> lstDepositNm) {
		this.lstDepositNm = lstDepositNm;
	}
	/**
	 * @return lstSupplierId
	 */
	public List<Long> getLstSupplierId() {
		return lstSupplierId;
	}
	/**
	 * @param lstSupplierId セットする lstSupplierId
	 */
	public void setLstSupplierId(List<Long> lstSupplierId) {
		this.lstSupplierId = lstSupplierId;
	}
	/**
	 * @return lstSupplierNm
	 */
	public List<String> getLstSupplierNm() {
		return lstSupplierNm;
	}
	/**
	 * @param lstSupplierNm セットする lstSupplierNm
	 */
	public void setLstSupplierNm(List<String> lstSupplierNm) {
		this.lstSupplierNm = lstSupplierNm;
	}

	/**
	 * @return storeNoFlg
	 */
	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	/**
	 * @param storeNoFlg セットする storeNoFlg
	 */
	public void setStoreNoFlg(String storeNoFlg) {
		this.storeNoFlg = storeNoFlg;
	}
	/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */

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
	 * @return loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc セットする loc
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
