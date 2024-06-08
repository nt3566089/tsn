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
 * The base condition-query of T_TRITEMCONVRESULT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTritemconvresultCQ extends AbstractBsTTritemconvresultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTritemconvresultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTritemconvresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRITEMCONVRESULT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTritemconvresultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTritemconvresultCIQ xcreateCIQ() {
        TTritemconvresultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTritemconvresultCIQ xnewCIQ() {
        return new TTritemconvresultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRITEMCONVRESULT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTritemconvresultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTritemconvresultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tritemconvresultId;
    public ConditionValue xdfgetTritemconvresultId()
    { if (_tritemconvresultId == null) { _tritemconvresultId = nCV(); }
      return _tritemconvresultId; }
    protected ConditionValue xgetCValueTritemconvresultId() { return xdfgetTritemconvresultId(); }

    /**
     * Add order-by as ascend. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_TritemconvresultId_Asc() { regOBA("TRITEMCONVRESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_TritemconvresultId_Desc() { regOBD("TRITEMCONVRESULT_ID"); return this; }

    protected ConditionValue _itemchginstkey;
    public ConditionValue xdfgetItemchginstkey()
    { if (_itemchginstkey == null) { _itemchginstkey = nCV(); }
      return _itemchginstkey; }
    protected ConditionValue xgetCValueItemchginstkey() { return xdfgetItemchginstkey(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Itemchginstkey_Asc() { regOBA("ITEMCHGINSTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Itemchginstkey_Desc() { regOBD("ITEMCHGINSTKEY"); return this; }

    protected ConditionValue _jttsflg;
    public ConditionValue xdfgetJttsflg()
    { if (_jttsflg == null) { _jttsflg = nCV(); }
      return _jttsflg; }
    protected ConditionValue xgetCValueJttsflg() { return xdfgetJttsflg(); }

    /**
     * Add order-by as ascend. <br>
     * JTTSFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Jttsflg_Asc() { regOBA("JTTSFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTTSFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Jttsflg_Desc() { regOBD("JTTSFLG"); return this; }

    protected ConditionValue _companycd;
    public ConditionValue xdfgetCompanycd()
    { if (_companycd == null) { _companycd = nCV(); }
      return _companycd; }
    protected ConditionValue xgetCValueCompanycd() { return xdfgetCompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Companycd_Asc() { regOBA("COMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Companycd_Desc() { regOBD("COMPANYCD"); return this; }

    protected ConditionValue _productCdFrom;
    public ConditionValue xdfgetProductCdFrom()
    { if (_productCdFrom == null) { _productCdFrom = nCV(); }
      return _productCdFrom; }
    protected ConditionValue xgetCValueProductCdFrom() { return xdfgetProductCdFrom(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ProductCdFrom_Asc() { regOBA("PRODUCT_CD_FROM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ProductCdFrom_Desc() { regOBD("PRODUCT_CD_FROM"); return this; }

    protected ConditionValue _productCdTo;
    public ConditionValue xdfgetProductCdTo()
    { if (_productCdTo == null) { _productCdTo = nCV(); }
      return _productCdTo; }
    protected ConditionValue xgetCValueProductCdTo() { return xdfgetProductCdTo(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ProductCdTo_Asc() { regOBA("PRODUCT_CD_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ProductCdTo_Desc() { regOBD("PRODUCT_CD_TO"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _itemchginstflg;
    public ConditionValue xdfgetItemchginstflg()
    { if (_itemchginstflg == null) { _itemchginstflg = nCV(); }
      return _itemchginstflg; }
    protected ConditionValue xgetCValueItemchginstflg() { return xdfgetItemchginstflg(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Itemchginstflg_Asc() { regOBA("ITEMCHGINSTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Itemchginstflg_Desc() { regOBD("ITEMCHGINSTFLG"); return this; }

    protected ConditionValue _itemchginstdate;
    public ConditionValue xdfgetItemchginstdate()
    { if (_itemchginstdate == null) { _itemchginstdate = nCV(); }
      return _itemchginstdate; }
    protected ConditionValue xgetCValueItemchginstdate() { return xdfgetItemchginstdate(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Itemchginstdate_Asc() { regOBA("ITEMCHGINSTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_Itemchginstdate_Desc() { regOBD("ITEMCHGINSTDATE"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTritemconvresultCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTritemconvresultCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTritemconvresultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTritemconvresultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTritemconvresultCQ bq = (TTritemconvresultCQ)bqs;
        TTritemconvresultCQ uq = (TTritemconvresultCQ)uqs;
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
        String nrp = xresolveNRP("T_TRITEMCONVRESULT", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_TRITEMCONVRESULT", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TTritemconvresultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTritemconvresultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTritemconvresultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTritemconvresultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTritemconvresultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTritemconvresultCQ> _myselfExistsMap;
    public Map<String, TTritemconvresultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTritemconvresultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTritemconvresultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTritemconvresultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTritemconvresultCB.class.getName(); }
    protected String xCQ() { return TTritemconvresultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
