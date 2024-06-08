package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_TSN_MFCOMPANY as TABLE. <br>
 * TSN組織マスタ
 * <pre>
 * [primary-key]
 *     TSN_MFCOMPANY_ID
 *
 * [column]
 *     TSN_MFCOMPANY_ID, IMPORT_FLG, ZZORGNCD, ZZORGNID, ORGNMKJF, JTONFNF, ONFNHA, JTONFNH, ZZORGNAM, JTONANF, ONANHA, JTONANH, ANWHNM, IOORID, ORGPSNO, ADVCD, COUNC, ORGADR1, ORGTEL, ORTL2, ORGFAX, ZZHORGCD, ZZBASECD, CSADMAG, TAXOCD, UPTAXID, STATCID, STLNDID, ZZWHMGID, TSCPNM, DEPCD, CNLID, OTRNK, ORATTID1, ORATTID2, ORATTID3, ATTID1, ATTID2, ATTID3, ORATTID4, BSDID, RPBCD, FAUORGCD, AUORGCD, CSTCTCD, BIZARCD, FWCTCD, RDVDID, ZZABLYMD, BPTNID, SNKHG, TXCANSFG, CSNPT, TBSOCSTM, ODTSCD, LNARCD, SASASID, CMLRASID, CSOID, UPMN, CHNGYD, UPDTM, UPDIS, UPBMN, BCHNGYD, BUPDTM, UPOBMN, OBCHNGYD, OBUPDTM, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDUSRID, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TSN_MFCOMPANY_ID
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
public abstract class BsETsnMfcompanyDto implements Serializable {

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
    /** TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _tsnMfcompanyId;

    /** IMPORT_FLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _importFlg;

    /** ZZORGNCD: {varchar(30)} */
    @JsonKey
    protected String _zzorgncd;

    /** ZZORGNID: {varchar(60)} */
    @JsonKey
    protected String _zzorgnid;

    /** ORGNMKJF: {varchar(255)} */
    @JsonKey
    protected String _orgnmkjf;

    /** JTONFNF: {varchar(255)} */
    @JsonKey
    protected String _jtonfnf;

    /** ONFNHA: {varchar(100)} */
    @JsonKey
    protected String _onfnha;

    /** JTONFNH: {varchar(100)} */
    @JsonKey
    protected String _jtonfnh;

    /** ZZORGNAM: {varchar(255)} */
    @JsonKey
    protected String _zzorgnam;

    /** JTONANF: {varchar(255)} */
    @JsonKey
    protected String _jtonanf;

    /** ONANHA: {varchar(100)} */
    @JsonKey
    protected String _onanha;

    /** JTONANH: {varchar(100)} */
    @JsonKey
    protected String _jtonanh;

    /** ANWHNM: {varchar(255)} */
    @JsonKey
    protected String _anwhnm;

    /** IOORID: {varchar(60)} */
    @JsonKey
    protected String _ioorid;

    /** ORGPSNO: {varchar(100), default=[000-0000]} */
    @JsonKey
    protected String _orgpsno;

    /** ADVCD: {varchar(100)} */
    @JsonKey
    protected String _advcd;

    /** COUNC: {varchar(100)} */
    @JsonKey
    protected String _counc;

    /** ORGADR1: {varchar(255)} */
    @JsonKey
    protected String _orgadr1;

    /** ORGTEL: {varchar(60)} */
    @JsonKey
    protected String _orgtel;

    /** ORTL2: {varchar(60)} */
    @JsonKey
    protected String _ortl2;

    /** ORGFAX: {varchar(60)} */
    @JsonKey
    protected String _orgfax;

    /** ZZHORGCD: {varchar(255)} */
    @JsonKey
    protected String _zzhorgcd;

    /** ZZBASECD: {varchar(255)} */
    @JsonKey
    protected String _zzbasecd;

    /** CSADMAG: {varchar(255)} */
    @JsonKey
    protected String _csadmag;

    /** TAXOCD: {varchar(255)} */
    @JsonKey
    protected String _taxocd;

    /** UPTAXID: {varchar(60)} */
    @JsonKey
    protected String _uptaxid;

    /** STATCID: {varchar(60)} */
    @JsonKey
    protected String _statcid;

    /** STLNDID: {varchar(60)} */
    @JsonKey
    protected String _stlndid;

    /** ZZWHMGID: {varchar(60)} */
    @JsonKey
    protected String _zzwhmgid;

    /** TSCPNM: {varchar(100)} */
    @JsonKey
    protected String _tscpnm;

    /** DEPCD: {varchar(100)} */
    @JsonKey
    protected String _depcd;

    /** CNLID: {varchar(100)} */
    @JsonKey
    protected String _cnlid;

    /** OTRNK: {varchar(100)} */
    @JsonKey
    protected String _otrnk;

    /** ORATTID1: {varchar(100)} */
    @JsonKey
    protected String _orattid1;

    /** ORATTID2: {varchar(100)} */
    @JsonKey
    protected String _orattid2;

    /** ORATTID3: {varchar(100)} */
    @JsonKey
    protected String _orattid3;

    /** ATTID1: {varchar(100)} */
    @JsonKey
    protected String _attid1;

    /** ATTID2: {varchar(100)} */
    @JsonKey
    protected String _attid2;

    /** ATTID3: {varchar(100)} */
    @JsonKey
    protected String _attid3;

    /** ORATTID4: {varchar(100)} */
    @JsonKey
    protected String _orattid4;

    /** BSDID: {varchar(100)} */
    @JsonKey
    protected String _bsdid;

    /** RPBCD: {varchar(100)} */
    @JsonKey
    protected String _rpbcd;

    /** FAUORGCD: {varchar(100)} */
    @JsonKey
    protected String _fauorgcd;

    /** AUORGCD: {varchar(100)} */
    @JsonKey
    protected String _auorgcd;

    /** CSTCTCD: {varchar(100)} */
    @JsonKey
    protected String _cstctcd;

    /** BIZARCD: {varchar(100)} */
    @JsonKey
    protected String _bizarcd;

    /** FWCTCD: {varchar(100)} */
    @JsonKey
    protected String _fwctcd;

    /** RDVDID: {varchar(100)} */
    @JsonKey
    protected String _rdvdid;

    /** ZZABLYMD: {varchar(30)} */
    @JsonKey
    protected String _zzablymd;

    /** BPTNID: {varchar(100)} */
    @JsonKey
    protected String _bptnid;

    /** SNKHG: {varchar(100)} */
    @JsonKey
    protected String _snkhg;

