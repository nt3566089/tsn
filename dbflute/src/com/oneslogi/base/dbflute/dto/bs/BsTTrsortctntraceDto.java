package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSORTCTNTRACE as TABLE. <br>
 * 仕分場カートン詰合せ履歴管理
 * <pre>
 * [primary-key]
 *     SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID
 *
 * [column]
 *     SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID, SEQNO, CENTER_SYMBOL_ID, FROM_CENTER_SYMBOL_ID, MOVEQTYBOWL, SORTEDQTYBOWL, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID
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
public abstract class BsTTrsortctntraceDto implements Serializable {

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
    /** SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sortPlaceCartonAssortLogManageId;

    /** SEQNO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _seqno;

    /** CENTER_SYMBOL_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _centerSymbolId;

    /** FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _fromCenterSymbolId;

    /** MOVEQTYBOWL: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _moveqtybowl;

    /** SORTEDQTYBOWL: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sortedqtybowl;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
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
    public BsTTrsortctntraceDto() {
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
        if (other == null || !(other instanceof BsTTrsortctntraceDto)) { return false; }
        final BsTTrsortctntraceDto otherEntity = (BsTTrsortctntraceDto)other;
        if (!helpComparingValue(getSortPlaceCartonAssortLogManageId(), otherEntity.getSortPlaceCartonAssortLogManageId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSORTCTNTRACE");
        result = xCH(result, getSortPlaceCartonAssortLogManageId());
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
        sb.append(c).append(getSortPlaceCartonAssortLogManageId());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getCenterSymbolId());
        sb.append(c).append(getFromCenterSymbolId());
        sb.append(c).append(getMoveqtybowl());
        sb.append(c).append(getSortedqtybowl());
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
     * [get] SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分場カートン詰合せ履歴管理テーブルID
     * @return The value of the column 'SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID'. (NullAllowed)
     */
    public Long getSortPlaceCartonAssortLogManageId() {
        return _sortPlaceCartonAssortLogManageId;
    }

    /**
     * [set] SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分場カートン詰合せ履歴管理テーブルID
     * @param sortPlaceCartonAssortLogManageId The value of the column 'SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID'. (NullAllowed)
     */
    public void setSortPlaceCartonAssortLogManageId(Long sortPlaceCartonAssortLogManageId) {
        __modifiedProperties.add("sortPlaceCartonAssortLogManageId");
        this._sortPlaceCartonAssortLogManageId = sortPlaceCartonAssortLogManageId;
    }

    /**
     * [get] SEQNO: {NotNull, bigint(19)} <br>
     * シーケンスキー
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public Long getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {NotNull, bigint(19)} <br>
     * シーケンスキー
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(Long seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, bigint(19)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public Long getCenterSymbolId() {
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, bigint(19)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setCenterSymbolId(Long centerSymbolId) {
        __modifiedProperties.add("centerSymbolId");
        this._centerSymbolId = centerSymbolId;
    }

    /**
     * [get] FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} <br>
     * 詰合せ元拠点シンボルID
     * @return The value of the column 'FROM_CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public Long getFromCenterSymbolId() {
        return _fromCenterSymbolId;
    }

    /**
     * [set] FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} <br>
     * 詰合せ元拠点シンボルID
     * @param fromCenterSymbolId The value of the column 'FROM_CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setFromCenterSymbolId(Long fromCenterSymbolId) {
        __modifiedProperties.add("fromCenterSymbolId");
        this._fromCenterSymbolId = fromCenterSymbolId;
    }

    /**
     * [get] MOVEQTYBOWL: {NotNull, bigint(19)} <br>
     * 移動数量（カートン）
     * @return The value of the column 'MOVEQTYBOWL'. (NullAllowed)
     */
    public Long getMoveqtybowl() {
        return _moveqtybowl;
    }

    /**
     * [set] MOVEQTYBOWL: {NotNull, bigint(19)} <br>
     * 移動数量（カートン）
     * @param moveqtybowl The value of the column 'MOVEQTYBOWL'. (NullAllowed)
     */
    public void setMoveqtybowl(Long moveqtybowl) {
        __modifiedProperties.add("moveqtybowl");
        this._moveqtybowl = moveqtybowl;
    }

    /**
     * [get] SORTEDQTYBOWL: {NotNull, bigint(19)} <br>
     * 仕分済み数量（カートン）
     * @return The value of the column 'SORTEDQTYBOWL'. (NullAllowed)
     */
    public Long getSortedqtybowl() {
        return _sortedqtybowl;
    }

    /**
     * [set] SORTEDQTYBOWL: {NotNull, bigint(19)} <br>
     * 仕分済み数量（カートン）
     * @param sortedqtybowl The value of the column 'SORTEDQTYBOWL'. (NullAllowed)
     */
    public void setSortedqtybowl(Long sortedqtybowl) {
        __modifiedProperties.add("sortedqtybowl");
        this._sortedqtybowl = sortedqtybowl;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
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
