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
 * The base condition-query of T_MOVE_RECORD_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTMoveRecordBCQ extends AbstractBsTMoveRecordBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMoveRecordBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMoveRecordBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_MOVE_RECORD_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TMoveRecordBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TMoveRecordBCIQ xcreateCIQ() {
        TMoveRecordBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TMoveRecordBCIQ xnewCIQ() {
        return new TMoveRecordBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_MOVE_RECORD_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TMoveRecordBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TMoveRecordBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _moveRecordBId;
    public ConditionValue xdfgetMoveRecordBId()
    { if (_moveRecordBId == null) { _moveRecordBId = nCV(); }
      return _moveRecordBId; }
    protected ConditionValue xgetCValueMoveRecordBId() { return xdfgetMoveRecordBId(); }

    public Map<String, TStockInoutCQ> xdfgetMoveRecordBId_ExistsReferrer_TStockInoutList() { return xgetSQueMap("moveRecordBId_ExistsReferrer_TStockInoutList"); }
    public String keepMoveRecordBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("moveRecordBId_ExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStockInoutCQ> xdfgetMoveRecordBId_NotExistsReferrer_TStockInoutList() { return xgetSQueMap("moveRecordBId_NotExistsReferrer_TStockInoutList"); }
    public String keepMoveRecordBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("moveRecordBId_NotExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStockInoutCQ> xdfgetMoveRecordBId_SpecifyDerivedReferrer_TStockInoutList() { return xgetSQueMap("moveRecordBId_SpecifyDerivedReferrer_TStockInoutList"); }
    public String keepMoveRecordBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("moveRecordBId_SpecifyDerivedReferrer_TStockInoutList", sq); }

    public Map<String, TStockInoutCQ> xdfgetMoveRecordBId_QueryDerivedReferrer_TStockInoutList() { return xgetSQueMap("moveRecordBId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepMoveRecordBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("moveRecordBId_QueryDerivedReferrer_TStockInoutList", sq); }
    public Map<String, Object> xdfgetMoveRecordBId_QueryDerivedReferrer_TStockInoutListParameter() { return xgetSQuePmMap("moveRecordBId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepMoveRecordBId_QueryDerivedReferrer_TStockInoutListParameter(Object pm) { return xkeepSQuePm("moveRecordBId_QueryDerivedReferrer_TStockInoutList", pm); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveRecordBId_Asc() { regOBA("MOVE_RECORD_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveRecordBId_Desc() { regOBD("MOVE_RECORD_B_ID"); return this; }

    protected ConditionValue _moveInstHId;
    public ConditionValue xdfgetMoveInstHId()
    { if (_moveInstHId == null) { _moveInstHId = nCV(); }
      return _moveInstHId; }
    protected ConditionValue xgetCValueMoveInstHId() { return xdfgetMoveInstHId(); }

    public Map<String, TMoveInstHCQ> getMoveInstHId_InScopeRelation_TMoveInstH() { return xgetSQueMap("moveInstHId_InScopeRelation_TMoveInstH"); }
    public String keepMoveInstHId_InScopeRelation_TMoveInstH(TMoveInstHCQ sq) { return xkeepSQue("moveInstHId_InScopeRelation_TMoveInstH", sq); }

    public Map<String, TMoveInstHCQ> getMoveInstHId_NotInScopeRelation_TMoveInstH() { return xgetSQueMap("moveInstHId_NotInScopeRelation_TMoveInstH"); }
    public String keepMoveInstHId_NotInScopeRelation_TMoveInstH(TMoveInstHCQ sq) { return xkeepSQue("moveInstHId_NotInScopeRelation_TMoveInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveInstHId_Asc() { regOBA("MOVE_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveInstHId_Desc() { regOBD("MOVE_INST_H_ID"); return this; }

    protected ConditionValue _moveInstBId;
    public ConditionValue xdfgetMoveInstBId()
    { if (_moveInstBId == null) { _moveInstBId = nCV(); }
      return _moveInstBId; }
    protected ConditionValue xgetCValueMoveInstBId() { return xdfgetMoveInstBId(); }

    public Map<String, TMoveInstBCQ> getMoveInstBId_InScopeRelation_TMoveInstB() { return xgetSQueMap("moveInstBId_InScopeRelation_TMoveInstB"); }
    public String keepMoveInstBId_InScopeRelation_TMoveInstB(TMoveInstBCQ sq) { return xkeepSQue("moveInstBId_InScopeRelation_TMoveInstB", sq); }

    public Map<String, TMoveInstBCQ> getMoveInstBId_NotInScopeRelation_TMoveInstB() { return xgetSQueMap("moveInstBId_NotInScopeRelation_TMoveInstB"); }
    public String keepMoveInstBId_NotInScopeRelation_TMoveInstB(TMoveInstBCQ sq) { return xkeepSQue("moveInstBId_NotInScopeRelation_TMoveInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveInstBId_Asc() { regOBA("MOVE_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveInstBId_Desc() { regOBD("MOVE_INST_B_ID"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_ProcessNo_Asc() { regOBA("PROCESS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_ProcessNo_Desc() { regOBD("PROCESS_NO"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    public Map<String, MLocationCQ> getLocationId_InScopeRelation_MLocation() { return xgetSQueMap("locationId_InScopeRelation_MLocation"); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("locationId_NotInScopeRelation_MLocation"); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _moveDt;
    public ConditionValue xdfgetMoveDt()
    { if (_moveDt == null) { _moveDt = nCV(); }
      return _moveDt; }
    protected ConditionValue xgetCValueMoveDt() { return xdfgetMoveDt(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveDt_Asc() { regOBA("MOVE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveDt_Desc() { regOBD("MOVE_DT"); return this; }

    protected ConditionValue _moveNum;
    public ConditionValue xdfgetMoveNum()
    { if (_moveNum == null) { _moveNum = nCV(); }
      return _moveNum; }
    protected ConditionValue xgetCValueMoveNum() { return xdfgetMoveNum(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveNum_Asc() { regOBA("MOVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_MoveNum_Desc() { regOBD("MOVE_NUM"); return this; }

    protected ConditionValue _storeNoMergeFlg;
    public ConditionValue xdfgetStoreNoMergeFlg()
    { if (_storeNoMergeFlg == null) { _storeNoMergeFlg = nCV(); }
      return _storeNoMergeFlg; }
    protected ConditionValue xgetCValueStoreNoMergeFlg() { return xdfgetStoreNoMergeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_StoreNoMergeFlg_Asc() { regOBA("STORE_NO_MERGE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_StoreNoMergeFlg_Desc() { regOBD("STORE_NO_MERGE_FLG"); return this; }

    protected ConditionValue _allShippingFlg;
    public ConditionValue xdfgetAllShippingFlg()
    { if (_allShippingFlg == null) { _allShippingFlg = nCV(); }
      return _allShippingFlg; }
    protected ConditionValue xgetCValueAllShippingFlg() { return xdfgetAllShippingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_AllShippingFlg_Asc() { regOBA("ALL_SHIPPING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_AllShippingFlg_Desc() { regOBD("ALL_SHIPPING_FLG"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTMoveRecordBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveRecordBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTMoveRecordBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTMoveRecordBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TMoveRecordBCQ bq = (TMoveRecordBCQ)bqs;
        TMoveRecordBCQ uq = (TMoveRecordBCQ)uqs;
        if (bq.hasConditionQueryTMoveInstB()) {
            uq.queryTMoveInstB().reflectRelationOnUnionQuery(bq.queryTMoveInstB(), uq.queryTMoveInstB());
        }
        if (bq.hasConditionQueryTMoveInstH()) {
            uq.queryTMoveInstH().reflectRelationOnUnionQuery(bq.queryTMoveInstH(), uq.queryTMoveInstH());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryBClassDtlByAllShippingFlg()) {
            uq.queryBClassDtlByAllShippingFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAllShippingFlg(), uq.queryBClassDtlByAllShippingFlg());
        }
        if (bq.hasConditionQueryBClassDtlByStoreNoMergeFlg()) {
            uq.queryBClassDtlByStoreNoMergeFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStoreNoMergeFlg(), uq.queryBClassDtlByStoreNoMergeFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_INST_B by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveInstBCQ queryTMoveInstB() {
        return xdfgetConditionQueryTMoveInstB();
    }
    public TMoveInstBCQ xdfgetConditionQueryTMoveInstB() {
        String prop = "tMoveInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveInstB()); xsetupOuterJoinTMoveInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveInstBCQ xcreateQueryTMoveInstB() {
        String nrp = xresolveNRP("T_MOVE_RECORD_B", "tMoveInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstB", nrp);
    }
    protected void xsetupOuterJoinTMoveInstB() { xregOutJo("tMoveInstB"); }
    public boolean hasConditionQueryTMoveInstB() { return xhasQueRlMap("tMoveInstB"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveInstHCQ queryTMoveInstH() {
        return xdfgetConditionQueryTMoveInstH();
    }
    public TMoveInstHCQ xdfgetConditionQueryTMoveInstH() {
        String prop = "tMoveInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveInstH()); xsetupOuterJoinTMoveInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveInstHCQ xcreateQueryTMoveInstH() {
        String nrp = xresolveNRP("T_MOVE_RECORD_B", "tMoveInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstH", nrp);
    }
    protected void xsetupOuterJoinTMoveInstH() { xregOutJo("tMoveInstH"); }
    public boolean hasConditionQueryTMoveInstH() { return xhasQueRlMap("tMoveInstH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The instance of condition-query. (NotNull)
     */
    public MLocationCQ queryMLocation() {
        return xdfgetConditionQueryMLocation();
    }
    public MLocationCQ xdfgetConditionQueryMLocation() {
        String prop = "mLocation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMLocation()); xsetupOuterJoinMLocation(); }
        return xgetQueRlMap(prop);
    }
    protected MLocationCQ xcreateQueryMLocation() {
        String nrp = xresolveNRP("T_MOVE_RECORD_B", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAllShippingFlg() {
        return xdfgetConditionQueryBClassDtlByAllShippingFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAllShippingFlg() {
        String prop = "bClassDtlByAllShippingFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAllShippingFlg()); xsetupOuterJoinBClassDtlByAllShippingFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAllShippingFlg() {
        String nrp = xresolveNRP("T_MOVE_RECORD_B", "bClassDtlByAllShippingFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAllShippingFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAllShippingFlg() { xregOutJo("bClassDtlByAllShippingFlg"); }
    public boolean hasConditionQueryBClassDtlByAllShippingFlg() { return xhasQueRlMap("bClassDtlByAllShippingFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStoreNoMergeFlg() {
        return xdfgetConditionQueryBClassDtlByStoreNoMergeFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStoreNoMergeFlg() {
        String prop = "bClassDtlByStoreNoMergeFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStoreNoMergeFlg()); xsetupOuterJoinBClassDtlByStoreNoMergeFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStoreNoMergeFlg() {
        String nrp = xresolveNRP("T_MOVE_RECORD_B", "bClassDtlByStoreNoMergeFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStoreNoMergeFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStoreNoMergeFlg() { xregOutJo("bClassDtlByStoreNoMergeFlg"); }
    public boolean hasConditionQueryBClassDtlByStoreNoMergeFlg() { return xhasQueRlMap("bClassDtlByStoreNoMergeFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TMoveRecordBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TMoveRecordBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TMoveRecordBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TMoveRecordBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TMoveRecordBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TMoveRecordBCQ> _myselfExistsMap;
    public Map<String, TMoveRecordBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TMoveRecordBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TMoveRecordBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TMoveRecordBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TMoveRecordBCB.class.getName(); }
    protected String xCQ() { return TMoveRecordBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
