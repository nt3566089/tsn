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
 * The base condition-query of T_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStockInoutCQ extends AbstractBsTStockInoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStockInoutCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockInoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_STOCK_INOUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStockInoutCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStockInoutCIQ xcreateCIQ() {
        TStockInoutCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStockInoutCIQ xnewCIQ() {
        return new TStockInoutCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_STOCK_INOUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStockInoutCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStockInoutCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stockInoutId;
    public ConditionValue xdfgetStockInoutId()
    { if (_stockInoutId == null) { _stockInoutId = nCV(); }
      return _stockInoutId; }
    protected ConditionValue xgetCValueStockInoutId() { return xdfgetStockInoutId(); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList"); }
    public String keepStockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList"); }
    public String keepStockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList"); }
    public String keepStockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList"); }
    public String keepStockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList"); }
    public String keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList"); }
    public String keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList"); }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList", sq); }
    public Map<String, Object> xdfgetStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfListParameter() { return xgetSQuePmMap("stockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList"); }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfListParameter(Object pm) { return xkeepSQuePm("stockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList", pm); }

    public Map<String, TStockInoutCQ> xdfgetStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList() { return xgetSQueMap("stockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList"); }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq) { return xkeepSQue("stockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList", sq); }
    public Map<String, Object> xdfgetStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfListParameter() { return xgetSQuePmMap("stockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList"); }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfListParameter(Object pm) { return xkeepSQuePm("stockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StockInoutId_Asc() { regOBA("STOCK_INOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StockInoutId_Desc() { regOBD("STOCK_INOUT_ID"); return this; }

    protected ConditionValue _fsStockInoutId;
    public ConditionValue xdfgetFsStockInoutId()
    { if (_fsStockInoutId == null) { _fsStockInoutId = nCV(); }
      return _fsStockInoutId; }
    protected ConditionValue xgetCValueFsStockInoutId() { return xdfgetFsStockInoutId(); }

    public Map<String, TStockInoutCQ> getFsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf() { return xgetSQueMap("fsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf"); }
    public String keepFsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf(TStockInoutCQ sq) { return xkeepSQue("fsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf", sq); }

    public Map<String, TStockInoutCQ> getFsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf() { return xgetSQueMap("fsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf"); }
    public String keepFsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf(TStockInoutCQ sq) { return xkeepSQue("fsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_FsStockInoutId_Asc() { regOBA("FS_STOCK_INOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_FsStockInoutId_Desc() { regOBD("FS_STOCK_INOUT_ID"); return this; }

    protected ConditionValue _bfStockInoutId;
    public ConditionValue xdfgetBfStockInoutId()
    { if (_bfStockInoutId == null) { _bfStockInoutId = nCV(); }
      return _bfStockInoutId; }
    protected ConditionValue xgetCValueBfStockInoutId() { return xdfgetBfStockInoutId(); }

    public Map<String, TStockInoutCQ> getBfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf() { return xgetSQueMap("bfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf"); }
    public String keepBfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf(TStockInoutCQ sq) { return xkeepSQue("bfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf", sq); }

    public Map<String, TStockInoutCQ> getBfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf() { return xgetSQueMap("bfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf"); }
    public String keepBfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf(TStockInoutCQ sq) { return xkeepSQue("bfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_BfStockInoutId_Asc() { regOBA("BF_STOCK_INOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_BfStockInoutId_Desc() { regOBD("BF_STOCK_INOUT_ID"); return this; }

    protected ConditionValue _moveRecordBId;
    public ConditionValue xdfgetMoveRecordBId()
    { if (_moveRecordBId == null) { _moveRecordBId = nCV(); }
      return _moveRecordBId; }
    protected ConditionValue xgetCValueMoveRecordBId() { return xdfgetMoveRecordBId(); }

    public Map<String, TMoveRecordBCQ> getMoveRecordBId_InScopeRelation_TMoveRecordB() { return xgetSQueMap("moveRecordBId_InScopeRelation_TMoveRecordB"); }
    public String keepMoveRecordBId_InScopeRelation_TMoveRecordB(TMoveRecordBCQ sq) { return xkeepSQue("moveRecordBId_InScopeRelation_TMoveRecordB", sq); }

    public Map<String, TMoveRecordBCQ> getMoveRecordBId_NotInScopeRelation_TMoveRecordB() { return xgetSQueMap("moveRecordBId_NotInScopeRelation_TMoveRecordB"); }
    public String keepMoveRecordBId_NotInScopeRelation_TMoveRecordB(TMoveRecordBCQ sq) { return xkeepSQue("moveRecordBId_NotInScopeRelation_TMoveRecordB", sq); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_MoveRecordBId_Asc() { regOBA("MOVE_RECORD_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_MoveRecordBId_Desc() { regOBD("MOVE_RECORD_B_ID"); return this; }

    protected ConditionValue _storeRecordBId;
    public ConditionValue xdfgetStoreRecordBId()
    { if (_storeRecordBId == null) { _storeRecordBId = nCV(); }
      return _storeRecordBId; }
    protected ConditionValue xgetCValueStoreRecordBId() { return xdfgetStoreRecordBId(); }

    public Map<String, TStoreRecordBCQ> getStoreRecordBId_InScopeRelation_TStoreRecordB() { return xgetSQueMap("storeRecordBId_InScopeRelation_TStoreRecordB"); }
    public String keepStoreRecordBId_InScopeRelation_TStoreRecordB(TStoreRecordBCQ sq) { return xkeepSQue("storeRecordBId_InScopeRelation_TStoreRecordB", sq); }

    public Map<String, TStoreRecordBCQ> getStoreRecordBId_NotInScopeRelation_TStoreRecordB() { return xgetSQueMap("storeRecordBId_NotInScopeRelation_TStoreRecordB"); }
    public String keepStoreRecordBId_NotInScopeRelation_TStoreRecordB(TStoreRecordBCQ sq) { return xkeepSQue("storeRecordBId_NotInScopeRelation_TStoreRecordB", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StoreRecordBId_Asc() { regOBA("STORE_RECORD_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StoreRecordBId_Desc() { regOBD("STORE_RECORD_B_ID"); return this; }

    protected ConditionValue _allocInstBId;
    public ConditionValue xdfgetAllocInstBId()
    { if (_allocInstBId == null) { _allocInstBId = nCV(); }
      return _allocInstBId; }
    protected ConditionValue xgetCValueAllocInstBId() { return xdfgetAllocInstBId(); }

    public Map<String, TAllocInstBCQ> getAllocInstBId_InScopeRelation_TAllocInstB() { return xgetSQueMap("allocInstBId_InScopeRelation_TAllocInstB"); }
    public String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq) { return xkeepSQue("allocInstBId_InScopeRelation_TAllocInstB", sq); }

    public Map<String, TAllocInstBCQ> getAllocInstBId_NotInScopeRelation_TAllocInstB() { return xgetSQueMap("allocInstBId_NotInScopeRelation_TAllocInstB"); }
    public String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq) { return xkeepSQue("allocInstBId_NotInScopeRelation_TAllocInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_AllocInstBId_Asc() { regOBA("ALLOC_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_AllocInstBId_Desc() { regOBD("ALLOC_INST_B_ID"); return this; }

    protected ConditionValue _processDt;
    public ConditionValue xdfgetProcessDt()
    { if (_processDt == null) { _processDt = nCV(); }
      return _processDt; }
    protected ConditionValue xgetCValueProcessDt() { return xdfgetProcessDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_ProcessDt_Asc() { regOBA("PROCESS_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_ProcessDt_Desc() { regOBD("PROCESS_DT"); return this; }

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
    public BsTStockInoutCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _processNo;
    public ConditionValue xdfgetProcessNo()
    { if (_processNo == null) { _processNo = nCV(); }
      return _processNo; }
    protected ConditionValue xgetCValueProcessNo() { return xdfgetProcessNo(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_ProcessNo_Asc() { regOBA("PROCESS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_ProcessNo_Desc() { regOBD("PROCESS_NO"); return this; }

    protected ConditionValue _correctType;
    public ConditionValue xdfgetCorrectType()
    { if (_correctType == null) { _correctType = nCV(); }
      return _correctType; }
    protected ConditionValue xgetCValueCorrectType() { return xdfgetCorrectType(); }

    /**
     * Add order-by as ascend. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_CorrectType_Asc() { regOBA("CORRECT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_CorrectType_Desc() { regOBD("CORRECT_TYPE"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TStockCQ> getStockId_InScopeRelation_TStock() { return xgetSQueMap("stockId_InScopeRelation_TStock"); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_TStock", sq); }

    public Map<String, TStockCQ> getStockId_NotInScopeRelation_TStock() { return xgetSQueMap("stockId_NotInScopeRelation_TStock"); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_TStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _inoutType;
    public ConditionValue xdfgetInoutType()
    { if (_inoutType == null) { _inoutType = nCV(); }
      return _inoutType; }
    protected ConditionValue xgetCValueInoutType() { return xdfgetInoutType(); }

    /**
     * Add order-by as ascend. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_InoutType_Asc() { regOBA("INOUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_InoutType_Desc() { regOBD("INOUT_TYPE"); return this; }

    protected ConditionValue _stockInoutNum;
    public ConditionValue xdfgetStockInoutNum()
    { if (_stockInoutNum == null) { _stockInoutNum = nCV(); }
      return _stockInoutNum; }
    protected ConditionValue xgetCValueStockInoutNum() { return xdfgetStockInoutNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StockInoutNum_Asc() { regOBA("STOCK_INOUT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_StockInoutNum_Desc() { regOBD("STOCK_INOUT_NUM"); return this; }

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
    public BsTStockInoutCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStockInoutCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStockInoutCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStockInoutCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStockInoutCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStockInoutCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStockInoutCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStockInoutCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStockInoutCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStockInoutCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStockInoutCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStockInoutCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStockInoutCQ bq = (TStockInoutCQ)bqs;
        TStockInoutCQ uq = (TStockInoutCQ)uqs;
        if (bq.hasConditionQueryTAllocInstB()) {
            uq.queryTAllocInstB().reflectRelationOnUnionQuery(bq.queryTAllocInstB(), uq.queryTAllocInstB());
        }
        if (bq.hasConditionQueryTStockInoutByFsStockInoutIdSelf()) {
            uq.queryTStockInoutByFsStockInoutIdSelf().reflectRelationOnUnionQuery(bq.queryTStockInoutByFsStockInoutIdSelf(), uq.queryTStockInoutByFsStockInoutIdSelf());
        }
        if (bq.hasConditionQueryTStoreRecordB()) {
            uq.queryTStoreRecordB().reflectRelationOnUnionQuery(bq.queryTStoreRecordB(), uq.queryTStoreRecordB());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryTMoveRecordB()) {
            uq.queryTMoveRecordB().reflectRelationOnUnionQuery(bq.queryTMoveRecordB(), uq.queryTMoveRecordB());
        }
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
        if (bq.hasConditionQueryTStockInoutByBfStockInoutIdSelf()) {
            uq.queryTStockInoutByBfStockInoutIdSelf().reflectRelationOnUnionQuery(bq.queryTStockInoutByBfStockInoutIdSelf(), uq.queryTStockInoutByBfStockInoutIdSelf());
        }
        if (bq.hasConditionQueryBClassDtlByCorrectType()) {
            uq.queryBClassDtlByCorrectType().reflectRelationOnUnionQuery(bq.queryBClassDtlByCorrectType(), uq.queryBClassDtlByCorrectType());
        }
        if (bq.hasConditionQueryBClassDtlByInoutType()) {
            uq.queryBClassDtlByInoutType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInoutType(), uq.queryBClassDtlByInoutType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocInstBCQ queryTAllocInstB() {
        return xdfgetConditionQueryTAllocInstB();
    }
    public TAllocInstBCQ xdfgetConditionQueryTAllocInstB() {
        String prop = "tAllocInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocInstB()); xsetupOuterJoinTAllocInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocInstBCQ xcreateQueryTAllocInstB() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "tAllocInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstB", nrp);
    }
    protected void xsetupOuterJoinTAllocInstB() { xregOutJo("tAllocInstB"); }
    public boolean hasConditionQueryTAllocInstB() { return xhasQueRlMap("tAllocInstB"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockInoutCQ queryTStockInoutByFsStockInoutIdSelf() {
        return xdfgetConditionQueryTStockInoutByFsStockInoutIdSelf();
    }
    public TStockInoutCQ xdfgetConditionQueryTStockInoutByFsStockInoutIdSelf() {
        String prop = "tStockInoutByFsStockInoutIdSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStockInoutByFsStockInoutIdSelf()); xsetupOuterJoinTStockInoutByFsStockInoutIdSelf(); }
        return xgetQueRlMap(prop);
    }
    protected TStockInoutCQ xcreateQueryTStockInoutByFsStockInoutIdSelf() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "tStockInoutByFsStockInoutIdSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockInoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStockInoutByFsStockInoutIdSelf", nrp);
    }
    protected void xsetupOuterJoinTStockInoutByFsStockInoutIdSelf() { xregOutJo("tStockInoutByFsStockInoutIdSelf"); }
    public boolean hasConditionQueryTStockInoutByFsStockInoutIdSelf() { return xhasQueRlMap("tStockInoutByFsStockInoutIdSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreRecordBCQ queryTStoreRecordB() {
        return xdfgetConditionQueryTStoreRecordB();
    }
    public TStoreRecordBCQ xdfgetConditionQueryTStoreRecordB() {
        String prop = "tStoreRecordB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreRecordB()); xsetupOuterJoinTStoreRecordB(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreRecordBCQ xcreateQueryTStoreRecordB() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "tStoreRecordB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreRecordBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreRecordB", nrp);
    }
    protected void xsetupOuterJoinTStoreRecordB() { xregOutJo("tStoreRecordB"); }
    public boolean hasConditionQueryTStoreRecordB() { return xhasQueRlMap("tStoreRecordB"); }

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
        String nrp = xresolveNRP("T_STOCK_INOUT", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveRecordBCQ queryTMoveRecordB() {
        return xdfgetConditionQueryTMoveRecordB();
    }
    public TMoveRecordBCQ xdfgetConditionQueryTMoveRecordB() {
        String prop = "tMoveRecordB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveRecordB()); xsetupOuterJoinTMoveRecordB(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveRecordBCQ xcreateQueryTMoveRecordB() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "tMoveRecordB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveRecordBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveRecordB", nrp);
    }
    protected void xsetupOuterJoinTMoveRecordB() { xregOutJo("tMoveRecordB"); }
    public boolean hasConditionQueryTMoveRecordB() { return xhasQueRlMap("tMoveRecordB"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockCQ queryTStock() {
        return xdfgetConditionQueryTStock();
    }
    public TStockCQ xdfgetConditionQueryTStock() {
        String prop = "tStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStock()); xsetupOuterJoinTStock(); }
        return xgetQueRlMap(prop);
    }
    protected TStockCQ xcreateQueryTStock() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockInoutCQ queryTStockInoutByBfStockInoutIdSelf() {
        return xdfgetConditionQueryTStockInoutByBfStockInoutIdSelf();
    }
    public TStockInoutCQ xdfgetConditionQueryTStockInoutByBfStockInoutIdSelf() {
        String prop = "tStockInoutByBfStockInoutIdSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStockInoutByBfStockInoutIdSelf()); xsetupOuterJoinTStockInoutByBfStockInoutIdSelf(); }
        return xgetQueRlMap(prop);
    }
    protected TStockInoutCQ xcreateQueryTStockInoutByBfStockInoutIdSelf() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "tStockInoutByBfStockInoutIdSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockInoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStockInoutByBfStockInoutIdSelf", nrp);
    }
    protected void xsetupOuterJoinTStockInoutByBfStockInoutIdSelf() { xregOutJo("tStockInoutByBfStockInoutIdSelf"); }
    public boolean hasConditionQueryTStockInoutByBfStockInoutIdSelf() { return xhasQueRlMap("tStockInoutByBfStockInoutIdSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCorrectType() {
        return xdfgetConditionQueryBClassDtlByCorrectType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCorrectType() {
        String prop = "bClassDtlByCorrectType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCorrectType()); xsetupOuterJoinBClassDtlByCorrectType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCorrectType() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "bClassDtlByCorrectType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCorrectType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCorrectType() { xregOutJo("bClassDtlByCorrectType"); }
    public boolean hasConditionQueryBClassDtlByCorrectType() { return xhasQueRlMap("bClassDtlByCorrectType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInoutType() {
        return xdfgetConditionQueryBClassDtlByInoutType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInoutType() {
        String prop = "bClassDtlByInoutType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInoutType()); xsetupOuterJoinBClassDtlByInoutType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInoutType() {
        String nrp = xresolveNRP("T_STOCK_INOUT", "bClassDtlByInoutType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInoutType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInoutType() { xregOutJo("bClassDtlByInoutType"); }
    public boolean hasConditionQueryBClassDtlByInoutType() { return xhasQueRlMap("bClassDtlByInoutType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStockInoutCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStockInoutCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStockInoutCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStockInoutCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStockInoutCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStockInoutCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStockInoutCQ> _myselfExistsMap;
    public Map<String, TStockInoutCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStockInoutCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStockInoutCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStockInoutCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStockInoutCB.class.getName(); }
    protected String xCQ() { return TStockInoutCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
