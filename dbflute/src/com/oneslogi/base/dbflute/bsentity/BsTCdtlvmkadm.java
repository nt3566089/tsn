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
 * The entity of T_CDTLVMKADM as TABLE. <br>
 * 明細書・ラベル作表管理
 * <pre>
 * [primary-key]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID
 *
 * [column]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID, ZZORGNCD, SRYMD, SROPRTCNT, DLVYMD, DPCD, DED, PSTNID, LINBLK, SRRNK, MKDTM, LSTDSYMD, SRLINCD, SRSRRNK, SPECIFICATION_PRINTEDFLG, LABEL_PRINTEDFLG, REPORT_ID, REPORT_NM, STOCK_NUM, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID
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
 * Long specificationLabelMakeManageId = entity.getSpecificationLabelMakeManageId();
 * String zzorgncd = entity.getZzorgncd();
 * String srymd = entity.getSrymd();
 * Long sroprtcnt = entity.getSroprtcnt();
 * String dlvymd = entity.getDlvymd();
 * String dpcd = entity.getDpcd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String linblk = entity.getLinblk();
 * Long srrnk = entity.getSrrnk();
 * java.sql.Timestamp mkdtm = entity.getMkdtm();
 * String lstdsymd = entity.getLstdsymd();
 * String srlincd = entity.getSrlincd();
 * Long srsrrnk = entity.getSrsrrnk();
 * String specificationPrintedflg = entity.getSpecificationPrintedflg();
 * String labelPrintedflg = entity.getLabelPrintedflg();
 * Long reportId = entity.getReportId();
 * String reportNm = entity.getReportNm();
 * Long stockNum = entity.getStockNum();
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
 * entity.setSpecificationLabelMakeManageId(specificationLabelMakeManageId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setSrymd(srymd);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setDlvymd(dlvymd);
 * entity.setDpcd(dpcd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setLinblk(linblk);
 * entity.setSrrnk(srrnk);
 * entity.setMkdtm(mkdtm);
 * entity.setLstdsymd(lstdsymd);
 * entity.setSrlincd(srlincd);
 * entity.setSrsrrnk(srsrrnk);
 * entity.setSpecificationPrintedflg(specificationPrintedflg);
 * entity.setLabelPrintedflg(labelPrintedflg);
 * entity.setReportId(reportId);
 * entity.setReportNm(reportNm);
 * entity.setStockNum(stockNum);
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
public abstract class BsTCdtlvmkadm extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _specificationLabelMakeManageId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** SRYMD: {NotNull, varchar(8)} */
    protected String _srymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    protected Long _sroprtcnt;

    /** DLVYMD: {varchar(8)} */
    protected String _dlvymd;

    /** DPCD: {varchar(30)} */
    protected String _dpcd;

    /** DED: {varchar(30)} */
    protected String _ded;

    /** PSTNID: {varchar(30)} */
    protected String _pstnid;

    /** LINBLK: {varchar(30)} */
    protected String _linblk;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** MKDTM: {datetime2(26, 6)} */
    protected java.sql.Timestamp _mkdtm;

    /** LSTDSYMD: {varchar(8)} */
    protected String _lstdsymd;

    /** SRLINCD: {varchar(30)} */
    protected String _srlincd;

    /** SRSRRNK: {bigint(19)} */
    protected Long _srsrrnk;

    /** SPECIFICATION_PRINTEDFLG: {char(1)} */
    protected String _specificationPrintedflg;

    /** LABEL_PRINTEDFLG: {char(1)} */
    protected String _labelPrintedflg;

    /** REPORT_ID: {bigint(19)} */
    protected Long _reportId;

    /** REPORT_NM: {varchar(30)} */
    protected String _reportNm;

    /** STOCK_NUM: {bigint(19)} */
    protected Long _stockNum;

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
        return "T_CDTLVMKADM";
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
        if (_specificationLabelMakeManageId == null) { return false; }
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
        if (obj instanceof BsTCdtlvmkadm) {
            BsTCdtlvmkadm other = (BsTCdtlvmkadm)obj;
            if (!xSV(_specificationLabelMakeManageId, other._specificationLabelMakeManageId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _specificationLabelMakeManageId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_specificationLabelMakeManageId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_srymd));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_mkdtm));
        sb.append(dm).append(xfND(_lstdsymd));
        sb.append(dm).append(xfND(_srlincd));
        sb.append(dm).append(xfND(_srsrrnk));
        sb.append(dm).append(xfND(_specificationPrintedflg));
        sb.append(dm).append(xfND(_labelPrintedflg));
        sb.append(dm).append(xfND(_reportId));
        sb.append(dm).append(xfND(_reportNm));
        sb.append(dm).append(xfND(_stockNum));
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
    public TCdtlvmkadm clone() {
        return (TCdtlvmkadm)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 明細書・ラベル作表管理ID
     * @return The value of the column 'SPECIFICATION_LABEL_MAKE_MANAGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSpecificationLabelMakeManageId() {
        checkSpecifiedProperty("specificationLabelMakeManageId");
        return _specificationLabelMakeManageId;
    }

    /**
     * [set] SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 明細書・ラベル作表管理ID
     * @param specificationLabelMakeManageId The value of the column 'SPECIFICATION_LABEL_MAKE_MANAGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSpecificationLabelMakeManageId(Long specificationLabelMakeManageId) {
        registerModifiedProperty("specificationLabelMakeManageId");
        _specificationLabelMakeManageId = specificationLabelMakeManageId;
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
     * [get] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SRYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getSrymd() {
        checkSpecifiedProperty("srymd");
        return convertEmptyToNull(_srymd);
    }

    /**
     * [set] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @param srymd The value of the column 'SRYMD'. (basically NotNull if update: for the constraint)
     */
    public void setSrymd(String srymd) {
        registerModifiedProperty("srymd");
        _srymd = srymd;
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
     * [get] DLVYMD: {varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvymd() {
        checkSpecifiedProperty("dlvymd");
        return convertEmptyToNull(_dlvymd);
    }

    /**
     * [set] DLVYMD: {varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvymd(String dlvymd) {
        registerModifiedProperty("dlvymd");
        _dlvymd = dlvymd;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] DED: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed even if selected: for no constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
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
     * [get] MKDTM: {datetime2(26, 6)} <br>
     * 作成日時
     * @return The value of the column 'MKDTM'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getMkdtm() {
        checkSpecifiedProperty("mkdtm");
        return _mkdtm;
    }

    /**
     * [set] MKDTM: {datetime2(26, 6)} <br>
     * 作成日時
     * @param mkdtm The value of the column 'MKDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMkdtm(java.sql.Timestamp mkdtm) {
        registerModifiedProperty("mkdtm");
        _mkdtm = mkdtm;
    }

    /**
     * [get] LSTDSYMD: {varchar(8)} <br>
     * 帳票廃棄日
     * @return The value of the column 'LSTDSYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLstdsymd() {
        checkSpecifiedProperty("lstdsymd");
        return convertEmptyToNull(_lstdsymd);
    }

    /**
     * [set] LSTDSYMD: {varchar(8)} <br>
     * 帳票廃棄日
     * @param lstdsymd The value of the column 'LSTDSYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLstdsymd(String lstdsymd) {
        registerModifiedProperty("lstdsymd");
        _lstdsymd = lstdsymd;
    }

    /**
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分用ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrlincd() {
        checkSpecifiedProperty("srlincd");
        return convertEmptyToNull(_srlincd);
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分用ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrlincd(String srlincd) {
        registerModifiedProperty("srlincd");
        _srlincd = srlincd;
    }

    /**
     * [get] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @return The value of the column 'SRSRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrsrrnk() {
        checkSpecifiedProperty("srsrrnk");
        return _srsrrnk;
    }

    /**
     * [set] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @param srsrrnk The value of the column 'SRSRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrsrrnk(Long srsrrnk) {
        registerModifiedProperty("srsrrnk");
        _srsrrnk = srsrrnk;
    }

    /**
     * [get] SPECIFICATION_PRINTEDFLG: {char(1)} <br>
     * 明細書印刷済フラグ
     * @return The value of the column 'SPECIFICATION_PRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecificationPrintedflg() {
        checkSpecifiedProperty("specificationPrintedflg");
        return convertEmptyToNull(_specificationPrintedflg);
    }

    /**
     * [set] SPECIFICATION_PRINTEDFLG: {char(1)} <br>
     * 明細書印刷済フラグ
     * @param specificationPrintedflg The value of the column 'SPECIFICATION_PRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecificationPrintedflg(String specificationPrintedflg) {
        registerModifiedProperty("specificationPrintedflg");
        _specificationPrintedflg = specificationPrintedflg;
    }

    /**
     * [get] LABEL_PRINTEDFLG: {char(1)} <br>
     * ラベル印刷済フラグ
     * @return The value of the column 'LABEL_PRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLabelPrintedflg() {
        checkSpecifiedProperty("labelPrintedflg");
        return convertEmptyToNull(_labelPrintedflg);
    }

    /**
     * [set] LABEL_PRINTEDFLG: {char(1)} <br>
     * ラベル印刷済フラグ
     * @param labelPrintedflg The value of the column 'LABEL_PRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLabelPrintedflg(String labelPrintedflg) {
        registerModifiedProperty("labelPrintedflg");
        _labelPrintedflg = labelPrintedflg;
    }

    /**
     * [get] REPORT_ID: {bigint(19)} <br>
     * 帳票ID
     * @return The value of the column 'REPORT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReportId() {
        checkSpecifiedProperty("reportId");
        return _reportId;
    }

    /**
     * [set] REPORT_ID: {bigint(19)} <br>
     * 帳票ID
     * @param reportId The value of the column 'REPORT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportId(Long reportId) {
        registerModifiedProperty("reportId");
        _reportId = reportId;
    }

    /**
     * [get] REPORT_NM: {varchar(30)} <br>
     * 帳票名
     * @return The value of the column 'REPORT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReportNm() {
        checkSpecifiedProperty("reportNm");
        return convertEmptyToNull(_reportNm);
    }

    /**
     * [set] REPORT_NM: {varchar(30)} <br>
     * 帳票名
     * @param reportNm The value of the column 'REPORT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportNm(String reportNm) {
        registerModifiedProperty("reportNm");
        _reportNm = reportNm;
    }

    /**
     * [get] STOCK_NUM: {bigint(19)} <br>
     * 補充回数
     * @return The value of the column 'STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockNum() {
        checkSpecifiedProperty("stockNum");
        return _stockNum;
    }

    /**
     * [set] STOCK_NUM: {bigint(19)} <br>
     * 補充回数
     * @param stockNum The value of the column 'STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockNum(Long stockNum) {
        registerModifiedProperty("stockNum");
        _stockNum = stockNum;
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
