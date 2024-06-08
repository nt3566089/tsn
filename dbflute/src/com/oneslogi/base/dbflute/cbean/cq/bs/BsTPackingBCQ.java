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
 * The base condition-query of T_PACKING_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPackingBCQ extends AbstractBsTPackingBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPackingBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PACKING_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPackingBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPackingBCIQ xcreateCIQ() {
        TPackingBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPackingBCIQ xnewCIQ() {
        return new TPackingBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PACKING_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPackingBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPackingBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _packingBId;
    public ConditionValue xdfgetPackingBId()
    { if (_packingBId == null) { _packingBId = nCV(); }
      return _packingBId; }
    protected ConditionValue xgetCValuePackingBId() { return xdfgetPackingBId(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PackingBId_Asc() { regOBA("PACKING_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PackingBId_Desc() { regOBD("PACKING_B_ID"); return this; }

    protected ConditionValue _packingHId;
    public ConditionValue xdfgetPackingHId()
    { if (_packingHId == null) { _packingHId = nCV(); }
      return _packingHId; }
    protected ConditionValue xgetCValuePackingHId() { return xdfgetPackingHId(); }

    public Map<String, TPackingHCQ> getPackingHId_InScopeRelation_TPackingH() { return xgetSQueMap("packingHId_InScopeRelation_TPackingH"); }
    public String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq) { return xkeepSQue("packingHId_InScopeRelation_TPackingH", sq); }

    public Map<String, TPackingHCQ> getPackingHId_NotInScopeRelation_TPackingH() { return xgetSQueMap("packingHId_NotInScopeRelation_TPackingH"); }
    public String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq) { return xkeepSQue("packingHId_NotInScopeRelation_TPackingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PackingHId_Asc() { regOBA("PACKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PackingHId_Desc() { regOBD("PACKING_H_ID"); return this; }

    protected ConditionValue _pickingBId;
    public ConditionValue xdfgetPickingBId()
    { if (_pickingBId == null) { _pickingBId = nCV(); }
      return _pickingBId; }
    protected ConditionValue xgetCValuePickingBId() { return xdfgetPickingBId(); }

    public Map<String, TPickingBCQ> getPickingBId_InScopeRelation_TPickingB() { return xgetSQueMap("pickingBId_InScopeRelation_TPickingB"); }
    public String keepPickingBId_InScopeRelation_TPickingB(TPickingBCQ sq) { return xkeepSQue("pickingBId_InScopeRelation_TPickingB", sq); }

    public Map<String, TPickingBCQ> getPickingBId_NotInScopeRelation_TPickingB() { return xgetSQueMap("pickingBId_NotInScopeRelation_TPickingB"); }
    public String keepPickingBId_NotInScopeRelation_TPickingB(TPickingBCQ sq) { return xkeepSQue("pickingBId_NotInScopeRelation_TPickingB", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_B_ID: {IX, bigint(19), FK to T_PICKING_B}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PickingBId_Asc() { regOBA("PICKING_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_B_ID: {IX, bigint(19), FK to T_PICKING_B}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PickingBId_Desc() { regOBD("PICKING_B_ID"); return this; }

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
    public BsTPackingBCQ addOrderBy_AllocInstBId_Asc() { regOBA("ALLOC_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_AllocInstBId_Desc() { regOBD("ALLOC_INST_B_ID"); return this; }

    protected ConditionValue _packingNum;
    public ConditionValue xdfgetPackingNum()
    { if (_packingNum == null) { _packingNum = nCV(); }
      return _packingNum; }
    protected ConditionValue xgetCValuePackingNum() { return xdfgetPackingNum(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PackingNum_Asc() { regOBA("PACKING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PackingNum_Desc() { regOBD("PACKING_NUM"); return this; }

    protected ConditionValue _pickingFlg;
    public ConditionValue xdfgetPickingFlg()
    { if (_pickingFlg == null) { _pickingFlg = nCV(); }
      return _pickingFlg; }
    protected ConditionValue xgetCValuePickingFlg() { return xdfgetPickingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PickingFlg_Asc() { regOBA("PICKING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_PickingFlg_Desc() { regOBD("PICKING_FLG"); return this; }

    protected ConditionValue _inspectionFlg;
    public ConditionValue xdfgetInspectionFlg()
    { if (_inspectionFlg == null) { _inspectionFlg = nCV(); }
      return _inspectionFlg; }
    protected ConditionValue xgetCValueInspectionFlg() { return xdfgetInspectionFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_InspectionFlg_Asc() { regOBA("INSPECTION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_InspectionFlg_Desc() { regOBD("INSPECTION_FLG"); return this; }

    protected ConditionValue _casePickingNo;
    public ConditionValue xdfgetCasePickingNo()
    { if (_casePickingNo == null) { _casePickingNo = nCV(); }
      return _casePickingNo; }
    protected ConditionValue xgetCValueCasePickingNo() { return xdfgetCasePickingNo(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PICKING_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_CasePickingNo_Asc() { regOBA("CASE_PICKING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PICKING_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_CasePickingNo_Desc() { regOBD("CASE_PICKING_NO"); return this; }

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
    public BsTPackingBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPackingBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPackingBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPackingBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPackingBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPackingBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPackingBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPackingBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPackingBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPackingBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPackingBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPackingBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPackingBCQ bq = (TPackingBCQ)bqs;
        TPackingBCQ uq = (TPackingBCQ)uqs;
        if (bq.hasConditionQueryTPickingB()) {
            uq.queryTPickingB().reflectRelationOnUnionQuery(bq.queryTPickingB(), uq.queryTPickingB());
        }
        if (bq.hasConditionQueryTPackingH()) {
            uq.queryTPackingH().reflectRelationOnUnionQuery(bq.queryTPackingH(), uq.queryTPackingH());
        }
        if (bq.hasConditionQueryTAllocInstB()) {
            uq.queryTAllocInstB().reflectRelationOnUnionQuery(bq.queryTAllocInstB(), uq.queryTAllocInstB());
        }
        if (bq.hasConditionQueryBClassDtlByInspectionFlg()) {
            uq.queryBClassDtlByInspectionFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInspectionFlg(), uq.queryBClassDtlByInspectionFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPickingFlg()) {
            uq.queryBClassDtlByPickingFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPickingFlg(), uq.queryBClassDtlByPickingFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_PICKING_B by my PICKING_B_ID, named 'TPickingB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingBCQ queryTPickingB() {
        return xdfgetConditionQueryTPickingB();
    }
    public TPickingBCQ xdfgetConditionQueryTPickingB() {
        String prop = "tPickingB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingB()); xsetupOuterJoinTPickingB(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingBCQ xcreateQueryTPickingB() {
        String nrp = xresolveNRP("T_PACKING_B", "tPickingB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingB", nrp);
    }
    protected void xsetupOuterJoinTPickingB() { xregOutJo("tPickingB"); }
    public boolean hasConditionQueryTPickingB() { return xhasQueRlMap("tPickingB"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPackingHCQ queryTPackingH() {
        return xdfgetConditionQueryTPackingH();
    }
    public TPackingHCQ xdfgetConditionQueryTPackingH() {
        String prop = "tPackingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPackingH()); xsetupOuterJoinTPackingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPackingHCQ xcreateQueryTPackingH() {
        String nrp = xresolveNRP("T_PACKING_B", "tPackingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPackingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPackingH", nrp);
    }
    protected void xsetupOuterJoinTPackingH() { xregOutJo("tPackingH"); }
    public boolean hasConditionQueryTPackingH() { return xhasQueRlMap("tPackingH"); }

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
        String nrp = xresolveNRP("T_PACKING_B", "tAllocInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstB", nrp);
    }
    protected void xsetupOuterJoinTAllocInstB() { xregOutJo("tAllocInstB"); }
    public boolean hasConditionQueryTAllocInstB() { return xhasQueRlMap("tAllocInstB"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInspectionFlg() {
        return xdfgetConditionQueryBClassDtlByInspectionFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInspectionFlg() {
        String prop = "bClassDtlByInspectionFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInspectionFlg()); xsetupOuterJoinBClassDtlByInspectionFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInspectionFlg() {
        String nrp = xresolveNRP("T_PACKING_B", "bClassDtlByInspectionFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInspectionFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInspectionFlg() { xregOutJo("bClassDtlByInspectionFlg"); }
    public boolean hasConditionQueryBClassDtlByInspectionFlg() { return xhasQueRlMap("bClassDtlByInspectionFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PICKING_FLG, named 'BClassDtlByPickingFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPickingFlg() {
        return xdfgetConditionQueryBClassDtlByPickingFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPickingFlg() {
        String prop = "bClassDtlByPickingFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPickingFlg()); xsetupOuterJoinBClassDtlByPickingFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPickingFlg() {
        String nrp = xresolveNRP("T_PACKING_B", "bClassDtlByPickingFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPickingFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPickingFlg() { xregOutJo("bClassDtlByPickingFlg"); }
    public boolean hasConditionQueryBClassDtlByPickingFlg() { return xhasQueRlMap("bClassDtlByPickingFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPackingBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPackingBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPackingBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPackingBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPackingBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPackingBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPackingBCQ> _myselfExistsMap;
    public Map<String, TPackingBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPackingBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPackingBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPackingBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPackingBCB.class.getName(); }
    protected String xCQ() { return TPackingBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
