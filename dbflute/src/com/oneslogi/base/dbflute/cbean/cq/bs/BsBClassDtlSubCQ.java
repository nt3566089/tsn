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
 * The base condition-query of B_CLASS_DTL_SUB.
 * @author DBFlute(AutoGenerator)
 */
public class BsBClassDtlSubCQ extends AbstractBsBClassDtlSubCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BClassDtlSubCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBClassDtlSubCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_CLASS_DTL_SUB) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BClassDtlSubCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BClassDtlSubCIQ xcreateCIQ() {
        BClassDtlSubCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BClassDtlSubCIQ xnewCIQ() {
        return new BClassDtlSubCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_CLASS_DTL_SUB on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BClassDtlSubCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BClassDtlSubCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _classDtlId;
    public ConditionValue xdfgetClassDtlId()
    { if (_classDtlId == null) { _classDtlId = nCV(); }
      return _classDtlId; }
    protected ConditionValue xgetCValueClassDtlId() { return xdfgetClassDtlId(); }

    public Map<String, BClassDtlCQ> getClassDtlId_InScopeRelation_BClassDtl() { return xgetSQueMap("classDtlId_InScopeRelation_BClassDtl"); }
    public String keepClassDtlId_InScopeRelation_BClassDtl(BClassDtlCQ sq) { return xkeepSQue("classDtlId_InScopeRelation_BClassDtl", sq); }

    public Map<String, BClassDtlCQ> getClassDtlId_NotInScopeRelation_BClassDtl() { return xgetSQueMap("classDtlId_NotInScopeRelation_BClassDtl"); }
    public String keepClassDtlId_NotInScopeRelation_BClassDtl(BClassDtlCQ sq) { return xkeepSQue("classDtlId_NotInScopeRelation_BClassDtl", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to B_CLASS_DTL}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_ClassDtlId_Asc() { regOBA("CLASS_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to B_CLASS_DTL}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_ClassDtlId_Desc() { regOBD("CLASS_DTL_ID"); return this; }

    protected ConditionValue _othercd1;
    public ConditionValue xdfgetOthercd1()
    { if (_othercd1 == null) { _othercd1 = nCV(); }
      return _othercd1; }
    protected ConditionValue xgetCValueOthercd1() { return xdfgetOthercd1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERCD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd1_Asc() { regOBA("OTHERCD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERCD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd1_Desc() { regOBD("OTHERCD1"); return this; }

    protected ConditionValue _othercd2;
    public ConditionValue xdfgetOthercd2()
    { if (_othercd2 == null) { _othercd2 = nCV(); }
      return _othercd2; }
    protected ConditionValue xgetCValueOthercd2() { return xdfgetOthercd2(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERCD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd2_Asc() { regOBA("OTHERCD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERCD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd2_Desc() { regOBD("OTHERCD2"); return this; }

    protected ConditionValue _othercd3;
    public ConditionValue xdfgetOthercd3()
    { if (_othercd3 == null) { _othercd3 = nCV(); }
      return _othercd3; }
    protected ConditionValue xgetCValueOthercd3() { return xdfgetOthercd3(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERCD3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd3_Asc() { regOBA("OTHERCD3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERCD3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd3_Desc() { regOBD("OTHERCD3"); return this; }

    protected ConditionValue _othercd4;
    public ConditionValue xdfgetOthercd4()
    { if (_othercd4 == null) { _othercd4 = nCV(); }
      return _othercd4; }
    protected ConditionValue xgetCValueOthercd4() { return xdfgetOthercd4(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERCD4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd4_Asc() { regOBA("OTHERCD4"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERCD4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd4_Desc() { regOBD("OTHERCD4"); return this; }

    protected ConditionValue _othercd5;
    public ConditionValue xdfgetOthercd5()
    { if (_othercd5 == null) { _othercd5 = nCV(); }
      return _othercd5; }
    protected ConditionValue xgetCValueOthercd5() { return xdfgetOthercd5(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERCD5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd5_Asc() { regOBA("OTHERCD5"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERCD5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Othercd5_Desc() { regOBD("OTHERCD5"); return this; }

    protected ConditionValue _other1Comment;
    public ConditionValue xdfgetOther1Comment()
    { if (_other1Comment == null) { _other1Comment = nCV(); }
      return _other1Comment; }
    protected ConditionValue xgetCValueOther1Comment() { return xdfgetOther1Comment(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other1Comment_Asc() { regOBA("OTHER1_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other1Comment_Desc() { regOBD("OTHER1_COMMENT"); return this; }

    protected ConditionValue _other2Comment;
    public ConditionValue xdfgetOther2Comment()
    { if (_other2Comment == null) { _other2Comment = nCV(); }
      return _other2Comment; }
    protected ConditionValue xgetCValueOther2Comment() { return xdfgetOther2Comment(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other2Comment_Asc() { regOBA("OTHER2_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other2Comment_Desc() { regOBD("OTHER2_COMMENT"); return this; }

    protected ConditionValue _other3Comment;
    public ConditionValue xdfgetOther3Comment()
    { if (_other3Comment == null) { _other3Comment = nCV(); }
      return _other3Comment; }
    protected ConditionValue xgetCValueOther3Comment() { return xdfgetOther3Comment(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other3Comment_Asc() { regOBA("OTHER3_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other3Comment_Desc() { regOBD("OTHER3_COMMENT"); return this; }

    protected ConditionValue _other4Comment;
    public ConditionValue xdfgetOther4Comment()
    { if (_other4Comment == null) { _other4Comment = nCV(); }
      return _other4Comment; }
    protected ConditionValue xgetCValueOther4Comment() { return xdfgetOther4Comment(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other4Comment_Asc() { regOBA("OTHER4_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other4Comment_Desc() { regOBD("OTHER4_COMMENT"); return this; }

    protected ConditionValue _other5Comment;
    public ConditionValue xdfgetOther5Comment()
    { if (_other5Comment == null) { _other5Comment = nCV(); }
      return _other5Comment; }
    protected ConditionValue xgetCValueOther5Comment() { return xdfgetOther5Comment(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other5Comment_Asc() { regOBA("OTHER5_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_Other5Comment_Desc() { regOBD("OTHER5_COMMENT"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBClassDtlSubCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassDtlSubCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBClassDtlSubCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBClassDtlSubCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BClassDtlSubCQ bq = (BClassDtlSubCQ)bqs;
        BClassDtlSubCQ uq = (BClassDtlSubCQ)uqs;
        if (bq.hasConditionQueryBClassDtl()) {
            uq.queryBClassDtl().reflectRelationOnUnionQuery(bq.queryBClassDtl(), uq.queryBClassDtl());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CLASS_DTL_ID, named 'BClassDtl'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtl() {
        return xdfgetConditionQueryBClassDtl();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtl() {
        String prop = "bClassDtl";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtl()); xsetupOuterJoinBClassDtl(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtl() {
        String nrp = xresolveNRP("B_CLASS_DTL_SUB", "bClassDtl"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtl", nrp);
    }
    protected void xsetupOuterJoinBClassDtl() { xregOutJo("bClassDtl"); }
    public boolean hasConditionQueryBClassDtl() { return xhasQueRlMap("bClassDtl"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BClassDtlSubCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BClassDtlSubCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BClassDtlSubCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BClassDtlSubCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BClassDtlSubCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BClassDtlSubCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BClassDtlSubCQ> _myselfExistsMap;
    public Map<String, BClassDtlSubCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BClassDtlSubCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BClassDtlSubCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BClassDtlSubCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BClassDtlSubCB.class.getName(); }
    protected String xCQ() { return BClassDtlSubCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
