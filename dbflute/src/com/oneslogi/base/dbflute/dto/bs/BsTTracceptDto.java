package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRACCEPT as TABLE. <br>
 * 入庫受付
 * <pre>
 * [primary-key]
 *     TRACCEPT_ID
 *
 * [column]
 *     TRACCEPT_ID, PREKEY, ACCEPTTYPE, ACCEPTGROUP, NOTES, LOGISTICSCD, WAREHOUSECD, LOCCD, INSPECTEDUSERCD, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, ACTUALTIME, COMPLETETIME, ACCEPTLINETOTAL, TAGLABELPRINTFLG, RECEIVE_PLAN_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACCEPT_ID
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
public abstract class BsTTracceptDto implements Serializable {

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
    /** TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _tracceptId;

    /** PREKEY: {IX, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _prekey;

    /** ACCEPTTYPE: {varchar(30)} */
    @JsonKey
    protected String _accepttype;

    /** ACCEPTGROUP: {varchar(60)} */
    @JsonKey
    protected String _acceptgroup;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** LOGISTICSCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _logisticscd;

    /** WAREHOUSECD: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** INSPECTEDUSERCD: {varchar(30)} */
    @JsonKey
    protected String _inspectedusercd;

    /** CARRIERCD: {varchar(30)} */
    @JsonKey
    protected String _carriercd;

    /** CARRIERNAME: {varchar(255)} */
    @JsonKey
    protected String _carriername;

    /** CARRIERWBNO: {varchar(60)} */
    @JsonKey
    protected String _carrierwbno;

    /** DELIVERYCD: {varchar(30)} */
    @JsonKey
    protected String _deliverycd;

    /** CARRIERNO: {varchar(60)} */
    @JsonKey
    protected String _carrierno;

    /** CARRIERSNAME: {varchar(100)} */
    @JsonKey
    protected String _carriersname;

    /** ACTUALTIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _actualtime;

    /** COMPLETETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _completetime;

    /** ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _acceptlinetotal;

    /** TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _taglabelprintflg;

    /** RECEIVE_PLAN_H_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

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
    public BsTTracceptDto() {
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
        if (other == null || !(other instanceof BsTTracceptDto)) { return false; }
        final BsTTracceptDto otherEntity = (BsTTracceptDto)other;
        if (!helpComparingValue(getTracceptId(), otherEntity.getTracceptId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRACCEPT");
        result = xCH(result, getTracceptId());
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
        sb.append(c).append(getTracceptId());
        sb.append(c).append(getPrekey());
        sb.append(c).append(getAccepttype());
        sb.append(c).append(getAcceptgroup());
        sb.append(c).append(getNotes());
        sb.append(c).append(getLogisticscd());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getInspectedusercd());
        sb.append(c).append(getCarriercd());
        sb.append(c).append(getCarriername());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getDeliverycd());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getActualtime());
        sb.append(c).append(getCompletetime());
        sb.append(c).append(getAcceptlinetotal());
        sb.append(c).append(getTaglabelprintflg());
        sb.append(c).append(getReceivePlanHId());
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
     * [get] TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受付ID
     * @return The value of the column 'TRACCEPT_ID'. (NullAllowed)
     */
    public Long getTracceptId() {
        return _tracceptId;
    }

    /**
     * [set] TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受付ID
     * @param tracceptId The value of the column 'TRACCEPT_ID'. (NullAllowed)
     */
    public void setTracceptId(Long tracceptId) {
        __modifiedProperties.add("tracceptId");
        this._tracceptId = tracceptId;
    }

    /**
     * [get] PREKEY: {IX, decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @return The value of the column 'PREKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPrekey() {
        return _prekey;
    }

    /**
     * [set] PREKEY: {IX, decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @param prekey The value of the column 'PREKEY'. (NullAllowed)
     */
    public void setPrekey(java.math.BigDecimal prekey) {
        __modifiedProperties.add("prekey");
        this._prekey = prekey;
    }

    /**
     * [get] ACCEPTTYPE: {varchar(30)} <br>
     * 入庫受付タイプ
     * @return The value of the column 'ACCEPTTYPE'. (NullAllowed)
     */
    public String getAccepttype() {
        return _accepttype;
    }

    /**
     * [set] ACCEPTTYPE: {varchar(30)} <br>
     * 入庫受付タイプ
     * @param accepttype The value of the column 'ACCEPTTYPE'. (NullAllowed)
     */
    public void setAccepttype(String accepttype) {
        __modifiedProperties.add("accepttype");
        this._accepttype = accepttype;
    }

    /**
     * [get] ACCEPTGROUP: {varchar(60)} <br>
     * 入庫受付グループ
     * @return The value of the column 'ACCEPTGROUP'. (NullAllowed)
     */
    public String getAcceptgroup() {
        return _acceptgroup;
    }

