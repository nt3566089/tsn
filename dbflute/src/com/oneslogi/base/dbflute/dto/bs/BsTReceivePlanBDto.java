package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_RECEIVE_PLAN_B as TABLE. <br>
 * 入荷予定ボディ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, LINE_NO, RECEIVE_STATUS, PLAN_CLIENT_ORDER_NO, PLAN_WAREHOUSE_ID, PLAN_WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_LOCATION_ID, PLAN_LOCATION_CD, PLAN_STORE_LABEL_NO, PLAN_NUM, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_LOCATION, M_WAREHOUSE, M_PRODUCT, T_RECEIVE_PLAN_H, B_CLASS_DTL(ByErrorFlg), T_RECEIVE_PLAN_SPARE(AsOne), T_TRRCVDETAIL(AsOne)
 *
 * [referrer-table]
 *     T_STORE_RECORD_B, T_RECEIVE_PLAN_SPARE, T_TRRCVDETAIL
 *
 * [foreign-property]
 *     mLocation, mWarehouse, mProduct, tReceivePlanH, bClassDtlByErrorFlg, bClassDtlByReceiveStatus, tReceivePlanSpareAsOne, tTrrcvdetailAsOne
 *
 * [referrer-property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTReceivePlanBDto implements Serializable {

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
    /** RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _receivePlanBId;

    /** RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H} */
    @JsonKey
    protected Long _receivePlanHId;

    /** LINE_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} */
    @JsonKey
    protected String _receiveStatus;

    /** PLAN_CLIENT_ORDER_NO: {IX, varchar(30)} */
    @JsonKey
    protected String _planClientOrderNo;

    /** PLAN_WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} */
    @JsonKey
    protected Long _planWarehouseId;

    /** PLAN_WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _planWarehouseCd;

    /** PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {IX, NotNull, varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PLAN_LOT: {varchar(30)} */
    @JsonKey
    protected String _planLot;

    /** PLAN_LIMIT_DT: {varchar(8)} */
    @JsonKey
    protected String _planLimitDt;

    /** PLAN_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} */
    @JsonKey
    protected Long _planLocationId;

    /** PLAN_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _planLocationCd;

    /** PLAN_STORE_LABEL_NO: {varchar(30)} */
    @JsonKey
    protected String _planStoreLabelNo;

    /** PLAN_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _planNum;

    /** ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

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
    public BsTReceivePlanBDto() {
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
    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected MWarehouseDto _mWarehouse;

    public MWarehouseDto getMWarehouse() {
        return _mWarehouse;
    }

    public void setMWarehouse(MWarehouseDto mWarehouse) {
        this._mWarehouse = mWarehouse;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected TReceivePlanHDto _tReceivePlanH;

    public TReceivePlanHDto getTReceivePlanH() {
        return _tReceivePlanH;
    }

    public void setTReceivePlanH(TReceivePlanHDto tReceivePlanH) {
        this._tReceivePlanH = tReceivePlanH;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    protected BClassDtlDto _bClassDtlByReceiveStatus;

    public BClassDtlDto getBClassDtlByReceiveStatus() {
        return _bClassDtlByReceiveStatus;
    }

    public void setBClassDtlByReceiveStatus(BClassDtlDto bClassDtlByReceiveStatus) {
        this._bClassDtlByReceiveStatus = bClassDtlByReceiveStatus;
    }

    protected TReceivePlanSpareDto _tReceivePlanSpareAsOne;

    public TReceivePlanSpareDto getTReceivePlanSpareAsOne() {
        return _tReceivePlanSpareAsOne;
    }

    public void setTReceivePlanSpareAsOne(TReceivePlanSpareDto TReceivePlanSpareAsOne) {
        this._tReceivePlanSpareAsOne = TReceivePlanSpareAsOne;
    }

    protected TTrrcvdetailDto _tTrrcvdetailAsOne;

    public TTrrcvdetailDto getTTrrcvdetailAsOne() {
        return _tTrrcvdetailAsOne;
    }

    public void setTTrrcvdetailAsOne(TTrrcvdetailDto TTrrcvdetailAsOne) {
        this._tTrrcvdetailAsOne = TTrrcvdetailAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TStoreRecordBDto> _tStoreRecordBList;

    public List<TStoreRecordBDto> getTStoreRecordBList() {
        if (_tStoreRecordBList == null) { _tStoreRecordBList = new ArrayList<TStoreRecordBDto>(); }
        return _tStoreRecordBList;
    }

    public void setTStoreRecordBList(List<TStoreRecordBDto> tStoreRecordBList) {
        this._tStoreRecordBList = tStoreRecordBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTReceivePlanBDto)) { return false; }
        final BsTReceivePlanBDto otherEntity = (BsTReceivePlanBDto)other;
        if (!helpComparingValue(getReceivePlanBId(), otherEntity.getReceivePlanBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_RECEIVE_PLAN_B");
        result = xCH(result, getReceivePlanBId());
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
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getReceiveStatus());
        sb.append(c).append(getPlanClientOrderNo());
        sb.append(c).append(getPlanWarehouseId());
        sb.append(c).append(getPlanWarehouseCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getPlanLot());
        sb.append(c).append(getPlanLimitDt());
        sb.append(c).append(getPlanLocationId());
        sb.append(c).append(getPlanLocationCd());
        sb.append(c).append(getPlanStoreLabelNo());
        sb.append(c).append(getPlanNum());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
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
     * [get] RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 行No.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 行No.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @return The value of the column 'RECEIVE_STATUS'. (NullAllowed)
     */
    public String getReceiveStatus() {
        return _receiveStatus;
    }

    /**
     * [set] RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param receiveStatus The value of the column 'RECEIVE_STATUS'. (NullAllowed)
     */
    public void setReceiveStatus(String receiveStatus) {
        __modifiedProperties.add("receiveStatus");
        this._receiveStatus = receiveStatus;
    }

    /**
     * [get] PLAN_CLIENT_ORDER_NO: {IX, varchar(30)} <br>
     * 予定顧客発注No.
     * @return The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed)
     */
    public String getPlanClientOrderNo() {
        return _planClientOrderNo;
    }

    /**
     * [set] PLAN_CLIENT_ORDER_NO: {IX, varchar(30)} <br>
     * 予定顧客発注No.
     * @param planClientOrderNo The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed)
     */
    public void setPlanClientOrderNo(String planClientOrderNo) {
        __modifiedProperties.add("planClientOrderNo");
        this._planClientOrderNo = planClientOrderNo;
    }

    /**
     * [get] PLAN_WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} <br>
     * 予定倉庫ID
     * @return The value of the column 'PLAN_WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getPlanWarehouseId() {
        return _planWarehouseId;
    }

    /**
     * [set] PLAN_WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} <br>
     * 予定倉庫ID
     * @param planWarehouseId The value of the column 'PLAN_WAREHOUSE_ID'. (NullAllowed)
     */
    public void setPlanWarehouseId(Long planWarehouseId) {
        __modifiedProperties.add("planWarehouseId");
        this._planWarehouseId = planWarehouseId;
    }

    /**
     * [get] PLAN_WAREHOUSE_CD: {varchar(30)} <br>
     * 予定倉庫CD
     * @return The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getPlanWarehouseCd() {
        return _planWarehouseCd;
    }

    /**
     * [set] PLAN_WAREHOUSE_CD: {varchar(30)} <br>
     * 予定倉庫CD
     * @param planWarehouseCd The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setPlanWarehouseCd(String planWarehouseCd) {
        __modifiedProperties.add("planWarehouseCd");
        this._planWarehouseCd = planWarehouseCd;
    }

    /**
     * [get] PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {IX, NotNull, varchar(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {IX, NotNull, varchar(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PLAN_LOT: {varchar(30)} <br>
     * 予定ロット
     * @return The value of the column 'PLAN_LOT'. (NullAllowed)
     */
    public String getPlanLot() {
        return _planLot;
    }

    /**
     * [set] PLAN_LOT: {varchar(30)} <br>
     * 予定ロット
     * @param planLot The value of the column 'PLAN_LOT'. (NullAllowed)
     */
    public void setPlanLot(String planLot) {
        __modifiedProperties.add("planLot");
        this._planLot = planLot;
    }

    /**
     * [get] PLAN_LIMIT_DT: {varchar(8)} <br>
     * 予定期限日
     * @return The value of the column 'PLAN_LIMIT_DT'. (NullAllowed)
     */
    public String getPlanLimitDt() {
        return _planLimitDt;
    }

    /**
     * [set] PLAN_LIMIT_DT: {varchar(8)} <br>
     * 予定期限日
     * @param planLimitDt The value of the column 'PLAN_LIMIT_DT'. (NullAllowed)
     */
    public void setPlanLimitDt(String planLimitDt) {
        __modifiedProperties.add("planLimitDt");
        this._planLimitDt = planLimitDt;
    }

    /**
     * [get] PLAN_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * 予定ロケーションID
     * @return The value of the column 'PLAN_LOCATION_ID'. (NullAllowed)
     */
    public Long getPlanLocationId() {
        return _planLocationId;
    }

    /**
     * [set] PLAN_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * 予定ロケーションID
     * @param planLocationId The value of the column 'PLAN_LOCATION_ID'. (NullAllowed)
     */
    public void setPlanLocationId(Long planLocationId) {
        __modifiedProperties.add("planLocationId");
        this._planLocationId = planLocationId;
    }

    /**
     * [get] PLAN_LOCATION_CD: {varchar(30)} <br>
     * 予定ロケーションCD
     * @return The value of the column 'PLAN_LOCATION_CD'. (NullAllowed)
     */
    public String getPlanLocationCd() {
        return _planLocationCd;
    }

    /**
     * [set] PLAN_LOCATION_CD: {varchar(30)} <br>
     * 予定ロケーションCD
     * @param planLocationCd The value of the column 'PLAN_LOCATION_CD'. (NullAllowed)
     */
    public void setPlanLocationCd(String planLocationCd) {
        __modifiedProperties.add("planLocationCd");
        this._planLocationCd = planLocationCd;
    }

    /**
     * [get] PLAN_STORE_LABEL_NO: {varchar(30)} <br>
     * 予定入庫ラベルNo.
     * @return The value of the column 'PLAN_STORE_LABEL_NO'. (NullAllowed)
     */
    public String getPlanStoreLabelNo() {
        return _planStoreLabelNo;
    }

    /**
     * [set] PLAN_STORE_LABEL_NO: {varchar(30)} <br>
     * 予定入庫ラベルNo.
     * @param planStoreLabelNo The value of the column 'PLAN_STORE_LABEL_NO'. (NullAllowed)
     */
    public void setPlanStoreLabelNo(String planStoreLabelNo) {
        __modifiedProperties.add("planStoreLabelNo");
        this._planStoreLabelNo = planStoreLabelNo;
    }

    /**
     * [get] PLAN_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 予定数
     * @return The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPlanNum() {
        return _planNum;
    }

    /**
     * [set] PLAN_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 予定数
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public void setPlanNum(java.math.BigDecimal planNum) {
        __modifiedProperties.add("planNum");
        this._planNum = planNum;
    }

    /**
     * [get] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
