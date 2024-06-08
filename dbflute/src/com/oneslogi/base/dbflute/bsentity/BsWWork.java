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
 * The entity of W_WORK as TABLE. <br>
 * 勤務実績ワーク
 * <pre>
 * [primary-key]
 *     WORK_ID
 *
 * [column]
 *     WORK_ID, CENTER_CD, WORK_USER_CD, WORK_DT, CLOCK_IN_FLG, CLOCK_OUT_FLG, ENTRY_START_DT, ENTRY_START_TM, ENTRY_END_DT, ENTRY_END_TM, BREAK_START_FLG, BREAK_START_DT, BREAK_START_TM, BREAK_END_DT, BREAK_END_TM, FORCED_CLOCK_OUT_FLG, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_ID
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
 * Long workId = entity.getWorkId();
 * String centerCd = entity.getCenterCd();
 * String workUserCd = entity.getWorkUserCd();
 * String workDt = entity.getWorkDt();
 * String clockInFlg = entity.getClockInFlg();
 * String clockOutFlg = entity.getClockOutFlg();
 * String entryStartDt = entity.getEntryStartDt();
 * String entryStartTm = entity.getEntryStartTm();
 * String entryEndDt = entity.getEntryEndDt();
 * String entryEndTm = entity.getEntryEndTm();
 * String breakStartFlg = entity.getBreakStartFlg();
 * String breakStartDt = entity.getBreakStartDt();
 * String breakStartTm = entity.getBreakStartTm();
 * String breakEndDt = entity.getBreakEndDt();
 * String breakEndTm = entity.getBreakEndTm();
 * String forcedClockOutFlg = entity.getForcedClockOutFlg();
 * String workFlg = entity.getWorkFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMsg = entity.getErrorMsg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWorkId(workId);
 * entity.setCenterCd(centerCd);
 * entity.setWorkUserCd(workUserCd);
 * entity.setWorkDt(workDt);
 * entity.setClockInFlg(clockInFlg);
 * entity.setClockOutFlg(clockOutFlg);
 * entity.setEntryStartDt(entryStartDt);
 * entity.setEntryStartTm(entryStartTm);
 * entity.setEntryEndDt(entryEndDt);
 * entity.setEntryEndTm(entryEndTm);
 * entity.setBreakStartFlg(breakStartFlg);
 * entity.setBreakStartDt(breakStartDt);
 * entity.setBreakStartTm(breakStartTm);
 * entity.setBreakEndDt(breakEndDt);
 * entity.setBreakEndTm(breakEndTm);
 * entity.setForcedClockOutFlg(forcedClockOutFlg);
 * entity.setWorkFlg(workFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMsg(errorMsg);
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
public abstract class BsWWork extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WORK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _workId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** WORK_USER_CD: {varchar(30)} */
    protected String _workUserCd;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** CLOCK_IN_FLG: {char(1), default=[0]} */
    protected String _clockInFlg;

    /** CLOCK_OUT_FLG: {char(1), default=[0]} */
    protected String _clockOutFlg;

    /** ENTRY_START_DT: {varchar(8)} */
    protected String _entryStartDt;

    /** ENTRY_START_TM: {varchar(6)} */
    protected String _entryStartTm;

    /** ENTRY_END_DT: {varchar(8)} */
    protected String _entryEndDt;

    /** ENTRY_END_TM: {varchar(6)} */
    protected String _entryEndTm;

    /** BREAK_START_FLG: {char(1), default=[0]} */
    protected String _breakStartFlg;

    /** BREAK_START_DT: {varchar(8)} */
    protected String _breakStartDt;

    /** BREAK_START_TM: {varchar(6)} */
    protected String _breakStartTm;

    /** BREAK_END_DT: {varchar(8)} */
    protected String _breakEndDt;

    /** BREAK_END_TM: {varchar(6)} */
    protected String _breakEndTm;

    /** FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} */
    protected String _forcedClockOutFlg;

    /** WORK_FLG: {char(1), default=[0]} */
    protected String _workFlg;

    /** ERROR_FLG: {char(1), default=[(0)]} */
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    protected String _errorMsg;

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
        return "W_WORK";
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
        if (_workId == null) { return false; }
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
        if (obj instanceof BsWWork) {
            BsWWork other = (BsWWork)obj;
            if (!xSV(_workId, other._workId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _workId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_workId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_workUserCd));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_clockInFlg));
        sb.append(dm).append(xfND(_clockOutFlg));
        sb.append(dm).append(xfND(_entryStartDt));
        sb.append(dm).append(xfND(_entryStartTm));
        sb.append(dm).append(xfND(_entryEndDt));
        sb.append(dm).append(xfND(_entryEndTm));
        sb.append(dm).append(xfND(_breakStartFlg));
        sb.append(dm).append(xfND(_breakStartDt));
        sb.append(dm).append(xfND(_breakStartTm));
        sb.append(dm).append(xfND(_breakEndDt));
        sb.append(dm).append(xfND(_breakEndTm));
        sb.append(dm).append(xfND(_forcedClockOutFlg));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMsg));
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
    public WWork clone() {
        return (WWork)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WORK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 勤務実績ワークID
     * @return The value of the column 'WORK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWorkId() {
        checkSpecifiedProperty("workId");
        return _workId;
    }

    /**
     * [set] WORK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 勤務実績ワークID
     * @param workId The value of the column 'WORK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWorkId(Long workId) {
        registerModifiedProperty("workId");
        _workId = workId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] WORK_USER_CD: {varchar(30)} <br>
     * 作業者CD
     * @return The value of the column 'WORK_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkUserCd() {
        checkSpecifiedProperty("workUserCd");
        return convertEmptyToNull(_workUserCd);
    }

    /**
     * [set] WORK_USER_CD: {varchar(30)} <br>
     * 作業者CD
     * @param workUserCd The value of the column 'WORK_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkUserCd(String workUserCd) {
        registerModifiedProperty("workUserCd");
        _workUserCd = workUserCd;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] CLOCK_IN_FLG: {char(1), default=[0]} <br>
     * 出勤フラグ
     * @return The value of the column 'CLOCK_IN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getClockInFlg() {
        checkSpecifiedProperty("clockInFlg");
        return convertEmptyToNull(_clockInFlg);
    }

    /**
     * [set] CLOCK_IN_FLG: {char(1), default=[0]} <br>
     * 出勤フラグ
     * @param clockInFlg The value of the column 'CLOCK_IN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClockInFlg(String clockInFlg) {
        registerModifiedProperty("clockInFlg");
        _clockInFlg = clockInFlg;
    }

    /**
     * [get] CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 退勤フラグ
     * @return The value of the column 'CLOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getClockOutFlg() {
        checkSpecifiedProperty("clockOutFlg");
        return convertEmptyToNull(_clockOutFlg);
    }

    /**
     * [set] CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 退勤フラグ
     * @param clockOutFlg The value of the column 'CLOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClockOutFlg(String clockOutFlg) {
        registerModifiedProperty("clockOutFlg");
        _clockOutFlg = clockOutFlg;
    }

    /**
     * [get] ENTRY_START_DT: {varchar(8)} <br>
     * 打刻開始日
     * @return The value of the column 'ENTRY_START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getEntryStartDt() {
        checkSpecifiedProperty("entryStartDt");
        return convertEmptyToNull(_entryStartDt);
    }

    /**
     * [set] ENTRY_START_DT: {varchar(8)} <br>
     * 打刻開始日
     * @param entryStartDt The value of the column 'ENTRY_START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryStartDt(String entryStartDt) {
        registerModifiedProperty("entryStartDt");
        _entryStartDt = entryStartDt;
    }

    /**
     * [get] ENTRY_START_TM: {varchar(6)} <br>
     * 打刻開始時刻
     * @return The value of the column 'ENTRY_START_TM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEntryStartTm() {
        checkSpecifiedProperty("entryStartTm");
        return convertEmptyToNull(_entryStartTm);
    }

    /**
     * [set] ENTRY_START_TM: {varchar(6)} <br>
     * 打刻開始時刻
     * @param entryStartTm The value of the column 'ENTRY_START_TM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryStartTm(String entryStartTm) {
        registerModifiedProperty("entryStartTm");
        _entryStartTm = entryStartTm;
    }

    /**
     * [get] ENTRY_END_DT: {varchar(8)} <br>
     * 打刻終了日
     * @return The value of the column 'ENTRY_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getEntryEndDt() {
        checkSpecifiedProperty("entryEndDt");
        return convertEmptyToNull(_entryEndDt);
    }

    /**
     * [set] ENTRY_END_DT: {varchar(8)} <br>
     * 打刻終了日
     * @param entryEndDt The value of the column 'ENTRY_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryEndDt(String entryEndDt) {
        registerModifiedProperty("entryEndDt");
        _entryEndDt = entryEndDt;
    }

    /**
     * [get] ENTRY_END_TM: {varchar(6)} <br>
     * 打刻終了時刻
     * @return The value of the column 'ENTRY_END_TM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEntryEndTm() {
        checkSpecifiedProperty("entryEndTm");
        return convertEmptyToNull(_entryEndTm);
    }

    /**
     * [set] ENTRY_END_TM: {varchar(6)} <br>
     * 打刻終了時刻
     * @param entryEndTm The value of the column 'ENTRY_END_TM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryEndTm(String entryEndTm) {
        registerModifiedProperty("entryEndTm");
        _entryEndTm = entryEndTm;
    }

    /**
     * [get] BREAK_START_FLG: {char(1), default=[0]} <br>
     * 休憩開始フラグ
     * @return The value of the column 'BREAK_START_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getBreakStartFlg() {
        checkSpecifiedProperty("breakStartFlg");
        return convertEmptyToNull(_breakStartFlg);
    }

    /**
     * [set] BREAK_START_FLG: {char(1), default=[0]} <br>
     * 休憩開始フラグ
     * @param breakStartFlg The value of the column 'BREAK_START_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBreakStartFlg(String breakStartFlg) {
        registerModifiedProperty("breakStartFlg");
        _breakStartFlg = breakStartFlg;
    }

    /**
     * [get] BREAK_START_DT: {varchar(8)} <br>
     * 休憩開始日
     * @return The value of the column 'BREAK_START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getBreakStartDt() {
        checkSpecifiedProperty("breakStartDt");
        return convertEmptyToNull(_breakStartDt);
    }

    /**
     * [set] BREAK_START_DT: {varchar(8)} <br>
     * 休憩開始日
     * @param breakStartDt The value of the column 'BREAK_START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBreakStartDt(String breakStartDt) {
        registerModifiedProperty("breakStartDt");
        _breakStartDt = breakStartDt;
    }

    /**
     * [get] BREAK_START_TM: {varchar(6)} <br>
     * 休憩開始時刻
     * @return The value of the column 'BREAK_START_TM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBreakStartTm() {
        checkSpecifiedProperty("breakStartTm");
        return convertEmptyToNull(_breakStartTm);
    }

    /**
     * [set] BREAK_START_TM: {varchar(6)} <br>
     * 休憩開始時刻
     * @param breakStartTm The value of the column 'BREAK_START_TM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBreakStartTm(String breakStartTm) {
        registerModifiedProperty("breakStartTm");
        _breakStartTm = breakStartTm;
    }

    /**
     * [get] BREAK_END_DT: {varchar(8)} <br>
     * 休憩終了日
     * @return The value of the column 'BREAK_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getBreakEndDt() {
        checkSpecifiedProperty("breakEndDt");
        return convertEmptyToNull(_breakEndDt);
    }

    /**
     * [set] BREAK_END_DT: {varchar(8)} <br>
     * 休憩終了日
     * @param breakEndDt The value of the column 'BREAK_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBreakEndDt(String breakEndDt) {
        registerModifiedProperty("breakEndDt");
        _breakEndDt = breakEndDt;
    }

    /**
     * [get] BREAK_END_TM: {varchar(6)} <br>
     * 休憩終了時刻
     * @return The value of the column 'BREAK_END_TM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBreakEndTm() {
        checkSpecifiedProperty("breakEndTm");
        return convertEmptyToNull(_breakEndTm);
    }

    /**
     * [set] BREAK_END_TM: {varchar(6)} <br>
     * 休憩終了時刻
     * @param breakEndTm The value of the column 'BREAK_END_TM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBreakEndTm(String breakEndTm) {
        registerModifiedProperty("breakEndTm");
        _breakEndTm = breakEndTm;
    }

    /**
     * [get] FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 強制退勤フラグ
     * @return The value of the column 'FORCED_CLOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForcedClockOutFlg() {
        checkSpecifiedProperty("forcedClockOutFlg");
        return convertEmptyToNull(_forcedClockOutFlg);
    }

    /**
     * [set] FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 強制退勤フラグ
     * @param forcedClockOutFlg The value of the column 'FORCED_CLOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForcedClockOutFlg(String forcedClockOutFlg) {
        registerModifiedProperty("forcedClockOutFlg");
        _forcedClockOutFlg = forcedClockOutFlg;
    }

    /**
     * [get] WORK_FLG: {char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMsg() {
        checkSpecifiedProperty("errorMsg");
        return convertEmptyToNull(_errorMsg);
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMsg(String errorMsg) {
        registerModifiedProperty("errorMsg");
        _errorMsg = errorMsg;
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
