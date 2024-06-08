package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_RECEIVE_PLAN_R as TABLE. <br>
 * 入荷予定帳票
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, RPL_OUT_FLG, RPL_OUT_USER_ID, RPL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_RECEIVE_PLAN_H, B_USER, B_CLASS_DTL(ByRplOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tReceivePlanH, bUser, bClassDtlByRplOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTReceivePlanRDto implements Serializable {

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
    /** RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_H} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _rplOutFlg;

    /** RPL_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _rplOutUserId;

    /** RPL_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _rplOutDt;

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
    public BsTReceivePlanRDto() {
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
    protected TReceivePlanHDto _tReceivePlanH;

    public TReceivePlanHDto getTReceivePlanH() {
        return _tReceivePlanH;
    }

    public void setTReceivePlanH(TReceivePlanHDto tReceivePlanH) {
        this._tReceivePlanH = tReceivePlanH;
    }

    protected BUserDto _bUser;

    public BUserDto getBUser() {
        return _bUser;
    }

    public void setBUser(BUserDto bUser) {
        this._bUser = bUser;
    }

    protected BClassDtlDto _bClassDtlByRplOutFlg;

    public BClassDtlDto getBClassDtlByRplOutFlg() {
        return _bClassDtlByRplOutFlg;
    }

    public void setBClassDtlByRplOutFlg(BClassDtlDto bClassDtlByRplOutFlg) {
        this._bClassDtlByRplOutFlg = bClassDtlByRplOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTReceivePlanRDto)) { return false; }
        final BsTReceivePlanRDto otherEntity = (BsTReceivePlanRDto)other;
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_RECEIVE_PLAN_R");
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
        sb.append(c).append(getRplOutFlg());
        sb.append(c).append(getRplOutUserId());
        sb.append(c).append(getRplOutDt());
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
     * [get] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_H} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_H} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 入荷予定リスト出力フラグ
     * @return The value of the column 'RPL_OUT_FLG'. (NullAllowed)
     */
    public String getRplOutFlg() {
        return _rplOutFlg;
    }

    /**
     * [set] RPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 入荷予定リスト出力フラグ
     * @param rplOutFlg The value of the column 'RPL_OUT_FLG'. (NullAllowed)
     */
    public void setRplOutFlg(String rplOutFlg) {
        __modifiedProperties.add("rplOutFlg");
        this._rplOutFlg = rplOutFlg;
    }

    /**
     * [get] RPL_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 入荷予定リスト出力者ID
     * @return The value of the column 'RPL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getRplOutUserId() {
        return _rplOutUserId;
    }

    /**
     * [set] RPL_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 入荷予定リスト出力者ID
     * @param rplOutUserId The value of the column 'RPL_OUT_USER_ID'. (NullAllowed)
     */
    public void setRplOutUserId(Long rplOutUserId) {
        __modifiedProperties.add("rplOutUserId");
        this._rplOutUserId = rplOutUserId;
    }

    /**
     * [get] RPL_OUT_DT: {datetime2(26, 6)} <br>
     * 入荷予定リスト出力日時
     * @return The value of the column 'RPL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getRplOutDt() {
        return _rplOutDt;
    }

    /**
     * [set] RPL_OUT_DT: {datetime2(26, 6)} <br>
     * 入荷予定リスト出力日時
     * @param rplOutDt The value of the column 'RPL_OUT_DT'. (NullAllowed)
     */
    public void setRplOutDt(java.sql.Timestamp rplOutDt) {
        __modifiedProperties.add("rplOutDt");
        this._rplOutDt = rplOutDt;
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
