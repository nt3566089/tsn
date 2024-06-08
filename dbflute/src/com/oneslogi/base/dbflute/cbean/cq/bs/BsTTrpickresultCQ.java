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
 * The base condition-query of T_TRPICKRESULT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpickresultCQ extends AbstractBsTTrpickresultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpickresultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpickresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPICKRESULT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpickresultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpickresultCIQ xcreateCIQ() {
        TTrpickresultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpickresultCIQ xnewCIQ() {
        return new TTrpickresultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPICKRESULT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpickresultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpickresultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingDetailId;
    public ConditionValue xdfgetPickingDetailId()
    { if (_pickingDetailId == null) { _pickingDetailId = nCV(); }
      return _pickingDetailId; }
    protected ConditionValue xgetCValuePickingDetailId() { return xdfgetPickingDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_PickingDetailId_Asc() { regOBA("PICKING_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_PickingDetailId_Desc() { regOBD("PICKING_DETAIL_ID"); return this; }

    protected ConditionValue _workallocateid;
    public ConditionValue xdfgetWorkallocateid()
    { if (_workallocateid == null) { _workallocateid = nCV(); }
      return _workallocateid; }
    protected ConditionValue xgetCValueWorkallocateid() { return xdfgetWorkallocateid(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Workallocateid_Asc() { regOBA("WORKALLOCATEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Workallocateid_Desc() { regOBD("WORKALLOCATEID"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

    protected ConditionValue _listkbn;
    public ConditionValue xdfgetListkbn()
    { if (_listkbn == null) { _listkbn = nCV(); }
      return _listkbn; }
    protected ConditionValue xgetCValueListkbn() { return xdfgetListkbn(); }

    /**
     * Add order-by as ascend. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Listkbn_Asc() { regOBA("LISTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Listkbn_Desc() { regOBD("LISTKBN"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _centerSymbolId;
    public ConditionValue xdfgetCenterSymbolId()
    { if (_centerSymbolId == null) { _centerSymbolId = nCV(); }
      return _centerSymbolId; }
    protected ConditionValue xgetCValueCenterSymbolId() { return xdfgetCenterSymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_CenterSymbolId_Asc() { regOBA("CENTER_SYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_CenterSymbolId_Desc() { regOBD("CENTER_SYMBOL_ID"); return this; }

    protected ConditionValue _pickedqty1;
    public ConditionValue xdfgetPickedqty1()
    { if (_pickedqty1 == null) { _pickedqty1 = nCV(); }
      return _pickedqty1; }
    protected ConditionValue xgetCValuePickedqty1() { return xdfgetPickedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Pickedqty1_Asc() { regOBA("PICKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Pickedqty1_Desc() { regOBD("PICKEDQTY1"); return this; }

    protected ConditionValue _sortedqty1;
    public ConditionValue xdfgetSortedqty1()
    { if (_sortedqty1 == null) { _sortedqty1 = nCV(); }
      return _sortedqty1; }
    protected ConditionValue xgetCValueSortedqty1() { return xdfgetSortedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SORTEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Sortedqty1_Asc() { regOBA("SORTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_Sortedqty1_Desc() { regOBD("SORTEDQTY1"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrpickresultCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpickresultCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrpickresultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrpickresultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrpickresultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpickresultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpickresultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpickresultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpickresultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpickresultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpickresultCQ> _myselfExistsMap;
    public Map<String, TTrpickresultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpickresultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpickresultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpickresultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpickresultCB.class.getName(); }
    protected String xCQ() { return TTrpickresultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
