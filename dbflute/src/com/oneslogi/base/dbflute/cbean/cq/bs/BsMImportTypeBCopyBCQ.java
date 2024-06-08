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
 * The base condition-query of M_IMPORT_TYPE_B_COPY_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsMImportTypeBCopyBCQ extends AbstractBsMImportTypeBCopyBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MImportTypeBCopyBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMImportTypeBCopyBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_IMPORT_TYPE_B_COPY_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MImportTypeBCopyBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MImportTypeBCopyBCIQ xcreateCIQ() {
        MImportTypeBCopyBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MImportTypeBCopyBCIQ xnewCIQ() {
        return new MImportTypeBCopyBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_IMPORT_TYPE_B_COPY_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MImportTypeBCopyBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MImportTypeBCopyBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _importTypeBCopyBId;
    public ConditionValue xdfgetImportTypeBCopyBId()
    { if (_importTypeBCopyBId == null) { _importTypeBCopyBId = nCV(); }
      return _importTypeBCopyBId; }
    protected ConditionValue xgetCValueImportTypeBCopyBId() { return xdfgetImportTypeBCopyBId(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_ImportTypeBCopyBId_Asc() { regOBA("IMPORT_TYPE_B_COPY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_ImportTypeBCopyBId_Desc() { regOBD("IMPORT_TYPE_B_COPY_B_ID"); return this; }

    protected ConditionValue _importTypeBId;
    public ConditionValue xdfgetImportTypeBId()
    { if (_importTypeBId == null) { _importTypeBId = nCV(); }
      return _importTypeBId; }
    protected ConditionValue xgetCValueImportTypeBId() { return xdfgetImportTypeBId(); }

    public Map<String, MImportTypeBCQ> getImportTypeBId_InScopeRelation_MImportTypeB() { return xgetSQueMap("importTypeBId_InScopeRelation_MImportTypeB"); }
    public String keepImportTypeBId_InScopeRelation_MImportTypeB(MImportTypeBCQ sq) { return xkeepSQue("importTypeBId_InScopeRelation_MImportTypeB", sq); }

    public Map<String, MImportTypeBCQ> getImportTypeBId_NotInScopeRelation_MImportTypeB() { return xgetSQueMap("importTypeBId_NotInScopeRelation_MImportTypeB"); }
    public String keepImportTypeBId_NotInScopeRelation_MImportTypeB(MImportTypeBCQ sq) { return xkeepSQue("importTypeBId_NotInScopeRelation_MImportTypeB", sq); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_ImportTypeBId_Asc() { regOBA("IMPORT_TYPE_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_ImportTypeBId_Desc() { regOBD("IMPORT_TYPE_B_ID"); return this; }

    protected ConditionValue _copyBColumnNm;
    public ConditionValue xdfgetCopyBColumnNm()
    { if (_copyBColumnNm == null) { _copyBColumnNm = nCV(); }
      return _copyBColumnNm; }
    protected ConditionValue xgetCValueCopyBColumnNm() { return xdfgetCopyBColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_CopyBColumnNm_Asc() { regOBA("COPY_B_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_CopyBColumnNm_Desc() { regOBD("COPY_B_COLUMN_NM"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMImportTypeBCopyBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCopyBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMImportTypeBCopyBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMImportTypeBCopyBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MImportTypeBCopyBCQ bq = (MImportTypeBCopyBCQ)bqs;
        MImportTypeBCopyBCQ uq = (MImportTypeBCopyBCQ)uqs;
        if (bq.hasConditionQueryMImportTypeB()) {
            uq.queryMImportTypeB().reflectRelationOnUnionQuery(bq.queryMImportTypeB(), uq.queryMImportTypeB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_IMPORT_TYPE_B by my IMPORT_TYPE_B_ID, named 'MImportTypeB'.
     * @return The instance of condition-query. (NotNull)
     */
    public MImportTypeBCQ queryMImportTypeB() {
        return xdfgetConditionQueryMImportTypeB();
    }
    public MImportTypeBCQ xdfgetConditionQueryMImportTypeB() {
        String prop = "mImportTypeB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMImportTypeB()); xsetupOuterJoinMImportTypeB(); }
        return xgetQueRlMap(prop);
    }
    protected MImportTypeBCQ xcreateQueryMImportTypeB() {
        String nrp = xresolveNRP("M_IMPORT_TYPE_B_COPY_B", "mImportTypeB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MImportTypeBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mImportTypeB", nrp);
    }
    protected void xsetupOuterJoinMImportTypeB() { xregOutJo("mImportTypeB"); }
    public boolean hasConditionQueryMImportTypeB() { return xhasQueRlMap("mImportTypeB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MImportTypeBCopyBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MImportTypeBCopyBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MImportTypeBCopyBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MImportTypeBCopyBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MImportTypeBCopyBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MImportTypeBCopyBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MImportTypeBCopyBCQ> _myselfExistsMap;
    public Map<String, MImportTypeBCopyBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MImportTypeBCopyBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MImportTypeBCopyBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MImportTypeBCopyBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MImportTypeBCopyBCB.class.getName(); }
    protected String xCQ() { return MImportTypeBCopyBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
