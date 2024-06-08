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
 * The base condition-query of T_MOVE_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTMoveInstHCQ extends AbstractBsTMoveInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMoveInstHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMoveInstHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_MOVE_INST_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TMoveInstHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TMoveInstHCIQ xcreateCIQ() {
        TMoveInstHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TMoveInstHCIQ xnewCIQ() {
        return new TMoveInstHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_MOVE_INST_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TMoveInstHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TMoveInstHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _moveInstHId;
    public ConditionValue xdfgetMoveInstHId()
    { if (_moveInstHId == null) { _moveInstHId = nCV(); }
      return _moveInstHId; }
    protected ConditionValue xgetCValueMoveInstHId() { return xdfgetMoveInstHId(); }

    public Map<String, TInventoryBCQ> xdfgetMoveInstHId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("moveInstHId_ExistsReferrer_TInventoryBList"); }
    public String keepMoveInstHId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("moveInstHId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetMoveInstHId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("moveInstHId_ExistsReferrer_TMoveInstBList"); }
    public String keepMoveInstHId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("moveInstHId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TMoveInstRCQ> xdfgetMoveInstHId_ExistsReferrer_TMoveInstRAsOne() { return xgetSQueMap("moveInstHId_ExistsReferrer_TMoveInstRAsOne"); }
    public String keepMoveInstHId_ExistsReferrer_TMoveInstRAsOne(TMoveInstRCQ sq) { return xkeepSQue("moveInstHId_ExistsReferrer_TMoveInstRAsOne", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstHId_ExistsReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstHId_ExistsReferrer_TMoveRecordBList"); }
    public String keepMoveInstHId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstHId_ExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetMoveInstHId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("moveInstHId_NotExistsReferrer_TInventoryBList"); }
    public String keepMoveInstHId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("moveInstHId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetMoveInstHId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("moveInstHId_NotExistsReferrer_TMoveInstBList"); }
    public String keepMoveInstHId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("moveInstHId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TMoveInstRCQ> xdfgetMoveInstHId_NotExistsReferrer_TMoveInstRAsOne() { return xgetSQueMap("moveInstHId_NotExistsReferrer_TMoveInstRAsOne"); }
    public String keepMoveInstHId_NotExistsReferrer_TMoveInstRAsOne(TMoveInstRCQ sq) { return xkeepSQue("moveInstHId_NotExistsReferrer_TMoveInstRAsOne", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstHId_NotExistsReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstHId_NotExistsReferrer_TMoveRecordBList"); }
    public String keepMoveInstHId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstHId_NotExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetMoveInstHId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("moveInstHId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepMoveInstHId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("moveInstHId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetMoveInstHId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("moveInstHId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepMoveInstHId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("moveInstHId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstHId_SpecifyDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstHId_SpecifyDerivedReferrer_TMoveRecordBList"); }
    public String keepMoveInstHId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstHId_SpecifyDerivedReferrer_TMoveRecordBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetMoveInstHId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("moveInstHId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepMoveInstHId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("moveInstHId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetMoveInstHId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("moveInstHId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepMoveInstHId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("moveInstHId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetMoveInstHId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("moveInstHId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("moveInstHId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetMoveInstHId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("moveInstHId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("moveInstHId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstHId_QueryDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstHId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstHId_QueryDerivedReferrer_TMoveRecordBList", sq); }
    public Map<String, Object> xdfgetMoveInstHId_QueryDerivedReferrer_TMoveRecordBListParameter() { return xgetSQuePmMap("moveInstHId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveRecordBListParameter(Object pm) { return xkeepSQuePm("moveInstHId_QueryDerivedReferrer_TMoveRecordBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveInstHId_Asc() { regOBA("MOVE_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveInstHId_Desc() { regOBD("MOVE_INST_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _instDt;
    public ConditionValue xdfgetInstDt()
    { if (_instDt == null) { _instDt = nCV(); }
      return _instDt; }
    protected ConditionValue xgetCValueInstDt() { return xdfgetInstDt(); }

    /**
     * Add order-by as ascend. <br>
     * INST_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_InstDt_Asc() { regOBA("INST_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_InstDt_Desc() { regOBD("INST_DT"); return this; }

    protected ConditionValue _moveSlipNo;
    public ConditionValue xdfgetMoveSlipNo()
    { if (_moveSlipNo == null) { _moveSlipNo = nCV(); }
      return _moveSlipNo; }
    protected ConditionValue xgetCValueMoveSlipNo() { return xdfgetMoveSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_SLIP_NO: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveSlipNo_Asc() { regOBA("MOVE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_SLIP_NO: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveSlipNo_Desc() { regOBD("MOVE_SLIP_NO"); return this; }

    protected ConditionValue _processTypeId;
    public ConditionValue xdfgetProcessTypeId()
    { if (_processTypeId == null) { _processTypeId = nCV(); }
      return _processTypeId; }
    protected ConditionValue xgetCValueProcessTypeId() { return xdfgetProcessTypeId(); }

    public Map<String, MProcessTypeCQ> getProcessTypeId_InScopeRelation_MProcessType() { return xgetSQueMap("processTypeId_InScopeRelation_MProcessType"); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq) { return xkeepSQue("processTypeId_InScopeRelation_MProcessType", sq); }

    public Map<String, MProcessTypeCQ> getProcessTypeId_NotInScopeRelation_MProcessType() { return xgetSQueMap("processTypeId_NotInScopeRelation_MProcessType"); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq) { return xkeepSQue("processTypeId_NotInScopeRelation_MProcessType", sq); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _moveInstStatus;
    public ConditionValue xdfgetMoveInstStatus()
    { if (_moveInstStatus == null) { _moveInstStatus = nCV(); }
      return _moveInstStatus; }
    protected ConditionValue xgetCValueMoveInstStatus() { return xdfgetMoveInstStatus(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveInstStatus_Asc() { regOBA("MOVE_INST_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveInstStatus_Desc() { regOBD("MOVE_INST_STATUS"); return this; }

    protected ConditionValue _inputType;
    public ConditionValue xdfgetInputType()
    { if (_inputType == null) { _inputType = nCV(); }
      return _inputType; }
    protected ConditionValue xgetCValueInputType() { return xdfgetInputType(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

    protected ConditionValue _moveInstComment;
    public ConditionValue xdfgetMoveInstComment()
    { if (_moveInstComment == null) { _moveInstComment = nCV(); }
      return _moveInstComment; }
    protected ConditionValue xgetCValueMoveInstComment() { return xdfgetMoveInstComment(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveInstComment_Asc() { regOBA("MOVE_INST_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_MoveInstComment_Desc() { regOBD("MOVE_INST_COMMENT"); return this; }

    protected ConditionValue _sourceBatchNo;
    public ConditionValue xdfgetSourceBatchNo()
    { if (_sourceBatchNo == null) { _sourceBatchNo = nCV(); }
      return _sourceBatchNo; }
    protected ConditionValue xgetCValueSourceBatchNo() { return xdfgetSourceBatchNo(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_BATCH_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_SourceBatchNo_Asc() { regOBA("SOURCE_BATCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_BATCH_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_SourceBatchNo_Desc() { regOBD("SOURCE_BATCH_NO"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTMoveInstHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveInstHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTMoveInstHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTMoveInstHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TMoveInstHCQ bq = (TMoveInstHCQ)bqs;
        TMoveInstHCQ uq = (TMoveInstHCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByMoveInstStatus()) {
            uq.queryBClassDtlByMoveInstStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByMoveInstStatus(), uq.queryBClassDtlByMoveInstStatus());
        }
        if (bq.hasConditionQueryTMoveInstRAsOne()) {
            uq.queryTMoveInstRAsOne().reflectRelationOnUnionQuery(bq.queryTMoveInstRAsOne(), uq.queryTMoveInstRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_MOVE_INST_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProcessTypeCQ queryMProcessType() {
        return xdfgetConditionQueryMProcessType();
    }
    public MProcessTypeCQ xdfgetConditionQueryMProcessType() {
        String prop = "mProcessType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProcessType()); xsetupOuterJoinMProcessType(); }
        return xgetQueRlMap(prop);
    }
    protected MProcessTypeCQ xcreateQueryMProcessType() {
        String nrp = xresolveNRP("T_MOVE_INST_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_MOVE_INST_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInputType() {
        return xdfgetConditionQueryBClassDtlByInputType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInputType() {
        String prop = "bClassDtlByInputType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInputType()); xsetupOuterJoinBClassDtlByInputType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInputType() {
        String nrp = xresolveNRP("T_MOVE_INST_H", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInputType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInputType() { xregOutJo("bClassDtlByInputType"); }
    public boolean hasConditionQueryBClassDtlByInputType() { return xhasQueRlMap("bClassDtlByInputType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMoveInstStatus() {
        return xdfgetConditionQueryBClassDtlByMoveInstStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMoveInstStatus() {
        String prop = "bClassDtlByMoveInstStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMoveInstStatus()); xsetupOuterJoinBClassDtlByMoveInstStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMoveInstStatus() {
        String nrp = xresolveNRP("T_MOVE_INST_H", "bClassDtlByMoveInstStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMoveInstStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMoveInstStatus() { xregOutJo("bClassDtlByMoveInstStatus"); }
    public boolean hasConditionQueryBClassDtlByMoveInstStatus() { return xhasQueRlMap("bClassDtlByMoveInstStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_INST_R by MOVE_INST_H_ID, named 'TMoveInstRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveInstRCQ queryTMoveInstRAsOne() { return xdfgetConditionQueryTMoveInstRAsOne(); }
    public TMoveInstRCQ xdfgetConditionQueryTMoveInstRAsOne() {
        String prop = "tMoveInstRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveInstRAsOne()); xsetupOuterJoinTMoveInstRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveInstRCQ xcreateQueryTMoveInstRAsOne() {
        String nrp = xresolveNRP("T_MOVE_INST_H", "tMoveInstRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstRAsOne", nrp);
    }
    protected void xsetupOuterJoinTMoveInstRAsOne() { xregOutJo("tMoveInstRAsOne"); }
    public boolean hasConditionQueryTMoveInstRAsOne() { return xhasQueRlMap("tMoveInstRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TMoveInstHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TMoveInstHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TMoveInstHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TMoveInstHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TMoveInstHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TMoveInstHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TMoveInstHCQ> _myselfExistsMap;
    public Map<String, TMoveInstHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TMoveInstHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TMoveInstHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TMoveInstHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TMoveInstHCB.class.getName(); }
    protected String xCQ() { return TMoveInstHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
