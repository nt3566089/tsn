package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlESerialInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, SERIAL_INPUT_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PROCESS_TYPE, PROCESS_TYPE_NM, PRODUCT_CD, PRODUCT_ID, PRODUCT_NM, SERIAL_NO, SUPPLIER_CD, SUPPLIER_NM, SUPPLIER_ID, SUPPLIER_NM2, RECEIVE_SLIP_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_NM2, PICKING_WORK_NO, WORK_DT, MESSAGE_NM, VERSION_NO, CONTROL_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSqlESerialInputListDto implements Serializable {

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
    /** RECEIVE_CD: {varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** SERIAL_INPUT_ID: {bigint(19)} */
    @JsonKey
    protected Long _serialInputId;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(255)} */
    @JsonKey
    protected String _clientCd;

    /** CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _centerCd;

    /** PROCESS_TYPE: {varchar(255)} */
    @JsonKey
    protected String _processType;

    /** PROCESS_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _processTypeNm;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** SERIAL_NO: {varchar(255)} */
    @JsonKey
    protected String _serialNo;

    /** SUPPLIER_CD: {varchar(255)} */
    @JsonKey
    protected String _supplierCd;

    /** SUPPLIER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplierNm;

    /** SUPPLIER_ID: {bigint(19)} */
    @JsonKey
    protected Long _supplierId;

    /** SUPPLIER_NM2: {varchar(60)} */
    @JsonKey
    protected String _supplierNm2;

    /** RECEIVE_SLIP_NO: {varchar(255)} */
    @JsonKey
    protected String _receiveSlipNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_NM2: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerNm2;

    /** PICKING_WORK_NO: {varchar(255)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** WORK_DT: {varchar(255)} */
    @JsonKey
    protected String _workDt;

    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlESerialInputListDto() {
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
        if (other == null || !(other instanceof BsSqlESerialInputListDto)) { return false; }
        final BsSqlESerialInputListDto otherEntity = (BsSqlESerialInputListDto)other;
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getSerialInputId(), otherEntity.getSerialInputId())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getProcessType(), otherEntity.getProcessType())) { return false; }
        if (!helpComparingValue(getProcessTypeNm(), otherEntity.getProcessTypeNm())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getSerialNo(), otherEntity.getSerialNo())) { return false; }
        if (!helpComparingValue(getSupplierCd(), otherEntity.getSupplierCd())) { return false; }
        if (!helpComparingValue(getSupplierNm(), otherEntity.getSupplierNm())) { return false; }
        if (!helpComparingValue(getSupplierId(), otherEntity.getSupplierId())) { return false; }
        if (!helpComparingValue(getSupplierNm2(), otherEntity.getSupplierNm2())) { return false; }
        if (!helpComparingValue(getReceiveSlipNo(), otherEntity.getReceiveSlipNo())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getSupplyCustomerId(), otherEntity.getSupplyCustomerId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm2(), otherEntity.getSupplyCustomerNm2())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlESerialInputList");
        result = xCH(result, getReceiveCd());
        result = xCH(result, getSerialInputId());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterCd());
        result = xCH(result, getProcessType());
        result = xCH(result, getProcessTypeNm());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductId());
        result = xCH(result, getProductNm());
        result = xCH(result, getSerialNo());
        result = xCH(result, getSupplierCd());
        result = xCH(result, getSupplierNm());
        result = xCH(result, getSupplierId());
        result = xCH(result, getSupplierNm2());
        result = xCH(result, getReceiveSlipNo());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getSupplyCustomerId());
        result = xCH(result, getSupplyCustomerNm2());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getWorkDt());
        result = xCH(result, getMessageNm());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
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
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getSerialInputId());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getProcessType());
        sb.append(c).append(getProcessTypeNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSerialNo());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getSupplierNm());
        sb.append(c).append(getSupplierId());
        sb.append(c).append(getSupplierNm2());
        sb.append(c).append(getReceiveSlipNo());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyCustomerNm2());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] SERIAL_INPUT_ID: {bigint(19)} <br>
     * @return The value of the column 'SERIAL_INPUT_ID'. (NullAllowed)
     */
    public Long getSerialInputId() {
        return _serialInputId;
    }

    /**
     * [set] SERIAL_INPUT_ID: {bigint(19)} <br>
     * @param serialInputId The value of the column 'SERIAL_INPUT_ID'. (NullAllowed)
     */
    public void setSerialInputId(Long serialInputId) {
        __modifiedProperties.add("serialInputId");
        this._serialInputId = serialInputId;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] PROCESS_TYPE: {varchar(255)} <br>
     * @return The value of the column 'PROCESS_TYPE'. (NullAllowed)
     */
    public String getProcessType() {
        return _processType;
    }

    /**
     * [set] PROCESS_TYPE: {varchar(255)} <br>
     * @param processType The value of the column 'PROCESS_TYPE'. (NullAllowed)
     */
    public void setProcessType(String processType) {
        __modifiedProperties.add("processType");
        this._processType = processType;
    }

    /**
     * [get] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public String getProcessTypeNm() {
        return _processTypeNm;
    }

    /**
     * [set] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public void setProcessTypeNm(String processTypeNm) {
        __modifiedProperties.add("processTypeNm");
        this._processTypeNm = processTypeNm;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] SERIAL_NO: {varchar(255)} <br>
     * @return The value of the column 'SERIAL_NO'. (NullAllowed)
     */
    public String getSerialNo() {
        return _serialNo;
    }

    /**
     * [set] SERIAL_NO: {varchar(255)} <br>
     * @param serialNo The value of the column 'SERIAL_NO'. (NullAllowed)
     */
    public void setSerialNo(String serialNo) {
        __modifiedProperties.add("serialNo");
        this._serialNo = serialNo;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public String getSupplierCd() {
        return _supplierCd;
    }

    /**
     * [set] SUPPLIER_CD: {varchar(255)} <br>
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public void setSupplierCd(String supplierCd) {
        __modifiedProperties.add("supplierCd");
        this._supplierCd = supplierCd;
    }

    /**
     * [get] SUPPLIER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public String getSupplierNm() {
        return _supplierNm;
    }

    /**
     * [set] SUPPLIER_NM: {varchar(255)} <br>
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public void setSupplierNm(String supplierNm) {
        __modifiedProperties.add("supplierNm");
        this._supplierNm = supplierNm;
    }

    /**
     * [get] SUPPLIER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public Long getSupplierId() {
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {bigint(19)} <br>
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public void setSupplierId(Long supplierId) {
        __modifiedProperties.add("supplierId");
        this._supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_NM2: {varchar(60)} <br>
     * @return The value of the column 'SUPPLIER_NM2'. (NullAllowed)
     */
    public String getSupplierNm2() {
        return _supplierNm2;
    }

    /**
     * [set] SUPPLIER_NM2: {varchar(60)} <br>
     * @param supplierNm2 The value of the column 'SUPPLIER_NM2'. (NullAllowed)
     */
    public void setSupplierNm2(String supplierNm2) {
        __modifiedProperties.add("supplierNm2");
        this._supplierNm2 = supplierNm2;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {varchar(255)} <br>
     * @return The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public String getReceiveSlipNo() {
        return _receiveSlipNo;
    }

    /**
     * [set] RECEIVE_SLIP_NO: {varchar(255)} <br>
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        __modifiedProperties.add("receiveSlipNo");
        this._receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
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
     * [get] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        __modifiedProperties.add("supplyCustomerId");
        this._supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM2: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM2'. (NullAllowed)
     */
    public String getSupplyCustomerNm2() {
        return _supplyCustomerNm2;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM2: {varchar(60)} <br>
     * @param supplyCustomerNm2 The value of the column 'SUPPLY_CUSTOMER_NM2'. (NullAllowed)
     */
    public void setSupplyCustomerNm2(String supplyCustomerNm2) {
        __modifiedProperties.add("supplyCustomerNm2");
        this._supplyCustomerNm2 = supplyCustomerNm2;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(255)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] WORK_DT: {varchar(255)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(255)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

}
