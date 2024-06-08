package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRSYMBOLTRACEEXTEND as TABLE. <br>
 * 段ボール追跡情報拡張
 * <pre>
 * [primary-key]
 *     TRSYMBOLTRACEEXTEND_ID
 *
 * [column]
 *     TRSYMBOLTRACEEXTEND_ID, SYMBOLTRACEKEY, TRSYMBOL_ID, TRPALLET_ID, ASSORTFLG, TRSYMBOL_ID_FROM, TRSYMBOL_ID_TO, QTY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOLTRACEEXTEND_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrsymboltraceextendDto implements Serializable {

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
    /** TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trsymboltraceextendId;

    /** SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _symboltracekey;

    /** TRSYMBOL_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** TRPALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _trpalletId;

    /** ASSORTFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _assortflg;

    /** TRSYMBOL_ID_FROM: {bigint(19)} */
    @JsonKey
    protected Long _trsymbolIdFrom;

    /** TRSYMBOL_ID_TO: {bigint(19)} */
    @JsonKey
    protected Long _trsymbolIdTo;

    /** QTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qty;

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
    public BsTTrsymboltraceextendDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrsymboltraceextendDto)) { return false; }
        final BsTTrsymboltraceextendDto otherEntity = (BsTTrsymboltraceextendDto)other;
        if (!helpComparingValue(getTrsymboltraceextendId(), otherEntity.getTrsymboltraceextendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSYMBOLTRACEEXTEND");
        result = xCH(result, getTrsymboltraceextendId());
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
        sb.append(c).append(getTrsymboltraceextendId());
        sb.append(c).append(getSymboltracekey());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getTrpalletId());
        sb.append(c).append(getAssortflg());
        sb.append(c).append(getTrsymbolIdFrom());
        sb.append(c).append(getTrsymbolIdTo());
        sb.append(c).append(getQty());
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
     * [get] TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 段ボール追跡情報拡張テーブルID
     * @return The value of the column 'TRSYMBOLTRACEEXTEND_ID'. (NullAllowed)
     */
    public Long getTrsymboltraceextendId() {
        return _trsymboltraceextendId;
    }

    /**
     * [set] TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 段ボール追跡情報拡張テーブルID
     * @param trsymboltraceextendId The value of the column 'TRSYMBOLTRACEEXTEND_ID'. (NullAllowed)
     */
    public void setTrsymboltraceextendId(Long trsymboltraceextendId) {
        __modifiedProperties.add("trsymboltraceextendId");
        this._trsymboltraceextendId = trsymboltraceextendId;
    }

    /**
     * [get] SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} <br>
     * 段ボール追跡キー
     * @return The value of the column 'SYMBOLTRACEKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSymboltracekey() {
        return _symboltracekey;
    }

    /**
     * [set] SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} <br>
     * 段ボール追跡キー
     * @param symboltracekey The value of the column 'SYMBOLTRACEKEY'. (NullAllowed)
     */
    public void setSymboltracekey(java.math.BigDecimal symboltracekey) {
        __modifiedProperties.add("symboltracekey");
        this._symboltracekey = symboltracekey;
    }

    /**
     * [get] TRSYMBOL_ID: {NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] TRPALLET_ID: {bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public Long getTrpalletId() {
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public void setTrpalletId(Long trpalletId) {
        __modifiedProperties.add("trpalletId");
        this._trpalletId = trpalletId;
    }

    /**
     * [get] ASSORTFLG: {decimal(16, 6)} <br>
     * 詰合せフラグ
     * @return The value of the column 'ASSORTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getAssortflg() {
        return _assortflg;
    }

    /**
     * [set] ASSORTFLG: {decimal(16, 6)} <br>
     * 詰合せフラグ
     * @param assortflg The value of the column 'ASSORTFLG'. (NullAllowed)
     */
    public void setAssortflg(java.math.BigDecimal assortflg) {
        __modifiedProperties.add("assortflg");
        this._assortflg = assortflg;
    }

    /**
     * [get] TRSYMBOL_ID_FROM: {bigint(19)} <br>
     * 段ボール情報ID（元）
     * @return The value of the column 'TRSYMBOL_ID_FROM'. (NullAllowed)
     */
    public Long getTrsymbolIdFrom() {
        return _trsymbolIdFrom;
    }

    /**
     * [set] TRSYMBOL_ID_FROM: {bigint(19)} <br>
     * 段ボール情報ID（元）
     * @param trsymbolIdFrom The value of the column 'TRSYMBOL_ID_FROM'. (NullAllowed)
     */
    public void setTrsymbolIdFrom(Long trsymbolIdFrom) {
        __modifiedProperties.add("trsymbolIdFrom");
        this._trsymbolIdFrom = trsymbolIdFrom;
    }

    /**
     * [get] TRSYMBOL_ID_TO: {bigint(19)} <br>
     * 段ボール情報ID（先）
     * @return The value of the column 'TRSYMBOL_ID_TO'. (NullAllowed)
     */
    public Long getTrsymbolIdTo() {
        return _trsymbolIdTo;
    }

    /**
     * [set] TRSYMBOL_ID_TO: {bigint(19)} <br>
     * 段ボール情報ID（先）
     * @param trsymbolIdTo The value of the column 'TRSYMBOL_ID_TO'. (NullAllowed)
     */
    public void setTrsymbolIdTo(Long trsymbolIdTo) {
        __modifiedProperties.add("trsymbolIdTo");
        this._trsymbolIdTo = trsymbolIdTo;
    }

    /**
     * [get] QTY: {decimal(16, 6)} <br>
     * 数量
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {decimal(16, 6)} <br>
     * 数量
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(java.math.BigDecimal qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
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
