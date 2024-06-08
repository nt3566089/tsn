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
 * The base condition-query of T_TRFLEXIBILITY.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrflexibilityCQ extends AbstractBsTTrflexibilityCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrflexibilityCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrflexibilityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRFLEXIBILITY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrflexibilityCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrflexibilityCIQ xcreateCIQ() {
        TTrflexibilityCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrflexibilityCIQ xnewCIQ() {
        return new TTrflexibilityCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRFLEXIBILITY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrflexibilityCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrflexibilityCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _flexibleTransportInfoId;
    public ConditionValue xdfgetFlexibleTransportInfoId()
    { if (_flexibleTransportInfoId == null) { _flexibleTransportInfoId = nCV(); }
      return _flexibleTransportInfoId; }
    protected ConditionValue xgetCValueFlexibleTransportInfoId() { return xdfgetFlexibleTransportInfoId(); }

    public Map<String, TTrflexibilitydetailCQ> xdfgetFlexibleTransportInfoId_ExistsReferrer_TTrflexibilitydetailList() { return xgetSQueMap("flexibleTransportInfoId_ExistsReferrer_TTrflexibilitydetailList"); }
    public String keepFlexibleTransportInfoId_ExistsReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq) { return xkeepSQue("flexibleTransportInfoId_ExistsReferrer_TTrflexibilitydetailList", sq); }

    public Map<String, TTrflexibilitydetailCQ> xdfgetFlexibleTransportInfoId_NotExistsReferrer_TTrflexibilitydetailList() { return xgetSQueMap("flexibleTransportInfoId_NotExistsReferrer_TTrflexibilitydetailList"); }
    public String keepFlexibleTransportInfoId_NotExistsReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq) { return xkeepSQue("flexibleTransportInfoId_NotExistsReferrer_TTrflexibilitydetailList", sq); }

    public Map<String, TTrflexibilitydetailCQ> xdfgetFlexibleTransportInfoId_SpecifyDerivedReferrer_TTrflexibilitydetailList() { return xgetSQueMap("flexibleTransportInfoId_SpecifyDerivedReferrer_TTrflexibilitydetailList"); }
    public String keepFlexibleTransportInfoId_SpecifyDerivedReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq) { return xkeepSQue("flexibleTransportInfoId_SpecifyDerivedReferrer_TTrflexibilitydetailList", sq); }

    public Map<String, TTrflexibilitydetailCQ> xdfgetFlexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList() { return xgetSQueMap("flexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList"); }
    public String keepFlexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq) { return xkeepSQue("flexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList", sq); }
    public Map<String, Object> xdfgetFlexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailListParameter() { return xgetSQuePmMap("flexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList"); }
    public String keepFlexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailListParameter(Object pm) { return xkeepSQuePm("flexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_FlexibleTransportInfoId_Asc() { regOBA("FLEXIBLE_TRANSPORT_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_FlexibleTransportInfoId_Desc() { regOBD("FLEXIBLE_TRANSPORT_INFO_ID"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _shipcd;
    public ConditionValue xdfgetShipcd()
    { if (_shipcd == null) { _shipcd = nCV(); }
      return _shipcd; }
    protected ConditionValue xgetCValueShipcd() { return xdfgetShipcd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

    protected ConditionValue _flexibityno;
    public ConditionValue xdfgetFlexibityno()
    { if (_flexibityno == null) { _flexibityno = nCV(); }
      return _flexibityno; }
    protected ConditionValue xgetCValueFlexibityno() { return xdfgetFlexibityno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Flexibityno_Asc() { regOBA("FLEXIBITYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Flexibityno_Desc() { regOBD("FLEXIBITYNO"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _rcvdate;
    public ConditionValue xdfgetRcvdate()
    { if (_rcvdate == null) { _rcvdate = nCV(); }
      return _rcvdate; }
    protected ConditionValue xgetCValueRcvdate() { return xdfgetRcvdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Rcvdate_Asc() { regOBA("RCVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Rcvdate_Desc() { regOBD("RCVDATE"); return this; }

    protected ConditionValue _sts;
    public ConditionValue xdfgetSts()
    { if (_sts == null) { _sts = nCV(); }
      return _sts; }
    protected ConditionValue xgetCValueSts() { return xdfgetSts(); }

    /**
     * Add order-by as ascend. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Sts_Asc() { regOBA("STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Sts_Desc() { regOBD("STS"); return this; }

    protected ConditionValue _instractdatetime;
    public ConditionValue xdfgetInstractdatetime()
    { if (_instractdatetime == null) { _instractdatetime = nCV(); }
      return _instractdatetime; }
    protected ConditionValue xgetCValueInstractdatetime() { return xdfgetInstractdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * INSTRACTDATETIME: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Instractdatetime_Asc() { regOBA("INSTRACTDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSTRACTDATETIME: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_Instractdatetime_Desc() { regOBD("INSTRACTDATETIME"); return this; }

    protected ConditionValue _vaExtdata1;
    public ConditionValue xdfgetVaExtdata1()
    { if (_vaExtdata1 == null) { _vaExtdata1 = nCV(); }
      return _vaExtdata1; }
    protected ConditionValue xgetCValueVaExtdata1() { return xdfgetVaExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

    protected ConditionValue _nmExtdata1;
    public ConditionValue xdfgetNmExtdata1()
    { if (_nmExtdata1 == null) { _nmExtdata1 = nCV(); }
      return _nmExtdata1; }
    protected ConditionValue xgetCValueNmExtdata1() { return xdfgetNmExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrflexibilityCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrflexibilityCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrflexibilityCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrflexibilityCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrflexibilityCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrflexibilityCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrflexibilityCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrflexibilityCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrflexibilityCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrflexibilityCQ> _myselfExistsMap;
    public Map<String, TTrflexibilityCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrflexibilityCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrflexibilityCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrflexibilityCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrflexibilityCB.class.getName(); }
    protected String xCQ() { return TTrflexibilityCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
