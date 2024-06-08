package com.oneslogi.ht.wms.dto.receive;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 予定無し入荷情報を保持します。
 *
 */
public class ReceiveNoPlanInspectionDto extends HandyBaseDto {

	public static WHtReceiveNoPlanInspDto chaseWHtReceiveNoPlanInspDto() {
		return chaseWHtReceiveNoPlanInspDto(new WHtReceiveNoPlanInspDto());
	}

	public static WHtReceiveNoPlanInspDto chaseWHtReceiveNoPlanInspDto(WHtReceiveNoPlanInspDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMCustomerByDepositId() == null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}
		if (dto.getMCustomerBySupplierId() == null) {
			dto.setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}

		return dto;
	}

	public static class ReceiveNoPlanInspectionData implements Serializable {

		/** 予定無し入荷ワーク */
		public WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspDto = chaseWHtReceiveNoPlanInspDto();

		/** 予定無し入荷ワーク一覧 */
		public List<WHtReceiveNoPlanInspDto> lstWHtReceiveNoPlanInspDto = new ArrayList<WHtReceiveNoPlanInspDto>();

		/** 入荷予定データ */
		public TReceivePlanHDto tReceivePlanHDto = new TReceivePlanHDto();

		/** 預託データ */
		public List<MCustomerDto> lstMCustomerByDepositDto = new ArrayList<MCustomerDto>();

		/** 処理区分データ */
		public List<MProcessTypeDto> lstMProcessTypeDto = new ArrayList<MProcessTypeDto>();

		/** 在庫区分データ */
		public List<MStockTypeDto> lstMStockTypeDto = new ArrayList<MStockTypeDto>();

		/** 仕入先データ */
		public List<MCustomerDto> lstMCustomerBySupplierDto = new ArrayList<MCustomerDto>();

	}

	public ReceiveNoPlanInspectionData data = new ReceiveNoPlanInspectionData();

	/** MACアドレス */
	public String macAddress;

	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
	/** パラメータマスタ */
	public MParamDto mParamDto;
	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

	/** ラベル区分 */
	/**1:入庫ラベル使用；2:汎用ラベル使用 */
	public String labelKbn;

	/**  預託区分 */
	public String deposit;

	/**  処理区分 */
	public String processType;

	/**  在庫区分 */
	public String stockType;

	/**  仕入先 */
	public String supplier;

	/**  JAN/商品CD */
	public String janProdCd;

	/**  期限日 */
	public String limitDt;

	/** ケース数 */
	public String caseQty;

	/** バラ数 */
	public String spgQtyOns;

	/** 検品数 */
	public BigDecimal storeNum;

	/** 検品合計数 */
	public BigDecimal storeNumSum;

	public String storeLabelNo;

	// [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End

	/**
	 * @return wHtReceiveNoPlanInspecDto
	 */
	public WHtReceiveNoPlanInspDto getwHtReceiveNoPlanInspDto() {
		return data.wHtReceiveNoPlanInspDto;
	}

	/**
	 * @param wHtReceiveNoPlanInspecDto セットする wHtReceiveNoPlanInspecDto
	 */
	public void setWHtReceiveNoPlanInspDto(WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto) {
		data.wHtReceiveNoPlanInspDto = wHtReceiveNoPlanInspecDto;
	}

	/**
	 * @return lstWHtReceiveNoPlanInspDto
	 */
	public List<WHtReceiveNoPlanInspDto> getLstWHtReceiveNoPlanInspDto() {
		return data.lstWHtReceiveNoPlanInspDto;
	}

	/**
	 * @param lstWHtReceiveNoPlanInspDto セットする lstWHtReceiveNoPlanInspDto
	 */
	public void setLstWHtReceiveNoPlanInspDto(List<WHtReceiveNoPlanInspDto> lstWHtReceiveNoPlanInspDto) {
		data.lstWHtReceiveNoPlanInspDto = lstWHtReceiveNoPlanInspDto;
	}

	/**
	 * @return tReceivePlanHDto
	 */
	public TReceivePlanHDto getTReceivePlanHDto() {
		return data.tReceivePlanHDto;
	}

	/**
	 * @param tReceivePlanHDto セットする tReceivePlanHDto
	 */
	public void setTReceivePlanHDto(TReceivePlanHDto tReceivePlanHDto) {
		this.data.tReceivePlanHDto = tReceivePlanHDto;
	}

	/**
	 * @return lstMCustomerByDepositDto
	 */
	public List<MCustomerDto> getLstMCustomerByDepositDto() {
		return data.lstMCustomerByDepositDto;
	}

	/**
	 * @param lstMCustomerByDepositDto セットする lstMCustomerByDepositDto
	 */
	public void setMCustomerByDepositDto(List<MCustomerDto> lstMCustomerByDepositDto) {
		this.data.lstMCustomerByDepositDto = lstMCustomerByDepositDto;
	}

	/**
	 * @return lstMProcessTypeDto
	 */
	public List<MProcessTypeDto> getLstMProcessTypeDto() {
		return data.lstMProcessTypeDto;
	}

	/**
	 * @param lstMProcessTypeDto セットする lstMProcessTypeDto
	 */
	public void setMProcessTypeDto(List<MProcessTypeDto> lstMProcessTypeDto) {
		this.data.lstMProcessTypeDto = lstMProcessTypeDto;
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

	/**
	 * @return lstMCustomerBySupplierDto
	 */
	public List<MCustomerDto> getLstMCustomerBySupplierDto() {
		return data.lstMCustomerBySupplierDto;
	}

	/**
	 * @param lstMCustomerBySupplierDto セットする lstMCustomerBySupplierDto
	 */
	public void setMCustomerBySupplierDto(List<MCustomerDto> lstMCustomerBySupplierDto) {
		this.data.lstMCustomerBySupplierDto = lstMCustomerBySupplierDto;
	}

	/**
	 * @return macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress セットする macAddress
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
	/**
	 * @return mParamDto
	 */
	public MParamDto getMParamDto() {
		return mParamDto;
	}

	/**
	 * @param mParamDto セットする mParamDto
	 */
	public void setMParamDto(MParamDto mParamDto) {
		this.mParamDto = mParamDto;
	}
	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]

	/**
	 * @return labelKbn
	 */
	public String getLabelKbn() {
		return labelKbn;
	}

	/**
	 * @param labelKbn セットする labelKbn
	 */
	public void setLabelKbn(String labelKbn) {
		this.labelKbn = labelKbn;
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
	 * @return processType
	 */
	public String getProcessType() {
		return processType;
	}

	/**
	 * @param processType セットする processType
	 */
	public void setProcessType(String processType) {
		this.processType = processType;
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

	/**
	 * @return supplier
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier セットする supplier
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

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
	 * @return caseQty
	 */
	public String getCaseQty() {
		return caseQty;
	}

	/**
	 * @param caseQty セットする caseQty
	 */
	public void setCaseQty(String caseQty) {
		this.caseQty = caseQty;
	}

	/**
	 * @return spgQtyOns
	 */
	public String getSpgQtyOns() {
		return spgQtyOns;
	}

	/**
	 * @param spgQtyOns セットする spgQtyOns
	 */
	public void setSpgQtyOns(String spgQtyOns) {
		this.spgQtyOns = spgQtyOns;
	}

	/**
	 * @return storeNum
	 */
	public BigDecimal getStoreNum() {
		return storeNum;
	}

	/**
	 * @param storeNum セットする storeNum
	 */
	public void setStoreNum(BigDecimal storeNum) {
		this.storeNum = storeNum;
	}

	/**
	 * @return storeNumSum
	 */
	public BigDecimal getStoreNumSum() {
		return storeNumSum;
	}

	/**
	 * @param storeNumSum セットする storeNumSum
	 */
	public void setStoreNumSum(BigDecimal storeNumSum) {
		this.storeNumSum = storeNumSum;
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

	// [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start
	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty セットする caseQty
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}
	// [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End
}
