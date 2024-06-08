package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CDRCATT as TABLE. <br>
 * 方面属性マスタ
 * <pre>
 * [primary-key]
 *     CDRCATTID
 *
 * [column]
 *     CDRCATTID, CENTER_ID, CLIENT_ID, DPCD, DRCCD, ZZPSTNID, SRLIN, SRRNK, SNMPRTRNKAD, SRWKDY, COMT, SPRPRSID, ODDVID, HDRDBXUSID, ZZFRDATEH, ZZTODATEH, GRTNID, IKEIINCLDFLG, REMOTEISLAND, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CDRCATTID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCdrcattDto implements Serializable {

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
    /** CDRCATTID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _cdrcattid;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** DPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DRCCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _drccd;

    /** ZZPSTNID: {NotNull, char(1)} */
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

    /** SRWKDY: {NotNull, decimal(16, 6)} */
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

    /** ZZFRDATEH: {varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** GRTNID: {NotNull, char(1)} */
    @JsonKey
    protected String _grtnid;

    /** IKEIINCLDFLG: {char(1)} */
    @JsonKey
    protected String _ikeiincldflg;

    /** REMOTEISLAND: {varchar(30)} */
    @JsonKey
    protected String _remoteisland;

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
    public BsMCdrcattDto() {
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

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCdrcattDto)) { return false; }
        final BsMCdrcattDto otherEntity = (BsMCdrcattDto)other;
        if (!helpComparingValue(getCdrcattid(), otherEntity.getCdrcattid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CDRCATT");
        result = xCH(result, getCdrcattid());
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
        sb.append(c).append(getCdrcattid());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getGrtnid());
        sb.append(c).append(getIkeiincldflg());
        sb.append(c).append(getRemoteisland());
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
     * [get] CDRCATTID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性ID
     * @return The value of the column 'CDRCATTID'. (NullAllowed)
     */
    public Long getCdrcattid() {
        return _cdrcattid;
    }

    /**
     * [set] CDRCATTID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性ID
     * @param cdrcattid The value of the column 'CDRCATTID'. (NullAllowed)
     */
    public void setCdrcattid(Long cdrcattid) {
        __modifiedProperties.add("cdrcattid");
        this._cdrcattid = cdrcattid;
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
     * [get] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] DRCCD: {NotNull, varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DRCCD'. (NullAllowed)
     */
    public String getDrccd() {
        return _drccd;
    }

    /**
     * [set] DRCCD: {NotNull, varchar(30)} <br>
     * 方面CD
     * @param drccd The value of the column 'DRCCD'. (NullAllowed)
     */
    public void setDrccd(String drccd) {
        __modifiedProperties.add("drccd");
        this._drccd = drccd;
    }

    /**
     * [get] ZZPSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @return The value of the column 'ZZPSTNID'. (NullAllowed)
     */
    public String getZzpstnid() {
        return _zzpstnid;
    }

    /**
     * [set] ZZPSTNID: {NotNull, char(1)} <br>
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
     * [get] SRWKDY: {NotNull, decimal(16, 6)} <br>
     * 仕分曜日
     * @return The value of the column 'SRWKDY'. (NullAllowed)
     */
    public java.math.BigDecimal getSrwkdy() {
        return _srwkdy;
    }

    /**
     * [set] SRWKDY: {NotNull, decimal(16, 6)} <br>
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
     * [get] GRTNID: {NotNull, char(1)} <br>
     * 世代区分
     * @return The value of the column 'GRTNID'. (NullAllowed)
     */
    public String getGrtnid() {
        return _grtnid;
    }

    /**
     * [set] GRTNID: {NotNull, char(1)} <br>
     * 世代区分
     * @param grtnid The value of the column 'GRTNID'. (NullAllowed)
     */
    public void setGrtnid(String grtnid) {
        __modifiedProperties.add("grtnid");
        this._grtnid = grtnid;
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
     * 離島
     * @return The value of the column 'REMOTEISLAND'. (NullAllowed)
     */
    public String getRemoteisland() {
        return _remoteisland;
    }

    /**
     * [set] REMOTEISLAND: {varchar(30)} <br>
     * 離島
     * @param remoteisland The value of the column 'REMOTEISLAND'. (NullAllowed)
     */
    public void setRemoteisland(String remoteisland) {
        __modifiedProperties.add("remoteisland");
        this._remoteisland = remoteisland;
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
