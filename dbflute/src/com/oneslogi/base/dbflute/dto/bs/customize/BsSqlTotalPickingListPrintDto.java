package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTotalPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WAREHOUSE_CD, WAREHOUSE_NM, WORK_DT, PICKING_GROUP_NO, STOCK_TYPE_CD, STOCK_TYPE_NM, PICKING_ORDER, ZONE_CD, ZONE_NM, PRODUCT_CD, PRODUCT_ID, PICKING_H_ID, PRODUCT_NM, JANCD, SUM_PICKING_NUM, STORE_LABEL_NO, STORE_DT, LOT, LIMT_DT, TEMP_NO, CHARGE_NUM, LOCATION_CD, LOCATION_NM, TPL_OUT_FLG
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
public abstract class BsSqlTotalPickingListPrintDto implements Serializable {

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

    /** WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {varchar(60)} */
    @JsonKey
    protected String _warehouseNm;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** PICKING_GROUP_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** STOCK_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _stockTypeNm;

    /** PICKING_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _pickingOrder;

    /** ZONE_CD: {varchar(30)} */
    @JsonKey
    protected String _zoneCd;

    /** ZONE_NM: {varchar(60)} */
    @JsonKey
    protected String _zoneNm;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** PICKING_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingHId;

    /** PRODUCT_NM: {varchar(60)} */
    @JsonKey
    protected String _productNm;

    /** JANCD: {varchar(30)} */
    @JsonKey
    protected String _jancd;

    /** SUM_PICKING_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumPickingNum;

    /** STORE_LABEL_NO: {varchar(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** LOT: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** LIMT_DT: {varchar(8)} */
    @JsonKey
    protected String _limtDt;

    /** TEMP_NO: {varchar(30)} */
    @JsonKey
    protected String _tempNo;

    /** CHARGE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _locationNm;

    /** TPL_OUT_FLG: {char(1)} */
    @JsonKey
    protected String _tplOutFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTotalPickingListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlTotalPickingListPrintDto)) { return false; }
        final BsSqlTotalPickingListPrintDto otherEntity = (BsSqlTotalPickingListPrintDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTotalPickingListPrint");
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
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getStockTypeNm());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getZoneNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getJancd());
        sb.append(c).append(getSumPickingNum());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimtDt());
        sb.append(c).append(getTempNo());
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getTplOutFlg());
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
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
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
     * [get] PICKING_ORDER: {bigint(19)} <br>
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public Long getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {bigint(19)} <br>
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(Long pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] ZONE_CD: {varchar(30)} <br>
     * @return The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] ZONE_CD: {varchar(30)} <br>
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] ZONE_NM: {varchar(60)} <br>
     * @return The value of the column 'ZONE_NM'. (NullAllowed)
     */
    public String getZoneNm() {
        return _zoneNm;
    }

    /**
     * [set] ZONE_NM: {varchar(60)} <br>
     * @param zoneNm The value of the column 'ZONE_NM'. (NullAllowed)
     */
    public void setZoneNm(String zoneNm) {
        __modifiedProperties.add("zoneNm");
        this._zoneNm = zoneNm;
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
     * [get] LIMT_DT: {varchar(8)} <br>
     * @return The value of the column 'LIMT_DT'. (NullAllowed)
     */
    public String getLimtDt() {
        return _limtDt;
    }

    /**
     * [set] LIMT_DT: {varchar(8)} <br>
     * @param limtDt The value of the column 'LIMT_DT'. (NullAllowed)
     */
    public void setLimtDt(String limtDt) {
        __modifiedProperties.add("limtDt");
        this._limtDt = limtDt;
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
     * [get] CHARGE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
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
     * [get] TPL_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'TPL_OUT_FLG'. (NullAllowed)
     */
    public String getTplOutFlg() {
        return _tplOutFlg;
    }

    /**
     * [set] TPL_OUT_FLG: {char(1)} <br>
     * @param tplOutFlg The value of the column 'TPL_OUT_FLG'. (NullAllowed)
     */
    public void setTplOutFlg(String tplOutFlg) {
        __modifiedProperties.add("tplOutFlg");
        this._tplOutFlg = tplOutFlg;
    }

}
