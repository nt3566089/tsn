package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_MOVE_INST_B_SUB as TABLE. <br>
 * 在庫移動指示ボディ明細
 * <pre>
 * [primary-key]
 *     T_MOVE_INST_B_SUB_ID
 *
 * [column]
 *     T_MOVE_INST_B_SUB_ID, T_MOVE_INST_B_ID, TRPALLET_ID, TRSYMBOL_ID, MOVE_INST_STATUS, INST_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_MOVE_INST_B_SUB_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_MOVE_INST_B
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tMoveInstB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTMoveInstBSubDto implements Serializable {

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
    /** T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B} */
    @JsonKey
    protected Long _tMoveInstBSubId;

    /** T_MOVE_INST_B_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _tMoveInstBId;

    /** TRPALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _trpalletId;

    /** TRSYMBOL_ID: {bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** MOVE_INST_STATUS: {varchar(30)} */
    @JsonKey
    protected String _moveInstStatus;

    /** INST_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

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
    public BsTMoveInstBSubDto() {
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
    protected TMoveInstBDto _tMoveInstB;

    public TMoveInstBDto getTMoveInstB() {
        return _tMoveInstB;
    }

    public void setTMoveInstB(TMoveInstBDto tMoveInstB) {
        this._tMoveInstB = tMoveInstB;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTMoveInstBSubDto)) { return false; }
        final BsTMoveInstBSubDto otherEntity = (BsTMoveInstBSubDto)other;
        if (!helpComparingValue(getTMoveInstBSubId(), otherEntity.getTMoveInstBSubId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_MOVE_INST_B_SUB");
        result = xCH(result, getTMoveInstBSubId());
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
        sb.append(c).append(getTMoveInstBSubId());
        sb.append(c).append(getTMoveInstBId());
        sb.append(c).append(getTrpalletId());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getMoveInstStatus());
        sb.append(c).append(getInstNum());
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
     * [get] T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B} <br>
     * 在庫移動指示ボディ明細ID
     * @return The value of the column 'T_MOVE_INST_B_SUB_ID'. (NullAllowed)
     */
    public Long getTMoveInstBSubId() {
        return _tMoveInstBSubId;
    }

    /**
     * [set] T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B} <br>
     * 在庫移動指示ボディ明細ID
     * @param tMoveInstBSubId The value of the column 'T_MOVE_INST_B_SUB_ID'. (NullAllowed)
     */
    public void setTMoveInstBSubId(Long tMoveInstBSubId) {
        __modifiedProperties.add("TMoveInstBSubId");
        this._tMoveInstBSubId = tMoveInstBSubId;
    }

    /**
     * [get] T_MOVE_INST_B_ID: {NotNull, bigint(19)} <br>
     * 在庫移動指示ボディID
     * @return The value of the column 'T_MOVE_INST_B_ID'. (NullAllowed)
     */
    public Long getTMoveInstBId() {
        return _tMoveInstBId;
    }

    /**
     * [set] T_MOVE_INST_B_ID: {NotNull, bigint(19)} <br>
     * 在庫移動指示ボディID
     * @param tMoveInstBId The value of the column 'T_MOVE_INST_B_ID'. (NullAllowed)
     */
    public void setTMoveInstBId(Long tMoveInstBId) {
        __modifiedProperties.add("TMoveInstBId");
        this._tMoveInstBId = tMoveInstBId;
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
     * [get] TRSYMBOL_ID: {bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] MOVE_INST_STATUS: {varchar(30)} <br>
     * 在庫移動指示明細ステータス
     * @return The value of the column 'MOVE_INST_STATUS'. (NullAllowed)
     */
    public String getMoveInstStatus() {
        return _moveInstStatus;
    }

    /**
     * [set] MOVE_INST_STATUS: {varchar(30)} <br>
     * 在庫移動指示明細ステータス
     * @param moveInstStatus The value of the column 'MOVE_INST_STATUS'. (NullAllowed)
     */
    public void setMoveInstStatus(String moveInstStatus) {
        __modifiedProperties.add("moveInstStatus");
        this._moveInstStatus = moveInstStatus;
    }

    /**
     * [get] INST_NUM: {decimal(16, 6)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(16, 6)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
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
