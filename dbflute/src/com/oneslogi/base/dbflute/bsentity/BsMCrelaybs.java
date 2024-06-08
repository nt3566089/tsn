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
 * The entity of M_CRELAYBS as TABLE. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long crelaybsId = entity.getCrelaybsId();
 * String rlybscd = entity.getRlybscd();
 * String dlvdpcd = entity.getDlvdpcd();
 * String rlybsnm = entity.getRlybsnm();
 * String rlybssnm = entity.getRlybssnm();
 * String rlybsp = entity.getRlybsp();
 * String rlybsacd = entity.getRlybsacd();
 * String rlybsccd = entity.getRlybsccd();
 * String rlybsar = entity.getRlybsar();
 * String rlybstl = entity.getRlybstl();
 * String rlybsfn = entity.getRlybsfn();
 * String rlybsid = entity.getRlybsid();
 * String rlyshan = entity.getRlyshan();
 * String delymd = entity.getDelymd();
 * String chngyd = entity.getChngyd();
 * String updtm = entity.getUpdtm();
 * String zzfrdateh = entity.getZzfrdateh();
 * String zztodateh = entity.getZztodateh();
 * String rcdupdps = entity.getRcdupdps();
 * String updpocd = entity.getUpdpocd();
 * String otcmpfg = entity.getOtcmpfg();
 * String tmcmpfg = entity.getTmcmpfg();
 * String stmid = entity.getStmid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCrelaybsId(crelaybsId);
 * entity.setRlybscd(rlybscd);
 * entity.setDlvdpcd(dlvdpcd);
 * entity.setRlybsnm(rlybsnm);
 * entity.setRlybssnm(rlybssnm);
 * entity.setRlybsp(rlybsp);
 * entity.setRlybsacd(rlybsacd);
 * entity.setRlybsccd(rlybsccd);
 * entity.setRlybsar(rlybsar);
 * entity.setRlybstl(rlybstl);
 * entity.setRlybsfn(rlybsfn);
 * entity.setRlybsid(rlybsid);
 * entity.setRlyshan(rlyshan);
 * entity.setDelymd(delymd);
 * entity.setChngyd(chngyd);
 * entity.setUpdtm(updtm);
 * entity.setZzfrdateh(zzfrdateh);
 * entity.setZztodateh(zztodateh);
 * entity.setRcdupdps(rcdupdps);
 * entity.setUpdpocd(updpocd);
 * entity.setOtcmpfg(otcmpfg);
 * entity.setTmcmpfg(tmcmpfg);
 * entity.setStmid(stmid);
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
public abstract class BsMCrelaybs extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _crelaybsId;

    /** RLYBSCD: {NotNull, varchar(30)} */
    protected String _rlybscd;

    /** DLVDPCD: {NotNull, varchar(30)} */
    protected String _dlvdpcd;

    /** RLYBSNM: {NotNull, varchar(30)} */
    protected String _rlybsnm;

    /** RLYBSSNM: {varchar(30)} */
    protected String _rlybssnm;

    /** RLYBSP: {NotNull, varchar(30)} */
    protected String _rlybsp;

    /** RLYBSACD: {NotNull, varchar(30)} */
    protected String _rlybsacd;

    /** RLYBSCCD: {NotNull, varchar(30)} */
    protected String _rlybsccd;

    /** RLYBSAR: {NotNull, varchar(60)} */
    protected String _rlybsar;

    /** RLYBSTL: {varchar(30)} */
    protected String _rlybstl;

    /** RLYBSFN: {varchar(30)} */
    protected String _rlybsfn;

    /** RLYBSID: {char(1)} */
    protected String _rlybsid;

    /** RLYSHAN: {varchar(60)} */
    protected String _rlyshan;

    /** DELYMD: {varchar(8)} */
    protected String _delymd;

    /** CHNGYD: {NotNull, varchar(8)} */
    protected String _chngyd;

    /** UPDTM: {varchar(30)} */
    protected String _updtm;

    /** ZZFRDATEH: {NotNull, varchar(8)} */
    protected String _zzfrdateh;

    /** ZZTODATEH: {NotNull, varchar(8)} */
    protected String _zztodateh;

    /** RCDUPDPS: {NotNull, varchar(30)} */
    protected String _rcdupdps;

    /** UPDPOCD: {varchar(30)} */
    protected String _updpocd;

    /** OTCMPFG: {char(1)} */
    protected String _otcmpfg;

    /** TMCMPFG: {char(1)} */
    protected String _tmcmpfg;

    /** STMID: {varchar(30)} */
    protected String _stmid;

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
        return "M_CRELAYBS";
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
        if (_crelaybsId == null) { return false; }
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
        if (obj instanceof BsMCrelaybs) {
            BsMCrelaybs other = (BsMCrelaybs)obj;
            if (!xSV(_crelaybsId, other._crelaybsId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _crelaybsId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_crelaybsId));
        sb.append(dm).append(xfND(_rlybscd));
        sb.append(dm).append(xfND(_dlvdpcd));
        sb.append(dm).append(xfND(_rlybsnm));
        sb.append(dm).append(xfND(_rlybssnm));
        sb.append(dm).append(xfND(_rlybsp));
        sb.append(dm).append(xfND(_rlybsacd));
        sb.append(dm).append(xfND(_rlybsccd));
        sb.append(dm).append(xfND(_rlybsar));
        sb.append(dm).append(xfND(_rlybstl));
        sb.append(dm).append(xfND(_rlybsfn));
        sb.append(dm).append(xfND(_rlybsid));
        sb.append(dm).append(xfND(_rlyshan));
        sb.append(dm).append(xfND(_delymd));
        sb.append(dm).append(xfND(_chngyd));
        sb.append(dm).append(xfND(_updtm));
        sb.append(dm).append(xfND(_zzfrdateh));
        sb.append(dm).append(xfND(_zztodateh));
        sb.append(dm).append(xfND(_rcdupdps));
        sb.append(dm).append(xfND(_updpocd));
        sb.append(dm).append(xfND(_otcmpfg));
        sb.append(dm).append(xfND(_tmcmpfg));
        sb.append(dm).append(xfND(_stmid));
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
        return "";
    }

    @Override
    public MCrelaybs clone() {
        return (MCrelaybs)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 中継拠点ID
     * @return The value of the column 'CRELAYBS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCrelaybsId() {
        checkSpecifiedProperty("crelaybsId");
        return _crelaybsId;
    }

    /**
     * [set] CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 中継拠点ID
     * @param crelaybsId The value of the column 'CRELAYBS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCrelaybsId(Long crelaybsId) {
        registerModifiedProperty("crelaybsId");
        _crelaybsId = crelaybsId;
    }

    /**
     * [get] RLYBSCD: {NotNull, varchar(30)} <br>
     * 中継拠点CD
     * @return The value of the column 'RLYBSCD'. (basically NotNull if selected: for the constraint)
     */
    public String getRlybscd() {
        checkSpecifiedProperty("rlybscd");
        return convertEmptyToNull(_rlybscd);
    }

    /**
     * [set] RLYBSCD: {NotNull, varchar(30)} <br>
     * 中継拠点CD
     * @param rlybscd The value of the column 'RLYBSCD'. (basically NotNull if update: for the constraint)
     */
    public void setRlybscd(String rlybscd) {
        registerModifiedProperty("rlybscd");
        _rlybscd = rlybscd;
    }

    /**
     * [get] DLVDPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DLVDPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getDlvdpcd() {
        checkSpecifiedProperty("dlvdpcd");
        return convertEmptyToNull(_dlvdpcd);
    }

    /**
     * [set] DLVDPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dlvdpcd The value of the column 'DLVDPCD'. (basically NotNull if update: for the constraint)
     */
    public void setDlvdpcd(String dlvdpcd) {
        registerModifiedProperty("dlvdpcd");
        _dlvdpcd = dlvdpcd;
    }

    /**
     * [get] RLYBSNM: {NotNull, varchar(30)} <br>
     * 中継拠点名称
     * @return The value of the column 'RLYBSNM'. (basically NotNull if selected: for the constraint)
     */
    public String getRlybsnm() {
        checkSpecifiedProperty("rlybsnm");
        return convertEmptyToNull(_rlybsnm);
    }

    /**
     * [set] RLYBSNM: {NotNull, varchar(30)} <br>
     * 中継拠点名称
     * @param rlybsnm The value of the column 'RLYBSNM'. (basically NotNull if update: for the constraint)
     */
    public void setRlybsnm(String rlybsnm) {
        registerModifiedProperty("rlybsnm");
        _rlybsnm = rlybsnm;
    }

    /**
     * [get] RLYBSSNM: {varchar(30)} <br>
     * 中継拠点短縮名
     * @return The value of the column 'RLYBSSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybssnm() {
        checkSpecifiedProperty("rlybssnm");
        return convertEmptyToNull(_rlybssnm);
    }

    /**
     * [set] RLYBSSNM: {varchar(30)} <br>
     * 中継拠点短縮名
     * @param rlybssnm The value of the column 'RLYBSSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybssnm(String rlybssnm) {
        registerModifiedProperty("rlybssnm");
        _rlybssnm = rlybssnm;
    }

    /**
     * [get] RLYBSP: {NotNull, varchar(30)} <br>
     * 中継拠点郵便番号
     * @return The value of the column 'RLYBSP'. (basically NotNull if selected: for the constraint)
     */
    public String getRlybsp() {
        checkSpecifiedProperty("rlybsp");
        return convertEmptyToNull(_rlybsp);
    }

    /**
     * [set] RLYBSP: {NotNull, varchar(30)} <br>
     * 中継拠点郵便番号
     * @param rlybsp The value of the column 'RLYBSP'. (basically NotNull if update: for the constraint)
     */
    public void setRlybsp(String rlybsp) {
        registerModifiedProperty("rlybsp");
        _rlybsp = rlybsp;
    }

    /**
     * [get] RLYBSACD: {NotNull, varchar(30)} <br>
     * 中継拠点都道府県CD
     * @return The value of the column 'RLYBSACD'. (basically NotNull if selected: for the constraint)
     */
    public String getRlybsacd() {
        checkSpecifiedProperty("rlybsacd");
        return convertEmptyToNull(_rlybsacd);
    }

    /**
     * [set] RLYBSACD: {NotNull, varchar(30)} <br>
     * 中継拠点都道府県CD
     * @param rlybsacd The value of the column 'RLYBSACD'. (basically NotNull if update: for the constraint)
     */
    public void setRlybsacd(String rlybsacd) {
        registerModifiedProperty("rlybsacd");
        _rlybsacd = rlybsacd;
    }

    /**
     * [get] RLYBSCCD: {NotNull, varchar(30)} <br>
     * 中継拠点市区町村CD
     * @return The value of the column 'RLYBSCCD'. (basically NotNull if selected: for the constraint)
     */
    public String getRlybsccd() {
        checkSpecifiedProperty("rlybsccd");
        return convertEmptyToNull(_rlybsccd);
    }

    /**
     * [set] RLYBSCCD: {NotNull, varchar(30)} <br>
     * 中継拠点市区町村CD
     * @param rlybsccd The value of the column 'RLYBSCCD'. (basically NotNull if update: for the constraint)
     */
    public void setRlybsccd(String rlybsccd) {
        registerModifiedProperty("rlybsccd");
        _rlybsccd = rlybsccd;
    }

    /**
     * [get] RLYBSAR: {NotNull, varchar(60)} <br>
     * 中継拠点住所
     * @return The value of the column 'RLYBSAR'. (basically NotNull if selected: for the constraint)
     */
    public String getRlybsar() {
        checkSpecifiedProperty("rlybsar");
        return convertEmptyToNull(_rlybsar);
    }

    /**
     * [set] RLYBSAR: {NotNull, varchar(60)} <br>
     * 中継拠点住所
     * @param rlybsar The value of the column 'RLYBSAR'. (basically NotNull if update: for the constraint)
     */
    public void setRlybsar(String rlybsar) {
        registerModifiedProperty("rlybsar");
        _rlybsar = rlybsar;
    }

    /**
     * [get] RLYBSTL: {varchar(30)} <br>
     * 中継拠点電話番号
     * @return The value of the column 'RLYBSTL'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybstl() {
        checkSpecifiedProperty("rlybstl");
        return convertEmptyToNull(_rlybstl);
    }

    /**
     * [set] RLYBSTL: {varchar(30)} <br>
     * 中継拠点電話番号
     * @param rlybstl The value of the column 'RLYBSTL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybstl(String rlybstl) {
        registerModifiedProperty("rlybstl");
        _rlybstl = rlybstl;
    }

    /**
     * [get] RLYBSFN: {varchar(30)} <br>
     * 中継拠点FAX番号
     * @return The value of the column 'RLYBSFN'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybsfn() {
        checkSpecifiedProperty("rlybsfn");
        return convertEmptyToNull(_rlybsfn);
    }

    /**
     * [set] RLYBSFN: {varchar(30)} <br>
     * 中継拠点FAX番号
     * @param rlybsfn The value of the column 'RLYBSFN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybsfn(String rlybsfn) {
        registerModifiedProperty("rlybsfn");
        _rlybsfn = rlybsfn;
    }

    /**
     * [get] RLYBSID: {char(1)} <br>
     * 中継拠点区分
     * @return The value of the column 'RLYBSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybsid() {
        checkSpecifiedProperty("rlybsid");
        return convertEmptyToNull(_rlybsid);
    }

    /**
     * [set] RLYBSID: {char(1)} <br>
     * 中継拠点区分
     * @param rlybsid The value of the column 'RLYBSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybsid(String rlybsid) {
        registerModifiedProperty("rlybsid");
        _rlybsid = rlybsid;
    }

    /**
     * [get] RLYSHAN: {varchar(60)} <br>
     * 中継輸送業者名
     * @return The value of the column 'RLYSHAN'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlyshan() {
        checkSpecifiedProperty("rlyshan");
        return convertEmptyToNull(_rlyshan);
    }

    /**
     * [set] RLYSHAN: {varchar(60)} <br>
     * 中継輸送業者名
     * @param rlyshan The value of the column 'RLYSHAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlyshan(String rlyshan) {
        registerModifiedProperty("rlyshan");
        _rlyshan = rlyshan;
    }

    /**
     * [get] DELYMD: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'DELYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelymd() {
        checkSpecifiedProperty("delymd");
        return convertEmptyToNull(_delymd);
    }

    /**
     * [set] DELYMD: {varchar(8)} <br>
     * 廃止年月日
     * @param delymd The value of the column 'DELYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelymd(String delymd) {
        registerModifiedProperty("delymd");
        _delymd = delymd;
    }

    /**
     * [get] CHNGYD: {NotNull, varchar(8)} <br>
     * 更新年月日
     * @return The value of the column 'CHNGYD'. (basically NotNull if selected: for the constraint)
     */
    public String getChngyd() {
        checkSpecifiedProperty("chngyd");
        return convertEmptyToNull(_chngyd);
    }

    /**
     * [set] CHNGYD: {NotNull, varchar(8)} <br>
     * 更新年月日
     * @param chngyd The value of the column 'CHNGYD'. (basically NotNull if update: for the constraint)
     */
    public void setChngyd(String chngyd) {
        registerModifiedProperty("chngyd");
        _chngyd = chngyd;
    }

    /**
     * [get] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @return The value of the column 'UPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdtm() {
        checkSpecifiedProperty("updtm");
        return convertEmptyToNull(_updtm);
    }

    /**
     * [set] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @param updtm The value of the column 'UPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdtm(String updtm) {
        registerModifiedProperty("updtm");
        _updtm = updtm;
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
     * [get] ZZTODATEH: {NotNull, varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (basically NotNull if selected: for the constraint)
     */
    public String getZztodateh() {
        checkSpecifiedProperty("zztodateh");
        return convertEmptyToNull(_zztodateh);
    }

    /**
     * [set] ZZTODATEH: {NotNull, varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (basically NotNull if update: for the constraint)
     */
    public void setZztodateh(String zztodateh) {
        registerModifiedProperty("zztodateh");
        _zztodateh = zztodateh;
    }

    /**
     * [get] RCDUPDPS: {NotNull, varchar(30)} <br>
     * レコード更新処理区分
     * @return The value of the column 'RCDUPDPS'. (basically NotNull if selected: for the constraint)
     */
    public String getRcdupdps() {
        checkSpecifiedProperty("rcdupdps");
        return convertEmptyToNull(_rcdupdps);
    }

    /**
     * [set] RCDUPDPS: {NotNull, varchar(30)} <br>
     * レコード更新処理区分
     * @param rcdupdps The value of the column 'RCDUPDPS'. (basically NotNull if update: for the constraint)
     */
    public void setRcdupdps(String rcdupdps) {
        registerModifiedProperty("rcdupdps");
        _rcdupdps = rcdupdps;
    }

    /**
     * [get] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @return The value of the column 'UPDPOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdpocd() {
        checkSpecifiedProperty("updpocd");
        return convertEmptyToNull(_updpocd);
    }

    /**
     * [set] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @param updpocd The value of the column 'UPDPOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdpocd(String updpocd) {
        registerModifiedProperty("updpocd");
        _updpocd = updpocd;
    }

    /**
     * [get] OTCMPFG: {char(1)} <br>
     * 出力済フラグ
     * @return The value of the column 'OTCMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtcmpfg() {
        checkSpecifiedProperty("otcmpfg");
        return convertEmptyToNull(_otcmpfg);
    }

    /**
     * [set] OTCMPFG: {char(1)} <br>
     * 出力済フラグ
     * @param otcmpfg The value of the column 'OTCMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtcmpfg(String otcmpfg) {
        registerModifiedProperty("otcmpfg");
        _otcmpfg = otcmpfg;
    }

    /**
     * [get] TMCMPFG: {char(1)} <br>
     * 送信済フラグ
     * @return The value of the column 'TMCMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTmcmpfg() {
        checkSpecifiedProperty("tmcmpfg");
        return convertEmptyToNull(_tmcmpfg);
    }

    /**
     * [set] TMCMPFG: {char(1)} <br>
     * 送信済フラグ
     * @param tmcmpfg The value of the column 'TMCMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTmcmpfg(String tmcmpfg) {
        registerModifiedProperty("tmcmpfg");
        _tmcmpfg = tmcmpfg;
    }

    /**
     * [get] STMID: {varchar(30)} <br>
     * システム区分
     * @return The value of the column 'STMID'. (NullAllowed even if selected: for no constraint)
     */
    public String getStmid() {
        checkSpecifiedProperty("stmid");
        return convertEmptyToNull(_stmid);
    }

    /**
     * [set] STMID: {varchar(30)} <br>
     * システム区分
     * @param stmid The value of the column 'STMID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStmid(String stmid) {
        registerModifiedProperty("stmid");
        _stmid = stmid;
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
