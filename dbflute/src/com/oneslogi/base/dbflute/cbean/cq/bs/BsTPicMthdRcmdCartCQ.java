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
 * The base condition-query of T_PIC_MTHD_RCMD_CART.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPicMthdRcmdCartCQ extends AbstractBsTPicMthdRcmdCartCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPicMthdRcmdCartCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPicMthdRcmdCartCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PIC_MTHD_RCMD_CART) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPicMthdRcmdCartCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPicMthdRcmdCartCIQ xcreateCIQ() {
        TPicMthdRcmdCartCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPicMthdRcmdCartCIQ xnewCIQ() {
        return new TPicMthdRcmdCartCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PIC_MTHD_RCMD_CART on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPicMthdRcmdCartCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPicMthdRcmdCartCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _picMthdRcmdCartId;
    public ConditionValue xdfgetPicMthdRcmdCartId()
    { if (_picMthdRcmdCartId == null) { _picMthdRcmdCartId = nCV(); }
      return _picMthdRcmdCartId; }
    protected ConditionValue xgetCValuePicMthdRcmdCartId() { return xdfgetPicMthdRcmdCartId(); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_PicMthdRcmdCartId_Asc() { regOBA("PIC_MTHD_RCMD_CART_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_PicMthdRcmdCartId_Desc() { regOBD("PIC_MTHD_RCMD_CART_ID"); return this; }

    protected ConditionValue _packingHId;
    public ConditionValue xdfgetPackingHId()
    { if (_packingHId == null) { _packingHId = nCV(); }
      return _packingHId; }
    protected ConditionValue xgetCValuePackingHId() { return xdfgetPackingHId(); }

    public Map<String, TPackingHCQ> getPackingHId_InScopeRelation_TPackingH() { return xgetSQueMap("packingHId_InScopeRelation_TPackingH"); }
    public String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq) { return xkeepSQue("packingHId_InScopeRelation_TPackingH", sq); }

    public Map<String, TPackingHCQ> getPackingHId_NotInScopeRelation_TPackingH() { return xgetSQueMap("packingHId_NotInScopeRelation_TPackingH"); }
    public String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq) { return xkeepSQue("packingHId_NotInScopeRelation_TPackingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_PackingHId_Asc() { regOBA("PACKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_PackingHId_Desc() { regOBD("PACKING_H_ID"); return this; }

    protected ConditionValue _cartNo;
    public ConditionValue xdfgetCartNo()
    { if (_cartNo == null) { _cartNo = nCV(); }
      return _cartNo; }
    protected ConditionValue xgetCValueCartNo() { return xdfgetCartNo(); }

    /**
     * Add order-by as ascend. <br>
     * CART_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_CartNo_Asc() { regOBA("CART_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CART_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_CartNo_Desc() { regOBD("CART_NO"); return this; }

    protected ConditionValue _picMthdRcmdId;
    public ConditionValue xdfgetPicMthdRcmdId()
    { if (_picMthdRcmdId == null) { _picMthdRcmdId = nCV(); }
      return _picMthdRcmdId; }
    protected ConditionValue xgetCValuePicMthdRcmdId() { return xdfgetPicMthdRcmdId(); }

    public Map<String, TPicMthdRcmdCQ> getPicMthdRcmdId_InScopeRelation_TPicMthdRcmd() { return xgetSQueMap("picMthdRcmdId_InScopeRelation_TPicMthdRcmd"); }
    public String keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq) { return xkeepSQue("picMthdRcmdId_InScopeRelation_TPicMthdRcmd", sq); }

    public Map<String, TPicMthdRcmdCQ> getPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd() { return xgetSQueMap("picMthdRcmdId_NotInScopeRelation_TPicMthdRcmd"); }
    public String keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq) { return xkeepSQue("picMthdRcmdId_NotInScopeRelation_TPicMthdRcmd", sq); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_PicMthdRcmdId_Asc() { regOBA("PIC_MTHD_RCMD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_PicMthdRcmdId_Desc() { regOBD("PIC_MTHD_RCMD_ID"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPicMthdRcmdCartCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCartCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPicMthdRcmdCartCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPicMthdRcmdCartCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPicMthdRcmdCartCQ bq = (TPicMthdRcmdCartCQ)bqs;
        TPicMthdRcmdCartCQ uq = (TPicMthdRcmdCartCQ)uqs;
        if (bq.hasConditionQueryTPicMthdRcmd()) {
            uq.queryTPicMthdRcmd().reflectRelationOnUnionQuery(bq.queryTPicMthdRcmd(), uq.queryTPicMthdRcmd());
        }
        if (bq.hasConditionQueryTPackingH()) {
            uq.queryTPackingH().reflectRelationOnUnionQuery(bq.queryTPackingH(), uq.queryTPackingH());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPicMthdRcmdCQ queryTPicMthdRcmd() {
        return xdfgetConditionQueryTPicMthdRcmd();
    }
    public TPicMthdRcmdCQ xdfgetConditionQueryTPicMthdRcmd() {
        String prop = "tPicMthdRcmd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPicMthdRcmd()); xsetupOuterJoinTPicMthdRcmd(); }
        return xgetQueRlMap(prop);
    }
    protected TPicMthdRcmdCQ xcreateQueryTPicMthdRcmd() {
        String nrp = xresolveNRP("T_PIC_MTHD_RCMD_CART", "tPicMthdRcmd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPicMthdRcmdCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPicMthdRcmd", nrp);
    }
    protected void xsetupOuterJoinTPicMthdRcmd() { xregOutJo("tPicMthdRcmd"); }
    public boolean hasConditionQueryTPicMthdRcmd() { return xhasQueRlMap("tPicMthdRcmd"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPackingHCQ queryTPackingH() {
        return xdfgetConditionQueryTPackingH();
    }
    public TPackingHCQ xdfgetConditionQueryTPackingH() {
        String prop = "tPackingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPackingH()); xsetupOuterJoinTPackingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPackingHCQ xcreateQueryTPackingH() {
        String nrp = xresolveNRP("T_PIC_MTHD_RCMD_CART", "tPackingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPackingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPackingH", nrp);
    }
    protected void xsetupOuterJoinTPackingH() { xregOutJo("tPackingH"); }
    public boolean hasConditionQueryTPackingH() { return xhasQueRlMap("tPackingH"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPicMthdRcmdCartCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPicMthdRcmdCartCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPicMthdRcmdCartCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPicMthdRcmdCartCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPicMthdRcmdCartCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPicMthdRcmdCartCQ> _myselfExistsMap;
    public Map<String, TPicMthdRcmdCartCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPicMthdRcmdCartCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPicMthdRcmdCartCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPicMthdRcmdCartCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPicMthdRcmdCartCB.class.getName(); }
    protected String xCQ() { return TPicMthdRcmdCartCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
