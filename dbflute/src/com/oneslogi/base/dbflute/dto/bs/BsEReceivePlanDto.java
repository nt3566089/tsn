package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_RECEIVE_PLAN as TABLE. <br>
 * 入荷予定受信
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_ID
 *
 * [column]
 *     RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PLAN_CLIENT_RECEIVE_NO, PLAN_SUPPLIER_CD, RECEIVE_PLAN_DT, PROCESS_TYPE_CD, STOCK_TYPE_CD, PLAN_DEPOSIT_CD, PRODUCT_CD, PRODUCT_NM, PLAN_NUM, PLAN_WAREHOUSE_CD, PLAN_LOCATION_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_CLIENT_ORDER_NO, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_ID
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
public abstract class BsEReceivePlanDto implements Serializable {

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
    /** RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _receivePlanId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
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

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    @JsonKey
    protected String _receivePlanDt;

    /** PROCESS_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _processTypeCd;

    /** STOCK_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _stockTypeCd;

    /** PLAN_DEPOSIT_CD: {varchar(255)} */
    @JsonKey
    protected String _planDepositCd;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

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

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEReceivePlanDto() {
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
        if (other == null || !(other instanceof BsEReceivePlanDto)) { return false; }
        final BsEReceivePlanDto otherEntity = (BsEReceivePlanDto)other;
        if (!helpComparingValue(getReceivePlanId(), otherEntity.getReceivePlanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_RECEIVE_PLAN");
        result = xCH(result, getReceivePlanId());
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
        sb.append(c).append(getReceivePlanId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getPlanClientReceiveNo());
        sb.append(c).append(getPlanSupplierCd());
        sb.append(c).append(getReceivePlanDt());
        sb.append(c).append(getProcessTypeCd());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getPlanDepositCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getPlanNum());
        sb.append(c).append(getPlanWarehouseCd());
        sb.append(c).append(getPlanLocationCd());
        sb.append(c).append(getPlanLot());
        sb.append(c).append(getPlanLimitDt());
        sb.append(c).append(getPlanClientOrderNo());
        sb.append(c).append(getSpareStr1());
        sb.append(c).append(getSpareStr2());
        sb.append(c).append(getSpareStr3());
        sb.append(c).append(getSpareNum1());
        sb.append(c).append(getSpareNum2());
        sb.append(c).append(getSpareNum3());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定受信ID
     * @return The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public Long getReceivePlanId() {
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定受信ID
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public void setReceivePlanId(Long receivePlanId) {
        __modifiedProperties.add("receivePlanId");
        this._receivePlanId = receivePlanId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * 予定顧客入荷指示No.
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public String getPlanClientReceiveNo() {
        return _planClientReceiveNo;
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * 予定顧客入荷指示No.
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        __modifiedProperties.add("planClientReceiveNo");
        this._planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * 予定仕入先CD
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public String getPlanSupplierCd() {
        return _planSupplierCd;
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * 予定仕入先CD
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        __modifiedProperties.add("planSupplierCd");
        this._planSupplierCd = planSupplierCd;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public String getReceivePlanDt() {
        return _receivePlanDt;
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        __modifiedProperties.add("receivePlanDt");
        this._receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * 処理区分CD
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public String getProcessTypeCd() {
        return _processTypeCd;
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * 処理区分CD
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public void setProcessTypeCd(String processTypeCd) {
        __modifiedProperties.add("processTypeCd");
        this._processTypeCd = processTypeCd;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * 予定預託CD
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public String getPlanDepositCd() {
        return _planDepositCd;
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * 予定預託CD
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public void setPlanDepositCd(String planDepositCd) {
        __modifiedProperties.add("planDepositCd");
        this._planDepositCd = planDepositCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PLAN_NUM: {varchar(255)} <br>
     * 予定数
     * @return The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public String getPlanNum() {
        return _planNum;
    }

    /**
     * [set] PLAN_NUM: {varchar(255)} <br>
     * 予定数
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public void setPlanNum(String planNum) {
        __modifiedProperties.add("planNum");
        this._planNum = planNum;
    }

    /**
     * [get] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * 予定倉庫CD
     * @return The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getPlanWarehouseCd() {
        return _planWarehouseCd;
    }

    /**
     * [set] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * 予定倉庫CD
     * @param planWarehouseCd The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setPlanWarehouseCd(String planWarehouseCd) {
        __modifiedProperties.add("planWarehouseCd");
        this._planWarehouseCd = planWarehouseCd;
    }

    /**
     * [get] PLAN_LOCATION_CD: {varchar(255)} <br>
     * 予定ロケーションCD
     * @return The value of the column 'PLAN_LOCATION_CD'. (NullAllowed)
     */
    public String getPlanLocationCd() {
        return _planLocationCd;
    }

    /**
     * [set] PLAN_LOCATION_CD: {varchar(255)} <br>
     * 予定ロケーションCD
     * @param planLocationCd The value of the column 'PLAN_LOCATION_CD'. (NullAllowed)
     */
    public void setPlanLocationCd(String planLocationCd) {
        __modifiedProperties.add("planLocationCd");
        this._planLocationCd = planLocationCd;
    }

    /**
     * [get] PLAN_LOT: {varchar(255)} <br>
     * 予定ロット
     * @return The value of the column 'PLAN_LOT'. (NullAllowed)
     */
    public String getPlanLot() {
        return _planLot;
    }

    /**
     * [set] PLAN_LOT: {varchar(255)} <br>
     * 予定ロット
     * @param planLot The value of the column 'PLAN_LOT'. (NullAllowed)
     */
    public void setPlanLot(String planLot) {
        __modifiedProperties.add("planLot");
        this._planLot = planLot;
    }

    /**
     * [get] PLAN_LIMIT_DT: {varchar(255)} <br>
     * 予定期限日
     * @return The value of the column 'PLAN_LIMIT_DT'. (NullAllowed)
     */
    public String getPlanLimitDt() {
        return _planLimitDt;
    }

    /**
     * [set] PLAN_LIMIT_DT: {varchar(255)} <br>
     * 予定期限日
     * @param planLimitDt The value of the column 'PLAN_LIMIT_DT'. (NullAllowed)
     */
    public void setPlanLimitDt(String planLimitDt) {
        __modifiedProperties.add("planLimitDt");
        this._planLimitDt = planLimitDt;
    }

    /**
     * [get] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * 予定顧客発注№
     * @return The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed)
     */
    public String getPlanClientOrderNo() {
        return _planClientOrderNo;
    }

    /**
     * [set] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * 予定顧客発注№
     * @param planClientOrderNo The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed)
     */
    public void setPlanClientOrderNo(String planClientOrderNo) {
        __modifiedProperties.add("planClientOrderNo");
        this._planClientOrderNo = planClientOrderNo;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public String getSpareStr1() {
        return _spareStr1;
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public void setSpareStr1(String spareStr1) {
        __modifiedProperties.add("spareStr1");
        this._spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public String getSpareStr2() {
        return _spareStr2;
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public void setSpareStr2(String spareStr2) {
        __modifiedProperties.add("spareStr2");
        this._spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public String getSpareStr3() {
        return _spareStr3;
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public void setSpareStr3(String spareStr3) {
        __modifiedProperties.add("spareStr3");
        this._spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * 予備項目１（数値）
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public String getSpareNum1() {
        return _spareNum1;
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * 予備項目１（数値）
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public void setSpareNum1(String spareNum1) {
        __modifiedProperties.add("spareNum1");
        this._spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * 予備項目２（数値）
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public String getSpareNum2() {
        return _spareNum2;
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * 予備項目２（数値）
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public void setSpareNum2(String spareNum2) {
        __modifiedProperties.add("spareNum2");
        this._spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * 予備項目３（数値）
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public String getSpareNum3() {
        return _spareNum3;
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * 予備項目３（数値）
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public void setSpareNum3(String spareNum3) {
        __modifiedProperties.add("spareNum3");
        this._spareNum3 = spareNum3;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
