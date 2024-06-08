package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKSORTSUB as TABLE. <br>
 * 仕分結果登録中間
 * <pre>
 * [primary-key]
 *     SORTSUBKEY, SORTSUBLINENO
 *
 * [column]
 *     SORTSUBKEY, SORTSUBLINENO, SOKEY, PLNO, SYMBOLNO, LOTKEY, LOCCD, QTY, PICKEDFLG, SORTEDFLG, MANUALSYMBOLNO, ASSORTSEQ, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWksortsubDto implements Serializable {

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
    /** SORTSUBKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortsubkey;

    /** SORTSUBLINENO: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _sortsublineno;

    /** SOKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sokey;

    /** PLNO: {varchar(30)} */
    @JsonKey
    protected String _plno;

    /** SYMBOLNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _symbolno;

    /** LOTKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _lotkey;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** QTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qty;

    /** PICKEDFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pickedflg;

    /** SORTEDFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortedflg;

    /** MANUALSYMBOLNO: {varchar(30)} */
    @JsonKey
    protected String _manualsymbolno;

    /** ASSORTSEQ: {bigint(19)} */
    @JsonKey
    protected Long _assortseq;

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
    public BsWWksortsubDto() {
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
        if (other == null || !(other instanceof BsWWksortsubDto)) { return false; }
        final BsWWksortsubDto otherEntity = (BsWWksortsubDto)other;
        if (!helpComparingValue(getSortsubkey(), otherEntity.getSortsubkey())) { return false; }
        if (!helpComparingValue(getSortsublineno(), otherEntity.getSortsublineno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKSORTSUB");
        result = xCH(result, getSortsubkey());
        result = xCH(result, getSortsublineno());
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
        sb.append(c).append(getSortsubkey());
        sb.append(c).append(getSortsublineno());
        sb.append(c).append(getSokey());
        sb.append(c).append(getPlno());
        sb.append(c).append(getSymbolno());
        sb.append(c).append(getLotkey());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getQty());
        sb.append(c).append(getPickedflg());
        sb.append(c).append(getSortedflg());
        sb.append(c).append(getManualsymbolno());
        sb.append(c).append(getAssortseq());
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
     * [get] SORTSUBKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 仕分結果登録キー
     * @return The value of the column 'SORTSUBKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSortsubkey() {
        return _sortsubkey;
    }

    /**
     * [set] SORTSUBKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 仕分結果登録キー
     * @param sortsubkey The value of the column 'SORTSUBKEY'. (NullAllowed)
     */
    public void setSortsubkey(java.math.BigDecimal sortsubkey) {
        __modifiedProperties.add("sortsubkey");
        this._sortsubkey = sortsubkey;
    }

    /**
     * [get] SORTSUBLINENO: {PK, NotNull, bigint(19)} <br>
     * 仕分結果登録行No.
     * @return The value of the column 'SORTSUBLINENO'. (NullAllowed)
     */
    public Long getSortsublineno() {
        return _sortsublineno;
    }

    /**
     * [set] SORTSUBLINENO: {PK, NotNull, bigint(19)} <br>
     * 仕分結果登録行No.
     * @param sortsublineno The value of the column 'SORTSUBLINENO'. (NullAllowed)
     */
    public void setSortsublineno(Long sortsublineno) {
        __modifiedProperties.add("sortsublineno");
        this._sortsublineno = sortsublineno;
    }

    /**
     * [get] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示キー
     * @return The value of the column 'SOKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSokey() {
        return _sokey;
    }

    /**
     * [set] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示キー
     * @param sokey The value of the column 'SOKEY'. (NullAllowed)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        __modifiedProperties.add("sokey");
        this._sokey = sokey;
    }

    /**
     * [get] PLNO: {varchar(30)} <br>
     * P/LNo.
     * @return The value of the column 'PLNO'. (NullAllowed)
     */
    public String getPlno() {
        return _plno;
    }

    /**
     * [set] PLNO: {varchar(30)} <br>
     * P/LNo.
     * @param plno The value of the column 'PLNO'. (NullAllowed)
     */
    public void setPlno(String plno) {
        __modifiedProperties.add("plno");
        this._plno = plno;
    }

    /**
     * [get] SYMBOLNO: {decimal(16, 6)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOLNO'. (NullAllowed)
     */
    public java.math.BigDecimal getSymbolno() {
        return _symbolno;
    }

    /**
     * [set] SYMBOLNO: {decimal(16, 6)} <br>
     * シンボル管理番号
     * @param symbolno The value of the column 'SYMBOLNO'. (NullAllowed)
     */
    public void setSymbolno(java.math.BigDecimal symbolno) {
        __modifiedProperties.add("symbolno");
        this._symbolno = symbolno;
    }

    /**
     * [get] LOTKEY: {decimal(16, 6)} <br>
     * ロットキー
     * @return The value of the column 'LOTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getLotkey() {
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {decimal(16, 6)} <br>
     * ロットキー
     * @param lotkey The value of the column 'LOTKEY'. (NullAllowed)
     */
    public void setLotkey(java.math.BigDecimal lotkey) {
        __modifiedProperties.add("lotkey");
        this._lotkey = lotkey;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
    }

    /**
     * [get] QTY: {decimal(16, 6)} <br>
     * 仕分中数量
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {decimal(16, 6)} <br>
     * 仕分中数量
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(java.math.BigDecimal qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] PICKEDFLG: {decimal(16, 6)} <br>
     * 棚出カートンフラグ
     * @return The value of the column 'PICKEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getPickedflg() {
        return _pickedflg;
    }

    /**
     * [set] PICKEDFLG: {decimal(16, 6)} <br>
     * 棚出カートンフラグ
     * @param pickedflg The value of the column 'PICKEDFLG'. (NullAllowed)
     */
    public void setPickedflg(java.math.BigDecimal pickedflg) {
        __modifiedProperties.add("pickedflg");
        this._pickedflg = pickedflg;
    }

    /**
     * [get] SORTEDFLG: {decimal(16, 6)} <br>
     * 仕分カートンフラグ
     * @return The value of the column 'SORTEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSortedflg() {
        return _sortedflg;
    }

    /**
     * [set] SORTEDFLG: {decimal(16, 6)} <br>
     * 仕分カートンフラグ
     * @param sortedflg The value of the column 'SORTEDFLG'. (NullAllowed)
     */
    public void setSortedflg(java.math.BigDecimal sortedflg) {
        __modifiedProperties.add("sortedflg");
        this._sortedflg = sortedflg;
    }

    /**
     * [get] MANUALSYMBOLNO: {varchar(30)} <br>
     * 入力段ボール番号
     * @return The value of the column 'MANUALSYMBOLNO'. (NullAllowed)
     */
    public String getManualsymbolno() {
        return _manualsymbolno;
    }

    /**
     * [set] MANUALSYMBOLNO: {varchar(30)} <br>
     * 入力段ボール番号
     * @param manualsymbolno The value of the column 'MANUALSYMBOLNO'. (NullAllowed)
     */
    public void setManualsymbolno(String manualsymbolno) {
        __modifiedProperties.add("manualsymbolno");
        this._manualsymbolno = manualsymbolno;
    }

    /**
     * [get] ASSORTSEQ: {bigint(19)} <br>
     * 詰合せ連番
     * @return The value of the column 'ASSORTSEQ'. (NullAllowed)
     */
    public Long getAssortseq() {
        return _assortseq;
    }

    /**
     * [set] ASSORTSEQ: {bigint(19)} <br>
     * 詰合せ連番
     * @param assortseq The value of the column 'ASSORTSEQ'. (NullAllowed)
     */
    public void setAssortseq(Long assortseq) {
        __modifiedProperties.add("assortseq");
        this._assortseq = assortseq;
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
