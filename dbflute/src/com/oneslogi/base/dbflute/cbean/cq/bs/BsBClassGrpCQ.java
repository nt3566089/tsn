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
 * The base condition-query of B_CLASS_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BsBClassGrpCQ extends AbstractBsBClassGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BClassGrpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBClassGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_CLASS_GRP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BClassGrpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BClassGrpCIQ xcreateCIQ() {
        BClassGrpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BClassGrpCIQ xnewCIQ() {
        return new BClassGrpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_CLASS_GRP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BClassGrpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BClassGrpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _classGrpId;
    public ConditionValue xdfgetClassGrpId()
    { if (_classGrpId == null) { _classGrpId = nCV(); }
      return _classGrpId; }
    protected ConditionValue xgetCValueClassGrpId() { return xdfgetClassGrpId(); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassGrpId_ExistsReferrer_BClassGrpDtlList() { return xgetSQueMap("classGrpId_ExistsReferrer_BClassGrpDtlList"); }
    public String keepClassGrpId_ExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classGrpId_ExistsReferrer_BClassGrpDtlList", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassGrpId_NotExistsReferrer_BClassGrpDtlList() { return xgetSQueMap("classGrpId_NotExistsReferrer_BClassGrpDtlList"); }
    public String keepClassGrpId_NotExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classGrpId_NotExistsReferrer_BClassGrpDtlList", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassGrpId_SpecifyDerivedReferrer_BClassGrpDtlList() { return xgetSQueMap("classGrpId_SpecifyDerivedReferrer_BClassGrpDtlList"); }
    public String keepClassGrpId_SpecifyDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classGrpId_SpecifyDerivedReferrer_BClassGrpDtlList", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassGrpId_QueryDerivedReferrer_BClassGrpDtlList() { return xgetSQueMap("classGrpId_QueryDerivedReferrer_BClassGrpDtlList"); }
    public String keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classGrpId_QueryDerivedReferrer_BClassGrpDtlList", sq); }
    public Map<String, Object> xdfgetClassGrpId_QueryDerivedReferrer_BClassGrpDtlListParameter() { return xgetSQuePmMap("classGrpId_QueryDerivedReferrer_BClassGrpDtlList"); }
    public String keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlListParameter(Object pm) { return xkeepSQuePm("classGrpId_QueryDerivedReferrer_BClassGrpDtlList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassGrpId_Asc() { regOBA("CLASS_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassGrpId_Desc() { regOBD("CLASS_GRP_ID"); return this; }

    protected ConditionValue _classGrpCd;
    public ConditionValue xdfgetClassGrpCd()
    { if (_classGrpCd == null) { _classGrpCd = nCV(); }
      return _classGrpCd; }
    protected ConditionValue xgetCValueClassGrpCd() { return xdfgetClassGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassGrpCd_Asc() { regOBA("CLASS_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassGrpCd_Desc() { regOBD("CLASS_GRP_CD"); return this; }

    protected ConditionValue _classGrpComment;
    public ConditionValue xdfgetClassGrpComment()
    { if (_classGrpComment == null) { _classGrpComment = nCV(); }
      return _classGrpComment; }
    protected ConditionValue xgetCValueClassGrpComment() { return xdfgetClassGrpComment(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassGrpComment_Asc() { regOBA("CLASS_GRP_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassGrpComment_Desc() { regOBD("CLASS_GRP_COMMENT"); return this; }

    protected ConditionValue _classId;
    public ConditionValue xdfgetClassId()
    { if (_classId == null) { _classId = nCV(); }
      return _classId; }
    protected ConditionValue xgetCValueClassId() { return xdfgetClassId(); }

    public Map<String, BClassCQ> getClassId_InScopeRelation_BClass() { return xgetSQueMap("classId_InScopeRelation_BClass"); }
    public String keepClassId_InScopeRelation_BClass(BClassCQ sq) { return xkeepSQue("classId_InScopeRelation_BClass", sq); }

    public Map<String, BClassCQ> getClassId_NotInScopeRelation_BClass() { return xgetSQueMap("classId_NotInScopeRelation_BClass"); }
    public String keepClassId_NotInScopeRelation_BClass(BClassCQ sq) { return xkeepSQue("classId_NotInScopeRelation_BClass", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassId_Asc() { regOBA("CLASS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ClassId_Desc() { regOBD("CLASS_ID"); return this; }

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
    public BsBClassGrpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBClassGrpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBClassGrpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBClassGrpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBClassGrpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBClassGrpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBClassGrpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBClassGrpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBClassGrpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassGrpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBClassGrpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBClassGrpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BClassGrpCQ bq = (BClassGrpCQ)bqs;
        BClassGrpCQ uq = (BClassGrpCQ)uqs;
        if (bq.hasConditionQueryBClass()) {
            uq.queryBClass().reflectRelationOnUnionQuery(bq.queryBClass(), uq.queryBClass());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassCQ queryBClass() {
        return xdfgetConditionQueryBClass();
    }
    public BClassCQ xdfgetConditionQueryBClass() {
        String prop = "bClass";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClass()); xsetupOuterJoinBClass(); }
        return xgetQueRlMap(prop);
    }
    protected BClassCQ xcreateQueryBClass() {
        String nrp = xresolveNRP("B_CLASS_GRP", "bClass"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClass", nrp);
    }
    protected void xsetupOuterJoinBClass() { xregOutJo("bClass"); }
    public boolean hasConditionQueryBClass() { return xhasQueRlMap("bClass"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BClassGrpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BClassGrpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BClassGrpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BClassGrpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BClassGrpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BClassGrpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BClassGrpCQ> _myselfExistsMap;
    public Map<String, BClassGrpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BClassGrpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BClassGrpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BClassGrpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BClassGrpCB.class.getName(); }
    protected String xCQ() { return BClassGrpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
