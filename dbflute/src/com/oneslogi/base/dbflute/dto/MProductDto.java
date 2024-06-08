package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMProductDto;

/**
 * The entity of M_PRODUCT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MProductDto extends BsMProductDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===== 導出カラム =====
    private Long unitNum;

    private Long receiveProductId;

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(受信ID削除) 2016.09.09 honma

    private String chkErrorShow;

    private String errorProcessMet;

    private String lotManagNm;

    private String lotReverseNm;

    private String limitDtManagNm;

    private String limitDtReverseNm;

    private String mergeClsNm;

    private String shippingStopNm;

 // [Ver3.0] unit of measure対応 2017.11.21 潘 Start
    // 在庫管理単位CD
    private String inventoryManagementUnitCd;

    // 在庫管理単位名称
    private String inventoryManagementUnitNm;

    // 入数内訳
    private String unitNumBreakdown;
    private String productUnit;
 // [Ver3.0] unit of measure対応 2017.11.21 潘 End

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(受信ID削除) 2016.09.09 honma

	public Long getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
	}

	public String getLotManagNm() {
		return lotManagNm;
	}

	public void setLotManagNm(String lotManagNm) {
		this.lotManagNm = lotManagNm;
	}

	public String getLotReverseNm() {
		return lotReverseNm;
	}

	public void setLotReverseNm(String lotReverseNm) {
		this.lotReverseNm = lotReverseNm;
	}

	public String getLimitDtManagNm() {
		return limitDtManagNm;
	}

	public void setLimitDtManagNm(String limitDtManagNm) {
		this.limitDtManagNm = limitDtManagNm;
	}

	public String getLimitDtReverseNm() {
		return limitDtReverseNm;
	}

	public void setLimitDtReverseNm(String limitDtReverseNm) {
		this.limitDtReverseNm = limitDtReverseNm;
	}

	public String getShippingStopNm() {
		return shippingStopNm;
	}

	public void setShippingStopNm(String shippingStopNm) {
		this.shippingStopNm = shippingStopNm;
	}

	public String getMergeClsNm() {
		return mergeClsNm;
	}

	public void setMergeClsNm(String mergeClsNm) {
		this.mergeClsNm = mergeClsNm;
	}

	public Long getReceiveProductId() {
		return receiveProductId;
	}

	public void setReceiveProductId(Long receiveProductId) {
		this.receiveProductId = receiveProductId;
	}

    // [Ver3.0] unit of measure対応 2017.11.21 潘 Start
    public String getInventoryManagementUnitCd() {
    	return inventoryManagementUnitCd;
    }

    public void setInventoryManagementUnitCd(String inventoryManagementUnitCd) {
    	this.inventoryManagementUnitCd = inventoryManagementUnitCd;
    }

    public String getInventoryManagementUnitNm() {
    	return inventoryManagementUnitNm;
    }

    public void setInventoryManagementUnitNm(String inventoryManagementUnitNm) {
    	this.inventoryManagementUnitNm = inventoryManagementUnitNm;
    }

    public String getUnitNumBreakdown() {
    	return unitNumBreakdown;
    }

    public void setUnitNumBreakdown(String unitNumBreakdown) {
    	this.unitNumBreakdown = unitNumBreakdown;
    }
    // [Ver3.0] unit of measure対応 2017.11.21 潘 End

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

}
