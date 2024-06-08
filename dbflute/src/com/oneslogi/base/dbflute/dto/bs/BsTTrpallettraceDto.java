package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRPALLETTRACE as TABLE. <br>
 * パレット追跡情報
 * <pre>
 * [primary-key]
 *     TRPALLETTRACE_ID
 *
 * [column]
 *     TRPALLETTRACE_ID, PALLETTRACENO, PALLETTRACETYPE, PARENTPALLETNO, CHILDPALLETNO, PICKLISTKEY, PICKLISTGNO, CREATEDATETIME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLETTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrpallettraceDto implements Serializable {

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
    /** TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trpallettraceId;

    /** PALLETTRACENO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pallettraceno;

    /** PALLETTRACETYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pallettracetype;

    /** PARENTPALLETNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _parentpalletno;

    /** CHILDPALLETNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _childpalletno;

    /** PICKLISTKEY: {bigint(19)} */
    @JsonKey
    protected Long _picklistkey;

    /** PICKLISTGNO: {bigint(19)} */
    @JsonKey
    protected Long _picklistgno;

    /** CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]} */
    @JsonKey
    protected String _createdatetime;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

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
    public BsTTrpallettraceDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrpallettraceDto)) { return false; }
        final BsTTrpallettraceDto otherEntity = (BsTTrpallettraceDto)other;
        if (!helpComparingValue(getTrpallettraceId(), otherEntity.getTrpallettraceId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPALLETTRACE");
        result = xCH(result, getTrpallettraceId());
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
        sb.append(c).append(getTrpallettraceId());
        sb.append(c).append(getPallettraceno());
        sb.append(c).append(getPallettracetype());
        sb.append(c).append(getParentpalletno());
        sb.append(c).append(getChildpalletno());
        sb.append(c).append(getPicklistkey());
        sb.append(c).append(getPicklistgno());
        sb.append(c).append(getCreatedatetime());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレット追跡情報ID
     * @return The value of the column 'TRPALLETTRACE_ID'. (NullAllowed)
     */
    public Long getTrpallettraceId() {
        return _trpallettraceId;
    }

    /**
     * [set] TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレット追跡情報ID
     * @param trpallettraceId The value of the column 'TRPALLETTRACE_ID'. (NullAllowed)
     */
    public void setTrpallettraceId(Long trpallettraceId) {
        __modifiedProperties.add("trpallettraceId");
        this._trpallettraceId = trpallettraceId;
    }

    /**
     * [get] PALLETTRACENO: {NotNull, decimal(16, 6)} <br>
     * パレット追跡番号
     * @return The value of the column 'PALLETTRACENO'. (NullAllowed)
     */
    public java.math.BigDecimal getPallettraceno() {
        return _pallettraceno;
    }

    /**
     * [set] PALLETTRACENO: {NotNull, decimal(16, 6)} <br>
     * パレット追跡番号
     * @param pallettraceno The value of the column 'PALLETTRACENO'. (NullAllowed)
     */
    public void setPallettraceno(java.math.BigDecimal pallettraceno) {
        __modifiedProperties.add("pallettraceno");
        this._pallettraceno = pallettraceno;
    }

    /**
     * [get] PALLETTRACETYPE: {NotNull, varchar(30)} <br>
     * パレット追跡区分
     * @return The value of the column 'PALLETTRACETYPE'. (NullAllowed)
     */
    public String getPallettracetype() {
        return _pallettracetype;
    }

    /**
     * [set] PALLETTRACETYPE: {NotNull, varchar(30)} <br>
     * パレット追跡区分
     * @param pallettracetype The value of the column 'PALLETTRACETYPE'. (NullAllowed)
     */
    public void setPallettracetype(String pallettracetype) {
        __modifiedProperties.add("pallettracetype");
        this._pallettracetype = pallettracetype;
    }

    /**
     * [get] PARENTPALLETNO: {decimal(16, 6)} <br>
     * 親パレット管理番号
     * @return The value of the column 'PARENTPALLETNO'. (NullAllowed)
     */
    public java.math.BigDecimal getParentpalletno() {
        return _parentpalletno;
    }

    /**
     * [set] PARENTPALLETNO: {decimal(16, 6)} <br>
     * 親パレット管理番号
     * @param parentpalletno The value of the column 'PARENTPALLETNO'. (NullAllowed)
     */
    public void setParentpalletno(java.math.BigDecimal parentpalletno) {
        __modifiedProperties.add("parentpalletno");
        this._parentpalletno = parentpalletno;
    }

    /**
     * [get] CHILDPALLETNO: {decimal(16, 6)} <br>
     * 子パレット管理番号
     * @return The value of the column 'CHILDPALLETNO'. (NullAllowed)
     */
    public java.math.BigDecimal getChildpalletno() {
        return _childpalletno;
    }

    /**
     * [set] CHILDPALLETNO: {decimal(16, 6)} <br>
     * 子パレット管理番号
     * @param childpalletno The value of the column 'CHILDPALLETNO'. (NullAllowed)
     */
    public void setChildpalletno(java.math.BigDecimal childpalletno) {
        __modifiedProperties.add("childpalletno");
        this._childpalletno = childpalletno;
    }

    /**
     * [get] PICKLISTKEY: {bigint(19)} <br>
     * 山出しリスト№
     * @return The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public Long getPicklistkey() {
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {bigint(19)} <br>
     * 山出しリスト№
     * @param picklistkey The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public void setPicklistkey(Long picklistkey) {
        __modifiedProperties.add("picklistkey");
        this._picklistkey = picklistkey;
    }

    /**
     * [get] PICKLISTGNO: {bigint(19)} <br>
     * 山出しリスト明細行№
     * @return The value of the column 'PICKLISTGNO'. (NullAllowed)
     */
    public Long getPicklistgno() {
        return _picklistgno;
    }

    /**
     * [set] PICKLISTGNO: {bigint(19)} <br>
     * 山出しリスト明細行№
     * @param picklistgno The value of the column 'PICKLISTGNO'. (NullAllowed)
     */
    public void setPicklistgno(Long picklistgno) {
        __modifiedProperties.add("picklistgno");
        this._picklistgno = picklistgno;
    }

    /**
     * [get] CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public String getCreatedatetime() {
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public void setCreatedatetime(String createdatetime) {
        __modifiedProperties.add("createdatetime");
        this._createdatetime = createdatetime;
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
