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
 * The entity of T_CSRSTINF as TABLE. <br>
 * 仕分統計情報
 * <pre>
 * [primary-key]
 *     SORT_STATISTICS_INFO_ID
 *
 * [column]
 *     SORT_STATISTICS_INFO_ID, ZZORGNCD, SROPRTYMD, SROPRTCNT, LINBLK, DLVYMD, DPCD, DED, PSTNID, SRLINCD, SRRNK, SRPAT, TTBRQA, SHPQA, SPRQASFTPCL, SPRQATSNBOX, SPRQAJTBOX, SPRQA100BOX, SPRQAHL, SPRQAFUL, SPRQAHLBGBOX, SPRQAHL12BOX, SPRQAHL5BOX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_STATISTICS_INFO_ID
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
 * Long sortStatisticsInfoId = entity.getSortStatisticsInfoId();
 * String zzorgncd = entity.getZzorgncd();
 * String sroprtymd = entity.getSroprtymd();
 * Long sroprtcnt = entity.getSroprtcnt();
 * String linblk = entity.getLinblk();
 * String dlvymd = entity.getDlvymd();
 * String dpcd = entity.getDpcd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String srlincd = entity.getSrlincd();
 * Long srrnk = entity.getSrrnk();
 * Long srpat = entity.getSrpat();
 * Long ttbrqa = entity.getTtbrqa();
 * Long shpqa = entity.getShpqa();
 * Long sprqasftpcl = entity.getSprqasftpcl();
 * Long sprqatsnbox = entity.getSprqatsnbox();
 * Long sprqajtbox = entity.getSprqajtbox();
 * Long sprqa100box = entity.getSprqa100box();
 * Long sprqahl = entity.getSprqahl();
 * Long sprqaful = entity.getSprqaful();
 * Long sprqahlbgbox = entity.getSprqahlbgbox();
 * Long sprqahl12box = entity.getSprqahl12box();
 * Long sprqahl5box = entity.getSprqahl5box();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSortStatisticsInfoId(sortStatisticsInfoId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setSroprtymd(sroprtymd);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setLinblk(linblk);
 * entity.setDlvymd(dlvymd);
 * entity.setDpcd(dpcd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setSrlincd(srlincd);
 * entity.setSrrnk(srrnk);
 * entity.setSrpat(srpat);
 * entity.setTtbrqa(ttbrqa);
 * entity.setShpqa(shpqa);
 * entity.setSprqasftpcl(sprqasftpcl);
 * entity.setSprqatsnbox(sprqatsnbox);
 * entity.setSprqajtbox(sprqajtbox);
 * entity.setSprqa100box(sprqa100box);
 * entity.setSprqahl(sprqahl);
 * entity.setSprqaful(sprqaful);
 * entity.setSprqahlbgbox(sprqahlbgbox);
 * entity.setSprqahl12box(sprqahl12box);
 * entity.setSprqahl5box(sprqahl5box);
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
public abstract class BsTCsrstinf extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sortStatisticsInfoId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** SROPRTYMD: {NotNull, varchar(8)} */
    protected String _sroprtymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    protected Long _sroprtcnt;

    /** LINBLK: {NotNull, varchar(30)} */
    protected String _linblk;

    /** DLVYMD: {NotNull, varchar(8)} */
    protected String _dlvymd;

    /** DPCD: {NotNull, varchar(30)} */
    protected String _dpcd;

    /** DED: {NotNull, varchar(30)} */
    protected String _ded;

    /** PSTNID: {NotNull, varchar(30)} */
    protected String _pstnid;

    /** SRLINCD: {varchar(30)} */
    protected String _srlincd;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** SRPAT: {bigint(19)} */
    protected Long _srpat;

    /** TTBRQA: {bigint(19)} */
    protected Long _ttbrqa;

    /** SHPQA: {bigint(19)} */
    protected Long _shpqa;

    /** SPRQASFTPCL: {bigint(19)} */
    protected Long _sprqasftpcl;

    /** SPRQATSNBOX: {bigint(19)} */
    protected Long _sprqatsnbox;

    /** SPRQAJTBOX: {bigint(19)} */
    protected Long _sprqajtbox;

    /** SPRQA100BOX: {bigint(19)} */
    protected Long _sprqa100box;

    /** SPRQAHL: {bigint(19)} */
    protected Long _sprqahl;

    /** SPRQAFUL: {bigint(19)} */
    protected Long _sprqaful;

    /** SPRQAHLBGBOX: {bigint(19), default=[(0)]} */
    protected Long _sprqahlbgbox;

    /** SPRQAHL12BOX: {bigint(19), default=[(0)]} */
    protected Long _sprqahl12box;

    /** SPRQAHL5BOX: {bigint(19), default=[(0)]} */
    protected Long _sprqahl5box;

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
        return "T_CSRSTINF";
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
        if (_sortStatisticsInfoId == null) { return false; }
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
        if (obj instanceof BsTCsrstinf) {
            BsTCsrstinf other = (BsTCsrstinf)obj;
            if (!xSV(_sortStatisticsInfoId, other._sortStatisticsInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sortStatisticsInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sortStatisticsInfoId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_sroprtymd));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_srlincd));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_srpat));
        sb.append(dm).append(xfND(_ttbrqa));
        sb.append(dm).append(xfND(_shpqa));
        sb.append(dm).append(xfND(_sprqasftpcl));
        sb.append(dm).append(xfND(_sprqatsnbox));
        sb.append(dm).append(xfND(_sprqajtbox));
        sb.append(dm).append(xfND(_sprqa100box));
        sb.append(dm).append(xfND(_sprqahl));
        sb.append(dm).append(xfND(_sprqaful));
        sb.append(dm).append(xfND(_sprqahlbgbox));
        sb.append(dm).append(xfND(_sprqahl12box));
        sb.append(dm).append(xfND(_sprqahl5box));
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
    public TCsrstinf clone() {
        return (TCsrstinf)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分統計情報ID
     * @return The value of the column 'SORT_STATISTICS_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortStatisticsInfoId() {
        checkSpecifiedProperty("sortStatisticsInfoId");
        return _sortStatisticsInfoId;
    }

    /**
     * [set] SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分統計情報ID
     * @param sortStatisticsInfoId The value of the column 'SORT_STATISTICS_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSortStatisticsInfoId(Long sortStatisticsInfoId) {
        registerModifiedProperty("sortStatisticsInfoId");
        _sortStatisticsInfoId = sortStatisticsInfoId;
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
     * [get] SROPRTYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日
     * @return The value of the column 'SROPRTYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getSroprtymd() {
        checkSpecifiedProperty("sroprtymd");
        return convertEmptyToNull(_sroprtymd);
    }

    /**
     * [set] SROPRTYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日
     * @param sroprtymd The value of the column 'SROPRTYMD'. (basically NotNull if update: for the constraint)
     */
    public void setSroprtymd(String sroprtymd) {
        registerModifiedProperty("sroprtymd");
        _sroprtymd = sroprtymd;
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
     * [get] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (basically NotNull if selected: for the constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (basically NotNull if update: for the constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
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
     * [get] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (basically NotNull if selected: for the constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (basically NotNull if update: for the constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (basically NotNull if selected: for the constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (basically NotNull if update: for the constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrlincd() {
        checkSpecifiedProperty("srlincd");
        return convertEmptyToNull(_srlincd);
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrlincd(String srlincd) {
        registerModifiedProperty("srlincd");
        _srlincd = srlincd;
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
     * [get] SRPAT: {bigint(19)} <br>
     * 仕分物量
     * @return The value of the column 'SRPAT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrpat() {
        checkSpecifiedProperty("srpat");
        return _srpat;
    }

    /**
     * [set] SRPAT: {bigint(19)} <br>
     * 仕分物量
     * @param srpat The value of the column 'SRPAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrpat(Long srpat) {
        registerModifiedProperty("srpat");
        _srpat = srpat;
    }

    /**
     * [get] TTBRQA: {bigint(19)} <br>
     * 延銘柄数
     * @return The value of the column 'TTBRQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTtbrqa() {
        checkSpecifiedProperty("ttbrqa");
        return _ttbrqa;
    }

    /**
     * [set] TTBRQA: {bigint(19)} <br>
     * 延銘柄数
     * @param ttbrqa The value of the column 'TTBRQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTtbrqa(Long ttbrqa) {
        registerModifiedProperty("ttbrqa");
        _ttbrqa = ttbrqa;
    }

    /**
     * [get] SHPQA: {bigint(19)} <br>
     * 店数
     * @return The value of the column 'SHPQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShpqa() {
        checkSpecifiedProperty("shpqa");
        return _shpqa;
    }

    /**
     * [set] SHPQA: {bigint(19)} <br>
     * 店数
     * @param shpqa The value of the column 'SHPQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShpqa(Long shpqa) {
        registerModifiedProperty("shpqa");
        _shpqa = shpqa;
    }

    /**
     * [get] SPRQASFTPCL: {bigint(19)} <br>
     * 個口数(ソフトパーセル)
     * @return The value of the column 'SPRQASFTPCL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqasftpcl() {
        checkSpecifiedProperty("sprqasftpcl");
        return _sprqasftpcl;
    }

    /**
     * [set] SPRQASFTPCL: {bigint(19)} <br>
     * 個口数(ソフトパーセル)
     * @param sprqasftpcl The value of the column 'SPRQASFTPCL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqasftpcl(Long sprqasftpcl) {
        registerModifiedProperty("sprqasftpcl");
        _sprqasftpcl = sprqasftpcl;
    }

    /**
     * [get] SPRQATSNBOX: {bigint(19)} <br>
     * 個口数(ＴＳＮＢＯＸ)
     * @return The value of the column 'SPRQATSNBOX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqatsnbox() {
        checkSpecifiedProperty("sprqatsnbox");
        return _sprqatsnbox;
    }

    /**
     * [set] SPRQATSNBOX: {bigint(19)} <br>
     * 個口数(ＴＳＮＢＯＸ)
     * @param sprqatsnbox The value of the column 'SPRQATSNBOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqatsnbox(Long sprqatsnbox) {
        registerModifiedProperty("sprqatsnbox");
        _sprqatsnbox = sprqatsnbox;
    }

    /**
     * [get] SPRQAJTBOX: {bigint(19)} <br>
     * 個口数(ＪＴＢＯＸ)
     * @return The value of the column 'SPRQAJTBOX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqajtbox() {
        checkSpecifiedProperty("sprqajtbox");
        return _sprqajtbox;
    }

    /**
     * [set] SPRQAJTBOX: {bigint(19)} <br>
     * 個口数(ＪＴＢＯＸ)
     * @param sprqajtbox The value of the column 'SPRQAJTBOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqajtbox(Long sprqajtbox) {
        registerModifiedProperty("sprqajtbox");
        _sprqajtbox = sprqajtbox;
    }

    /**
     * [get] SPRQA100BOX: {bigint(19)} <br>
     * 個口数(１００ＢＯＸ)
     * @return The value of the column 'SPRQA100BOX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqa100box() {
        checkSpecifiedProperty("sprqa100box");
        return _sprqa100box;
    }

    /**
     * [set] SPRQA100BOX: {bigint(19)} <br>
     * 個口数(１００ＢＯＸ)
     * @param sprqa100box The value of the column 'SPRQA100BOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqa100box(Long sprqa100box) {
        registerModifiedProperty("sprqa100box");
        _sprqa100box = sprqa100box;
    }

    /**
     * [get] SPRQAHL: {bigint(19)} <br>
     * 個口数(半箱Ｆ)
     * @return The value of the column 'SPRQAHL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqahl() {
        checkSpecifiedProperty("sprqahl");
        return _sprqahl;
    }

    /**
     * [set] SPRQAHL: {bigint(19)} <br>
     * 個口数(半箱Ｆ)
     * @param sprqahl The value of the column 'SPRQAHL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqahl(Long sprqahl) {
        registerModifiedProperty("sprqahl");
        _sprqahl = sprqahl;
    }

    /**
     * [get] SPRQAFUL: {bigint(19)} <br>
     * 個口数(丸段)
     * @return The value of the column 'SPRQAFUL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqaful() {
        checkSpecifiedProperty("sprqaful");
        return _sprqaful;
    }

    /**
     * [set] SPRQAFUL: {bigint(19)} <br>
     * 個口数(丸段)
     * @param sprqaful The value of the column 'SPRQAFUL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqaful(Long sprqaful) {
        registerModifiedProperty("sprqaful");
        _sprqaful = sprqaful;
    }

    /**
     * [get] SPRQAHLBGBOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｅ)
     * @return The value of the column 'SPRQAHLBGBOX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqahlbgbox() {
        checkSpecifiedProperty("sprqahlbgbox");
        return _sprqahlbgbox;
    }

    /**
     * [set] SPRQAHLBGBOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｅ)
     * @param sprqahlbgbox The value of the column 'SPRQAHLBGBOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqahlbgbox(Long sprqahlbgbox) {
        registerModifiedProperty("sprqahlbgbox");
        _sprqahlbgbox = sprqahlbgbox;
    }

    /**
     * [get] SPRQAHL12BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｇ)
     * @return The value of the column 'SPRQAHL12BOX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqahl12box() {
        checkSpecifiedProperty("sprqahl12box");
        return _sprqahl12box;
    }

    /**
     * [set] SPRQAHL12BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｇ)
     * @param sprqahl12box The value of the column 'SPRQAHL12BOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqahl12box(Long sprqahl12box) {
        registerModifiedProperty("sprqahl12box");
        _sprqahl12box = sprqahl12box;
    }

    /**
     * [get] SPRQAHL5BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｈ)
     * @return The value of the column 'SPRQAHL5BOX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSprqahl5box() {
        checkSpecifiedProperty("sprqahl5box");
        return _sprqahl5box;
    }

    /**
     * [set] SPRQAHL5BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｈ)
     * @param sprqahl5box The value of the column 'SPRQAHL5BOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprqahl5box(Long sprqahl5box) {
        registerModifiedProperty("sprqahl5box");
        _sprqahl5box = sprqahl5box;
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