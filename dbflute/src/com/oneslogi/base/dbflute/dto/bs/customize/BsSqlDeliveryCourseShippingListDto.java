package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlDeliveryCourseShippingList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, EMERGENCY_FLG, ERROR_FLG, CANCEL_FLG, STOCK_OUT_FLG, WORK_DT, SHIPPING_DT, MAX_UPD_DT, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, COUNT_SUPPLY_CUSTOMER_CD, PICKING_BATCH_NO, SHIPPING_STATUS, SHIPPING_STATUS_MAX, SHIPPING_STATUS_NM, SHIPPING_SLIP_NO, NUM, TSIH_NUM, COUNT_PRODUCT_CD, INST_NUM, ALLOC_NUM, COUNT_SHIPPING_PACKING_NO, SUM_GROSS_WEIGHT, PIC_LIST_STATUS1, PIC_LIST_STATUS2, CHK_STATUS, INVOICE_CREATE, PACKING_OUT, LOADING_STATUS, SHIPPING_FIXED
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
public abstract class BsSqlDeliveryCourseShippingListDto implements Serializable {

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

    /** ERROR_FLG: {varchar(1)} */
    @JsonKey
    protected String _errorFlg;

    /** CANCEL_FLG: {varchar(1)} */
    @JsonKey
    protected String _cancelFlg;

    /** STOCK_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _stockOutFlg;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingDt;

    /** MAX_UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _maxUpdDt;

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

    /** COUNT_SUPPLY_CUSTOMER_CD: {int(10)} */
    @JsonKey
    protected Long _countSupplyCustomerCd;

    /** PICKING_BATCH_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} */
    @JsonKey
    protected String _shippingStatus;

    /** SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} */
    @JsonKey
    protected String _shippingStatusMax;

    /** SHIPPING_STATUS_NM: {int(10)} */
    @JsonKey
    protected String _shippingStatusNm;

    /** SHIPPING_SLIP_NO: {int(10)} */
    @JsonKey
    protected Integer _shippingSlipNo;

    /** NUM: {int(10)} */
    @JsonKey
    protected Integer _num;

    /** TSIH_NUM: {int(10)} */
    @JsonKey
    protected Long _tsihNum;

    /** COUNT_PRODUCT_CD: {int(10)} */
    @JsonKey
    protected Integer _countProductCd;

    /** INST_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** COUNT_SHIPPING_PACKING_NO: {int(10)} */
    @JsonKey
    protected Integer _countShippingPackingNo;

    /** SUM_GROSS_WEIGHT: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumGrossWeight;

    /** PIC_LIST_STATUS1: {int(10)} */
    @JsonKey
    protected Integer _picListStatus1;

    /** PIC_LIST_STATUS2: {int(10)} */
    @JsonKey
    protected Integer _picListStatus2;

    /** CHK_STATUS: {int(10)} */
    @JsonKey
    protected Integer _chkStatus;

    /** INVOICE_CREATE: {int(10)} */
    @JsonKey
    protected Integer _invoiceCreate;

    /** PACKING_OUT: {int(10)} */
    @JsonKey
    protected Integer _packingOut;

    /** LOADING_STATUS: {int(10)} */
    @JsonKey
    protected Integer _loadingStatus;

