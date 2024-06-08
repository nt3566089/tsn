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
 * The base condition-query of W_PALLET_SYMBOL_JT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWPalletSymbolJtCQ extends AbstractBsWPalletSymbolJtCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WPalletSymbolJtCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWPalletSymbolJtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_PALLET_SYMBOL_JT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WPalletSymbolJtCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WPalletSymbolJtCIQ xcreateCIQ() {
        WPalletSymbolJtCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WPalletSymbolJtCIQ xnewCIQ() {
        return new WPalletSymbolJtCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_PALLET_SYMBOL_JT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WPalletSymbolJtCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WPalletSymbolJtCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _wksojtkey;
    public ConditionValue xdfgetWksojtkey()
    { if (_wksojtkey == null) { _wksojtkey = nCV(); }
      return _wksojtkey; }
    protected ConditionValue xgetCValueWksojtkey() { return xdfgetWksojtkey(); }

    /**
     * Add order-by as ascend. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_Wksojtkey_Asc() { regOBA("WKSOJTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_Wksojtkey_Desc() { regOBD("WKSOJTKEY"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _trpalletId;
    public ConditionValue xdfgetTrpalletId()
    { if (_trpalletId == null) { _trpalletId = nCV(); }
      return _trpalletId; }
    protected ConditionValue xgetCValueTrpalletId() { return xdfgetTrpalletId(); }

    /**
     * Add order-by as ascend. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_TrpalletId_Asc() { regOBA("TRPALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_TrpalletId_Desc() { regOBD("TRPALLET_ID"); return this; }

    protected ConditionValue _palletNo;
    public ConditionValue xdfgetPalletNo()
    { if (_palletNo == null) { _palletNo = nCV(); }
      return _palletNo; }
    protected ConditionValue xgetCValuePalletNo() { return xdfgetPalletNo(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_PalletNo_Asc() { regOBA("PALLET_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_PalletNo_Desc() { regOBD("PALLET_NO"); return this; }

    protected ConditionValue _ownerSoNo;
    public ConditionValue xdfgetOwnerSoNo()
    { if (_ownerSoNo == null) { _ownerSoNo = nCV(); }
      return _ownerSoNo; }
    protected ConditionValue xgetCValueOwnerSoNo() { return xdfgetOwnerSoNo(); }

    /**
     * Add order-by as ascend. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_OwnerSoNo_Asc() { regOBA("OWNER_SO_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_OwnerSoNo_Desc() { regOBD("OWNER_SO_NO"); return this; }

    protected ConditionValue _soPalletNo;
    public ConditionValue xdfgetSoPalletNo()
    { if (_soPalletNo == null) { _soPalletNo = nCV(); }
      return _soPalletNo; }
    protected ConditionValue xgetCValueSoPalletNo() { return xdfgetSoPalletNo(); }

    /**
     * Add order-by as ascend. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_SoPalletNo_Asc() { regOBA("SO_PALLET_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_SoPalletNo_Desc() { regOBD("SO_PALLET_NO"); return this; }

    protected ConditionValue _trsymbolId;
    public ConditionValue xdfgetTrsymbolId()
    { if (_trsymbolId == null) { _trsymbolId = nCV(); }
      return _trsymbolId; }
    protected ConditionValue xgetCValueTrsymbolId() { return xdfgetTrsymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_TrsymbolId_Asc() { regOBA("TRSYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_TrsymbolId_Desc() { regOBD("TRSYMBOL_ID"); return this; }

    protected ConditionValue _symbolNo;
    public ConditionValue xdfgetSymbolNo()
    { if (_symbolNo == null) { _symbolNo = nCV(); }
      return _symbolNo; }
    protected ConditionValue xgetCValueSymbolNo() { return xdfgetSymbolNo(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_SymbolNo_Asc() { regOBA("SYMBOL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_SymbolNo_Desc() { regOBD("SYMBOL_NO"); return this; }

    protected ConditionValue _sortedQty;
    public ConditionValue xdfgetSortedQty()
    { if (_sortedQty == null) { _sortedQty = nCV(); }
      return _sortedQty; }
    protected ConditionValue xgetCValueSortedQty() { return xdfgetSortedQty(); }

    /**
     * Add order-by as ascend. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_SortedQty_Asc() { regOBA("SORTED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTED_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_SortedQty_Desc() { regOBD("SORTED_QTY"); return this; }

    protected ConditionValue _enterFlg;
    public ConditionValue xdfgetEnterFlg()
    { if (_enterFlg == null) { _enterFlg = nCV(); }
      return _enterFlg; }
    protected ConditionValue xgetCValueEnterFlg() { return xdfgetEnterFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_EnterFlg_Asc() { regOBA("ENTER_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTER_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_EnterFlg_Desc() { regOBD("ENTER_FLG"); return this; }

    protected ConditionValue _packedFlg;
    public ConditionValue xdfgetPackedFlg()
    { if (_packedFlg == null) { _packedFlg = nCV(); }
      return _packedFlg; }
    protected ConditionValue xgetCValuePackedFlg() { return xdfgetPackedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_PackedFlg_Asc() { regOBA("PACKED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKED_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_PackedFlg_Desc() { regOBD("PACKED_FLG"); return this; }

    protected ConditionValue _rcvKey;
    public ConditionValue xdfgetRcvKey()
    { if (_rcvKey == null) { _rcvKey = nCV(); }
      return _rcvKey; }
    protected ConditionValue xgetCValueRcvKey() { return xdfgetRcvKey(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_RcvKey_Asc() { regOBA("RCV_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_RcvKey_Desc() { regOBD("RCV_KEY"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWPalletSymbolJtCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWPalletSymbolJtCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWPalletSymbolJtCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWPalletSymbolJtCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WPalletSymbolJtCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WPalletSymbolJtCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WPalletSymbolJtCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WPalletSymbolJtCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WPalletSymbolJtCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WPalletSymbolJtCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WPalletSymbolJtCQ> _myselfExistsMap;
    public Map<String, WPalletSymbolJtCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WPalletSymbolJtCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WPalletSymbolJtCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WPalletSymbolJtCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WPalletSymbolJtCB.class.getName(); }
    protected String xCQ() { return WPalletSymbolJtCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
