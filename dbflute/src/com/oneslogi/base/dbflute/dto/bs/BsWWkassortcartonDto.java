package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKASSORTCARTON as TABLE. <br>
 * カートン詰合せワーク
 * <pre>
 * [primary-key]
 *     SEQNO, SYMBOLNO
 *
 * [column]
 *     SEQNO, SYMBOLNO, MOVEQTY, MOVEQTYBOWL, TOSYMBOLNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkassortcartonDto implements Serializable {

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
    /** SEQNO: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _seqno;

    /** SYMBOLNO: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _symbolno;

    /** MOVEQTY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _moveqty;

    /** MOVEQTYBOWL: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _moveqtybowl;

    /** TOSYMBOLNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tosymbolno;

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
    public BsWWkassortcartonDto() {
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
        if (other == null || !(other instanceof BsWWkassortcartonDto)) { return false; }
        final BsWWkassortcartonDto otherEntity = (BsWWkassortcartonDto)other;
        if (!helpComparingValue(getSeqno(), otherEntity.getSeqno())) { return false; }
        if (!helpComparingValue(getSymbolno(), otherEntity.getSymbolno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKASSORTCARTON");
        result = xCH(result, getSeqno());
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
        sb.append(c).append(getSeqno());
        sb.append(c).append(getSymbolno());
        sb.append(c).append(getMoveqty());
        sb.append(c).append(getMoveqtybowl());
        sb.append(c).append(getTosymbolno());
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
     * [get] SEQNO: {PK, NotNull, decimal(16, 6)} <br>
     * シーケンスキー
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public java.math.BigDecimal getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {PK, NotNull, decimal(16, 6)} <br>
     * シーケンスキー
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(java.math.BigDecimal seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
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
     * [get] MOVEQTY: {NotNull, decimal(16, 6)} <br>
     * 移動数量（カートン）
     * @return The value of the column 'MOVEQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveqty() {
        return _moveqty;
    }

    /**
     * [set] MOVEQTY: {NotNull, decimal(16, 6)} <br>
     * 移動数量（カートン）
     * @param moveqty The value of the column 'MOVEQTY'. (NullAllowed)
     */
    public void setMoveqty(java.math.BigDecimal moveqty) {
        __modifiedProperties.add("moveqty");
        this._moveqty = moveqty;
    }

    /**
     * [get] MOVEQTYBOWL: {NotNull, decimal(16, 6)} <br>
     * マイナスフラグ
     * @return The value of the column 'MOVEQTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveqtybowl() {
        return _moveqtybowl;
    }

    /**
     * [set] MOVEQTYBOWL: {NotNull, decimal(16, 6)} <br>
     * マイナスフラグ
     * @param moveqtybowl The value of the column 'MOVEQTYBOWL'. (NullAllowed)
     */
    public void setMoveqtybowl(java.math.BigDecimal moveqtybowl) {
        __modifiedProperties.add("moveqtybowl");
        this._moveqtybowl = moveqtybowl;
    }

    /**
     * [get] TOSYMBOLNO: {NotNull, decimal(16, 6)} <br>
     * 詰合せ先シンボル管理番号
     * @return The value of the column 'TOSYMBOLNO'. (NullAllowed)
     */
    public java.math.BigDecimal getTosymbolno() {
        return _tosymbolno;
    }

    /**
     * [set] TOSYMBOLNO: {NotNull, decimal(16, 6)} <br>
     * 詰合せ先シンボル管理番号
     * @param tosymbolno The value of the column 'TOSYMBOLNO'. (NullAllowed)
     */
    public void setTosymbolno(java.math.BigDecimal tosymbolno) {
        __modifiedProperties.add("tosymbolno");
        this._tosymbolno = tosymbolno;
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