    /** SHIPPING_FIXED: {int(10)} */
    @JsonKey
    protected Integer _shippingFixed;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlDeliveryCourseShippingListDto() {
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
        if (other == null || !(other instanceof BsSqlDeliveryCourseShippingListDto)) { return false; }
        final BsSqlDeliveryCourseShippingListDto otherEntity = (BsSqlDeliveryCourseShippingListDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getCancelFlg(), otherEntity.getCancelFlg())) { return false; }
        if (!helpComparingValue(getStockOutFlg(), otherEntity.getStockOutFlg())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getMaxUpdDt(), otherEntity.getMaxUpdDt())) { return false; }
        if (!helpComparingValue(getPickingTime(), otherEntity.getPickingTime())) { return false; }
        if (!helpComparingValue(getStowageTime(), otherEntity.getStowageTime())) { return false; }
        if (!helpComparingValue(getShippingTime(), otherEntity.getShippingTime())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getCarrierCd(), otherEntity.getCarrierCd())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getCountSupplyCustomerCd(), otherEntity.getCountSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getPickingBatchNo(), otherEntity.getPickingBatchNo())) { return false; }
        if (!helpComparingValue(getShippingStatus(), otherEntity.getShippingStatus())) { return false; }
        if (!helpComparingValue(getShippingStatusMax(), otherEntity.getShippingStatusMax())) { return false; }
        if (!helpComparingValue(getShippingStatusNm(), otherEntity.getShippingStatusNm())) { return false; }
        if (!helpComparingValue(getShippingSlipNo(), otherEntity.getShippingSlipNo())) { return false; }
        if (!helpComparingValue(getNum(), otherEntity.getNum())) { return false; }
        if (!helpComparingValue(getTsihNum(), otherEntity.getTsihNum())) { return false; }
        if (!helpComparingValue(getCountProductCd(), otherEntity.getCountProductCd())) { return false; }
        if (!helpComparingValue(getInstNum(), otherEntity.getInstNum())) { return false; }
        if (!helpComparingValue(getAllocNum(), otherEntity.getAllocNum())) { return false; }
        if (!helpComparingValue(getCountShippingPackingNo(), otherEntity.getCountShippingPackingNo())) { return false; }
        if (!helpComparingValue(getSumGrossWeight(), otherEntity.getSumGrossWeight())) { return false; }
        if (!helpComparingValue(getPicListStatus1(), otherEntity.getPicListStatus1())) { return false; }
        if (!helpComparingValue(getPicListStatus2(), otherEntity.getPicListStatus2())) { return false; }
        if (!helpComparingValue(getChkStatus(), otherEntity.getChkStatus())) { return false; }
        if (!helpComparingValue(getInvoiceCreate(), otherEntity.getInvoiceCreate())) { return false; }
        if (!helpComparingValue(getPackingOut(), otherEntity.getPackingOut())) { return false; }
        if (!helpComparingValue(getLoadingStatus(), otherEntity.getLoadingStatus())) { return false; }
        if (!helpComparingValue(getShippingFixed(), otherEntity.getShippingFixed())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlDeliveryCourseShippingList");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getCancelFlg());
        result = xCH(result, getStockOutFlg());
        result = xCH(result, getWorkDt());
        result = xCH(result, getShippingDt());
        result = xCH(result, getMaxUpdDt());
        result = xCH(result, getPickingTime());
        result = xCH(result, getStowageTime());
        result = xCH(result, getShippingTime());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getCarrierCd());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getCountSupplyCustomerCd());
        result = xCH(result, getPickingBatchNo());
        result = xCH(result, getShippingStatus());
        result = xCH(result, getShippingStatusMax());
        result = xCH(result, getShippingStatusNm());
        result = xCH(result, getShippingSlipNo());
        result = xCH(result, getNum());
        result = xCH(result, getTsihNum());
        result = xCH(result, getCountProductCd());
        result = xCH(result, getInstNum());
        result = xCH(result, getAllocNum());
        result = xCH(result, getCountShippingPackingNo());
        result = xCH(result, getSumGrossWeight());
        result = xCH(result, getPicListStatus1());
        result = xCH(result, getPicListStatus2());
        result = xCH(result, getChkStatus());
        result = xCH(result, getInvoiceCreate());
        result = xCH(result, getPackingOut());
        result = xCH(result, getLoadingStatus());
        result = xCH(result, getShippingFixed());
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
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getCancelFlg());
        sb.append(c).append(getStockOutFlg());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getMaxUpdDt());
        sb.append(c).append(getPickingTime());
        sb.append(c).append(getStowageTime());
        sb.append(c).append(getShippingTime());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getCountSupplyCustomerCd());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getShippingStatus());
        sb.append(c).append(getShippingStatusMax());
        sb.append(c).append(getShippingStatusNm());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getNum());
        sb.append(c).append(getTsihNum());
        sb.append(c).append(getCountProductCd());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getCountShippingPackingNo());
        sb.append(c).append(getSumGrossWeight());
        sb.append(c).append(getPicListStatus1());
        sb.append(c).append(getPicListStatus2());
        sb.append(c).append(getChkStatus());
        sb.append(c).append(getInvoiceCreate());
        sb.append(c).append(getPackingOut());
        sb.append(c).append(getLoadingStatus());
        sb.append(c).append(getShippingFixed());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] ERROR_FLG: {varchar(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {varchar(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] CANCEL_FLG: {varchar(1)} <br>
     * @return The value of the column 'CANCEL_FLG'. (NullAllowed)
     */
    public String getCancelFlg() {
        return _cancelFlg;
    }

    /**
     * [set] CANCEL_FLG: {varchar(1)} <br>
     * @param cancelFlg The value of the column 'CANCEL_FLG'. (NullAllowed)
     */
    public void setCancelFlg(String cancelFlg) {
        __modifiedProperties.add("cancelFlg");
        this._cancelFlg = cancelFlg;
    }

    /**
     * [get] STOCK_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public String getStockOutFlg() {
        return _stockOutFlg;
    }

    /**
     * [set] STOCK_OUT_FLG: {varchar(1)} <br>
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
     * [get] MAX_UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'MAX_UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getMaxUpdDt() {
        return _maxUpdDt;
    }

    /**
     * [set] MAX_UPD_DT: {datetime2(26, 6)} <br>
     * @param maxUpdDt The value of the column 'MAX_UPD_DT'. (NullAllowed)
     */
    public void setMaxUpdDt(java.sql.Timestamp maxUpdDt) {
        __modifiedProperties.add("maxUpdDt");
        this._maxUpdDt = maxUpdDt;
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
     * [get] COUNT_SUPPLY_CUSTOMER_CD: {int(10)} <br>
     * @return The value of the column 'COUNT_SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public Long getCountSupplyCustomerCd() {
        return _countSupplyCustomerCd;
    }

    /**
     * [set] COUNT_SUPPLY_CUSTOMER_CD: {int(10)} <br>
     * @param countSupplyCustomerCd The value of the column 'COUNT_SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setCountSupplyCustomerCd(Long countSupplyCustomerCd) {
        __modifiedProperties.add("countSupplyCustomerCd");
        this._countSupplyCustomerCd = countSupplyCustomerCd;
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
     * [get] SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @return The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public String getShippingStatus() {
        return _shippingStatus;
    }

    /**
     * [set] SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public void setShippingStatus(String shippingStatus) {
        __modifiedProperties.add("shippingStatus");
        this._shippingStatus = shippingStatus;
    }

    /**
     * [get] SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス最大値
     * @return The value of the column 'SHIPPING_STATUS_MAX'. (NullAllowed)
     */
    public String getShippingStatusMax() {
        return _shippingStatusMax;
    }

    /**
     * [set] SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス最大値
     * @param shippingStatusMax The value of the column 'SHIPPING_STATUS_MAX'. (NullAllowed)
     */
    public void setShippingStatusMax(String shippingStatusMax) {
        __modifiedProperties.add("shippingStatusMax");
        this._shippingStatusMax = shippingStatusMax;
    }

    /**
     * [get] SHIPPING_STATUS_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STATUS_NM'. (NullAllowed)
     */
    public String getShippingStatusNm() {
        return _shippingStatusNm;
    }

    /**
     * [set] SHIPPING_STATUS_NM: {int(10)} <br>
     * @param shippingStatusNm The value of the column 'SHIPPING_STATUS_NM'. (NullAllowed)
     */
    public void setShippingStatusNm(String shippingStatusNm) {
        __modifiedProperties.add("shippingStatusNm");
        this._shippingStatusNm = shippingStatusNm;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public Integer getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {int(10)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(Integer shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] NUM: {int(10)} <br>
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public Integer getNum() {
        return _num;
    }

    /**
     * [set] NUM: {int(10)} <br>
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(Integer num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] TSIH_NUM: {int(10)} <br>
     * @return The value of the column 'TSIH_NUM'. (NullAllowed)
     */
    public Long getTsihNum() {
        return _tsihNum;
    }

    /**
     * [set] TSIH_NUM: {int(10)} <br>
     * @param tsihNum The value of the column 'TSIH_NUM'. (NullAllowed)
     */
    public void setTsihNum(Long tsihNum) {
        __modifiedProperties.add("tsihNum");
        this._tsihNum = tsihNum;
    }

    /**
     * [get] COUNT_PRODUCT_CD: {int(10)} <br>
     * @return The value of the column 'COUNT_PRODUCT_CD'. (NullAllowed)
     */
    public Integer getCountProductCd() {
        return _countProductCd;
    }

    /**
     * [set] COUNT_PRODUCT_CD: {int(10)} <br>
     * @param countProductCd The value of the column 'COUNT_PRODUCT_CD'. (NullAllowed)
     */
    public void setCountProductCd(Integer countProductCd) {
        __modifiedProperties.add("countProductCd");
        this._countProductCd = countProductCd;
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
     * [get] COUNT_SHIPPING_PACKING_NO: {int(10)} <br>
     * @return The value of the column 'COUNT_SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public Integer getCountShippingPackingNo() {
        return _countShippingPackingNo;
    }

    /**
     * [set] COUNT_SHIPPING_PACKING_NO: {int(10)} <br>
     * @param countShippingPackingNo The value of the column 'COUNT_SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setCountShippingPackingNo(Integer countShippingPackingNo) {
        __modifiedProperties.add("countShippingPackingNo");
        this._countShippingPackingNo = countShippingPackingNo;
    }

    /**
     * [get] SUM_GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'SUM_GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getSumGrossWeight() {
        return _sumGrossWeight;
    }

    /**
     * [set] SUM_GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @param sumGrossWeight The value of the column 'SUM_GROSS_WEIGHT'. (NullAllowed)
     */
    public void setSumGrossWeight(java.math.BigDecimal sumGrossWeight) {
        __modifiedProperties.add("sumGrossWeight");
        this._sumGrossWeight = sumGrossWeight;
    }

    /**
     * [get] PIC_LIST_STATUS1: {int(10)} <br>
     * @return The value of the column 'PIC_LIST_STATUS1'. (NullAllowed)
     */
    public Integer getPicListStatus1() {
        return _picListStatus1;
    }

    /**
     * [set] PIC_LIST_STATUS1: {int(10)} <br>
     * @param picListStatus1 The value of the column 'PIC_LIST_STATUS1'. (NullAllowed)
     */
    public void setPicListStatus1(Integer picListStatus1) {
        __modifiedProperties.add("picListStatus1");
        this._picListStatus1 = picListStatus1;
    }

    /**
     * [get] PIC_LIST_STATUS2: {int(10)} <br>
     * @return The value of the column 'PIC_LIST_STATUS2'. (NullAllowed)
     */
    public Integer getPicListStatus2() {
        return _picListStatus2;
    }

    /**
     * [set] PIC_LIST_STATUS2: {int(10)} <br>
     * @param picListStatus2 The value of the column 'PIC_LIST_STATUS2'. (NullAllowed)
     */
    public void setPicListStatus2(Integer picListStatus2) {
        __modifiedProperties.add("picListStatus2");
        this._picListStatus2 = picListStatus2;
    }

    /**
     * [get] CHK_STATUS: {int(10)} <br>
     * @return The value of the column 'CHK_STATUS'. (NullAllowed)
     */
    public Integer getChkStatus() {
        return _chkStatus;
    }

    /**
     * [set] CHK_STATUS: {int(10)} <br>
     * @param chkStatus The value of the column 'CHK_STATUS'. (NullAllowed)
     */
    public void setChkStatus(Integer chkStatus) {
        __modifiedProperties.add("chkStatus");
        this._chkStatus = chkStatus;
    }

    /**
     * [get] INVOICE_CREATE: {int(10)} <br>
     * @return The value of the column 'INVOICE_CREATE'. (NullAllowed)
     */
    public Integer getInvoiceCreate() {
        return _invoiceCreate;
    }

    /**
     * [set] INVOICE_CREATE: {int(10)} <br>
     * @param invoiceCreate The value of the column 'INVOICE_CREATE'. (NullAllowed)
     */
    public void setInvoiceCreate(Integer invoiceCreate) {
        __modifiedProperties.add("invoiceCreate");
        this._invoiceCreate = invoiceCreate;
    }

    /**
     * [get] PACKING_OUT: {int(10)} <br>
     * @return The value of the column 'PACKING_OUT'. (NullAllowed)
     */
    public Integer getPackingOut() {
        return _packingOut;
    }

    /**
     * [set] PACKING_OUT: {int(10)} <br>
     * @param packingOut The value of the column 'PACKING_OUT'. (NullAllowed)
     */
    public void setPackingOut(Integer packingOut) {
        __modifiedProperties.add("packingOut");
        this._packingOut = packingOut;
    }

    /**
     * [get] LOADING_STATUS: {int(10)} <br>
     * @return The value of the column 'LOADING_STATUS'. (NullAllowed)
     */
    public Integer getLoadingStatus() {
        return _loadingStatus;
    }

    /**
     * [set] LOADING_STATUS: {int(10)} <br>
     * @param loadingStatus The value of the column 'LOADING_STATUS'. (NullAllowed)
     */
    public void setLoadingStatus(Integer loadingStatus) {
        __modifiedProperties.add("loadingStatus");
        this._loadingStatus = loadingStatus;
    }

    /**
     * [get] SHIPPING_FIXED: {int(10)} <br>
     * @return The value of the column 'SHIPPING_FIXED'. (NullAllowed)
     */
    public Integer getShippingFixed() {
        return _shippingFixed;
    }

    /**
     * [set] SHIPPING_FIXED: {int(10)} <br>
     * @param shippingFixed The value of the column 'SHIPPING_FIXED'. (NullAllowed)
     */
    public void setShippingFixed(Integer shippingFixed) {
        __modifiedProperties.add("shippingFixed");
        this._shippingFixed = shippingFixed;
    }

}
