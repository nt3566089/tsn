package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_CDRCATT_INST_INPUT as TABLE. <br>
 * 方面属性一括取込ワーク
 * <pre>
 * [primary-key]
 *     CDRCATT_INST_INPUT_ID
 *
 * [column]
 *     CDRCATT_INST_INPUT_ID, RECEIVE_CD, CENTER_CD, CLIENT_CD, COMPANY_CD, DPCD, DRCCD, ZZPSTNID, SRLIN, SRRNK, SNMPRTRNKAD, SRWKDY, COMT, SPRPRSID, ODDVID, HDRDBXUSID, IKEIINCLDFLG, REMOTEISLAND, ZZFRDATEH, ZZTODATEH, GRTNID, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CDRCATT_INST_INPUT_ID
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
public abstract class BsWCdrcattInstInputDto implements Serializable {

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
    /** CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _cdrcattInstInputId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _companyCd;

    /** DPCD: {varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DRCCD: {varchar(30)} */
    @JsonKey
    protected String _drccd;

    /** ZZPSTNID: {char(1)} */
    @JsonKey
    protected String _zzpstnid;

    /** SRLIN: {varchar(30)} */
    @JsonKey
    protected String _srlin;

    /** SRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** SNMPRTRNKAD: {char(1)} */
    @JsonKey
    protected String _snmprtrnkad;

    /** SRWKDY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _srwkdy;

    /** COMT: {varchar(60)} */
    @JsonKey
    protected String _comt;

    /** SPRPRSID: {char(1)} */
    @JsonKey
    protected String _sprprsid;

    /** ODDVID: {char(1)} */
    @JsonKey
    protected String _oddvid;

    /** HDRDBXUSID: {char(1)} */
    @JsonKey
    protected String _hdrdbxusid;

    /** IKEIINCLDFLG: {char(1)} */
    @JsonKey
    protected String _ikeiincldflg;

    /** REMOTEISLAND: {varchar(30)} */
    @JsonKey
    protected String _remoteisland;

    /** ZZFRDATEH: {varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** GRTNID: {char(1)} */
    @JsonKey
    protected String _grtnid;

    /** LINE_NO: {bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WORK_FLG: {char(1)} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    @JsonKey
    protected String _errorMsg;

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
    public BsWCdrcattInstInputDto() {
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
        if (other == null || !(other instanceof BsWCdrcattInstInputDto)) { return false; }
        final BsWCdrcattInstInputDto otherEntity = (BsWCdrcattInstInputDto)other;
        if (!helpComparingValue(getCdrcattInstInputId(), otherEntity.getCdrcattInstInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_CDRCATT_INST_INPUT");
        result = xCH(result, getCdrcattInstInputId());
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
        sb.append(c).append(getCdrcattInstInputId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCompanyCd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDrccd());
        sb.append(c).append(getZzpstnid());
        sb.append(c).append(getSrlin());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getSnmprtrnkad());
        sb.append(c).append(getSrwkdy());
        sb.append(c).append(getComt());
        sb.append(c).append(getSprprsid());
        sb.append(c).append(getOddvid());
        sb.append(c).append(getHdrdbxusid());
        sb.append(c).append(getIkeiincldflg());
        sb.append(c).append(getRemoteisland());
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getGrtnid());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMsg());
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
     * [get] CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性一括取込ワークID
     * @return The value of the column 'CDRCATT_INST_INPUT_ID'. (NullAllowed)
     */
    public Long getCdrcattInstInputId() {
        return _cdrcattInstInputId;
    }

