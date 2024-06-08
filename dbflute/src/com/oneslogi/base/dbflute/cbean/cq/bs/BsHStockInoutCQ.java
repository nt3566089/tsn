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
 * The base condition-query of H_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsHStockInoutCQ extends AbstractBsHStockInoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HStockInoutCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHStockInoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_STOCK_INOUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HStockInoutCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HStockInoutCIQ xcreateCIQ() {
        HStockInoutCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HStockInoutCIQ xnewCIQ() {
        return new HStockInoutCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_STOCK_INOUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HStockInoutCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HStockInoutCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stockInoutId;
    public ConditionValue xdfgetStockInoutId()
    { if (_stockInoutId == null) { _stockInoutId = nCV(); }
      return _stockInoutId; }
    protected ConditionValue xgetCValueStockInoutId() { return xdfgetStockInoutId(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_StockInoutId_Asc() { regOBA("STOCK_INOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_StockInoutId_Desc() { regOBD("STOCK_INOUT_ID"); return this; }

    protected ConditionValue _histDt;
    public ConditionValue xdfgetHistDt()
    { if (_histDt == null) { _histDt = nCV(); }
      return _histDt; }
    protected ConditionValue xgetCValueHistDt() { return xdfgetHistDt(); }

    /**
     * Add order-by as ascend. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_HistDt_Asc() { regOBA("HIST_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_HistDt_Desc() { regOBD("HIST_DT"); return this; }

    protected ConditionValue _fsStockInoutId;
    public ConditionValue xdfgetFsStockInoutId()
    { if (_fsStockInoutId == null) { _fsStockInoutId = nCV(); }
      return _fsStockInoutId; }
    protected ConditionValue xgetCValueFsStockInoutId() { return xdfgetFsStockInoutId(); }

    /**
     * Add order-by as ascend. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_FsStockInoutId_Asc() { regOBA("FS_STOCK_INOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FS_STOCK_INOUT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_FsStockInoutId_Desc() { regOBD("FS_STOCK_INOUT_ID"); return this; }

    protected ConditionValue _bfStockInoutId;
    public ConditionValue xdfgetBfStockInoutId()
    { if (_bfStockInoutId == null) { _bfStockInoutId = nCV(); }
      return _bfStockInoutId; }
    protected ConditionValue xgetCValueBfStockInoutId() { return xdfgetBfStockInoutId(); }

    /**
     * Add order-by as ascend. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_BfStockInoutId_Asc() { regOBA("BF_STOCK_INOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BF_STOCK_INOUT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_BfStockInoutId_Desc() { regOBD("BF_STOCK_INOUT_ID"); return this; }

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
    public BsHStockInoutCQ addOrderBy_ProcessDt_Asc() { regOBA("PROCESS_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_ProcessDt_Desc() { regOBD("PROCESS_DT"); return this; }

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
    public BsHStockInoutCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

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
    public BsHStockInoutCQ addOrderBy_ProcessNo_Asc() { regOBA("PROCESS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_ProcessNo_Desc() { regOBD("PROCESS_NO"); return this; }

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
    public BsHStockInoutCQ addOrderBy_CorrectType_Asc() { regOBA("CORRECT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_CorrectType_Desc() { regOBD("CORRECT_TYPE"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, HStockCQ> getStockId_InScopeRelation_HStock() { return xgetSQueMap("stockId_InScopeRelation_HStock"); }
    public String keepStockId_InScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_HStock", sq); }

    public Map<String, HStockCQ> getStockId_NotInScopeRelation_HStock() { return xgetSQueMap("stockId_NotInScopeRelation_HStock"); }
    public String keepStockId_NotInScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_HStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

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
    public BsHStockInoutCQ addOrderBy_InoutType_Asc() { regOBA("INOUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_InoutType_Desc() { regOBD("INOUT_TYPE"); return this; }

    protected ConditionValue _stockInoutNum;
    public ConditionValue xdfgetStockInoutNum()
    { if (_stockInoutNum == null) { _stockInoutNum = nCV(); }
      return _stockInoutNum; }
    protected ConditionValue xgetCValueStockInoutNum() { return xdfgetStockInoutNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_StockInoutNum_Asc() { regOBA("STOCK_INOUT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_StockInoutNum_Desc() { regOBD("STOCK_INOUT_NUM"); return this; }

    protected ConditionValue _logicflg1;
    public ConditionValue xdfgetLogicflg1()
    { if (_logicflg1 == null) { _logicflg1 = nCV(); }
      return _logicflg1; }
    protected ConditionValue xgetCValueLogicflg1() { return xdfgetLogicflg1(); }

    /**
     * Add order-by as ascend. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_Logicflg1_Asc() { regOBA("LogicFlg1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LogicFlg1: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_Logicflg1_Desc() { regOBD("LogicFlg1"); return this; }

    protected ConditionValue _logicflg2;
    public ConditionValue xdfgetLogicflg2()
    { if (_logicflg2 == null) { _logicflg2 = nCV(); }
      return _logicflg2; }
    protected ConditionValue xgetCValueLogicflg2() { return xdfgetLogicflg2(); }

    /**
     * Add order-by as ascend. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_Logicflg2_Asc() { regOBA("LogicFlg2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LogicFlg2: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_Logicflg2_Desc() { regOBD("LogicFlg2"); return this; }

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
    public BsHStockInoutCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHStockInoutCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHStockInoutCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHStockInoutCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHStockInoutCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHStockInoutCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHStockInoutCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHStockInoutCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHStockInoutCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHStockInoutCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHStockInoutCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHStockInoutCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HStockInoutCQ bq = (HStockInoutCQ)bqs;
        HStockInoutCQ uq = (HStockInoutCQ)uqs;
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryHStock()) {
            uq.queryHStock().reflectRelationOnUnionQuery(bq.queryHStock(), uq.queryHStock());
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
        String nrp = xresolveNRP("H_STOCK_INOUT", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public HStockCQ queryHStock() {
        return xdfgetConditionQueryHStock();
    }
    public HStockCQ xdfgetConditionQueryHStock() {
        String prop = "hStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHStock()); xsetupOuterJoinHStock(); }
        return xgetQueRlMap(prop);
    }
    protected HStockCQ xcreateQueryHStock() {
        String nrp = xresolveNRP("H_STOCK_INOUT", "hStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hStock", nrp);
    }
    protected void xsetupOuterJoinHStock() { xregOutJo("hStock"); }
    public boolean hasConditionQueryHStock() { return xhasQueRlMap("hStock"); }

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
        String nrp = xresolveNRP("H_STOCK_INOUT", "bClassDtlByCorrectType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("H_STOCK_INOUT", "bClassDtlByInoutType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, HStockInoutCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HStockInoutCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HStockInoutCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HStockInoutCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HStockInoutCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HStockInoutCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HStockInoutCQ> _myselfExistsMap;
    public Map<String, HStockInoutCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HStockInoutCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HStockInoutCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HStockInoutCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HStockInoutCB.class.getName(); }
    protected String xCQ() { return HStockInoutCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
