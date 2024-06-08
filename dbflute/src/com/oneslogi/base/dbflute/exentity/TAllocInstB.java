package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTAllocInstB;

/**
 * The entity of T_ALLOC_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstB extends BsTAllocInstB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public TAllocInstH chaseTAllocInstH() {
		return _tAllocInstH != null ? _tAllocInstH : new TAllocInstH();
	}

	// ======================================================

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** SPG_QTY_ONS: {BIGINT(19)} */
    protected BigDecimal _spgQtyOns;

    /** SPG_QTY_REMAIN: {BIGINT(19)} */
    protected BigDecimal _spgQtyRemain;

    /** SHIPPING_PACKING_NO: {BIGINT(19)} */
    protected Long _shippingPackingNo;

    /** BOX_ID: {IX, BIGINT(19), FK to m_box} */
    protected Long _boxId;

    /** NET_WEIGHT: {Long} */
    protected BigDecimal _netWeight;

    /** GROSS_WEIGHT: {Long} */
    protected BigDecimal _grossWeight;

    /** SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_alloc_inst_h.SUPPLY_CUSTOMER_CD} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} */
    protected String _carrierCd;

	// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana Start
	/** 運送業者名称 */
	protected String _carrierNm;
	// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana End

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_CD: {VARCHAR(30), refers to m_product.PRODUCT_CD} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    protected String _productAbbr;

    // [Ver3.0] unit of measure対応 2017.11.20 ライ Start
    /**入数内訳 */
    protected String _unitNumBreakdownP;

	/** 商品単位 */
    protected String _productUnit;
    // [Ver3.0] unit of measure対応 2017.11.20 ライ END

    /** PICKING_WORK_NO: {VARCHAR(30)} */
    protected String _pickingWorkNo;

	/**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br />
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br />
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.addPropertyName("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br />
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br />
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.addPropertyName("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SPG_QTY_ONS: {BIGINT(19)} <br />
     * 検品済数
     * @return The value of the column 'SPG_QTY_ONS'. (NullAllowed even if selected: for no constraint)
     */
    public BigDecimal getSpgQtyOns() {
        return _spgQtyOns;
    }

    /**
     * [set] SPG_QTY_ONS: {BIGINT(19)} <br />
     * 検品済数
     * @param spgQtyOns The value of the column 'SPG_QTY_ONS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpgQtyOns(BigDecimal spgQtyOns) {
        __modifiedProperties.addPropertyName("spgQtyOns");
        this._spgQtyOns = spgQtyOns;
    }

    /**
     * [get] SPG_QTY_REMAIN: {BIGINT(19)} <br />
     * 検品残数
     * @return The value of the column 'SPG_QTY_REMAIN'. (NullAllowed even if selected: for no constraint)
     */
    public BigDecimal getSpgQtyRemain() {
        return _spgQtyRemain;
    }

    /**
     * [set] SPG_QTY_REMAIN: {BIGINT(19)} <br />
     * 検品残数
     * @param spgQtyRemain The value of the column 'SPG_QTY_REMAIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpgQtyRemain(BigDecimal spgQtyRemain) {
        __modifiedProperties.addPropertyName("spgQtyRemain");
        this._spgQtyRemain = spgQtyRemain;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {BIGINT(19)} <br />
     * 個口番号
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {BIGINT(19)} <br />
     * 個口番号
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(Long shippingPackingNo) {
        __modifiedProperties.addPropertyName("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] BOX_ID: {IX, BIGINT(19), FK to m_box} <br />
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, BIGINT(19), FK to m_box} <br />
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.addPropertyName("boxId");
        this._boxId = boxId;
    }

    /**
     * [get] NET_WEIGHT: {Long} <br />
     * 単重量(グロス)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public BigDecimal getNetWeight() {
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {Long} <br />
     * 単重量(グロス)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetWeight(BigDecimal netWeight) {
        __modifiedProperties.addPropertyName("netWeight");
        this._netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {Long} <br />
     * 総重量(グロス)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {Long} <br />
     * 総重量(グロス)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        __modifiedProperties.addPropertyName("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_alloc_inst_h.SUPPLY_CUSTOMER_CD} <br />
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_alloc_inst_h.SUPPLY_CUSTOMER_CD} <br />
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.addPropertyName("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br />
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br />
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.addPropertyName("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br />
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br />
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.addPropertyName("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60)} <br />
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60)} <br />
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.addPropertyName("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br />
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br />
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.addPropertyName("carrierCd");
        this._carrierCd = carrierCd;
    }

    public String getCarrierNm() {
		return _carrierNm;
	}

	public void setCarrierNm(String _carrierNm) {
		this._carrierNm = _carrierNm;
	}

	/**
     * [get] JAN_CD: {VARCHAR(30)} <br />
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br />
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.addPropertyName("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30), refers to m_product.PRODUCT_CD} <br />
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30), refers to m_product.PRODUCT_CD} <br />
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.addPropertyName("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60)} <br />
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60)} <br />
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.addPropertyName("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {VARCHAR(60)} <br />
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {VARCHAR(60)} <br />
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.addPropertyName("productAbbr");
        this._productAbbr = productAbbr;
    }
    // [Ver3.0] unit of measure対応 2017.11.20 ライ Start

    public String getProductUnit() {
        return _productUnit;
    }

    public void setProductUnit(String productUnit) {
        __modifiedProperties.addPropertyName("productUnit");
        this._productUnit = productUnit;
    }
    public String getUnitNumBreakdownP() {
		return _unitNumBreakdownP;
	}

	public void setUnitNumBreakdownP(String _unitNumBreakdownP) {
		this._unitNumBreakdownP = _unitNumBreakdownP;
	}

	  // [Ver3.0] unit of measure対応 2017.11.20 ライ END

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30)} <br />
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30)} <br />
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.addPropertyName("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /** shpCheckDisplay */
    protected Long _shpCheckDisplay;
    public Long getShpCheckDisplay() {
        return _shpCheckDisplay;
    }
    public void setShpCheckDisplay(Long shpCheckDisplay) {
        __modifiedProperties.addPropertyName("shpCheckDisplay");
        this._shpCheckDisplay = shpCheckDisplay;
    }

}
