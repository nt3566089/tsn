package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlEReceivePlanList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, RECEIVE_PLAN_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PLAN_CLIENT_RECEIVE_NO, PLAN_SUPPLIER_CD, VERSION_NO, CONTROL_NO, CUSTOMER_NM, CUSTOMER_ABBR, RECEIVE_PLAN_DT, PROCESS_TYPE_CD, PROCESS_TYPE_NM, STOCK_TYPE_CD, STOCK_TYPE_NM, PLAN_DEPOSIT_CD, PLAN_DEPOSIT_NM, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, PLAN_NUM, PLAN_WAREHOUSE_CD, PLAN_LOCATION_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_CLIENT_ORDER_NO, MESSAGE_NM, LOCATION_ID, LCS_WAREHOUSE_CD, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3
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
public abstract class BsSqlEReceivePlanListDto implements Serializable {

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

    /** RECEIVE_PLAN_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanId;

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

    /** PLAN_CLIENT_RECEIVE_NO: {varchar(255)} */
    @JsonKey
    protected String _planClientReceiveNo;

    /** PLAN_SUPPLIER_CD: {varchar(255)} */
    @JsonKey
    protected String _planSupplierCd;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _customerNm;

    /** CUSTOMER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _customerAbbr;

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    @JsonKey
    protected String _receivePlanDt;

    /** PROCESS_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _processTypeCd;

    /** PROCESS_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _processTypeNm;

    /** STOCK_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _stockTypeCd;

    /** STOCK_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _stockTypeNm;

    /** PLAN_DEPOSIT_CD: {varchar(255)} */
    @JsonKey
    protected String _planDepositCd;

    /** PLAN_DEPOSIT_NM: {varchar(60)} */
    @JsonKey
    protected String _planDepositNm;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** JAN_CD: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** LOT_MANAG_FLG: {char(1), classification=LotManagFlg} */
    @JsonKey
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** PLAN_NUM: {varchar(255)} */
    @JsonKey
    protected String _planNum;

    /** PLAN_WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _planWarehouseCd;

    /** PLAN_LOCATION_CD: {varchar(255)} */
    @JsonKey
    protected String _planLocationCd;

    /** PLAN_LOT: {varchar(255)} */
    @JsonKey
    protected String _planLot;

    /** PLAN_LIMIT_DT: {varchar(255)} */
    @JsonKey
    protected String _planLimitDt;

    /** PLAN_CLIENT_ORDER_NO: {varchar(255)} */
    @JsonKey
    protected String _planClientOrderNo;

    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LCS_WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _lcsWarehouseCd;

    /** SPARE_STR_1: {varchar(255)} */
    @JsonKey
    protected String _spareStr1;

    /** SPARE_STR_2: {varchar(255)} */
    @JsonKey
    protected String _spareStr2;

    /** SPARE_STR_3: {varchar(255)} */
    @JsonKey
    protected String _spareStr3;

    /** SPARE_NUM_1: {varchar(255)} */
    @JsonKey
    protected String _spareNum1;

    /** SPARE_NUM_2: {varchar(255)} */
    @JsonKey
    protected String _spareNum2;

