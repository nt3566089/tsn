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
 * The base condition-query of T_STORE_NO.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStoreNoCQ extends AbstractBsTStoreNoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStoreNoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreNoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_STORE_NO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStoreNoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStoreNoCIQ xcreateCIQ() {
        TStoreNoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStoreNoCIQ xnewCIQ() {
        return new TStoreNoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_STORE_NO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStoreNoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStoreNoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    public Map<String, TAllocInstBCQ> xdfgetStoreNoId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("storeNoId_ExistsReferrer_TAllocInstBList"); }
    public String keepStoreNoId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStoreNoId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("storeNoId_ExistsReferrer_TInventoryBList"); }
    public String keepStoreNoId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetStoreNoId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("storeNoId_ExistsReferrer_TMoveInstBList"); }
    public String keepStoreNoId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetStoreNoId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("storeNoId_ExistsReferrer_TShippingInstBList"); }
    public String keepStoreNoId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetStoreNoId_ExistsReferrer_TStockList() { return xgetSQueMap("storeNoId_ExistsReferrer_TStockList"); }
    public String keepStoreNoId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStoreNoCQ> xdfgetStoreNoId_ExistsReferrer_TStoreNoSelfList() { return xgetSQueMap("storeNoId_ExistsReferrer_TStoreNoSelfList"); }
    public String keepStoreNoId_ExistsReferrer_TStoreNoSelfList(TStoreNoCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TStoreNoSelfList", sq); }

    public Map<String, TStoreNoRCQ> xdfgetStoreNoId_ExistsReferrer_TStoreNoRAsOne() { return xgetSQueMap("storeNoId_ExistsReferrer_TStoreNoRAsOne"); }
    public String keepStoreNoId_ExistsReferrer_TStoreNoRAsOne(TStoreNoRCQ sq) { return xkeepSQue("storeNoId_ExistsReferrer_TStoreNoRAsOne", sq); }

    public Map<String, TAllocInstBCQ> xdfgetStoreNoId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("storeNoId_NotExistsReferrer_TAllocInstBList"); }
    public String keepStoreNoId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStoreNoId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("storeNoId_NotExistsReferrer_TInventoryBList"); }
    public String keepStoreNoId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetStoreNoId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("storeNoId_NotExistsReferrer_TMoveInstBList"); }
    public String keepStoreNoId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetStoreNoId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("storeNoId_NotExistsReferrer_TShippingInstBList"); }
    public String keepStoreNoId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetStoreNoId_NotExistsReferrer_TStockList() { return xgetSQueMap("storeNoId_NotExistsReferrer_TStockList"); }
    public String keepStoreNoId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStoreNoCQ> xdfgetStoreNoId_NotExistsReferrer_TStoreNoSelfList() { return xgetSQueMap("storeNoId_NotExistsReferrer_TStoreNoSelfList"); }
    public String keepStoreNoId_NotExistsReferrer_TStoreNoSelfList(TStoreNoCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TStoreNoSelfList", sq); }

    public Map<String, TStoreNoRCQ> xdfgetStoreNoId_NotExistsReferrer_TStoreNoRAsOne() { return xgetSQueMap("storeNoId_NotExistsReferrer_TStoreNoRAsOne"); }
    public String keepStoreNoId_NotExistsReferrer_TStoreNoRAsOne(TStoreNoRCQ sq) { return xkeepSQue("storeNoId_NotExistsReferrer_TStoreNoRAsOne", sq); }

    public Map<String, TAllocInstBCQ> xdfgetStoreNoId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("storeNoId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepStoreNoId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("storeNoId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStoreNoId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("storeNoId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepStoreNoId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("storeNoId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetStoreNoId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("storeNoId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepStoreNoId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("storeNoId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetStoreNoId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("storeNoId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepStoreNoId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("storeNoId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetStoreNoId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("storeNoId_SpecifyDerivedReferrer_TStockList"); }
    public String keepStoreNoId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("storeNoId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStoreNoCQ> xdfgetStoreNoId_SpecifyDerivedReferrer_TStoreNoSelfList() { return xgetSQueMap("storeNoId_SpecifyDerivedReferrer_TStoreNoSelfList"); }
    public String keepStoreNoId_SpecifyDerivedReferrer_TStoreNoSelfList(TStoreNoCQ sq) { return xkeepSQue("storeNoId_SpecifyDerivedReferrer_TStoreNoSelfList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetStoreNoId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("storeNoId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("storeNoId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetStoreNoId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("storeNoId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("storeNoId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TInventoryBCQ> xdfgetStoreNoId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("storeNoId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("storeNoId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetStoreNoId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("storeNoId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("storeNoId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetStoreNoId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("storeNoId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("storeNoId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetStoreNoId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("storeNoId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("storeNoId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetStoreNoId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("storeNoId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("storeNoId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetStoreNoId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("storeNoId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("storeNoId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetStoreNoId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("storeNoId_QueryDerivedReferrer_TStockList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("storeNoId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetStoreNoId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("storeNoId_QueryDerivedReferrer_TStockList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("storeNoId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStoreNoCQ> xdfgetStoreNoId_QueryDerivedReferrer_TStoreNoSelfList() { return xgetSQueMap("storeNoId_QueryDerivedReferrer_TStoreNoSelfList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TStoreNoSelfList(TStoreNoCQ sq) { return xkeepSQue("storeNoId_QueryDerivedReferrer_TStoreNoSelfList", sq); }
    public Map<String, Object> xdfgetStoreNoId_QueryDerivedReferrer_TStoreNoSelfListParameter() { return xgetSQuePmMap("storeNoId_QueryDerivedReferrer_TStoreNoSelfList"); }
    public String keepStoreNoId_QueryDerivedReferrer_TStoreNoSelfListParameter(Object pm) { return xkeepSQuePm("storeNoId_QueryDerivedReferrer_TStoreNoSelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

    protected ConditionValue _storeLabelNo;
    public ConditionValue xdfgetStoreLabelNo()
    { if (_storeLabelNo == null) { _storeLabelNo = nCV(); }
      return _storeLabelNo; }
    protected ConditionValue xgetCValueStoreLabelNo() { return xdfgetStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LABEL_NO: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

    protected ConditionValue _oldStoreNumId;
    public ConditionValue xdfgetOldStoreNumId()
    { if (_oldStoreNumId == null) { _oldStoreNumId = nCV(); }
      return _oldStoreNumId; }
    protected ConditionValue xgetCValueOldStoreNumId() { return xdfgetOldStoreNumId(); }

    public Map<String, TStoreNoCQ> getOldStoreNumId_InScopeRelation_TStoreNoSelf() { return xgetSQueMap("oldStoreNumId_InScopeRelation_TStoreNoSelf"); }
    public String keepOldStoreNumId_InScopeRelation_TStoreNoSelf(TStoreNoCQ sq) { return xkeepSQue("oldStoreNumId_InScopeRelation_TStoreNoSelf", sq); }

    public Map<String, TStoreNoCQ> getOldStoreNumId_NotInScopeRelation_TStoreNoSelf() { return xgetSQueMap("oldStoreNumId_NotInScopeRelation_TStoreNoSelf"); }
    public String keepOldStoreNumId_NotInScopeRelation_TStoreNoSelf(TStoreNoCQ sq) { return xkeepSQue("oldStoreNumId_NotInScopeRelation_TStoreNoSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * OLD_STORE_NUM_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_OldStoreNumId_Asc() { regOBA("OLD_STORE_NUM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * OLD_STORE_NUM_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_OldStoreNumId_Desc() { regOBD("OLD_STORE_NUM_ID"); return this; }

    protected ConditionValue _supplierId;
    public ConditionValue xdfgetSupplierId()
    { if (_supplierId == null) { _supplierId = nCV(); }
      return _supplierId; }
    protected ConditionValue xgetCValueSupplierId() { return xdfgetSupplierId(); }

    public Map<String, MCustomerCQ> getSupplierId_InScopeRelation_MCustomer() { return xgetSQueMap("supplierId_InScopeRelation_MCustomer"); }
    public String keepSupplierId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("supplierId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getSupplierId_NotInScopeRelation_MCustomer() { return xgetSQueMap("supplierId_NotInScopeRelation_MCustomer"); }
    public String keepSupplierId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("supplierId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

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
    public BsTStoreNoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStoreNoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStoreNoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStoreNoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStoreNoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStoreNoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStoreNoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStoreNoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStoreNoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreNoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStoreNoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStoreNoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStoreNoCQ bq = (TStoreNoCQ)bqs;
        TStoreNoCQ uq = (TStoreNoCQ)uqs;
        if (bq.hasConditionQueryTStoreNoSelf()) {
            uq.queryTStoreNoSelf().reflectRelationOnUnionQuery(bq.queryTStoreNoSelf(), uq.queryTStoreNoSelf());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryTStoreNoRAsOne()) {
            uq.queryTStoreNoRAsOne().reflectRelationOnUnionQuery(bq.queryTStoreNoRAsOne(), uq.queryTStoreNoRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_NO by my OLD_STORE_NUM_ID, named 'TStoreNoSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreNoCQ queryTStoreNoSelf() {
        return xdfgetConditionQueryTStoreNoSelf();
    }
    public TStoreNoCQ xdfgetConditionQueryTStoreNoSelf() {
        String prop = "tStoreNoSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreNoSelf()); xsetupOuterJoinTStoreNoSelf(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreNoCQ xcreateQueryTStoreNoSelf() {
        String nrp = xresolveNRP("T_STORE_NO", "tStoreNoSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreNoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreNoSelf", nrp);
    }
    protected void xsetupOuterJoinTStoreNoSelf() { xregOutJo("tStoreNoSelf"); }
    public boolean hasConditionQueryTStoreNoSelf() { return xhasQueRlMap("tStoreNoSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("T_STORE_NO", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_NO_R by STORE_NO_ID, named 'TStoreNoRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreNoRCQ queryTStoreNoRAsOne() { return xdfgetConditionQueryTStoreNoRAsOne(); }
    public TStoreNoRCQ xdfgetConditionQueryTStoreNoRAsOne() {
        String prop = "tStoreNoRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreNoRAsOne()); xsetupOuterJoinTStoreNoRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreNoRCQ xcreateQueryTStoreNoRAsOne() {
        String nrp = xresolveNRP("T_STORE_NO", "tStoreNoRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreNoRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreNoRAsOne", nrp);
    }
    protected void xsetupOuterJoinTStoreNoRAsOne() { xregOutJo("tStoreNoRAsOne"); }
    public boolean hasConditionQueryTStoreNoRAsOne() { return xhasQueRlMap("tStoreNoRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStoreNoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStoreNoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStoreNoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStoreNoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStoreNoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStoreNoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStoreNoCQ> _myselfExistsMap;
    public Map<String, TStoreNoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStoreNoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStoreNoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStoreNoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStoreNoCB.class.getName(); }
    protected String xCQ() { return TStoreNoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
