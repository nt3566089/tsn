package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CORG as TABLE. <br>
 * 組織(仕分)マスタ
 * <pre>
 * [primary-key]
 *     CORG_ID
 *
 * [column]
 *     CORG_ID, CENTER_ID, ORGID, ORGNMKJF, ORGNMKNF, ORGNMKJ, ORGNMKN, UPORGNCD, ZZBASECD, ZZCOMACD, ZZWHMGID, OTRNK, RDVDID, ZZABLYMD, ZZFRDATEH, ZZTODATEH, SASASID, CMLRASID, ANWHNM, ODTSCD, LNARCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCorgDto implements Serializable {

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
    /** CORG_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _corgId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** ORGID: {varchar(30)} */
    @JsonKey
    protected String _orgid;

    /** ORGNMKJF: {varchar(60)} */
    @JsonKey
    protected String _orgnmkjf;

    /** ORGNMKNF: {varchar(60)} */
    @JsonKey
    protected String _orgnmknf;

    /** ORGNMKJ: {varchar(30)} */
    @JsonKey
    protected String _orgnmkj;

    /** ORGNMKN: {varchar(30)} */
    @JsonKey
    protected String _orgnmkn;

    /** UPORGNCD: {varchar(30)} */
    @JsonKey
    protected String _uporgncd;

    /** ZZBASECD: {varchar(30)} */
    @JsonKey
    protected String _zzbasecd;

    /** ZZCOMACD: {varchar(30)} */
    @JsonKey
    protected String _zzcomacd;

    /** ZZWHMGID: {varchar(30)} */
    @JsonKey
    protected String _zzwhmgid;

    /** OTRNK: {bigint(19)} */
    @JsonKey
    protected Long _otrnk;

    /** RDVDID: {varchar(30)} */
    @JsonKey
    protected String _rdvdid;

    /** ZZABLYMD: {varchar(8)} */
    @JsonKey
    protected String _zzablymd;

    /** ZZFRDATEH: {NotNull, varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** SASASID: {char(1)} */
    @JsonKey
    protected String _sasasid;

    /** CMLRASID: {char(1)} */
    @JsonKey
    protected String _cmlrasid;

    /** ANWHNM: {varchar(30)} */
    @JsonKey
    protected String _anwhnm;

    /** ODTSCD: {char(1)} */
    @JsonKey
    protected String _odtscd;

    /** LNARCD: {char(1)} */
    @JsonKey
    protected String _lnarcd;

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
    public BsMCorgDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCorgDto)) { return false; }
        final BsMCorgDto otherEntity = (BsMCorgDto)other;
        if (!helpComparingValue(getCorgId(), otherEntity.getCorgId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CORG");
        result = xCH(result, getCorgId());
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
        sb.append(c).append(getCorgId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getOrgid());
        sb.append(c).append(getOrgnmkjf());
        sb.append(c).append(getOrgnmknf());
        sb.append(c).append(getOrgnmkj());
        sb.append(c).append(getOrgnmkn());
        sb.append(c).append(getUporgncd());
        sb.append(c).append(getZzbasecd());
        sb.append(c).append(getZzcomacd());
        sb.append(c).append(getZzwhmgid());
        sb.append(c).append(getOtrnk());
        sb.append(c).append(getRdvdid());
        sb.append(c).append(getZzablymd());
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getSasasid());
        sb.append(c).append(getCmlrasid());
        sb.append(c).append(getAnwhnm());
        sb.append(c).append(getOdtscd());
        sb.append(c).append(getLnarcd());
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
     * [get] CORG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @return The value of the column 'CORG_ID'. (NullAllowed)
     */
    public Long getCorgId() {
        return _corgId;
    }

    /**
     * [set] CORG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @param corgId The value of the column 'CORG_ID'. (NullAllowed)
     */
    public void setCorgId(Long corgId) {
        __modifiedProperties.add("corgId");
        this._corgId = corgId;
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
     * [get] ORGID: {varchar(30)} <br>
     * 組織区分
     * @return The value of the column 'ORGID'. (NullAllowed)
     */
    public String getOrgid() {
        return _orgid;
    }

    /**
     * [set] ORGID: {varchar(30)} <br>
     * 組織区分
     * @param orgid The value of the column 'ORGID'. (NullAllowed)
     */
    public void setOrgid(String orgid) {
        __modifiedProperties.add("orgid");
        this._orgid = orgid;
    }

    /**
     * [get] ORGNMKJF: {varchar(60)} <br>
     * 組織名正称(TSN)（全角）
     * @return The value of the column 'ORGNMKJF'. (NullAllowed)
     */
    public String getOrgnmkjf() {
        return _orgnmkjf;
    }

    /**
     * [set] ORGNMKJF: {varchar(60)} <br>
     * 組織名正称(TSN)（全角）
     * @param orgnmkjf The value of the column 'ORGNMKJF'. (NullAllowed)
     */
    public void setOrgnmkjf(String orgnmkjf) {
        __modifiedProperties.add("orgnmkjf");
        this._orgnmkjf = orgnmkjf;
    }

    /**
     * [get] ORGNMKNF: {varchar(60)} <br>
     * 組織名正称(TSN)（半角）
     * @return The value of the column 'ORGNMKNF'. (NullAllowed)
     */
    public String getOrgnmknf() {
        return _orgnmknf;
    }

    /**
     * [set] ORGNMKNF: {varchar(60)} <br>
     * 組織名正称(TSN)（半角）
     * @param orgnmknf The value of the column 'ORGNMKNF'. (NullAllowed)
     */
    public void setOrgnmknf(String orgnmknf) {
        __modifiedProperties.add("orgnmknf");
        this._orgnmknf = orgnmknf;
    }

    /**
     * [get] ORGNMKJ: {varchar(30)} <br>
     * 組織名略称(TSN)（全角）
     * @return The value of the column 'ORGNMKJ'. (NullAllowed)
     */
    public String getOrgnmkj() {
        return _orgnmkj;
    }

    /**
     * [set] ORGNMKJ: {varchar(30)} <br>
     * 組織名略称(TSN)（全角）
     * @param orgnmkj The value of the column 'ORGNMKJ'. (NullAllowed)
     */
    public void setOrgnmkj(String orgnmkj) {
        __modifiedProperties.add("orgnmkj");
        this._orgnmkj = orgnmkj;
    }

    /**
     * [get] ORGNMKN: {varchar(30)} <br>
     * 組織名略称(TSN)（半角）
     * @return The value of the column 'ORGNMKN'. (NullAllowed)
     */
    public String getOrgnmkn() {
        return _orgnmkn;
    }

    /**
     * [set] ORGNMKN: {varchar(30)} <br>
     * 組織名略称(TSN)（半角）
     * @param orgnmkn The value of the column 'ORGNMKN'. (NullAllowed)
     */
    public void setOrgnmkn(String orgnmkn) {
        __modifiedProperties.add("orgnmkn");
        this._orgnmkn = orgnmkn;
    }

    /**
     * [get] UPORGNCD: {varchar(30)} <br>
     * 上位組織CD
     * @return The value of the column 'UPORGNCD'. (NullAllowed)
     */
    public String getUporgncd() {
        return _uporgncd;
    }

    /**
     * [set] UPORGNCD: {varchar(30)} <br>
     * 上位組織CD
     * @param uporgncd The value of the column 'UPORGNCD'. (NullAllowed)
     */
    public void setUporgncd(String uporgncd) {
        __modifiedProperties.add("uporgncd");
        this._uporgncd = uporgncd;
    }

    /**
     * [get] ZZBASECD: {varchar(30)} <br>
     * 基地圏CD
     * @return The value of the column 'ZZBASECD'. (NullAllowed)
     */
    public String getZzbasecd() {
        return _zzbasecd;
    }

    /**
     * [set] ZZBASECD: {varchar(30)} <br>
     * 基地圏CD
     * @param zzbasecd The value of the column 'ZZBASECD'. (NullAllowed)
     */
    public void setZzbasecd(String zzbasecd) {
        __modifiedProperties.add("zzbasecd");
        this._zzbasecd = zzbasecd;
    }

    /**
     * [get] ZZCOMACD: {varchar(30)} <br>
     * 会社圏CD
     * @return The value of the column 'ZZCOMACD'. (NullAllowed)
     */
    public String getZzcomacd() {
        return _zzcomacd;
    }

    /**
     * [set] ZZCOMACD: {varchar(30)} <br>
     * 会社圏CD
     * @param zzcomacd The value of the column 'ZZCOMACD'. (NullAllowed)
     */
    public void setZzcomacd(String zzcomacd) {
        __modifiedProperties.add("zzcomacd");
        this._zzcomacd = zzcomacd;
    }

    /**
     * [get] ZZWHMGID: {varchar(30)} <br>
     * 倉庫機能区分
     * @return The value of the column 'ZZWHMGID'. (NullAllowed)
     */
    public String getZzwhmgid() {
        return _zzwhmgid;
    }

    /**
     * [set] ZZWHMGID: {varchar(30)} <br>
     * 倉庫機能区分
     * @param zzwhmgid The value of the column 'ZZWHMGID'. (NullAllowed)
     */
    public void setZzwhmgid(String zzwhmgid) {
        __modifiedProperties.add("zzwhmgid");
        this._zzwhmgid = zzwhmgid;
    }

    /**
     * [get] OTRNK: {bigint(19)} <br>
     * 出力順
     * @return The value of the column 'OTRNK'. (NullAllowed)
     */
    public Long getOtrnk() {
        return _otrnk;
    }

    /**
     * [set] OTRNK: {bigint(19)} <br>
     * 出力順
     * @param otrnk The value of the column 'OTRNK'. (NullAllowed)
     */
    public void setOtrnk(Long otrnk) {
        __modifiedProperties.add("otrnk");
        this._otrnk = otrnk;
    }

    /**
     * [get] RDVDID: {varchar(30)} <br>
     * SAP振分区分
     * @return The value of the column 'RDVDID'. (NullAllowed)
     */
    public String getRdvdid() {
        return _rdvdid;
    }

    /**
     * [set] RDVDID: {varchar(30)} <br>
     * SAP振分区分
     * @param rdvdid The value of the column 'RDVDID'. (NullAllowed)
     */
    public void setRdvdid(String rdvdid) {
        __modifiedProperties.add("rdvdid");
        this._rdvdid = rdvdid;
    }

    /**
     * [get] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'ZZABLYMD'. (NullAllowed)
     */
    public String getZzablymd() {
        return _zzablymd;
    }

    /**
     * [set] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @param zzablymd The value of the column 'ZZABLYMD'. (NullAllowed)
     */
    public void setZzablymd(String zzablymd) {
        __modifiedProperties.add("zzablymd");
        this._zzablymd = zzablymd;
    }

    /**
     * [get] ZZFRDATEH: {NotNull, varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public String getZzfrdateh() {
        return _zzfrdateh;
    }

    /**
     * [set] ZZFRDATEH: {NotNull, varchar(8)} <br>
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
     * [get] SASASID: {char(1)} <br>
     * 入出庫管理区分
     * @return The value of the column 'SASASID'. (NullAllowed)
     */
    public String getSasasid() {
        return _sasasid;
    }

    /**
     * [set] SASASID: {char(1)} <br>
     * 入出庫管理区分
     * @param sasasid The value of the column 'SASASID'. (NullAllowed)
     */
    public void setSasasid(String sasasid) {
        __modifiedProperties.add("sasasid");
        this._sasasid = sasasid;
    }

    /**
     * [get] CMLRASID: {char(1)} <br>
     * 共通下位管理区分
     * @return The value of the column 'CMLRASID'. (NullAllowed)
     */
    public String getCmlrasid() {
        return _cmlrasid;
    }

    /**
     * [set] CMLRASID: {char(1)} <br>
     * 共通下位管理区分
     * @param cmlrasid The value of the column 'CMLRASID'. (NullAllowed)
     */
    public void setCmlrasid(String cmlrasid) {
        __modifiedProperties.add("cmlrasid");
        this._cmlrasid = cmlrasid;
    }

    /**
     * [get] ANWHNM: {varchar(30)} <br>
     * 短縮組織名
     * @return The value of the column 'ANWHNM'. (NullAllowed)
     */
    public String getAnwhnm() {
        return _anwhnm;
    }

    /**
     * [set] ANWHNM: {varchar(30)} <br>
     * 短縮組織名
     * @param anwhnm The value of the column 'ANWHNM'. (NullAllowed)
     */
    public void setAnwhnm(String anwhnm) {
        __modifiedProperties.add("anwhnm");
        this._anwhnm = anwhnm;
    }

    /**
     * [get] ODTSCD: {char(1)} <br>
     * 旧TSCD
     * @return The value of the column 'ODTSCD'. (NullAllowed)
     */
    public String getOdtscd() {
        return _odtscd;
    }

    /**
     * [set] ODTSCD: {char(1)} <br>
     * 旧TSCD
     * @param odtscd The value of the column 'ODTSCD'. (NullAllowed)
     */
    public void setOdtscd(String odtscd) {
        __modifiedProperties.add("odtscd");
        this._odtscd = odtscd;
    }

    /**
     * [get] LNARCD: {char(1)} <br>
     * 仕入エリアCD
     * @return The value of the column 'LNARCD'. (NullAllowed)
     */
    public String getLnarcd() {
        return _lnarcd;
    }

    /**
     * [set] LNARCD: {char(1)} <br>
     * 仕入エリアCD
     * @param lnarcd The value of the column 'LNARCD'. (NullAllowed)
     */
    public void setLnarcd(String lnarcd) {
        __modifiedProperties.add("lnarcd");
        this._lnarcd = lnarcd;
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
