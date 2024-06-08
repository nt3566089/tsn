package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_BTRPICK as TABLE. <br>
 * ピッキング引当
 * <pre>
 * [primary-key]
 *     PICKING_INST_ID
 *
 * [column]
 *     PICKING_INST_ID, PICKBATCHKEY, PICKBATCHTYPE, PICKBATCHGROUP, PICKDATE, PICKSTARTDATE, NOTES, SHIPDATE, DELIVSCHDATE, ALLOCGROUP, SOID, PICKLINETOTAL, PICKINGWAY, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_ID
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
public abstract class BsTBtrpickDto implements Serializable {

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
    /** PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _pickingInstId;

    /** PICKBATCHKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickbatchkey;

    /** PICKBATCHTYPE: {IX+, varchar(30)} */
    @JsonKey
    protected String _pickbatchtype;

    /** PICKBATCHGROUP: {varchar(60)} */
    @JsonKey
    protected String _pickbatchgroup;

    /** PICKDATE: {IX, NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _pickdate;

    /** PICKSTARTDATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _pickstartdate;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** SHIPDATE: {IX, varchar(8)} */
    @JsonKey
    protected String _shipdate;

    /** DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]} */
    @JsonKey
    protected java.sql.Timestamp _delivschdate;

    /** ALLOCGROUP: {varchar(60)} */
    @JsonKey
    protected String _allocgroup;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** PICKLINETOTAL: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _picklinetotal;

    /** PICKINGWAY: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _pickingway;

    /** EXECKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _execkey;

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
    public BsTBtrpickDto() {
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
        if (other == null || !(other instanceof BsTBtrpickDto)) { return false; }
        final BsTBtrpickDto otherEntity = (BsTBtrpickDto)other;
        if (!helpComparingValue(getPickingInstId(), otherEntity.getPickingInstId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_BTRPICK");
        result = xCH(result, getPickingInstId());
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
        sb.append(c).append(getPickingInstId());
        sb.append(c).append(getPickbatchkey());
        sb.append(c).append(getPickbatchtype());
        sb.append(c).append(getPickbatchgroup());
        sb.append(c).append(getPickdate());
        sb.append(c).append(getPickstartdate());
        sb.append(c).append(getNotes());
        sb.append(c).append(getShipdate());
        sb.append(c).append(getDelivschdate());
        sb.append(c).append(getAllocgroup());
        sb.append(c).append(getSoid());
        sb.append(c).append(getPicklinetotal());
        sb.append(c).append(getPickingway());
        sb.append(c).append(getExeckey());
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
     * [get] PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public Long getPickingInstId() {
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public void setPickingInstId(Long pickingInstId) {
        __modifiedProperties.add("pickingInstId");
        this._pickingInstId = pickingInstId;
    }

    /**
     * [get] PICKBATCHKEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICKBATCHKEY'. (NullAllowed)
     */
    public Long getPickbatchkey() {
        return _pickbatchkey;
    }

    /**
     * [set] PICKBATCHKEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @param pickbatchkey The value of the column 'PICKBATCHKEY'. (NullAllowed)
     */
    public void setPickbatchkey(Long pickbatchkey) {
        __modifiedProperties.add("pickbatchkey");
        this._pickbatchkey = pickbatchkey;
    }

    /**
     * [get] PICKBATCHTYPE: {IX+, varchar(30)} <br>
     * 引当バッチタイプ
     * @return The value of the column 'PICKBATCHTYPE'. (NullAllowed)
     */
    public String getPickbatchtype() {
        return _pickbatchtype;
    }

    /**
     * [set] PICKBATCHTYPE: {IX+, varchar(30)} <br>
     * 引当バッチタイプ
     * @param pickbatchtype The value of the column 'PICKBATCHTYPE'. (NullAllowed)
     */
    public void setPickbatchtype(String pickbatchtype) {
        __modifiedProperties.add("pickbatchtype");
        this._pickbatchtype = pickbatchtype;
    }

    /**
     * [get] PICKBATCHGROUP: {varchar(60)} <br>
     * 引当バッチグループ
     * @return The value of the column 'PICKBATCHGROUP'. (NullAllowed)
     */
    public String getPickbatchgroup() {
        return _pickbatchgroup;
    }