    /**
     * [set] CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性一括取込ワークID
     * @param cdrcattInstInputId The value of the column 'CDRCATT_INST_INPUT_ID'. (NullAllowed)
     */
    public void setCdrcattInstInputId(Long cdrcattInstInputId) {
        __modifiedProperties.add("cdrcattInstInputId");
        this._cdrcattInstInputId = cdrcattInstInputId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public String getCompanyCd() {
        return _companyCd;
    }

    /**
     * [set] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public void setCompanyCd(String companyCd) {
        __modifiedProperties.add("companyCd");
        this._companyCd = companyCd;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] DRCCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DRCCD'. (NullAllowed)
     */
    public String getDrccd() {
        return _drccd;
    }

    /**
     * [set] DRCCD: {varchar(30)} <br>
     * 方面CD
     * @param drccd The value of the column 'DRCCD'. (NullAllowed)
     */
    public void setDrccd(String drccd) {
        __modifiedProperties.add("drccd");
        this._drccd = drccd;
    }

    /**
     * [get] ZZPSTNID: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'ZZPSTNID'. (NullAllowed)
     */
    public String getZzpstnid() {
        return _zzpstnid;
    }

    /**
     * [set] ZZPSTNID: {char(1)} <br>
     * ピストン区分
     * @param zzpstnid The value of the column 'ZZPSTNID'. (NullAllowed)
     */
    public void setZzpstnid(String zzpstnid) {
        __modifiedProperties.add("zzpstnid");
        this._zzpstnid = zzpstnid;
    }

    /**
     * [get] SRLIN: {varchar(30)} <br>
     * 仕分ライン
     * @return The value of the column 'SRLIN'. (NullAllowed)
     */
    public String getSrlin() {
        return _srlin;
    }

    /**
     * [set] SRLIN: {varchar(30)} <br>
     * 仕分ライン
     * @param srlin The value of the column 'SRLIN'. (NullAllowed)
     */
    public void setSrlin(String srlin) {
        __modifiedProperties.add("srlin");
        this._srlin = srlin;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed)
     */
    public Long getSrrnk() {
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed)
     */
    public void setSrrnk(Long srrnk) {
        __modifiedProperties.add("srrnk");
        this._srrnk = srrnk;
    }

    /**
     * [get] SNMPRTRNKAD: {char(1)} <br>
     * 通番印刷順（昇順／降順）
     * @return The value of the column 'SNMPRTRNKAD'. (NullAllowed)
     */
    public String getSnmprtrnkad() {
        return _snmprtrnkad;
    }

    /**
     * [set] SNMPRTRNKAD: {char(1)} <br>
     * 通番印刷順（昇順／降順）
     * @param snmprtrnkad The value of the column 'SNMPRTRNKAD'. (NullAllowed)
     */
    public void setSnmprtrnkad(String snmprtrnkad) {
        __modifiedProperties.add("snmprtrnkad");
        this._snmprtrnkad = snmprtrnkad;
    }

    /**
     * [get] SRWKDY: {decimal(16, 6)} <br>
     * 仕分曜日
     * @return The value of the column 'SRWKDY'. (NullAllowed)
     */
    public java.math.BigDecimal getSrwkdy() {
        return _srwkdy;
    }

    /**
     * [set] SRWKDY: {decimal(16, 6)} <br>
     * 仕分曜日
     * @param srwkdy The value of the column 'SRWKDY'. (NullAllowed)
     */
    public void setSrwkdy(java.math.BigDecimal srwkdy) {
        __modifiedProperties.add("srwkdy");
        this._srwkdy = srwkdy;
    }

    /**
     * [get] COMT: {varchar(60)} <br>
     * コメント
     * @return The value of the column 'COMT'. (NullAllowed)
     */
    public String getComt() {
        return _comt;
    }

    /**
     * [set] COMT: {varchar(60)} <br>
     * コメント
     * @param comt The value of the column 'COMT'. (NullAllowed)
     */
    public void setComt(String comt) {
        __modifiedProperties.add("comt");
        this._comt = comt;
    }

    /**
     * [get] SPRPRSID: {char(1)} <br>
     * 個口圧縮区分
     * @return The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public String getSprprsid() {
        return _sprprsid;
    }

    /**
     * [set] SPRPRSID: {char(1)} <br>
     * 個口圧縮区分
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public void setSprprsid(String sprprsid) {
        __modifiedProperties.add("sprprsid");
        this._sprprsid = sprprsid;
    }

    /**
     * [get] ODDVID: {char(1)} <br>
     * オーダー分割区分
     * @return The value of the column 'ODDVID'. (NullAllowed)
     */
    public String getOddvid() {
        return _oddvid;
    }

    /**
     * [set] ODDVID: {char(1)} <br>
     * オーダー分割区分
     * @param oddvid The value of the column 'ODDVID'. (NullAllowed)
     */
    public void setOddvid(String oddvid) {
        __modifiedProperties.add("oddvid");
        this._oddvid = oddvid;
    }

    /**
     * [get] HDRDBXUSID: {char(1)} <br>
     * １００箱使用区分
     * @return The value of the column 'HDRDBXUSID'. (NullAllowed)
     */
    public String getHdrdbxusid() {
        return _hdrdbxusid;
    }

    /**
     * [set] HDRDBXUSID: {char(1)} <br>
     * １００箱使用区分
     * @param hdrdbxusid The value of the column 'HDRDBXUSID'. (NullAllowed)
     */
    public void setHdrdbxusid(String hdrdbxusid) {
        __modifiedProperties.add("hdrdbxusid");
        this._hdrdbxusid = hdrdbxusid;
    }

    /**
     * [get] IKEIINCLDFLG: {char(1)} <br>
     * 異型品同梱フラグ
     * @return The value of the column 'IKEIINCLDFLG'. (NullAllowed)
     */
    public String getIkeiincldflg() {
        return _ikeiincldflg;
    }

    /**
     * [set] IKEIINCLDFLG: {char(1)} <br>
     * 異型品同梱フラグ
     * @param ikeiincldflg The value of the column 'IKEIINCLDFLG'. (NullAllowed)
     */
    public void setIkeiincldflg(String ikeiincldflg) {
        __modifiedProperties.add("ikeiincldflg");
        this._ikeiincldflg = ikeiincldflg;
    }

    /**
     * [get] REMOTEISLAND: {varchar(30)} <br>
     * 離島フラグ
     * @return The value of the column 'REMOTEISLAND'. (NullAllowed)
     */
    public String getRemoteisland() {
        return _remoteisland;
    }

    /**
     * [set] REMOTEISLAND: {varchar(30)} <br>
     * 離島フラグ
     * @param remoteisland The value of the column 'REMOTEISLAND'. (NullAllowed)
     */
    public void setRemoteisland(String remoteisland) {
        __modifiedProperties.add("remoteisland");
        this._remoteisland = remoteisland;
    }

    /**
     * [get] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public String getZzfrdateh() {
        return _zzfrdateh;
    }

    /**
     * [set] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public void setZzfrdateh(String zzfrdateh) {
        __modifiedProperties.add("zzfrdateh");
        this._zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public String getZztodateh() {
        return _zztodateh;
    }

    /**
     * [set] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public void setZztodateh(String zztodateh) {
        __modifiedProperties.add("zztodateh");
        this._zztodateh = zztodateh;
    }

    /**
     * [get] GRTNID: {char(1)} <br>
     * 世代区分
     * @return The value of the column 'GRTNID'. (NullAllowed)
     */
    public String getGrtnid() {
        return _grtnid;
    }

    /**
     * [set] GRTNID: {char(1)} <br>
     * 世代区分
     * @param grtnid The value of the column 'GRTNID'. (NullAllowed)
     */
    public void setGrtnid(String grtnid) {
        __modifiedProperties.add("grtnid");
        this._grtnid = grtnid;
    }

    /**
     * [get] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public String getErrorMsg() {
        return _errorMsg;
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public void setErrorMsg(String errorMsg) {
        __modifiedProperties.add("errorMsg");
        this._errorMsg = errorMsg;
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
