package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_PALLET_SYMBOL_JT as TABLE. <br>
 * 国内免税ピッキングワーク
 * <pre>
 * [primary-key]
 *     WKSOJTKEY
 *
 * [column]
 *     WKSOJTKEY, CENTER_ID, CLIENT_ID, TRPALLET_ID, PALLET_NO, OWNER_SO_NO, SO_PALLET_NO, TRSYMBOL_ID, SYMBOL_NO, SORTED_QTY, ENTER_FLG, PACKED_FLG, RCV_KEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKSOJTKEY
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
public abstract class BsWPalletSymbolJtDto implements Serializable {

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
    /** WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _wksojtkey;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** TRPALLET_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trpalletId;

    /** PALLET_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _palletNo;

    /** OWNER_SO_NO: {NotNull, varchar(60)} */
    @JsonKey
    protected String _ownerSoNo;

    /** SO_PALLET_NO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _soPalletNo;

    /** TRSYMBOL_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** SYMBOL_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _symbolNo;

    /** SORTED_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sortedQty;

    /** ENTER_FLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _enterFlg;

    /** PACKED_FLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _packedFlg;

    /** RCV_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _rcvKey;

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
    public BsWPalletSymbolJtDto() {
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
        if (other == null || !(other instanceof BsWPalletSymbolJtDto)) { return false; }
        final BsWPalletSymbolJtDto otherEntity = (BsWPalletSymbolJtDto)other;
        if (!helpComparingValue(getWksojtkey(), otherEntity.getWksojtkey())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_PALLET_SYMBOL_JT");
        result = xCH(result, getWksojtkey());
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
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getTrpalletId());
        sb.append(c).append(getPalletNo());
        sb.append(c).append(getOwnerSoNo());
        sb.append(c).append(getSoPalletNo());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getSymbolNo());
        sb.append(c).append(getSortedQty());
        sb.append(c).append(getEnterFlg());
        sb.append(c).append(getPackedFlg());
        sb.append(c).append(getRcvKey());
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
     * [get] WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税ピッキングワークID
     * @return The value of the column 'WKSOJTKEY'. (NullAllowed)
     */
    public Long getWksojtkey() {
        return _wksojtkey;
    }

    /**
     * [set] WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税ピッキングワークID
     * @param wksojtkey The value of the column 'WKSOJTKEY'. (NullAllowed)
     */
    public void setWksojtkey(Long wksojtkey) {
        __modifiedProperties.add("wksojtkey");
        this._wksojtkey = wksojtkey;
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
     * [get] TRPALLET_ID: {NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public Long getTrpalletId() {
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public void setTrpalletId(Long trpalletId) {
        __modifiedProperties.add("trpalletId");
        this._trpalletId = trpalletId;
    }

    /**
     * [get] PALLET_NO: {NotNull, bigint(19)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLET_NO'. (NullAllowed)
     */
    public Long getPalletNo() {
        return _palletNo;
    }

    /**
     * [set] PALLET_NO: {NotNull, bigint(19)} <br>
     * パレット管理番号
     * @param palletNo The value of the column 'PALLET_NO'. (NullAllowed)
     */
    public void setPalletNo(Long palletNo) {
        __modifiedProperties.add("palletNo");
        this._palletNo = palletNo;
    }

    /**
     * [get] OWNER_SO_NO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNER_SO_NO'. (NullAllowed)
     */
    public String getOwnerSoNo() {
        return _ownerSoNo;
    }

    /**
     * [set] OWNER_SO_NO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @param ownerSoNo The value of the column 'OWNER_SO_NO'. (NullAllowed)
     */
    public void setOwnerSoNo(String ownerSoNo) {
        __modifiedProperties.add("ownerSoNo");
        this._ownerSoNo = ownerSoNo;
    }

    /**
     * [get] SO_PALLET_NO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'SO_PALLET_NO'. (NullAllowed)
     */
    public String getSoPalletNo() {
        return _soPalletNo;
    }

    /**
     * [set] SO_PALLET_NO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @param soPalletNo The value of the column 'SO_PALLET_NO'. (NullAllowed)
     */
    public void setSoPalletNo(String soPalletNo) {
        __modifiedProperties.add("soPalletNo");
        this._soPalletNo = soPalletNo;
    }

    /**
     * [get] TRSYMBOL_ID: {NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] SYMBOL_NO: {NotNull, bigint(19)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOL_NO'. (NullAllowed)
     */
    public Long getSymbolNo() {
        return _symbolNo;
    }

    /**
     * [set] SYMBOL_NO: {NotNull, bigint(19)} <br>
     * シンボル管理番号
     * @param symbolNo The value of the column 'SYMBOL_NO'. (NullAllowed)
     */
    public void setSymbolNo(Long symbolNo) {
        __modifiedProperties.add("symbolNo");
        this._symbolNo = symbolNo;
    }

    /**
     * [get] SORTED_QTY: {NotNull, bigint(19)} <br>
     * 仕分済数量
     * @return The value of the column 'SORTED_QTY'. (NullAllowed)
     */
    public Long getSortedQty() {
        return _sortedQty;
    }

    /**
     * [set] SORTED_QTY: {NotNull, bigint(19)} <br>
     * 仕分済数量
     * @param sortedQty The value of the column 'SORTED_QTY'. (NullAllowed)
     */
    public void setSortedQty(Long sortedQty) {
        __modifiedProperties.add("sortedQty");
        this._sortedQty = sortedQty;
    }

    /**
     * [get] ENTER_FLG: {NotNull, varchar(30)} <br>
     * 確定済フラグ
     * @return The value of the column 'ENTER_FLG'. (NullAllowed)
     */
    public String getEnterFlg() {
        return _enterFlg;
    }

    /**
     * [set] ENTER_FLG: {NotNull, varchar(30)} <br>
     * 確定済フラグ
     * @param enterFlg The value of the column 'ENTER_FLG'. (NullAllowed)
     */
    public void setEnterFlg(String enterFlg) {
        __modifiedProperties.add("enterFlg");
        this._enterFlg = enterFlg;
    }

    /**
     * [get] PACKED_FLG: {NotNull, varchar(30)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'PACKED_FLG'. (NullAllowed)
     */
    public String getPackedFlg() {
        return _packedFlg;
    }

    /**
     * [set] PACKED_FLG: {NotNull, varchar(30)} <br>
     * 段ボール有無フラグ
     * @param packedFlg The value of the column 'PACKED_FLG'. (NullAllowed)
     */
    public void setPackedFlg(String packedFlg) {
        __modifiedProperties.add("packedFlg");
        this._packedFlg = packedFlg;
    }

    /**
     * [get] RCV_KEY: {NotNull, bigint(19)} <br>
     * 入庫キー
     * @return The value of the column 'RCV_KEY'. (NullAllowed)
     */
    public Long getRcvKey() {
        return _rcvKey;
    }

    /**
     * [set] RCV_KEY: {NotNull, bigint(19)} <br>
     * 入庫キー
     * @param rcvKey The value of the column 'RCV_KEY'. (NullAllowed)
     */
    public void setRcvKey(Long rcvKey) {
        __modifiedProperties.add("rcvKey");
        this._rcvKey = rcvKey;
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
