package com.oneslogi.ht.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dto.TMoveInstHDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫移動出庫情報を保持します
 *
 */
public class StockMoveOutDto extends HandyBaseDto {

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

	/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
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
	/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */

	public static class StockMoveOutData implements Serializable {

		/** 在庫 */
		public TStockDto tStockDto = chaseTStockDto();

		/** 在庫一覧 */
		public List<TStockDto> lstTStockDto = new ArrayList<TStockDto>();

		/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
		/** 在庫移動指示ボディ一覧 */
		public List<TMoveInstBDto> lstTMoveInstBDto = new ArrayList<TMoveInstBDto>();
		/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */
	};

	public StockMoveOutData data = new StockMoveOutData();

	/** JAN/商品 */
	public String janCdProd;
	
// [Ver3.0] unit of measure対応 2017.11.22 王  Start
	/** 数量 */
	public String qty;
// [Ver3.0] unit of measure対応 2017.11.22 王  End

	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
	/** 入庫ラベルNo. */
	private String storeLabelNo;
	/** 入庫No.管理フラグ */
	public String storeNoFlg;
	/** ロケ */
	private String locationCd;
	/** ロケ名称 */
	private String locationNm;
	/** ロケID */
	private Long locationId;
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

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
	
// [Ver3.0] unit of measure対応 2017.11.22 王  Start
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
// [Ver3.0] unit of measure対応 2017.11.22 王  End

	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
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

    /**
	 * @return storeLabelNo
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	/**
	 * @param storeLabelNo セットする storeLabelNo
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

	/* [次期エンハンス] 移動入庫を追加 2015.09.15 By SJA Start */
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
	 * @return lstTMoveInstBDto
	 */
	public List<TMoveInstBDto> getLstTMoveInstBDto() {
		return data.lstTMoveInstBDto;
	}

	/**
	 * @param lstTMoveInstBDto セットする lstTMoveInstBDto
	 */
	public void setLstTMoveInstBDto(List<TMoveInstBDto> lstTMoveInstBDto) {
		this.data.lstTMoveInstBDto = lstTMoveInstBDto;
	}
    /* [次期エンハンス] 移動入庫を追加 2015.09.15 By SJA End */

}
