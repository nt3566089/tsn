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
 * The base condition-query of M_MFPICKCTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsMMfpickctlCQ extends AbstractBsMMfpickctlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MMfpickctlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMMfpickctlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_MFPICKCTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MMfpickctlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MMfpickctlCIQ xcreateCIQ() {
        MMfpickctlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MMfpickctlCIQ xnewCIQ() {
        return new MMfpickctlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_MFPICKCTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MMfpickctlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MMfpickctlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _mfpickctlId;
    public ConditionValue xdfgetMfpickctlId()
    { if (_mfpickctlId == null) { _mfpickctlId = nCV(); }
      return _mfpickctlId; }
    protected ConditionValue xgetCValueMfpickctlId() { return xdfgetMfpickctlId(); }

    /**
     * Add order-by as ascend. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_MfpickctlId_Asc() { regOBA("MFPICKCTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_MfpickctlId_Desc() { regOBD("MFPICKCTL_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _pickfrdate;
    public ConditionValue xdfgetPickfrdate()
    { if (_pickfrdate == null) { _pickfrdate = nCV(); }
      return _pickfrdate; }
    protected ConditionValue xgetCValuePickfrdate() { return xdfgetPickfrdate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickfrdate_Asc() { regOBA("PICKFRDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickfrdate_Desc() { regOBD("PICKFRDATE"); return this; }

    protected ConditionValue _picktodate;
    public ConditionValue xdfgetPicktodate()
    { if (_picktodate == null) { _picktodate = nCV(); }
      return _picktodate; }
    protected ConditionValue xgetCValuePicktodate() { return xdfgetPicktodate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Picktodate_Asc() { regOBA("PICKTODATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Picktodate_Desc() { regOBD("PICKTODATE"); return this; }

    protected ConditionValue _pickrank1;
    public ConditionValue xdfgetPickrank1()
    { if (_pickrank1 == null) { _pickrank1 = nCV(); }
      return _pickrank1; }
    protected ConditionValue xgetCValuePickrank1() { return xdfgetPickrank1(); }

    /**
     * Add order-by as ascend. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank1_Asc() { regOBA("PICKRANK1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank1_Desc() { regOBD("PICKRANK1"); return this; }

    protected ConditionValue _pickrank2;
    public ConditionValue xdfgetPickrank2()
    { if (_pickrank2 == null) { _pickrank2 = nCV(); }
      return _pickrank2; }
    protected ConditionValue xgetCValuePickrank2() { return xdfgetPickrank2(); }

    /**
     * Add order-by as ascend. <br>
     * PICKRANK2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank2_Asc() { regOBA("PICKRANK2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKRANK2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank2_Desc() { regOBD("PICKRANK2"); return this; }

    protected ConditionValue _pickrank3;
    public ConditionValue xdfgetPickrank3()
    { if (_pickrank3 == null) { _pickrank3 = nCV(); }
      return _pickrank3; }
    protected ConditionValue xgetCValuePickrank3() { return xdfgetPickrank3(); }

    /**
     * Add order-by as ascend. <br>
     * PICKRANK3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank3_Asc() { regOBA("PICKRANK3"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKRANK3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank3_Desc() { regOBD("PICKRANK3"); return this; }

    protected ConditionValue _pickrank4;
    public ConditionValue xdfgetPickrank4()
    { if (_pickrank4 == null) { _pickrank4 = nCV(); }
      return _pickrank4; }
    protected ConditionValue xgetCValuePickrank4() { return xdfgetPickrank4(); }

    /**
     * Add order-by as ascend. <br>
     * PICKRANK4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank4_Asc() { regOBA("PICKRANK4"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKRANK4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank4_Desc() { regOBD("PICKRANK4"); return this; }

    protected ConditionValue _pickrank5;
    public ConditionValue xdfgetPickrank5()
    { if (_pickrank5 == null) { _pickrank5 = nCV(); }
      return _pickrank5; }
    protected ConditionValue xgetCValuePickrank5() { return xdfgetPickrank5(); }

    /**
     * Add order-by as ascend. <br>
     * PICKRANK5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank5_Asc() { regOBA("PICKRANK5"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKRANK5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Pickrank5_Desc() { regOBD("PICKRANK5"); return this; }

    protected ConditionValue _validtype;
    public ConditionValue xdfgetValidtype()
    { if (_validtype == null) { _validtype = nCV(); }
      return _validtype; }
    protected ConditionValue xgetCValueValidtype() { return xdfgetValidtype(); }

    /**
     * Add order-by as ascend. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Validtype_Asc() { regOBA("VALIDTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_Validtype_Desc() { regOBD("VALIDTYPE"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMMfpickctlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMMfpickctlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMMfpickctlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMMfpickctlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MMfpickctlCQ bq = (MMfpickctlCQ)bqs;
        MMfpickctlCQ uq = (MMfpickctlCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("M_MFPICKCTL", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MMfpickctlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MMfpickctlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MMfpickctlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MMfpickctlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MMfpickctlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MMfpickctlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MMfpickctlCQ> _myselfExistsMap;
    public Map<String, MMfpickctlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MMfpickctlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MMfpickctlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MMfpickctlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MMfpickctlCB.class.getName(); }
    protected String xCQ() { return MMfpickctlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
