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
 * The base condition-query of M_CARRIER_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierZipCQ extends AbstractBsMCarrierZipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierZipCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierZipCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CARRIER_ZIP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierZipCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierZipCIQ xcreateCIQ() {
        MCarrierZipCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierZipCIQ xnewCIQ() {
        return new MCarrierZipCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CARRIER_ZIP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierZipCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierZipCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierZipId;
    public ConditionValue xdfgetCarrierZipId()
    { if (_carrierZipId == null) { _carrierZipId = nCV(); }
      return _carrierZipId; }
    protected ConditionValue xgetCValueCarrierZipId() { return xdfgetCarrierZipId(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_CarrierZipId_Asc() { regOBA("CARRIER_ZIP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_CarrierZipId_Desc() { regOBD("CARRIER_ZIP_ID"); return this; }

    protected ConditionValue _commonCarrierId;
    public ConditionValue xdfgetCommonCarrierId()
    { if (_commonCarrierId == null) { _commonCarrierId = nCV(); }
      return _commonCarrierId; }
    protected ConditionValue xgetCValueCommonCarrierId() { return xdfgetCommonCarrierId(); }

    public Map<String, MCommonCarrierCQ> getCommonCarrierId_InScopeRelation_MCommonCarrier() { return xgetSQueMap("commonCarrierId_InScopeRelation_MCommonCarrier"); }
    public String keepCommonCarrierId_InScopeRelation_MCommonCarrier(MCommonCarrierCQ sq) { return xkeepSQue("commonCarrierId_InScopeRelation_MCommonCarrier", sq); }

    public Map<String, MCommonCarrierCQ> getCommonCarrierId_NotInScopeRelation_MCommonCarrier() { return xgetSQueMap("commonCarrierId_NotInScopeRelation_MCommonCarrier"); }
    public String keepCommonCarrierId_NotInScopeRelation_MCommonCarrier(MCommonCarrierCQ sq) { return xkeepSQue("commonCarrierId_NotInScopeRelation_MCommonCarrier", sq); }

    /**
     * Add order-by as ascend. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_CommonCarrierId_Asc() { regOBA("COMMON_CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_CommonCarrierId_Desc() { regOBD("COMMON_CARRIER_ID"); return this; }

    protected ConditionValue _zipId;
    public ConditionValue xdfgetZipId()
    { if (_zipId == null) { _zipId = nCV(); }
      return _zipId; }
    protected ConditionValue xgetCValueZipId() { return xdfgetZipId(); }

    public Map<String, MZipCQ> getZipId_InScopeRelation_MZip() { return xgetSQueMap("zipId_InScopeRelation_MZip"); }
    public String keepZipId_InScopeRelation_MZip(MZipCQ sq) { return xkeepSQue("zipId_InScopeRelation_MZip", sq); }

    public Map<String, MZipCQ> getZipId_NotInScopeRelation_MZip() { return xgetSQueMap("zipId_NotInScopeRelation_MZip"); }
    public String keepZipId_NotInScopeRelation_MZip(MZipCQ sq) { return xkeepSQue("zipId_NotInScopeRelation_MZip", sq); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ZipId_Asc() { regOBA("ZIP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ZipId_Desc() { regOBD("ZIP_ID"); return this; }

    protected ConditionValue _arrivalStoreCd;
    public ConditionValue xdfgetArrivalStoreCd()
    { if (_arrivalStoreCd == null) { _arrivalStoreCd = nCV(); }
      return _arrivalStoreCd; }
    protected ConditionValue xgetCValueArrivalStoreCd() { return xdfgetArrivalStoreCd(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ArrivalStoreCd_Asc() { regOBA("ARRIVAL_STORE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ArrivalStoreCd_Desc() { regOBD("ARRIVAL_STORE_CD"); return this; }

    protected ConditionValue _arrivalStoreNm;
    public ConditionValue xdfgetArrivalStoreNm()
    { if (_arrivalStoreNm == null) { _arrivalStoreNm = nCV(); }
      return _arrivalStoreNm; }
    protected ConditionValue xgetCValueArrivalStoreNm() { return xdfgetArrivalStoreNm(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ArrivalStoreNm_Asc() { regOBA("ARRIVAL_STORE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ArrivalStoreNm_Desc() { regOBD("ARRIVAL_STORE_NM"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCarrierZipCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierZipCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCarrierZipCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCarrierZipCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierZipCQ bq = (MCarrierZipCQ)bqs;
        MCarrierZipCQ uq = (MCarrierZipCQ)uqs;
        if (bq.hasConditionQueryMCommonCarrier()) {
            uq.queryMCommonCarrier().reflectRelationOnUnionQuery(bq.queryMCommonCarrier(), uq.queryMCommonCarrier());
        }
        if (bq.hasConditionQueryMZip()) {
            uq.queryMZip().reflectRelationOnUnionQuery(bq.queryMZip(), uq.queryMZip());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCommonCarrierCQ queryMCommonCarrier() {
        return xdfgetConditionQueryMCommonCarrier();
    }
    public MCommonCarrierCQ xdfgetConditionQueryMCommonCarrier() {
        String prop = "mCommonCarrier";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCommonCarrier()); xsetupOuterJoinMCommonCarrier(); }
        return xgetQueRlMap(prop);
    }
    protected MCommonCarrierCQ xcreateQueryMCommonCarrier() {
        String nrp = xresolveNRP("M_CARRIER_ZIP", "mCommonCarrier"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCommonCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCommonCarrier", nrp);
    }
    protected void xsetupOuterJoinMCommonCarrier() { xregOutJo("mCommonCarrier"); }
    public boolean hasConditionQueryMCommonCarrier() { return xhasQueRlMap("mCommonCarrier"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_ZIP by my ZIP_ID, named 'MZip'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZipCQ queryMZip() {
        return xdfgetConditionQueryMZip();
    }
    public MZipCQ xdfgetConditionQueryMZip() {
        String prop = "mZip";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZip()); xsetupOuterJoinMZip(); }
        return xgetQueRlMap(prop);
    }
    protected MZipCQ xcreateQueryMZip() {
        String nrp = xresolveNRP("M_CARRIER_ZIP", "mZip"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZipCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZip", nrp);
    }
    protected void xsetupOuterJoinMZip() { xregOutJo("mZip"); }
    public boolean hasConditionQueryMZip() { return xhasQueRlMap("mZip"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierZipCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierZipCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierZipCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierZipCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierZipCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierZipCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierZipCQ> _myselfExistsMap;
    public Map<String, MCarrierZipCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierZipCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierZipCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierZipCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierZipCB.class.getName(); }
    protected String xCQ() { return MCarrierZipCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
