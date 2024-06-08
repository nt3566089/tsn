package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of M_CRELAYBS as TABLE. <br>
 * 中継拠点マスタ
 * <pre>
 * [primary-key]
 *     CRELAYBS_ID
 *
 * [column]
 *     CRELAYBS_ID, RLYBSCD, DLVDPCD, RLYBSNM, RLYBSSNM, RLYBSP, RLYBSACD, RLYBSCCD, RLYBSAR, RLYBSTL, RLYBSFN, RLYBSID, RLYSHAN, DELYMD, CHNGYD, UPDTM, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CRELAYBS_ID
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
public abstract class BsMCrelaybsDto implements Serializable {

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
    /** CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _crelaybsId;

    /** RLYBSCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rlybscd;

    /** DLVDPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dlvdpcd;

    /** RLYBSNM: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rlybsnm;

    /** RLYBSSNM: {varchar(30)} */
    @JsonKey
    protected String _rlybssnm;

    /** RLYBSP: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rlybsp;

    /** RLYBSACD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rlybsacd;

    /** RLYBSCCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rlybsccd;

    /** RLYBSAR: {NotNull, varchar(60)} */
    @JsonKey
    protected String _rlybsar;

    /** RLYBSTL: {varchar(30)} */
    @JsonKey
    protected String _rlybstl;

    /** RLYBSFN: {varchar(30)} */
    @JsonKey
    protected String _rlybsfn;

    /** RLYBSID: {char(1)} */
    @JsonKey
    protected String _rlybsid;

    /** RLYSHAN: {varchar(60)} */
    @JsonKey
    protected String _rlyshan;

    /** DELYMD: {varchar(8)} */
    @JsonKey
    protected String _delymd;

    /** CHNGYD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _chngyd;

    /** UPDTM: {varchar(30)} */
    @JsonKey
    protected String _updtm;

    /** ZZFRDATEH: {NotNull, varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {NotNull, varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** RCDUPDPS: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rcdupdps;

    /** UPDPOCD: {varchar(30)} */
    @JsonKey
    protected String _updpocd;

    /** OTCMPFG: {char(1)} */
    @JsonKey
    protected String _otcmpfg;

    /** TMCMPFG: {char(1)} */
    @JsonKey
    protected String _tmcmpfg;

