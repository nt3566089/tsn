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
 * The entity of T_CSRWHADM as TABLE. <br>
 * 仕分拠点管理
 * <pre>
 * [primary-key]
 *     SORT_PLACE_MANAGE_ID
 *
 * [column]
 *     SORT_PLACE_MANAGE_ID, CENTER_ID, ZZORGNCD, SRYMD, SROPRTCNT, PRESPLCNT, SRPMTFG, MNTPMTFG, CORDRCVCNT, REFVALUE, SFTPCLMGN, TDAYESRCOMPFG, LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SORTING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_PLACE_MANAGE_ID
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
 * Long sortPlaceManageId = entity.getSortPlaceManageId();
 * Long centerId = entity.getCenterId();
 * String zzorgncd = entity.getZzorgncd();
 * String srymd = entity.getSrymd();
 * Long sroprtcnt = entity.getSroprtcnt();
 * Long presplcnt = entity.getPresplcnt();
 * String srpmtfg = entity.getSrpmtfg();
 * String mntpmtfg = entity.getMntpmtfg();
 * Long cordrcvcnt = entity.getCordrcvcnt();
 * Long refvalue = entity.getRefvalue();
 * Long sftpclmgn = entity.getSftpclmgn();
 * String tdayesrcompfg = entity.getTdayesrcompfg();
 * String locidfrnk = entity.getLocidfrnk();
 * Long locidfbrctg1 = entity.getLocidfbrctg1();
 * Long locidfbrctg2 = entity.getLocidfbrctg2();
 * Long locidfbrctg3 = entity.getLocidfbrctg3();
 * Long locidfbrctg4 = entity.getLocidfbrctg4();
 * Long locidfbrctg5 = entity.getLocidfbrctg5();
 * Long locidfbrctg6 = entity.getLocidfbrctg6();
 * Long locidfbrctg7 = entity.getLocidfbrctg7();
 * Long locidfbrctg8 = entity.getLocidfbrctg8();
 * Long locidfbrctg9 = entity.getLocidfbrctg9();
 * Long locidfbrctg10 = entity.getLocidfbrctg10();
 * String sortingFlg = entity.getSortingFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSortPlaceManageId(sortPlaceManageId);
 * entity.setCenterId(centerId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setSrymd(srymd);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setPresplcnt(presplcnt);
 * entity.setSrpmtfg(srpmtfg);
 * entity.setMntpmtfg(mntpmtfg);
 * entity.setCordrcvcnt(cordrcvcnt);
 * entity.setRefvalue(refvalue);
 * entity.setSftpclmgn(sftpclmgn);
 * entity.setTdayesrcompfg(tdayesrcompfg);
 * entity.setLocidfrnk(locidfrnk);
 * entity.setLocidfbrctg1(locidfbrctg1);
 * entity.setLocidfbrctg2(locidfbrctg2);
 * entity.setLocidfbrctg3(locidfbrctg3);
 * entity.setLocidfbrctg4(locidfbrctg4);
 * entity.setLocidfbrctg5(locidfbrctg5);
 * entity.setLocidfbrctg6(locidfbrctg6);
 * entity.setLocidfbrctg7(locidfbrctg7);
 * entity.setLocidfbrctg8(locidfbrctg8);
 * entity.setLocidfbrctg9(locidfbrctg9);
 * entity.setLocidfbrctg10(locidfbrctg10);
 * entity.setSortingFlg(sortingFlg);
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
public abstract class BsTCsrwhadm extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sortPlaceManageId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** SRYMD: {varchar(8)} */
    protected String _srymd;

    /** SROPRTCNT: {bigint(19)} */
    protected Long _sroprtcnt;

    /** PRESPLCNT: {bigint(19)} */
    protected Long _presplcnt;

    /** SRPMTFG: {char(1)} */
    protected String _srpmtfg;

    /** MNTPMTFG: {char(1)} */
    protected String _mntpmtfg;

    /** CORDRCVCNT: {bigint(19)} */
    protected Long _cordrcvcnt;

    /** REFVALUE: {bigint(19)} */
    protected Long _refvalue;

    /** SFTPCLMGN: {bigint(19)} */
    protected Long _sftpclmgn;

    /** TDAYESRCOMPFG: {char(1)} */
    protected String _tdayesrcompfg;

    /** LOCIDFRNK: {varchar(30)} */
    protected String _locidfrnk;

    /** LOCIDFBRCTG1: {bigint(19)} */
    protected Long _locidfbrctg1;

    /** LOCIDFBRCTG2: {bigint(19)} */
    protected Long _locidfbrctg2;

    /** LOCIDFBRCTG3: {bigint(19)} */
    protected Long _locidfbrctg3;

    /** LOCIDFBRCTG4: {bigint(19)} */
    protected Long _locidfbrctg4;

    /** LOCIDFBRCTG5: {bigint(19)} */
    protected Long _locidfbrctg5;

    /** LOCIDFBRCTG6: {bigint(19)} */
    protected Long _locidfbrctg6;

    /** LOCIDFBRCTG7: {bigint(19)} */
    protected Long _locidfbrctg7;

    /** LOCIDFBRCTG8: {bigint(19)} */
    protected Long _locidfbrctg8;

    /** LOCIDFBRCTG9: {bigint(19)} */
    protected Long _locidfbrctg9;

    /** LOCIDFBRCTG10: {bigint(19)} */
    protected Long _locidfbrctg10;

    /** SORTING_FLG: {char(1)} */
    protected String _sortingFlg;

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
        return "T_CSRWHADM";
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
        if (_sortPlaceManageId == null) { return false; }
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
        if (obj instanceof BsTCsrwhadm) {
            BsTCsrwhadm other = (BsTCsrwhadm)obj;
            if (!xSV(_sortPlaceManageId, other._sortPlaceManageId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sortPlaceManageId);
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
        sb.append(dm).append(xfND(_sortPlaceManageId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_srymd));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_presplcnt));
        sb.append(dm).append(xfND(_srpmtfg));
        sb.append(dm).append(xfND(_mntpmtfg));
        sb.append(dm).append(xfND(_cordrcvcnt));
        sb.append(dm).append(xfND(_refvalue));
        sb.append(dm).append(xfND(_sftpclmgn));
        sb.append(dm).append(xfND(_tdayesrcompfg));
        sb.append(dm).append(xfND(_locidfrnk));
        sb.append(dm).append(xfND(_locidfbrctg1));
        sb.append(dm).append(xfND(_locidfbrctg2));
        sb.append(dm).append(xfND(_locidfbrctg3));
        sb.append(dm).append(xfND(_locidfbrctg4));
        sb.append(dm).append(xfND(_locidfbrctg5));
        sb.append(dm).append(xfND(_locidfbrctg6));
        sb.append(dm).append(xfND(_locidfbrctg7));
        sb.append(dm).append(xfND(_locidfbrctg8));
        sb.append(dm).append(xfND(_locidfbrctg9));
        sb.append(dm).append(xfND(_locidfbrctg10));
        sb.append(dm).append(xfND(_sortingFlg));
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
    public TCsrwhadm clone() {
        return (TCsrwhadm)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分拠点管理ID
     * @return The value of the column 'SORT_PLACE_MANAGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortPlaceManageId() {
        checkSpecifiedProperty("sortPlaceManageId");
        return _sortPlaceManageId;
    }

    /**
     * [set] SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分拠点管理ID
     * @param sortPlaceManageId The value of the column 'SORT_PLACE_MANAGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSortPlaceManageId(Long sortPlaceManageId) {
        registerModifiedProperty("sortPlaceManageId");
        _sortPlaceManageId = sortPlaceManageId;
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
     * [get] SRYMD: {varchar(8)} <br>
     * 仕分日
     * @return The value of the column 'SRYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrymd() {
        checkSpecifiedProperty("srymd");
        return convertEmptyToNull(_srymd);
    }

    /**
     * [set] SRYMD: {varchar(8)} <br>
     * 仕分日
     * @param srymd The value of the column 'SRYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrymd(String srymd) {
        registerModifiedProperty("srymd");
        _srymd = srymd;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] PRESPLCNT: {bigint(19)} <br>
     * 事前補充回数
     * @return The value of the column 'PRESPLCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresplcnt() {
        checkSpecifiedProperty("presplcnt");
        return _presplcnt;
    }

    /**
     * [set] PRESPLCNT: {bigint(19)} <br>
     * 事前補充回数
     * @param presplcnt The value of the column 'PRESPLCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresplcnt(Long presplcnt) {
        registerModifiedProperty("presplcnt");
        _presplcnt = presplcnt;
    }

    /**
     * [get] SRPMTFG: {char(1)} <br>
     * 仕分許可フラグ
     * @return The value of the column 'SRPMTFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrpmtfg() {
        checkSpecifiedProperty("srpmtfg");
        return convertEmptyToNull(_srpmtfg);
    }

    /**
     * [set] SRPMTFG: {char(1)} <br>
     * 仕分許可フラグ
     * @param srpmtfg The value of the column 'SRPMTFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrpmtfg(String srpmtfg) {
        registerModifiedProperty("srpmtfg");
        _srpmtfg = srpmtfg;
    }

    /**
     * [get] MNTPMTFG: {char(1)} <br>
     * メンテナンス許可フラグ
     * @return The value of the column 'MNTPMTFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMntpmtfg() {
        checkSpecifiedProperty("mntpmtfg");
        return convertEmptyToNull(_mntpmtfg);
    }

    /**
     * [set] MNTPMTFG: {char(1)} <br>
     * メンテナンス許可フラグ
     * @param mntpmtfg The value of the column 'MNTPMTFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMntpmtfg(String mntpmtfg) {
        registerModifiedProperty("mntpmtfg");
        _mntpmtfg = mntpmtfg;
    }

    /**
     * [get] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @return The value of the column 'CORDRCVCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCordrcvcnt() {
        checkSpecifiedProperty("cordrcvcnt");
        return _cordrcvcnt;
    }

    /**
     * [set] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @param cordrcvcnt The value of the column 'CORDRCVCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCordrcvcnt(Long cordrcvcnt) {
        registerModifiedProperty("cordrcvcnt");
        _cordrcvcnt = cordrcvcnt;
    }

    /**
     * [get] REFVALUE: {bigint(19)} <br>
     * 基準値
     * @return The value of the column 'REFVALUE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRefvalue() {
        checkSpecifiedProperty("refvalue");
        return _refvalue;
    }

    /**
     * [set] REFVALUE: {bigint(19)} <br>
     * 基準値
     * @param refvalue The value of the column 'REFVALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefvalue(Long refvalue) {
        registerModifiedProperty("refvalue");
        _refvalue = refvalue;
    }

    /**
     * [get] SFTPCLMGN: {bigint(19)} <br>
     * ソフトパーセル係数
     * @return The value of the column 'SFTPCLMGN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSftpclmgn() {
        checkSpecifiedProperty("sftpclmgn");
        return _sftpclmgn;
    }

    /**
     * [set] SFTPCLMGN: {bigint(19)} <br>
     * ソフトパーセル係数
     * @param sftpclmgn The value of the column 'SFTPCLMGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSftpclmgn(Long sftpclmgn) {
        registerModifiedProperty("sftpclmgn");
        _sftpclmgn = sftpclmgn;
    }

    /**
     * [get] TDAYESRCOMPFG: {char(1)} <br>
     * 当日仕分完了フラグ
     * @return The value of the column 'TDAYESRCOMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTdayesrcompfg() {
        checkSpecifiedProperty("tdayesrcompfg");
        return convertEmptyToNull(_tdayesrcompfg);
    }

    /**
     * [set] TDAYESRCOMPFG: {char(1)} <br>
     * 当日仕分完了フラグ
     * @param tdayesrcompfg The value of the column 'TDAYESRCOMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayesrcompfg(String tdayesrcompfg) {
        registerModifiedProperty("tdayesrcompfg");
        _tdayesrcompfg = tdayesrcompfg;
    }

    /**
     * [get] LOCIDFRNK: {varchar(30)} <br>
     * ロケ不定のロケ貼付順
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocidfrnk() {
        checkSpecifiedProperty("locidfrnk");
        return convertEmptyToNull(_locidfrnk);
    }

    /**
     * [set] LOCIDFRNK: {varchar(30)} <br>
     * ロケ不定のロケ貼付順
     * @param locidfrnk The value of the column 'LOCIDFRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfrnk(String locidfrnk) {
        registerModifiedProperty("locidfrnk");
        _locidfrnk = locidfrnk;
    }

    /**
     * [get] LOCIDFBRCTG1: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１)
     * @return The value of the column 'LOCIDFBRCTG1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg1() {
        checkSpecifiedProperty("locidfbrctg1");
        return _locidfbrctg1;
    }

    /**
     * [set] LOCIDFBRCTG1: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１)
     * @param locidfbrctg1 The value of the column 'LOCIDFBRCTG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg1(Long locidfbrctg1) {
        registerModifiedProperty("locidfbrctg1");
        _locidfbrctg1 = locidfbrctg1;
    }

    /**
     * [get] LOCIDFBRCTG2: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(２)
     * @return The value of the column 'LOCIDFBRCTG2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg2() {
        checkSpecifiedProperty("locidfbrctg2");
        return _locidfbrctg2;
    }

    /**
     * [set] LOCIDFBRCTG2: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(２)
     * @param locidfbrctg2 The value of the column 'LOCIDFBRCTG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg2(Long locidfbrctg2) {
        registerModifiedProperty("locidfbrctg2");
        _locidfbrctg2 = locidfbrctg2;
    }

    /**
     * [get] LOCIDFBRCTG3: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(３)
     * @return The value of the column 'LOCIDFBRCTG3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg3() {
        checkSpecifiedProperty("locidfbrctg3");
        return _locidfbrctg3;
    }

    /**
     * [set] LOCIDFBRCTG3: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(３)
     * @param locidfbrctg3 The value of the column 'LOCIDFBRCTG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg3(Long locidfbrctg3) {
        registerModifiedProperty("locidfbrctg3");
        _locidfbrctg3 = locidfbrctg3;
    }

    /**
     * [get] LOCIDFBRCTG4: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(４)
     * @return The value of the column 'LOCIDFBRCTG4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg4() {
        checkSpecifiedProperty("locidfbrctg4");
        return _locidfbrctg4;
    }

    /**
     * [set] LOCIDFBRCTG4: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(４)
     * @param locidfbrctg4 The value of the column 'LOCIDFBRCTG4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg4(Long locidfbrctg4) {
        registerModifiedProperty("locidfbrctg4");
        _locidfbrctg4 = locidfbrctg4;
    }

    /**
     * [get] LOCIDFBRCTG5: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(５)
     * @return The value of the column 'LOCIDFBRCTG5'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg5() {
        checkSpecifiedProperty("locidfbrctg5");
        return _locidfbrctg5;
    }

    /**
     * [set] LOCIDFBRCTG5: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(５)
     * @param locidfbrctg5 The value of the column 'LOCIDFBRCTG5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg5(Long locidfbrctg5) {
        registerModifiedProperty("locidfbrctg5");
        _locidfbrctg5 = locidfbrctg5;
    }

    /**
     * [get] LOCIDFBRCTG6: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(６)
     * @return The value of the column 'LOCIDFBRCTG6'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg6() {
        checkSpecifiedProperty("locidfbrctg6");
        return _locidfbrctg6;
    }

    /**
     * [set] LOCIDFBRCTG6: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(６)
     * @param locidfbrctg6 The value of the column 'LOCIDFBRCTG6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg6(Long locidfbrctg6) {
        registerModifiedProperty("locidfbrctg6");
        _locidfbrctg6 = locidfbrctg6;
    }

    /**
     * [get] LOCIDFBRCTG7: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(７)
     * @return The value of the column 'LOCIDFBRCTG7'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg7() {
        checkSpecifiedProperty("locidfbrctg7");
        return _locidfbrctg7;
    }

    /**
     * [set] LOCIDFBRCTG7: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(７)
     * @param locidfbrctg7 The value of the column 'LOCIDFBRCTG7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg7(Long locidfbrctg7) {
        registerModifiedProperty("locidfbrctg7");
        _locidfbrctg7 = locidfbrctg7;
    }

    /**
     * [get] LOCIDFBRCTG8: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(８)
     * @return The value of the column 'LOCIDFBRCTG8'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg8() {
        checkSpecifiedProperty("locidfbrctg8");
        return _locidfbrctg8;
    }

    /**
     * [set] LOCIDFBRCTG8: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(８)
     * @param locidfbrctg8 The value of the column 'LOCIDFBRCTG8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg8(Long locidfbrctg8) {
        registerModifiedProperty("locidfbrctg8");
        _locidfbrctg8 = locidfbrctg8;
    }

    /**
     * [get] LOCIDFBRCTG9: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(９)
     * @return The value of the column 'LOCIDFBRCTG9'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg9() {
        checkSpecifiedProperty("locidfbrctg9");
        return _locidfbrctg9;
    }

    /**
     * [set] LOCIDFBRCTG9: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(９)
     * @param locidfbrctg9 The value of the column 'LOCIDFBRCTG9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg9(Long locidfbrctg9) {
        registerModifiedProperty("locidfbrctg9");
        _locidfbrctg9 = locidfbrctg9;
    }

    /**
     * [get] LOCIDFBRCTG10: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１０)
     * @return The value of the column 'LOCIDFBRCTG10'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg10() {
        checkSpecifiedProperty("locidfbrctg10");
        return _locidfbrctg10;
    }

    /**
     * [set] LOCIDFBRCTG10: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１０)
     * @param locidfbrctg10 The value of the column 'LOCIDFBRCTG10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg10(Long locidfbrctg10) {
        registerModifiedProperty("locidfbrctg10");
        _locidfbrctg10 = locidfbrctg10;
    }

    /**
     * [get] SORTING_FLG: {char(1)} <br>
     * 仕分中フラグ
     * @return The value of the column 'SORTING_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortingFlg() {
        checkSpecifiedProperty("sortingFlg");
        return convertEmptyToNull(_sortingFlg);
    }

    /**
     * [set] SORTING_FLG: {char(1)} <br>
     * 仕分中フラグ
     * @param sortingFlg The value of the column 'SORTING_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingFlg(String sortingFlg) {
        registerModifiedProperty("sortingFlg");
        _sortingFlg = sortingFlg;
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
