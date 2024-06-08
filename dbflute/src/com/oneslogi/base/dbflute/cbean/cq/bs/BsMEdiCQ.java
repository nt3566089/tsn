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
 * The base condition-query of M_EDI.
 * @author DBFlute(AutoGenerator)
 */
public class BsMEdiCQ extends AbstractBsMEdiCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MEdiCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMEdiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_EDI) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MEdiCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MEdiCIQ xcreateCIQ() {
        MEdiCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MEdiCIQ xnewCIQ() {
        return new MEdiCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_EDI on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MEdiCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MEdiCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ediId;
    public ConditionValue xdfgetEdiId()
    { if (_ediId == null) { _ediId = nCV(); }
      return _ediId; }
    protected ConditionValue xgetCValueEdiId() { return xdfgetEdiId(); }

    public Map<String, MEdiColumnCQ> xdfgetEdiId_ExistsReferrer_MEdiColumnList() { return xgetSQueMap("ediId_ExistsReferrer_MEdiColumnList"); }
    public String keepEdiId_ExistsReferrer_MEdiColumnList(MEdiColumnCQ sq) { return xkeepSQue("ediId_ExistsReferrer_MEdiColumnList", sq); }

    public Map<String, MImportTypeCQ> xdfgetEdiId_ExistsReferrer_MImportTypeList() { return xgetSQueMap("ediId_ExistsReferrer_MImportTypeList"); }
    public String keepEdiId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("ediId_ExistsReferrer_MImportTypeList", sq); }

    public Map<String, MEdiColumnCQ> xdfgetEdiId_NotExistsReferrer_MEdiColumnList() { return xgetSQueMap("ediId_NotExistsReferrer_MEdiColumnList"); }
    public String keepEdiId_NotExistsReferrer_MEdiColumnList(MEdiColumnCQ sq) { return xkeepSQue("ediId_NotExistsReferrer_MEdiColumnList", sq); }

    public Map<String, MImportTypeCQ> xdfgetEdiId_NotExistsReferrer_MImportTypeList() { return xgetSQueMap("ediId_NotExistsReferrer_MImportTypeList"); }
    public String keepEdiId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("ediId_NotExistsReferrer_MImportTypeList", sq); }

    public Map<String, MEdiColumnCQ> xdfgetEdiId_SpecifyDerivedReferrer_MEdiColumnList() { return xgetSQueMap("ediId_SpecifyDerivedReferrer_MEdiColumnList"); }
    public String keepEdiId_SpecifyDerivedReferrer_MEdiColumnList(MEdiColumnCQ sq) { return xkeepSQue("ediId_SpecifyDerivedReferrer_MEdiColumnList", sq); }

    public Map<String, MImportTypeCQ> xdfgetEdiId_SpecifyDerivedReferrer_MImportTypeList() { return xgetSQueMap("ediId_SpecifyDerivedReferrer_MImportTypeList"); }
    public String keepEdiId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("ediId_SpecifyDerivedReferrer_MImportTypeList", sq); }

    public Map<String, MEdiColumnCQ> xdfgetEdiId_QueryDerivedReferrer_MEdiColumnList() { return xgetSQueMap("ediId_QueryDerivedReferrer_MEdiColumnList"); }
    public String keepEdiId_QueryDerivedReferrer_MEdiColumnList(MEdiColumnCQ sq) { return xkeepSQue("ediId_QueryDerivedReferrer_MEdiColumnList", sq); }
    public Map<String, Object> xdfgetEdiId_QueryDerivedReferrer_MEdiColumnListParameter() { return xgetSQuePmMap("ediId_QueryDerivedReferrer_MEdiColumnList"); }
    public String keepEdiId_QueryDerivedReferrer_MEdiColumnListParameter(Object pm) { return xkeepSQuePm("ediId_QueryDerivedReferrer_MEdiColumnList", pm); }

    public Map<String, MImportTypeCQ> xdfgetEdiId_QueryDerivedReferrer_MImportTypeList() { return xgetSQueMap("ediId_QueryDerivedReferrer_MImportTypeList"); }
    public String keepEdiId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("ediId_QueryDerivedReferrer_MImportTypeList", sq); }
    public Map<String, Object> xdfgetEdiId_QueryDerivedReferrer_MImportTypeListParameter() { return xgetSQuePmMap("ediId_QueryDerivedReferrer_MImportTypeList"); }
    public String keepEdiId_QueryDerivedReferrer_MImportTypeListParameter(Object pm) { return xkeepSQuePm("ediId_QueryDerivedReferrer_MImportTypeList", pm); }

    /**
     * Add order-by as ascend. <br>
     * EDI_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_EdiId_Asc() { regOBA("EDI_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_EdiId_Desc() { regOBD("EDI_ID"); return this; }

    protected ConditionValue _ediNm;
    public ConditionValue xdfgetEdiNm()
    { if (_ediNm == null) { _ediNm = nCV(); }
      return _ediNm; }
    protected ConditionValue xgetCValueEdiNm() { return xdfgetEdiNm(); }

    /**
     * Add order-by as ascend. <br>
     * EDI_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_EdiNm_Asc() { regOBA("EDI_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_EdiNm_Desc() { regOBD("EDI_NM"); return this; }

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
    public BsMEdiCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMEdiCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMEdiCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMEdiCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMEdiCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMEdiCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMEdiCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMEdiCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMEdiCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMEdiCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMEdiCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMEdiCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MEdiCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MEdiCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MEdiCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MEdiCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MEdiCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MEdiCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MEdiCQ> _myselfExistsMap;
    public Map<String, MEdiCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MEdiCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MEdiCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MEdiCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MEdiCB.class.getName(); }
    protected String xCQ() { return MEdiCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
