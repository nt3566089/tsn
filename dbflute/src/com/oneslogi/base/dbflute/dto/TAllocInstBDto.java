package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;

import com.oneslogi.base.dbflute.dto.bs.BsTAllocInstBDto;

/**
 * The entity of T_ALLOC_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstBDto extends BsTAllocInstBDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** CLIENT_ID: {BIGINT(20), refers to t_picking_h.CLIENT_ID} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {BIGINT(20), refers to t_picking_h.CENTER_ID} */
    @JsonKey
    protected Long _centerId;

    /** SPG_QTY_ONS: {BIGINT(19)} */
    @JsonKey
    protected BigDecimal _spgQtyOns;

    /** SPG_QTY_REMAIN: {BIGINT(19)} */
    @JsonKey
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
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} */
    @JsonKey
    protected String _carrierCd;

	// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana Start
	/** 運送業者名称 */
	protected String _carrierNm;
	// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana End

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_CD: {VARCHAR(30), refers to m_product.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _productAbbr;
 // [Ver3.0] unit of measure対応 2017.11.20 ライ Start
    /** 商品単位 */
    @JsonKey
    protected String _productUnit;
    /**入数内訳 */
    @JsonKey
    protected String _unitNumBreakdownP;
// [Ver3.0] unit of measure対応 2017.11.20 ライ END
    /** PICKING_WORK_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _pickingWorkNo;

	/**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br />
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br />
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br />
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br />
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SPG_QTY_ONS: {BIGINT(19)} <br />
     * 検品済数
     * @return The value of the column 'SPG_QTY_ONS'. (NullAllowed)
     */
    public BigDecimal getSpgQtyOns() {
        return _spgQtyOns;
    }

    /**
     * [set] SPG_QTY_ONS: {BIGINT(19)} <br />
     * 検品済数
     * @param spgQtyOns The value of the column 'SPG_QTY_ONS'. (NullAllowed)
     */
    public void setSpgQtyOns(BigDecimal spgQtyOns) {
        __modifiedProperties.add("spgQtyOns");
        this._spgQtyOns = spgQtyOns;
    }

    /**
     * [get] SPG_QTY_REMAIN: {BIGINT(19)} <br />
     * 検品残数
     * @return The value of the column 'SPG_QTY_REMAIN'. (NullAllowed)
     */
    public BigDecimal getSpgQtyRemain() {
        return _spgQtyRemain;
    }

    /**
     * [set] SPG_QTY_REMAIN: {BIGINT(19)} <br />
     * 検品残数
     * @param spgQtyRemain The value of the column 'SPG_QTY_REMAIN'. (NullAllowed)
     */
    public void setSpgQtyRemain(BigDecimal spgQtyRemain) {
        __modifiedProperties.add("spgQtyRemain");
        this._spgQtyRemain = spgQtyRemain;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {BIGINT(19)} <br />
     * 個口番号
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public Long getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {BIGINT(19)} <br />
     * 個口番号
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setShippingPackingNo(Long shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] BOX_ID: {IX, BIGINT(19), FK to m_box} <br />
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, BIGINT(19), FK to m_box} <br />
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
    }

    /**
     * [get] NET_WEIGHT: {Long} <br />
     * 単重量(グロス)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public BigDecimal getNetWeight() {
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {Long} <br />
     * 単重量(グロス)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public void setNetWeight(BigDecimal netWeight) {
        __modifiedProperties.add("netWeight");
        this._netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {Long} <br />
     * 総重量(グロス)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {Long} <br />
     * 総重量(グロス)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_alloc_inst_h.SUPPLY_CUSTOMER_CD} <br />
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_alloc_inst_h.SUPPLY_CUSTOMER_CD} <br />
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br />
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br />
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br />
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br />
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60)} <br />
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60)} <br />
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br />
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br />
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
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
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br />
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30), refers to m_product.PRODUCT_CD} <br />
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30), refers to m_product.PRODUCT_CD} <br />
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60)} <br />
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60)} <br />
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {VARCHAR(60)} <br />
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {VARCHAR(60)} <br />
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    // [Ver3.0] unit of measure対応 2017.11.20 ライ Start
    public String getProductUnit() {
        return _productUnit;
    }

    public void setProductUnit(String productUnit) {
        __modifiedProperties.add("productUnit");
        this._productUnit = productUnit;
    }
    public String getUnitNumBreakdownP() {
		return _unitNumBreakdownP;
	}

	public void setUnitNumBreakdownP(String _unitNumBreakdownP) {
		this._unitNumBreakdownP = _unitNumBreakdownP;
	}
	// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30)} <br />
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30)} <br />
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /** shpCheckDisplay */
    @JsonKey
    protected Long _shpCheckDisplay;
    public Long getShpCheckDisplay() {
        return _shpCheckDisplay;
    }
    public void setShpCheckDisplay(Long shpCheckDisplay) {
        __modifiedProperties.add("shpCheckDisplay");
        this._shpCheckDisplay = shpCheckDisplay;
    }
}
