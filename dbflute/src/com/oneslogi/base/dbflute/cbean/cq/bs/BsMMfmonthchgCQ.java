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
 * The base condition-query of M_MFMONTHCHG.
 * @author DBFlute(AutoGenerator)
 */
public class BsMMfmonthchgCQ extends AbstractBsMMfmonthchgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MMfmonthchgCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMMfmonthchgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_MFMONTHCHG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MMfmonthchgCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MMfmonthchgCIQ xcreateCIQ() {
        MMfmonthchgCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MMfmonthchgCIQ xnewCIQ() {
        return new MMfmonthchgCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_MFMONTHCHG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MMfmonthchgCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MMfmonthchgCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _mfmonthchgId;
    public ConditionValue xdfgetMfmonthchgId()
    { if (_mfmonthchgId == null) { _mfmonthchgId = nCV(); }
      return _mfmonthchgId; }
    protected ConditionValue xgetCValueMfmonthchgId() { return xdfgetMfmonthchgId(); }

    /**
     * Add order-by as ascend. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_MfmonthchgId_Asc() { regOBA("MFMONTHCHG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_MfmonthchgId_Desc() { regOBD("MFMONTHCHG_ID"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _systemDt;
    public ConditionValue xdfgetSystemDt()
    { if (_systemDt == null) { _systemDt = nCV(); }
      return _systemDt; }
    protected ConditionValue xgetCValueSystemDt() { return xdfgetSystemDt(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_SystemDt_Asc() { regOBA("SYSTEM_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_SystemDt_Desc() { regOBD("SYSTEM_DT"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _sotedunit;
    public ConditionValue xdfgetSotedunit()
    { if (_sotedunit == null) { _sotedunit = nCV(); }
      return _sotedunit; }
    protected ConditionValue xgetCValueSotedunit() { return xdfgetSotedunit(); }

    /**
     * Add order-by as ascend. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Sotedunit_Asc() { regOBA("SOTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Sotedunit_Desc() { regOBD("SOTEDUNIT"); return this; }

    protected ConditionValue _limitdate;
    public ConditionValue xdfgetLimitdate()
    { if (_limitdate == null) { _limitdate = nCV(); }
      return _limitdate; }
    protected ConditionValue xgetCValueLimitdate() { return xdfgetLimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _designflg;
    public ConditionValue xdfgetDesignflg()
    { if (_designflg == null) { _designflg = nCV(); }
      return _designflg; }
    protected ConditionValue xgetCValueDesignflg() { return xdfgetDesignflg(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Designflg_Asc() { regOBA("DESIGNFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Designflg_Desc() { regOBD("DESIGNFLG"); return this; }

    protected ConditionValue _picklisttype;
    public ConditionValue xdfgetPicklisttype()
    { if (_picklisttype == null) { _picklisttype = nCV(); }
      return _picklisttype; }
    protected ConditionValue xgetCValuePicklisttype() { return xdfgetPicklisttype(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Picklisttype_Asc() { regOBA("PICKLISTTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLISTTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Picklisttype_Desc() { regOBD("PICKLISTTYPE"); return this; }

    protected ConditionValue _sotedloc;
    public ConditionValue xdfgetSotedloc()
    { if (_sotedloc == null) { _sotedloc = nCV(); }
      return _sotedloc; }
    protected ConditionValue xgetCValueSotedloc() { return xdfgetSotedloc(); }

    /**
     * Add order-by as ascend. <br>
     * SOTEDLOC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Sotedloc_Asc() { regOBA("SOTEDLOC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDLOC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Sotedloc_Desc() { regOBD("SOTEDLOC"); return this; }

    protected ConditionValue _picklistkey;
    public ConditionValue xdfgetPicklistkey()
    { if (_picklistkey == null) { _picklistkey = nCV(); }
      return _picklistkey; }
    protected ConditionValue xgetCValuePicklistkey() { return xdfgetPicklistkey(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLISTKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Picklistkey_Asc() { regOBA("PICKLISTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLISTKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Picklistkey_Desc() { regOBD("PICKLISTKEY"); return this; }

    protected ConditionValue _picklistgno;
    public ConditionValue xdfgetPicklistgno()
    { if (_picklistgno == null) { _picklistgno = nCV(); }
      return _picklistgno; }
    protected ConditionValue xgetCValuePicklistgno() { return xdfgetPicklistgno(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLISTGNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Picklistgno_Asc() { regOBA("PICKLISTGNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLISTGNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_Picklistgno_Desc() { regOBD("PICKLISTGNO"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMMfmonthchgCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMMfmonthchgCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMMfmonthchgCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMMfmonthchgCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MMfmonthchgCQ bq = (MMfmonthchgCQ)bqs;
        MMfmonthchgCQ uq = (MMfmonthchgCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("M_MFMONTHCHG", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("M_MFMONTHCHG", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MMfmonthchgCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MMfmonthchgCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MMfmonthchgCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MMfmonthchgCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MMfmonthchgCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MMfmonthchgCQ> _myselfExistsMap;
    public Map<String, MMfmonthchgCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MMfmonthchgCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MMfmonthchgCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MMfmonthchgCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MMfmonthchgCB.class.getName(); }
    protected String xCQ() { return MMfmonthchgCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
