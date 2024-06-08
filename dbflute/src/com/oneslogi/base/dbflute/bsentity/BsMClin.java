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
 * The entity of M_CLIN as TABLE. <br>
 * ラインマスタ
 * <pre>
 * [primary-key]
 *     CLIN_ID
 *
 * [column]
 *     CLIN_ID, LINCD, LINNM, SPLCTG, LINBLK1, LINBLK2, SFTPCLRSFID, TSNBOXRSFID, JTBOXRSFID, HDRDBOXRSFID, ODRDVRSFID, PKGRT, LINBLK3, SPRPRSID, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIN_ID
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
 * Long clinId = entity.getClinId();
 * String lincd = entity.getLincd();
 * String linnm = entity.getLinnm();
 * String splctg = entity.getSplctg();
 * String linblk1 = entity.getLinblk1();
 * String linblk2 = entity.getLinblk2();
 * String sftpclrsfid = entity.getSftpclrsfid();
 * String tsnboxrsfid = entity.getTsnboxrsfid();
 * String jtboxrsfid = entity.getJtboxrsfid();
 * String hdrdboxrsfid = entity.getHdrdboxrsfid();
 * String odrdvrsfid = entity.getOdrdvrsfid();
 * Long pkgrt = entity.getPkgrt();
 * String linblk3 = entity.getLinblk3();
 * String sprprsid = entity.getSprprsid();
 * Long centerId = entity.getCenterId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setClinId(clinId);
 * entity.setLincd(lincd);
 * entity.setLinnm(linnm);
 * entity.setSplctg(splctg);
 * entity.setLinblk1(linblk1);
 * entity.setLinblk2(linblk2);
 * entity.setSftpclrsfid(sftpclrsfid);
 * entity.setTsnboxrsfid(tsnboxrsfid);
 * entity.setJtboxrsfid(jtboxrsfid);
 * entity.setHdrdboxrsfid(hdrdboxrsfid);
 * entity.setOdrdvrsfid(odrdvrsfid);
 * entity.setPkgrt(pkgrt);
 * entity.setLinblk3(linblk3);
 * entity.setSprprsid(sprprsid);
 * entity.setCenterId(centerId);
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
public abstract class BsMClin extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _clinId;

    /** LINCD: {NotNull, varchar(30)} */
    protected String _lincd;

    /** LINNM: {NotNull, varchar(30)} */
    protected String _linnm;

    /** SPLCTG: {varchar(30)} */
    protected String _splctg;

    /** LINBLK1: {varchar(30)} */
    protected String _linblk1;

    /** LINBLK2: {varchar(30)} */
    protected String _linblk2;

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

    /** LINBLK3: {varchar(30)} */
    protected String _linblk3;

    /** SPRPRSID: {varchar(30)} */
    protected String _sprprsid;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

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
        return "M_CLIN";
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
        if (_clinId == null) { return false; }
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
        if (obj instanceof BsMClin) {
            BsMClin other = (BsMClin)obj;
            if (!xSV(_clinId, other._clinId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clinId);
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
        sb.append(dm).append(xfND(_clinId));
        sb.append(dm).append(xfND(_lincd));
        sb.append(dm).append(xfND(_linnm));
        sb.append(dm).append(xfND(_splctg));
        sb.append(dm).append(xfND(_linblk1));
        sb.append(dm).append(xfND(_linblk2));
        sb.append(dm).append(xfND(_sftpclrsfid));
        sb.append(dm).append(xfND(_tsnboxrsfid));
        sb.append(dm).append(xfND(_jtboxrsfid));
        sb.append(dm).append(xfND(_hdrdboxrsfid));
        sb.append(dm).append(xfND(_odrdvrsfid));
        sb.append(dm).append(xfND(_pkgrt));
        sb.append(dm).append(xfND(_linblk3));
        sb.append(dm).append(xfND(_sprprsid));
        sb.append(dm).append(xfND(_centerId));
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
    public MClin clone() {
        return (MClin)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ラインID
     * @return The value of the column 'CLIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClinId() {
        checkSpecifiedProperty("clinId");
        return _clinId;
    }

    /**
     * [set] CLIN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ラインID
     * @param clinId The value of the column 'CLIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClinId(Long clinId) {
        registerModifiedProperty("clinId");
        _clinId = clinId;
    }

    /**
     * [get] LINCD: {NotNull, varchar(30)} <br>
     * ラインCD
     * @return The value of the column 'LINCD'. (basically NotNull if selected: for the constraint)
     */
    public String getLincd() {
        checkSpecifiedProperty("lincd");
        return convertEmptyToNull(_lincd);
    }

    /**
     * [set] LINCD: {NotNull, varchar(30)} <br>
     * ラインCD
     * @param lincd The value of the column 'LINCD'. (basically NotNull if update: for the constraint)
     */
    public void setLincd(String lincd) {
        registerModifiedProperty("lincd");
        _lincd = lincd;
    }

    /**
     * [get] LINNM: {NotNull, varchar(30)} <br>
     * ライン名称
     * @return The value of the column 'LINNM'. (basically NotNull if selected: for the constraint)
     */
    public String getLinnm() {
        checkSpecifiedProperty("linnm");
        return convertEmptyToNull(_linnm);
    }

    /**
     * [set] LINNM: {NotNull, varchar(30)} <br>
     * ライン名称
     * @param linnm The value of the column 'LINNM'. (basically NotNull if update: for the constraint)
     */
    public void setLinnm(String linnm) {
        registerModifiedProperty("linnm");
        _linnm = linnm;
    }

    /**
     * [get] SPLCTG: {varchar(30)} <br>
     * 補充カテゴリ
     * @return The value of the column 'SPLCTG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplctg() {
        checkSpecifiedProperty("splctg");
        return convertEmptyToNull(_splctg);
    }

    /**
     * [set] SPLCTG: {varchar(30)} <br>
     * 補充カテゴリ
     * @param splctg The value of the column 'SPLCTG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplctg(String splctg) {
        registerModifiedProperty("splctg");
        _splctg = splctg;
    }

    /**
     * [get] LINBLK1: {varchar(30)} <br>
     * ライン対応ブロック(１)
     * @return The value of the column 'LINBLK1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk1() {
        checkSpecifiedProperty("linblk1");
        return convertEmptyToNull(_linblk1);
    }

    /**
     * [set] LINBLK1: {varchar(30)} <br>
     * ライン対応ブロック(１)
     * @param linblk1 The value of the column 'LINBLK1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk1(String linblk1) {
        registerModifiedProperty("linblk1");
        _linblk1 = linblk1;
    }

    /**
     * [get] LINBLK2: {varchar(30)} <br>
     * ライン対応ブロック(２)
     * @return The value of the column 'LINBLK2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk2() {
        checkSpecifiedProperty("linblk2");
        return convertEmptyToNull(_linblk2);
    }

    /**
     * [set] LINBLK2: {varchar(30)} <br>
     * ライン対応ブロック(２)
     * @param linblk2 The value of the column 'LINBLK2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk2(String linblk2) {
        registerModifiedProperty("linblk2");
        _linblk2 = linblk2;
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
     * [get] LINBLK3: {varchar(30)} <br>
     * ライン対応ブロック(３)
     * @return The value of the column 'LINBLK3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk3() {
        checkSpecifiedProperty("linblk3");
        return convertEmptyToNull(_linblk3);
    }

    /**
     * [set] LINBLK3: {varchar(30)} <br>
     * ライン対応ブロック(３)
     * @param linblk3 The value of the column 'LINBLK3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk3(String linblk3) {
        registerModifiedProperty("linblk3");
        _linblk3 = linblk3;
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