    /**
     * [set] ACCEPTGROUP: {varchar(60)} <br>
     * 入庫受付グループ
     * @param acceptgroup The value of the column 'ACCEPTGROUP'. (NullAllowed)
     */
    public void setAcceptgroup(String acceptgroup) {
        __modifiedProperties.add("acceptgroup");
        this._acceptgroup = acceptgroup;
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
     * [get] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @return The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public String getLogisticscd() {
        return _logisticscd;
    }

    /**
     * [set] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public void setLogisticscd(String logisticscd) {
        __modifiedProperties.add("logisticscd");
        this._logisticscd = logisticscd;
    }

    /**
     * [get] WAREHOUSECD: {IX+, NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {IX+, NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * 検品ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * 検品ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
    }

    /**
     * [get] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @return The value of the column 'INSPECTEDUSERCD'. (NullAllowed)
     */
    public String getInspectedusercd() {
        return _inspectedusercd;
    }

    /**
     * [set] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @param inspectedusercd The value of the column 'INSPECTEDUSERCD'. (NullAllowed)
     */
    public void setInspectedusercd(String inspectedusercd) {
        __modifiedProperties.add("inspectedusercd");
        this._inspectedusercd = inspectedusercd;
    }

    /**
     * [get] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @return The value of the column 'CARRIERCD'. (NullAllowed)
     */
    public String getCarriercd() {
        return _carriercd;
    }

    /**
     * [set] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @param carriercd The value of the column 'CARRIERCD'. (NullAllowed)
     */
    public void setCarriercd(String carriercd) {
        __modifiedProperties.add("carriercd");
        this._carriercd = carriercd;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @return The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public String getCarriername() {
        return _carriername;
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public void setCarriername(String carriername) {
        __modifiedProperties.add("carriername");
        this._carriername = carriername;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @return The value of the column 'DELIVERYCD'. (NullAllowed)
     */
    public String getDeliverycd() {
        return _deliverycd;
    }

    /**
     * [set] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @param deliverycd The value of the column 'DELIVERYCD'. (NullAllowed)
     */
    public void setDeliverycd(String deliverycd) {
        __modifiedProperties.add("deliverycd");
        this._deliverycd = deliverycd;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * 車番／荷揃グループ
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * 車番／荷揃グループ
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * 乗務員
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public String getCarriersname() {
        return _carriersname;
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * 乗務員
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public void setCarriersname(String carriersname) {
        __modifiedProperties.add("carriersname");
        this._carriersname = carriersname;
    }

    /**
     * [get] ACTUALTIME: {datetime2(26, 6)} <br>
     * 到着時刻
     * @return The value of the column 'ACTUALTIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getActualtime() {
        return _actualtime;
    }

    /**
     * [set] ACTUALTIME: {datetime2(26, 6)} <br>
     * 到着時刻
     * @param actualtime The value of the column 'ACTUALTIME'. (NullAllowed)
     */
    public void setActualtime(java.sql.Timestamp actualtime) {
        __modifiedProperties.add("actualtime");
        this._actualtime = actualtime;
    }

    /**
     * [get] COMPLETETIME: {datetime2(26, 6)} <br>
     * 検品完了時刻
     * @return The value of the column 'COMPLETETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getCompletetime() {
        return _completetime;
    }

    /**
     * [set] COMPLETETIME: {datetime2(26, 6)} <br>
     * 検品完了時刻
     * @param completetime The value of the column 'COMPLETETIME'. (NullAllowed)
     */
    public void setCompletetime(java.sql.Timestamp completetime) {
        __modifiedProperties.add("completetime");
        this._completetime = completetime;
    }

    /**
     * [get] ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]} <br>
     * 入庫受付総行数
     * @return The value of the column 'ACCEPTLINETOTAL'. (NullAllowed)
     */
    public java.math.BigDecimal getAcceptlinetotal() {
        return _acceptlinetotal;
    }

    /**
     * [set] ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]} <br>
     * 入庫受付総行数
     * @param acceptlinetotal The value of the column 'ACCEPTLINETOTAL'. (NullAllowed)
     */
    public void setAcceptlinetotal(java.math.BigDecimal acceptlinetotal) {
        __modifiedProperties.add("acceptlinetotal");
        this._acceptlinetotal = acceptlinetotal;
    }

    /**
     * [get] TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * タグラベル発行済フラグ
     * @return The value of the column 'TAGLABELPRINTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getTaglabelprintflg() {
        return _taglabelprintflg;
    }

    /**
     * [set] TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * タグラベル発行済フラグ
     * @param taglabelprintflg The value of the column 'TAGLABELPRINTFLG'. (NullAllowed)
     */
    public void setTaglabelprintflg(java.math.BigDecimal taglabelprintflg) {
        __modifiedProperties.add("taglabelprintflg");
        this._taglabelprintflg = taglabelprintflg;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
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
