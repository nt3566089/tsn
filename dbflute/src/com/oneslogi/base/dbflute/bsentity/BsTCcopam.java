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
 * The entity of T_CCOPAM as TABLE. <br>
 * 配車実績
 * <pre>
 * [primary-key]
 *     CCOPAM_ID
 *
 * [column]
 *     CCOPAM_ID, CENTER_ID, CLIENT_ID, ZZORGNCD, SNNO1, SNNO2, SNNO3, CARNO, SNYMD, ARVYMD, SFCD, STCD, GNLPLTQA, OTPLTQA, PLNCARKND, AMCARKND, SELNO1, SELNO2, SELNO3, TRANNM, CHGID, TDRELAYID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CCOPAM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ccopamId = entity.getCcopamId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String zzorgncd = entity.getZzorgncd();
 * String snno1 = entity.getSnno1();
 * String snno2 = entity.getSnno2();
 * String snno3 = entity.getSnno3();
 * String carno = entity.getCarno();
 * String snymd = entity.getSnymd();
 * String arvymd = entity.getArvymd();
 * String sfcd = entity.getSfcd();
 * String stcd = entity.getStcd();
 * Long gnlpltqa = entity.getGnlpltqa();
 * Long otpltqa = entity.getOtpltqa();
 * String plncarknd = entity.getPlncarknd();
 * String amcarknd = entity.getAmcarknd();
 * String selno1 = entity.getSelno1();
 * String selno2 = entity.getSelno2();
 * String selno3 = entity.getSelno3();
 * String trannm = entity.getTrannm();
 * String chgid = entity.getChgid();
 * String tdrelayid = entity.getTdrelayid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCcopamId(ccopamId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setSnno1(snno1);
 * entity.setSnno2(snno2);
 * entity.setSnno3(snno3);
 * entity.setCarno(carno);
 * entity.setSnymd(snymd);
 * entity.setArvymd(arvymd);
 * entity.setSfcd(sfcd);
 * entity.setStcd(stcd);
 * entity.setGnlpltqa(gnlpltqa);
 * entity.setOtpltqa(otpltqa);
 * entity.setPlncarknd(plncarknd);
 * entity.setAmcarknd(amcarknd);
 * entity.setSelno1(selno1);
 * entity.setSelno2(selno2);
 * entity.setSelno3(selno3);
 * entity.setTrannm(trannm);
 * entity.setChgid(chgid);
 * entity.setTdrelayid(tdrelayid);
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
public abstract class BsTCcopam extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _ccopamId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** SNNO1: {NotNull, varchar(30)} */
    protected String _snno1;

    /** SNNO2: {NotNull, varchar(30)} */
    protected String _snno2;

    /** SNNO3: {NotNull, varchar(30)} */
    protected String _snno3;

    /** CARNO: {varchar(30)} */
    protected String _carno;

    /** SNYMD: {varchar(8)} */
    protected String _snymd;

    /** ARVYMD: {varchar(8)} */
    protected String _arvymd;

    /** SFCD: {varchar(30)} */
    protected String _sfcd;

    /** STCD: {varchar(30)} */
    protected String _stcd;

    /** GNLPLTQA: {bigint(19)} */
    protected Long _gnlpltqa;

    /** OTPLTQA: {bigint(19)} */
    protected Long _otpltqa;

    /** PLNCARKND: {varchar(255)} */
    protected String _plncarknd;

    /** AMCARKND: {varchar(255)} */
    protected String _amcarknd;

    /** SELNO1: {varchar(30)} */
    protected String _selno1;

    /** SELNO2: {varchar(30)} */
    protected String _selno2;

    /** SELNO3: {varchar(30)} */
    protected String _selno3;

    /** TRANNM: {varchar(60)} */
    protected String _trannm;

    /** CHGID: {char(1)} */
    protected String _chgid;

    /** TDRELAYID: {char(1)} */
    protected String _tdrelayid;

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
        return "T_CCOPAM";
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
        if (_ccopamId == null) { return false; }
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
    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

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
        if (obj instanceof BsTCcopam) {
            BsTCcopam other = (BsTCcopam)obj;
            if (!xSV(_ccopamId, other._ccopamId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ccopamId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ccopamId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_snno1));
        sb.append(dm).append(xfND(_snno2));
        sb.append(dm).append(xfND(_snno3));
        sb.append(dm).append(xfND(_carno));
        sb.append(dm).append(xfND(_snymd));
        sb.append(dm).append(xfND(_arvymd));
        sb.append(dm).append(xfND(_sfcd));
        sb.append(dm).append(xfND(_stcd));
        sb.append(dm).append(xfND(_gnlpltqa));
        sb.append(dm).append(xfND(_otpltqa));
        sb.append(dm).append(xfND(_plncarknd));
        sb.append(dm).append(xfND(_amcarknd));
        sb.append(dm).append(xfND(_selno1));
        sb.append(dm).append(xfND(_selno2));
        sb.append(dm).append(xfND(_selno3));
        sb.append(dm).append(xfND(_trannm));
        sb.append(dm).append(xfND(_chgid));
        sb.append(dm).append(xfND(_tdrelayid));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TCcopam clone() {
        return (TCcopam)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 配車実績ID
     * @return The value of the column 'CCOPAM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCcopamId() {
        checkSpecifiedProperty("ccopamId");
        return _ccopamId;
    }

    /**
     * [set] CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 配車実績ID
     * @param ccopamId The value of the column 'CCOPAM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCcopamId(Long ccopamId) {
        registerModifiedProperty("ccopamId");
        _ccopamId = ccopamId;
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
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'ZZORGNCD'. (basically NotNull if selected: for the constraint)
     */
    public String getZzorgncd() {
        checkSpecifiedProperty("zzorgncd");
        return convertEmptyToNull(_zzorgncd);
    }

    /**
     * [set] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @param zzorgncd The value of the column 'ZZORGNCD'. (basically NotNull if update: for the constraint)
     */
    public void setZzorgncd(String zzorgncd) {
        registerModifiedProperty("zzorgncd");
        _zzorgncd = zzorgncd;
    }

    /**
     * [get] SNNO1: {NotNull, varchar(30)} <br>
     * 発送番号（１）
     * @return The value of the column 'SNNO1'. (basically NotNull if selected: for the constraint)
     */
    public String getSnno1() {
        checkSpecifiedProperty("snno1");
        return convertEmptyToNull(_snno1);
    }

    /**
     * [set] SNNO1: {NotNull, varchar(30)} <br>
     * 発送番号（１）
     * @param snno1 The value of the column 'SNNO1'. (basically NotNull if update: for the constraint)
     */
    public void setSnno1(String snno1) {
        registerModifiedProperty("snno1");
        _snno1 = snno1;
    }

    /**
     * [get] SNNO2: {NotNull, varchar(30)} <br>
     * 発送番号（２）
     * @return The value of the column 'SNNO2'. (basically NotNull if selected: for the constraint)
     */
    public String getSnno2() {
        checkSpecifiedProperty("snno2");
        return convertEmptyToNull(_snno2);
    }

    /**
     * [set] SNNO2: {NotNull, varchar(30)} <br>
     * 発送番号（２）
     * @param snno2 The value of the column 'SNNO2'. (basically NotNull if update: for the constraint)
     */
    public void setSnno2(String snno2) {
        registerModifiedProperty("snno2");
        _snno2 = snno2;
    }

    /**
     * [get] SNNO3: {NotNull, varchar(30)} <br>
     * 発送番号（３）
     * @return The value of the column 'SNNO3'. (basically NotNull if selected: for the constraint)
     */
    public String getSnno3() {
        checkSpecifiedProperty("snno3");
        return convertEmptyToNull(_snno3);
    }

    /**
     * [set] SNNO3: {NotNull, varchar(30)} <br>
     * 発送番号（３）
     * @param snno3 The value of the column 'SNNO3'. (basically NotNull if update: for the constraint)
     */
    public void setSnno3(String snno3) {
        registerModifiedProperty("snno3");
        _snno3 = snno3;
    }

    /**
     * [get] CARNO: {varchar(30)} <br>
     * 号車Ｎｏ.
     * @return The value of the column 'CARNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarno() {
        checkSpecifiedProperty("carno");
        return convertEmptyToNull(_carno);
    }

    /**
     * [set] CARNO: {varchar(30)} <br>
     * 号車Ｎｏ.
     * @param carno The value of the column 'CARNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarno(String carno) {
        registerModifiedProperty("carno");
        _carno = carno;
    }

    /**
     * [get] SNYMD: {varchar(8)} <br>
     * 発送日
     * @return The value of the column 'SNYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnymd() {
        checkSpecifiedProperty("snymd");
        return convertEmptyToNull(_snymd);
    }

    /**
     * [set] SNYMD: {varchar(8)} <br>
     * 発送日
     * @param snymd The value of the column 'SNYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnymd(String snymd) {
        registerModifiedProperty("snymd");
        _snymd = snymd;
    }

    /**
     * [get] ARVYMD: {varchar(8)} <br>
     * 到着日
     * @return The value of the column 'ARVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getArvymd() {
        checkSpecifiedProperty("arvymd");
        return convertEmptyToNull(_arvymd);
    }

    /**
     * [set] ARVYMD: {varchar(8)} <br>
     * 到着日
     * @param arvymd The value of the column 'ARVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArvymd(String arvymd) {
        registerModifiedProperty("arvymd");
        _arvymd = arvymd;
    }

    /**
     * [get] SFCD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SFCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSfcd() {
        checkSpecifiedProperty("sfcd");
        return convertEmptyToNull(_sfcd);
    }

    /**
     * [set] SFCD: {varchar(30)} <br>
     * 発送元CD
     * @param sfcd The value of the column 'SFCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSfcd(String sfcd) {
        registerModifiedProperty("sfcd");
        _sfcd = sfcd;
    }

    /**
     * [get] STCD: {varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'STCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStcd() {
        checkSpecifiedProperty("stcd");
        return convertEmptyToNull(_stcd);
    }

    /**
     * [set] STCD: {varchar(30)} <br>
     * 発送先CD
     * @param stcd The value of the column 'STCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStcd(String stcd) {
        registerModifiedProperty("stcd");
        _stcd = stcd;
    }

    /**
     * [get] GNLPLTQA: {bigint(19)} <br>
     * 汎用パレット数
     * @return The value of the column 'GNLPLTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGnlpltqa() {
        checkSpecifiedProperty("gnlpltqa");
        return _gnlpltqa;
    }

    /**
     * [set] GNLPLTQA: {bigint(19)} <br>
     * 汎用パレット数
     * @param gnlpltqa The value of the column 'GNLPLTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGnlpltqa(Long gnlpltqa) {
        registerModifiedProperty("gnlpltqa");
        _gnlpltqa = gnlpltqa;
    }

    /**
     * [get] OTPLTQA: {bigint(19)} <br>
     * その他パレット数
     * @return The value of the column 'OTPLTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtpltqa() {
        checkSpecifiedProperty("otpltqa");
        return _otpltqa;
    }

    /**
     * [set] OTPLTQA: {bigint(19)} <br>
     * その他パレット数
     * @param otpltqa The value of the column 'OTPLTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtpltqa(Long otpltqa) {
        registerModifiedProperty("otpltqa");
        _otpltqa = otpltqa;
    }

    /**
     * [get] PLNCARKND: {varchar(255)} <br>
     * 計画車種
     * @return The value of the column 'PLNCARKND'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlncarknd() {
        checkSpecifiedProperty("plncarknd");
        return convertEmptyToNull(_plncarknd);
    }

    /**
     * [set] PLNCARKND: {varchar(255)} <br>
     * 計画車種
     * @param plncarknd The value of the column 'PLNCARKND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlncarknd(String plncarknd) {
        registerModifiedProperty("plncarknd");
        _plncarknd = plncarknd;
    }

    /**
     * [get] AMCARKND: {varchar(255)} <br>
     * 実績車種
     * @return The value of the column 'AMCARKND'. (NullAllowed even if selected: for no constraint)
     */
    public String getAmcarknd() {
        checkSpecifiedProperty("amcarknd");
        return convertEmptyToNull(_amcarknd);
    }

    /**
     * [set] AMCARKND: {varchar(255)} <br>
     * 実績車種
     * @param amcarknd The value of the column 'AMCARKND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmcarknd(String amcarknd) {
        registerModifiedProperty("amcarknd");
        _amcarknd = amcarknd;
    }

    /**
     * [get] SELNO1: {varchar(30)} <br>
     * 封印Ｎｏ.（１）
     * @return The value of the column 'SELNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSelno1() {
        checkSpecifiedProperty("selno1");
        return convertEmptyToNull(_selno1);
    }

    /**
     * [set] SELNO1: {varchar(30)} <br>
     * 封印Ｎｏ.（１）
     * @param selno1 The value of the column 'SELNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelno1(String selno1) {
        registerModifiedProperty("selno1");
        _selno1 = selno1;
    }

    /**
     * [get] SELNO2: {varchar(30)} <br>
     * 封印Ｎｏ.（２）
     * @return The value of the column 'SELNO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSelno2() {
        checkSpecifiedProperty("selno2");
        return convertEmptyToNull(_selno2);
    }

    /**
     * [set] SELNO2: {varchar(30)} <br>
     * 封印Ｎｏ.（２）
     * @param selno2 The value of the column 'SELNO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelno2(String selno2) {
        registerModifiedProperty("selno2");
        _selno2 = selno2;
    }

    /**
     * [get] SELNO3: {varchar(30)} <br>
     * 封印Ｎｏ.（３）
     * @return The value of the column 'SELNO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSelno3() {
        checkSpecifiedProperty("selno3");
        return convertEmptyToNull(_selno3);
    }

    /**
     * [set] SELNO3: {varchar(30)} <br>
     * 封印Ｎｏ.（３）
     * @param selno3 The value of the column 'SELNO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelno3(String selno3) {
        registerModifiedProperty("selno3");
        _selno3 = selno3;
    }

    /**
     * [get] TRANNM: {varchar(60)} <br>
     * 運輸業社名
     * @return The value of the column 'TRANNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrannm() {
        checkSpecifiedProperty("trannm");
        return convertEmptyToNull(_trannm);
    }

    /**
     * [set] TRANNM: {varchar(60)} <br>
     * 運輸業社名
     * @param trannm The value of the column 'TRANNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrannm(String trannm) {
        registerModifiedProperty("trannm");
        _trannm = trannm;
    }

    /**
     * [get] CHGID: {char(1)} <br>
     * 変更区分
     * @return The value of the column 'CHGID'. (NullAllowed even if selected: for no constraint)
     */
    public String getChgid() {
        checkSpecifiedProperty("chgid");
        return convertEmptyToNull(_chgid);
    }

    /**
     * [set] CHGID: {char(1)} <br>
     * 変更区分
     * @param chgid The value of the column 'CHGID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChgid(String chgid) {
        registerModifiedProperty("chgid");
        _chgid = chgid;
    }

    /**
     * [get] TDRELAYID: {char(1)} <br>
     * ＴＤ中継区分
     * @return The value of the column 'TDRELAYID'. (NullAllowed even if selected: for no constraint)
     */
    public String getTdrelayid() {
        checkSpecifiedProperty("tdrelayid");
        return convertEmptyToNull(_tdrelayid);
    }

    /**
     * [set] TDRELAYID: {char(1)} <br>
     * ＴＤ中継区分
     * @param tdrelayid The value of the column 'TDRELAYID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdrelayid(String tdrelayid) {
        registerModifiedProperty("tdrelayid");
        _tdrelayid = tdrelayid;
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
