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
 * The entity of T_CDRCATTSR as TABLE. <br>
 * 方面属性（仕分処理用）
 * <pre>
 * [primary-key]
 *     HOUMEN_SORT_ID
 *
 * [column]
 *     HOUMEN_SORT_ID, ZZORGNCD, DPCD, DLVYMD, DRCCD, ZZPSTNID, SRLIN, SRRNK, SNMPRTRNKAD, SRWKDY, COMT, SPRPRSID, ODDVID, HDRDBXUSID, SROPRTCNT, IOID, WRKMFG, IKEIINCLDFLG, SORT_DATE, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_SORT_ID
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
 * Long houmenSortId = entity.getHoumenSortId();
 * String zzorgncd = entity.getZzorgncd();
 * String dpcd = entity.getDpcd();
 * String dlvymd = entity.getDlvymd();
 * String drccd = entity.getDrccd();
 * String zzpstnid = entity.getZzpstnid();
 * String srlin = entity.getSrlin();
 * Long srrnk = entity.getSrrnk();
 * String snmprtrnkad = entity.getSnmprtrnkad();
 * java.math.BigDecimal srwkdy = entity.getSrwkdy();
 * String comt = entity.getComt();
 * String sprprsid = entity.getSprprsid();
 * String oddvid = entity.getOddvid();
 * String hdrdbxusid = entity.getHdrdbxusid();
 * Long sroprtcnt = entity.getSroprtcnt();
 * String ioid = entity.getIoid();
 * String wrkmfg = entity.getWrkmfg();
 * String ikeiincldflg = entity.getIkeiincldflg();
 * String sortDate = entity.getSortDate();
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
 * entity.setHoumenSortId(houmenSortId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setDpcd(dpcd);
 * entity.setDlvymd(dlvymd);
 * entity.setDrccd(drccd);
 * entity.setZzpstnid(zzpstnid);
 * entity.setSrlin(srlin);
 * entity.setSrrnk(srrnk);
 * entity.setSnmprtrnkad(snmprtrnkad);
 * entity.setSrwkdy(srwkdy);
 * entity.setComt(comt);
 * entity.setSprprsid(sprprsid);
 * entity.setOddvid(oddvid);
 * entity.setHdrdbxusid(hdrdbxusid);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setIoid(ioid);
 * entity.setWrkmfg(wrkmfg);
 * entity.setIkeiincldflg(ikeiincldflg);
 * entity.setSortDate(sortDate);
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
public abstract class BsTCdrcattsr extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** HOUMEN_SORT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _houmenSortId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** DPCD: {NotNull, varchar(30)} */
    protected String _dpcd;

    /** DLVYMD: {NotNull, varchar(8)} */
    protected String _dlvymd;

    /** DRCCD: {NotNull, varchar(30)} */
    protected String _drccd;

    /** ZZPSTNID: {NotNull, varchar(30)} */
    protected String _zzpstnid;

    /** SRLIN: {varchar(30)} */
    protected String _srlin;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** SNMPRTRNKAD: {char(1)} */
    protected String _snmprtrnkad;

    /** SRWKDY: {decimal(16, 6)} */
    protected java.math.BigDecimal _srwkdy;

    /** COMT: {varchar(60)} */
    protected String _comt;

    /** SPRPRSID: {char(1)} */
    protected String _sprprsid;

    /** ODDVID: {char(1)} */
    protected String _oddvid;

    /** HDRDBXUSID: {char(1)} */
    protected String _hdrdbxusid;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    protected Long _sroprtcnt;

    /** IOID: {NotNull, char(1)} */
    protected String _ioid;

    /** WRKMFG: {NotNull, char(1)} */
    protected String _wrkmfg;

    /** IKEIINCLDFLG: {char(1), default=[0]} */
    protected String _ikeiincldflg;

    /** SORT_DATE: {varchar(8)} */
    protected String _sortDate;

    /** CENTER_ID: {NotNull, bigint(19)} */
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
        return "T_CDRCATTSR";
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
        if (_houmenSortId == null) { return false; }
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
        if (obj instanceof BsTCdrcattsr) {
            BsTCdrcattsr other = (BsTCdrcattsr)obj;
            if (!xSV(_houmenSortId, other._houmenSortId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _houmenSortId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_houmenSortId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_drccd));
        sb.append(dm).append(xfND(_zzpstnid));
        sb.append(dm).append(xfND(_srlin));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_snmprtrnkad));
        sb.append(dm).append(xfND(_srwkdy));
        sb.append(dm).append(xfND(_comt));
        sb.append(dm).append(xfND(_sprprsid));
        sb.append(dm).append(xfND(_oddvid));
        sb.append(dm).append(xfND(_hdrdbxusid));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_ioid));
        sb.append(dm).append(xfND(_wrkmfg));
        sb.append(dm).append(xfND(_ikeiincldflg));
        sb.append(dm).append(xfND(_sortDate));
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
        return "";
    }

    @Override
    public TCdrcattsr clone() {
        return (TCdrcattsr)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HOUMEN_SORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性(仕分処理用)ID
     * @return The value of the column 'HOUMEN_SORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getHoumenSortId() {
        checkSpecifiedProperty("houmenSortId");
        return _houmenSortId;
    }

    /**
     * [set] HOUMEN_SORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性(仕分処理用)ID
     * @param houmenSortId The value of the column 'HOUMEN_SORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setHoumenSortId(Long houmenSortId) {
        registerModifiedProperty("houmenSortId");
        _houmenSortId = houmenSortId;
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
     * [get] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (basically NotNull if update: for the constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getDlvymd() {
        checkSpecifiedProperty("dlvymd");
        return convertEmptyToNull(_dlvymd);
    }

    /**
     * [set] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (basically NotNull if update: for the constraint)
     */
    public void setDlvymd(String dlvymd) {
        registerModifiedProperty("dlvymd");
        _dlvymd = dlvymd;
    }

    /**
     * [get] DRCCD: {NotNull, varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DRCCD'. (basically NotNull if selected: for the constraint)
     */
    public String getDrccd() {
        checkSpecifiedProperty("drccd");
        return convertEmptyToNull(_drccd);
    }

    /**
     * [set] DRCCD: {NotNull, varchar(30)} <br>
     * 方面CD
     * @param drccd The value of the column 'DRCCD'. (basically NotNull if update: for the constraint)
     */
    public void setDrccd(String drccd) {
        registerModifiedProperty("drccd");
        _drccd = drccd;
    }

    /**
     * [get] ZZPSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'ZZPSTNID'. (basically NotNull if selected: for the constraint)
     */
    public String getZzpstnid() {
        checkSpecifiedProperty("zzpstnid");
        return convertEmptyToNull(_zzpstnid);
    }

    /**
     * [set] ZZPSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param zzpstnid The value of the column 'ZZPSTNID'. (basically NotNull if update: for the constraint)
     */
    public void setZzpstnid(String zzpstnid) {
        registerModifiedProperty("zzpstnid");
        _zzpstnid = zzpstnid;
    }

    /**
     * [get] SRLIN: {varchar(30)} <br>
     * 仕分ライン
     * @return The value of the column 'SRLIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrlin() {
        checkSpecifiedProperty("srlin");
        return convertEmptyToNull(_srlin);
    }

    /**
     * [set] SRLIN: {varchar(30)} <br>
     * 仕分ライン
     * @param srlin The value of the column 'SRLIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrlin(String srlin) {
        registerModifiedProperty("srlin");
        _srlin = srlin;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrrnk() {
        checkSpecifiedProperty("srrnk");
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrrnk(Long srrnk) {
        registerModifiedProperty("srrnk");
        _srrnk = srrnk;
    }

    /**
     * [get] SNMPRTRNKAD: {char(1)} <br>
     * 通番印刷順（昇順／降順）
     * @return The value of the column 'SNMPRTRNKAD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnmprtrnkad() {
        checkSpecifiedProperty("snmprtrnkad");
        return convertEmptyToNull(_snmprtrnkad);
    }

    /**
     * [set] SNMPRTRNKAD: {char(1)} <br>
     * 通番印刷順（昇順／降順）
     * @param snmprtrnkad The value of the column 'SNMPRTRNKAD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnmprtrnkad(String snmprtrnkad) {
        registerModifiedProperty("snmprtrnkad");
        _snmprtrnkad = snmprtrnkad;
    }

    /**
     * [get] SRWKDY: {decimal(16, 6)} <br>
     * 仕分曜日
     * @return The value of the column 'SRWKDY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSrwkdy() {
        checkSpecifiedProperty("srwkdy");
        return _srwkdy;
    }

    /**
     * [set] SRWKDY: {decimal(16, 6)} <br>
     * 仕分曜日
     * @param srwkdy The value of the column 'SRWKDY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrwkdy(java.math.BigDecimal srwkdy) {
        registerModifiedProperty("srwkdy");
        _srwkdy = srwkdy;
    }

    /**
     * [get] COMT: {varchar(60)} <br>
     * コメント
     * @return The value of the column 'COMT'. (NullAllowed even if selected: for no constraint)
     */
    public String getComt() {
        checkSpecifiedProperty("comt");
        return convertEmptyToNull(_comt);
    }

    /**
     * [set] COMT: {varchar(60)} <br>
     * コメント
     * @param comt The value of the column 'COMT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComt(String comt) {
        registerModifiedProperty("comt");
        _comt = comt;
    }

    /**
     * [get] SPRPRSID: {char(1)} <br>
     * 個口圧縮区分
     * @return The value of the column 'SPRPRSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSprprsid() {
        checkSpecifiedProperty("sprprsid");
        return convertEmptyToNull(_sprprsid);
    }

    /**
     * [set] SPRPRSID: {char(1)} <br>
     * 個口圧縮区分
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprprsid(String sprprsid) {
        registerModifiedProperty("sprprsid");
        _sprprsid = sprprsid;
    }

    /**
     * [get] ODDVID: {char(1)} <br>
     * オーダー分割区分
     * @return The value of the column 'ODDVID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOddvid() {
        checkSpecifiedProperty("oddvid");
        return convertEmptyToNull(_oddvid);
    }

    /**
     * [set] ODDVID: {char(1)} <br>
     * オーダー分割区分
     * @param oddvid The value of the column 'ODDVID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOddvid(String oddvid) {
        registerModifiedProperty("oddvid");
        _oddvid = oddvid;
    }

    /**
     * [get] HDRDBXUSID: {char(1)} <br>
     * １００箱使用区分
     * @return The value of the column 'HDRDBXUSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdbxusid() {
        checkSpecifiedProperty("hdrdbxusid");
        return convertEmptyToNull(_hdrdbxusid);
    }

    /**
     * [set] HDRDBXUSID: {char(1)} <br>
     * １００箱使用区分
     * @param hdrdbxusid The value of the column 'HDRDBXUSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdbxusid(String hdrdbxusid) {
        registerModifiedProperty("hdrdbxusid");
        _hdrdbxusid = hdrdbxusid;
    }

    /**
     * [get] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (basically NotNull if selected: for the constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (basically NotNull if update: for the constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] IOID: {NotNull, char(1)} <br>
     * 内外区分
     * @return The value of the column 'IOID'. (basically NotNull if selected: for the constraint)
     */
    public String getIoid() {
        checkSpecifiedProperty("ioid");
        return convertEmptyToNull(_ioid);
    }

    /**
     * [set] IOID: {NotNull, char(1)} <br>
     * 内外区分
     * @param ioid The value of the column 'IOID'. (basically NotNull if update: for the constraint)
     */
    public void setIoid(String ioid) {
        registerModifiedProperty("ioid");
        _ioid = ioid;
    }

    /**
     * [get] WRKMFG: {NotNull, char(1)} <br>
     * 割込フラグ
     * @return The value of the column 'WRKMFG'. (basically NotNull if selected: for the constraint)
     */
    public String getWrkmfg() {
        checkSpecifiedProperty("wrkmfg");
        return convertEmptyToNull(_wrkmfg);
    }

    /**
     * [set] WRKMFG: {NotNull, char(1)} <br>
     * 割込フラグ
     * @param wrkmfg The value of the column 'WRKMFG'. (basically NotNull if update: for the constraint)
     */
    public void setWrkmfg(String wrkmfg) {
        registerModifiedProperty("wrkmfg");
        _wrkmfg = wrkmfg;
    }

    /**
     * [get] IKEIINCLDFLG: {char(1), default=[0]} <br>
     * 異型品同梱フラグ
     * @return The value of the column 'IKEIINCLDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getIkeiincldflg() {
        checkSpecifiedProperty("ikeiincldflg");
        return convertEmptyToNull(_ikeiincldflg);
    }

    /**
     * [set] IKEIINCLDFLG: {char(1), default=[0]} <br>
     * 異型品同梱フラグ
     * @param ikeiincldflg The value of the column 'IKEIINCLDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIkeiincldflg(String ikeiincldflg) {
        registerModifiedProperty("ikeiincldflg");
        _ikeiincldflg = ikeiincldflg;
    }

    /**
     * [get] SORT_DATE: {varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SORT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortDate() {
        checkSpecifiedProperty("sortDate");
        return convertEmptyToNull(_sortDate);
    }

    /**
     * [set] SORT_DATE: {varchar(8)} <br>
     * 仕分作業日付
     * @param sortDate The value of the column 'SORT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortDate(String sortDate) {
        registerModifiedProperty("sortDate");
        _sortDate = sortDate;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
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
