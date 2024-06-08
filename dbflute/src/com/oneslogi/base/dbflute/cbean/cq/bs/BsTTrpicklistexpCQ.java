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
 * The base condition-query of T_TRPICKLISTEXP.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpicklistexpCQ extends AbstractBsTTrpicklistexpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpicklistexpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpicklistexpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPICKLISTEXP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpicklistexpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpicklistexpCIQ xcreateCIQ() {
        TTrpicklistexpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpicklistexpCIQ xnewCIQ() {
        return new TTrpicklistexpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPICKLISTEXP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpicklistexpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpicklistexpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tTrpicklistexpId;
    public ConditionValue xdfgetTTrpicklistexpId()
    { if (_tTrpicklistexpId == null) { _tTrpicklistexpId = nCV(); }
      return _tTrpicklistexpId; }
    protected ConditionValue xgetCValueTTrpicklistexpId() { return xdfgetTTrpicklistexpId(); }

    /**
     * Add order-by as ascend. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_TTrpicklistexpId_Asc() { regOBA("T_TRPICKLISTEXP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_TTrpicklistexpId_Desc() { regOBD("T_TRPICKLISTEXP_ID"); return this; }

    protected ConditionValue _tTrpicklistId;
    public ConditionValue xdfgetTTrpicklistId()
    { if (_tTrpicklistId == null) { _tTrpicklistId = nCV(); }
      return _tTrpicklistId; }
    protected ConditionValue xgetCValueTTrpicklistId() { return xdfgetTTrpicklistId(); }

    public Map<String, TTrPicklistCQ> getTTrpicklistId_InScopeRelation_TTrPicklist() { return xgetSQueMap("tTrpicklistId_InScopeRelation_TTrPicklist"); }
    public String keepTTrpicklistId_InScopeRelation_TTrPicklist(TTrPicklistCQ sq) { return xkeepSQue("tTrpicklistId_InScopeRelation_TTrPicklist", sq); }

    public Map<String, TTrPicklistCQ> getTTrpicklistId_NotInScopeRelation_TTrPicklist() { return xgetSQueMap("tTrpicklistId_NotInScopeRelation_TTrPicklist"); }
    public String keepTTrpicklistId_NotInScopeRelation_TTrPicklist(TTrPicklistCQ sq) { return xkeepSQue("tTrpicklistId_NotInScopeRelation_TTrPicklist", sq); }

    /**
     * Add order-by as ascend. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_TTrpicklistId_Asc() { regOBA("T_TRPICKLIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_TTrpicklistId_Desc() { regOBD("T_TRPICKLIST_ID"); return this; }

    protected ConditionValue _picklistKey;
    public ConditionValue xdfgetPicklistKey()
    { if (_picklistKey == null) { _picklistKey = nCV(); }
      return _picklistKey; }
    protected ConditionValue xgetCValuePicklistKey() { return xdfgetPicklistKey(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_PicklistKey_Asc() { regOBA("PICKLIST_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_PicklistKey_Desc() { regOBD("PICKLIST_KEY"); return this; }

    protected ConditionValue _picklistGNo;
    public ConditionValue xdfgetPicklistGNo()
    { if (_picklistGNo == null) { _picklistGNo = nCV(); }
      return _picklistGNo; }
    protected ConditionValue xgetCValuePicklistGNo() { return xdfgetPicklistGNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_PicklistGNo_Asc() { regOBA("PICKLIST_G_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_PicklistGNo_Desc() { regOBD("PICKLIST_G_NO"); return this; }

    protected ConditionValue _caseCd;
    public ConditionValue xdfgetCaseCd()
    { if (_caseCd == null) { _caseCd = nCV(); }
      return _caseCd; }
    protected ConditionValue xgetCValueCaseCd() { return xdfgetCaseCd(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_CaseCd_Asc() { regOBA("CASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_CD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_CaseCd_Desc() { regOBD("CASE_CD"); return this; }

    protected ConditionValue _dummyCaseKbn;
    public ConditionValue xdfgetDummyCaseKbn()
    { if (_dummyCaseKbn == null) { _dummyCaseKbn = nCV(); }
      return _dummyCaseKbn; }
    protected ConditionValue xgetCValueDummyCaseKbn() { return xdfgetDummyCaseKbn(); }

    /**
     * Add order-by as ascend. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_DummyCaseKbn_Asc() { regOBA("DUMMY_CASE_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DUMMY_CASE_KBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_DummyCaseKbn_Desc() { regOBD("DUMMY_CASE_KBN"); return this; }

    protected ConditionValue _readSdKbn;
    public ConditionValue xdfgetReadSdKbn()
    { if (_readSdKbn == null) { _readSdKbn = nCV(); }
      return _readSdKbn; }
    protected ConditionValue xgetCValueReadSdKbn() { return xdfgetReadSdKbn(); }

    /**
     * Add order-by as ascend. <br>
     * READ_SD_KBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_ReadSdKbn_Asc() { regOBA("READ_SD_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * READ_SD_KBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_ReadSdKbn_Desc() { regOBD("READ_SD_KBN"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrpicklistexpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpicklistexpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrpicklistexpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrpicklistexpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrpicklistexpCQ bq = (TTrpicklistexpCQ)bqs;
        TTrpicklistexpCQ uq = (TTrpicklistexpCQ)uqs;
        if (bq.hasConditionQueryTTrPicklist()) {
            uq.queryTTrPicklist().reflectRelationOnUnionQuery(bq.queryTTrPicklist(), uq.queryTTrPicklist());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrPicklistCQ queryTTrPicklist() {
        return xdfgetConditionQueryTTrPicklist();
    }
    public TTrPicklistCQ xdfgetConditionQueryTTrPicklist() {
        String prop = "tTrPicklist";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrPicklist()); xsetupOuterJoinTTrPicklist(); }
        return xgetQueRlMap(prop);
    }
    protected TTrPicklistCQ xcreateQueryTTrPicklist() {
        String nrp = xresolveNRP("T_TRPICKLISTEXP", "tTrPicklist"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrPicklistCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrPicklist", nrp);
    }
    protected void xsetupOuterJoinTTrPicklist() { xregOutJo("tTrPicklist"); }
    public boolean hasConditionQueryTTrPicklist() { return xhasQueRlMap("tTrPicklist"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrpicklistexpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpicklistexpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpicklistexpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpicklistexpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpicklistexpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpicklistexpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpicklistexpCQ> _myselfExistsMap;
    public Map<String, TTrpicklistexpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpicklistexpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpicklistexpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpicklistexpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpicklistexpCB.class.getName(); }
    protected String xCQ() { return TTrpicklistexpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
