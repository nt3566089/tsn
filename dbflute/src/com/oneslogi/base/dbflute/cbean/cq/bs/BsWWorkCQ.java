package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of W_WORK.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWorkCQ extends AbstractBsWWorkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWorkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWorkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WORK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWorkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWorkCIQ xcreateCIQ() {
        WWorkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWorkCIQ xnewCIQ() {
        return new WWorkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WORK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWorkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWorkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _workId;
    public ConditionValue xdfgetWorkId()
    { if (_workId == null) { _workId = nCV(); }
      return _workId; }
    protected ConditionValue xgetCValueWorkId() { return xdfgetWorkId(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkId_Asc() { regOBA("WORK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkId_Desc() { regOBD("WORK_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _workUserCd;
    public ConditionValue xdfgetWorkUserCd()
    { if (_workUserCd == null) { _workUserCd = nCV(); }
      return _workUserCd; }
    protected ConditionValue xgetCValueWorkUserCd() { return xdfgetWorkUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkUserCd_Asc() { regOBA("WORK_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkUserCd_Desc() { regOBD("WORK_USER_CD"); return this; }

    protected ConditionValue _workDt;
    public ConditionValue xdfgetWorkDt()
    { if (_workDt == null) { _workDt = nCV(); }
      return _workDt; }
    protected ConditionValue xgetCValueWorkDt() { return xdfgetWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _clockInFlg;
    public ConditionValue xdfgetClockInFlg()
    { if (_clockInFlg == null) { _clockInFlg = nCV(); }
      return _clockInFlg; }
    protected ConditionValue xgetCValueClockInFlg() { return xdfgetClockInFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ClockInFlg_Asc() { regOBA("CLOCK_IN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ClockInFlg_Desc() { regOBD("CLOCK_IN_FLG"); return this; }

    protected ConditionValue _clockOutFlg;
    public ConditionValue xdfgetClockOutFlg()
    { if (_clockOutFlg == null) { _clockOutFlg = nCV(); }
      return _clockOutFlg; }
    protected ConditionValue xgetCValueClockOutFlg() { return xdfgetClockOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ClockOutFlg_Asc() { regOBA("CLOCK_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ClockOutFlg_Desc() { regOBD("CLOCK_OUT_FLG"); return this; }

    protected ConditionValue _entryStartDt;
    public ConditionValue xdfgetEntryStartDt()
    { if (_entryStartDt == null) { _entryStartDt = nCV(); }
      return _entryStartDt; }
    protected ConditionValue xgetCValueEntryStartDt() { return xdfgetEntryStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryStartDt_Asc() { regOBA("ENTRY_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTRY_START_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryStartDt_Desc() { regOBD("ENTRY_START_DT"); return this; }

    protected ConditionValue _entryStartTm;
    public ConditionValue xdfgetEntryStartTm()
    { if (_entryStartTm == null) { _entryStartTm = nCV(); }
      return _entryStartTm; }
    protected ConditionValue xgetCValueEntryStartTm() { return xdfgetEntryStartTm(); }

    /**
     * Add order-by as ascend. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryStartTm_Asc() { regOBA("ENTRY_START_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTRY_START_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryStartTm_Desc() { regOBD("ENTRY_START_TM"); return this; }

    protected ConditionValue _entryEndDt;
    public ConditionValue xdfgetEntryEndDt()
    { if (_entryEndDt == null) { _entryEndDt = nCV(); }
      return _entryEndDt; }
    protected ConditionValue xgetCValueEntryEndDt() { return xdfgetEntryEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryEndDt_Asc() { regOBA("ENTRY_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTRY_END_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryEndDt_Desc() { regOBD("ENTRY_END_DT"); return this; }

    protected ConditionValue _entryEndTm;
    public ConditionValue xdfgetEntryEndTm()
    { if (_entryEndTm == null) { _entryEndTm = nCV(); }
      return _entryEndTm; }
    protected ConditionValue xgetCValueEntryEndTm() { return xdfgetEntryEndTm(); }

    /**
     * Add order-by as ascend. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryEndTm_Asc() { regOBA("ENTRY_END_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTRY_END_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_EntryEndTm_Desc() { regOBD("ENTRY_END_TM"); return this; }

    protected ConditionValue _breakStartFlg;
    public ConditionValue xdfgetBreakStartFlg()
    { if (_breakStartFlg == null) { _breakStartFlg = nCV(); }
      return _breakStartFlg; }
    protected ConditionValue xgetCValueBreakStartFlg() { return xdfgetBreakStartFlg(); }

    /**
     * Add order-by as ascend. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakStartFlg_Asc() { regOBA("BREAK_START_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BREAK_START_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakStartFlg_Desc() { regOBD("BREAK_START_FLG"); return this; }

    protected ConditionValue _breakStartDt;
    public ConditionValue xdfgetBreakStartDt()
    { if (_breakStartDt == null) { _breakStartDt = nCV(); }
      return _breakStartDt; }
    protected ConditionValue xgetCValueBreakStartDt() { return xdfgetBreakStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * BREAK_START_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakStartDt_Asc() { regOBA("BREAK_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * BREAK_START_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakStartDt_Desc() { regOBD("BREAK_START_DT"); return this; }

    protected ConditionValue _breakStartTm;
    public ConditionValue xdfgetBreakStartTm()
    { if (_breakStartTm == null) { _breakStartTm = nCV(); }
      return _breakStartTm; }
    protected ConditionValue xgetCValueBreakStartTm() { return xdfgetBreakStartTm(); }

    /**
     * Add order-by as ascend. <br>
     * BREAK_START_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakStartTm_Asc() { regOBA("BREAK_START_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BREAK_START_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakStartTm_Desc() { regOBD("BREAK_START_TM"); return this; }

    protected ConditionValue _breakEndDt;
    public ConditionValue xdfgetBreakEndDt()
    { if (_breakEndDt == null) { _breakEndDt = nCV(); }
      return _breakEndDt; }
    protected ConditionValue xgetCValueBreakEndDt() { return xdfgetBreakEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * BREAK_END_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakEndDt_Asc() { regOBA("BREAK_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * BREAK_END_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakEndDt_Desc() { regOBD("BREAK_END_DT"); return this; }

    protected ConditionValue _breakEndTm;
    public ConditionValue xdfgetBreakEndTm()
    { if (_breakEndTm == null) { _breakEndTm = nCV(); }
      return _breakEndTm; }
    protected ConditionValue xgetCValueBreakEndTm() { return xdfgetBreakEndTm(); }

    /**
     * Add order-by as ascend. <br>
     * BREAK_END_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakEndTm_Asc() { regOBA("BREAK_END_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BREAK_END_TM: {varchar(6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_BreakEndTm_Desc() { regOBD("BREAK_END_TM"); return this; }

    protected ConditionValue _forcedClockOutFlg;
    public ConditionValue xdfgetForcedClockOutFlg()
    { if (_forcedClockOutFlg == null) { _forcedClockOutFlg = nCV(); }
      return _forcedClockOutFlg; }
    protected ConditionValue xgetCValueForcedClockOutFlg() { return xdfgetForcedClockOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ForcedClockOutFlg_Asc() { regOBA("FORCED_CLOCK_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ForcedClockOutFlg_Desc() { regOBD("FORCED_CLOCK_OUT_FLG"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWorkCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWWorkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWWorkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WWorkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWorkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WWorkCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WWorkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WWorkCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WWorkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WWorkCQ> _myselfExistsMap;
    public Map<String, WWorkCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WWorkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WWorkCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WWorkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWorkCB.class.getName(); }
    protected String xCQ() { return WWorkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
