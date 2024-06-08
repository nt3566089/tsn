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
 * The base condition-query of M_SHAPE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsMShapeGrpDtlCQ extends AbstractBsMShapeGrpDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MShapeGrpDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMShapeGrpDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_SHAPE_GRP_DTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MShapeGrpDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MShapeGrpDtlCIQ xcreateCIQ() {
        MShapeGrpDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MShapeGrpDtlCIQ xnewCIQ() {
        return new MShapeGrpDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_SHAPE_GRP_DTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MShapeGrpDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MShapeGrpDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shapeGrpDtlId;
    public ConditionValue xdfgetShapeGrpDtlId()
    { if (_shapeGrpDtlId == null) { _shapeGrpDtlId = nCV(); }
      return _shapeGrpDtlId; }
    protected ConditionValue xgetCValueShapeGrpDtlId() { return xdfgetShapeGrpDtlId(); }

    public Map<String, MProductShapeCQ> xdfgetShapeGrpDtlId_ExistsReferrer_MProductShapeList() { return xgetSQueMap("shapeGrpDtlId_ExistsReferrer_MProductShapeList"); }
    public String keepShapeGrpDtlId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("shapeGrpDtlId_ExistsReferrer_MProductShapeList", sq); }

    public Map<String, MProductShapeCQ> xdfgetShapeGrpDtlId_NotExistsReferrer_MProductShapeList() { return xgetSQueMap("shapeGrpDtlId_NotExistsReferrer_MProductShapeList"); }
    public String keepShapeGrpDtlId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("shapeGrpDtlId_NotExistsReferrer_MProductShapeList", sq); }

    public Map<String, MProductShapeCQ> xdfgetShapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList() { return xgetSQueMap("shapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList"); }
    public String keepShapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("shapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList", sq); }

    public Map<String, MProductShapeCQ> xdfgetShapeGrpDtlId_QueryDerivedReferrer_MProductShapeList() { return xgetSQueMap("shapeGrpDtlId_QueryDerivedReferrer_MProductShapeList"); }
    public String keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("shapeGrpDtlId_QueryDerivedReferrer_MProductShapeList", sq); }
    public Map<String, Object> xdfgetShapeGrpDtlId_QueryDerivedReferrer_MProductShapeListParameter() { return xgetSQuePmMap("shapeGrpDtlId_QueryDerivedReferrer_MProductShapeList"); }
    public String keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeListParameter(Object pm) { return xkeepSQuePm("shapeGrpDtlId_QueryDerivedReferrer_MProductShapeList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeGrpDtlId_Asc() { regOBA("SHAPE_GRP_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeGrpDtlId_Desc() { regOBD("SHAPE_GRP_DTL_ID"); return this; }

    protected ConditionValue _shapeGrpId;
    public ConditionValue xdfgetShapeGrpId()
    { if (_shapeGrpId == null) { _shapeGrpId = nCV(); }
      return _shapeGrpId; }
    protected ConditionValue xgetCValueShapeGrpId() { return xdfgetShapeGrpId(); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_InScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_InScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_InScopeRelation_MShapeGrp", sq); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_NotInScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_NotInScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_NotInScopeRelation_MShapeGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeGrpId_Asc() { regOBA("SHAPE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeGrpId_Desc() { regOBD("SHAPE_GRP_ID"); return this; }

    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    public Map<String, MShapeCQ> getShapeId_InScopeRelation_MShape() { return xgetSQueMap("shapeId_InScopeRelation_MShape"); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_InScopeRelation_MShape", sq); }

    public Map<String, MShapeCQ> getShapeId_NotInScopeRelation_MShape() { return xgetSQueMap("shapeId_NotInScopeRelation_MShape"); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_NotInScopeRelation_MShape", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _gtin14Symbol;
    public ConditionValue xdfgetGtin14Symbol()
    { if (_gtin14Symbol == null) { _gtin14Symbol = nCV(); }
      return _gtin14Symbol; }
    protected ConditionValue xgetCValueGtin14Symbol() { return xdfgetGtin14Symbol(); }

    /**
     * Add order-by as ascend. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_Gtin14Symbol_Asc() { regOBA("GTIN14_SYMBOL"); return this; }

    /**
     * Add order-by as descend. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_Gtin14Symbol_Desc() { regOBD("GTIN14_SYMBOL"); return this; }

    protected ConditionValue _casePickFlg;
    public ConditionValue xdfgetCasePickFlg()
    { if (_casePickFlg == null) { _casePickFlg = nCV(); }
      return _casePickFlg; }
    protected ConditionValue xgetCValueCasePickFlg() { return xdfgetCasePickFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_CasePickFlg_Asc() { regOBA("CASE_PICK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_CasePickFlg_Desc() { regOBD("CASE_PICK_FLG"); return this; }

    protected ConditionValue _shapeSort;
    public ConditionValue xdfgetShapeSort()
    { if (_shapeSort == null) { _shapeSort = nCV(); }
      return _shapeSort; }
    protected ConditionValue xgetCValueShapeSort() { return xdfgetShapeSort(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeSort_Asc() { regOBA("SHAPE_SORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ShapeSort_Desc() { regOBD("SHAPE_SORT"); return this; }

    protected ConditionValue _emReplenishShapeFlg;
    public ConditionValue xdfgetEmReplenishShapeFlg()
    { if (_emReplenishShapeFlg == null) { _emReplenishShapeFlg = nCV(); }
      return _emReplenishShapeFlg; }
    protected ConditionValue xgetCValueEmReplenishShapeFlg() { return xdfgetEmReplenishShapeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_EmReplenishShapeFlg_Asc() { regOBA("EM_REPLENISH_SHAPE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_EmReplenishShapeFlg_Desc() { regOBD("EM_REPLENISH_SHAPE_FLG"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMShapeGrpDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMShapeGrpDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMShapeGrpDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMShapeGrpDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MShapeGrpDtlCQ bq = (MShapeGrpDtlCQ)bqs;
        MShapeGrpDtlCQ uq = (MShapeGrpDtlCQ)uqs;
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryMShapeGrp()) {
            uq.queryMShapeGrp().reflectRelationOnUnionQuery(bq.queryMShapeGrp(), uq.queryMShapeGrp());
        }
        if (bq.hasConditionQueryBClassDtlByCasePickFlg()) {
            uq.queryBClassDtlByCasePickFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCasePickFlg(), uq.queryBClassDtlByCasePickFlg());
        }
        if (bq.hasConditionQueryBClassDtlByEmReplenishShapeFlg()) {
            uq.queryBClassDtlByEmReplenishShapeFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByEmReplenishShapeFlg(), uq.queryBClassDtlByEmReplenishShapeFlg());
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
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeCQ queryMShape() {
        return xdfgetConditionQueryMShape();
    }
    public MShapeCQ xdfgetConditionQueryMShape() {
        String prop = "mShape";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShape()); xsetupOuterJoinMShape(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeCQ xcreateQueryMShape() {
        String nrp = xresolveNRP("M_SHAPE_GRP_DTL", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeGrpCQ queryMShapeGrp() {
        return xdfgetConditionQueryMShapeGrp();
    }
    public MShapeGrpCQ xdfgetConditionQueryMShapeGrp() {
        String prop = "mShapeGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShapeGrp()); xsetupOuterJoinMShapeGrp(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeGrpCQ xcreateQueryMShapeGrp() {
        String nrp = xresolveNRP("M_SHAPE_GRP_DTL", "mShapeGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShapeGrp", nrp);
    }
    protected void xsetupOuterJoinMShapeGrp() { xregOutJo("mShapeGrp"); }
    public boolean hasConditionQueryMShapeGrp() { return xhasQueRlMap("mShapeGrp"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCasePickFlg() {
        return xdfgetConditionQueryBClassDtlByCasePickFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCasePickFlg() {
        String prop = "bClassDtlByCasePickFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCasePickFlg()); xsetupOuterJoinBClassDtlByCasePickFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCasePickFlg() {
        String nrp = xresolveNRP("M_SHAPE_GRP_DTL", "bClassDtlByCasePickFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCasePickFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCasePickFlg() { xregOutJo("bClassDtlByCasePickFlg"); }
    public boolean hasConditionQueryBClassDtlByCasePickFlg() { return xhasQueRlMap("bClassDtlByCasePickFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEmReplenishShapeFlg() {
        return xdfgetConditionQueryBClassDtlByEmReplenishShapeFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEmReplenishShapeFlg() {
        String prop = "bClassDtlByEmReplenishShapeFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEmReplenishShapeFlg()); xsetupOuterJoinBClassDtlByEmReplenishShapeFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEmReplenishShapeFlg() {
        String nrp = xresolveNRP("M_SHAPE_GRP_DTL", "bClassDtlByEmReplenishShapeFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEmReplenishShapeFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEmReplenishShapeFlg() { xregOutJo("bClassDtlByEmReplenishShapeFlg"); }
    public boolean hasConditionQueryBClassDtlByEmReplenishShapeFlg() { return xhasQueRlMap("bClassDtlByEmReplenishShapeFlg"); }

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
        String nrp = xresolveNRP("M_SHAPE_GRP_DTL", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MShapeGrpDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MShapeGrpDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MShapeGrpDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MShapeGrpDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MShapeGrpDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MShapeGrpDtlCQ> _myselfExistsMap;
    public Map<String, MShapeGrpDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MShapeGrpDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MShapeGrpDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MShapeGrpDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MShapeGrpDtlCB.class.getName(); }
    protected String xCQ() { return MShapeGrpDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
