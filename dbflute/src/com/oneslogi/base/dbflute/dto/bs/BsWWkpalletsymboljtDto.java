package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKPALLETSYMBOLJT as TABLE. <br>
 * 国免在庫引当中間
 * <pre>
 * [primary-key]
 *     WKSOJTKEY, SYMBOLNO
 *
 * [column]
 *     WKSOJTKEY, PALLETNO, OWNERSONO, SOPALLETNO, RCVKEY, SYMBOLNO, SORTEDQTY1, LOTKEY, PACKEDFLG, ENTERFLG, ACTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkpalletsymboljtDto implements Serializable {

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
    /** WKSOJTKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _wksojtkey;

    /** PALLETNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletno;

    /** OWNERSONO: {NotNull, varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** SOPALLETNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sopalletno;

    /** RCVKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** SYMBOLNO: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _symbolno;

    /** SORTEDQTY1: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortedqty1;

    /** LOTKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotkey;

    /** PACKEDFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _packedflg;

    /** ENTERFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _enterflg;

    /** ACTFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _actflg;

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
    public BsWWkpalletsymboljtDto() {
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
        if (other == null || !(other instanceof BsWWkpalletsymboljtDto)) { return false; }
        final BsWWkpalletsymboljtDto otherEntity = (BsWWkpalletsymboljtDto)other;
        if (!helpComparingValue(getWksojtkey(), otherEntity.getWksojtkey())) { return false; }
        if (!helpComparingValue(getSymbolno(), otherEntity.getSymbolno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKPALLETSYMBOLJT");
        result = xCH(result, getWksojtkey());
        result = xCH(result, getSymbolno());
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
        sb.append(c).append(getWksojtkey());
        sb.append(c).append(getPalletno());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getSopalletno());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getSymbolno());
        sb.append(c).append(getSortedqty1());
        sb.append(c).append(getLotkey());
        sb.append(c).append(getPackedflg());
        sb.append(c).append(getEnterflg());
        sb.append(c).append(getActflg());
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
     * [get] WKSOJTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 国免在庫引当中間情報キー
     * @return The value of the column 'WKSOJTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getWksojtkey() {
        return _wksojtkey;
    }

    /**
     * [set] WKSOJTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 国免在庫引当中間情報キー
     * @param wksojtkey The value of the column 'WKSOJTKEY'. (NullAllowed)
     */
    public void setWksojtkey(java.math.BigDecimal wksojtkey) {
        __modifiedProperties.add("wksojtkey");
        this._wksojtkey = wksojtkey;
    }

    /**
     * [get] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletno() {
        return _palletno;
    }

    /**
     * [set] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (NullAllowed)
     */
    public void setPalletno(java.math.BigDecimal palletno) {
        __modifiedProperties.add("palletno");
        this._palletno = palletno;
    }

    /**
     * [get] OWNERSONO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public String getOwnersono() {
        return _ownersono;
    }

    /**
     * [set] OWNERSONO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public void setOwnersono(String ownersono) {
        __modifiedProperties.add("ownersono");
        this._ownersono = ownersono;
    }

    /**
     * [get] SOPALLETNO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'SOPALLETNO'. (NullAllowed)
     */
    public String getSopalletno() {
        return _sopalletno;
    }

    /**
     * [set] SOPALLETNO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed)
     */
    public void setSopalletno(String sopalletno) {
        __modifiedProperties.add("sopalletno");
        this._sopalletno = sopalletno;
    }

    /**
     * [get] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] SYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOLNO'. (NullAllowed)
     */
    public java.math.BigDecimal getSymbolno() {
        return _symbolno;
    }

    /**
     * [set] SYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * シンボル管理番号
     * @param symbolno The value of the column 'SYMBOLNO'. (NullAllowed)
     */
    public void setSymbolno(java.math.BigDecimal symbolno) {
        __modifiedProperties.add("symbolno");
        this._symbolno = symbolno;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, decimal(16, 6)} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getSortedqty1() {
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, decimal(16, 6)} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public void setSortedqty1(java.math.BigDecimal sortedqty1) {
        __modifiedProperties.add("sortedqty1");
        this._sortedqty1 = sortedqty1;
    }

    /**
     * [get] LOTKEY: {NotNull, bigint(19)} <br>
     * ロットキー
     * @return The value of the column 'LOTKEY'. (NullAllowed)
     */
    public Long getLotkey() {
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {NotNull, bigint(19)} <br>
     * ロットキー
     * @param lotkey The value of the column 'LOTKEY'. (NullAllowed)
     */
    public void setLotkey(Long lotkey) {
        __modifiedProperties.add("lotkey");
        this._lotkey = lotkey;
    }

    /**
     * [get] PACKEDFLG: {NotNull, char(1)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'PACKEDFLG'. (NullAllowed)
     */
    public String getPackedflg() {
        return _packedflg;
    }

    /**
     * [set] PACKEDFLG: {NotNull, char(1)} <br>
     * 段ボール有無フラグ
     * @param packedflg The value of the column 'PACKEDFLG'. (NullAllowed)
     */
    public void setPackedflg(String packedflg) {
        __modifiedProperties.add("packedflg");
        this._packedflg = packedflg;
    }

    /**
     * [get] ENTERFLG: {NotNull, decimal(16, 6)} <br>
     * 確定フラグ
     * @return The value of the column 'ENTERFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getEnterflg() {
        return _enterflg;
    }

    /**
     * [set] ENTERFLG: {NotNull, decimal(16, 6)} <br>
     * 確定フラグ
     * @param enterflg The value of the column 'ENTERFLG'. (NullAllowed)
     */
    public void setEnterflg(java.math.BigDecimal enterflg) {
        __modifiedProperties.add("enterflg");
        this._enterflg = enterflg;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getActflg() {
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        __modifiedProperties.add("actflg");
        this._actflg = actflg;
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
