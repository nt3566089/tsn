package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_TRIFTRNODR as TABLE. <br>
 * IF振替指示
 * <pre>
 * [primary-key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, NEXUSPKEY, ORDERNO, ORDERTYPE, CUSTORDERNO, TRANTYPE, RMANO, TRANSDETAILTYPE, SCHDATE, SCHTIME, ACTUALDATE, ACTUALTIME, WAREHOUSECD, FROMCOMPANYCD, FROMOWNERCD, TOCOMPANYCD, TOOWNERCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PRIORITY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsETriftrnodrDto implements Serializable {

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
    /** IFDATAKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ifdatakey;

    /** SEGNAME: {NotNull, varchar(30)} */
    @JsonKey
    protected String _segname;

    /** REFNO: {NotNull, varchar(60)} */
    @JsonKey
    protected String _refno;

    /** NEXUSPKEY: {NotNull, varchar(30)} */
    @JsonKey
    protected String _nexuspkey;

    /** ORDERNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _orderno;

    /** ORDERTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ordertype;

    /** CUSTORDERNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _custorderno;

    /** TRANTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _trantype;

    /** RMANO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rmano;

    /** TRANSDETAILTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _transdetailtype;

    /** SCHDATE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _schdate;

    /** SCHTIME: {NotNull, varchar(30)} */
    @JsonKey
    protected String _schtime;

    /** ACTUALDATE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _actualdate;

    /** ACTUALTIME: {NotNull, varchar(30)} */
    @JsonKey
    protected String _actualtime;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** FROMCOMPANYCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fromcompanycd;

    /** FROMOWNERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fromownercd;

    /** TOCOMPANYCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _tocompanycd;

    /** TOOWNERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _toownercd;

    /** NOTES: {NotNull, varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** OTHERREFNO1: {NotNull, varchar(60)} */
    @JsonKey
    protected String _otherrefno1;

    /** OTHERREFNO2: {NotNull, varchar(60)} */
    @JsonKey
    protected String _otherrefno2;

    /** OTHERREFNO3: {NotNull, varchar(60)} */
    @JsonKey
    protected String _otherrefno3;

    /** PRIORITY: {NotNull, varchar(30)} */
    @JsonKey
    protected String _priority;

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
    public BsETriftrnodrDto() {
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
        if (other == null || !(other instanceof BsETriftrnodrDto)) { return false; }
        final BsETriftrnodrDto otherEntity = (BsETriftrnodrDto)other;
        if (!helpComparingValue(getIfdatakey(), otherEntity.getIfdatakey())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_TRIFTRNODR");
        result = xCH(result, getIfdatakey());
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
        sb.append(c).append(getIfdatakey());
        sb.append(c).append(getSegname());
        sb.append(c).append(getRefno());
        sb.append(c).append(getNexuspkey());
        sb.append(c).append(getOrderno());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getTrantype());
        sb.append(c).append(getRmano());
        sb.append(c).append(getTransdetailtype());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getSchtime());
        sb.append(c).append(getActualdate());
        sb.append(c).append(getActualtime());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getFromcompanycd());
        sb.append(c).append(getFromownercd());
        sb.append(c).append(getTocompanycd());
        sb.append(c).append(getToownercd());
        sb.append(c).append(getNotes());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getOtherrefno2());
        sb.append(c).append(getOtherrefno3());
        sb.append(c).append(getPriority());
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
     * [get] IFDATAKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ＩＦデータキー
     * @return The value of the column 'IFDATAKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getIfdatakey() {
        return _ifdatakey;
    }

    /**
     * [set] IFDATAKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ＩＦデータキー
     * @param ifdatakey The value of the column 'IFDATAKEY'. (NullAllowed)
     */
    public void setIfdatakey(java.math.BigDecimal ifdatakey) {
        __modifiedProperties.add("ifdatakey");
        this._ifdatakey = ifdatakey;
    }

    /**
     * [get] SEGNAME: {NotNull, varchar(30)} <br>
     * セグメント名
     * @return The value of the column 'SEGNAME'. (NullAllowed)
     */
    public String getSegname() {
        return _segname;
    }

    /**
     * [set] SEGNAME: {NotNull, varchar(30)} <br>
     * セグメント名
     * @param segname The value of the column 'SEGNAME'. (NullAllowed)
     */
    public void setSegname(String segname) {
        __modifiedProperties.add("segname");
        this._segname = segname;
    }

    /**
     * [get] REFNO: {NotNull, varchar(60)} <br>
     * 相手伝票番号
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {NotNull, varchar(60)} <br>
     * 相手伝票番号
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] NEXUSPKEY: {NotNull, varchar(30)} <br>
     * NexusPKey
     * @return The value of the column 'NEXUSPKEY'. (NullAllowed)
     */
    public String getNexuspkey() {
        return _nexuspkey;
    }

    /**
     * [set] NEXUSPKEY: {NotNull, varchar(30)} <br>
     * NexusPKey
     * @param nexuspkey The value of the column 'NEXUSPKEY'. (NullAllowed)
     */
    public void setNexuspkey(String nexuspkey) {
        __modifiedProperties.add("nexuspkey");
        this._nexuspkey = nexuspkey;
    }

    /**
     * [get] ORDERNO: {NotNull, varchar(30)} <br>
     * 相手受注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed)
     */
    public String getOrderno() {
        return _orderno;
    }

    /**
     * [set] ORDERNO: {NotNull, varchar(30)} <br>
     * 相手受注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed)
     */
    public void setOrderno(String orderno) {
        __modifiedProperties.add("orderno");
        this._orderno = orderno;
    }

    /**
     * [get] ORDERTYPE: {NotNull, varchar(30)} <br>
     * 相手受注タイプ
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {NotNull, varchar(30)} <br>
     * 相手受注タイプ
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] CUSTORDERNO: {NotNull, varchar(30)} <br>
     * 顧客オーダ番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public String getCustorderno() {
        return _custorderno;
    }

    /**
     * [set] CUSTORDERNO: {NotNull, varchar(30)} <br>
     * 顧客オーダ番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public void setCustorderno(String custorderno) {
        __modifiedProperties.add("custorderno");
        this._custorderno = custorderno;
    }

    /**
     * [get] TRANTYPE: {NotNull, varchar(30)} <br>
     * 振替タイプ
     * @return The value of the column 'TRANTYPE'. (NullAllowed)
     */
    public String getTrantype() {
        return _trantype;
    }

    /**
     * [set] TRANTYPE: {NotNull, varchar(30)} <br>
     * 振替タイプ
     * @param trantype The value of the column 'TRANTYPE'. (NullAllowed)
     */
    public void setTrantype(String trantype) {
        __modifiedProperties.add("trantype");
        this._trantype = trantype;
    }

    /**
     * [get] RMANO: {NotNull, varchar(30)} <br>
     * RMANo
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {NotNull, varchar(30)} <br>
     * RMANo
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] TRANSDETAILTYPE: {NotNull, varchar(30)} <br>
     * 振替明細タイプ
     * @return The value of the column 'TRANSDETAILTYPE'. (NullAllowed)
     */
    public String getTransdetailtype() {
        return _transdetailtype;
    }

    /**
     * [set] TRANSDETAILTYPE: {NotNull, varchar(30)} <br>
     * 振替明細タイプ
     * @param transdetailtype The value of the column 'TRANSDETAILTYPE'. (NullAllowed)
     */
    public void setTransdetailtype(String transdetailtype) {
        __modifiedProperties.add("transdetailtype");
        this._transdetailtype = transdetailtype;
    }

    /**
     * [get] SCHDATE: {NotNull, varchar(30)} <br>
     * 予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SCHDATE: {NotNull, varchar(30)} <br>
     * 予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] SCHTIME: {NotNull, varchar(30)} <br>
     * 予定時刻
     * @return The value of the column 'SCHTIME'. (NullAllowed)
     */
    public String getSchtime() {
        return _schtime;
    }

    /**
     * [set] SCHTIME: {NotNull, varchar(30)} <br>
     * 予定時刻
     * @param schtime The value of the column 'SCHTIME'. (NullAllowed)
     */
    public void setSchtime(String schtime) {
        __modifiedProperties.add("schtime");
        this._schtime = schtime;
    }

    /**
     * [get] ACTUALDATE: {NotNull, varchar(30)} <br>
     * 実績日
     * @return The value of the column 'ACTUALDATE'. (NullAllowed)
     */
    public String getActualdate() {
        return _actualdate;
    }

    /**
     * [set] ACTUALDATE: {NotNull, varchar(30)} <br>
     * 実績日
     * @param actualdate The value of the column 'ACTUALDATE'. (NullAllowed)
     */
    public void setActualdate(String actualdate) {
        __modifiedProperties.add("actualdate");
        this._actualdate = actualdate;
    }

    /**
     * [get] ACTUALTIME: {NotNull, varchar(30)} <br>
     * 実績時刻
     * @return The value of the column 'ACTUALTIME'. (NullAllowed)
     */
    public String getActualtime() {
        return _actualtime;
    }

    /**
     * [set] ACTUALTIME: {NotNull, varchar(30)} <br>
     * 実績時刻
     * @param actualtime The value of the column 'ACTUALTIME'. (NullAllowed)
     */
    public void setActualtime(String actualtime) {
        __modifiedProperties.add("actualtime");
        this._actualtime = actualtime;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] FROMCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振出代理店CD
     * @return The value of the column 'FROMCOMPANYCD'. (NullAllowed)
     */
    public String getFromcompanycd() {
        return _fromcompanycd;
    }

    /**
     * [set] FROMCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振出代理店CD
     * @param fromcompanycd The value of the column 'FROMCOMPANYCD'. (NullAllowed)
     */
    public void setFromcompanycd(String fromcompanycd) {
        __modifiedProperties.add("fromcompanycd");
        this._fromcompanycd = fromcompanycd;
    }

    /**
     * [get] FROMOWNERCD: {NotNull, varchar(30)} <br>
     * 振出荷主CD
     * @return The value of the column 'FROMOWNERCD'. (NullAllowed)
     */
    public String getFromownercd() {
        return _fromownercd;
    }

    /**
     * [set] FROMOWNERCD: {NotNull, varchar(30)} <br>
     * 振出荷主CD
     * @param fromownercd The value of the column 'FROMOWNERCD'. (NullAllowed)
     */
    public void setFromownercd(String fromownercd) {
        __modifiedProperties.add("fromownercd");
        this._fromownercd = fromownercd;
    }

    /**
     * [get] TOCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振入代理店CD
     * @return The value of the column 'TOCOMPANYCD'. (NullAllowed)
     */
    public String getTocompanycd() {
        return _tocompanycd;
    }

    /**
     * [set] TOCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振入代理店CD
     * @param tocompanycd The value of the column 'TOCOMPANYCD'. (NullAllowed)
     */
    public void setTocompanycd(String tocompanycd) {
        __modifiedProperties.add("tocompanycd");
        this._tocompanycd = tocompanycd;
    }

    /**
     * [get] TOOWNERCD: {NotNull, varchar(30)} <br>
     * 振入荷主CD
     * @return The value of the column 'TOOWNERCD'. (NullAllowed)
     */
    public String getToownercd() {
        return _toownercd;
    }

    /**
     * [set] TOOWNERCD: {NotNull, varchar(30)} <br>
     * 振入荷主CD
     * @param toownercd The value of the column 'TOOWNERCD'. (NullAllowed)
     */
    public void setToownercd(String toownercd) {
        __modifiedProperties.add("toownercd");
        this._toownercd = toownercd;
    }

    /**
     * [get] NOTES: {NotNull, varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {NotNull, varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] OTHERREFNO1: {NotNull, varchar(60)} <br>
     * 他照会番号1
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {NotNull, varchar(60)} <br>
     * 他照会番号1
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] OTHERREFNO2: {NotNull, varchar(60)} <br>
     * 他照会番号2
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public String getOtherrefno2() {
        return _otherrefno2;
    }

    /**
     * [set] OTHERREFNO2: {NotNull, varchar(60)} <br>
     * 他照会番号2
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public void setOtherrefno2(String otherrefno2) {
        __modifiedProperties.add("otherrefno2");
        this._otherrefno2 = otherrefno2;
    }

    /**
     * [get] OTHERREFNO3: {NotNull, varchar(60)} <br>
     * 他照会番号3
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public String getOtherrefno3() {
        return _otherrefno3;
    }

    /**
     * [set] OTHERREFNO3: {NotNull, varchar(60)} <br>
     * 他照会番号3
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public void setOtherrefno3(String otherrefno3) {
        __modifiedProperties.add("otherrefno3");
        this._otherrefno3 = otherrefno3;
    }

    /**
     * [get] PRIORITY: {NotNull, varchar(30)} <br>
     * 優先順位
     * @return The value of the column 'PRIORITY'. (NullAllowed)
     */
    public String getPriority() {
        return _priority;
    }

    /**
     * [set] PRIORITY: {NotNull, varchar(30)} <br>
     * 優先順位
     * @param priority The value of the column 'PRIORITY'. (NullAllowed)
     */
    public void setPriority(String priority) {
        __modifiedProperties.add("priority");
        this._priority = priority;
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
