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
 * The base condition-query of T_TRTEMPALLOCATESEQDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrtempallocateseqdetailCQ extends AbstractBsTTrtempallocateseqdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrtempallocateseqdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrtempallocateseqdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRTEMPALLOCATESEQDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrtempallocateseqdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrtempallocateseqdetailCIQ xcreateCIQ() {
        TTrtempallocateseqdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrtempallocateseqdetailCIQ xnewCIQ() {
        return new TTrtempallocateseqdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRTEMPALLOCATESEQDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrtempallocateseqdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrtempallocateseqdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _temporaryAllocDetailId;
    public ConditionValue xdfgetTemporaryAllocDetailId()
    { if (_temporaryAllocDetailId == null) { _temporaryAllocDetailId = nCV(); }
      return _temporaryAllocDetailId; }
    protected ConditionValue xgetCValueTemporaryAllocDetailId() { return xdfgetTemporaryAllocDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_TemporaryAllocDetailId_Asc() { regOBA("TEMPORARY_ALLOC_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_TemporaryAllocDetailId_Desc() { regOBD("TEMPORARY_ALLOC_DETAIL_ID"); return this; }

    protected ConditionValue _temporaryAllocId;
    public ConditionValue xdfgetTemporaryAllocId()
    { if (_temporaryAllocId == null) { _temporaryAllocId = nCV(); }
      return _temporaryAllocId; }
    protected ConditionValue xgetCValueTemporaryAllocId() { return xdfgetTemporaryAllocId(); }

    public Map<String, TTrtempallocateseqCQ> getTemporaryAllocId_InScopeRelation_TTrtempallocateseq() { return xgetSQueMap("temporaryAllocId_InScopeRelation_TTrtempallocateseq"); }
    public String keepTemporaryAllocId_InScopeRelation_TTrtempallocateseq(TTrtempallocateseqCQ sq) { return xkeepSQue("temporaryAllocId_InScopeRelation_TTrtempallocateseq", sq); }

    public Map<String, TTrtempallocateseqCQ> getTemporaryAllocId_NotInScopeRelation_TTrtempallocateseq() { return xgetSQueMap("temporaryAllocId_NotInScopeRelation_TTrtempallocateseq"); }
    public String keepTemporaryAllocId_NotInScopeRelation_TTrtempallocateseq(TTrtempallocateseqCQ sq) { return xkeepSQue("temporaryAllocId_NotInScopeRelation_TTrtempallocateseq", sq); }

    /**
     * Add order-by as ascend. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_TemporaryAllocId_Asc() { regOBA("TEMPORARY_ALLOC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_TemporaryAllocId_Desc() { regOBD("TEMPORARY_ALLOC_ID"); return this; }

    protected ConditionValue _allocateseq;
    public ConditionValue xdfgetAllocateseq()
    { if (_allocateseq == null) { _allocateseq = nCV(); }
      return _allocateseq; }
    protected ConditionValue xgetCValueAllocateseq() { return xdfgetAllocateseq(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Allocateseq_Asc() { regOBA("ALLOCATESEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Allocateseq_Desc() { regOBD("ALLOCATESEQ"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _listkbn;
    public ConditionValue xdfgetListkbn()
    { if (_listkbn == null) { _listkbn = nCV(); }
      return _listkbn; }
    protected ConditionValue xgetCValueListkbn() { return xdfgetListkbn(); }

    /**
     * Add order-by as ascend. <br>
     * LISTKBN: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Listkbn_Asc() { regOBA("LISTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LISTKBN: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Listkbn_Desc() { regOBD("LISTKBN"); return this; }

    protected ConditionValue _detaillineno;
    public ConditionValue xdfgetDetaillineno()
    { if (_detaillineno == null) { _detaillineno = nCV(); }
      return _detaillineno; }
    protected ConditionValue xgetCValueDetaillineno() { return xdfgetDetaillineno(); }

    /**
     * Add order-by as ascend. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Detaillineno_Asc() { regOBA("DETAILLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DETAILLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Detaillineno_Desc() { regOBD("DETAILLINENO"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _temppickedqty1;
    public ConditionValue xdfgetTemppickedqty1()
    { if (_temppickedqty1 == null) { _temppickedqty1 = nCV(); }
      return _temppickedqty1; }
    protected ConditionValue xgetCValueTemppickedqty1() { return xdfgetTemppickedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Temppickedqty1_Asc() { regOBA("TEMPPICKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMPPICKEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Temppickedqty1_Desc() { regOBD("TEMPPICKEDQTY1"); return this; }

    protected ConditionValue _temppickedqty2;
    public ConditionValue xdfgetTemppickedqty2()
    { if (_temppickedqty2 == null) { _temppickedqty2 = nCV(); }
      return _temppickedqty2; }
    protected ConditionValue xgetCValueTemppickedqty2() { return xdfgetTemppickedqty2(); }

    /**
     * Add order-by as ascend. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Temppickedqty2_Asc() { regOBA("TEMPPICKEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMPPICKEDQTY2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Temppickedqty2_Desc() { regOBD("TEMPPICKEDQTY2"); return this; }

    protected ConditionValue _temppickedqty3;
    public ConditionValue xdfgetTemppickedqty3()
    { if (_temppickedqty3 == null) { _temppickedqty3 = nCV(); }
      return _temppickedqty3; }
    protected ConditionValue xgetCValueTemppickedqty3() { return xdfgetTemppickedqty3(); }

    /**
     * Add order-by as ascend. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Temppickedqty3_Asc() { regOBA("TEMPPICKEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMPPICKEDQTY3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_Temppickedqty3_Desc() { regOBD("TEMPPICKEDQTY3"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrtempallocateseqdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrtempallocateseqdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrtempallocateseqdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrtempallocateseqdetailCQ bq = (TTrtempallocateseqdetailCQ)bqs;
        TTrtempallocateseqdetailCQ uq = (TTrtempallocateseqdetailCQ)uqs;
        if (bq.hasConditionQueryTTrtempallocateseq()) {
            uq.queryTTrtempallocateseq().reflectRelationOnUnionQuery(bq.queryTTrtempallocateseq(), uq.queryTTrtempallocateseq());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrtempallocateseqCQ queryTTrtempallocateseq() {
        return xdfgetConditionQueryTTrtempallocateseq();
    }
    public TTrtempallocateseqCQ xdfgetConditionQueryTTrtempallocateseq() {
        String prop = "tTrtempallocateseq";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrtempallocateseq()); xsetupOuterJoinTTrtempallocateseq(); }
        return xgetQueRlMap(prop);
    }
    protected TTrtempallocateseqCQ xcreateQueryTTrtempallocateseq() {
        String nrp = xresolveNRP("T_TRTEMPALLOCATESEQDETAIL", "tTrtempallocateseq"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrtempallocateseqCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrtempallocateseq", nrp);
    }
    protected void xsetupOuterJoinTTrtempallocateseq() { xregOutJo("tTrtempallocateseq"); }
    public boolean hasConditionQueryTTrtempallocateseq() { return xhasQueRlMap("tTrtempallocateseq"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrtempallocateseqdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrtempallocateseqdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrtempallocateseqdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrtempallocateseqdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrtempallocateseqdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrtempallocateseqdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrtempallocateseqdetailCQ> _myselfExistsMap;
    public Map<String, TTrtempallocateseqdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrtempallocateseqdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrtempallocateseqdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrtempallocateseqdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrtempallocateseqdetailCB.class.getName(); }
    protected String xCQ() { return TTrtempallocateseqdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
