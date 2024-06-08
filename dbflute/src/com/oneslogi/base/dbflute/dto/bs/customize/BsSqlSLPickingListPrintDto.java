package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlSLPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PICKING_GROUP_NO, WORK_DT, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SEEDING_NO, PICKING_H_ID, STOCK_TYPE_CD, STOCK_TYPE_NM, TEMP_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, LOCATION_CD, LOCATION_NM, JANCD, STORE_LABEL_NO, STORE_DT, LIMIT_DT, LOT, SUM_PICKING_NUM, PICKING_WORK_NO1, PICKING_WORK_NO2, SHIPPING_PACKING_NO1, SHIPPING_PACKING_NO2, PACKING_CAL_CLS, SL_OUT_FLG
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSqlSLPickingListPrintDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** PICKING_GROUP_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SEEDING_NO: {varchar(30)} */
    @JsonKey
    protected String _seedingNo;

    /** PICKING_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingHId;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** STOCK_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _stockTypeNm;

    /** TEMP_NO: {varchar(30)} */
    @JsonKey
    protected String _tempNo;

    /** PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(60)} */
    @JsonKey
    protected String _productNm;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _locationNm;

    /** JANCD: {varchar(30)} */
    @JsonKey
    protected String _jancd;

    /** STORE_LABEL_NO: {varchar(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** LIMIT_DT: {varchar(8)} */
    @JsonKey
    protected String _limitDt;

    /** LOT: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** SUM_PICKING_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumPickingNum;

    /** PICKING_WORK_NO1: {varchar(12)} */
    @JsonKey
    protected String _pickingWorkNo1;

    /** PICKING_WORK_NO2: {varchar(10)} */
    @JsonKey
    protected String _pickingWorkNo2;

    /** SHIPPING_PACKING_NO1: {varchar(12)} */
    @JsonKey
    protected String _shippingPackingNo1;

    /** SHIPPING_PACKING_NO2: {varchar(10)} */
    @JsonKey
    protected String _shippingPackingNo2;

    /** PACKING_CAL_CLS: {varchar(30)} */
    @JsonKey
    protected String _packingCalCls;

    /** SL_OUT_FLG: {char(1)} */
    @JsonKey
    protected String _slOutFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlSLPickingListPrintDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlSLPickingListPrintDto)) { return false; }
        final BsSqlSLPickingListPrintDto otherEntity = (BsSqlSLPickingListPrintDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlSLPickingListPrint");
        result = xCH(result, getProductId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getSeedingNo());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getStockTypeNm());
        sb.append(c).append(getTempNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getJancd());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getLot());
        sb.append(c).append(getSumPickingNum());
        sb.append(c).append(getPickingWorkNo1());
        sb.append(c).append(getPickingWorkNo2());
        sb.append(c).append(getShippingPackingNo1());
        sb.append(c).append(getShippingPackingNo2());
        sb.append(c).append(getPackingCalCls());
        sb.append(c).append(getSlOutFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public String getPickingGroupNo() {
        return _pickingGroupNo;
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        __modifiedProperties.add("pickingGroupNo");
        this._pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SEEDING_NO: {varchar(30)} <br>
     * @return The value of the column 'SEEDING_NO'. (NullAllowed)
     */
    public String getSeedingNo() {
        return _seedingNo;
    }

    /**
     * [set] SEEDING_NO: {varchar(30)} <br>
     * @param seedingNo The value of the column 'SEEDING_NO'. (NullAllowed)
     */
    public void setSeedingNo(String seedingNo) {
        __modifiedProperties.add("seedingNo");
        this._seedingNo = seedingNo;
    }

    /**
     * [get] PICKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {bigint(19)} <br>
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] STOCK_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed)
     */
    public String getStockTypeNm() {
        return _stockTypeNm;
    }

    /**
     * [set] STOCK_TYPE_NM: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed)
     */
    public void setStockTypeNm(String stockTypeNm) {
        __modifiedProperties.add("stockTypeNm");
        this._stockTypeNm = stockTypeNm;
    }

    /**
     * [get] TEMP_NO: {varchar(30)} <br>
     * @return The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public String getTempNo() {
        return _tempNo;
    }

    /**
     * [set] TEMP_NO: {varchar(30)} <br>
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public void setTempNo(String tempNo) {
        __modifiedProperties.add("tempNo");
        this._tempNo = tempNo;
    }

    /**
     * [get] PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(60)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] JANCD: {varchar(30)} <br>
     * @return The value of the column 'JANCD'. (NullAllowed)
     */
    public String getJancd() {
        return _jancd;
    }

    /**
     * [set] JANCD: {varchar(30)} <br>
     * @param jancd The value of the column 'JANCD'. (NullAllowed)
     */
    public void setJancd(String jancd) {
        __modifiedProperties.add("jancd");
        this._jancd = jancd;
    }

    /**
     * [get] STORE_LABEL_NO: {varchar(30)} <br>
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {varchar(30)} <br>
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {varchar(8)} <br>
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {varchar(8)} <br>
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'SUM_PICKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getSumPickingNum() {
        return _sumPickingNum;
    }

    /**
     * [set] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @param sumPickingNum The value of the column 'SUM_PICKING_NUM'. (NullAllowed)
     */
    public void setSumPickingNum(java.math.BigDecimal sumPickingNum) {
        __modifiedProperties.add("sumPickingNum");
        this._sumPickingNum = sumPickingNum;
    }

    /**
     * [get] PICKING_WORK_NO1: {varchar(12)} <br>
     * @return The value of the column 'PICKING_WORK_NO1'. (NullAllowed)
     */
    public String getPickingWorkNo1() {
        return _pickingWorkNo1;
    }

    /**
     * [set] PICKING_WORK_NO1: {varchar(12)} <br>
     * @param pickingWorkNo1 The value of the column 'PICKING_WORK_NO1'. (NullAllowed)
     */
    public void setPickingWorkNo1(String pickingWorkNo1) {
        __modifiedProperties.add("pickingWorkNo1");
        this._pickingWorkNo1 = pickingWorkNo1;
    }

    /**
     * [get] PICKING_WORK_NO2: {varchar(10)} <br>
     * @return The value of the column 'PICKING_WORK_NO2'. (NullAllowed)
     */
    public String getPickingWorkNo2() {
        return _pickingWorkNo2;
    }

    /**
     * [set] PICKING_WORK_NO2: {varchar(10)} <br>
     * @param pickingWorkNo2 The value of the column 'PICKING_WORK_NO2'. (NullAllowed)
     */
    public void setPickingWorkNo2(String pickingWorkNo2) {
        __modifiedProperties.add("pickingWorkNo2");
        this._pickingWorkNo2 = pickingWorkNo2;
    }

    /**
     * [get] SHIPPING_PACKING_NO1: {varchar(12)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO1'. (NullAllowed)
     */
    public String getShippingPackingNo1() {
        return _shippingPackingNo1;
    }

    /**
     * [set] SHIPPING_PACKING_NO1: {varchar(12)} <br>
     * @param shippingPackingNo1 The value of the column 'SHIPPING_PACKING_NO1'. (NullAllowed)
     */
    public void setShippingPackingNo1(String shippingPackingNo1) {
        __modifiedProperties.add("shippingPackingNo1");
        this._shippingPackingNo1 = shippingPackingNo1;
    }

    /**
     * [get] SHIPPING_PACKING_NO2: {varchar(10)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO2'. (NullAllowed)
     */
    public String getShippingPackingNo2() {
        return _shippingPackingNo2;
    }

    /**
     * [set] SHIPPING_PACKING_NO2: {varchar(10)} <br>
     * @param shippingPackingNo2 The value of the column 'SHIPPING_PACKING_NO2'. (NullAllowed)
     */
    public void setShippingPackingNo2(String shippingPackingNo2) {
        __modifiedProperties.add("shippingPackingNo2");
        this._shippingPackingNo2 = shippingPackingNo2;
    }

    /**
     * [get] PACKING_CAL_CLS: {varchar(30)} <br>
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public String getPackingCalCls() {
        return _packingCalCls;
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30)} <br>
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public void setPackingCalCls(String packingCalCls) {
        __modifiedProperties.add("packingCalCls");
        this._packingCalCls = packingCalCls;
    }

    /**
     * [get] SL_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed)
     */
    public String getSlOutFlg() {
        return _slOutFlg;
    }

    /**
     * [set] SL_OUT_FLG: {char(1)} <br>
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed)
     */
    public void setSlOutFlg(String slOutFlg) {
        __modifiedProperties.add("slOutFlg");
        this._slOutFlg = slOutFlg;
    }

}
