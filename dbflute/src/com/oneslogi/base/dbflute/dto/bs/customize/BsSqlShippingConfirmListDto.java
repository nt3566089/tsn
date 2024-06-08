package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingConfirmList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ALLOC_INST_H_ID, PICKING_H_ID, UPD_DT, PICKING, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, EMERGENCY_FLG, STOCK_OUT_FLG, WORK_DT, SHIPPING_DT, SHIPPING_H_UPD_DT, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, PICKING_BATCH_NO, PICKING_WORK_NO, PICKING_STATUS, PICKING_STATUS_NM, BOL_NO, SHIPPING_SLIP_NO, SHIPPING_H_COUNT, INST_NUM, ALLOC_NUM, PACKING_H_ID, GROSS_WEIGHT, TOTAL_VOLUME, INVOICE_CREATE_FLG, INVOICE_CREATE_FLG_NM, FORCE_FIXED_FLG, FORCE_FIXED_FLG_NM, SHIPPING_STOP_FLG, SHIPPING_STOP_FLG_NM, STOP_FLG, STOP_FLG_NM, CENTER_TRANSIT_FLG
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
public abstract class BsSqlShippingConfirmListDto implements Serializable {

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
    /** ALLOC_INST_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _allocInstHId;

    /** PICKING_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingHId;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** PICKING: {int(10)} */
    @JsonKey
    protected Long _picking;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

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

    /** EMERGENCY_FLG: {char(1)} */
    @JsonKey
    protected String _emergencyFlg;

    /** STOCK_OUT_FLG: {char(1)} */
    @JsonKey
    protected String _stockOutFlg;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingDt;

    /** SHIPPING_H_UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _shippingHUpdDt;

    /** PICKING_TIME: {varchar(60)} */
    @JsonKey
    protected String _pickingTime;

    /** STOWAGE_TIME: {varchar(60)} */
    @JsonKey
    protected String _stowageTime;

    /** SHIPPING_TIME: {varchar(60)} */
    @JsonKey
    protected String _shippingTime;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** PICKING_BATCH_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** PICKING_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** PICKING_STATUS: {varchar(30), classification=ShippingStatus} */
    @JsonKey
    protected String _pickingStatus;

    /** PICKING_STATUS_NM: {int(10)} */
    @JsonKey
    protected String _pickingStatusNm;

    /** BOL_NO: {varchar(30)} */
    @JsonKey
    protected String _bolNo;

    /** SHIPPING_SLIP_NO: {int(10)} */
    @JsonKey
    protected Long _shippingSlipNo;

    /** SHIPPING_H_COUNT: {int(10)} */
    @JsonKey
    protected Long _shippingHCount;

    /** INST_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** PACKING_H_ID: {int(10)} */
    @JsonKey
    protected Long _packingHId;

    /** GROSS_WEIGHT: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

    /** TOTAL_VOLUME: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _totalVolume;

    /** INVOICE_CREATE_FLG: {varchar(1)} */
    @JsonKey
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_FLG_NM: {int(10)} */
    @JsonKey
    protected String _invoiceCreateFlgNm;

    /** FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} */
    @JsonKey
    protected String _forceFixedFlg;

    /** FORCE_FIXED_FLG_NM: {int(10)} */
    @JsonKey
    protected String _forceFixedFlgNm;

    /** SHIPPING_STOP_FLG: {char(1)} */
    @JsonKey
    protected String _shippingStopFlg;

    /** SHIPPING_STOP_FLG_NM: {int(10)} */
    @JsonKey
    protected String _shippingStopFlgNm;

    /** STOP_FLG: {char(1)} */
    @JsonKey
    protected String _stopFlg;

    /** STOP_FLG_NM: {int(10)} */
    @JsonKey
    protected String _stopFlgNm;

