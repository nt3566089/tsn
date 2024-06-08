package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKREKAKUNOU as TABLE. <br>
 * 国免仕分戻し登録ワーク
 * <pre>
 * [primary-key]
 *     REKAKUNOU_ID
 *
 * [column]
 *     REKAKUNOU_ID, CENTER_ID, CLIENT_ID, REKAKUNOUKEY, REKAKUNOULINENO, PALLETSYMBOLKEY, PALLETKEY, SOJTKEY, SOJTLINENO, OWNERSONO, SOPALLETNO, RCVKEY, TRSYMBOL_ID, SORTEDQTY1, LOT_ID, PACKEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REKAKUNOU_ID
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
public abstract class BsWWkrekakunouDto implements Serializable {

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
    /** REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _rekakunouId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** REKAKUNOUKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rekakunoukey;

    /** REKAKUNOULINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _rekakunoulineno;

    /** PALLETSYMBOLKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletsymbolkey;

    /** PALLETKEY: {varchar(30)} */
    @JsonKey
    protected String _palletkey;

    /** SOJTKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sojtkey;

    /** SOJTLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sojtlineno;

    /** OWNERSONO: {NotNull, varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** SOPALLETNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sopalletno;

    /** RCVKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** TRSYMBOL_ID: {bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** SORTEDQTY1: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortedqty1;

    /** LOT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** PACKEDFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _packedflg;

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
    public BsWWkrekakunouDto() {
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
        if (other == null || !(other instanceof BsWWkrekakunouDto)) { return false; }
        final BsWWkrekakunouDto otherEntity = (BsWWkrekakunouDto)other;
        if (!helpComparingValue(getRekakunouId(), otherEntity.getRekakunouId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKREKAKUNOU");
        result = xCH(result, getRekakunouId());
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
        sb.append(c).append(getRekakunouId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getRekakunoukey());
        sb.append(c).append(getRekakunoulineno());
        sb.append(c).append(getPalletsymbolkey());
        sb.append(c).append(getPalletkey());
        sb.append(c).append(getSojtkey());
        sb.append(c).append(getSojtlineno());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getSopalletno());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getSortedqty1());
        sb.append(c).append(getLotId());
        sb.append(c).append(getPackedflg());
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
     * [get] REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国免仕分戻し登録ワークID
     * @return The value of the column 'REKAKUNOU_ID'. (NullAllowed)
     */
    public Long getRekakunouId() {
        return _rekakunouId;
    }

    /**
     * [set] REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国免仕分戻し登録ワークID
     * @param rekakunouId The value of the column 'REKAKUNOU_ID'. (NullAllowed)
     */
    public void setRekakunouId(Long rekakunouId) {
        __modifiedProperties.add("rekakunouId");
        this._rekakunouId = rekakunouId;
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
     * [get] REKAKUNOUKEY: {NotNull, decimal(16, 6)} <br>
     * 仕分戻しキー
     * @return The value of the column 'REKAKUNOUKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRekakunoukey() {
        return _rekakunoukey;
    }

    /**
     * [set] REKAKUNOUKEY: {NotNull, decimal(16, 6)} <br>
     * 仕分戻しキー
     * @param rekakunoukey The value of the column 'REKAKUNOUKEY'. (NullAllowed)
     */
    public void setRekakunoukey(java.math.BigDecimal rekakunoukey) {
        __modifiedProperties.add("rekakunoukey");
        this._rekakunoukey = rekakunoukey;
    }

    /**
     * [get] REKAKUNOULINENO: {NotNull, bigint(19)} <br>
     * 仕分戻し行No.
     * @return The value of the column 'REKAKUNOULINENO'. (NullAllowed)
     */
    public Long getRekakunoulineno() {
        return _rekakunoulineno;
    }

    /**
     * [set] REKAKUNOULINENO: {NotNull, bigint(19)} <br>
     * 仕分戻し行No.
     * @param rekakunoulineno The value of the column 'REKAKUNOULINENO'. (NullAllowed)
     */
    public void setRekakunoulineno(Long rekakunoulineno) {
        __modifiedProperties.add("rekakunoulineno");
        this._rekakunoulineno = rekakunoulineno;
    }

    /**
     * [get] PALLETSYMBOLKEY: {decimal(16, 6)} <br>
     * パレット内個体情報キー
     * @return The value of the column 'PALLETSYMBOLKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletsymbolkey() {
        return _palletsymbolkey;
    }

    /**
     * [set] PALLETSYMBOLKEY: {decimal(16, 6)} <br>
     * パレット内個体情報キー
     * @param palletsymbolkey The value of the column 'PALLETSYMBOLKEY'. (NullAllowed)
     */
    public void setPalletsymbolkey(java.math.BigDecimal palletsymbolkey) {
        __modifiedProperties.add("palletsymbolkey");
        this._palletsymbolkey = palletsymbolkey;
    }

    /**
     * [get] PALLETKEY: {varchar(30)} <br>
     * パレット積付キー
     * @return The value of the column 'PALLETKEY'. (NullAllowed)
     */
    public String getPalletkey() {
        return _palletkey;
    }

    /**
     * [set] PALLETKEY: {varchar(30)} <br>
     * パレット積付キー
     * @param palletkey The value of the column 'PALLETKEY'. (NullAllowed)
     */
    public void setPalletkey(String palletkey) {
        __modifiedProperties.add("palletkey");
        this._palletkey = palletkey;
    }

    /**
     * [get] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @return The value of the column 'SOJTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSojtkey() {
        return _sojtkey;
    }

    /**
     * [set] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @param sojtkey The value of the column 'SOJTKEY'. (NullAllowed)
     */
    public void setSojtkey(java.math.BigDecimal sojtkey) {
        __modifiedProperties.add("sojtkey");
        this._sojtkey = sojtkey;
    }

    /**
     * [get] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @return The value of the column 'SOJTLINENO'. (NullAllowed)
     */
    public Long getSojtlineno() {
        return _sojtlineno;
    }

    /**
     * [set] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @param sojtlineno The value of the column 'SOJTLINENO'. (NullAllowed)
     */
    public void setSojtlineno(Long sojtlineno) {
        __modifiedProperties.add("sojtlineno");
        this._sojtlineno = sojtlineno;
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
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
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
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
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
