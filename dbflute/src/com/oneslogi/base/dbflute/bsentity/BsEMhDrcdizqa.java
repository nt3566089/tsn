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
 * The entity of E_MH_DRCDIZQA as TABLE. <br>
 * 共通下位データ送信テーブル　(方面別残数)
 * <pre>
 * [primary-key]
 *     MH_DRCDIZQA_ID
 *
 * [column]
 *     MH_DRCDIZQA_ID, LINBLK, ZNECD, SRRNK, LOCNO, ZZMATNR, DLVYMD, DPCD, DED, PSTNID, COMT, SROPRTCNT, CSROPRTCNT, CINLADDRCSRRNK, ZQACP, ZQACTQA, SSQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_DRCDIZQA_ID
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
 * Long mhDrcdizqaId = entity.getMhDrcdizqaId();
 * String linblk = entity.getLinblk();
 * String znecd = entity.getZnecd();
 * Long srrnk = entity.getSrrnk();
 * String locno = entity.getLocno();
 * String zzmatnr = entity.getZzmatnr();
 * String dlvymd = entity.getDlvymd();
 * String dpcd = entity.getDpcd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String comt = entity.getComt();
 * Long sroprtcnt = entity.getSroprtcnt();
 * Long csroprtcnt = entity.getCsroprtcnt();
 * Long cinladdrcsrrnk = entity.getCinladdrcsrrnk();
 * Long zqacp = entity.getZqacp();
 * Long zqactqa = entity.getZqactqa();
 * Long ssqa = entity.getSsqa();
 * String sendCd = entity.getSendCd();
 * String workFlg = entity.getWorkFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMhDrcdizqaId(mhDrcdizqaId);
 * entity.setLinblk(linblk);
 * entity.setZnecd(znecd);
 * entity.setSrrnk(srrnk);
 * entity.setLocno(locno);
 * entity.setZzmatnr(zzmatnr);
 * entity.setDlvymd(dlvymd);
 * entity.setDpcd(dpcd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setComt(comt);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setCsroprtcnt(csroprtcnt);
 * entity.setCinladdrcsrrnk(cinladdrcsrrnk);
 * entity.setZqacp(zqacp);
 * entity.setZqactqa(zqactqa);
 * entity.setSsqa(ssqa);
 * entity.setSendCd(sendCd);
 * entity.setWorkFlg(workFlg);
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
public abstract class BsEMhDrcdizqa extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mhDrcdizqaId;

    /** LINBLK: {NotNull, varchar(30)} */
    protected String _linblk;

    /** ZNECD: {NotNull, varchar(30)} */
    protected String _znecd;

    /** SRRNK: {NotNull, bigint(19)} */
    protected Long _srrnk;

    /** LOCNO: {NotNull, varchar(255)} */
    protected String _locno;

    /** ZZMATNR: {varchar(30)} */
    protected String _zzmatnr;

    /** DLVYMD: {NotNull, varchar(8)} */
    protected String _dlvymd;

    /** DPCD: {NotNull, varchar(30)} */
    protected String _dpcd;

    /** DED: {NotNull, varchar(30)} */
    protected String _ded;

    /** PSTNID: {NotNull, char(1)} */
    protected String _pstnid;

    /** COMT: {varchar(60)} */
    protected String _comt;

    /** SROPRTCNT: {bigint(19)} */
    protected Long _sroprtcnt;

    /** CSROPRTCNT: {bigint(19)} */
    protected Long _csroprtcnt;

    /** CINLADDRCSRRNK: {bigint(19)} */
    protected Long _cinladdrcsrrnk;

    /** ZQACP: {bigint(19)} */
    protected Long _zqacp;

    /** ZQACTQA: {bigint(19)} */
    protected Long _zqactqa;

    /** SSQA: {bigint(19)} */
    protected Long _ssqa;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** WORK_FLG: {char(1)} */
    protected String _workFlg;

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
        return "E_MH_DRCDIZQA";
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
        if (_mhDrcdizqaId == null) { return false; }
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
        if (obj instanceof BsEMhDrcdizqa) {
            BsEMhDrcdizqa other = (BsEMhDrcdizqa)obj;
            if (!xSV(_mhDrcdizqaId, other._mhDrcdizqaId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mhDrcdizqaId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mhDrcdizqaId));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_znecd));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_locno));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_comt));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_csroprtcnt));
        sb.append(dm).append(xfND(_cinladdrcsrrnk));
        sb.append(dm).append(xfND(_zqacp));
        sb.append(dm).append(xfND(_zqactqa));
        sb.append(dm).append(xfND(_ssqa));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_workFlg));
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
    public EMhDrcdizqa clone() {
        return (EMhDrcdizqa)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信　(方面別残数)ID
     * @return The value of the column 'MH_DRCDIZQA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMhDrcdizqaId() {
        checkSpecifiedProperty("mhDrcdizqaId");
        return _mhDrcdizqaId;
    }

    /**
     * [set] MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信　(方面別残数)ID
     * @param mhDrcdizqaId The value of the column 'MH_DRCDIZQA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMhDrcdizqaId(Long mhDrcdizqaId) {
        registerModifiedProperty("mhDrcdizqaId");
        _mhDrcdizqaId = mhDrcdizqaId;
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
     * [get] ZNECD: {NotNull, varchar(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZNECD'. (basically NotNull if selected: for the constraint)
     */
    public String getZnecd() {
        checkSpecifiedProperty("znecd");
        return convertEmptyToNull(_znecd);
    }

    /**
     * [set] ZNECD: {NotNull, varchar(30)} <br>
     * ゾーンCD
     * @param znecd The value of the column 'ZNECD'. (basically NotNull if update: for the constraint)
     */
    public void setZnecd(String znecd) {
        registerModifiedProperty("znecd");
        _znecd = znecd;
    }

    /**
     * [get] SRRNK: {NotNull, bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (basically NotNull if selected: for the constraint)
     */
    public Long getSrrnk() {
        checkSpecifiedProperty("srrnk");
        return _srrnk;
    }

    /**
     * [set] SRRNK: {NotNull, bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (basically NotNull if update: for the constraint)
     */
    public void setSrrnk(Long srrnk) {
        registerModifiedProperty("srrnk");
        _srrnk = srrnk;
    }

    /**
     * [get] LOCNO: {NotNull, varchar(255)} <br>
     * ロケーションＮｏ.
     * @return The value of the column 'LOCNO'. (basically NotNull if selected: for the constraint)
     */
    public String getLocno() {
        checkSpecifiedProperty("locno");
        return convertEmptyToNull(_locno);
    }

    /**
     * [set] LOCNO: {NotNull, varchar(255)} <br>
     * ロケーションＮｏ.
     * @param locno The value of the column 'LOCNO'. (basically NotNull if update: for the constraint)
     */
    public void setLocno(String locno) {
        registerModifiedProperty("locno");
        _locno = locno;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ZZMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄CD
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
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
     * [get] PSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (basically NotNull if selected: for the constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (basically NotNull if update: for the constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
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
     * [get] CSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'CSROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCsroprtcnt() {
        checkSpecifiedProperty("csroprtcnt");
        return _csroprtcnt;
    }

    /**
     * [set] CSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param csroprtcnt The value of the column 'CSROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsroprtcnt(Long csroprtcnt) {
        registerModifiedProperty("csroprtcnt");
        _csroprtcnt = csroprtcnt;
    }

    /**
     * [get] CINLADDRCSRRNK: {bigint(19)} <br>
     * 割込先頭方面仕分順
     * @return The value of the column 'CINLADDRCSRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCinladdrcsrrnk() {
        checkSpecifiedProperty("cinladdrcsrrnk");
        return _cinladdrcsrrnk;
    }

    /**
     * [set] CINLADDRCSRRNK: {bigint(19)} <br>
     * 割込先頭方面仕分順
     * @param cinladdrcsrrnk The value of the column 'CINLADDRCSRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCinladdrcsrrnk(Long cinladdrcsrrnk) {
        registerModifiedProperty("cinladdrcsrrnk");
        _cinladdrcsrrnk = cinladdrcsrrnk;
    }

    /**
     * [get] ZQACP: {bigint(19)} <br>
     * 残数　段ボール
     * @return The value of the column 'ZQACP'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZqacp() {
        checkSpecifiedProperty("zqacp");
        return _zqacp;
    }

    /**
     * [set] ZQACP: {bigint(19)} <br>
     * 残数　段ボール
     * @param zqacp The value of the column 'ZQACP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZqacp(Long zqacp) {
        registerModifiedProperty("zqacp");
        _zqacp = zqacp;
    }

    /**
     * [get] ZQACTQA: {bigint(19)} <br>
     * 残数　カートン数
     * @return The value of the column 'ZQACTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZqactqa() {
        checkSpecifiedProperty("zqactqa");
        return _zqactqa;
    }

    /**
     * [set] ZQACTQA: {bigint(19)} <br>
     * 残数　カートン数
     * @param zqactqa The value of the column 'ZQACTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZqactqa(Long zqactqa) {
        registerModifiedProperty("zqactqa");
        _zqactqa = zqactqa;
    }

    /**
     * [get] SSQA: {bigint(19)} <br>
     * 販売店数
     * @return The value of the column 'SSQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSsqa() {
        checkSpecifiedProperty("ssqa");
        return _ssqa;
    }

    /**
     * [set] SSQA: {bigint(19)} <br>
     * 販売店数
     * @param ssqa The value of the column 'SSQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSsqa(Long ssqa) {
        registerModifiedProperty("ssqa");
        _ssqa = ssqa;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
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
