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
 * The base condition-query of B_DML_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsBDmlLogCQ extends AbstractBsBDmlLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BDmlLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBDmlLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_DML_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BDmlLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BDmlLogCIQ xcreateCIQ() {
        BDmlLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BDmlLogCIQ xnewCIQ() {
        return new BDmlLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_DML_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BDmlLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BDmlLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dmlLogId;
    public ConditionValue xdfgetDmlLogId()
    { if (_dmlLogId == null) { _dmlLogId = nCV(); }
      return _dmlLogId; }
    protected ConditionValue xgetCValueDmlLogId() { return xdfgetDmlLogId(); }

    /**
     * Add order-by as ascend. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlLogId_Asc() { regOBA("DML_LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlLogId_Desc() { regOBD("DML_LOG_ID"); return this; }

    protected ConditionValue _dmlKbn;
    public ConditionValue xdfgetDmlKbn()
    { if (_dmlKbn == null) { _dmlKbn = nCV(); }
      return _dmlKbn; }
    protected ConditionValue xgetCValueDmlKbn() { return xdfgetDmlKbn(); }

    /**
     * Add order-by as ascend. <br>
     * DML_KBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlKbn_Asc() { regOBA("DML_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_KBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlKbn_Desc() { regOBD("DML_KBN"); return this; }

    protected ConditionValue _dmlTableNm;
    public ConditionValue xdfgetDmlTableNm()
    { if (_dmlTableNm == null) { _dmlTableNm = nCV(); }
      return _dmlTableNm; }
    protected ConditionValue xgetCValueDmlTableNm() { return xdfgetDmlTableNm(); }

    /**
     * Add order-by as ascend. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlTableNm_Asc() { regOBA("DML_TABLE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_TABLE_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlTableNm_Desc() { regOBD("DML_TABLE_NM"); return this; }

    protected ConditionValue _dmlColumnNm;
    public ConditionValue xdfgetDmlColumnNm()
    { if (_dmlColumnNm == null) { _dmlColumnNm = nCV(); }
      return _dmlColumnNm; }
    protected ConditionValue xgetCValueDmlColumnNm() { return xdfgetDmlColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlColumnNm_Asc() { regOBA("DML_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlColumnNm_Desc() { regOBD("DML_COLUMN_NM"); return this; }

    protected ConditionValue _dmlRowId;
    public ConditionValue xdfgetDmlRowId()
    { if (_dmlRowId == null) { _dmlRowId = nCV(); }
      return _dmlRowId; }
    protected ConditionValue xgetCValueDmlRowId() { return xdfgetDmlRowId(); }

    /**
     * Add order-by as ascend. <br>
     * DML_ROW_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlRowId_Asc() { regOBA("DML_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_ROW_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlRowId_Desc() { regOBD("DML_ROW_ID"); return this; }

    protected ConditionValue _dmlBeforeValue;
    public ConditionValue xdfgetDmlBeforeValue()
    { if (_dmlBeforeValue == null) { _dmlBeforeValue = nCV(); }
      return _dmlBeforeValue; }
    protected ConditionValue xgetCValueDmlBeforeValue() { return xdfgetDmlBeforeValue(); }

    /**
     * Add order-by as ascend. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlBeforeValue_Asc() { regOBA("DML_BEFORE_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_BEFORE_VALUE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlBeforeValue_Desc() { regOBD("DML_BEFORE_VALUE"); return this; }

    protected ConditionValue _dmlAfterValue;
    public ConditionValue xdfgetDmlAfterValue()
    { if (_dmlAfterValue == null) { _dmlAfterValue = nCV(); }
      return _dmlAfterValue; }
    protected ConditionValue xgetCValueDmlAfterValue() { return xdfgetDmlAfterValue(); }

    /**
     * Add order-by as ascend. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlAfterValue_Asc() { regOBA("DML_AFTER_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DML_AFTER_VALUE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DmlAfterValue_Desc() { regOBD("DML_AFTER_VALUE"); return this; }

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
    public BsBDmlLogCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBDmlLogCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBDmlLogCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBDmlLogCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBDmlLogCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBDmlLogCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBDmlLogCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBDmlLogCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBDmlLogCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBDmlLogCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBDmlLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBDmlLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, BDmlLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BDmlLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BDmlLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BDmlLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BDmlLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BDmlLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BDmlLogCQ> _myselfExistsMap;
    public Map<String, BDmlLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BDmlLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BDmlLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BDmlLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BDmlLogCB.class.getName(); }
    protected String xCQ() { return BDmlLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
