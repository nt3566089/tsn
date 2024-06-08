package com.oneslogi.ht.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dto.TMoveInstHDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫移動入庫情報を保持します
 *
 */
public class StockMoveInDto extends HandyBaseDto {

	public static TMoveInstBDto chaseTMoveInstBDto() {
		return chaseTMoveInstBDto(new TMoveInstBDto());
	}

	public static TMoveInstBDto chaseTMoveInstBDto(TMoveInstBDto dto) {
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
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getMCustomerByDepositId() == null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}
		if (dto.getMCustomerBySupplierId() == null) {
			dto.setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getTMoveInstH() == null) {
			dto.setTMoveInstH(new TMoveInstHDto());
		}
		return dto;
	}

	public static class StockMoveInData implements Serializable {

		/** 在庫移動指示ボディ */
		public TMoveInstBDto tMoveInstBDto = chaseTMoveInstBDto();

		/** 在庫移動指示ボディ一覧 */
		public List<TMoveInstBDto> lstTMoveInstBDto = new ArrayList<TMoveInstBDto>();

	};

	public StockMoveInData data = new StockMoveInData();

	/** JAN/商品 */
	public String janCdProd;

	/**
	 * @return tStockDto
	 */
	public TMoveInstBDto getTMoveInstBDto() {
		return data.tMoveInstBDto;
	}

	/**
	 * @param tStockDto セットする tStockDto
	 */
	public void setTMoveInstBDto(TMoveInstBDto tMoveInstBDto) {
		this.data.tMoveInstBDto = tMoveInstBDto;
	}

	/**
	 * @return lstTStockDto
	 */
	public List<TMoveInstBDto> getLstTMoveInstBDto() {
		return data.lstTMoveInstBDto;
	}

	/**
	 * @param lstTStockDto セットする lstTStockDto
	 */
	public void setLstTMoveInstBDto(List<TMoveInstBDto> lstTMoveInstBDto) {
		this.data.lstTMoveInstBDto = lstTMoveInstBDto;
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

	/**
	 * @return buser
	 */
	public BUser getBuser() {
		return buser;
	}

	/**
	 * @param buser セットする buser
	 */
	public void setBuser(BUser buser) {
		this.buser = buser;
	}

	/**
	 * @param ユーザマスタ
	 */
	public BUser buser;

	/** ロケ */
	private String locationCd;

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

	/** ロケ名称 */
	private String locationNm;

	/**
	 * @return locationNm
	 */
	public String getLocationNm() {
		return locationNm;
	}

	/**
	 * @param locationNm セットする locationNm
	 */
	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	/**
	 * @return moveInstHId
	 */
	public Long getMoveInstHId() {
		return moveInstHId;
	}

	/**
	 * @param moveInstHId セットする moveInstHId
	 */
	public void setMoveInstHId(Long moveInstHId) {
		this.moveInstHId = moveInstHId;
	}

	public Long moveInstHId;

	/** ロケID */
	private Long locationId;

	/**
	 * @return locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId セットする locationId
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return moveInstBId
	 */
	public Long getMoveInstBId() {
		return moveInstBId;
	}

	/**
	 * @param moveInstBId セットする moveInstBId
	 */
	public void setMoveInstBId(Long moveInstBId) {
		this.moveInstBId = moveInstBId;
	}

	public Long moveInstBId;
	
	
	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
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
	
	/** 入庫No.管理フラグ */
	public String storeNoFlg;

	/**
	 * @return labelNo
	 */
	public String getLabelNo() {
		return labelNo;
	}

	/**
	 * @param labelNo セットする labelNo
	 */
	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}
	
	/** 入庫ラベルNo */
	public String labelNo;
	
	/**
	 * @return warehouseId
	 */
	public Long getWarehouseId() {
		return warehouseId;
	}

	/**
	 * @param warehouseId セットする warehouseId
	 */
	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}
	
	/** 倉庫ID */
	public Long warehouseId;
	
	/**
	 * @return warehouseCd
	 */
	public String getWarehouseCd() {
		return warehouseCd;
	}

	/**
	 * @param warehouseCd セットする warehouseCd
	 */
	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}
	
	/** 倉庫CD */
	public String warehouseCd;
	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
}
