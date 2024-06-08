package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_CORG as TABLE. <br>
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
 * [foreign table]
 *     M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long corgId = entity.getCorgId();
 * Long centerId = entity.getCenterId();
 * String orgid = entity.getOrgid();
 * String orgnmkjf = entity.getOrgnmkjf();
 * String orgnmknf = entity.getOrgnmknf();
 * String orgnmkj = entity.getOrgnmkj();
 * String orgnmkn = entity.getOrgnmkn();
 * String uporgncd = entity.getUporgncd();
 * String zzbasecd = entity.getZzbasecd();
 * String zzcomacd = entity.getZzcomacd();
 * String zzwhmgid = entity.getZzwhmgid();
 * Long otrnk = entity.getOtrnk();
 * String rdvdid = entity.getRdvdid();
 * String zzablymd = entity.getZzablymd();
 * String zzfrdateh = entity.getZzfrdateh();
 * String zztodateh = entity.getZztodateh();
 * String sasasid = entity.getSasasid();
 * String cmlrasid = entity.getCmlrasid();
 * String anwhnm = entity.getAnwhnm();
 * String odtscd = entity.getOdtscd();
 * String lnarcd = entity.getLnarcd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCorgId(corgId);
 * entity.setCenterId(centerId);
 * entity.setOrgid(orgid);
 * entity.setOrgnmkjf(orgnmkjf);
 * entity.setOrgnmknf(orgnmknf);
 * entity.setOrgnmkj(orgnmkj);
 * entity.setOrgnmkn(orgnmkn);
 * entity.setUporgncd(uporgncd);
 * entity.setZzbasecd(zzbasecd);
 * entity.setZzcomacd(zzcomacd);
 * entity.setZzwhmgid(zzwhmgid);
 * entity.setOtrnk(otrnk);
 * entity.setRdvdid(rdvdid);
 * entity.setZzablymd(zzablymd);
 * entity.setZzfrdateh(zzfrdateh);
 * entity.setZztodateh(zztodateh);
 * entity.setSasasid(sasasid);
 * entity.setCmlrasid(cmlrasid);
 * entity.setAnwhnm(anwhnm);
 * entity.setOdtscd(odtscd);
 * entity.setLnarcd(lnarcd);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCorg extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CORG_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _corgId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** ORGID: {varchar(30)} */
    protected String _orgid;

    /** ORGNMKJF: {varchar(60)} */
    protected String _orgnmkjf;

    /** ORGNMKNF: {varchar(60)} */
    protected String _orgnmknf;

    /** ORGNMKJ: {varchar(30)} */
    protected String _orgnmkj;

    /** ORGNMKN: {varchar(30)} */
    protected String _orgnmkn;

    /** UPORGNCD: {varchar(30)} */
    protected String _uporgncd;

    /** ZZBASECD: {varchar(30)} */
    protected String _zzbasecd;

    /** ZZCOMACD: {varchar(30)} */
    protected String _zzcomacd;

    /** ZZWHMGID: {varchar(30)} */
    protected String _zzwhmgid;

    /** OTRNK: {bigint(19)} */
    protected Long _otrnk;

    /** RDVDID: {varchar(30)} */
    protected String _rdvdid;

    /** ZZABLYMD: {varchar(8)} */
    protected String _zzablymd;

    /** ZZFRDATEH: {NotNull, varchar(8)} */
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    protected String _zztodateh;

    /** SASASID: {char(1)} */
    protected String _sasasid;

    /** CMLRASID: {char(1)} */
    protected String _cmlrasid;

    /** ANWHNM: {varchar(30)} */
    protected String _anwhnm;

    /** ODTSCD: {char(1)} */
    protected String _odtscd;

    /** LNARCD: {char(1)} */
    protected String _lnarcd;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_CORG";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_corgId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCorg) {
            BsMCorg other = (BsMCorg)obj;
            if (!xSV(_corgId, other._corgId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _corgId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_corgId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_orgid));
        sb.append(dm).append(xfND(_orgnmkjf));
        sb.append(dm).append(xfND(_orgnmknf));
        sb.append(dm).append(xfND(_orgnmkj));
        sb.append(dm).append(xfND(_orgnmkn));
        sb.append(dm).append(xfND(_uporgncd));
        sb.append(dm).append(xfND(_zzbasecd));
        sb.append(dm).append(xfND(_zzcomacd));
        sb.append(dm).append(xfND(_zzwhmgid));
        sb.append(dm).append(xfND(_otrnk));
        sb.append(dm).append(xfND(_rdvdid));
        sb.append(dm).append(xfND(_zzablymd));
        sb.append(dm).append(xfND(_zzfrdateh));
        sb.append(dm).append(xfND(_zztodateh));
        sb.append(dm).append(xfND(_sasasid));
        sb.append(dm).append(xfND(_cmlrasid));
        sb.append(dm).append(xfND(_anwhnm));
        sb.append(dm).append(xfND(_odtscd));
        sb.append(dm).append(xfND(_lnarcd));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCorg clone() {
        return (MCorg)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CORG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @return The value of the column 'CORG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCorgId() {
        checkSpecifiedProperty("corgId");
        return _corgId;
    }

    /**
     * [set] CORG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @param corgId The value of the column 'CORG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCorgId(Long corgId) {
        registerModifiedProperty("corgId");
        _corgId = corgId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] ORGID: {varchar(30)} <br>
     * 組織区分
     * @return The value of the column 'ORGID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgid() {
        checkSpecifiedProperty("orgid");
        return convertEmptyToNull(_orgid);
    }

    /**
     * [set] ORGID: {varchar(30)} <br>
     * 組織区分
     * @param orgid The value of the column 'ORGID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgid(String orgid) {
        registerModifiedProperty("orgid");
        _orgid = orgid;
    }

    /**
     * [get] ORGNMKJF: {varchar(60)} <br>
     * 組織名正称(TSN)（全角）
     * @return The value of the column 'ORGNMKJF'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgnmkjf() {
        checkSpecifiedProperty("orgnmkjf");
        return convertEmptyToNull(_orgnmkjf);
    }

    /**
     * [set] ORGNMKJF: {varchar(60)} <br>
     * 組織名正称(TSN)（全角）
     * @param orgnmkjf The value of the column 'ORGNMKJF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgnmkjf(String orgnmkjf) {
        registerModifiedProperty("orgnmkjf");
        _orgnmkjf = orgnmkjf;
    }

    /**
     * [get] ORGNMKNF: {varchar(60)} <br>
     * 組織名正称(TSN)（半角）
     * @return The value of the column 'ORGNMKNF'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgnmknf() {
        checkSpecifiedProperty("orgnmknf");
        return convertEmptyToNull(_orgnmknf);
    }

    /**
     * [set] ORGNMKNF: {varchar(60)} <br>
     * 組織名正称(TSN)（半角）
     * @param orgnmknf The value of the column 'ORGNMKNF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgnmknf(String orgnmknf) {
        registerModifiedProperty("orgnmknf");
        _orgnmknf = orgnmknf;
    }

    /**
     * [get] ORGNMKJ: {varchar(30)} <br>
     * 組織名略称(TSN)（全角）
     * @return The value of the column 'ORGNMKJ'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgnmkj() {
        checkSpecifiedProperty("orgnmkj");
        return convertEmptyToNull(_orgnmkj);
    }

    /**
     * [set] ORGNMKJ: {varchar(30)} <br>
     * 組織名略称(TSN)（全角）
     * @param orgnmkj The value of the column 'ORGNMKJ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgnmkj(String orgnmkj) {
        registerModifiedProperty("orgnmkj");
        _orgnmkj = orgnmkj;
    }

    /**
     * [get] ORGNMKN: {varchar(30)} <br>
     * 組織名略称(TSN)（半角）
     * @return The value of the column 'ORGNMKN'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgnmkn() {
        checkSpecifiedProperty("orgnmkn");
        return convertEmptyToNull(_orgnmkn);
    }

    /**
     * [set] ORGNMKN: {varchar(30)} <br>
     * 組織名略称(TSN)（半角）
     * @param orgnmkn The value of the column 'ORGNMKN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgnmkn(String orgnmkn) {
        registerModifiedProperty("orgnmkn");
        _orgnmkn = orgnmkn;
    }

    /**
     * [get] UPORGNCD: {varchar(30)} <br>
     * 上位組織CD
     * @return The value of the column 'UPORGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUporgncd() {
        checkSpecifiedProperty("uporgncd");
        return convertEmptyToNull(_uporgncd);
    }

    /**
     * [set] UPORGNCD: {varchar(30)} <br>
     * 上位組織CD
     * @param uporgncd The value of the column 'UPORGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUporgncd(String uporgncd) {
        registerModifiedProperty("uporgncd");
        _uporgncd = uporgncd;
    }

    /**
     * [get] ZZBASECD: {varchar(30)} <br>
     * 基地圏CD
     * @return The value of the column 'ZZBASECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzbasecd() {
        checkSpecifiedProperty("zzbasecd");
        return convertEmptyToNull(_zzbasecd);
    }

    /**
     * [set] ZZBASECD: {varchar(30)} <br>
     * 基地圏CD
     * @param zzbasecd The value of the column 'ZZBASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzbasecd(String zzbasecd) {
        registerModifiedProperty("zzbasecd");
        _zzbasecd = zzbasecd;
    }

    /**
     * [get] ZZCOMACD: {varchar(30)} <br>
     * 会社圏CD
     * @return The value of the column 'ZZCOMACD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzcomacd() {
        checkSpecifiedProperty("zzcomacd");
        return convertEmptyToNull(_zzcomacd);
    }

    /**
     * [set] ZZCOMACD: {varchar(30)} <br>
     * 会社圏CD
     * @param zzcomacd The value of the column 'ZZCOMACD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzcomacd(String zzcomacd) {
        registerModifiedProperty("zzcomacd");
        _zzcomacd = zzcomacd;
    }

    /**
     * [get] ZZWHMGID: {varchar(30)} <br>
     * 倉庫機能区分
     * @return The value of the column 'ZZWHMGID'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzwhmgid() {
        checkSpecifiedProperty("zzwhmgid");
        return convertEmptyToNull(_zzwhmgid);
    }

    /**
     * [set] ZZWHMGID: {varchar(30)} <br>
     * 倉庫機能区分
     * @param zzwhmgid The value of the column 'ZZWHMGID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzwhmgid(String zzwhmgid) {
        registerModifiedProperty("zzwhmgid");
        _zzwhmgid = zzwhmgid;
    }

    /**
     * [get] OTRNK: {bigint(19)} <br>
     * 出力順
     * @return The value of the column 'OTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtrnk() {
        checkSpecifiedProperty("otrnk");
        return _otrnk;
    }

    /**
     * [set] OTRNK: {bigint(19)} <br>
     * 出力順
     * @param otrnk The value of the column 'OTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtrnk(Long otrnk) {
        registerModifiedProperty("otrnk");
        _otrnk = otrnk;
    }

    /**
     * [get] RDVDID: {varchar(30)} <br>
     * SAP振分区分
     * @return The value of the column 'RDVDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getRdvdid() {
        checkSpecifiedProperty("rdvdid");
        return convertEmptyToNull(_rdvdid);
    }

    /**
     * [set] RDVDID: {varchar(30)} <br>
     * SAP振分区分
     * @param rdvdid The value of the column 'RDVDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRdvdid(String rdvdid) {
        registerModifiedProperty("rdvdid");
        _rdvdid = rdvdid;
    }

    /**
     * [get] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'ZZABLYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzablymd() {
        checkSpecifiedProperty("zzablymd");
        return convertEmptyToNull(_zzablymd);
    }

    /**
     * [set] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @param zzablymd The value of the column 'ZZABLYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzablymd(String zzablymd) {
        registerModifiedProperty("zzablymd");
        _zzablymd = zzablymd;
    }

    /**
     * [get] ZZFRDATEH: {NotNull, varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (basically NotNull if selected: for the constraint)
     */
    public String getZzfrdateh() {
        checkSpecifiedProperty("zzfrdateh");
        return convertEmptyToNull(_zzfrdateh);
    }

    /**
     * [set] ZZFRDATEH: {NotNull, varchar(8)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (basically NotNull if update: for the constraint)
     */
    public void setZzfrdateh(String zzfrdateh) {
        registerModifiedProperty("zzfrdateh");
        _zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZztodateh() {
        checkSpecifiedProperty("zztodateh");
        return convertEmptyToNull(_zztodateh);
    }

    /**
     * [set] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZztodateh(String zztodateh) {
        registerModifiedProperty("zztodateh");
        _zztodateh = zztodateh;
    }

    /**
     * [get] SASASID: {char(1)} <br>
     * 入出庫管理区分
     * @return The value of the column 'SASASID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSasasid() {
        checkSpecifiedProperty("sasasid");
        return convertEmptyToNull(_sasasid);
    }

    /**
     * [set] SASASID: {char(1)} <br>
     * 入出庫管理区分
     * @param sasasid The value of the column 'SASASID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSasasid(String sasasid) {
        registerModifiedProperty("sasasid");
        _sasasid = sasasid;
    }

    /**
     * [get] CMLRASID: {char(1)} <br>
     * 共通下位管理区分
     * @return The value of the column 'CMLRASID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmlrasid() {
        checkSpecifiedProperty("cmlrasid");
        return convertEmptyToNull(_cmlrasid);
    }

    /**
     * [set] CMLRASID: {char(1)} <br>
     * 共通下位管理区分
     * @param cmlrasid The value of the column 'CMLRASID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmlrasid(String cmlrasid) {
        registerModifiedProperty("cmlrasid");
        _cmlrasid = cmlrasid;
    }

    /**
     * [get] ANWHNM: {varchar(30)} <br>
     * 短縮組織名
     * @return The value of the column 'ANWHNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAnwhnm() {
        checkSpecifiedProperty("anwhnm");
        return convertEmptyToNull(_anwhnm);
    }

    /**
     * [set] ANWHNM: {varchar(30)} <br>
     * 短縮組織名
     * @param anwhnm The value of the column 'ANWHNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAnwhnm(String anwhnm) {
        registerModifiedProperty("anwhnm");
        _anwhnm = anwhnm;
    }

    /**
     * [get] ODTSCD: {char(1)} <br>
     * 旧TSCD
     * @return The value of the column 'ODTSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOdtscd() {
        checkSpecifiedProperty("odtscd");
        return convertEmptyToNull(_odtscd);
    }

    /**
     * [set] ODTSCD: {char(1)} <br>
     * 旧TSCD
     * @param odtscd The value of the column 'ODTSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOdtscd(String odtscd) {
        registerModifiedProperty("odtscd");
        _odtscd = odtscd;
    }

    /**
     * [get] LNARCD: {char(1)} <br>
     * 仕入エリアCD
     * @return The value of the column 'LNARCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLnarcd() {
        checkSpecifiedProperty("lnarcd");
        return convertEmptyToNull(_lnarcd);
    }

    /**
     * [set] LNARCD: {char(1)} <br>
     * 仕入エリアCD
     * @param lnarcd The value of the column 'LNARCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLnarcd(String lnarcd) {
        registerModifiedProperty("lnarcd");
        _lnarcd = lnarcd;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