    /** SPARE_NUM_3: {varchar(255)} */
    @JsonKey
    protected String _spareNum3;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlEReceivePlanListDto() {
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
        if (other == null || !(other instanceof BsSqlEReceivePlanListDto)) { return false; }
        final BsSqlEReceivePlanListDto otherEntity = (BsSqlEReceivePlanListDto)other;
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getReceivePlanId(), otherEntity.getReceivePlanId())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getPlanClientReceiveNo(), otherEntity.getPlanClientReceiveNo())) { return false; }
        if (!helpComparingValue(getPlanSupplierCd(), otherEntity.getPlanSupplierCd())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        if (!helpComparingValue(getCustomerNm(), otherEntity.getCustomerNm())) { return false; }
        if (!helpComparingValue(getCustomerAbbr(), otherEntity.getCustomerAbbr())) { return false; }
        if (!helpComparingValue(getReceivePlanDt(), otherEntity.getReceivePlanDt())) { return false; }
        if (!helpComparingValue(getProcessTypeCd(), otherEntity.getProcessTypeCd())) { return false; }
        if (!helpComparingValue(getProcessTypeNm(), otherEntity.getProcessTypeNm())) { return false; }
        if (!helpComparingValue(getStockTypeCd(), otherEntity.getStockTypeCd())) { return false; }
        if (!helpComparingValue(getStockTypeNm(), otherEntity.getStockTypeNm())) { return false; }
        if (!helpComparingValue(getPlanDepositCd(), otherEntity.getPlanDepositCd())) { return false; }
        if (!helpComparingValue(getPlanDepositNm(), otherEntity.getPlanDepositNm())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getLotManagFlg(), otherEntity.getLotManagFlg())) { return false; }
        if (!helpComparingValue(getLimitDtManagFlg(), otherEntity.getLimitDtManagFlg())) { return false; }
        if (!helpComparingValue(getPlanNum(), otherEntity.getPlanNum())) { return false; }
        if (!helpComparingValue(getPlanWarehouseCd(), otherEntity.getPlanWarehouseCd())) { return false; }
        if (!helpComparingValue(getPlanLocationCd(), otherEntity.getPlanLocationCd())) { return false; }
        if (!helpComparingValue(getPlanLot(), otherEntity.getPlanLot())) { return false; }
        if (!helpComparingValue(getPlanLimitDt(), otherEntity.getPlanLimitDt())) { return false; }
        if (!helpComparingValue(getPlanClientOrderNo(), otherEntity.getPlanClientOrderNo())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        if (!helpComparingValue(getLcsWarehouseCd(), otherEntity.getLcsWarehouseCd())) { return false; }
        if (!helpComparingValue(getSpareStr1(), otherEntity.getSpareStr1())) { return false; }
        if (!helpComparingValue(getSpareStr2(), otherEntity.getSpareStr2())) { return false; }
        if (!helpComparingValue(getSpareStr3(), otherEntity.getSpareStr3())) { return false; }
        if (!helpComparingValue(getSpareNum1(), otherEntity.getSpareNum1())) { return false; }
        if (!helpComparingValue(getSpareNum2(), otherEntity.getSpareNum2())) { return false; }
        if (!helpComparingValue(getSpareNum3(), otherEntity.getSpareNum3())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlEReceivePlanList");
        result = xCH(result, getReceiveCd());
        result = xCH(result, getReceivePlanId());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterCd());
        result = xCH(result, getPlanClientReceiveNo());
        result = xCH(result, getPlanSupplierCd());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
        result = xCH(result, getCustomerNm());
        result = xCH(result, getCustomerAbbr());
        result = xCH(result, getReceivePlanDt());
        result = xCH(result, getProcessTypeCd());
        result = xCH(result, getProcessTypeNm());
        result = xCH(result, getStockTypeCd());
        result = xCH(result, getStockTypeNm());
        result = xCH(result, getPlanDepositCd());
        result = xCH(result, getPlanDepositNm());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getJanCd());
        result = xCH(result, getLotManagFlg());
        result = xCH(result, getLimitDtManagFlg());
        result = xCH(result, getPlanNum());
        result = xCH(result, getPlanWarehouseCd());
        result = xCH(result, getPlanLocationCd());
        result = xCH(result, getPlanLot());
        result = xCH(result, getPlanLimitDt());
        result = xCH(result, getPlanClientOrderNo());
        result = xCH(result, getMessageNm());
        result = xCH(result, getLocationId());
        result = xCH(result, getLcsWarehouseCd());
        result = xCH(result, getSpareStr1());
        result = xCH(result, getSpareStr2());
        result = xCH(result, getSpareStr3());
        result = xCH(result, getSpareNum1());
        result = xCH(result, getSpareNum2());
        result = xCH(result, getSpareNum3());
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
        sb.append(c).append(getReceivePlanId());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getPlanClientReceiveNo());
        sb.append(c).append(getPlanSupplierCd());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getCustomerAbbr());
        sb.append(c).append(getReceivePlanDt());
        sb.append(c).append(getProcessTypeCd());
        sb.append(c).append(getProcessTypeNm());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getStockTypeNm());
        sb.append(c).append(getPlanDepositCd());
        sb.append(c).append(getPlanDepositNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLotManagFlg());
        sb.append(c).append(getLimitDtManagFlg());
        sb.append(c).append(getPlanNum());
        sb.append(c).append(getPlanWarehouseCd());
        sb.append(c).append(getPlanLocationCd());
        sb.append(c).append(getPlanLot());
        sb.append(c).append(getPlanLimitDt());
        sb.append(c).append(getPlanClientOrderNo());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLcsWarehouseCd());
        sb.append(c).append(getSpareStr1());
        sb.append(c).append(getSpareStr2());
        sb.append(c).append(getSpareStr3());
        sb.append(c).append(getSpareNum1());
        sb.append(c).append(getSpareNum2());
        sb.append(c).append(getSpareNum3());
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
     * [get] RECEIVE_PLAN_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public Long getReceivePlanId() {
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {bigint(19)} <br>
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public void setReceivePlanId(Long receivePlanId) {
        __modifiedProperties.add("receivePlanId");
        this._receivePlanId = receivePlanId;
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
     * [get] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public String getPlanClientReceiveNo() {
        return _planClientReceiveNo;
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        __modifiedProperties.add("planClientReceiveNo");
        this._planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public String getPlanSupplierCd() {
        return _planSupplierCd;
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        __modifiedProperties.add("planSupplierCd");
        this._planSupplierCd = planSupplierCd;
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

    /**
     * [get] CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {varchar(60)} <br>
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public String getCustomerAbbr() {
        return _customerAbbr;
    }

    /**
     * [set] CUSTOMER_ABBR: {varchar(60)} <br>
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public void setCustomerAbbr(String customerAbbr) {
        __modifiedProperties.add("customerAbbr");
        this._customerAbbr = customerAbbr;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public String getReceivePlanDt() {
        return _receivePlanDt;
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        __modifiedProperties.add("receivePlanDt");
        this._receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public String getProcessTypeCd() {
        return _processTypeCd;
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public void setProcessTypeCd(String processTypeCd) {
        __modifiedProperties.add("processTypeCd");
        this._processTypeCd = processTypeCd;
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
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
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
     * [get] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public String getPlanDepositCd() {
        return _planDepositCd;
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public void setPlanDepositCd(String planDepositCd) {
        __modifiedProperties.add("planDepositCd");
        this._planDepositCd = planDepositCd;
    }

    /**
     * [get] PLAN_DEPOSIT_NM: {varchar(60)} <br>
     * @return The value of the column 'PLAN_DEPOSIT_NM'. (NullAllowed)
     */
    public String getPlanDepositNm() {
        return _planDepositNm;
    }

    /**
     * [set] PLAN_DEPOSIT_NM: {varchar(60)} <br>
     * @param planDepositNm The value of the column 'PLAN_DEPOSIT_NM'. (NullAllowed)
     */
    public void setPlanDepositNm(String planDepositNm) {
        __modifiedProperties.add("planDepositNm");
        this._planDepositNm = planDepositNm;
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
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] PLAN_NUM: {varchar(255)} <br>
     * @return The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public String getPlanNum() {
        return _planNum;
    }

    /**
     * [set] PLAN_NUM: {varchar(255)} <br>
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public void setPlanNum(String planNum) {
        __modifiedProperties.add("planNum");
        this._planNum = planNum;
    }

    /**
     * [get] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getPlanWarehouseCd() {
        return _planWarehouseCd;
    }

    /**
     * [set] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * @param planWarehouseCd The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setPlanWarehouseCd(String planWarehouseCd) {
        __modifiedProperties.add("planWarehouseCd");
        this._planWarehouseCd = planWarehouseCd;
    }

    /**
     * [get] PLAN_LOCATION_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_LOCATION_CD'. (NullAllowed)
     */
    public String getPlanLocationCd() {
        return _planLocationCd;
    }

    /**
     * [set] PLAN_LOCATION_CD: {varchar(255)} <br>
     * @param planLocationCd The value of the column 'PLAN_LOCATION_CD'. (NullAllowed)
     */
    public void setPlanLocationCd(String planLocationCd) {
        __modifiedProperties.add("planLocationCd");
        this._planLocationCd = planLocationCd;
    }

    /**
     * [get] PLAN_LOT: {varchar(255)} <br>
     * @return The value of the column 'PLAN_LOT'. (NullAllowed)
     */
    public String getPlanLot() {
        return _planLot;
    }

    /**
     * [set] PLAN_LOT: {varchar(255)} <br>
     * @param planLot The value of the column 'PLAN_LOT'. (NullAllowed)
     */
    public void setPlanLot(String planLot) {
        __modifiedProperties.add("planLot");
        this._planLot = planLot;
    }

    /**
     * [get] PLAN_LIMIT_DT: {varchar(255)} <br>
     * @return The value of the column 'PLAN_LIMIT_DT'. (NullAllowed)
     */
    public String getPlanLimitDt() {
        return _planLimitDt;
    }

    /**
     * [set] PLAN_LIMIT_DT: {varchar(255)} <br>
     * @param planLimitDt The value of the column 'PLAN_LIMIT_DT'. (NullAllowed)
     */
    public void setPlanLimitDt(String planLimitDt) {
        __modifiedProperties.add("planLimitDt");
        this._planLimitDt = planLimitDt;
    }

    /**
     * [get] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * @return The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed)
     */
    public String getPlanClientOrderNo() {
        return _planClientOrderNo;
    }

    /**
     * [set] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * @param planClientOrderNo The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed)
     */
    public void setPlanClientOrderNo(String planClientOrderNo) {
        __modifiedProperties.add("planClientOrderNo");
        this._planClientOrderNo = planClientOrderNo;
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
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LCS_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'LCS_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getLcsWarehouseCd() {
        return _lcsWarehouseCd;
    }

    /**
     * [set] LCS_WAREHOUSE_CD: {varchar(30)} <br>
     * @param lcsWarehouseCd The value of the column 'LCS_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setLcsWarehouseCd(String lcsWarehouseCd) {
        __modifiedProperties.add("lcsWarehouseCd");
        this._lcsWarehouseCd = lcsWarehouseCd;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public String getSpareStr1() {
        return _spareStr1;
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public void setSpareStr1(String spareStr1) {
        __modifiedProperties.add("spareStr1");
        this._spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public String getSpareStr2() {
        return _spareStr2;
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public void setSpareStr2(String spareStr2) {
        __modifiedProperties.add("spareStr2");
        this._spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public String getSpareStr3() {
        return _spareStr3;
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public void setSpareStr3(String spareStr3) {
        __modifiedProperties.add("spareStr3");
        this._spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public String getSpareNum1() {
        return _spareNum1;
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public void setSpareNum1(String spareNum1) {
        __modifiedProperties.add("spareNum1");
        this._spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public String getSpareNum2() {
        return _spareNum2;
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public void setSpareNum2(String spareNum2) {
        __modifiedProperties.add("spareNum2");
        this._spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public String getSpareNum3() {
        return _spareNum3;
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public void setSpareNum3(String spareNum3) {
        __modifiedProperties.add("spareNum3");
        this._spareNum3 = spareNum3;
    }

}
