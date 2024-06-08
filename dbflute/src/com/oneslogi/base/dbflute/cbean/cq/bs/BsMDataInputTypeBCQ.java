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
 * The base condition-query of M_DATA_INPUT_TYPE_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsMDataInputTypeBCQ extends AbstractBsMDataInputTypeBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MDataInputTypeBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMDataInputTypeBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_DATA_INPUT_TYPE_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MDataInputTypeBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MDataInputTypeBCIQ xcreateCIQ() {
        MDataInputTypeBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MDataInputTypeBCIQ xnewCIQ() {
        return new MDataInputTypeBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_DATA_INPUT_TYPE_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MDataInputTypeBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MDataInputTypeBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dataInputTypeBId;
    public ConditionValue xdfgetDataInputTypeBId()
    { if (_dataInputTypeBId == null) { _dataInputTypeBId = nCV(); }
      return _dataInputTypeBId; }
    protected ConditionValue xgetCValueDataInputTypeBId() { return xdfgetDataInputTypeBId(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_DataInputTypeBId_Asc() { regOBA("DATA_INPUT_TYPE_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_DataInputTypeBId_Desc() { regOBD("DATA_INPUT_TYPE_B_ID"); return this; }

    protected ConditionValue _dataInputTypeId;
    public ConditionValue xdfgetDataInputTypeId()
    { if (_dataInputTypeId == null) { _dataInputTypeId = nCV(); }
      return _dataInputTypeId; }
    protected ConditionValue xgetCValueDataInputTypeId() { return xdfgetDataInputTypeId(); }

    public Map<String, MDataInputTypeCQ> getDataInputTypeId_InScopeRelation_MDataInputType() { return xgetSQueMap("dataInputTypeId_InScopeRelation_MDataInputType"); }
    public String keepDataInputTypeId_InScopeRelation_MDataInputType(MDataInputTypeCQ sq) { return xkeepSQue("dataInputTypeId_InScopeRelation_MDataInputType", sq); }

    public Map<String, MDataInputTypeCQ> getDataInputTypeId_NotInScopeRelation_MDataInputType() { return xgetSQueMap("dataInputTypeId_NotInScopeRelation_MDataInputType"); }
    public String keepDataInputTypeId_NotInScopeRelation_MDataInputType(MDataInputTypeCQ sq) { return xkeepSQue("dataInputTypeId_NotInScopeRelation_MDataInputType", sq); }

    /**
     * Add order-by as ascend. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_DataInputTypeId_Asc() { regOBA("DATA_INPUT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_DataInputTypeId_Desc() { regOBD("DATA_INPUT_TYPE_ID"); return this; }

    protected ConditionValue _colNo;
    public ConditionValue xdfgetColNo()
    { if (_colNo == null) { _colNo = nCV(); }
      return _colNo; }
    protected ConditionValue xgetCValueColNo() { return xdfgetColNo(); }

    /**
     * Add order-by as ascend. <br>
     * COL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_ColNo_Asc() { regOBA("COL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_ColNo_Desc() { regOBD("COL_NO"); return this; }

    protected ConditionValue _colNm;
    public ConditionValue xdfgetColNm()
    { if (_colNm == null) { _colNm = nCV(); }
      return _colNm; }
    protected ConditionValue xgetCValueColNm() { return xdfgetColNm(); }

    /**
     * Add order-by as ascend. <br>
     * COL_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_ColNm_Asc() { regOBA("COL_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_ColNm_Desc() { regOBD("COL_NM"); return this; }

    protected ConditionValue _uploadColumnNm;
    public ConditionValue xdfgetUploadColumnNm()
    { if (_uploadColumnNm == null) { _uploadColumnNm = nCV(); }
      return _uploadColumnNm; }
    protected ConditionValue xgetCValueUploadColumnNm() { return xdfgetUploadColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_UploadColumnNm_Asc() { regOBA("UPLOAD_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_UploadColumnNm_Desc() { regOBD("UPLOAD_COLUMN_NM"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMDataInputTypeBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMDataInputTypeBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMDataInputTypeBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MDataInputTypeBCQ bq = (MDataInputTypeBCQ)bqs;
        MDataInputTypeBCQ uq = (MDataInputTypeBCQ)uqs;
        if (bq.hasConditionQueryMDataInputType()) {
            uq.queryMDataInputType().reflectRelationOnUnionQuery(bq.queryMDataInputType(), uq.queryMDataInputType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_DATA_INPUT_TYPE by my DATA_INPUT_TYPE_ID, named 'MDataInputType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MDataInputTypeCQ queryMDataInputType() {
        return xdfgetConditionQueryMDataInputType();
    }
    public MDataInputTypeCQ xdfgetConditionQueryMDataInputType() {
        String prop = "mDataInputType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMDataInputType()); xsetupOuterJoinMDataInputType(); }
        return xgetQueRlMap(prop);
    }
    protected MDataInputTypeCQ xcreateQueryMDataInputType() {
        String nrp = xresolveNRP("M_DATA_INPUT_TYPE_B", "mDataInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MDataInputTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mDataInputType", nrp);
    }
    protected void xsetupOuterJoinMDataInputType() { xregOutJo("mDataInputType"); }
    public boolean hasConditionQueryMDataInputType() { return xhasQueRlMap("mDataInputType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MDataInputTypeBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MDataInputTypeBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MDataInputTypeBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MDataInputTypeBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MDataInputTypeBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MDataInputTypeBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MDataInputTypeBCQ> _myselfExistsMap;
    public Map<String, MDataInputTypeBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MDataInputTypeBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MDataInputTypeBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MDataInputTypeBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MDataInputTypeBCB.class.getName(); }
    protected String xCQ() { return MDataInputTypeBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