    /**
     * [set] PICKBATCHGROUP: {varchar(60)} <br>
     * 引当バッチグループ
     * @param pickbatchgroup The value of the column 'PICKBATCHGROUP'. (NullAllowed)
     */
    public void setPickbatchgroup(String pickbatchgroup) {
        __modifiedProperties.add("pickbatchgroup");
        this._pickbatchgroup = pickbatchgroup;
    }

    /**
     * [get] PICKDATE: {IX, NotNull, datetime2(26, 6)} <br>
     * ピッキング指示日・時刻
     * @return The value of the column 'PICKDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPickdate() {
        return _pickdate;
    }

    /**
     * [set] PICKDATE: {IX, NotNull, datetime2(26, 6)} <br>
     * ピッキング指示日・時刻
     * @param pickdate The value of the column 'PICKDATE'. (NullAllowed)
     */
    public void setPickdate(java.sql.Timestamp pickdate) {
        __modifiedProperties.add("pickdate");
        this._pickdate = pickdate;
    }

    /**
     * [get] PICKSTARTDATE: {datetime2(26, 6)} <br>
     * ピッキング開始予定日・時刻
     * @return The value of the column 'PICKSTARTDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPickstartdate() {
        return _pickstartdate;
    }

    /**
     * [set] PICKSTARTDATE: {datetime2(26, 6)} <br>
     * ピッキング開始予定日・時刻
     * @param pickstartdate The value of the column 'PICKSTARTDATE'. (NullAllowed)
     */
    public void setPickstartdate(java.sql.Timestamp pickstartdate) {
        __modifiedProperties.add("pickstartdate");
        this._pickstartdate = pickstartdate;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫日
     * @return The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public String getShipdate() {
        return _shipdate;
    }

    /**
     * [set] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public void setShipdate(String shipdate) {
        __modifiedProperties.add("shipdate");
        this._shipdate = shipdate;
    }

    /**
     * [get] DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]} <br>
     * 納品指定日・時刻
     * @return The value of the column 'DELIVSCHDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getDelivschdate() {
        return _delivschdate;
    }

    /**
     * [set] DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]} <br>
     * 納品指定日・時刻
     * @param delivschdate The value of the column 'DELIVSCHDATE'. (NullAllowed)
     */
    public void setDelivschdate(java.sql.Timestamp delivschdate) {
        __modifiedProperties.add("delivschdate");
        this._delivschdate = delivschdate;
    }

    /**
     * [get] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @return The value of the column 'ALLOCGROUP'. (NullAllowed)
     */
    public String getAllocgroup() {
        return _allocgroup;
    }

    /**
     * [set] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @param allocgroup The value of the column 'ALLOCGROUP'. (NullAllowed)
     */
    public void setAllocgroup(String allocgroup) {
        __modifiedProperties.add("allocgroup");
        this._allocgroup = allocgroup;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] PICKLINETOTAL: {bigint(19), default=[(0)]} <br>
     * ピッキング引当総行数
     * @return The value of the column 'PICKLINETOTAL'. (NullAllowed)
     */
    public Long getPicklinetotal() {
        return _picklinetotal;
    }

    /**
     * [set] PICKLINETOTAL: {bigint(19), default=[(0)]} <br>
     * ピッキング引当総行数
     * @param picklinetotal The value of the column 'PICKLINETOTAL'. (NullAllowed)
     */
    public void setPicklinetotal(Long picklinetotal) {
        __modifiedProperties.add("picklinetotal");
        this._picklinetotal = picklinetotal;
    }

    /**
     * [get] PICKINGWAY: {bigint(19), default=[(0)]} <br>
     * ピッキング種別
     * @return The value of the column 'PICKINGWAY'. (NullAllowed)
     */
    public Long getPickingway() {
        return _pickingway;
    }

    /**
     * [set] PICKINGWAY: {bigint(19), default=[(0)]} <br>
     * ピッキング種別
     * @param pickingway The value of the column 'PICKINGWAY'. (NullAllowed)
     */
    public void setPickingway(Long pickingway) {
        __modifiedProperties.add("pickingway");
        this._pickingway = pickingway;
    }

    /**
     * [get] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @return The value of the column 'EXECKEY'. (NullAllowed)
     */
    public Long getExeckey() {
        return _execkey;
    }

    /**
     * [set] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @param execkey The value of the column 'EXECKEY'. (NullAllowed)
     */
    public void setExeckey(Long execkey) {
        __modifiedProperties.add("execkey");
        this._execkey = execkey;
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