    /** TXCANSFG: {varchar(100)} */
    @JsonKey
    protected String _txcansfg;

    /** CSNPT: {varchar(100)} */
    @JsonKey
    protected String _csnpt;

    /** TBSOCSTM: {varchar(100)} */
    @JsonKey
    protected String _tbsocstm;

    /** ODTSCD: {varchar(100)} */
    @JsonKey
    protected String _odtscd;

    /** LNARCD: {varchar(100)} */
    @JsonKey
    protected String _lnarcd;

    /** SASASID: {varchar(100)} */
    @JsonKey
    protected String _sasasid;

    /** CMLRASID: {varchar(100)} */
    @JsonKey
    protected String _cmlrasid;

    /** CSOID: {varchar(100)} */
    @JsonKey
    protected String _csoid;

    /** UPMN: {bigint(19)} */
    @JsonKey
    protected Long _upmn;

    /** CHNGYD: {varchar(8)} */
    @JsonKey
    protected String _chngyd;

    /** UPDTM: {varchar(30)} */
    @JsonKey
    protected String _updtm;

    /** UPDIS: {bigint(19)} */
    @JsonKey
    protected Long _updis;

    /** UPBMN: {bigint(19)} */
    @JsonKey
    protected Long _upbmn;

    /** BCHNGYD: {varchar(8)} */
    @JsonKey
    protected String _bchngyd;

    /** BUPDTM: {bigint(19)} */
    @JsonKey
    protected Long _bupdtm;

    /** UPOBMN: {bigint(19)} */
    @JsonKey
    protected Long _upobmn;

    /** OBCHNGYD: {varchar(8)} */
    @JsonKey
    protected String _obchngyd;

    /** OBUPDTM: {bigint(19)} */
    @JsonKey
    protected Long _obupdtm;

    /** ZZFRDATEH: {varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** RCDUPDPS: {varchar(30)} */
    @JsonKey
    protected String _rcdupdps;

    /** UPDUSRID: {bigint(19)} */
    @JsonKey
    protected Long _updusrid;

    /** UPDPOCD: {varchar(30)} */
    @JsonKey
    protected String _updpocd;

    /** OTCMPFG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _otcmpfg;

    /** TMCMPFG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tmcmpfg;

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
    public BsETsnMfcompanyDto() {
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
        if (other == null || !(other instanceof BsETsnMfcompanyDto)) { return false; }
        final BsETsnMfcompanyDto otherEntity = (BsETsnMfcompanyDto)other;
        if (!helpComparingValue(getTsnMfcompanyId(), otherEntity.getTsnMfcompanyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_TSN_MFCOMPANY");
        result = xCH(result, getTsnMfcompanyId());
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
        sb.append(c).append(getTsnMfcompanyId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getZzorgnid());
        sb.append(c).append(getOrgnmkjf());
        sb.append(c).append(getJtonfnf());
        sb.append(c).append(getOnfnha());
        sb.append(c).append(getJtonfnh());
        sb.append(c).append(getZzorgnam());
        sb.append(c).append(getJtonanf());
        sb.append(c).append(getOnanha());
        sb.append(c).append(getJtonanh());
        sb.append(c).append(getAnwhnm());
        sb.append(c).append(getIoorid());
        sb.append(c).append(getOrgpsno());
        sb.append(c).append(getAdvcd());
        sb.append(c).append(getCounc());
        sb.append(c).append(getOrgadr1());
        sb.append(c).append(getOrgtel());
        sb.append(c).append(getOrtl2());
        sb.append(c).append(getOrgfax());
        sb.append(c).append(getZzhorgcd());
        sb.append(c).append(getZzbasecd());
        sb.append(c).append(getCsadmag());
        sb.append(c).append(getTaxocd());
        sb.append(c).append(getUptaxid());
        sb.append(c).append(getStatcid());
        sb.append(c).append(getStlndid());
        sb.append(c).append(getZzwhmgid());
        sb.append(c).append(getTscpnm());
        sb.append(c).append(getDepcd());
        sb.append(c).append(getCnlid());
        sb.append(c).append(getOtrnk());
        sb.append(c).append(getOrattid1());
        sb.append(c).append(getOrattid2());
        sb.append(c).append(getOrattid3());
        sb.append(c).append(getAttid1());
        sb.append(c).append(getAttid2());
        sb.append(c).append(getAttid3());
        sb.append(c).append(getOrattid4());
        sb.append(c).append(getBsdid());
        sb.append(c).append(getRpbcd());
        sb.append(c).append(getFauorgcd());
        sb.append(c).append(getAuorgcd());
        sb.append(c).append(getCstctcd());
        sb.append(c).append(getBizarcd());
        sb.append(c).append(getFwctcd());
        sb.append(c).append(getRdvdid());
        sb.append(c).append(getZzablymd());
        sb.append(c).append(getBptnid());
        sb.append(c).append(getSnkhg());
        sb.append(c).append(getTxcansfg());
        sb.append(c).append(getCsnpt());
        sb.append(c).append(getTbsocstm());
        sb.append(c).append(getOdtscd());
        sb.append(c).append(getLnarcd());
        sb.append(c).append(getSasasid());
        sb.append(c).append(getCmlrasid());
        sb.append(c).append(getCsoid());
        sb.append(c).append(getUpmn());
        sb.append(c).append(getChngyd());
        sb.append(c).append(getUpdtm());
        sb.append(c).append(getUpdis());
        sb.append(c).append(getUpbmn());
        sb.append(c).append(getBchngyd());
        sb.append(c).append(getBupdtm());
        sb.append(c).append(getUpobmn());
        sb.append(c).append(getObchngyd());
        sb.append(c).append(getObupdtm());
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getRcdupdps());
        sb.append(c).append(getUpdusrid());
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
     * [get] TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSN組織マスタID
     * @return The value of the column 'TSN_MFCOMPANY_ID'. (NullAllowed)
     */
    public Long getTsnMfcompanyId() {
        return _tsnMfcompanyId;
    }

