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
 * The base condition-query of T_TRZONEINVENTORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrzoneinventoryCQ extends AbstractBsTTrzoneinventoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrzoneinventoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrzoneinventoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRZONEINVENTORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrzoneinventoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrzoneinventoryCIQ xcreateCIQ() {
        TTrzoneinventoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrzoneinventoryCIQ xnewCIQ() {
        return new TTrzoneinventoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRZONEINVENTORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrzoneinventoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrzoneinventoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trzoneinventorykey;
    public ConditionValue xdfgetTrzoneinventorykey()
    { if (_trzoneinventorykey == null) { _trzoneinventorykey = nCV(); }
      return _trzoneinventorykey; }
    protected ConditionValue xgetCValueTrzoneinventorykey() { return xdfgetTrzoneinventorykey(); }

    /**
     * Add order-by as ascend. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Trzoneinventorykey_Asc() { regOBA("TRZONEINVENTORYKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Trzoneinventorykey_Desc() { regOBD("TRZONEINVENTORYKEY"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

    protected ConditionValue _zone;
    public ConditionValue xdfgetZone()
    { if (_zone == null) { _zone = nCV(); }
      return _zone; }
    protected ConditionValue xgetCValueZone() { return xdfgetZone(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Zone_Asc() { regOBA("ZONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Zone_Desc() { regOBD("ZONE"); return this; }

    protected ConditionValue _palletcapacity;
    public ConditionValue xdfgetPalletcapacity()
    { if (_palletcapacity == null) { _palletcapacity = nCV(); }
      return _palletcapacity; }
    protected ConditionValue xgetCValuePalletcapacity() { return xdfgetPalletcapacity(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Palletcapacity_Asc() { regOBA("PALLETCAPACITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Palletcapacity_Desc() { regOBD("PALLETCAPACITY"); return this; }

    protected ConditionValue _palletspace;
    public ConditionValue xdfgetPalletspace()
    { if (_palletspace == null) { _palletspace = nCV(); }
      return _palletspace; }
    protected ConditionValue xgetCValuePalletspace() { return xdfgetPalletspace(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Palletspace_Asc() { regOBA("PALLETSPACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Palletspace_Desc() { regOBD("PALLETSPACE"); return this; }

    protected ConditionValue _zoneinvflg;
    public ConditionValue xdfgetZoneinvflg()
    { if (_zoneinvflg == null) { _zoneinvflg = nCV(); }
      return _zoneinvflg; }
    protected ConditionValue xgetCValueZoneinvflg() { return xdfgetZoneinvflg(); }

    /**
     * Add order-by as ascend. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Zoneinvflg_Asc() { regOBA("ZONEINVFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Zoneinvflg_Desc() { regOBD("ZONEINVFLG"); return this; }

    protected ConditionValue _qty1allocated;
    public ConditionValue xdfgetQty1allocated()
    { if (_qty1allocated == null) { _qty1allocated = nCV(); }
      return _qty1allocated; }
    protected ConditionValue xgetCValueQty1allocated() { return xdfgetQty1allocated(); }

    /**
     * Add order-by as ascend. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Qty1allocated_Asc() { regOBA("QTY1ALLOCATED"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Qty1allocated_Desc() { regOBD("QTY1ALLOCATED"); return this; }

    protected ConditionValue _rcvqty;
    public ConditionValue xdfgetRcvqty()
    { if (_rcvqty == null) { _rcvqty = nCV(); }
      return _rcvqty; }
    protected ConditionValue xgetCValueRcvqty() { return xdfgetRcvqty(); }

    /**
     * Add order-by as ascend. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Rcvqty_Asc() { regOBA("RCVQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_Rcvqty_Desc() { regOBD("RCVQTY"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrzoneinventoryCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrzoneinventoryCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrzoneinventoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrzoneinventoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrzoneinventoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrzoneinventoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrzoneinventoryCB.class.getName(); }
    protected String xCQ() { return TTrzoneinventoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