    /** CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} */
    @JsonKey
    protected String _centerTransitFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShippingConfirmListDto() {
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
        if (other == null || !(other instanceof BsSqlShippingConfirmListDto)) { return false; }
        final BsSqlShippingConfirmListDto otherEntity = (BsSqlShippingConfirmListDto)other;
        if (!helpComparingValue(getAllocInstHId(), otherEntity.getAllocInstHId())) { return false; }
        if (!helpComparingValue(getPickingHId(), otherEntity.getPickingHId())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getPicking(), otherEntity.getPicking())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getStockOutFlg(), otherEntity.getStockOutFlg())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getShippingHUpdDt(), otherEntity.getShippingHUpdDt())) { return false; }
        if (!helpComparingValue(getPickingTime(), otherEntity.getPickingTime())) { return false; }
        if (!helpComparingValue(getStowageTime(), otherEntity.getStowageTime())) { return false; }
        if (!helpComparingValue(getShippingTime(), otherEntity.getShippingTime())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getCarrierCd(), otherEntity.getCarrierCd())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivCustomerCd(), otherEntity.getDelivCustomerCd())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getPickingBatchNo(), otherEntity.getPickingBatchNo())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getPickingStatus(), otherEntity.getPickingStatus())) { return false; }
        if (!helpComparingValue(getPickingStatusNm(), otherEntity.getPickingStatusNm())) { return false; }
        if (!helpComparingValue(getBolNo(), otherEntity.getBolNo())) { return false; }
        if (!helpComparingValue(getShippingSlipNo(), otherEntity.getShippingSlipNo())) { return false; }
        if (!helpComparingValue(getShippingHCount(), otherEntity.getShippingHCount())) { return false; }
        if (!helpComparingValue(getInstNum(), otherEntity.getInstNum())) { return false; }
        if (!helpComparingValue(getAllocNum(), otherEntity.getAllocNum())) { return false; }
        if (!helpComparingValue(getPackingHId(), otherEntity.getPackingHId())) { return false; }
        if (!helpComparingValue(getGrossWeight(), otherEntity.getGrossWeight())) { return false; }
        if (!helpComparingValue(getTotalVolume(), otherEntity.getTotalVolume())) { return false; }
        if (!helpComparingValue(getInvoiceCreateFlg(), otherEntity.getInvoiceCreateFlg())) { return false; }
        if (!helpComparingValue(getInvoiceCreateFlgNm(), otherEntity.getInvoiceCreateFlgNm())) { return false; }
        if (!helpComparingValue(getForceFixedFlg(), otherEntity.getForceFixedFlg())) { return false; }
        if (!helpComparingValue(getForceFixedFlgNm(), otherEntity.getForceFixedFlgNm())) { return false; }
        if (!helpComparingValue(getShippingStopFlg(), otherEntity.getShippingStopFlg())) { return false; }
        if (!helpComparingValue(getShippingStopFlgNm(), otherEntity.getShippingStopFlgNm())) { return false; }
        if (!helpComparingValue(getStopFlg(), otherEntity.getStopFlg())) { return false; }
        if (!helpComparingValue(getStopFlgNm(), otherEntity.getStopFlgNm())) { return false; }
        if (!helpComparingValue(getCenterTransitFlg(), otherEntity.getCenterTransitFlg())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShippingConfirmList");
        result = xCH(result, getAllocInstHId());
        result = xCH(result, getPickingHId());
        result = xCH(result, getUpdDt());
        result = xCH(result, getPicking());
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getStockOutFlg());
        result = xCH(result, getWorkDt());
        result = xCH(result, getShippingDt());
        result = xCH(result, getShippingHUpdDt());
        result = xCH(result, getPickingTime());
        result = xCH(result, getStowageTime());
        result = xCH(result, getShippingTime());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getCarrierCd());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getDelivCustomerCd());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getPickingBatchNo());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getPickingStatus());
        result = xCH(result, getPickingStatusNm());
        result = xCH(result, getBolNo());
        result = xCH(result, getShippingSlipNo());
        result = xCH(result, getShippingHCount());
        result = xCH(result, getInstNum());
        result = xCH(result, getAllocNum());
        result = xCH(result, getPackingHId());
        result = xCH(result, getGrossWeight());
        result = xCH(result, getTotalVolume());
        result = xCH(result, getInvoiceCreateFlg());
        result = xCH(result, getInvoiceCreateFlgNm());
        result = xCH(result, getForceFixedFlg());
        result = xCH(result, getForceFixedFlgNm());
        result = xCH(result, getShippingStopFlg());
        result = xCH(result, getShippingStopFlgNm());
        result = xCH(result, getStopFlg());
        result = xCH(result, getStopFlgNm());
        result = xCH(result, getCenterTransitFlg());
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
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getPicking());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getStockOutFlg());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getShippingHUpdDt());
        sb.append(c).append(getPickingTime());
        sb.append(c).append(getStowageTime());
        sb.append(c).append(getShippingTime());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getDelivCustomerCd());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getPickingStatus());
        sb.append(c).append(getPickingStatusNm());
        sb.append(c).append(getBolNo());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getShippingHCount());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getTotalVolume());
        sb.append(c).append(getInvoiceCreateFlg());
        sb.append(c).append(getInvoiceCreateFlgNm());
        sb.append(c).append(getForceFixedFlg());
        sb.append(c).append(getForceFixedFlgNm());
        sb.append(c).append(getShippingStopFlg());
        sb.append(c).append(getShippingStopFlgNm());
        sb.append(c).append(getStopFlg());
        sb.append(c).append(getStopFlgNm());
        sb.append(c).append(getCenterTransitFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
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
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] PICKING: {int(10)} <br>
     * @return The value of the column 'PICKING'. (NullAllowed)
     */
    public Long getPicking() {
        return _picking;
    }

    /**
     * [set] PICKING: {int(10)} <br>
     * @param picking The value of the column 'PICKING'. (NullAllowed)
     */
    public void setPicking(Long picking) {
        __modifiedProperties.add("picking");
        this._picking = picking;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

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
     * [get] EMERGENCY_FLG: {char(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {char(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] STOCK_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public String getStockOutFlg() {
        return _stockOutFlg;
    }

    /**
     * [set] STOCK_OUT_FLG: {char(1)} <br>
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public void setStockOutFlg(String stockOutFlg) {
        __modifiedProperties.add("stockOutFlg");
        this._stockOutFlg = stockOutFlg;
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
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] SHIPPING_H_UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'SHIPPING_H_UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getShippingHUpdDt() {
        return _shippingHUpdDt;
    }

    /**
     * [set] SHIPPING_H_UPD_DT: {datetime2(26, 6)} <br>
     * @param shippingHUpdDt The value of the column 'SHIPPING_H_UPD_DT'. (NullAllowed)
     */
    public void setShippingHUpdDt(java.sql.Timestamp shippingHUpdDt) {
        __modifiedProperties.add("shippingHUpdDt");
        this._shippingHUpdDt = shippingHUpdDt;
    }

    /**
     * [get] PICKING_TIME: {varchar(60)} <br>
     * @return The value of the column 'PICKING_TIME'. (NullAllowed)
     */
    public String getPickingTime() {
        return _pickingTime;
    }

    /**
     * [set] PICKING_TIME: {varchar(60)} <br>
     * @param pickingTime The value of the column 'PICKING_TIME'. (NullAllowed)
     */
    public void setPickingTime(String pickingTime) {
        __modifiedProperties.add("pickingTime");
        this._pickingTime = pickingTime;
    }

    /**
     * [get] STOWAGE_TIME: {varchar(60)} <br>
     * @return The value of the column 'STOWAGE_TIME'. (NullAllowed)
     */
    public String getStowageTime() {
        return _stowageTime;
    }

    /**
     * [set] STOWAGE_TIME: {varchar(60)} <br>
     * @param stowageTime The value of the column 'STOWAGE_TIME'. (NullAllowed)
     */
    public void setStowageTime(String stowageTime) {
        __modifiedProperties.add("stowageTime");
        this._stowageTime = stowageTime;
    }

    /**
     * [get] SHIPPING_TIME: {varchar(60)} <br>
     * @return The value of the column 'SHIPPING_TIME'. (NullAllowed)
     */
    public String getShippingTime() {
        return _shippingTime;
    }

    /**
     * [set] SHIPPING_TIME: {varchar(60)} <br>
     * @param shippingTime The value of the column 'SHIPPING_TIME'. (NullAllowed)
     */
    public void setShippingTime(String shippingTime) {
        __modifiedProperties.add("shippingTime");
        this._shippingTime = shippingTime;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
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
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        __modifiedProperties.add("delivCustomerCd");
        this._delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] PICKING_BATCH_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public String getPickingBatchNo() {
        return _pickingBatchNo;
    }

    /**
     * [set] PICKING_BATCH_NO: {varchar(30)} <br>
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        __modifiedProperties.add("pickingBatchNo");
        this._pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] PICKING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @return The value of the column 'PICKING_STATUS'. (NullAllowed)
     */
    public String getPickingStatus() {
        return _pickingStatus;
    }

    /**
     * [set] PICKING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @param pickingStatus The value of the column 'PICKING_STATUS'. (NullAllowed)
     */
    public void setPickingStatus(String pickingStatus) {
        __modifiedProperties.add("pickingStatus");
        this._pickingStatus = pickingStatus;
    }

    /**
     * [get] PICKING_STATUS_NM: {int(10)} <br>
     * @return The value of the column 'PICKING_STATUS_NM'. (NullAllowed)
     */
    public String getPickingStatusNm() {
        return _pickingStatusNm;
    }

    /**
     * [set] PICKING_STATUS_NM: {int(10)} <br>
     * @param pickingStatusNm The value of the column 'PICKING_STATUS_NM'. (NullAllowed)
     */
    public void setPickingStatusNm(String pickingStatusNm) {
        __modifiedProperties.add("pickingStatusNm");
        this._pickingStatusNm = pickingStatusNm;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * @return The value of the column 'BOL_NO'. (NullAllowed)
     */
    public String getBolNo() {
        return _bolNo;
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed)
     */
    public void setBolNo(String bolNo) {
        __modifiedProperties.add("bolNo");
        this._bolNo = bolNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public Long getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {int(10)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(Long shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_H_COUNT: {int(10)} <br>
     * @return The value of the column 'SHIPPING_H_COUNT'. (NullAllowed)
     */
    public Long getShippingHCount() {
        return _shippingHCount;
    }

    /**
     * [set] SHIPPING_H_COUNT: {int(10)} <br>
     * @param shippingHCount The value of the column 'SHIPPING_H_COUNT'. (NullAllowed)
     */
    public void setShippingHCount(Long shippingHCount) {
        __modifiedProperties.add("shippingHCount");
        this._shippingHCount = shippingHCount;
    }

    /**
     * [get] INST_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(38, 6)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] ALLOC_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(38, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

    /**
     * [get] PACKING_H_ID: {int(10)} <br>
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {int(10)} <br>
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] TOTAL_VOLUME: {decimal(38, 6)} <br>
     * @return The value of the column 'TOTAL_VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalVolume() {
        return _totalVolume;
    }

    /**
     * [set] TOTAL_VOLUME: {decimal(38, 6)} <br>
     * @param totalVolume The value of the column 'TOTAL_VOLUME'. (NullAllowed)
     */
    public void setTotalVolume(java.math.BigDecimal totalVolume) {
        __modifiedProperties.add("totalVolume");
        this._totalVolume = totalVolume;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {varchar(1)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public String getInvoiceCreateFlg() {
        return _invoiceCreateFlg;
    }

    /**
     * [set] INVOICE_CREATE_FLG: {varchar(1)} <br>
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        __modifiedProperties.add("invoiceCreateFlg");
        this._invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_FLG_NM: {int(10)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG_NM'. (NullAllowed)
     */
    public String getInvoiceCreateFlgNm() {
        return _invoiceCreateFlgNm;
    }

    /**
     * [set] INVOICE_CREATE_FLG_NM: {int(10)} <br>
     * @param invoiceCreateFlgNm The value of the column 'INVOICE_CREATE_FLG_NM'. (NullAllowed)
     */
    public void setInvoiceCreateFlgNm(String invoiceCreateFlgNm) {
        __modifiedProperties.add("invoiceCreateFlgNm");
        this._invoiceCreateFlgNm = invoiceCreateFlgNm;
    }

    /**
     * [get] FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} <br>
     * // cls(ForceFixedFlg) 強制確定フラグ
     * @return The value of the column 'FORCE_FIXED_FLG'. (NullAllowed)
     */
    public String getForceFixedFlg() {
        return _forceFixedFlg;
    }

    /**
     * [set] FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} <br>
     * // cls(ForceFixedFlg) 強制確定フラグ
     * @param forceFixedFlg The value of the column 'FORCE_FIXED_FLG'. (NullAllowed)
     */
    public void setForceFixedFlg(String forceFixedFlg) {
        __modifiedProperties.add("forceFixedFlg");
        this._forceFixedFlg = forceFixedFlg;
    }

    /**
     * [get] FORCE_FIXED_FLG_NM: {int(10)} <br>
     * @return The value of the column 'FORCE_FIXED_FLG_NM'. (NullAllowed)
     */
    public String getForceFixedFlgNm() {
        return _forceFixedFlgNm;
    }

    /**
     * [set] FORCE_FIXED_FLG_NM: {int(10)} <br>
     * @param forceFixedFlgNm The value of the column 'FORCE_FIXED_FLG_NM'. (NullAllowed)
     */
    public void setForceFixedFlgNm(String forceFixedFlgNm) {
        __modifiedProperties.add("forceFixedFlgNm");
        this._forceFixedFlgNm = forceFixedFlgNm;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {char(1)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {char(1)} <br>
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG_NM'. (NullAllowed)
     */
    public String getShippingStopFlgNm() {
        return _shippingStopFlgNm;
    }

    /**
     * [set] SHIPPING_STOP_FLG_NM: {int(10)} <br>
     * @param shippingStopFlgNm The value of the column 'SHIPPING_STOP_FLG_NM'. (NullAllowed)
     */
    public void setShippingStopFlgNm(String shippingStopFlgNm) {
        __modifiedProperties.add("shippingStopFlgNm");
        this._shippingStopFlgNm = shippingStopFlgNm;
    }

    /**
     * [get] STOP_FLG: {char(1)} <br>
     * @return The value of the column 'STOP_FLG'. (NullAllowed)
     */
    public String getStopFlg() {
        return _stopFlg;
    }

    /**
     * [set] STOP_FLG: {char(1)} <br>
     * @param stopFlg The value of the column 'STOP_FLG'. (NullAllowed)
     */
    public void setStopFlg(String stopFlg) {
        __modifiedProperties.add("stopFlg");
        this._stopFlg = stopFlg;
    }

    /**
     * [get] STOP_FLG_NM: {int(10)} <br>
     * @return The value of the column 'STOP_FLG_NM'. (NullAllowed)
     */
    public String getStopFlgNm() {
        return _stopFlgNm;
    }

    /**
     * [set] STOP_FLG_NM: {int(10)} <br>
     * @param stopFlgNm The value of the column 'STOP_FLG_NM'. (NullAllowed)
     */
    public void setStopFlgNm(String stopFlgNm) {
        __modifiedProperties.add("stopFlgNm");
        this._stopFlgNm = stopFlgNm;
    }

    /**
     * [get] CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} <br>
     * // cls(CenterTransitFlg) センタ間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public String getCenterTransitFlg() {
        return _centerTransitFlg;
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} <br>
     * // cls(CenterTransitFlg) センタ間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        __modifiedProperties.add("centerTransitFlg");
        this._centerTransitFlg = centerTransitFlg;
    }

}
