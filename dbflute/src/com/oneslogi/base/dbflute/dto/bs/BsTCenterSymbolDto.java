package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_CENTER_SYMBOL as TABLE. <br>
 * 拠点シンボル
 * <pre>
 * [primary-key]
 *     CENTER_SYMBOL_ID
 *
 * [column]
 *     CENTER_SYMBOL_ID, CENTER_ID, CLIENT_ID, PALLET_ID, TRSYMBOL_ID, CHILD_CENTER_SYMBOL_ID, SORTSTOCK_NUMBER, QR_CODE, LOT_ID, CASE_MOVE_STS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_SYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, T_CENTER_SYMBOL, M_CLIENT, T_PALLET, T_TRSYMBOL
 *
 * [referrer-table]
 *     T_CENTER_SYMBOL
 *
 * [foreign-property]
 *     mCenter, tCenterSymbolSelf, mClient, tPallet, tTrsymbol
 *
 * [referrer-property]
 *     tCenterSymbolSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTCenterSymbolDto implements Serializable {

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
    /** CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _centerSymbolId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** PALLET_ID: {bigint(19), FK to T_PALLET} */
    @JsonKey
    protected Long _palletId;

    /** TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL} */
    @JsonKey
    protected Long _trsymbolId;

    /** CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL} */
    @JsonKey
    protected Long _childCenterSymbolId;

    /** SORTSTOCK_NUMBER: {+UQ, bigint(19)} */
    @JsonKey
    protected Long _sortstockNumber;

    /** QR_CODE: {NotNull, varchar(255)} */
    @JsonKey
    protected String _qrCode;

    /** LOT_ID: {bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** CASE_MOVE_STS: {NotNull, varchar(30)} */
    @JsonKey
    protected String _caseMoveSts;

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
    public BsTCenterSymbolDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected TCenterSymbolDto _tCenterSymbolSelf;

    public TCenterSymbolDto getTCenterSymbolSelf() {
        return _tCenterSymbolSelf;
    }

    public void setTCenterSymbolSelf(TCenterSymbolDto tCenterSymbolSelf) {
        this._tCenterSymbolSelf = tCenterSymbolSelf;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected TPalletDto _tPallet;

    public TPalletDto getTPallet() {
        return _tPallet;
    }

    public void setTPallet(TPalletDto tPallet) {
        this._tPallet = tPallet;
    }

    protected TTrsymbolDto _tTrsymbol;

    public TTrsymbolDto getTTrsymbol() {
        return _tTrsymbol;
    }

    public void setTTrsymbol(TTrsymbolDto tTrsymbol) {
        this._tTrsymbol = tTrsymbol;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TCenterSymbolDto> _tCenterSymbolSelfList;

    public List<TCenterSymbolDto> getTCenterSymbolSelfList() {
        if (_tCenterSymbolSelfList == null) { _tCenterSymbolSelfList = new ArrayList<TCenterSymbolDto>(); }
        return _tCenterSymbolSelfList;
    }

    public void setTCenterSymbolSelfList(List<TCenterSymbolDto> tCenterSymbolSelfList) {
        this._tCenterSymbolSelfList = tCenterSymbolSelfList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTCenterSymbolDto)) { return false; }
        final BsTCenterSymbolDto otherEntity = (BsTCenterSymbolDto)other;
        if (!helpComparingValue(getCenterSymbolId(), otherEntity.getCenterSymbolId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CENTER_SYMBOL");
        result = xCH(result, getCenterSymbolId());
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
        sb.append(c).append(getCenterSymbolId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getChildCenterSymbolId());
        sb.append(c).append(getSortstockNumber());
        sb.append(c).append(getQrCode());
        sb.append(c).append(getLotId());
        sb.append(c).append(getCaseMoveSts());
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
     * [get] CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public Long getCenterSymbolId() {
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setCenterSymbolId(Long centerSymbolId) {
        __modifiedProperties.add("centerSymbolId");
        this._centerSymbolId = centerSymbolId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] PALLET_ID: {bigint(19), FK to T_PALLET} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public Long getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19), FK to T_PALLET} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(Long palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL} <br>
     * 子拠点シンボルID
     * @return The value of the column 'CHILD_CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public Long getChildCenterSymbolId() {
        return _childCenterSymbolId;
    }

    /**
     * [set] CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL} <br>
     * 子拠点シンボルID
     * @param childCenterSymbolId The value of the column 'CHILD_CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setChildCenterSymbolId(Long childCenterSymbolId) {
        __modifiedProperties.add("childCenterSymbolId");
        this._childCenterSymbolId = childCenterSymbolId;
    }

    /**
     * [get] SORTSTOCK_NUMBER: {+UQ, bigint(19)} <br>
     * 補充順
     * @return The value of the column 'SORTSTOCK_NUMBER'. (NullAllowed)
     */
    public Long getSortstockNumber() {
        return _sortstockNumber;
    }

    /**
     * [set] SORTSTOCK_NUMBER: {+UQ, bigint(19)} <br>
     * 補充順
     * @param sortstockNumber The value of the column 'SORTSTOCK_NUMBER'. (NullAllowed)
     */
    public void setSortstockNumber(Long sortstockNumber) {
        __modifiedProperties.add("sortstockNumber");
        this._sortstockNumber = sortstockNumber;
    }

    /**
     * [get] QR_CODE: {NotNull, varchar(255)} <br>
     * QRコード
     * @return The value of the column 'QR_CODE'. (NullAllowed)
     */
    public String getQrCode() {
        return _qrCode;
    }

    /**
     * [set] QR_CODE: {NotNull, varchar(255)} <br>
     * QRコード
     * @param qrCode The value of the column 'QR_CODE'. (NullAllowed)
     */
    public void setQrCode(String qrCode) {
        __modifiedProperties.add("qrCode");
        this._qrCode = qrCode;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] CASE_MOVE_STS: {NotNull, varchar(30)} <br>
     * 移動ステータス
     * @return The value of the column 'CASE_MOVE_STS'. (NullAllowed)
     */
    public String getCaseMoveSts() {
        return _caseMoveSts;
    }

    /**
     * [set] CASE_MOVE_STS: {NotNull, varchar(30)} <br>
     * 移動ステータス
     * @param caseMoveSts The value of the column 'CASE_MOVE_STS'. (NullAllowed)
     */
    public void setCaseMoveSts(String caseMoveSts) {
        __modifiedProperties.add("caseMoveSts");
        this._caseMoveSts = caseMoveSts;
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
