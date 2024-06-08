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
 * The entity of B_LOG_DTL as TABLE. <br>
 * ログ明細
 * <pre>
 * [primary-key]
 *     LOG_DTL_ID
 *
 * [column]
 *     LOG_DTL_ID, LOG_ID, LOG_DTL_TYPE, LOG_DTL_STATUS, LOG_DTL_SECTION_ID, LOG_DTL_SECTION_NM, PROCESS_INFO, PROCESS_DT, MESSAGE_REPLACE_STRING1, MESSAGE_REPLACE_STRING2, MESSAGE_REPLACE_STRING3, MESSAGE_REPLACE_STRING4, MESSAGE_REPLACE_STRING5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_LOG, B_CLASS_DTL(ByLogDtlType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bLog, bClassDtlByLogDtlType, bClassDtlByLogDtlStatus
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long logDtlId = entity.getLogDtlId();
 * Long logId = entity.getLogId();
 * String logDtlType = entity.getLogDtlType();
 * String logDtlStatus = entity.getLogDtlStatus();
 * Long logDtlSectionId = entity.getLogDtlSectionId();
 * String logDtlSectionNm = entity.getLogDtlSectionNm();
 * String processInfo = entity.getProcessInfo();
 * java.sql.Timestamp processDt = entity.getProcessDt();
 * String messageReplaceString1 = entity.getMessageReplaceString1();
 * String messageReplaceString2 = entity.getMessageReplaceString2();
 * String messageReplaceString3 = entity.getMessageReplaceString3();
 * String messageReplaceString4 = entity.getMessageReplaceString4();
 * String messageReplaceString5 = entity.getMessageReplaceString5();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setLogDtlId(logDtlId);
 * entity.setLogId(logId);
 * entity.setLogDtlType(logDtlType);
 * entity.setLogDtlStatus(logDtlStatus);
 * entity.setLogDtlSectionId(logDtlSectionId);
 * entity.setLogDtlSectionNm(logDtlSectionNm);
 * entity.setProcessInfo(processInfo);
 * entity.setProcessDt(processDt);
 * entity.setMessageReplaceString1(messageReplaceString1);
 * entity.setMessageReplaceString2(messageReplaceString2);
 * entity.setMessageReplaceString3(messageReplaceString3);
 * entity.setMessageReplaceString4(messageReplaceString4);
 * entity.setMessageReplaceString5(messageReplaceString5);
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
public abstract class BsBLogDtl extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _logDtlId;

    /** LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG} */
    protected Long _logId;

    /** LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} */
    protected String _logDtlType;

    /** LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} */
    protected String _logDtlStatus;

    /** LOG_DTL_SECTION_ID: {bigint(19)} */
    protected Long _logDtlSectionId;

    /** LOG_DTL_SECTION_NM: {varchar(60)} */
    protected String _logDtlSectionNm;

    /** PROCESS_INFO: {NotNull, varchar(2147483647)} */
    protected String _processInfo;

    /** PROCESS_DT: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _processDt;

    /** MESSAGE_REPLACE_STRING1: {varchar(2147483647)} */
    protected String _messageReplaceString1;

    /** MESSAGE_REPLACE_STRING2: {varchar(2147483647)} */
    protected String _messageReplaceString2;

    /** MESSAGE_REPLACE_STRING3: {varchar(2147483647)} */
    protected String _messageReplaceString3;

    /** MESSAGE_REPLACE_STRING4: {varchar(2147483647)} */
    protected String _messageReplaceString4;

    /** MESSAGE_REPLACE_STRING5: {varchar(2147483647)} */
    protected String _messageReplaceString5;

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
        return "B_LOG_DTL";
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
        if (_logDtlId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of logDtlType as the classification of LogDtlType. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LogDtlType getLogDtlTypeAsLogDtlType() {
        return CDef.LogDtlType.codeOf(getLogDtlType());
    }

    /**
     * Set the value of logDtlType as the classification of LogDtlType. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLogDtlTypeAsLogDtlType(CDef.LogDtlType cdef) {
        setLogDtlType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of logDtlStatus as the classification of LogDtlStatus. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LogDtlStatus getLogDtlStatusAsLogDtlStatus() {
        return CDef.LogDtlStatus.codeOf(getLogDtlStatus());
    }

    /**
     * Set the value of logDtlStatus as the classification of LogDtlStatus. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLogDtlStatusAsLogDtlStatus(CDef.LogDtlStatus cdef) {
        setLogDtlStatus(cdef != null ? cdef.code() : null);
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
     * Set the value of logDtlType as $1 (1). <br>
     * $1: セクション開始ログ
     */
    public void setLogDtlType_$1() {
        setLogDtlTypeAsLogDtlType(CDef.LogDtlType.$1);
    }

    /**
     * Set the value of logDtlType as $2 (2). <br>
     * $2: セクション終了ログ
     */
    public void setLogDtlType_$2() {
        setLogDtlTypeAsLogDtlType(CDef.LogDtlType.$2);
    }

    /**
     * Set the value of logDtlType as $3 (3). <br>
     * $3: 明細ログ
     */
    public void setLogDtlType_$3() {
        setLogDtlTypeAsLogDtlType(CDef.LogDtlType.$3);
    }

    /**
     * Set the value of logDtlType as $4 (4). <br>
     * $4: 基盤出力ログ
     */
    public void setLogDtlType_$4() {
        setLogDtlTypeAsLogDtlType(CDef.LogDtlType.$4);
    }

    /**
     * Set the value of logDtlStatus as $1 (1). <br>
     * $1: 情報
     */
    public void setLogDtlStatus_$1() {
        setLogDtlStatusAsLogDtlStatus(CDef.LogDtlStatus.$1);
    }

    /**
     * Set the value of logDtlStatus as $2 (2). <br>
     * $2: 警告
     */
    public void setLogDtlStatus_$2() {
        setLogDtlStatusAsLogDtlStatus(CDef.LogDtlStatus.$2);
    }

    /**
     * Set the value of logDtlStatus as $3 (3). <br>
     * $3: エラー
     */
    public void setLogDtlStatus_$3() {
        setLogDtlStatusAsLogDtlStatus(CDef.LogDtlStatus.$3);
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
     * Is the value of logDtlType $1? <br>
     * $1: セクション開始ログ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlType$1() {
        CDef.LogDtlType cdef = getLogDtlTypeAsLogDtlType();
        return cdef != null ? cdef.equals(CDef.LogDtlType.$1) : false;
    }

    /**
     * Is the value of logDtlType $2? <br>
     * $2: セクション終了ログ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlType$2() {
        CDef.LogDtlType cdef = getLogDtlTypeAsLogDtlType();
        return cdef != null ? cdef.equals(CDef.LogDtlType.$2) : false;
    }

    /**
     * Is the value of logDtlType $3? <br>
     * $3: 明細ログ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlType$3() {
        CDef.LogDtlType cdef = getLogDtlTypeAsLogDtlType();
        return cdef != null ? cdef.equals(CDef.LogDtlType.$3) : false;
    }

    /**
     * Is the value of logDtlType $4? <br>
     * $4: 基盤出力ログ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlType$4() {
        CDef.LogDtlType cdef = getLogDtlTypeAsLogDtlType();
        return cdef != null ? cdef.equals(CDef.LogDtlType.$4) : false;
    }

    /**
     * Is the value of logDtlStatus $1? <br>
     * $1: 情報
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlStatus$1() {
        CDef.LogDtlStatus cdef = getLogDtlStatusAsLogDtlStatus();
        return cdef != null ? cdef.equals(CDef.LogDtlStatus.$1) : false;
    }

    /**
     * Is the value of logDtlStatus $2? <br>
     * $2: 警告
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlStatus$2() {
        CDef.LogDtlStatus cdef = getLogDtlStatusAsLogDtlStatus();
        return cdef != null ? cdef.equals(CDef.LogDtlStatus.$2) : false;
    }

    /**
     * Is the value of logDtlStatus $3? <br>
     * $3: エラー
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogDtlStatus$3() {
        CDef.LogDtlStatus cdef = getLogDtlStatusAsLogDtlStatus();
        return cdef != null ? cdef.equals(CDef.LogDtlStatus.$3) : false;
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
     * Get the value of the column 'logDtlType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLogDtlTypeName() {
        CDef.LogDtlType cdef = getLogDtlTypeAsLogDtlType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'logDtlStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLogDtlStatusName() {
        CDef.LogDtlStatus cdef = getLogDtlStatusAsLogDtlStatus();
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
    /** B_LOG by my LOG_ID, named 'BLog'. */
    protected BLog _bLog;

    /**
     * [get] B_LOG by my LOG_ID, named 'BLog'. <br>
     * @return The entity of foreign property 'BLog'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BLog getBLog() {
        return _bLog;
    }

    /**
     * [set] B_LOG by my LOG_ID, named 'BLog'.
     * @param bLog The entity of foreign property 'BLog'. (NullAllowed)
     */
    public void setBLog(BLog bLog) {
        _bLog = bLog;
    }

    /** B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'. */
    protected BClassDtl _bClassDtlByLogDtlType;

    /**
     * [get] B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'. <br>
     * @return The entity of foreign property 'BClassDtlByLogDtlType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLogDtlType() {
        return _bClassDtlByLogDtlType;
    }

    /**
     * [set] B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'.
     * @param bClassDtlByLogDtlType The entity of foreign property 'BClassDtlByLogDtlType'. (NullAllowed)
     */
    public void setBClassDtlByLogDtlType(BClassDtl bClassDtlByLogDtlType) {
        _bClassDtlByLogDtlType = bClassDtlByLogDtlType;
    }

    /** B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'. */
    protected BClassDtl _bClassDtlByLogDtlStatus;

    /**
     * [get] B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByLogDtlStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLogDtlStatus() {
        return _bClassDtlByLogDtlStatus;
    }

    /**
     * [set] B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'.
     * @param bClassDtlByLogDtlStatus The entity of foreign property 'BClassDtlByLogDtlStatus'. (NullAllowed)
     */
    public void setBClassDtlByLogDtlStatus(BClassDtl bClassDtlByLogDtlStatus) {
        _bClassDtlByLogDtlStatus = bClassDtlByLogDtlStatus;
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
        if (obj instanceof BsBLogDtl) {
            BsBLogDtl other = (BsBLogDtl)obj;
            if (!xSV(_logDtlId, other._logDtlId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _logDtlId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bLog != null)
        { sb.append(li).append(xbRDS(_bLog, "bLog")); }
        if (_bClassDtlByLogDtlType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLogDtlType, "bClassDtlByLogDtlType")); }
        if (_bClassDtlByLogDtlStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLogDtlStatus, "bClassDtlByLogDtlStatus")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_logDtlId));
        sb.append(dm).append(xfND(_logId));
        sb.append(dm).append(xfND(_logDtlType));
        sb.append(dm).append(xfND(_logDtlStatus));
        sb.append(dm).append(xfND(_logDtlSectionId));
        sb.append(dm).append(xfND(_logDtlSectionNm));
        sb.append(dm).append(xfND(_processInfo));
        sb.append(dm).append(xfND(_processDt));
        sb.append(dm).append(xfND(_messageReplaceString1));
        sb.append(dm).append(xfND(_messageReplaceString2));
        sb.append(dm).append(xfND(_messageReplaceString3));
        sb.append(dm).append(xfND(_messageReplaceString4));
        sb.append(dm).append(xfND(_messageReplaceString5));
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
        if (_bLog != null)
        { sb.append(dm).append("bLog"); }
        if (_bClassDtlByLogDtlType != null)
        { sb.append(dm).append("bClassDtlByLogDtlType"); }
        if (_bClassDtlByLogDtlStatus != null)
        { sb.append(dm).append("bClassDtlByLogDtlStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BLogDtl clone() {
        return (BLogDtl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログ明細ID
     * @return The value of the column 'LOG_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLogDtlId() {
        checkSpecifiedProperty("logDtlId");
        return _logDtlId;
    }

    /**
     * [set] LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログ明細ID
     * @param logDtlId The value of the column 'LOG_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLogDtlId(Long logDtlId) {
        registerModifiedProperty("logDtlId");
        _logDtlId = logDtlId;
    }

    /**
     * [get] LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG} <br>
     * ログID
     * @return The value of the column 'LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLogId() {
        checkSpecifiedProperty("logId");
        return _logId;
    }

    /**
     * [set] LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG} <br>
     * ログID
     * @param logId The value of the column 'LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLogId(Long logId) {
        registerModifiedProperty("logId");
        _logId = logId;
    }

    /**
     * [get] LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @return The value of the column 'LOG_DTL_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getLogDtlType() {
        checkSpecifiedProperty("logDtlType");
        return convertEmptyToNull(_logDtlType);
    }

    /**
     * [set] LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param logDtlType The value of the column 'LOG_DTL_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setLogDtlType(String logDtlType) {
        registerModifiedProperty("logDtlType");
        _logDtlType = logDtlType;
    }

    /**
     * [get] LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @return The value of the column 'LOG_DTL_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getLogDtlStatus() {
        checkSpecifiedProperty("logDtlStatus");
        return convertEmptyToNull(_logDtlStatus);
    }

    /**
     * [set] LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param logDtlStatus The value of the column 'LOG_DTL_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setLogDtlStatus(String logDtlStatus) {
        registerModifiedProperty("logDtlStatus");
        _logDtlStatus = logDtlStatus;
    }

    /**
     * [get] LOG_DTL_SECTION_ID: {bigint(19)} <br>
     * ログ明細セクションID
     * @return The value of the column 'LOG_DTL_SECTION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLogDtlSectionId() {
        checkSpecifiedProperty("logDtlSectionId");
        return _logDtlSectionId;
    }

    /**
     * [set] LOG_DTL_SECTION_ID: {bigint(19)} <br>
     * ログ明細セクションID
     * @param logDtlSectionId The value of the column 'LOG_DTL_SECTION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogDtlSectionId(Long logDtlSectionId) {
        registerModifiedProperty("logDtlSectionId");
        _logDtlSectionId = logDtlSectionId;
    }

    /**
     * [get] LOG_DTL_SECTION_NM: {varchar(60)} <br>
     * ログ明細セクション名称
     * @return The value of the column 'LOG_DTL_SECTION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogDtlSectionNm() {
        checkSpecifiedProperty("logDtlSectionNm");
        return convertEmptyToNull(_logDtlSectionNm);
    }

    /**
     * [set] LOG_DTL_SECTION_NM: {varchar(60)} <br>
     * ログ明細セクション名称
     * @param logDtlSectionNm The value of the column 'LOG_DTL_SECTION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogDtlSectionNm(String logDtlSectionNm) {
        registerModifiedProperty("logDtlSectionNm");
        _logDtlSectionNm = logDtlSectionNm;
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
     * [get] MESSAGE_REPLACE_STRING1: {varchar(2147483647)} <br>
     * メッセージ差替文字列1
     * @return The value of the column 'MESSAGE_REPLACE_STRING1'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageReplaceString1() {
        checkSpecifiedProperty("messageReplaceString1");
        return convertEmptyToNull(_messageReplaceString1);
    }

    /**
     * [set] MESSAGE_REPLACE_STRING1: {varchar(2147483647)} <br>
     * メッセージ差替文字列1
     * @param messageReplaceString1 The value of the column 'MESSAGE_REPLACE_STRING1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageReplaceString1(String messageReplaceString1) {
        registerModifiedProperty("messageReplaceString1");
        _messageReplaceString1 = messageReplaceString1;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING2: {varchar(2147483647)} <br>
     * メッセージ差替文字列2
     * @return The value of the column 'MESSAGE_REPLACE_STRING2'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageReplaceString2() {
        checkSpecifiedProperty("messageReplaceString2");
        return convertEmptyToNull(_messageReplaceString2);
    }

    /**
     * [set] MESSAGE_REPLACE_STRING2: {varchar(2147483647)} <br>
     * メッセージ差替文字列2
     * @param messageReplaceString2 The value of the column 'MESSAGE_REPLACE_STRING2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageReplaceString2(String messageReplaceString2) {
        registerModifiedProperty("messageReplaceString2");
        _messageReplaceString2 = messageReplaceString2;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING3: {varchar(2147483647)} <br>
     * メッセージ差替文字列3
     * @return The value of the column 'MESSAGE_REPLACE_STRING3'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageReplaceString3() {
        checkSpecifiedProperty("messageReplaceString3");
        return convertEmptyToNull(_messageReplaceString3);
    }

    /**
     * [set] MESSAGE_REPLACE_STRING3: {varchar(2147483647)} <br>
     * メッセージ差替文字列3
     * @param messageReplaceString3 The value of the column 'MESSAGE_REPLACE_STRING3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageReplaceString3(String messageReplaceString3) {
        registerModifiedProperty("messageReplaceString3");
        _messageReplaceString3 = messageReplaceString3;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING4: {varchar(2147483647)} <br>
     * メッセージ差替文字列4
     * @return The value of the column 'MESSAGE_REPLACE_STRING4'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageReplaceString4() {
        checkSpecifiedProperty("messageReplaceString4");
        return convertEmptyToNull(_messageReplaceString4);
    }

    /**
     * [set] MESSAGE_REPLACE_STRING4: {varchar(2147483647)} <br>
     * メッセージ差替文字列4
     * @param messageReplaceString4 The value of the column 'MESSAGE_REPLACE_STRING4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageReplaceString4(String messageReplaceString4) {
        registerModifiedProperty("messageReplaceString4");
        _messageReplaceString4 = messageReplaceString4;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING5: {varchar(2147483647)} <br>
     * メッセージ差替文字列5
     * @return The value of the column 'MESSAGE_REPLACE_STRING5'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageReplaceString5() {
        checkSpecifiedProperty("messageReplaceString5");
        return convertEmptyToNull(_messageReplaceString5);
    }

    /**
     * [set] MESSAGE_REPLACE_STRING5: {varchar(2147483647)} <br>
     * メッセージ差替文字列5
     * @param messageReplaceString5 The value of the column 'MESSAGE_REPLACE_STRING5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageReplaceString5(String messageReplaceString5) {
        registerModifiedProperty("messageReplaceString5");
        _messageReplaceString5 = messageReplaceString5;
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