    /** STMID: {varchar(30)} */
    @JsonKey
    protected String _stmid;

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
    public BsMCrelaybsDto() {
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
        if (other == null || !(other instanceof BsMCrelaybsDto)) { return false; }
        final BsMCrelaybsDto otherEntity = (BsMCrelaybsDto)other;
        if (!helpComparingValue(getCrelaybsId(), otherEntity.getCrelaybsId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CRELAYBS");
        result = xCH(result, getCrelaybsId());
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
        sb.append(c).append(getCrelaybsId());
        sb.append(c).append(getRlybscd());
        sb.append(c).append(getDlvdpcd());
        sb.append(c).append(getRlybsnm());
        sb.append(c).append(getRlybssnm());
        sb.append(c).append(getRlybsp());
        sb.append(c).append(getRlybsacd());
        sb.append(c).append(getRlybsccd());
        sb.append(c).append(getRlybsar());
        sb.append(c).append(getRlybstl());
        sb.append(c).append(getRlybsfn());
        sb.append(c).append(getRlybsid());
        sb.append(c).append(getRlyshan());
        sb.append(c).append(getDelymd());
        sb.append(c).append(getChngyd());
        sb.append(c).append(getUpdtm());
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getRcdupdps());
        sb.append(c).append(getUpdpocd());
        sb.append(c).append(getOtcmpfg());
        sb.append(c).append(getTmcmpfg());
        sb.append(c).append(getStmid());
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
     * [get] CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 中継拠点ID
     * @return The value of the column 'CRELAYBS_ID'. (NullAllowed)
     */
    public Long getCrelaybsId() {
        return _crelaybsId;
    }

    /**
     * [set] CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 中継拠点ID
     * @param crelaybsId The value of the column 'CRELAYBS_ID'. (NullAllowed)
     */
    public void setCrelaybsId(Long crelaybsId) {
        __modifiedProperties.add("crelaybsId");
        this._crelaybsId = crelaybsId;
    }

    /**
     * [get] RLYBSCD: {NotNull, varchar(30)} <br>
     * 中継拠点CD
     * @return The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public String getRlybscd() {
        return _rlybscd;
    }

    /**
     * [set] RLYBSCD: {NotNull, varchar(30)} <br>
     * 中継拠点CD
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public void setRlybscd(String rlybscd) {
        __modifiedProperties.add("rlybscd");
        this._rlybscd = rlybscd;
    }

    /**
     * [get] DLVDPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DLVDPCD'. (NullAllowed)
     */
    public String getDlvdpcd() {
        return _dlvdpcd;
    }

    /**
     * [set] DLVDPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dlvdpcd The value of the column 'DLVDPCD'. (NullAllowed)
     */
    public void setDlvdpcd(String dlvdpcd) {
        __modifiedProperties.add("dlvdpcd");
        this._dlvdpcd = dlvdpcd;
    }

    /**
     * [get] RLYBSNM: {NotNull, varchar(30)} <br>
     * 中継拠点名称
     * @return The value of the column 'RLYBSNM'. (NullAllowed)
     */
    public String getRlybsnm() {
        return _rlybsnm;
    }

    /**
     * [set] RLYBSNM: {NotNull, varchar(30)} <br>
     * 中継拠点名称
     * @param rlybsnm The value of the column 'RLYBSNM'. (NullAllowed)
     */
    public void setRlybsnm(String rlybsnm) {
        __modifiedProperties.add("rlybsnm");
        this._rlybsnm = rlybsnm;
    }

    /**
     * [get] RLYBSSNM: {varchar(30)} <br>
     * 中継拠点短縮名
     * @return The value of the column 'RLYBSSNM'. (NullAllowed)
     */
    public String getRlybssnm() {
        return _rlybssnm;
    }

    /**
     * [set] RLYBSSNM: {varchar(30)} <br>
     * 中継拠点短縮名
     * @param rlybssnm The value of the column 'RLYBSSNM'. (NullAllowed)
     */
    public void setRlybssnm(String rlybssnm) {
        __modifiedProperties.add("rlybssnm");
        this._rlybssnm = rlybssnm;
    }

    /**
     * [get] RLYBSP: {NotNull, varchar(30)} <br>
     * 中継拠点郵便番号
     * @return The value of the column 'RLYBSP'. (NullAllowed)
     */
    public String getRlybsp() {
        return _rlybsp;
    }

    /**
     * [set] RLYBSP: {NotNull, varchar(30)} <br>
     * 中継拠点郵便番号
     * @param rlybsp The value of the column 'RLYBSP'. (NullAllowed)
     */
    public void setRlybsp(String rlybsp) {
        __modifiedProperties.add("rlybsp");
        this._rlybsp = rlybsp;
    }

    /**
     * [get] RLYBSACD: {NotNull, varchar(30)} <br>
     * 中継拠点都道府県CD
     * @return The value of the column 'RLYBSACD'. (NullAllowed)
     */
    public String getRlybsacd() {
        return _rlybsacd;
    }

    /**
     * [set] RLYBSACD: {NotNull, varchar(30)} <br>
     * 中継拠点都道府県CD
     * @param rlybsacd The value of the column 'RLYBSACD'. (NullAllowed)
     */
    public void setRlybsacd(String rlybsacd) {
        __modifiedProperties.add("rlybsacd");
        this._rlybsacd = rlybsacd;
    }

    /**
     * [get] RLYBSCCD: {NotNull, varchar(30)} <br>
     * 中継拠点市区町村CD
     * @return The value of the column 'RLYBSCCD'. (NullAllowed)
     */
    public String getRlybsccd() {
        return _rlybsccd;
    }

    /**
     * [set] RLYBSCCD: {NotNull, varchar(30)} <br>
     * 中継拠点市区町村CD
     * @param rlybsccd The value of the column 'RLYBSCCD'. (NullAllowed)
     */
    public void setRlybsccd(String rlybsccd) {
        __modifiedProperties.add("rlybsccd");
        this._rlybsccd = rlybsccd;
    }

    /**
     * [get] RLYBSAR: {NotNull, varchar(60)} <br>
     * 中継拠点住所
     * @return The value of the column 'RLYBSAR'. (NullAllowed)
     */
    public String getRlybsar() {
        return _rlybsar;
    }

    /**
     * [set] RLYBSAR: {NotNull, varchar(60)} <br>
     * 中継拠点住所
     * @param rlybsar The value of the column 'RLYBSAR'. (NullAllowed)
     */
    public void setRlybsar(String rlybsar) {
        __modifiedProperties.add("rlybsar");
        this._rlybsar = rlybsar;
    }

    /**
     * [get] RLYBSTL: {varchar(30)} <br>
     * 中継拠点電話番号
     * @return The value of the column 'RLYBSTL'. (NullAllowed)
     */
    public String getRlybstl() {
        return _rlybstl;
    }

    /**
     * [set] RLYBSTL: {varchar(30)} <br>
     * 中継拠点電話番号
     * @param rlybstl The value of the column 'RLYBSTL'. (NullAllowed)
     */
    public void setRlybstl(String rlybstl) {
        __modifiedProperties.add("rlybstl");
        this._rlybstl = rlybstl;
    }

    /**
     * [get] RLYBSFN: {varchar(30)} <br>
     * 中継拠点FAX番号
     * @return The value of the column 'RLYBSFN'. (NullAllowed)
     */
    public String getRlybsfn() {
        return _rlybsfn;
    }

    /**
     * [set] RLYBSFN: {varchar(30)} <br>
     * 中継拠点FAX番号
     * @param rlybsfn The value of the column 'RLYBSFN'. (NullAllowed)
     */
    public void setRlybsfn(String rlybsfn) {
        __modifiedProperties.add("rlybsfn");
        this._rlybsfn = rlybsfn;
    }

    /**
     * [get] RLYBSID: {char(1)} <br>
     * 中継拠点区分
     * @return The value of the column 'RLYBSID'. (NullAllowed)
     */
    public String getRlybsid() {
        return _rlybsid;
    }

    /**
     * [set] RLYBSID: {char(1)} <br>
     * 中継拠点区分
     * @param rlybsid The value of the column 'RLYBSID'. (NullAllowed)
     */
    public void setRlybsid(String rlybsid) {
        __modifiedProperties.add("rlybsid");
        this._rlybsid = rlybsid;
    }

    /**
     * [get] RLYSHAN: {varchar(60)} <br>
     * 中継輸送業者名
     * @return The value of the column 'RLYSHAN'. (NullAllowed)
     */
    public String getRlyshan() {
        return _rlyshan;
    }

    /**
     * [set] RLYSHAN: {varchar(60)} <br>
     * 中継輸送業者名
     * @param rlyshan The value of the column 'RLYSHAN'. (NullAllowed)
     */
    public void setRlyshan(String rlyshan) {
        __modifiedProperties.add("rlyshan");
        this._rlyshan = rlyshan;
    }

    /**
     * [get] DELYMD: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'DELYMD'. (NullAllowed)
     */
    public String getDelymd() {
        return _delymd;
    }

    /**
     * [set] DELYMD: {varchar(8)} <br>
     * 廃止年月日
     * @param delymd The value of the column 'DELYMD'. (NullAllowed)
     */
    public void setDelymd(String delymd) {
        __modifiedProperties.add("delymd");
        this._delymd = delymd;
    }

    /**
     * [get] CHNGYD: {NotNull, varchar(8)} <br>
     * 更新年月日
     * @return The value of the column 'CHNGYD'. (NullAllowed)
     */
    public String getChngyd() {
        return _chngyd;
    }

    /**
     * [set] CHNGYD: {NotNull, varchar(8)} <br>
     * 更新年月日
     * @param chngyd The value of the column 'CHNGYD'. (NullAllowed)
     */
    public void setChngyd(String chngyd) {
        __modifiedProperties.add("chngyd");
        this._chngyd = chngyd;
    }

    /**
     * [get] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @return The value of the column 'UPDTM'. (NullAllowed)
     */
    public String getUpdtm() {
        return _updtm;
    }

    /**
     * [set] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @param updtm The value of the column 'UPDTM'. (NullAllowed)
     */
    public void setUpdtm(String updtm) {
        __modifiedProperties.add("updtm");
        this._updtm = updtm;
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
     * [get] ZZTODATEH: {NotNull, varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public String getZztodateh() {
        return _zztodateh;
    }

    /**
     * [set] ZZTODATEH: {NotNull, varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public void setZztodateh(String zztodateh) {
        __modifiedProperties.add("zztodateh");
        this._zztodateh = zztodateh;
    }

    /**
     * [get] RCDUPDPS: {NotNull, varchar(30)} <br>
     * レコード更新処理区分
     * @return The value of the column 'RCDUPDPS'. (NullAllowed)
     */
    public String getRcdupdps() {
        return _rcdupdps;
    }

    /**
     * [set] RCDUPDPS: {NotNull, varchar(30)} <br>
     * レコード更新処理区分
     * @param rcdupdps The value of the column 'RCDUPDPS'. (NullAllowed)
     */
    public void setRcdupdps(String rcdupdps) {
        __modifiedProperties.add("rcdupdps");
        this._rcdupdps = rcdupdps;
    }

    /**
     * [get] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @return The value of the column 'UPDPOCD'. (NullAllowed)
     */
    public String getUpdpocd() {
        return _updpocd;
    }

    /**
     * [set] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @param updpocd The value of the column 'UPDPOCD'. (NullAllowed)
     */
    public void setUpdpocd(String updpocd) {
        __modifiedProperties.add("updpocd");
        this._updpocd = updpocd;
    }

    /**
     * [get] OTCMPFG: {char(1)} <br>
     * 出力済フラグ
     * @return The value of the column 'OTCMPFG'. (NullAllowed)
     */
    public String getOtcmpfg() {
        return _otcmpfg;
    }

    /**
     * [set] OTCMPFG: {char(1)} <br>
     * 出力済フラグ
     * @param otcmpfg The value of the column 'OTCMPFG'. (NullAllowed)
     */
    public void setOtcmpfg(String otcmpfg) {
        __modifiedProperties.add("otcmpfg");
        this._otcmpfg = otcmpfg;
    }

    /**
     * [get] TMCMPFG: {char(1)} <br>
     * 送信済フラグ
     * @return The value of the column 'TMCMPFG'. (NullAllowed)
     */
    public String getTmcmpfg() {
        return _tmcmpfg;
    }

    /**
     * [set] TMCMPFG: {char(1)} <br>
     * 送信済フラグ
     * @param tmcmpfg The value of the column 'TMCMPFG'. (NullAllowed)
     */
    public void setTmcmpfg(String tmcmpfg) {
        __modifiedProperties.add("tmcmpfg");
        this._tmcmpfg = tmcmpfg;
    }

    /**
     * [get] STMID: {varchar(30)} <br>
     * システム区分
     * @return The value of the column 'STMID'. (NullAllowed)
     */
    public String getStmid() {
        return _stmid;
    }

    /**
     * [set] STMID: {varchar(30)} <br>
     * システム区分
     * @param stmid The value of the column 'STMID'. (NullAllowed)
     */
    public void setStmid(String stmid) {
        __modifiedProperties.add("stmid");
        this._stmid = stmid;
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
