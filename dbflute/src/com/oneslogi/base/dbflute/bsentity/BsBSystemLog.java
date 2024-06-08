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
 * The entity of B_SYSTEM_LOG as TABLE. <br>
 * システムログ
 * <pre>
 * [primary-key]
 *     SYSTEM_LOG_ID
 *
 * [column]
 *     SYSTEM_LOG_ID, SYSTEM_LOG_PROCESS_ID, SYSTEM_LOG_TYPE, SYSTEM_LOG_STATUS, CLASS_CD, METHOD_CD, PROCESS_INFO, PROCESS_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SYSTEM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(BySystemLogType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtlBySystemLogType, bClassDtlBySystemLogStatus
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long systemLogId = entity.getSystemLogId();
 * Long systemLogProcessId = entity.getSystemLogProcessId();
 * String systemLogType = entity.getSystemLogType();
 * String systemLogStatus = entity.getSystemLogStatus();
 * String classCd = entity.getClassCd();
 * String methodCd = entity.getMethodCd();
 * String processInfo = entity.getProcessInfo();
 * java.sql.Timestamp processDt = entity.getProcessDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSystemLogId(systemLogId);
 * entity.setSystemLogProcessId(systemLogProcessId);
 * entity.setSystemLogType(systemLogType);
 * entity.setSystemLogStatus(systemLogStatus);
 * entity.setClassCd(classCd);
 * entity.setMethodCd(methodCd);
 * entity.setProcessInfo(processInfo);
 * entity.setProcessDt(processDt);
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
public abstract class BsBSystemLog extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _systemLogId;

    /** SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)} */
    protected Long _systemLogProcessId;

    /** SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} */
    protected String _systemLogType;

    /** SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} */
    protected String _systemLogStatus;

    /** CLASS_CD: {NotNull, varchar(100)} */
    protected String _classCd;

    /** METHOD_CD: {NotNull, varchar(100)} */
    protected String _methodCd;

    /** PROCESS_INFO: {NotNull, varchar(2147483647)} */
    protected String _processInfo;

    /** PROCESS_DT: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _processDt;

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
        return "B_SYSTEM_LOG";
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
        if (_systemLogId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of systemLogType as the classification of SystemLogType. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SystemLogType getSystemLogTypeAsSystemLogType() {
        return CDef.SystemLogType.codeOf(getSystemLogType());
    }

    /**
     * Set the value of systemLogType as the classification of SystemLogType. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSystemLogTypeAsSystemLogType(CDef.SystemLogType cdef) {
        setSystemLogType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of systemLogStatus as the classification of SystemLogStatus. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SystemLogStatus getSystemLogStatusAsSystemLogStatus() {
        return CDef.SystemLogStatus.codeOf(getSystemLogStatus());
    }

    /**
     * Set the value of systemLogStatus as the classification of SystemLogStatus. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSystemLogStatusAsSystemLogStatus(CDef.SystemLogStatus cdef) {
        setSystemLogStatus(cdef != null ? cdef.code() : null);
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
     * Set the value of systemLogType as $1 (1). <br>
     * $1: 通常
     */
    public void setSystemLogType_$1() {
        setSystemLogTypeAsSystemLogType(CDef.SystemLogType.$1);
    }

    /**
     * Set the value of systemLogType as $2 (2). <br>
     * $2: SQL(SELECT)
     */
    public void setSystemLogType_$2() {
        setSystemLogTypeAsSystemLogType(CDef.SystemLogType.$2);
    }

    /**
     * Set the value of systemLogType as $3 (3). <br>
     * $3: SQL(INSERT)
     */
    public void setSystemLogType_$3() {
        setSystemLogTypeAsSystemLogType(CDef.SystemLogType.$3);
    }

    /**
     * Set the value of systemLogType as $4 (4). <br>
     * $4: SQL(UPDATE)
     */
    public void setSystemLogType_$4() {
        setSystemLogTypeAsSystemLogType(CDef.SystemLogType.$4);
    }

    /**
     * Set the value of systemLogType as $5 (5). <br>
     * $5: SQL(DELETE)
     */
    public void setSystemLogType_$5() {
        setSystemLogTypeAsSystemLogType(CDef.SystemLogType.$5);
    }

    /**
     * Set the value of systemLogType as $6 (6). <br>
     * $6: SQL(OTHERS)
     */
    public void setSystemLogType_$6() {
        setSystemLogTypeAsSystemLogType(CDef.SystemLogType.$6);
    }

    /**
     * Set the value of systemLogStatus as $1 (1). <br>
     * $1: 正常
     */
    public void setSystemLogStatus_$1() {
        setSystemLogStatusAsSystemLogStatus(CDef.SystemLogStatus.$1);
    }

    /**
     * Set the value of systemLogStatus as $2 (2). <br>
     * $2: 異常
     */
    public void setSystemLogStatus_$2() {
        setSystemLogStatusAsSystemLogStatus(CDef.SystemLogStatus.$2);
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
     * Is the value of systemLogType $1? <br>
     * $1: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogType$1() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.equals(CDef.SystemLogType.$1) : false;
    }

    /**
     * Is the value of systemLogType $2? <br>
     * $2: SQL(SELECT)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogType$2() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.equals(CDef.SystemLogType.$2) : false;
    }

    /**
     * Is the value of systemLogType $3? <br>
     * $3: SQL(INSERT)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogType$3() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.equals(CDef.SystemLogType.$3) : false;
    }

    /**
     * Is the value of systemLogType $4? <br>
     * $4: SQL(UPDATE)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogType$4() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.equals(CDef.SystemLogType.$4) : false;
    }

    /**
     * Is the value of systemLogType $5? <br>
     * $5: SQL(DELETE)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogType$5() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.equals(CDef.SystemLogType.$5) : false;
    }

    /**
     * Is the value of systemLogType $6? <br>
     * $6: SQL(OTHERS)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogType$6() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.equals(CDef.SystemLogType.$6) : false;
    }

    /**
     * Is the value of systemLogStatus $1? <br>
     * $1: 正常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogStatus$1() {
        CDef.SystemLogStatus cdef = getSystemLogStatusAsSystemLogStatus();
        return cdef != null ? cdef.equals(CDef.SystemLogStatus.$1) : false;
    }

    /**
     * Is the value of systemLogStatus $2? <br>
     * $2: 異常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemLogStatus$2() {
        CDef.SystemLogStatus cdef = getSystemLogStatusAsSystemLogStatus();
        return cdef != null ? cdef.equals(CDef.SystemLogStatus.$2) : false;
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
     * Get the value of the column 'systemLogType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSystemLogTypeName() {
        CDef.SystemLogType cdef = getSystemLogTypeAsSystemLogType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'systemLogStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSystemLogStatusName() {
        CDef.SystemLogStatus cdef = getSystemLogStatusAsSystemLogStatus();
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
    /** B_CLASS_DTL by my SYSTEM_LOG_TYPE, named 'BClassDtlBySystemLogType'. */
    protected BClassDtl _bClassDtlBySystemLogType;

    /**
     * [get] B_CLASS_DTL by my SYSTEM_LOG_TYPE, named 'BClassDtlBySystemLogType'. <br>
     * @return The entity of foreign property 'BClassDtlBySystemLogType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySystemLogType() {
        return _bClassDtlBySystemLogType;
    }

    /**
     * [set] B_CLASS_DTL by my SYSTEM_LOG_TYPE, named 'BClassDtlBySystemLogType'.
     * @param bClassDtlBySystemLogType The entity of foreign property 'BClassDtlBySystemLogType'. (NullAllowed)
     */
    public void setBClassDtlBySystemLogType(BClassDtl bClassDtlBySystemLogType) {
        _bClassDtlBySystemLogType = bClassDtlBySystemLogType;
    }

    /** B_CLASS_DTL by my SYSTEM_LOG_STATUS, named 'BClassDtlBySystemLogStatus'. */
    protected BClassDtl _bClassDtlBySystemLogStatus;

    /**
     * [get] B_CLASS_DTL by my SYSTEM_LOG_STATUS, named 'BClassDtlBySystemLogStatus'. <br>
     * @return The entity of foreign property 'BClassDtlBySystemLogStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySystemLogStatus() {
        return _bClassDtlBySystemLogStatus;
    }

    /**
     * [set] B_CLASS_DTL by my SYSTEM_LOG_STATUS, named 'BClassDtlBySystemLogStatus'.
     * @param bClassDtlBySystemLogStatus The entity of foreign property 'BClassDtlBySystemLogStatus'. (NullAllowed)
     */
    public void setBClassDtlBySystemLogStatus(BClassDtl bClassDtlBySystemLogStatus) {
        _bClassDtlBySystemLogStatus = bClassDtlBySystemLogStatus;
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
        if (obj instanceof BsBSystemLog) {
            BsBSystemLog other = (BsBSystemLog)obj;
            if (!xSV(_systemLogId, other._systemLogId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _systemLogId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlBySystemLogType != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySystemLogType, "bClassDtlBySystemLogType")); }
        if (_bClassDtlBySystemLogStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySystemLogStatus, "bClassDtlBySystemLogStatus")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_systemLogId));
        sb.append(dm).append(xfND(_systemLogProcessId));
        sb.append(dm).append(xfND(_systemLogType));
        sb.append(dm).append(xfND(_systemLogStatus));
        sb.append(dm).append(xfND(_classCd));
        sb.append(dm).append(xfND(_methodCd));
        sb.append(dm).append(xfND(_processInfo));
        sb.append(dm).append(xfND(_processDt));
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
        if (_bClassDtlBySystemLogType != null)
        { sb.append(dm).append("bClassDtlBySystemLogType"); }
        if (_bClassDtlBySystemLogStatus != null)
        { sb.append(dm).append("bClassDtlBySystemLogStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BSystemLog clone() {
        return (BSystemLog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * システムログID
     * @return The value of the column 'SYSTEM_LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSystemLogId() {
        checkSpecifiedProperty("systemLogId");
        return _systemLogId;
    }

    /**
     * [set] SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * システムログID
     * @param systemLogId The value of the column 'SYSTEM_LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSystemLogId(Long systemLogId) {
        registerModifiedProperty("systemLogId");
        _systemLogId = systemLogId;
    }

    /**
     * [get] SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)} <br>
     * システムログ処理ID
     * @return The value of the column 'SYSTEM_LOG_PROCESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSystemLogProcessId() {
        checkSpecifiedProperty("systemLogProcessId");
        return _systemLogProcessId;
    }

    /**
     * [set] SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)} <br>
     * システムログ処理ID
     * @param systemLogProcessId The value of the column 'SYSTEM_LOG_PROCESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSystemLogProcessId(Long systemLogProcessId) {
        registerModifiedProperty("systemLogProcessId");
        _systemLogProcessId = systemLogProcessId;
    }

    /**
     * [get] SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @return The value of the column 'SYSTEM_LOG_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getSystemLogType() {
        checkSpecifiedProperty("systemLogType");
        return convertEmptyToNull(_systemLogType);
    }

    /**
     * [set] SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param systemLogType The value of the column 'SYSTEM_LOG_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setSystemLogType(String systemLogType) {
        registerModifiedProperty("systemLogType");
        _systemLogType = systemLogType;
    }

    /**
     * [get] SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @return The value of the column 'SYSTEM_LOG_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getSystemLogStatus() {
        checkSpecifiedProperty("systemLogStatus");
        return convertEmptyToNull(_systemLogStatus);
    }

    /**
     * [set] SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param systemLogStatus The value of the column 'SYSTEM_LOG_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setSystemLogStatus(String systemLogStatus) {
        registerModifiedProperty("systemLogStatus");
        _systemLogStatus = systemLogStatus;
    }

    /**
     * [get] CLASS_CD: {NotNull, varchar(100)} <br>
     * クラス名
     * @return The value of the column 'CLASS_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getClassCd() {
        checkSpecifiedProperty("classCd");
        return convertEmptyToNull(_classCd);
    }

    /**
     * [set] CLASS_CD: {NotNull, varchar(100)} <br>
     * クラス名
     * @param classCd The value of the column 'CLASS_CD'. (basically NotNull if update: for the constraint)
     */
    public void setClassCd(String classCd) {
        registerModifiedProperty("classCd");
        _classCd = classCd;
    }

    /**
     * [get] METHOD_CD: {NotNull, varchar(100)} <br>
     * メソッド名
     * @return The value of the column 'METHOD_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getMethodCd() {
        checkSpecifiedProperty("methodCd");
        return convertEmptyToNull(_methodCd);
    }

    /**
     * [set] METHOD_CD: {NotNull, varchar(100)} <br>
     * メソッド名
     * @param methodCd The value of the column 'METHOD_CD'. (basically NotNull if update: for the constraint)
     */
    public void setMethodCd(String methodCd) {
        registerModifiedProperty("methodCd");
        _methodCd = methodCd;
    }

    /**
     * [get] PROCESS_INFO: {NotNull, varchar(2147483647)} <br>
     * 処理情報
     * @return The value of the column 'PROCESS_INFO'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessInfo() {
        checkSpecifiedProperty("processInfo");
        return convertEmptyToNull(_processInfo);
    }

    /**
     * [set] PROCESS_INFO: {NotNull, varchar(2147483647)} <br>
     * 処理情報
     * @param processInfo The value of the column 'PROCESS_INFO'. (basically NotNull if update: for the constraint)
     */
    public void setProcessInfo(String processInfo) {
        registerModifiedProperty("processInfo");
        _processInfo = processInfo;
    }

    /**
     * [get] PROCESS_DT: {NotNull, datetime2(26, 6)} <br>
     * 処理日時
     * @return The value of the column 'PROCESS_DT'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getProcessDt() {
        checkSpecifiedProperty("processDt");
        return _processDt;
    }

    /**
     * [set] PROCESS_DT: {NotNull, datetime2(26, 6)} <br>
     * 処理日時
     * @param processDt The value of the column 'PROCESS_DT'. (basically NotNull if update: for the constraint)
     */
    public void setProcessDt(java.sql.Timestamp processDt) {
        registerModifiedProperty("processDt");
        _processDt = processDt;
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
