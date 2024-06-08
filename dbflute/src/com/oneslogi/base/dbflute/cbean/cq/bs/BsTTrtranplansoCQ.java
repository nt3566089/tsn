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
 * The base condition-query of T_TRTRANPLANSO.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrtranplansoCQ extends AbstractBsTTrtranplansoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrtranplansoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrtranplansoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRTRANPLANSO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrtranplansoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrtranplansoCIQ xcreateCIQ() {
        TTrtranplansoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrtranplansoCIQ xnewCIQ() {
        return new TTrtranplansoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRTRANPLANSO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrtranplansoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrtranplansoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _flexibleTransportPlanInfoId;
    public ConditionValue xdfgetFlexibleTransportPlanInfoId()
    { if (_flexibleTransportPlanInfoId == null) { _flexibleTransportPlanInfoId = nCV(); }
      return _flexibleTransportPlanInfoId; }
    protected ConditionValue xgetCValueFlexibleTransportPlanInfoId() { return xdfgetFlexibleTransportPlanInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBLE_TRANSPORT_PLAN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_FlexibleTransportPlanInfoId_Asc() { regOBA("FLEXIBLE_TRANSPORT_PLAN_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBLE_TRANSPORT_PLAN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_FlexibleTransportPlanInfoId_Desc() { regOBD("FLEXIBLE_TRANSPORT_PLAN_INFO_ID"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

    protected ConditionValue _shipschdate;
    public ConditionValue xdfgetShipschdate()
    { if (_shipschdate == null) { _shipschdate = nCV(); }
      return _shipschdate; }
    protected ConditionValue xgetCValueShipschdate() { return xdfgetShipschdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shipschdate_Asc() { regOBA("SHIPSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shipschdate_Desc() { regOBD("SHIPSCHDATE"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

    protected ConditionValue _shiptoschdate;
    public ConditionValue xdfgetShiptoschdate()
    { if (_shiptoschdate == null) { _shiptoschdate = nCV(); }
      return _shiptoschdate; }
    protected ConditionValue xgetCValueShiptoschdate() { return xdfgetShiptoschdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shiptoschdate_Asc() { regOBA("SHIPTOSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Shiptoschdate_Desc() { regOBD("SHIPTOSCHDATE"); return this; }

    protected ConditionValue _datatype;
    public ConditionValue xdfgetDatatype()
    { if (_datatype == null) { _datatype = nCV(); }
      return _datatype; }
    protected ConditionValue xgetCValueDatatype() { return xdfgetDatatype(); }

    /**
     * Add order-by as ascend. <br>
     * DATATYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Datatype_Asc() { regOBA("DATATYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATATYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Datatype_Desc() { regOBD("DATATYPE"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _subwarehousecd;
    public ConditionValue xdfgetSubwarehousecd()
    { if (_subwarehousecd == null) { _subwarehousecd = nCV(); }
      return _subwarehousecd; }
    protected ConditionValue xgetCValueSubwarehousecd() { return xdfgetSubwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Subwarehousecd_Asc() { regOBA("SUBWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_Subwarehousecd_Desc() { regOBD("SUBWAREHOUSECD"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrtranplansoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrtranplansoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrtranplansoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrtranplansoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrtranplansoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrtranplansoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrtranplansoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrtranplansoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrtranplansoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrtranplansoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrtranplansoCQ> _myselfExistsMap;
    public Map<String, TTrtranplansoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrtranplansoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrtranplansoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrtranplansoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrtranplansoCB.class.getName(); }
    protected String xCQ() { return TTrtranplansoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
