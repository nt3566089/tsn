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
 * The base condition-query of B_ITEM_VALID.
 * @author DBFlute(AutoGenerator)
 */
public class BsBItemValidCQ extends AbstractBsBItemValidCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BItemValidCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBItemValidCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_ITEM_VALID) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BItemValidCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BItemValidCIQ xcreateCIQ() {
        BItemValidCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BItemValidCIQ xnewCIQ() {
        return new BItemValidCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_ITEM_VALID on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BItemValidCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BItemValidCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _itemId;
    public ConditionValue xdfgetItemId()
    { if (_itemId == null) { _itemId = nCV(); }
      return _itemId; }
    protected ConditionValue xgetCValueItemId() { return xdfgetItemId(); }

    public Map<String, BItemCQ> getItemId_InScopeRelation_BItem() { return xgetSQueMap("itemId_InScopeRelation_BItem"); }
    public String keepItemId_InScopeRelation_BItem(BItemCQ sq) { return xkeepSQue("itemId_InScopeRelation_BItem", sq); }

    public Map<String, BItemCQ> getItemId_NotInScopeRelation_BItem() { return xgetSQueMap("itemId_NotInScopeRelation_BItem"); }
    public String keepItemId_NotInScopeRelation_BItem(BItemCQ sq) { return xkeepSQue("itemId_NotInScopeRelation_BItem", sq); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ITEM}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_ItemId_Asc() { regOBA("ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ITEM}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_ItemId_Desc() { regOBD("ITEM_ID"); return this; }

    protected ConditionValue _inputLimit;
    public ConditionValue xdfgetInputLimit()
    { if (_inputLimit == null) { _inputLimit = nCV(); }
      return _inputLimit; }
    protected ConditionValue xgetCValueInputLimit() { return xdfgetInputLimit(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_InputLimit_Asc() { regOBA("INPUT_LIMIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_InputLimit_Desc() { regOBD("INPUT_LIMIT"); return this; }

    protected ConditionValue _limitMessageCd;
    public ConditionValue xdfgetLimitMessageCd()
    { if (_limitMessageCd == null) { _limitMessageCd = nCV(); }
      return _limitMessageCd; }
    protected ConditionValue xgetCValueLimitMessageCd() { return xdfgetLimitMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_LimitMessageCd_Asc() { regOBA("LIMIT_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_LimitMessageCd_Desc() { regOBD("LIMIT_MESSAGE_CD"); return this; }

    protected ConditionValue _minChars;
    public ConditionValue xdfgetMinChars()
    { if (_minChars == null) { _minChars = nCV(); }
      return _minChars; }
    protected ConditionValue xgetCValueMinChars() { return xdfgetMinChars(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_CHARS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MinChars_Asc() { regOBA("MIN_CHARS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_CHARS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MinChars_Desc() { regOBD("MIN_CHARS"); return this; }

    protected ConditionValue _maxChars;
    public ConditionValue xdfgetMaxChars()
    { if (_maxChars == null) { _maxChars = nCV(); }
      return _maxChars; }
    protected ConditionValue xgetCValueMaxChars() { return xdfgetMaxChars(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_CHARS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MaxChars_Asc() { regOBA("MAX_CHARS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_CHARS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MaxChars_Desc() { regOBD("MAX_CHARS"); return this; }

    protected ConditionValue _minNumber;
    public ConditionValue xdfgetMinNumber()
    { if (_minNumber == null) { _minNumber = nCV(); }
      return _minNumber; }
    protected ConditionValue xgetCValueMinNumber() { return xdfgetMinNumber(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MinNumber_Asc() { regOBA("MIN_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MinNumber_Desc() { regOBD("MIN_NUMBER"); return this; }

    protected ConditionValue _maxNumber;
    public ConditionValue xdfgetMaxNumber()
    { if (_maxNumber == null) { _maxNumber = nCV(); }
      return _maxNumber; }
    protected ConditionValue xgetCValueMaxNumber() { return xdfgetMaxNumber(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MaxNumber_Asc() { regOBA("MAX_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_MaxNumber_Desc() { regOBD("MAX_NUMBER"); return this; }

    protected ConditionValue _integerLength;
    public ConditionValue xdfgetIntegerLength()
    { if (_integerLength == null) { _integerLength = nCV(); }
      return _integerLength; }
    protected ConditionValue xgetCValueIntegerLength() { return xdfgetIntegerLength(); }

    /**
     * Add order-by as ascend. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_IntegerLength_Asc() { regOBA("INTEGER_LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_IntegerLength_Desc() { regOBD("INTEGER_LENGTH"); return this; }

    protected ConditionValue _decimalLength;
    public ConditionValue xdfgetDecimalLength()
    { if (_decimalLength == null) { _decimalLength = nCV(); }
      return _decimalLength; }
    protected ConditionValue xgetCValueDecimalLength() { return xdfgetDecimalLength(); }

    /**
     * Add order-by as ascend. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_DecimalLength_Asc() { regOBA("DECIMAL_LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_DecimalLength_Desc() { regOBD("DECIMAL_LENGTH"); return this; }

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
    public BsBItemValidCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBItemValidCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBItemValidCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBItemValidCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBItemValidCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBItemValidCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBItemValidCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBItemValidCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBItemValidCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBItemValidCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBItemValidCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBItemValidCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BItemValidCQ bq = (BItemValidCQ)bqs;
        BItemValidCQ uq = (BItemValidCQ)uqs;
        if (bq.hasConditionQueryBItem()) {
            uq.queryBItem().reflectRelationOnUnionQuery(bq.queryBItem(), uq.queryBItem());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The instance of condition-query. (NotNull)
     */
    public BItemCQ queryBItem() {
        return xdfgetConditionQueryBItem();
    }
    public BItemCQ xdfgetConditionQueryBItem() {
        String prop = "bItem";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBItem()); xsetupOuterJoinBItem(); }
        return xgetQueRlMap(prop);
    }
    protected BItemCQ xcreateQueryBItem() {
        String nrp = xresolveNRP("B_ITEM_VALID", "bItem"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BItemCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bItem", nrp);
    }
    protected void xsetupOuterJoinBItem() { xregOutJo("bItem"); }
    public boolean hasConditionQueryBItem() { return xhasQueRlMap("bItem"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BItemValidCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BItemValidCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BItemValidCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BItemValidCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BItemValidCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BItemValidCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BItemValidCQ> _myselfExistsMap;
    public Map<String, BItemValidCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BItemValidCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BItemValidCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BItemValidCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BItemValidCB.class.getName(); }
    protected String xCQ() { return BItemValidCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
