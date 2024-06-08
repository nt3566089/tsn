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
 * The entity of M_CBLK as TABLE. <br>
 * ブロックマスタ
 * <pre>
 * [primary-key]
 *     CBLK_ID
 *
 * [column]
 *     CBLK_ID, CENTER_ID, BLKCD, BLKNM, SRDTLMKFG, AMINPFG, LBLMKFG, LBLDFG, BCDDFG, LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SFTPCLRSFID, TSNBOXRSFID, JTBOXRSFID, HDRDBOXRSFID, ODRDVRSFID, PKGRT, SPRPRSID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CBLK_ID
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
 * Long cblkId = entity.getCblkId();
 * Long centerId = entity.getCenterId();
 * String blkcd = entity.getBlkcd();
 * String blknm = entity.getBlknm();
 * String srdtlmkfg = entity.getSrdtlmkfg();
 * String aminpfg = entity.getAminpfg();
 * String lblmkfg = entity.getLblmkfg();
 * String lbldfg = entity.getLbldfg();
 * String bcddfg = entity.getBcddfg();
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
 * String sftpclrsfid = entity.getSftpclrsfid();
 * String tsnboxrsfid = entity.getTsnboxrsfid();
 * String jtboxrsfid = entity.getJtboxrsfid();
 * String hdrdboxrsfid = entity.getHdrdboxrsfid();
 * String odrdvrsfid = entity.getOdrdvrsfid();
 * Long pkgrt = entity.getPkgrt();
 * String sprprsid = entity.getSprprsid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCblkId(cblkId);
 * entity.setCenterId(centerId);
 * entity.setBlkcd(blkcd);
 * entity.setBlknm(blknm);
 * entity.setSrdtlmkfg(srdtlmkfg);
 * entity.setAminpfg(aminpfg);
 * entity.setLblmkfg(lblmkfg);
 * entity.setLbldfg(lbldfg);
 * entity.setBcddfg(bcddfg);
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
 * entity.setSftpclrsfid(sftpclrsfid);
 * entity.setTsnboxrsfid(tsnboxrsfid);
 * entity.setJtboxrsfid(jtboxrsfid);
 * entity.setHdrdboxrsfid(hdrdboxrsfid);
 * entity.setOdrdvrsfid(odrdvrsfid);
 * entity.setPkgrt(pkgrt);
 * entity.setSprprsid(sprprsid);
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
public abstract class BsMCblk extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CBLK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _cblkId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** BLKCD: {NotNull, varchar(30)} */
    protected String _blkcd;

    /** BLKNM: {varchar(30)} */
    protected String _blknm;

    /** SRDTLMKFG: {char(1)} */
    protected String _srdtlmkfg;

    /** AMINPFG: {char(1)} */
    protected String _aminpfg;

    /** LBLMKFG: {char(1)} */
    protected String _lblmkfg;

    /** LBLDFG: {char(1)} */
    protected String _lbldfg;

    /** BCDDFG: {char(1)} */
    protected String _bcddfg;

    /** LOCIDFRNK: {char(1)} */
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

    /** SFTPCLRSFID: {char(1)} */
    protected String _sftpclrsfid;

    /** TSNBOXRSFID: {char(1)} */
    protected String _tsnboxrsfid;

    /** JTBOXRSFID: {char(1)} */
    protected String _jtboxrsfid;

    /** HDRDBOXRSFID: {char(1)} */
    protected String _hdrdboxrsfid;

    /** ODRDVRSFID: {char(1)} */
    protected String _odrdvrsfid;

    /** PKGRT: {bigint(19)} */
    protected Long _pkgrt;

    /** SPRPRSID: {varchar(30)} */
    protected String _sprprsid;

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
        return "M_CBLK";
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
        if (_cblkId == null) { return false; }
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
        if (obj instanceof BsMCblk) {
            BsMCblk other = (BsMCblk)obj;
            if (!xSV(_cblkId, other._cblkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cblkId);
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
        sb.append(dm).append(xfND(_cblkId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_blkcd));
        sb.append(dm).append(xfND(_blknm));
        sb.append(dm).append(xfND(_srdtlmkfg));
        sb.append(dm).append(xfND(_aminpfg));
        sb.append(dm).append(xfND(_lblmkfg));
        sb.append(dm).append(xfND(_lbldfg));
        sb.append(dm).append(xfND(_bcddfg));
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
        sb.append(dm).append(xfND(_sftpclrsfid));
        sb.append(dm).append(xfND(_tsnboxrsfid));
        sb.append(dm).append(xfND(_jtboxrsfid));
        sb.append(dm).append(xfND(_hdrdboxrsfid));
        sb.append(dm).append(xfND(_odrdvrsfid));
        sb.append(dm).append(xfND(_pkgrt));
        sb.append(dm).append(xfND(_sprprsid));
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
    public MCblk clone() {
        return (MCblk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CBLK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ブロックID
     * @return The value of the column 'CBLK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCblkId() {
        checkSpecifiedProperty("cblkId");
        return _cblkId;
    }

    /**
     * [set] CBLK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ブロックID
     * @param cblkId The value of the column 'CBLK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCblkId(Long cblkId) {
        registerModifiedProperty("cblkId");
        _cblkId = cblkId;
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
     * [get] BLKCD: {NotNull, varchar(30)} <br>
     * ブロックCD
     * @return The value of the column 'BLKCD'. (basically NotNull if selected: for the constraint)
     */
    public String getBlkcd() {
        checkSpecifiedProperty("blkcd");
        return convertEmptyToNull(_blkcd);
    }

    /**
     * [set] BLKCD: {NotNull, varchar(30)} <br>
     * ブロックCD
     * @param blkcd The value of the column 'BLKCD'. (basically NotNull if update: for the constraint)
     */
    public void setBlkcd(String blkcd) {
        registerModifiedProperty("blkcd");
        _blkcd = blkcd;
    }

    /**
     * [get] BLKNM: {varchar(30)} <br>
     * ブロック名称
     * @return The value of the column 'BLKNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlknm() {
        checkSpecifiedProperty("blknm");
        return convertEmptyToNull(_blknm);
    }

    /**
     * [set] BLKNM: {varchar(30)} <br>
     * ブロック名称
     * @param blknm The value of the column 'BLKNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlknm(String blknm) {
        registerModifiedProperty("blknm");
        _blknm = blknm;
    }

    /**
     * [get] SRDTLMKFG: {char(1)} <br>
     * 仕分明細書作成フラグ
     * @return The value of the column 'SRDTLMKFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrdtlmkfg() {
        checkSpecifiedProperty("srdtlmkfg");
        return convertEmptyToNull(_srdtlmkfg);
    }

    /**
     * [set] SRDTLMKFG: {char(1)} <br>
     * 仕分明細書作成フラグ
     * @param srdtlmkfg The value of the column 'SRDTLMKFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrdtlmkfg(String srdtlmkfg) {
        registerModifiedProperty("srdtlmkfg");
        _srdtlmkfg = srdtlmkfg;
    }

    /**
     * [get] AMINPFG: {char(1)} <br>
     * 実績入力フラグ
     * @return The value of the column 'AMINPFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAminpfg() {
        checkSpecifiedProperty("aminpfg");
        return convertEmptyToNull(_aminpfg);
    }

    /**
     * [set] AMINPFG: {char(1)} <br>
     * 実績入力フラグ
     * @param aminpfg The value of the column 'AMINPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAminpfg(String aminpfg) {
        registerModifiedProperty("aminpfg");
        _aminpfg = aminpfg;
    }

    /**
     * [get] LBLMKFG: {char(1)} <br>
     * ラベル作成フラグ
     * @return The value of the column 'LBLMKFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLblmkfg() {
        checkSpecifiedProperty("lblmkfg");
        return convertEmptyToNull(_lblmkfg);
    }

    /**
     * [set] LBLMKFG: {char(1)} <br>
     * ラベル作成フラグ
     * @param lblmkfg The value of the column 'LBLMKFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLblmkfg(String lblmkfg) {
        registerModifiedProperty("lblmkfg");
        _lblmkfg = lblmkfg;
    }

    /**
     * [get] LBLDFG: {char(1)} <br>
     * ラベル個口数表示フラグ
     * @return The value of the column 'LBLDFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLbldfg() {
        checkSpecifiedProperty("lbldfg");
        return convertEmptyToNull(_lbldfg);
    }

    /**
     * [set] LBLDFG: {char(1)} <br>
     * ラベル個口数表示フラグ
     * @param lbldfg The value of the column 'LBLDFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbldfg(String lbldfg) {
        registerModifiedProperty("lbldfg");
        _lbldfg = lbldfg;
    }

    /**
     * [get] BCDDFG: {char(1)} <br>
     * バーコード表示フラグ
     * @return The value of the column 'BCDDFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getBcddfg() {
        checkSpecifiedProperty("bcddfg");
        return convertEmptyToNull(_bcddfg);
    }

    /**
     * [set] BCDDFG: {char(1)} <br>
     * バーコード表示フラグ
     * @param bcddfg The value of the column 'BCDDFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBcddfg(String bcddfg) {
        registerModifiedProperty("bcddfg");
        _bcddfg = bcddfg;
    }

    /**
     * [get] LOCIDFRNK: {char(1)} <br>
     * ロケ不定のロケ貼付順
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocidfrnk() {
        checkSpecifiedProperty("locidfrnk");
        return convertEmptyToNull(_locidfrnk);
    }

    /**
     * [set] LOCIDFRNK: {char(1)} <br>
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
     * [get] SFTPCLRSFID: {char(1)} <br>
     * ソフトパーセル拒否区分
     * @return The value of the column 'SFTPCLRSFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSftpclrsfid() {
        checkSpecifiedProperty("sftpclrsfid");
        return convertEmptyToNull(_sftpclrsfid);
    }

    /**
     * [set] SFTPCLRSFID: {char(1)} <br>
     * ソフトパーセル拒否区分
     * @param sftpclrsfid The value of the column 'SFTPCLRSFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSftpclrsfid(String sftpclrsfid) {
        registerModifiedProperty("sftpclrsfid");
        _sftpclrsfid = sftpclrsfid;
    }

    /**
     * [get] TSNBOXRSFID: {char(1)} <br>
     * ＴＳＮＢＯＸ拒否区分
     * @return The value of the column 'TSNBOXRSFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getTsnboxrsfid() {
        checkSpecifiedProperty("tsnboxrsfid");
        return convertEmptyToNull(_tsnboxrsfid);
    }

    /**
     * [set] TSNBOXRSFID: {char(1)} <br>
     * ＴＳＮＢＯＸ拒否区分
     * @param tsnboxrsfid The value of the column 'TSNBOXRSFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsnboxrsfid(String tsnboxrsfid) {
        registerModifiedProperty("tsnboxrsfid");
        _tsnboxrsfid = tsnboxrsfid;
    }

    /**
     * [get] JTBOXRSFID: {char(1)} <br>
     * ＪＴＢＯＸ拒否区分
     * @return The value of the column 'JTBOXRSFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getJtboxrsfid() {
        checkSpecifiedProperty("jtboxrsfid");
        return convertEmptyToNull(_jtboxrsfid);
    }

    /**
     * [set] JTBOXRSFID: {char(1)} <br>
     * ＪＴＢＯＸ拒否区分
     * @param jtboxrsfid The value of the column 'JTBOXRSFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJtboxrsfid(String jtboxrsfid) {
        registerModifiedProperty("jtboxrsfid");
        _jtboxrsfid = jtboxrsfid;
    }

    /**
     * [get] HDRDBOXRSFID: {char(1)} <br>
     * １００ＢＯＸ拒否区分
     * @return The value of the column 'HDRDBOXRSFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdboxrsfid() {
        checkSpecifiedProperty("hdrdboxrsfid");
        return convertEmptyToNull(_hdrdboxrsfid);
    }

    /**
     * [set] HDRDBOXRSFID: {char(1)} <br>
     * １００ＢＯＸ拒否区分
     * @param hdrdboxrsfid The value of the column 'HDRDBOXRSFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdboxrsfid(String hdrdboxrsfid) {
        registerModifiedProperty("hdrdboxrsfid");
        _hdrdboxrsfid = hdrdboxrsfid;
    }

    /**
     * [get] ODRDVRSFID: {char(1)} <br>
     * オーダー分割拒否区分
     * @return The value of the column 'ODRDVRSFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOdrdvrsfid() {
        checkSpecifiedProperty("odrdvrsfid");
        return convertEmptyToNull(_odrdvrsfid);
    }

    /**
     * [set] ODRDVRSFID: {char(1)} <br>
     * オーダー分割拒否区分
     * @param odrdvrsfid The value of the column 'ODRDVRSFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOdrdvrsfid(String odrdvrsfid) {
        registerModifiedProperty("odrdvrsfid");
        _odrdvrsfid = odrdvrsfid;
    }

    /**
     * [get] PKGRT: {bigint(19)} <br>
     * 梱包率
     * @return The value of the column 'PKGRT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPkgrt() {
        checkSpecifiedProperty("pkgrt");
        return _pkgrt;
    }

    /**
     * [set] PKGRT: {bigint(19)} <br>
     * 梱包率
     * @param pkgrt The value of the column 'PKGRT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPkgrt(Long pkgrt) {
        registerModifiedProperty("pkgrt");
        _pkgrt = pkgrt;
    }

    /**
     * [get] SPRPRSID: {varchar(30)} <br>
     * 個口圧縮区分
     * @return The value of the column 'SPRPRSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSprprsid() {
        checkSpecifiedProperty("sprprsid");
        return convertEmptyToNull(_sprprsid);
    }

    /**
     * [set] SPRPRSID: {varchar(30)} <br>
     * 個口圧縮区分
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprprsid(String sprprsid) {
        registerModifiedProperty("sprprsid");
        _sprprsid = sprprsid;
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
