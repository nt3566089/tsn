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
 * The entity of B_LOG as TABLE. <br>
 * ログ
 * <pre>
 * [primary-key]
 *     LOG_ID
 *
 * [column]
 *     LOG_ID, LOG_STATUS, LOG_GROUP_CD, LOG_GROUP_NM, LOG_GROUP_PROCESS_ID, PGM_CD, PGM_NM, PROCESS_START_DT, PROCESS_END_DT, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByLogStatus)
 *
 * [referrer table]
 *     B_LOG_DTL
 *
 * [foreign property]
 *     bClassDtlByLogStatus
 *
 * [referrer property]
 *     bLogDtlList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long logId = entity.getLogId();
 * String logStatus = entity.getLogStatus();
 * String logGroupCd = entity.getLogGroupCd();
 * String logGroupNm = entity.getLogGroupNm();
 * Long logGroupProcessId = entity.getLogGroupProcessId();
 * String pgmCd = entity.getPgmCd();
 * String pgmNm = entity.getPgmNm();
 * java.sql.Timestamp processStartDt = entity.getProcessStartDt();
 * java.sql.Timestamp processEndDt = entity.getProcessEndDt();
 * String attribute1 = entity.getAttribute1();
 * String attribute2 = entity.getAttribute2();
 * String attribute3 = entity.getAttribute3();
 * String attribute4 = entity.getAttribute4();
 * String attribute5 = entity.getAttribute5();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setLogId(logId);
 * entity.setLogStatus(logStatus);
 * entity.setLogGroupCd(logGroupCd);
 * entity.setLogGroupNm(logGroupNm);
 * entity.setLogGroupProcessId(logGroupProcessId);
 * entity.setPgmCd(pgmCd);
 * entity.setPgmNm(pgmNm);
 * entity.setProcessStartDt(processStartDt);
 * entity.setProcessEndDt(processEndDt);
 * entity.setAttribute1(attribute1);
 * entity.setAttribute2(attribute2);
 * entity.setAttribute3(attribute3);
 * entity.setAttribute4(attribute4);
 * entity.setAttribute5(attribute5);
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
public abstract class BsBLog extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _logId;

    /** LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} */
    protected String _logStatus;

    /** LOG_GROUP_CD: {varchar(100)} */
    protected String _logGroupCd;

    /** LOG_GROUP_NM: {varchar(60)} */
    protected String _logGroupNm;

    /** LOG_GROUP_PROCESS_ID: {bigint(19)} */
    protected Long _logGroupProcessId;

    /** PGM_CD: {varchar(100)} */
    protected String _pgmCd;

    /** PGM_NM: {varchar(60)} */
    protected String _pgmNm;

    /** PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _processStartDt;

    /** PROCESS_END_DT: {IX, datetime2(26, 6)} */
    protected java.sql.Timestamp _processEndDt;

    /** ATTRIBUTE1: {varchar(100)} */
    protected String _attribute1;

    /** ATTRIBUTE2: {varchar(100)} */
    protected String _attribute2;

    /** ATTRIBUTE3: {varchar(100)} */
    protected String _attribute3;

    /** ATTRIBUTE4: {varchar(100)} */
    protected String _attribute4;

    /** ATTRIBUTE5: {varchar(100)} */
    protected String _attribute5;

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
        return "B_LOG";
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
        if (_logId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of logStatus as the classification of LogStatus. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LogStatus getLogStatusAsLogStatus() {
        return CDef.LogStatus.codeOf(getLogStatus());
    }

    /**
     * Set the value of logStatus as the classification of LogStatus. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLogStatusAsLogStatus(CDef.LogStatus cdef) {
        setLogStatus(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of logStatus as $1 (1). <br>
     * $1: 処理中
     */
    public void setLogStatus_$1() {
        setLogStatusAsLogStatus(CDef.LogStatus.$1);
    }

    /**
     * Set the value of logStatus as $2 (2). <br>
     * $2: 正常終了
     */
    public void setLogStatus_$2() {
        setLogStatusAsLogStatus(CDef.LogStatus.$2);
    }

    /**
     * Set the value of logStatus as $3 (3). <br>
     * $3: 異常終了
     */
    public void setLogStatus_$3() {
        setLogStatusAsLogStatus(CDef.LogStatus.$3);
    }

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
     * Is the value of logStatus $1? <br>
     * $1: 処理中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogStatus$1() {
        CDef.LogStatus cdef = getLogStatusAsLogStatus();
        return cdef != null ? cdef.equals(CDef.LogStatus.$1) : false;
    }

    /**
     * Is the value of logStatus $2? <br>
     * $2: 正常終了
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogStatus$2() {
        CDef.LogStatus cdef = getLogStatusAsLogStatus();
        return cdef != null ? cdef.equals(CDef.LogStatus.$2) : false;
    }

    /**
     * Is the value of logStatus $3? <br>
     * $3: 異常終了
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogStatus$3() {
        CDef.LogStatus cdef = getLogStatusAsLogStatus();
        return cdef != null ? cdef.equals(CDef.LogStatus.$3) : false;
    }

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
     * Get the value of the column 'logStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLogStatusName() {
        CDef.LogStatus cdef = getLogStatusAsLogStatus();
        return cdef != null ? cdef.name() : null;
    }

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
    /** B_CLASS_DTL by my LOG_STATUS, named 'BClassDtlByLogStatus'. */
    protected BClassDtl _bClassDtlByLogStatus;

    /**
     * [get] B_CLASS_DTL by my LOG_STATUS, named 'BClassDtlByLogStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByLogStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLogStatus() {
        return _bClassDtlByLogStatus;
    }

    /**
     * [set] B_CLASS_DTL by my LOG_STATUS, named 'BClassDtlByLogStatus'.
     * @param bClassDtlByLogStatus The entity of foreign property 'BClassDtlByLogStatus'. (NullAllowed)
     */
    public void setBClassDtlByLogStatus(BClassDtl bClassDtlByLogStatus) {
        _bClassDtlByLogStatus = bClassDtlByLogStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_LOG_DTL by LOG_ID, named 'BLogDtlList'. */
    protected List<BLogDtl> _bLogDtlList;

    /**
     * [get] B_LOG_DTL by LOG_ID, named 'BLogDtlList'.
     * @return The entity list of referrer property 'BLogDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BLogDtl> getBLogDtlList() {
        if (_bLogDtlList == null) { _bLogDtlList = newReferrerList(); }
        return _bLogDtlList;
    }

    /**
     * [set] B_LOG_DTL by LOG_ID, named 'BLogDtlList'.
     * @param bLogDtlList The entity list of referrer property 'BLogDtlList'. (NullAllowed)
     */
    public void setBLogDtlList(List<BLogDtl> bLogDtlList) {
        _bLogDtlList = bLogDtlList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBLog) {
            BsBLog other = (BsBLog)obj;
            if (!xSV(_logId, other._logId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _logId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByLogStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLogStatus, "bClassDtlByLogStatus")); }
        if (_bLogDtlList != null) { for (BLogDtl et : _bLogDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bLogDtlList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_logId));
        sb.append(dm).append(xfND(_logStatus));
        sb.append(dm).append(xfND(_logGroupCd));
        sb.append(dm).append(xfND(_logGroupNm));
        sb.append(dm).append(xfND(_logGroupProcessId));
        sb.append(dm).append(xfND(_pgmCd));
        sb.append(dm).append(xfND(_pgmNm));
        sb.append(dm).append(xfND(_processStartDt));
        sb.append(dm).append(xfND(_processEndDt));
        sb.append(dm).append(xfND(_attribute1));
        sb.append(dm).append(xfND(_attribute2));
        sb.append(dm).append(xfND(_attribute3));
        sb.append(dm).append(xfND(_attribute4));
        sb.append(dm).append(xfND(_attribute5));
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
        if (_bClassDtlByLogStatus != null)
        { sb.append(dm).append("bClassDtlByLogStatus"); }
        if (_bLogDtlList != null && !_bLogDtlList.isEmpty())
        { sb.append(dm).append("bLogDtlList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BLog clone() {
        return (BLog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログID
     * @return The value of the column 'LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLogId() {
        checkSpecifiedProperty("logId");
        return _logId;
    }

    /**
     * [set] LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログID
     * @param logId The value of the column 'LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLogId(Long logId) {
        registerModifiedProperty("logId");
        _logId = logId;
    }

    /**
     * [get] LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @return The value of the column 'LOG_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getLogStatus() {
        checkSpecifiedProperty("logStatus");
        return convertEmptyToNull(_logStatus);
    }

    /**
     * [set] LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param logStatus The value of the column 'LOG_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setLogStatus(String logStatus) {
        registerModifiedProperty("logStatus");
        _logStatus = logStatus;
    }

    /**
     * [get] LOG_GROUP_CD: {varchar(100)} <br>
     * ロググループCD
     * @return The value of the column 'LOG_GROUP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogGroupCd() {
        checkSpecifiedProperty("logGroupCd");
        return convertEmptyToNull(_logGroupCd);
    }

    /**
     * [set] LOG_GROUP_CD: {varchar(100)} <br>
     * ロググループCD
     * @param logGroupCd The value of the column 'LOG_GROUP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogGroupCd(String logGroupCd) {
        registerModifiedProperty("logGroupCd");
        _logGroupCd = logGroupCd;
    }

    /**
     * [get] LOG_GROUP_NM: {varchar(60)} <br>
     * ロググループ名称
     * @return The value of the column 'LOG_GROUP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogGroupNm() {
        checkSpecifiedProperty("logGroupNm");
        return convertEmptyToNull(_logGroupNm);
    }

    /**
     * [set] LOG_GROUP_NM: {varchar(60)} <br>
     * ロググループ名称
     * @param logGroupNm The value of the column 'LOG_GROUP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogGroupNm(String logGroupNm) {
        registerModifiedProperty("logGroupNm");
        _logGroupNm = logGroupNm;
    }

    /**
     * [get] LOG_GROUP_PROCESS_ID: {bigint(19)} <br>
     * ロググループ処理ID
     * @return The value of the column 'LOG_GROUP_PROCESS_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLogGroupProcessId() {
        checkSpecifiedProperty("logGroupProcessId");
        return _logGroupProcessId;
    }

    /**
     * [set] LOG_GROUP_PROCESS_ID: {bigint(19)} <br>
     * ロググループ処理ID
     * @param logGroupProcessId The value of the column 'LOG_GROUP_PROCESS_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogGroupProcessId(Long logGroupProcessId) {
        registerModifiedProperty("logGroupProcessId");
        _logGroupProcessId = logGroupProcessId;
    }

    /**
     * [get] PGM_CD: {varchar(100)} <br>
     * プログラムCD
     * @return The value of the column 'PGM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPgmCd() {
        checkSpecifiedProperty("pgmCd");
        return convertEmptyToNull(_pgmCd);
    }

    /**
     * [set] PGM_CD: {varchar(100)} <br>
     * プログラムCD
     * @param pgmCd The value of the column 'PGM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPgmCd(String pgmCd) {
        registerModifiedProperty("pgmCd");
        _pgmCd = pgmCd;
    }

    /**
     * [get] PGM_NM: {varchar(60)} <br>
     * プログラム名称
     * @return The value of the column 'PGM_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPgmNm() {
        checkSpecifiedProperty("pgmNm");
        return convertEmptyToNull(_pgmNm);
    }

    /**
     * [set] PGM_NM: {varchar(60)} <br>
     * プログラム名称
     * @param pgmNm The value of the column 'PGM_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPgmNm(String pgmNm) {
        registerModifiedProperty("pgmNm");
        _pgmNm = pgmNm;
    }

    /**
     * [get] PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)} <br>
     * 処理開始日時
     * @return The value of the column 'PROCESS_START_DT'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getProcessStartDt() {
        checkSpecifiedProperty("processStartDt");
        return _processStartDt;
    }

    /**
     * [set] PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)} <br>
     * 処理開始日時
     * @param processStartDt The value of the column 'PROCESS_START_DT'. (basically NotNull if update: for the constraint)
     */
    public void setProcessStartDt(java.sql.Timestamp processStartDt) {
        registerModifiedProperty("processStartDt");
        _processStartDt = processStartDt;
    }

    /**
     * [get] PROCESS_END_DT: {IX, datetime2(26, 6)} <br>
     * 処理終了日時
     * @return The value of the column 'PROCESS_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getProcessEndDt() {
        checkSpecifiedProperty("processEndDt");
        return _processEndDt;
    }

    /**
     * [set] PROCESS_END_DT: {IX, datetime2(26, 6)} <br>
     * 処理終了日時
     * @param processEndDt The value of the column 'PROCESS_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessEndDt(java.sql.Timestamp processEndDt) {
        registerModifiedProperty("processEndDt");
        _processEndDt = processEndDt;
    }

    /**
     * [get] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @return The value of the column 'ATTRIBUTE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute1() {
        checkSpecifiedProperty("attribute1");
        return convertEmptyToNull(_attribute1);
    }

    /**
     * [set] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @param attribute1 The value of the column 'ATTRIBUTE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute1(String attribute1) {
        registerModifiedProperty("attribute1");
        _attribute1 = attribute1;
    }

    /**
     * [get] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @return The value of the column 'ATTRIBUTE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute2() {
        checkSpecifiedProperty("attribute2");
        return convertEmptyToNull(_attribute2);
    }

    /**
     * [set] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @param attribute2 The value of the column 'ATTRIBUTE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute2(String attribute2) {
        registerModifiedProperty("attribute2");
        _attribute2 = attribute2;
    }

    /**
     * [get] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @return The value of the column 'ATTRIBUTE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute3() {
        checkSpecifiedProperty("attribute3");
        return convertEmptyToNull(_attribute3);
    }

    /**
     * [set] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @param attribute3 The value of the column 'ATTRIBUTE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute3(String attribute3) {
        registerModifiedProperty("attribute3");
        _attribute3 = attribute3;
    }

    /**
     * [get] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @return The value of the column 'ATTRIBUTE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute4() {
        checkSpecifiedProperty("attribute4");
        return convertEmptyToNull(_attribute4);
    }

    /**
     * [set] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @param attribute4 The value of the column 'ATTRIBUTE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute4(String attribute4) {
        registerModifiedProperty("attribute4");
        _attribute4 = attribute4;
    }

    /**
     * [get] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @return The value of the column 'ATTRIBUTE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute5() {
        checkSpecifiedProperty("attribute5");
        return convertEmptyToNull(_attribute5);
    }

    /**
     * [set] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @param attribute5 The value of the column 'ATTRIBUTE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute5(String attribute5) {
        registerModifiedProperty("attribute5");
        _attribute5 = attribute5;
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
