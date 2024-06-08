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
 * The base condition-query of M_EDI_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
public class BsMEdiColumnCQ extends AbstractBsMEdiColumnCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MEdiColumnCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMEdiColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_EDI_COLUMN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MEdiColumnCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MEdiColumnCIQ xcreateCIQ() {
        MEdiColumnCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MEdiColumnCIQ xnewCIQ() {
        return new MEdiColumnCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_EDI_COLUMN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MEdiColumnCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MEdiColumnCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ediColumnId;
    public ConditionValue xdfgetEdiColumnId()
    { if (_ediColumnId == null) { _ediColumnId = nCV(); }
      return _ediColumnId; }
    protected ConditionValue xgetCValueEdiColumnId() { return xdfgetEdiColumnId(); }

    public Map<String, MImportTypeBCQ> xdfgetEdiColumnId_ExistsReferrer_MImportTypeBList() { return xgetSQueMap("ediColumnId_ExistsReferrer_MImportTypeBList"); }
    public String keepEdiColumnId_ExistsReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("ediColumnId_ExistsReferrer_MImportTypeBList", sq); }

    public Map<String, MImportTypeBCQ> xdfgetEdiColumnId_NotExistsReferrer_MImportTypeBList() { return xgetSQueMap("ediColumnId_NotExistsReferrer_MImportTypeBList"); }
    public String keepEdiColumnId_NotExistsReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("ediColumnId_NotExistsReferrer_MImportTypeBList", sq); }

    public Map<String, MImportTypeBCQ> xdfgetEdiColumnId_SpecifyDerivedReferrer_MImportTypeBList() { return xgetSQueMap("ediColumnId_SpecifyDerivedReferrer_MImportTypeBList"); }
    public String keepEdiColumnId_SpecifyDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("ediColumnId_SpecifyDerivedReferrer_MImportTypeBList", sq); }

    public Map<String, MImportTypeBCQ> xdfgetEdiColumnId_QueryDerivedReferrer_MImportTypeBList() { return xgetSQueMap("ediColumnId_QueryDerivedReferrer_MImportTypeBList"); }
    public String keepEdiColumnId_QueryDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("ediColumnId_QueryDerivedReferrer_MImportTypeBList", sq); }
    public Map<String, Object> xdfgetEdiColumnId_QueryDerivedReferrer_MImportTypeBListParameter() { return xgetSQuePmMap("ediColumnId_QueryDerivedReferrer_MImportTypeBList"); }
    public String keepEdiColumnId_QueryDerivedReferrer_MImportTypeBListParameter(Object pm) { return xkeepSQuePm("ediColumnId_QueryDerivedReferrer_MImportTypeBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_EdiColumnId_Asc() { regOBA("EDI_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_EdiColumnId_Desc() { regOBD("EDI_COLUMN_ID"); return this; }

    protected ConditionValue _ediId;
    public ConditionValue xdfgetEdiId()
    { if (_ediId == null) { _ediId = nCV(); }
      return _ediId; }
    protected ConditionValue xgetCValueEdiId() { return xdfgetEdiId(); }

    public Map<String, MEdiCQ> getEdiId_InScopeRelation_MEdi() { return xgetSQueMap("ediId_InScopeRelation_MEdi"); }
    public String keepEdiId_InScopeRelation_MEdi(MEdiCQ sq) { return xkeepSQue("ediId_InScopeRelation_MEdi", sq); }

    public Map<String, MEdiCQ> getEdiId_NotInScopeRelation_MEdi() { return xgetSQueMap("ediId_NotInScopeRelation_MEdi"); }
    public String keepEdiId_NotInScopeRelation_MEdi(MEdiCQ sq) { return xkeepSQue("ediId_NotInScopeRelation_MEdi", sq); }

    /**
     * Add order-by as ascend. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_EdiId_Asc() { regOBA("EDI_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_EdiId_Desc() { regOBD("EDI_ID"); return this; }

    protected ConditionValue _ediColumnNm;
    public ConditionValue xdfgetEdiColumnNm()
    { if (_ediColumnNm == null) { _ediColumnNm = nCV(); }
      return _ediColumnNm; }
    protected ConditionValue xgetCValueEdiColumnNm() { return xdfgetEdiColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_EdiColumnNm_Asc() { regOBA("EDI_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_EdiColumnNm_Desc() { regOBD("EDI_COLUMN_NM"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMEdiColumnCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMEdiColumnCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMEdiColumnCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMEdiColumnCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MEdiColumnCQ bq = (MEdiColumnCQ)bqs;
        MEdiColumnCQ uq = (MEdiColumnCQ)uqs;
        if (bq.hasConditionQueryMEdi()) {
            uq.queryMEdi().reflectRelationOnUnionQuery(bq.queryMEdi(), uq.queryMEdi());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @return The instance of condition-query. (NotNull)
     */
    public MEdiCQ queryMEdi() {
        return xdfgetConditionQueryMEdi();
    }
    public MEdiCQ xdfgetConditionQueryMEdi() {
        String prop = "mEdi";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMEdi()); xsetupOuterJoinMEdi(); }
        return xgetQueRlMap(prop);
    }
    protected MEdiCQ xcreateQueryMEdi() {
        String nrp = xresolveNRP("M_EDI_COLUMN", "mEdi"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MEdiCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mEdi", nrp);
    }
    protected void xsetupOuterJoinMEdi() { xregOutJo("mEdi"); }
    public boolean hasConditionQueryMEdi() { return xhasQueRlMap("mEdi"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MEdiColumnCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MEdiColumnCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MEdiColumnCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MEdiColumnCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MEdiColumnCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MEdiColumnCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MEdiColumnCQ> _myselfExistsMap;
    public Map<String, MEdiColumnCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MEdiColumnCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MEdiColumnCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MEdiColumnCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MEdiColumnCB.class.getName(); }
    protected String xCQ() { return MEdiColumnCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
