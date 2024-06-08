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
 * The base condition-query of T_TRREVERSESTOCK.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrreversestockCQ extends AbstractBsTTrreversestockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrreversestockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrreversestockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRREVERSESTOCK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrreversestockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrreversestockCIQ xcreateCIQ() {
        TTrreversestockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrreversestockCIQ xnewCIQ() {
        return new TTrreversestockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRREVERSESTOCK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrreversestockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrreversestockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trreversestockId;
    public ConditionValue xdfgetTrreversestockId()
    { if (_trreversestockId == null) { _trreversestockId = nCV(); }
      return _trreversestockId; }
    protected ConditionValue xgetCValueTrreversestockId() { return xdfgetTrreversestockId(); }

    /**
     * Add order-by as ascend. <br>
     * TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_TrreversestockId_Asc() { regOBA("TRREVERSESTOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_TrreversestockId_Desc() { regOBD("TRREVERSESTOCK_ID"); return this; }

    protected ConditionValue _trcasestockdetailId;
    public ConditionValue xdfgetTrcasestockdetailId()
    { if (_trcasestockdetailId == null) { _trcasestockdetailId = nCV(); }
      return _trcasestockdetailId; }
    protected ConditionValue xgetCValueTrcasestockdetailId() { return xdfgetTrcasestockdetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_TrcasestockdetailId_Asc() { regOBA("TRCASESTOCKDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_TrcasestockdetailId_Desc() { regOBD("TRCASESTOCKDETAIL_ID"); return this; }

    protected ConditionValue _centerSymbolId;
    public ConditionValue xdfgetCenterSymbolId()
    { if (_centerSymbolId == null) { _centerSymbolId = nCV(); }
      return _centerSymbolId; }
    protected ConditionValue xgetCValueCenterSymbolId() { return xdfgetCenterSymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_CenterSymbolId_Asc() { regOBA("CENTER_SYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_CenterSymbolId_Desc() { regOBD("CENTER_SYMBOL_ID"); return this; }

    protected ConditionValue _sortstockdate;
    public ConditionValue xdfgetSortstockdate()
    { if (_sortstockdate == null) { _sortstockdate = nCV(); }
      return _sortstockdate; }
    protected ConditionValue xgetCValueSortstockdate() { return xdfgetSortstockdate(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sortstockdate_Asc() { regOBA("SORTSTOCKDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sortstockdate_Desc() { regOBD("SORTSTOCKDATE"); return this; }

    protected ConditionValue _sortstockkbn;
    public ConditionValue xdfgetSortstockkbn()
    { if (_sortstockkbn == null) { _sortstockkbn = nCV(); }
      return _sortstockkbn; }
    protected ConditionValue xgetCValueSortstockkbn() { return xdfgetSortstockkbn(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sortstockkbn_Asc() { regOBA("SORTSTOCKKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sortstockkbn_Desc() { regOBD("SORTSTOCKKBN"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_Sotedunit_Asc() { regOBA("SOTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sotedunit_Desc() { regOBD("SOTEDUNIT"); return this; }

    protected ConditionValue _sortloccd;
    public ConditionValue xdfgetSortloccd()
    { if (_sortloccd == null) { _sortloccd = nCV(); }
      return _sortloccd; }
    protected ConditionValue xgetCValueSortloccd() { return xdfgetSortloccd(); }

    /**
     * Add order-by as ascend. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sortloccd_Asc() { regOBA("SORTLOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Sortloccd_Desc() { regOBD("SORTLOCCD"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _stmanufacturedate;
    public ConditionValue xdfgetStmanufacturedate()
    { if (_stmanufacturedate == null) { _stmanufacturedate = nCV(); }
      return _stmanufacturedate; }
    protected ConditionValue xgetCValueStmanufacturedate() { return xdfgetStmanufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * STMANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Stmanufacturedate_Asc() { regOBA("STMANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STMANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Stmanufacturedate_Desc() { regOBD("STMANUFACTUREDATE"); return this; }

    protected ConditionValue _somanufacturedate;
    public ConditionValue xdfgetSomanufacturedate()
    { if (_somanufacturedate == null) { _somanufacturedate = nCV(); }
      return _somanufacturedate; }
    protected ConditionValue xgetCValueSomanufacturedate() { return xdfgetSomanufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * SOMANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Somanufacturedate_Asc() { regOBA("SOMANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOMANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_Somanufacturedate_Desc() { regOBD("SOMANUFACTUREDATE"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrreversestockCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrreversestockCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrreversestockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrreversestockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrreversestockCQ bq = (TTrreversestockCQ)bqs;
        TTrreversestockCQ uq = (TTrreversestockCQ)uqs;
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
        String nrp = xresolveNRP("T_TRREVERSESTOCK", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_TRREVERSESTOCK", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TTrreversestockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrreversestockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrreversestockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrreversestockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrreversestockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrreversestockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrreversestockCQ> _myselfExistsMap;
    public Map<String, TTrreversestockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrreversestockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrreversestockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrreversestockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrreversestockCB.class.getName(); }
    protected String xCQ() { return TTrreversestockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
