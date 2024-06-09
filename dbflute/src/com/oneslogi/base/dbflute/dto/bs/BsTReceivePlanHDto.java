package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_RECEIVE_PLAN_H as TABLE. <br>
 * 入荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, T_RECEIVE_PLAN_H, T_PICKING_H, M_CUSTOMER, M_PROCESS_TYPE, M_STOCK_TYPE, B_CLASS_DTL(ByCenterTransitFlg), T_RECEIVE_PLAN_R(AsOne), T_TRRCV(AsOne)
 *
 * [referrer-table]
 *     T_RECEIVE_PLAN_B, T_RECEIVE_PLAN_H, T_STORE_RECORD_H, T_RECEIVE_PLAN_R, T_TRRCV
 *
 * [foreign-property]
 *     mCenter, mClient, tReceivePlanHSelf, tPickingH, mCustomerByPlanDepositId, mCustomerByPlanSupplierId, mProcessType, mStockType, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne, tTrrcvAsOne
 *
 * [referrer-property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTReceivePlanHDto implements Serializable {

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
    /** RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE} */
    @JsonKey
    protected Long _processTypeId;

    /** STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} */
    @JsonKey
    protected Long _stockTypeId;

    /** RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _receivePlanDt;

    /** PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)} */
    @JsonKey
    protected String _planClientReceiveNo;

    /** RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveSlipNo;

    /** PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _planSupplierId;

    /** PLAN_SUPPLIER_CD: {IX, varchar(30)} */
    @JsonKey
    protected String _planSupplierCd;

    /** PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _planDepositId;

    /** PLAN_DEPOSIT_CD: {varchar(30)} */
    @JsonKey
    protected String _planDepositCd;

    /** RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} */
    @JsonKey
    protected String _receiveStatus;

    /** INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} */
    @JsonKey
    protected String _receiveDeliveryStatus;

    /** OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H} */
    @JsonKey
    protected Long _oldReceivePlanHId;

    /** ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} */
    @JsonKey
    protected String _centerTransitFlg;

    /** PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} */
    @JsonKey
    protected Long _pickingHId;

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
    public BsTReceivePlanHDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected TReceivePlanHDto _tReceivePlanHSelf;

    public TReceivePlanHDto getTReceivePlanHSelf() {
        return _tReceivePlanHSelf;
    }

    public void setTReceivePlanHSelf(TReceivePlanHDto tReceivePlanHSelf) {
        this._tReceivePlanHSelf = tReceivePlanHSelf;
    }

    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected MCustomerDto _mCustomerByPlanDepositId;

    public MCustomerDto getMCustomerByPlanDepositId() {
        return _mCustomerByPlanDepositId;
    }

    public void setMCustomerByPlanDepositId(MCustomerDto mCustomerByPlanDepositId) {
        this._mCustomerByPlanDepositId = mCustomerByPlanDepositId;
    }

    protected MCustomerDto _mCustomerByPlanSupplierId;

    public MCustomerDto getMCustomerByPlanSupplierId() {
        return _mCustomerByPlanSupplierId;
    }

    public void setMCustomerByPlanSupplierId(MCustomerDto mCustomerByPlanSupplierId) {
        this._mCustomerByPlanSupplierId = mCustomerByPlanSupplierId;
    }

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected BClassDtlDto _bClassDtlByCenterTransitFlg;

    public BClassDtlDto getBClassDtlByCenterTransitFlg() {
        return _bClassDtlByCenterTransitFlg;
    }

    public void setBClassDtlByCenterTransitFlg(BClassDtlDto bClassDtlByCenterTransitFlg) {
        this._bClassDtlByCenterTransitFlg = bClassDtlByCenterTransitFlg;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByReceiveDeliveryStatus;

    public BClassDtlDto getBClassDtlByReceiveDeliveryStatus() {
        return _bClassDtlByReceiveDeliveryStatus;
    }

    public void setBClassDtlByReceiveDeliveryStatus(BClassDtlDto bClassDtlByReceiveDeliveryStatus) {
        this._bClassDtlByReceiveDeliveryStatus = bClassDtlByReceiveDeliveryStatus;
    }

    protected BClassDtlDto _bClassDtlByReceiveStatus;

    public BClassDtlDto getBClassDtlByReceiveStatus() {
        return _bClassDtlByReceiveStatus;
    }

    public void setBClassDtlByReceiveStatus(BClassDtlDto bClassDtlByReceiveStatus) {
        this._bClassDtlByReceiveStatus = bClassDtlByReceiveStatus;
    }

    protected TReceivePlanRDto _tReceivePlanRAsOne;

    public TReceivePlanRDto getTReceivePlanRAsOne() {
        return _tReceivePlanRAsOne;
    }

    public void setTReceivePlanRAsOne(TReceivePlanRDto TReceivePlanRAsOne) {
        this._tReceivePlanRAsOne = TReceivePlanRAsOne;
    }

    protected TTrrcvDto _tTrrcvAsOne;

    public TTrrcvDto getTTrrcvAsOne() {
        return _tTrrcvAsOne;
    }

    public void setTTrrcvAsOne(TTrrcvDto TTrrcvAsOne) {
        this._tTrrcvAsOne = TTrrcvAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TReceivePlanBDto> _tReceivePlanBList;

    public List<TReceivePlanBDto> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = new ArrayList<TReceivePlanBDto>(); }
        return _tReceivePlanBList;
    }

    public void setTReceivePlanBList(List<TReceivePlanBDto> tReceivePlanBList) {
        this._tReceivePlanBList = tReceivePlanBList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHSelfList;

    public List<TReceivePlanHDto> getTReceivePlanHSelfList() {
        if (_tReceivePlanHSelfList == null) { _tReceivePlanHSelfList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHSelfList;
    }

    public void setTReceivePlanHSelfList(List<TReceivePlanHDto> tReceivePlanHSelfList) {
        this._tReceivePlanHSelfList = tReceivePlanHSelfList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTReceivePlanHDto)) { return false; }
        final BsTReceivePlanHDto otherEntity = (BsTReceivePlanHDto)other;
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_RECEIVE_PLAN_H");
        result = xCH(result, getReceivePlanHId());
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
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getReceivePlanDt());
        sb.append(c).append(getPlanClientReceiveNo());
        sb.append(c).append(getReceiveSlipNo());
        sb.append(c).append(getPlanSupplierId());
        sb.append(c).append(getPlanSupplierCd());
        sb.append(c).append(getPlanDepositId());
        sb.append(c).append(getPlanDepositCd());
        sb.append(c).append(getReceiveStatus());
        sb.append(c).append(getInputType());
        sb.append(c).append(getReceiveDeliveryStatus());
        sb.append(c).append(getOldReceivePlanHId());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getCenterTransitFlg());
        sb.append(c).append(getPickingHId());
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
     * [get] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public String getReceivePlanDt() {
        return _receivePlanDt;
    }

    /**
     * [set] RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        __modifiedProperties.add("receivePlanDt");
        this._receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)} <br>
     * 予定顧客入荷指示No.
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public String getPlanClientReceiveNo() {
        return _planClientReceiveNo;
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)} <br>
     * 予定顧客入荷指示No.
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        __modifiedProperties.add("planClientReceiveNo");
        this._planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)} <br>
     * WMS入荷伝票No.
     * @return The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public String getReceiveSlipNo() {
        return _receiveSlipNo;
    }

    /**
     * [set] RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)} <br>
     * WMS入荷伝票No.
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        __modifiedProperties.add("receiveSlipNo");
        this._receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定仕入先ID
     * @return The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed)
     */
    public Long getPlanSupplierId() {
        return _planSupplierId;
    }

    /**
     * [set] PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定仕入先ID
     * @param planSupplierId The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed)
     */
    public void setPlanSupplierId(Long planSupplierId) {
        __modifiedProperties.add("planSupplierId");
        this._planSupplierId = planSupplierId;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {IX, varchar(30)} <br>
     * 予定仕入先CD
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public String getPlanSupplierCd() {
        return _planSupplierCd;
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {IX, varchar(30)} <br>
     * 予定仕入先CD
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        __modifiedProperties.add("planSupplierCd");
        this._planSupplierCd = planSupplierCd;
    }

    /**
     * [get] PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定預託ID
     * @return The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed)
     */
    public Long getPlanDepositId() {
        return _planDepositId;
    }

    /**
     * [set] PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定預託ID
     * @param planDepositId The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed)
     */
    public void setPlanDepositId(Long planDepositId) {
        __modifiedProperties.add("planDepositId");
        this._planDepositId = planDepositId;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {varchar(30)} <br>
     * 予定預託CD
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public String getPlanDepositCd() {
        return _planDepositCd;
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {varchar(30)} <br>
     * 予定預託CD
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public void setPlanDepositCd(String planDepositCd) {
        __modifiedProperties.add("planDepositCd");
        this._planDepositCd = planDepositCd;
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
     * [get] INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @return The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed)
     */
    public String getReceiveDeliveryStatus() {
        return _receiveDeliveryStatus;
    }

    /**
     * [set] RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param receiveDeliveryStatus The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed)
     */
    public void setReceiveDeliveryStatus(String receiveDeliveryStatus) {
        __modifiedProperties.add("receiveDeliveryStatus");
        this._receiveDeliveryStatus = receiveDeliveryStatus;
    }

    /**
     * [get] OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H} <br>
     * 元入荷予定ヘッダID
     * @return The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getOldReceivePlanHId() {
        return _oldReceivePlanHId;
    }

    /**
     * [set] OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H} <br>
     * 元入荷予定ヘッダID
     * @param oldReceivePlanHId The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setOldReceivePlanHId(Long oldReceivePlanHId) {
        __modifiedProperties.add("oldReceivePlanHId");
        this._oldReceivePlanHId = oldReceivePlanHId;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
     * [get] CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * 拠点間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public String getCenterTransitFlg() {
        return _centerTransitFlg;
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * 拠点間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        __modifiedProperties.add("centerTransitFlg");
        this._centerTransitFlg = centerTransitFlg;
    }

    /**
     * [get] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 拠点間移動出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 拠点間移動出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
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
