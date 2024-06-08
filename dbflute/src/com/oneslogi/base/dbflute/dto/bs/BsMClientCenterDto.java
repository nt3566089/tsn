package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CLIENT_CENTER as TABLE. <br>
 * 荷主拠点マスタ
 * <pre>
 * [primary-key]
 *     CLIENT_CENTER_ID
 *
 * [column]
 *     CLIENT_CENTER_ID, CLIENT_ID, CENTER_ID, SYSTEM_DT, BATCH_PROGRESS_FLG, BEFORE_SYSTEM_DT, CUSTOMER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CUSTOMER, M_CLIENT, M_CENTER, B_CLASS_DTL(ByBatchProgressFlg), M_PARAM(AsOne)
 *
 * [referrer-table]
 *     M_PARAM
 *
 * [foreign-property]
 *     mCustomer, mClient, mCenter, bClassDtlByBatchProgressFlg, bClassDtlByDelFlg, mParamAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMClientCenterDto implements Serializable {

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
    /** CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _clientCenterId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** SYSTEM_DT: {NotNull, varchar(8)} */
    @JsonKey
    protected String _systemDt;

    /** BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} */
    @JsonKey
    protected String _batchProgressFlg;

    /** BEFORE_SYSTEM_DT: {varchar(8)} */
    @JsonKey
    protected String _beforeSystemDt;

    /** CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _customerId;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMClientCenterDto() {
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
    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected BClassDtlDto _bClassDtlByBatchProgressFlg;

    public BClassDtlDto getBClassDtlByBatchProgressFlg() {
        return _bClassDtlByBatchProgressFlg;
    }

    public void setBClassDtlByBatchProgressFlg(BClassDtlDto bClassDtlByBatchProgressFlg) {
        this._bClassDtlByBatchProgressFlg = bClassDtlByBatchProgressFlg;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected MParamDto _mParamAsOne;

    public MParamDto getMParamAsOne() {
        return _mParamAsOne;
    }

    public void setMParamAsOne(MParamDto MParamAsOne) {
        this._mParamAsOne = MParamAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMClientCenterDto)) { return false; }
        final BsMClientCenterDto otherEntity = (BsMClientCenterDto)other;
        if (!helpComparingValue(getClientCenterId(), otherEntity.getClientCenterId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CLIENT_CENTER");
        result = xCH(result, getClientCenterId());
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
        sb.append(c).append(getClientCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getSystemDt());
        sb.append(c).append(getBatchProgressFlg());
        sb.append(c).append(getBeforeSystemDt());
        sb.append(c).append(getCustomerId());
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
     * [get] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主拠点ID
     * @return The value of the column 'CLIENT_CENTER_ID'. (NullAllowed)
     */
    public Long getClientCenterId() {
        return _clientCenterId;
    }

    /**
     * [set] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主拠点ID
     * @param clientCenterId The value of the column 'CLIENT_CENTER_ID'. (NullAllowed)
     */
    public void setClientCenterId(Long clientCenterId) {
        __modifiedProperties.add("clientCenterId");
        this._clientCenterId = clientCenterId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * システム管理日付
     * @return The value of the column 'SYSTEM_DT'. (NullAllowed)
     */
    public String getSystemDt() {
        return _systemDt;
    }

    /**
     * [set] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * システム管理日付
     * @param systemDt The value of the column 'SYSTEM_DT'. (NullAllowed)
     */
    public void setSystemDt(String systemDt) {
        __modifiedProperties.add("systemDt");
        this._systemDt = systemDt;
    }

    /**
     * [get] BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @return The value of the column 'BATCH_PROGRESS_FLG'. (NullAllowed)
     */
    public String getBatchProgressFlg() {
        return _batchProgressFlg;
    }

    /**
     * [set] BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param batchProgressFlg The value of the column 'BATCH_PROGRESS_FLG'. (NullAllowed)
     */
    public void setBatchProgressFlg(String batchProgressFlg) {
        __modifiedProperties.add("batchProgressFlg");
        this._batchProgressFlg = batchProgressFlg;
    }

    /**
     * [get] BEFORE_SYSTEM_DT: {varchar(8)} <br>
     * 前回システム管理日付
     * @return The value of the column 'BEFORE_SYSTEM_DT'. (NullAllowed)
     */
    public String getBeforeSystemDt() {
        return _beforeSystemDt;
    }

    /**
     * [set] BEFORE_SYSTEM_DT: {varchar(8)} <br>
     * 前回システム管理日付
     * @param beforeSystemDt The value of the column 'BEFORE_SYSTEM_DT'. (NullAllowed)
     */
    public void setBeforeSystemDt(String beforeSystemDt) {
        __modifiedProperties.add("beforeSystemDt");
        this._beforeSystemDt = beforeSystemDt;
    }

    /**
     * [get] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 拠点取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 拠点取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
