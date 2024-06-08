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
 * The base condition-query of T_EC_ORDER_R.
 * @author DBFlute(AutoGenerator)
 */
public class BsTEcOrderRCQ extends AbstractBsTEcOrderRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TEcOrderRCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_EC_ORDER_R) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TEcOrderRCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TEcOrderRCIQ xcreateCIQ() {
        TEcOrderRCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TEcOrderRCIQ xnewCIQ() {
        return new TEcOrderRCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_EC_ORDER_R on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TEcOrderRCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TEcOrderRCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ecOrderHId;
    public ConditionValue xdfgetEcOrderHId()
    { if (_ecOrderHId == null) { _ecOrderHId = nCV(); }
      return _ecOrderHId; }
    protected ConditionValue xgetCValueEcOrderHId() { return xdfgetEcOrderHId(); }

    public Map<String, TEcOrderHCQ> getEcOrderHId_InScopeRelation_TEcOrderH() { return xgetSQueMap("ecOrderHId_InScopeRelation_TEcOrderH"); }
    public String keepEcOrderHId_InScopeRelation_TEcOrderH(TEcOrderHCQ sq) { return xkeepSQue("ecOrderHId_InScopeRelation_TEcOrderH", sq); }

    public Map<String, TEcOrderHCQ> getEcOrderHId_NotInScopeRelation_TEcOrderH() { return xgetSQueMap("ecOrderHId_NotInScopeRelation_TEcOrderH"); }
    public String keepEcOrderHId_NotInScopeRelation_TEcOrderH(TEcOrderHCQ sq) { return xkeepSQue("ecOrderHId_NotInScopeRelation_TEcOrderH", sq); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_EcOrderHId_Asc() { regOBA("EC_ORDER_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_EcOrderHId_Desc() { regOBD("EC_ORDER_H_ID"); return this; }

    protected ConditionValue _statementOutFlg;
    public ConditionValue xdfgetStatementOutFlg()
    { if (_statementOutFlg == null) { _statementOutFlg = nCV(); }
      return _statementOutFlg; }
    protected ConditionValue xgetCValueStatementOutFlg() { return xdfgetStatementOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_StatementOutFlg_Asc() { regOBA("STATEMENT_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_StatementOutFlg_Desc() { regOBD("STATEMENT_OUT_FLG"); return this; }

    protected ConditionValue _statementOutUserId;
    public ConditionValue xdfgetStatementOutUserId()
    { if (_statementOutUserId == null) { _statementOutUserId = nCV(); }
      return _statementOutUserId; }
    protected ConditionValue xgetCValueStatementOutUserId() { return xdfgetStatementOutUserId(); }

    public Map<String, BUserCQ> getStatementOutUserId_InScopeRelation_BUser() { return xgetSQueMap("statementOutUserId_InScopeRelation_BUser"); }
    public String keepStatementOutUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("statementOutUserId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getStatementOutUserId_NotInScopeRelation_BUser() { return xgetSQueMap("statementOutUserId_NotInScopeRelation_BUser"); }
    public String keepStatementOutUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("statementOutUserId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_StatementOutUserId_Asc() { regOBA("STATEMENT_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_StatementOutUserId_Desc() { regOBD("STATEMENT_OUT_USER_ID"); return this; }

    protected ConditionValue _statementOutDt;
    public ConditionValue xdfgetStatementOutDt()
    { if (_statementOutDt == null) { _statementOutDt = nCV(); }
      return _statementOutDt; }
    protected ConditionValue xgetCValueStatementOutDt() { return xdfgetStatementOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_StatementOutDt_Asc() { regOBA("STATEMENT_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_StatementOutDt_Desc() { regOBD("STATEMENT_OUT_DT"); return this; }

    protected ConditionValue _invoiceCreateFlg;
    public ConditionValue xdfgetInvoiceCreateFlg()
    { if (_invoiceCreateFlg == null) { _invoiceCreateFlg = nCV(); }
      return _invoiceCreateFlg; }
    protected ConditionValue xgetCValueInvoiceCreateFlg() { return xdfgetInvoiceCreateFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_InvoiceCreateFlg_Asc() { regOBA("INVOICE_CREATE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_InvoiceCreateFlg_Desc() { regOBD("INVOICE_CREATE_FLG"); return this; }

    protected ConditionValue _invoiceCreateDt;
    public ConditionValue xdfgetInvoiceCreateDt()
    { if (_invoiceCreateDt == null) { _invoiceCreateDt = nCV(); }
      return _invoiceCreateDt; }
    protected ConditionValue xgetCValueInvoiceCreateDt() { return xdfgetInvoiceCreateDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_InvoiceCreateDt_Asc() { regOBA("INVOICE_CREATE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_InvoiceCreateDt_Desc() { regOBD("INVOICE_CREATE_DT"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTEcOrderRCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTEcOrderRCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTEcOrderRCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTEcOrderRCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TEcOrderRCQ bq = (TEcOrderRCQ)bqs;
        TEcOrderRCQ uq = (TEcOrderRCQ)uqs;
        if (bq.hasConditionQueryBUser()) {
            uq.queryBUser().reflectRelationOnUnionQuery(bq.queryBUser(), uq.queryBUser());
        }
        if (bq.hasConditionQueryTEcOrderH()) {
            uq.queryTEcOrderH().reflectRelationOnUnionQuery(bq.queryTEcOrderH(), uq.queryTEcOrderH());
        }
        if (bq.hasConditionQueryBClassDtlByInvoiceCreateFlg()) {
            uq.queryBClassDtlByInvoiceCreateFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInvoiceCreateFlg(), uq.queryBClassDtlByInvoiceCreateFlg());
        }
        if (bq.hasConditionQueryBClassDtlByStatementOutFlg()) {
            uq.queryBClassDtlByStatementOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStatementOutFlg(), uq.queryBClassDtlByStatementOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'.
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
        String nrp = xresolveNRP("T_EC_ORDER_R", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUser", nrp);
    }
    protected void xsetupOuterJoinBUser() { xregOutJo("bUser"); }
    public boolean hasConditionQueryBUser() { return xhasQueRlMap("bUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TEcOrderHCQ queryTEcOrderH() {
        return xdfgetConditionQueryTEcOrderH();
    }
    public TEcOrderHCQ xdfgetConditionQueryTEcOrderH() {
        String prop = "tEcOrderH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTEcOrderH()); xsetupOuterJoinTEcOrderH(); }
        return xgetQueRlMap(prop);
    }
    protected TEcOrderHCQ xcreateQueryTEcOrderH() {
        String nrp = xresolveNRP("T_EC_ORDER_R", "tEcOrderH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TEcOrderHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tEcOrderH", nrp);
    }
    protected void xsetupOuterJoinTEcOrderH() { xregOutJo("tEcOrderH"); }
    public boolean hasConditionQueryTEcOrderH() { return xhasQueRlMap("tEcOrderH"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInvoiceCreateFlg() {
        return xdfgetConditionQueryBClassDtlByInvoiceCreateFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInvoiceCreateFlg() {
        String prop = "bClassDtlByInvoiceCreateFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInvoiceCreateFlg()); xsetupOuterJoinBClassDtlByInvoiceCreateFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInvoiceCreateFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_R", "bClassDtlByInvoiceCreateFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInvoiceCreateFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInvoiceCreateFlg() { xregOutJo("bClassDtlByInvoiceCreateFlg"); }
    public boolean hasConditionQueryBClassDtlByInvoiceCreateFlg() { return xhasQueRlMap("bClassDtlByInvoiceCreateFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STATEMENT_OUT_FLG, named 'BClassDtlByStatementOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStatementOutFlg() {
        return xdfgetConditionQueryBClassDtlByStatementOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStatementOutFlg() {
        String prop = "bClassDtlByStatementOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStatementOutFlg()); xsetupOuterJoinBClassDtlByStatementOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStatementOutFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_R", "bClassDtlByStatementOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStatementOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStatementOutFlg() { xregOutJo("bClassDtlByStatementOutFlg"); }
    public boolean hasConditionQueryBClassDtlByStatementOutFlg() { return xhasQueRlMap("bClassDtlByStatementOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TEcOrderRCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TEcOrderRCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TEcOrderRCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TEcOrderRCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TEcOrderRCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TEcOrderRCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TEcOrderRCQ> _myselfExistsMap;
    public Map<String, TEcOrderRCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TEcOrderRCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TEcOrderRCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TEcOrderRCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TEcOrderRCB.class.getName(); }
    protected String xCQ() { return TEcOrderRCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
