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
 * The base condition-query of M_SHAPE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BsMShapeGrpCQ extends AbstractBsMShapeGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MShapeGrpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMShapeGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_SHAPE_GRP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MShapeGrpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MShapeGrpCIQ xcreateCIQ() {
        MShapeGrpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MShapeGrpCIQ xnewCIQ() {
        return new MShapeGrpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_SHAPE_GRP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MShapeGrpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MShapeGrpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shapeGrpId;
    public ConditionValue xdfgetShapeGrpId()
    { if (_shapeGrpId == null) { _shapeGrpId = nCV(); }
      return _shapeGrpId; }
    protected ConditionValue xgetCValueShapeGrpId() { return xdfgetShapeGrpId(); }

    public Map<String, MClientCQ> xdfgetShapeGrpId_ExistsReferrer_MClientList() { return xgetSQueMap("shapeGrpId_ExistsReferrer_MClientList"); }
    public String keepShapeGrpId_ExistsReferrer_MClientList(MClientCQ sq) { return xkeepSQue("shapeGrpId_ExistsReferrer_MClientList", sq); }

    public Map<String, MProductCQ> xdfgetShapeGrpId_ExistsReferrer_MProductList() { return xgetSQueMap("shapeGrpId_ExistsReferrer_MProductList"); }
    public String keepShapeGrpId_ExistsReferrer_MProductList(MProductCQ sq) { return xkeepSQue("shapeGrpId_ExistsReferrer_MProductList", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeGrpId_ExistsReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeGrpId_ExistsReferrer_MShapeGrpDtlList"); }
    public String keepShapeGrpId_ExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeGrpId_ExistsReferrer_MShapeGrpDtlList", sq); }

    public Map<String, MClientCQ> xdfgetShapeGrpId_NotExistsReferrer_MClientList() { return xgetSQueMap("shapeGrpId_NotExistsReferrer_MClientList"); }
    public String keepShapeGrpId_NotExistsReferrer_MClientList(MClientCQ sq) { return xkeepSQue("shapeGrpId_NotExistsReferrer_MClientList", sq); }

    public Map<String, MProductCQ> xdfgetShapeGrpId_NotExistsReferrer_MProductList() { return xgetSQueMap("shapeGrpId_NotExistsReferrer_MProductList"); }
    public String keepShapeGrpId_NotExistsReferrer_MProductList(MProductCQ sq) { return xkeepSQue("shapeGrpId_NotExistsReferrer_MProductList", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeGrpId_NotExistsReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeGrpId_NotExistsReferrer_MShapeGrpDtlList"); }
    public String keepShapeGrpId_NotExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeGrpId_NotExistsReferrer_MShapeGrpDtlList", sq); }

    public Map<String, MClientCQ> xdfgetShapeGrpId_SpecifyDerivedReferrer_MClientList() { return xgetSQueMap("shapeGrpId_SpecifyDerivedReferrer_MClientList"); }
    public String keepShapeGrpId_SpecifyDerivedReferrer_MClientList(MClientCQ sq) { return xkeepSQue("shapeGrpId_SpecifyDerivedReferrer_MClientList", sq); }

    public Map<String, MProductCQ> xdfgetShapeGrpId_SpecifyDerivedReferrer_MProductList() { return xgetSQueMap("shapeGrpId_SpecifyDerivedReferrer_MProductList"); }
    public String keepShapeGrpId_SpecifyDerivedReferrer_MProductList(MProductCQ sq) { return xkeepSQue("shapeGrpId_SpecifyDerivedReferrer_MProductList", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList"); }
    public String keepShapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList", sq); }

    public Map<String, MClientCQ> xdfgetShapeGrpId_QueryDerivedReferrer_MClientList() { return xgetSQueMap("shapeGrpId_QueryDerivedReferrer_MClientList"); }
    public String keepShapeGrpId_QueryDerivedReferrer_MClientList(MClientCQ sq) { return xkeepSQue("shapeGrpId_QueryDerivedReferrer_MClientList", sq); }
    public Map<String, Object> xdfgetShapeGrpId_QueryDerivedReferrer_MClientListParameter() { return xgetSQuePmMap("shapeGrpId_QueryDerivedReferrer_MClientList"); }
    public String keepShapeGrpId_QueryDerivedReferrer_MClientListParameter(Object pm) { return xkeepSQuePm("shapeGrpId_QueryDerivedReferrer_MClientList", pm); }

    public Map<String, MProductCQ> xdfgetShapeGrpId_QueryDerivedReferrer_MProductList() { return xgetSQueMap("shapeGrpId_QueryDerivedReferrer_MProductList"); }
    public String keepShapeGrpId_QueryDerivedReferrer_MProductList(MProductCQ sq) { return xkeepSQue("shapeGrpId_QueryDerivedReferrer_MProductList", sq); }
    public Map<String, Object> xdfgetShapeGrpId_QueryDerivedReferrer_MProductListParameter() { return xgetSQuePmMap("shapeGrpId_QueryDerivedReferrer_MProductList"); }
    public String keepShapeGrpId_QueryDerivedReferrer_MProductListParameter(Object pm) { return xkeepSQuePm("shapeGrpId_QueryDerivedReferrer_MProductList", pm); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList"); }
    public String keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList", sq); }
    public Map<String, Object> xdfgetShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlListParameter() { return xgetSQuePmMap("shapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList"); }
    public String keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlListParameter(Object pm) { return xkeepSQuePm("shapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ShapeGrpId_Asc() { regOBA("SHAPE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ShapeGrpId_Desc() { regOBD("SHAPE_GRP_ID"); return this; }

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
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _shapeGrpCd;
    public ConditionValue xdfgetShapeGrpCd()
    { if (_shapeGrpCd == null) { _shapeGrpCd = nCV(); }
      return _shapeGrpCd; }
    protected ConditionValue xgetCValueShapeGrpCd() { return xdfgetShapeGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ShapeGrpCd_Asc() { regOBA("SHAPE_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ShapeGrpCd_Desc() { regOBD("SHAPE_GRP_CD"); return this; }

    protected ConditionValue _shapeGrpName;
    public ConditionValue xdfgetShapeGrpName()
    { if (_shapeGrpName == null) { _shapeGrpName = nCV(); }
      return _shapeGrpName; }
    protected ConditionValue xgetCValueShapeGrpName() { return xdfgetShapeGrpName(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ShapeGrpName_Asc() { regOBA("SHAPE_GRP_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ShapeGrpName_Desc() { regOBD("SHAPE_GRP_NAME"); return this; }

    protected ConditionValue _decimalExistFlg;
    public ConditionValue xdfgetDecimalExistFlg()
    { if (_decimalExistFlg == null) { _decimalExistFlg = nCV(); }
      return _decimalExistFlg; }
    protected ConditionValue xgetCValueDecimalExistFlg() { return xdfgetDecimalExistFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_DecimalExistFlg_Asc() { regOBA("DECIMAL_EXIST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_DecimalExistFlg_Desc() { regOBD("DECIMAL_EXIST_FLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMShapeGrpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMShapeGrpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMShapeGrpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MShapeGrpCQ bq = (MShapeGrpCQ)bqs;
        MShapeGrpCQ uq = (MShapeGrpCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryBClassDtlByDecimalExistFlg()) {
            uq.queryBClassDtlByDecimalExistFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDecimalExistFlg(), uq.queryBClassDtlByDecimalExistFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
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
        String nrp = xresolveNRP("M_SHAPE_GRP", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DECIMAL_EXIST_FLG, named 'BClassDtlByDecimalExistFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDecimalExistFlg() {
        return xdfgetConditionQueryBClassDtlByDecimalExistFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDecimalExistFlg() {
        String prop = "bClassDtlByDecimalExistFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDecimalExistFlg()); xsetupOuterJoinBClassDtlByDecimalExistFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDecimalExistFlg() {
        String nrp = xresolveNRP("M_SHAPE_GRP", "bClassDtlByDecimalExistFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDecimalExistFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDecimalExistFlg() { xregOutJo("bClassDtlByDecimalExistFlg"); }
    public boolean hasConditionQueryBClassDtlByDecimalExistFlg() { return xhasQueRlMap("bClassDtlByDecimalExistFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_SHAPE_GRP", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MShapeGrpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MShapeGrpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MShapeGrpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MShapeGrpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MShapeGrpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MShapeGrpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MShapeGrpCQ> _myselfExistsMap;
    public Map<String, MShapeGrpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MShapeGrpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MShapeGrpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MShapeGrpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MShapeGrpCB.class.getName(); }
    protected String xCQ() { return MShapeGrpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
