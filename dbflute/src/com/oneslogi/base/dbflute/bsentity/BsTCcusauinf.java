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
 * The entity of T_CCUSAUINF as TABLE. <br>
 * お得意様別集計情報
 * <pre>
 * [primary-key]
 *     CLIENT_TOTAL_INFO_ID
 *
 * [column]
 *     CLIENT_TOTAL_INFO_ID, ZZORGNCD, DPCD, DLVYMD, DED, ZZPSTNID, SROPRTYMD, SROPRTCNT, DLVSNM, DLVDTLSNM, SSCD, SSNM, SRQACB, SRQACBLIN, SRQACBBLK, SRQACBDM, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_TOTAL_INFO_ID
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
 * Long clientTotalInfoId = entity.getClientTotalInfoId();
 * String zzorgncd = entity.getZzorgncd();
 * String dpcd = entity.getDpcd();
 * String dlvymd = entity.getDlvymd();
 * String ded = entity.getDed();
 * String zzpstnid = entity.getZzpstnid();
 * String sroprtymd = entity.getSroprtymd();
 * Long sroprtcnt = entity.getSroprtcnt();
 * Long dlvsnm = entity.getDlvsnm();
 * Long dlvdtlsnm = entity.getDlvdtlsnm();
 * String sscd = entity.getSscd();
 * String ssnm = entity.getSsnm();
 * Long srqacb = entity.getSrqacb();
 * Long srqacblin = entity.getSrqacblin();
 * Long srqacbblk = entity.getSrqacbblk();
 * Long srqacbdm = entity.getSrqacbdm();
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
 * entity.setClientTotalInfoId(clientTotalInfoId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setDpcd(dpcd);
 * entity.setDlvymd(dlvymd);
 * entity.setDed(ded);
 * entity.setZzpstnid(zzpstnid);
 * entity.setSroprtymd(sroprtymd);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setDlvsnm(dlvsnm);
 * entity.setDlvdtlsnm(dlvdtlsnm);
 * entity.setSscd(sscd);
 * entity.setSsnm(ssnm);
 * entity.setSrqacb(srqacb);
 * entity.setSrqacblin(srqacblin);
 * entity.setSrqacbblk(srqacbblk);
 * entity.setSrqacbdm(srqacbdm);
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
public abstract class BsTCcusauinf extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _clientTotalInfoId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** DPCD: {NotNull, varchar(30)} */
    protected String _dpcd;

    /** DLVYMD: {NotNull, varchar(8)} */
    protected String _dlvymd;

    /** DED: {NotNull, varchar(30)} */
    protected String _ded;

    /** ZZPSTNID: {NotNull, varchar(30)} */
    protected String _zzpstnid;

    /** SROPRTYMD: {NotNull, varchar(8)} */
    protected String _sroprtymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    protected Long _sroprtcnt;

    /** DLVSNM: {NotNull, bigint(19)} */
    protected Long _dlvsnm;

    /** DLVDTLSNM: {NotNull, bigint(19)} */
    protected Long _dlvdtlsnm;

    /** SSCD: {NotNull, varchar(30)} */
    protected String _sscd;

    /** SSNM: {varchar(60)} */
    protected String _ssnm;

    /** SRQACB: {bigint(19)} */
    protected Long _srqacb;

    /** SRQACBLIN: {bigint(19)} */
    protected Long _srqacblin;

    /** SRQACBBLK: {bigint(19)} */
    protected Long _srqacbblk;

    /** SRQACBDM: {bigint(19)} */
    protected Long _srqacbdm;

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
        return "T_CCUSAUINF";
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
        if (_clientTotalInfoId == null) { return false; }
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
        if (obj instanceof BsTCcusauinf) {
            BsTCcusauinf other = (BsTCcusauinf)obj;
            if (!xSV(_clientTotalInfoId, other._clientTotalInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientTotalInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientTotalInfoId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_zzpstnid));
        sb.append(dm).append(xfND(_sroprtymd));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_dlvsnm));
        sb.append(dm).append(xfND(_dlvdtlsnm));
        sb.append(dm).append(xfND(_sscd));
        sb.append(dm).append(xfND(_ssnm));
        sb.append(dm).append(xfND(_srqacb));
        sb.append(dm).append(xfND(_srqacblin));
        sb.append(dm).append(xfND(_srqacbblk));
        sb.append(dm).append(xfND(_srqacbdm));
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
    public TCcusauinf clone() {
        return (TCcusauinf)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * お得意様別集計情報ID
     * @return The value of the column 'CLIENT_TOTAL_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientTotalInfoId() {
        checkSpecifiedProperty("clientTotalInfoId");
        return _clientTotalInfoId;
    }

    /**
     * [set] CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * お得意様別集計情報ID
     * @param clientTotalInfoId The value of the column 'CLIENT_TOTAL_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientTotalInfoId(Long clientTotalInfoId) {
        registerModifiedProperty("clientTotalInfoId");
        _clientTotalInfoId = clientTotalInfoId;
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
     * [get] DLVSNM: {NotNull, bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DLVSNM'. (basically NotNull if selected: for the constraint)
     */
    public Long getDlvsnm() {
        checkSpecifiedProperty("dlvsnm");
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {NotNull, bigint(19)} <br>
     * 配達通番
     * @param dlvsnm The value of the column 'DLVSNM'. (basically NotNull if update: for the constraint)
     */
    public void setDlvsnm(Long dlvsnm) {
        registerModifiedProperty("dlvsnm");
        _dlvsnm = dlvsnm;
    }

    /**
     * [get] DLVDTLSNM: {NotNull, bigint(19)} <br>
     * 配達通番枝番
     * @return The value of the column 'DLVDTLSNM'. (basically NotNull if selected: for the constraint)
     */
    public Long getDlvdtlsnm() {
        checkSpecifiedProperty("dlvdtlsnm");
        return _dlvdtlsnm;
    }

    /**
     * [set] DLVDTLSNM: {NotNull, bigint(19)} <br>
     * 配達通番枝番
     * @param dlvdtlsnm The value of the column 'DLVDTLSNM'. (basically NotNull if update: for the constraint)
     */
    public void setDlvdtlsnm(Long dlvdtlsnm) {
        registerModifiedProperty("dlvdtlsnm");
        _dlvdtlsnm = dlvdtlsnm;
    }

    /**
     * [get] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSscd() {
        checkSpecifiedProperty("sscd");
        return convertEmptyToNull(_sscd);
    }

    /**
     * [set] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (basically NotNull if update: for the constraint)
     */
    public void setSscd(String sscd) {
        registerModifiedProperty("sscd");
        _sscd = sscd;
    }

    /**
     * [get] SSNM: {varchar(60)} <br>
     * お得意様名
     * @return The value of the column 'SSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSsnm() {
        checkSpecifiedProperty("ssnm");
        return convertEmptyToNull(_ssnm);
    }

    /**
     * [set] SSNM: {varchar(60)} <br>
     * お得意様名
     * @param ssnm The value of the column 'SSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSsnm(String ssnm) {
        registerModifiedProperty("ssnm");
        _ssnm = ssnm;
    }

    /**
     * [get] SRQACB: {bigint(19)} <br>
     * 仕分段ボール数
     * @return The value of the column 'SRQACB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrqacb() {
        checkSpecifiedProperty("srqacb");
        return _srqacb;
    }

    /**
     * [set] SRQACB: {bigint(19)} <br>
     * 仕分段ボール数
     * @param srqacb The value of the column 'SRQACB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrqacb(Long srqacb) {
        registerModifiedProperty("srqacb");
        _srqacb = srqacb;
    }

    /**
     * [get] SRQACBLIN: {bigint(19)} <br>
     * 仕分段ボール数(ライン数)
     * @return The value of the column 'SRQACBLIN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrqacblin() {
        checkSpecifiedProperty("srqacblin");
        return _srqacblin;
    }

    /**
     * [set] SRQACBLIN: {bigint(19)} <br>
     * 仕分段ボール数(ライン数)
     * @param srqacblin The value of the column 'SRQACBLIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrqacblin(Long srqacblin) {
        registerModifiedProperty("srqacblin");
        _srqacblin = srqacblin;
    }

    /**
     * [get] SRQACBBLK: {bigint(19)} <br>
     * 仕分段ボール数(ブロック数)
     * @return The value of the column 'SRQACBBLK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrqacbblk() {
        checkSpecifiedProperty("srqacbblk");
        return _srqacbblk;
    }

    /**
     * [set] SRQACBBLK: {bigint(19)} <br>
     * 仕分段ボール数(ブロック数)
     * @param srqacbblk The value of the column 'SRQACBBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrqacbblk(Long srqacbblk) {
        registerModifiedProperty("srqacbblk");
        _srqacbblk = srqacbblk;
    }

    /**
     * [get] SRQACBDM: {bigint(19)} <br>
     * 仕分段ボール数(丸段数)
     * @return The value of the column 'SRQACBDM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrqacbdm() {
        checkSpecifiedProperty("srqacbdm");
        return _srqacbdm;
    }

    /**
     * [set] SRQACBDM: {bigint(19)} <br>
     * 仕分段ボール数(丸段数)
     * @param srqacbdm The value of the column 'SRQACBDM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrqacbdm(Long srqacbdm) {
        registerModifiedProperty("srqacbdm");
        _srqacbdm = srqacbdm;
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
