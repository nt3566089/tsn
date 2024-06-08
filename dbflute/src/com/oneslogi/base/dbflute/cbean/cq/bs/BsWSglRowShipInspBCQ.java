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
 * The base condition-query of W_SGL_ROW_SHIP_INSP_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsWSglRowShipInspBCQ extends AbstractBsWSglRowShipInspBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WSglRowShipInspBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWSglRowShipInspBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_SGL_ROW_SHIP_INSP_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WSglRowShipInspBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WSglRowShipInspBCIQ xcreateCIQ() {
        WSglRowShipInspBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WSglRowShipInspBCIQ xnewCIQ() {
        return new WSglRowShipInspBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_SGL_ROW_SHIP_INSP_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WSglRowShipInspBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WSglRowShipInspBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sglRowShipInspBId;
    public ConditionValue xdfgetSglRowShipInspBId()
    { if (_sglRowShipInspBId == null) { _sglRowShipInspBId = nCV(); }
      return _sglRowShipInspBId; }
    protected ConditionValue xgetCValueSglRowShipInspBId() { return xdfgetSglRowShipInspBId(); }

    /**
     * Add order-by as ascend. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_SglRowShipInspBId_Asc() { regOBA("SGL_ROW_SHIP_INSP_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_SglRowShipInspBId_Desc() { regOBD("SGL_ROW_SHIP_INSP_B_ID"); return this; }

    protected ConditionValue _sglRowShipInspHId;
    public ConditionValue xdfgetSglRowShipInspHId()
    { if (_sglRowShipInspHId == null) { _sglRowShipInspHId = nCV(); }
      return _sglRowShipInspHId; }
    protected ConditionValue xgetCValueSglRowShipInspHId() { return xdfgetSglRowShipInspHId(); }

    public Map<String, WSglRowShipInspHCQ> getSglRowShipInspHId_InScopeRelation_WSglRowShipInspH() { return xgetSQueMap("sglRowShipInspHId_InScopeRelation_WSglRowShipInspH"); }
    public String keepSglRowShipInspHId_InScopeRelation_WSglRowShipInspH(WSglRowShipInspHCQ sq) { return xkeepSQue("sglRowShipInspHId_InScopeRelation_WSglRowShipInspH", sq); }

    public Map<String, WSglRowShipInspHCQ> getSglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH() { return xgetSQueMap("sglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH"); }
    public String keepSglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH(WSglRowShipInspHCQ sq) { return xkeepSQue("sglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_SglRowShipInspHId_Asc() { regOBA("SGL_ROW_SHIP_INSP_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_SglRowShipInspHId_Desc() { regOBD("SGL_ROW_SHIP_INSP_H_ID"); return this; }

    protected ConditionValue _pickingHId;
    public ConditionValue xdfgetPickingHId()
    { if (_pickingHId == null) { _pickingHId = nCV(); }
      return _pickingHId; }
    protected ConditionValue xgetCValuePickingHId() { return xdfgetPickingHId(); }

    public Map<String, TPickingHCQ> getPickingHId_InScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_InScopeRelation_TPickingH"); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_InScopeRelation_TPickingH", sq); }

    public Map<String, TPickingHCQ> getPickingHId_NotInScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_NotInScopeRelation_TPickingH"); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_NotInScopeRelation_TPickingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_PickingHId_Asc() { regOBA("PICKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_PickingHId_Desc() { regOBD("PICKING_H_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, BUserCQ> getUserId_InScopeRelation_BUser() { return xgetSQueMap("userId_InScopeRelation_BUser"); }
    public String keepUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("userId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getUserId_NotInScopeRelation_BUser() { return xgetSQueMap("userId_NotInScopeRelation_BUser"); }
    public String keepUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("userId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _inspectedNum;
    public ConditionValue xdfgetInspectedNum()
    { if (_inspectedNum == null) { _inspectedNum = nCV(); }
      return _inspectedNum; }
    protected ConditionValue xgetCValueInspectedNum() { return xdfgetInspectedNum(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_InspectedNum_Asc() { regOBA("INSPECTED_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_InspectedNum_Desc() { regOBD("INSPECTED_NUM"); return this; }

    protected ConditionValue _inspectionFlg;
    public ConditionValue xdfgetInspectionFlg()
    { if (_inspectionFlg == null) { _inspectionFlg = nCV(); }
      return _inspectionFlg; }
    protected ConditionValue xgetCValueInspectionFlg() { return xdfgetInspectionFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_InspectionFlg_Asc() { regOBA("INSPECTION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_InspectionFlg_Desc() { regOBD("INSPECTION_FLG"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWSglRowShipInspBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWSglRowShipInspBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWSglRowShipInspBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWSglRowShipInspBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WSglRowShipInspBCQ bq = (WSglRowShipInspBCQ)bqs;
        WSglRowShipInspBCQ uq = (WSglRowShipInspBCQ)uqs;
        if (bq.hasConditionQueryBUser()) {
            uq.queryBUser().reflectRelationOnUnionQuery(bq.queryBUser(), uq.queryBUser());
        }
        if (bq.hasConditionQueryWSglRowShipInspH()) {
            uq.queryWSglRowShipInspH().reflectRelationOnUnionQuery(bq.queryWSglRowShipInspH(), uq.queryWSglRowShipInspH());
        }
        if (bq.hasConditionQueryTPickingH()) {
            uq.queryTPickingH().reflectRelationOnUnionQuery(bq.queryTPickingH(), uq.queryTPickingH());
        }
        if (bq.hasConditionQueryBClassDtlByInspectionFlg()) {
            uq.queryBClassDtlByInspectionFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInspectionFlg(), uq.queryBClassDtlByInspectionFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my USER_ID, named 'BUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUser() {
        return xdfgetConditionQueryBUser();
    }
    public BUserCQ xdfgetConditionQueryBUser() {
        String prop = "bUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUser()); xsetupOuterJoinBUser(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUser() {
        String nrp = xresolveNRP("W_SGL_ROW_SHIP_INSP_B", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUser", nrp);
    }
    protected void xsetupOuterJoinBUser() { xregOutJo("bUser"); }
    public boolean hasConditionQueryBUser() { return xhasQueRlMap("bUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @return The instance of condition-query. (NotNull)
     */
    public WSglRowShipInspHCQ queryWSglRowShipInspH() {
        return xdfgetConditionQueryWSglRowShipInspH();
    }
    public WSglRowShipInspHCQ xdfgetConditionQueryWSglRowShipInspH() {
        String prop = "wSglRowShipInspH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWSglRowShipInspH()); xsetupOuterJoinWSglRowShipInspH(); }
        return xgetQueRlMap(prop);
    }
    protected WSglRowShipInspHCQ xcreateQueryWSglRowShipInspH() {
        String nrp = xresolveNRP("W_SGL_ROW_SHIP_INSP_B", "wSglRowShipInspH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WSglRowShipInspHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "wSglRowShipInspH", nrp);
    }
    protected void xsetupOuterJoinWSglRowShipInspH() { xregOutJo("wSglRowShipInspH"); }
    public boolean hasConditionQueryWSglRowShipInspH() { return xhasQueRlMap("wSglRowShipInspH"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingHCQ queryTPickingH() {
        return xdfgetConditionQueryTPickingH();
    }
    public TPickingHCQ xdfgetConditionQueryTPickingH() {
        String prop = "tPickingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingH()); xsetupOuterJoinTPickingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingHCQ xcreateQueryTPickingH() {
        String nrp = xresolveNRP("W_SGL_ROW_SHIP_INSP_B", "tPickingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingH", nrp);
    }
    protected void xsetupOuterJoinTPickingH() { xregOutJo("tPickingH"); }
    public boolean hasConditionQueryTPickingH() { return xhasQueRlMap("tPickingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInspectionFlg() {
        return xdfgetConditionQueryBClassDtlByInspectionFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInspectionFlg() {
        String prop = "bClassDtlByInspectionFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInspectionFlg()); xsetupOuterJoinBClassDtlByInspectionFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInspectionFlg() {
        String nrp = xresolveNRP("W_SGL_ROW_SHIP_INSP_B", "bClassDtlByInspectionFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInspectionFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInspectionFlg() { xregOutJo("bClassDtlByInspectionFlg"); }
    public boolean hasConditionQueryBClassDtlByInspectionFlg() { return xhasQueRlMap("bClassDtlByInspectionFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WSglRowShipInspBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WSglRowShipInspBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WSglRowShipInspBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WSglRowShipInspBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WSglRowShipInspBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WSglRowShipInspBCQ> _myselfExistsMap;
    public Map<String, WSglRowShipInspBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WSglRowShipInspBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WSglRowShipInspBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WSglRowShipInspBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WSglRowShipInspBCB.class.getName(); }
    protected String xCQ() { return WSglRowShipInspBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