    /**
     * [set] TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSN組織マスタID
     * @param tsnMfcompanyId The value of the column 'TSN_MFCOMPANY_ID'. (NullAllowed)
     */
    public void setTsnMfcompanyId(Long tsnMfcompanyId) {
        __modifiedProperties.add("tsnMfcompanyId");
        this._tsnMfcompanyId = tsnMfcompanyId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ZZORGNCD: {varchar(30)} <br>
     * 組織コード
     * @return The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public String getZzorgncd() {
        return _zzorgncd;
    }

    /**
     * [set] ZZORGNCD: {varchar(30)} <br>
     * 組織コード
     * @param zzorgncd The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public void setZzorgncd(String zzorgncd) {
        __modifiedProperties.add("zzorgncd");
        this._zzorgncd = zzorgncd;
    }

    /**
     * [get] ZZORGNID: {varchar(60)} <br>
     * 組織区分
     * @return The value of the column 'ZZORGNID'. (NullAllowed)
     */
    public String getZzorgnid() {
        return _zzorgnid;
    }

    /**
     * [set] ZZORGNID: {varchar(60)} <br>
     * 組織区分
     * @param zzorgnid The value of the column 'ZZORGNID'. (NullAllowed)
     */
    public void setZzorgnid(String zzorgnid) {
        __modifiedProperties.add("zzorgnid");
        this._zzorgnid = zzorgnid;
    }

    /**
     * [get] ORGNMKJF: {varchar(255)} <br>
     * 組織名正称(TSN)(全角)
     * @return The value of the column 'ORGNMKJF'. (NullAllowed)
     */
    public String getOrgnmkjf() {
        return _orgnmkjf;
    }

    /**
     * [set] ORGNMKJF: {varchar(255)} <br>
     * 組織名正称(TSN)(全角)
     * @param orgnmkjf The value of the column 'ORGNMKJF'. (NullAllowed)
     */
    public void setOrgnmkjf(String orgnmkjf) {
        __modifiedProperties.add("orgnmkjf");
        this._orgnmkjf = orgnmkjf;
    }

    /**
     * [get] JTONFNF: {varchar(255)} <br>
     * 組織名正称(JT)(全角)
     * @return The value of the column 'JTONFNF'. (NullAllowed)
     */
    public String getJtonfnf() {
        return _jtonfnf;
    }

    /**
     * [set] JTONFNF: {varchar(255)} <br>
     * 組織名正称(JT)(全角)
     * @param jtonfnf The value of the column 'JTONFNF'. (NullAllowed)
     */
    public void setJtonfnf(String jtonfnf) {
        __modifiedProperties.add("jtonfnf");
        this._jtonfnf = jtonfnf;
    }

    /**
     * [get] ONFNHA: {varchar(100)} <br>
     * 組織名正称(TSN)(半角)
     * @return The value of the column 'ONFNHA'. (NullAllowed)
     */
    public String getOnfnha() {
        return _onfnha;
    }

    /**
     * [set] ONFNHA: {varchar(100)} <br>
     * 組織名正称(TSN)(半角)
     * @param onfnha The value of the column 'ONFNHA'. (NullAllowed)
     */
    public void setOnfnha(String onfnha) {
        __modifiedProperties.add("onfnha");
        this._onfnha = onfnha;
    }

    /**
     * [get] JTONFNH: {varchar(100)} <br>
     * 組織名正称(JT)(半角)
     * @return The value of the column 'JTONFNH'. (NullAllowed)
     */
    public String getJtonfnh() {
        return _jtonfnh;
    }

    /**
     * [set] JTONFNH: {varchar(100)} <br>
     * 組織名正称(JT)(半角)
     * @param jtonfnh The value of the column 'JTONFNH'. (NullAllowed)
     */
    public void setJtonfnh(String jtonfnh) {
        __modifiedProperties.add("jtonfnh");
        this._jtonfnh = jtonfnh;
    }

    /**
     * [get] ZZORGNAM: {varchar(255)} <br>
     * 組織名略称(TSN)(全角)
     * @return The value of the column 'ZZORGNAM'. (NullAllowed)
     */
    public String getZzorgnam() {
        return _zzorgnam;
    }

    /**
     * [set] ZZORGNAM: {varchar(255)} <br>
     * 組織名略称(TSN)(全角)
     * @param zzorgnam The value of the column 'ZZORGNAM'. (NullAllowed)
     */
    public void setZzorgnam(String zzorgnam) {
        __modifiedProperties.add("zzorgnam");
        this._zzorgnam = zzorgnam;
    }

    /**
     * [get] JTONANF: {varchar(255)} <br>
     * 組織名略称(JT)(全角)
     * @return The value of the column 'JTONANF'. (NullAllowed)
     */
    public String getJtonanf() {
        return _jtonanf;
    }

    /**
     * [set] JTONANF: {varchar(255)} <br>
     * 組織名略称(JT)(全角)
     * @param jtonanf The value of the column 'JTONANF'. (NullAllowed)
     */
    public void setJtonanf(String jtonanf) {
        __modifiedProperties.add("jtonanf");
        this._jtonanf = jtonanf;
    }

    /**
     * [get] ONANHA: {varchar(100)} <br>
     * 組織名略称(TSN)(半角)
     * @return The value of the column 'ONANHA'. (NullAllowed)
     */
    public String getOnanha() {
        return _onanha;
    }

    /**
     * [set] ONANHA: {varchar(100)} <br>
     * 組織名略称(TSN)(半角)
     * @param onanha The value of the column 'ONANHA'. (NullAllowed)
     */
    public void setOnanha(String onanha) {
        __modifiedProperties.add("onanha");
        this._onanha = onanha;
    }

    /**
     * [get] JTONANH: {varchar(100)} <br>
     * 組織名略称(JT)(半角)
     * @return The value of the column 'JTONANH'. (NullAllowed)
     */
    public String getJtonanh() {
        return _jtonanh;
    }

    /**
     * [set] JTONANH: {varchar(100)} <br>
     * 組織名略称(JT)(半角)
     * @param jtonanh The value of the column 'JTONANH'. (NullAllowed)
     */
    public void setJtonanh(String jtonanh) {
        __modifiedProperties.add("jtonanh");
        this._jtonanh = jtonanh;
    }

    /**
     * [get] ANWHNM: {varchar(255)} <br>
     * 短縮組織名
     * @return The value of the column 'ANWHNM'. (NullAllowed)
     */
    public String getAnwhnm() {
        return _anwhnm;
    }

    /**
     * [set] ANWHNM: {varchar(255)} <br>
     * 短縮組織名
     * @param anwhnm The value of the column 'ANWHNM'. (NullAllowed)
     */
    public void setAnwhnm(String anwhnm) {
        __modifiedProperties.add("anwhnm");
        this._anwhnm = anwhnm;
    }

    /**
     * [get] IOORID: {varchar(60)} <br>
     * 内外組織区分
     * @return The value of the column 'IOORID'. (NullAllowed)
     */
    public String getIoorid() {
        return _ioorid;
    }

    /**
     * [set] IOORID: {varchar(60)} <br>
     * 内外組織区分
     * @param ioorid The value of the column 'IOORID'. (NullAllowed)
     */
    public void setIoorid(String ioorid) {
        __modifiedProperties.add("ioorid");
        this._ioorid = ioorid;
    }

    /**
     * [get] ORGPSNO: {varchar(100), default=[000-0000]} <br>
     * 組織郵便番号
     * @return The value of the column 'ORGPSNO'. (NullAllowed)
     */
    public String getOrgpsno() {
        return _orgpsno;
    }

    /**
     * [set] ORGPSNO: {varchar(100), default=[000-0000]} <br>
     * 組織郵便番号
     * @param orgpsno The value of the column 'ORGPSNO'. (NullAllowed)
     */
    public void setOrgpsno(String orgpsno) {
        __modifiedProperties.add("orgpsno");
        this._orgpsno = orgpsno;
    }

    /**
     * [get] ADVCD: {varchar(100)} <br>
     * 都道府県コード
     * @return The value of the column 'ADVCD'. (NullAllowed)
     */
    public String getAdvcd() {
        return _advcd;
    }

    /**
     * [set] ADVCD: {varchar(100)} <br>
     * 都道府県コード
     * @param advcd The value of the column 'ADVCD'. (NullAllowed)
     */
    public void setAdvcd(String advcd) {
        __modifiedProperties.add("advcd");
        this._advcd = advcd;
    }

    /**
     * [get] COUNC: {varchar(100)} <br>
     * 市区町村コード
     * @return The value of the column 'COUNC'. (NullAllowed)
     */
    public String getCounc() {
        return _counc;
    }

    /**
     * [set] COUNC: {varchar(100)} <br>
     * 市区町村コード
     * @param counc The value of the column 'COUNC'. (NullAllowed)
     */
    public void setCounc(String counc) {
        __modifiedProperties.add("counc");
        this._counc = counc;
    }

    /**
     * [get] ORGADR1: {varchar(255)} <br>
     * 組織住所
     * @return The value of the column 'ORGADR1'. (NullAllowed)
     */
    public String getOrgadr1() {
        return _orgadr1;
    }

    /**
     * [set] ORGADR1: {varchar(255)} <br>
     * 組織住所
     * @param orgadr1 The value of the column 'ORGADR1'. (NullAllowed)
     */
    public void setOrgadr1(String orgadr1) {
        __modifiedProperties.add("orgadr1");
        this._orgadr1 = orgadr1;
    }

    /**
     * [get] ORGTEL: {varchar(60)} <br>
     * 組織電話番号
     * @return The value of the column 'ORGTEL'. (NullAllowed)
     */
    public String getOrgtel() {
        return _orgtel;
    }

    /**
     * [set] ORGTEL: {varchar(60)} <br>
     * 組織電話番号
     * @param orgtel The value of the column 'ORGTEL'. (NullAllowed)
     */
    public void setOrgtel(String orgtel) {
        __modifiedProperties.add("orgtel");
        this._orgtel = orgtel;
    }

    /**
     * [get] ORTL2: {varchar(60)} <br>
     * 組織電話番号２
     * @return The value of the column 'ORTL2'. (NullAllowed)
     */
    public String getOrtl2() {
        return _ortl2;
    }

    /**
     * [set] ORTL2: {varchar(60)} <br>
     * 組織電話番号２
     * @param ortl2 The value of the column 'ORTL2'. (NullAllowed)
     */
    public void setOrtl2(String ortl2) {
        __modifiedProperties.add("ortl2");
        this._ortl2 = ortl2;
    }

    /**
     * [get] ORGFAX: {varchar(60)} <br>
     * 組織ＦＡＸ番号
     * @return The value of the column 'ORGFAX'. (NullAllowed)
     */
    public String getOrgfax() {
        return _orgfax;
    }

    /**
     * [set] ORGFAX: {varchar(60)} <br>
     * 組織ＦＡＸ番号
     * @param orgfax The value of the column 'ORGFAX'. (NullAllowed)
     */
    public void setOrgfax(String orgfax) {
        __modifiedProperties.add("orgfax");
        this._orgfax = orgfax;
    }

    /**
     * [get] ZZHORGCD: {varchar(255)} <br>
     * 上位組織コード
     * @return The value of the column 'ZZHORGCD'. (NullAllowed)
     */
    public String getZzhorgcd() {
        return _zzhorgcd;
    }

    /**
     * [set] ZZHORGCD: {varchar(255)} <br>
     * 上位組織コード
     * @param zzhorgcd The value of the column 'ZZHORGCD'. (NullAllowed)
     */
    public void setZzhorgcd(String zzhorgcd) {
        __modifiedProperties.add("zzhorgcd");
        this._zzhorgcd = zzhorgcd;
    }

    /**
     * [get] ZZBASECD: {varchar(255)} <br>
     * 基地圏コード
     * @return The value of the column 'ZZBASECD'. (NullAllowed)
     */
    public String getZzbasecd() {
        return _zzbasecd;
    }

    /**
     * [set] ZZBASECD: {varchar(255)} <br>
     * 基地圏コード
     * @param zzbasecd The value of the column 'ZZBASECD'. (NullAllowed)
     */
    public void setZzbasecd(String zzbasecd) {
        __modifiedProperties.add("zzbasecd");
        this._zzbasecd = zzbasecd;
    }

    /**
     * [get] CSADMAG: {varchar(255)} <br>
     * 委託管理業者
     * @return The value of the column 'CSADMAG'. (NullAllowed)
     */
    public String getCsadmag() {
        return _csadmag;
    }

    /**
     * [set] CSADMAG: {varchar(255)} <br>
     * 委託管理業者
     * @param csadmag The value of the column 'CSADMAG'. (NullAllowed)
     */
    public void setCsadmag(String csadmag) {
        __modifiedProperties.add("csadmag");
        this._csadmag = csadmag;
    }

    /**
     * [get] TAXOCD: {varchar(255)} <br>
     * 税務署コード
     * @return The value of the column 'TAXOCD'. (NullAllowed)
     */
    public String getTaxocd() {
        return _taxocd;
    }

    /**
     * [set] TAXOCD: {varchar(255)} <br>
     * 税務署コード
     * @param taxocd The value of the column 'TAXOCD'. (NullAllowed)
     */
    public void setTaxocd(String taxocd) {
        __modifiedProperties.add("taxocd");
        this._taxocd = taxocd;
    }

    /**
     * [get] UPTAXID: {varchar(60)} <br>
     * 未納税・課税区分
     * @return The value of the column 'UPTAXID'. (NullAllowed)
     */
    public String getUptaxid() {
        return _uptaxid;
    }

    /**
     * [set] UPTAXID: {varchar(60)} <br>
     * 未納税・課税区分
     * @param uptaxid The value of the column 'UPTAXID'. (NullAllowed)
     */
    public void setUptaxid(String uptaxid) {
        __modifiedProperties.add("uptaxid");
        this._uptaxid = uptaxid;
    }

    /**
     * [get] STATCID: {varchar(60)} <br>
     * 詰所併設区分
     * @return The value of the column 'STATCID'. (NullAllowed)
     */
    public String getStatcid() {
        return _statcid;
    }

    /**
     * [set] STATCID: {varchar(60)} <br>
     * 詰所併設区分
     * @param statcid The value of the column 'STATCID'. (NullAllowed)
     */
    public void setStatcid(String statcid) {
        __modifiedProperties.add("statcid");
        this._statcid = statcid;
    }

    /**
     * [get] STLNDID: {varchar(60)} <br>
     * 詰所貸与区分
     * @return The value of the column 'STLNDID'. (NullAllowed)
     */
    public String getStlndid() {
        return _stlndid;
    }

    /**
     * [set] STLNDID: {varchar(60)} <br>
     * 詰所貸与区分
     * @param stlndid The value of the column 'STLNDID'. (NullAllowed)
     */
    public void setStlndid(String stlndid) {
        __modifiedProperties.add("stlndid");
        this._stlndid = stlndid;
    }

    /**
     * [get] ZZWHMGID: {varchar(60)} <br>
     * 倉庫機能区分
     * @return The value of the column 'ZZWHMGID'. (NullAllowed)
     */
    public String getZzwhmgid() {
        return _zzwhmgid;
    }

    /**
     * [set] ZZWHMGID: {varchar(60)} <br>
     * 倉庫機能区分
     * @param zzwhmgid The value of the column 'ZZWHMGID'. (NullAllowed)
     */
    public void setZzwhmgid(String zzwhmgid) {
        __modifiedProperties.add("zzwhmgid");
        this._zzwhmgid = zzwhmgid;
    }

    /**
     * [get] TSCPNM: {varchar(100)} <br>
     * 関連会社名
     * @return The value of the column 'TSCPNM'. (NullAllowed)
     */
    public String getTscpnm() {
        return _tscpnm;
    }

    /**
     * [set] TSCPNM: {varchar(100)} <br>
     * 関連会社名
     * @param tscpnm The value of the column 'TSCPNM'. (NullAllowed)
     */
    public void setTscpnm(String tscpnm) {
        __modifiedProperties.add("tscpnm");
        this._tscpnm = tscpnm;
    }

    /**
     * [get] DEPCD: {varchar(100)} <br>
     * No
     * @return The value of the column 'DEPCD'. (NullAllowed)
     */
    public String getDepcd() {
        return _depcd;
    }

    /**
     * [set] DEPCD: {varchar(100)} <br>
     * No
     * @param depcd The value of the column 'DEPCD'. (NullAllowed)
     */
    public void setDepcd(String depcd) {
        __modifiedProperties.add("depcd");
        this._depcd = depcd;
    }

    /**
     * [get] CNLID: {varchar(100)} <br>
     * チャネル区分
     * @return The value of the column 'CNLID'. (NullAllowed)
     */
    public String getCnlid() {
        return _cnlid;
    }

    /**
     * [set] CNLID: {varchar(100)} <br>
     * チャネル区分
     * @param cnlid The value of the column 'CNLID'. (NullAllowed)
     */
    public void setCnlid(String cnlid) {
        __modifiedProperties.add("cnlid");
        this._cnlid = cnlid;
    }

    /**
     * [get] OTRNK: {varchar(100)} <br>
     * 出力順
     * @return The value of the column 'OTRNK'. (NullAllowed)
     */
    public String getOtrnk() {
        return _otrnk;
    }

    /**
     * [set] OTRNK: {varchar(100)} <br>
     * 出力順
     * @param otrnk The value of the column 'OTRNK'. (NullAllowed)
     */
    public void setOtrnk(String otrnk) {
        __modifiedProperties.add("otrnk");
        this._otrnk = otrnk;
    }

    /**
     * [get] ORATTID1: {varchar(100)} <br>
     * 倉庫機能区分2
     * @return The value of the column 'ORATTID1'. (NullAllowed)
     */
    public String getOrattid1() {
        return _orattid1;
    }

    /**
     * [set] ORATTID1: {varchar(100)} <br>
     * 倉庫機能区分2
     * @param orattid1 The value of the column 'ORATTID1'. (NullAllowed)
     */
    public void setOrattid1(String orattid1) {
        __modifiedProperties.add("orattid1");
        this._orattid1 = orattid1;
    }

    /**
     * [get] ORATTID2: {varchar(100)} <br>
     * 倉庫属性区分
     * @return The value of the column 'ORATTID2'. (NullAllowed)
     */
    public String getOrattid2() {
        return _orattid2;
    }

    /**
     * [set] ORATTID2: {varchar(100)} <br>
     * 倉庫属性区分
     * @param orattid2 The value of the column 'ORATTID2'. (NullAllowed)
     */
    public void setOrattid2(String orattid2) {
        __modifiedProperties.add("orattid2");
        this._orattid2 = orattid2;
    }

    /**
     * [get] ORATTID3: {varchar(100)} <br>
     * 倉庫在庫区分
     * @return The value of the column 'ORATTID3'. (NullAllowed)
     */
    public String getOrattid3() {
        return _orattid3;
    }

    /**
     * [set] ORATTID3: {varchar(100)} <br>
     * 倉庫在庫区分
     * @param orattid3 The value of the column 'ORATTID3'. (NullAllowed)
     */
    public void setOrattid3(String orattid3) {
        __modifiedProperties.add("orattid3");
        this._orattid3 = orattid3;
    }

    /**
     * [get] ATTID1: {varchar(100)} <br>
     * 属性区分1
     * @return The value of the column 'ATTID1'. (NullAllowed)
     */
    public String getAttid1() {
        return _attid1;
    }

    /**
     * [set] ATTID1: {varchar(100)} <br>
     * 属性区分1
     * @param attid1 The value of the column 'ATTID1'. (NullAllowed)
     */
    public void setAttid1(String attid1) {
        __modifiedProperties.add("attid1");
        this._attid1 = attid1;
    }

    /**
     * [get] ATTID2: {varchar(100)} <br>
     * 属性区分2
     * @return The value of the column 'ATTID2'. (NullAllowed)
     */
    public String getAttid2() {
        return _attid2;
    }

    /**
     * [set] ATTID2: {varchar(100)} <br>
     * 属性区分2
     * @param attid2 The value of the column 'ATTID2'. (NullAllowed)
     */
    public void setAttid2(String attid2) {
        __modifiedProperties.add("attid2");
        this._attid2 = attid2;
    }

    /**
     * [get] ATTID3: {varchar(100)} <br>
     * 属性区分3
     * @return The value of the column 'ATTID3'. (NullAllowed)
     */
    public String getAttid3() {
        return _attid3;
    }

    /**
     * [set] ATTID3: {varchar(100)} <br>
     * 属性区分3
     * @param attid3 The value of the column 'ATTID3'. (NullAllowed)
     */
    public void setAttid3(String attid3) {
        __modifiedProperties.add("attid3");
        this._attid3 = attid3;
    }

    /**
     * [get] ORATTID4: {varchar(100)} <br>
     * 属性区分4
     * @return The value of the column 'ORATTID4'. (NullAllowed)
     */
    public String getOrattid4() {
        return _orattid4;
    }

    /**
     * [set] ORATTID4: {varchar(100)} <br>
     * 属性区分4
     * @param orattid4 The value of the column 'ORATTID4'. (NullAllowed)
     */
    public void setOrattid4(String orattid4) {
        __modifiedProperties.add("orattid4");
        this._orattid4 = orattid4;
    }

    /**
     * [get] BSDID: {varchar(100)} <br>
     * 支社事業所区分
     * @return The value of the column 'BSDID'. (NullAllowed)
     */
    public String getBsdid() {
        return _bsdid;
    }

    /**
     * [set] BSDID: {varchar(100)} <br>
     * 支社事業所区分
     * @param bsdid The value of the column 'BSDID'. (NullAllowed)
     */
    public void setBsdid(String bsdid) {
        __modifiedProperties.add("bsdid");
        this._bsdid = bsdid;
    }

    /**
     * [get] RPBCD: {varchar(100)} <br>
     * 申告支社コード
     * @return The value of the column 'RPBCD'. (NullAllowed)
     */
    public String getRpbcd() {
        return _rpbcd;
    }

    /**
     * [set] RPBCD: {varchar(100)} <br>
     * 申告支社コード
     * @param rpbcd The value of the column 'RPBCD'. (NullAllowed)
     */
    public void setRpbcd(String rpbcd) {
        __modifiedProperties.add("rpbcd");
        this._rpbcd = rpbcd;
    }

    /**
     * [get] FAUORGCD: {varchar(100)} <br>
     * 擬制会計単位組織コード
     * @return The value of the column 'FAUORGCD'. (NullAllowed)
     */
    public String getFauorgcd() {
        return _fauorgcd;
    }

    /**
     * [set] FAUORGCD: {varchar(100)} <br>
     * 擬制会計単位組織コード
     * @param fauorgcd The value of the column 'FAUORGCD'. (NullAllowed)
     */
    public void setFauorgcd(String fauorgcd) {
        __modifiedProperties.add("fauorgcd");
        this._fauorgcd = fauorgcd;
    }

    /**
     * [get] AUORGCD: {varchar(100)} <br>
     * 会計単位組織コード
     * @return The value of the column 'AUORGCD'. (NullAllowed)
     */
    public String getAuorgcd() {
        return _auorgcd;
    }

    /**
     * [set] AUORGCD: {varchar(100)} <br>
     * 会計単位組織コード
     * @param auorgcd The value of the column 'AUORGCD'. (NullAllowed)
     */
    public void setAuorgcd(String auorgcd) {
        __modifiedProperties.add("auorgcd");
        this._auorgcd = auorgcd;
    }

    /**
     * [get] CSTCTCD: {varchar(100)} <br>
     * 原価センターコード
     * @return The value of the column 'CSTCTCD'. (NullAllowed)
     */
    public String getCstctcd() {
        return _cstctcd;
    }

    /**
     * [set] CSTCTCD: {varchar(100)} <br>
     * 原価センターコード
     * @param cstctcd The value of the column 'CSTCTCD'. (NullAllowed)
     */
    public void setCstctcd(String cstctcd) {
        __modifiedProperties.add("cstctcd");
        this._cstctcd = cstctcd;
    }

    /**
     * [get] BIZARCD: {varchar(100)} <br>
     * 事業領域コード
     * @return The value of the column 'BIZARCD'. (NullAllowed)
     */
    public String getBizarcd() {
        return _bizarcd;
    }

    /**
     * [set] BIZARCD: {varchar(100)} <br>
     * 事業領域コード
     * @param bizarcd The value of the column 'BIZARCD'. (NullAllowed)
     */
    public void setBizarcd(String bizarcd) {
        __modifiedProperties.add("bizarcd");
        this._bizarcd = bizarcd;
    }

    /**
     * [get] FWCTCD: {varchar(100)} <br>
     * CAPセンターコード
     * @return The value of the column 'FWCTCD'. (NullAllowed)
     */
    public String getFwctcd() {
        return _fwctcd;
    }

    /**
     * [set] FWCTCD: {varchar(100)} <br>
     * CAPセンターコード
     * @param fwctcd The value of the column 'FWCTCD'. (NullAllowed)
     */
    public void setFwctcd(String fwctcd) {
        __modifiedProperties.add("fwctcd");
        this._fwctcd = fwctcd;
    }

    /**
     * [get] RDVDID: {varchar(100)} <br>
     * SAP振分区分
     * @return The value of the column 'RDVDID'. (NullAllowed)
     */
    public String getRdvdid() {
        return _rdvdid;
    }

    /**
     * [set] RDVDID: {varchar(100)} <br>
     * SAP振分区分
     * @param rdvdid The value of the column 'RDVDID'. (NullAllowed)
     */
    public void setRdvdid(String rdvdid) {
        __modifiedProperties.add("rdvdid");
        this._rdvdid = rdvdid;
    }

    /**
     * [get] ZZABLYMD: {varchar(30)} <br>
     * 廃止年月日
     * @return The value of the column 'ZZABLYMD'. (NullAllowed)
     */
    public String getZzablymd() {
        return _zzablymd;
    }

    /**
     * [set] ZZABLYMD: {varchar(30)} <br>
     * 廃止年月日
     * @param zzablymd The value of the column 'ZZABLYMD'. (NullAllowed)
     */
    public void setZzablymd(String zzablymd) {
        __modifiedProperties.add("zzablymd");
        this._zzablymd = zzablymd;
    }

    /**
     * [get] BPTNID: {varchar(100)} <br>
     * 営業日パターン区分
     * @return The value of the column 'BPTNID'. (NullAllowed)
     */
    public String getBptnid() {
        return _bptnid;
    }

    /**
     * [set] BPTNID: {varchar(100)} <br>
     * 営業日パターン区分
     * @param bptnid The value of the column 'BPTNID'. (NullAllowed)
     */
    public void setBptnid(String bptnid) {
        __modifiedProperties.add("bptnid");
        this._bptnid = bptnid;
    }

    /**
     * [get] SNKHG: {varchar(100)} <br>
     * 収入金上位組織コード
     * @return The value of the column 'SNKHG'. (NullAllowed)
     */
    public String getSnkhg() {
        return _snkhg;
    }

    /**
     * [set] SNKHG: {varchar(100)} <br>
     * 収入金上位組織コード
     * @param snkhg The value of the column 'SNKHG'. (NullAllowed)
     */
    public void setSnkhg(String snkhg) {
        __modifiedProperties.add("snkhg");
        this._snkhg = snkhg;
    }

    /**
     * [get] TXCANSFG: {varchar(100)} <br>
     * 税計算対象外フラグ
     * @return The value of the column 'TXCANSFG'. (NullAllowed)
     */
    public String getTxcansfg() {
        return _txcansfg;
    }

    /**
     * [set] TXCANSFG: {varchar(100)} <br>
     * 税計算対象外フラグ
     * @param txcansfg The value of the column 'TXCANSFG'. (NullAllowed)
     */
    public void setTxcansfg(String txcansfg) {
        __modifiedProperties.add("txcansfg");
        this._txcansfg = txcansfg;
    }

    /**
     * [get] CSNPT: {varchar(100)} <br>
     * CAP発送パターン
     * @return The value of the column 'CSNPT'. (NullAllowed)
     */
    public String getCsnpt() {
        return _csnpt;
    }

    /**
     * [set] CSNPT: {varchar(100)} <br>
     * CAP発送パターン
     * @param csnpt The value of the column 'CSNPT'. (NullAllowed)
     */
    public void setCsnpt(String csnpt) {
        __modifiedProperties.add("csnpt");
        this._csnpt = csnpt;
    }

    /**
     * [get] TBSOCSTM: {varchar(100)} <br>
     * 引取受注締時刻
     * @return The value of the column 'TBSOCSTM'. (NullAllowed)
     */
    public String getTbsocstm() {
        return _tbsocstm;
    }

    /**
     * [set] TBSOCSTM: {varchar(100)} <br>
     * 引取受注締時刻
     * @param tbsocstm The value of the column 'TBSOCSTM'. (NullAllowed)
     */
    public void setTbsocstm(String tbsocstm) {
        __modifiedProperties.add("tbsocstm");
        this._tbsocstm = tbsocstm;
    }

    /**
     * [get] ODTSCD: {varchar(100)} <br>
     * 旧TSコード
     * @return The value of the column 'ODTSCD'. (NullAllowed)
     */
    public String getOdtscd() {
        return _odtscd;
    }

    /**
     * [set] ODTSCD: {varchar(100)} <br>
     * 旧TSコード
     * @param odtscd The value of the column 'ODTSCD'. (NullAllowed)
     */
    public void setOdtscd(String odtscd) {
        __modifiedProperties.add("odtscd");
        this._odtscd = odtscd;
    }

    /**
     * [get] LNARCD: {varchar(100)} <br>
     * 仕入エリアコード
     * @return The value of the column 'LNARCD'. (NullAllowed)
     */
    public String getLnarcd() {
        return _lnarcd;
    }

    /**
     * [set] LNARCD: {varchar(100)} <br>
     * 仕入エリアコード
     * @param lnarcd The value of the column 'LNARCD'. (NullAllowed)
     */
    public void setLnarcd(String lnarcd) {
        __modifiedProperties.add("lnarcd");
        this._lnarcd = lnarcd;
    }

    /**
     * [get] SASASID: {varchar(100)} <br>
     * 入出庫管理区分
     * @return The value of the column 'SASASID'. (NullAllowed)
     */
    public String getSasasid() {
        return _sasasid;
    }

    /**
     * [set] SASASID: {varchar(100)} <br>
     * 入出庫管理区分
     * @param sasasid The value of the column 'SASASID'. (NullAllowed)
     */
    public void setSasasid(String sasasid) {
        __modifiedProperties.add("sasasid");
        this._sasasid = sasasid;
    }

    /**
     * [get] CMLRASID: {varchar(100)} <br>
     * 共通下位管理区分
     * @return The value of the column 'CMLRASID'. (NullAllowed)
     */
    public String getCmlrasid() {
        return _cmlrasid;
    }

    /**
     * [set] CMLRASID: {varchar(100)} <br>
     * 共通下位管理区分
     * @param cmlrasid The value of the column 'CMLRASID'. (NullAllowed)
     */
    public void setCmlrasid(String cmlrasid) {
        __modifiedProperties.add("cmlrasid");
        this._cmlrasid = cmlrasid;
    }

    /**
     * [get] CSOID: {varchar(100)} <br>
     * ＣＡＰ受注停止区分
     * @return The value of the column 'CSOID'. (NullAllowed)
     */
    public String getCsoid() {
        return _csoid;
    }

    /**
     * [set] CSOID: {varchar(100)} <br>
     * ＣＡＰ受注停止区分
     * @param csoid The value of the column 'CSOID'. (NullAllowed)
     */
    public void setCsoid(String csoid) {
        __modifiedProperties.add("csoid");
        this._csoid = csoid;
    }

    /**
     * [get] UPMN: {bigint(19)} <br>
     * 更新者
     * @return The value of the column 'UPMN'. (NullAllowed)
     */
    public Long getUpmn() {
        return _upmn;
    }

    /**
     * [set] UPMN: {bigint(19)} <br>
     * 更新者
     * @param upmn The value of the column 'UPMN'. (NullAllowed)
     */
    public void setUpmn(Long upmn) {
        __modifiedProperties.add("upmn");
        this._upmn = upmn;
    }

    /**
     * [get] CHNGYD: {varchar(8)} <br>
     * 更新年月日
     * @return The value of the column 'CHNGYD'. (NullAllowed)
     */
    public String getChngyd() {
        return _chngyd;
    }

    /**
     * [set] CHNGYD: {varchar(8)} <br>
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
     * [get] UPDIS: {bigint(19)} <br>
     * 更新画面ID
     * @return The value of the column 'UPDIS'. (NullAllowed)
     */
    public Long getUpdis() {
        return _updis;
    }

    /**
     * [set] UPDIS: {bigint(19)} <br>
     * 更新画面ID
     * @param updis The value of the column 'UPDIS'. (NullAllowed)
     */
    public void setUpdis(Long updis) {
        __modifiedProperties.add("updis");
        this._updis = updis;
    }

    /**
     * [get] UPBMN: {bigint(19)} <br>
     * バッチ更新者
     * @return The value of the column 'UPBMN'. (NullAllowed)
     */
    public Long getUpbmn() {
        return _upbmn;
    }

    /**
     * [set] UPBMN: {bigint(19)} <br>
     * バッチ更新者
     * @param upbmn The value of the column 'UPBMN'. (NullAllowed)
     */
    public void setUpbmn(Long upbmn) {
        __modifiedProperties.add("upbmn");
        this._upbmn = upbmn;
    }

    /**
     * [get] BCHNGYD: {varchar(8)} <br>
     * バッチ更新年月日
     * @return The value of the column 'BCHNGYD'. (NullAllowed)
     */
    public String getBchngyd() {
        return _bchngyd;
    }

    /**
     * [set] BCHNGYD: {varchar(8)} <br>
     * バッチ更新年月日
     * @param bchngyd The value of the column 'BCHNGYD'. (NullAllowed)
     */
    public void setBchngyd(String bchngyd) {
        __modifiedProperties.add("bchngyd");
        this._bchngyd = bchngyd;
    }

    /**
     * [get] BUPDTM: {bigint(19)} <br>
     * バッチ更新時刻
     * @return The value of the column 'BUPDTM'. (NullAllowed)
     */
    public Long getBupdtm() {
        return _bupdtm;
    }

    /**
     * [set] BUPDTM: {bigint(19)} <br>
     * バッチ更新時刻
     * @param bupdtm The value of the column 'BUPDTM'. (NullAllowed)
     */
    public void setBupdtm(Long bupdtm) {
        __modifiedProperties.add("bupdtm");
        this._bupdtm = bupdtm;
    }

    /**
     * [get] UPOBMN: {bigint(19)} <br>
     * オンラインバッチ更新者
     * @return The value of the column 'UPOBMN'. (NullAllowed)
     */
    public Long getUpobmn() {
        return _upobmn;
    }

    /**
     * [set] UPOBMN: {bigint(19)} <br>
     * オンラインバッチ更新者
     * @param upobmn The value of the column 'UPOBMN'. (NullAllowed)
     */
    public void setUpobmn(Long upobmn) {
        __modifiedProperties.add("upobmn");
        this._upobmn = upobmn;
    }

    /**
     * [get] OBCHNGYD: {varchar(8)} <br>
     * オンラインバッチ更新年月日
     * @return The value of the column 'OBCHNGYD'. (NullAllowed)
     */
    public String getObchngyd() {
        return _obchngyd;
    }

    /**
     * [set] OBCHNGYD: {varchar(8)} <br>
     * オンラインバッチ更新年月日
     * @param obchngyd The value of the column 'OBCHNGYD'. (NullAllowed)
     */
    public void setObchngyd(String obchngyd) {
        __modifiedProperties.add("obchngyd");
        this._obchngyd = obchngyd;
    }

    /**
     * [get] OBUPDTM: {bigint(19)} <br>
     * オンラインバッチ更新時刻
     * @return The value of the column 'OBUPDTM'. (NullAllowed)
     */
    public Long getObupdtm() {
        return _obupdtm;
    }

    /**
     * [set] OBUPDTM: {bigint(19)} <br>
     * オンラインバッチ更新時刻
     * @param obupdtm The value of the column 'OBUPDTM'. (NullAllowed)
     */
    public void setObupdtm(Long obupdtm) {
        __modifiedProperties.add("obupdtm");
        this._obupdtm = obupdtm;
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
     * [get] RCDUPDPS: {varchar(30)} <br>
     * レコード更新処理区分
     * @return The value of the column 'RCDUPDPS'. (NullAllowed)
     */
    public String getRcdupdps() {
        return _rcdupdps;
    }

    /**
     * [set] RCDUPDPS: {varchar(30)} <br>
     * レコード更新処理区分
     * @param rcdupdps The value of the column 'RCDUPDPS'. (NullAllowed)
     */
    public void setRcdupdps(String rcdupdps) {
        __modifiedProperties.add("rcdupdps");
        this._rcdupdps = rcdupdps;
    }

    /**
     * [get] UPDUSRID: {bigint(19)} <br>
     * レコード更新ユーザＩＤ
     * @return The value of the column 'UPDUSRID'. (NullAllowed)
     */
    public Long getUpdusrid() {
        return _updusrid;
    }

    /**
     * [set] UPDUSRID: {bigint(19)} <br>
     * レコード更新ユーザＩＤ
     * @param updusrid The value of the column 'UPDUSRID'. (NullAllowed)
     */
    public void setUpdusrid(Long updusrid) {
        __modifiedProperties.add("updusrid");
        this._updusrid = updusrid;
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
     * [get] OTCMPFG: {decimal(16, 6)} <br>
     * 出力済フラグ
     * @return The value of the column 'OTCMPFG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtcmpfg() {
        return _otcmpfg;
    }

    /**
     * [set] OTCMPFG: {decimal(16, 6)} <br>
     * 出力済フラグ
     * @param otcmpfg The value of the column 'OTCMPFG'. (NullAllowed)
     */
    public void setOtcmpfg(java.math.BigDecimal otcmpfg) {
        __modifiedProperties.add("otcmpfg");
        this._otcmpfg = otcmpfg;
    }

    /**
     * [get] TMCMPFG: {decimal(16, 6)} <br>
     * 送信済フラグ
     * @return The value of the column 'TMCMPFG'. (NullAllowed)
     */
    public java.math.BigDecimal getTmcmpfg() {
        return _tmcmpfg;
    }

    /**
     * [set] TMCMPFG: {decimal(16, 6)} <br>
     * 送信済フラグ
     * @param tmcmpfg The value of the column 'TMCMPFG'. (NullAllowed)
     */
    public void setTmcmpfg(java.math.BigDecimal tmcmpfg) {
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
