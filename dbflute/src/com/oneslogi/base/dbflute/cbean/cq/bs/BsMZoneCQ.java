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
 * The base condition-query of M_ZONE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMZoneCQ extends AbstractBsMZoneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MZoneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMZoneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_ZONE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MZoneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MZoneCIQ xcreateCIQ() {
        MZoneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MZoneCIQ xnewCIQ() {
        return new MZoneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_ZONE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MZoneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MZoneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _zoneId;
    public ConditionValue xdfgetZoneId()
    { if (_zoneId == null) { _zoneId = nCV(); }
      return _zoneId; }
    protected ConditionValue xgetCValueZoneId() { return xdfgetZoneId(); }

    public Map<String, MLocationCQ> xdfgetZoneId_ExistsReferrer_MLocationList() { return xgetSQueMap("zoneId_ExistsReferrer_MLocationList"); }
    public String keepZoneId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("zoneId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MParamCQ> xdfgetZoneId_ExistsReferrer_MParamList() { return xgetSQueMap("zoneId_ExistsReferrer_MParamList"); }
    public String keepZoneId_ExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("zoneId_ExistsReferrer_MParamList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetZoneId_ExistsReferrer_TInventoryInstList() { return xgetSQueMap("zoneId_ExistsReferrer_TInventoryInstList"); }
    public String keepZoneId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("zoneId_ExistsReferrer_TInventoryInstList", sq); }

    public Map<String, MLocationCQ> xdfgetZoneId_NotExistsReferrer_MLocationList() { return xgetSQueMap("zoneId_NotExistsReferrer_MLocationList"); }
    public String keepZoneId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("zoneId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MParamCQ> xdfgetZoneId_NotExistsReferrer_MParamList() { return xgetSQueMap("zoneId_NotExistsReferrer_MParamList"); }
    public String keepZoneId_NotExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("zoneId_NotExistsReferrer_MParamList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetZoneId_NotExistsReferrer_TInventoryInstList() { return xgetSQueMap("zoneId_NotExistsReferrer_TInventoryInstList"); }
    public String keepZoneId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("zoneId_NotExistsReferrer_TInventoryInstList", sq); }

    public Map<String, MLocationCQ> xdfgetZoneId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("zoneId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepZoneId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("zoneId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MParamCQ> xdfgetZoneId_SpecifyDerivedReferrer_MParamList() { return xgetSQueMap("zoneId_SpecifyDerivedReferrer_MParamList"); }
    public String keepZoneId_SpecifyDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("zoneId_SpecifyDerivedReferrer_MParamList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetZoneId_SpecifyDerivedReferrer_TInventoryInstList() { return xgetSQueMap("zoneId_SpecifyDerivedReferrer_TInventoryInstList"); }
    public String keepZoneId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("zoneId_SpecifyDerivedReferrer_TInventoryInstList", sq); }

    public Map<String, MLocationCQ> xdfgetZoneId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("zoneId_QueryDerivedReferrer_MLocationList"); }
    public String keepZoneId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("zoneId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetZoneId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("zoneId_QueryDerivedReferrer_MLocationList"); }
    public String keepZoneId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("zoneId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MParamCQ> xdfgetZoneId_QueryDerivedReferrer_MParamList() { return xgetSQueMap("zoneId_QueryDerivedReferrer_MParamList"); }
    public String keepZoneId_QueryDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("zoneId_QueryDerivedReferrer_MParamList", sq); }
    public Map<String, Object> xdfgetZoneId_QueryDerivedReferrer_MParamListParameter() { return xgetSQuePmMap("zoneId_QueryDerivedReferrer_MParamList"); }
    public String keepZoneId_QueryDerivedReferrer_MParamListParameter(Object pm) { return xkeepSQuePm("zoneId_QueryDerivedReferrer_MParamList", pm); }

    public Map<String, TInventoryInstCQ> xdfgetZoneId_QueryDerivedReferrer_TInventoryInstList() { return xgetSQueMap("zoneId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepZoneId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("zoneId_QueryDerivedReferrer_TInventoryInstList", sq); }
    public Map<String, Object> xdfgetZoneId_QueryDerivedReferrer_TInventoryInstListParameter() { return xgetSQuePmMap("zoneId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepZoneId_QueryDerivedReferrer_TInventoryInstListParameter(Object pm) { return xkeepSQuePm("zoneId_QueryDerivedReferrer_TInventoryInstList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ZoneId_Asc() { regOBA("ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ZoneId_Desc() { regOBD("ZONE_ID"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    public Map<String, MWarehouseCQ> getWarehouseId_InScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_InScopeRelation_MWarehouse"); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_InScopeRelation_MWarehouse", sq); }

    public Map<String, MWarehouseCQ> getWarehouseId_NotInScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_NotInScopeRelation_MWarehouse"); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_NotInScopeRelation_MWarehouse", sq); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

    protected ConditionValue _zoneCd;
    public ConditionValue xdfgetZoneCd()
    { if (_zoneCd == null) { _zoneCd = nCV(); }
      return _zoneCd; }
    protected ConditionValue xgetCValueZoneCd() { return xdfgetZoneCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ZoneCd_Asc() { regOBA("ZONE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ZoneCd_Desc() { regOBD("ZONE_CD"); return this; }

    protected ConditionValue _zoneNm;
    public ConditionValue xdfgetZoneNm()
    { if (_zoneNm == null) { _zoneNm = nCV(); }
      return _zoneNm; }
    protected ConditionValue xgetCValueZoneNm() { return xdfgetZoneNm(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ZoneNm_Asc() { regOBA("ZONE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ZoneNm_Desc() { regOBD("ZONE_NM"); return this; }

    protected ConditionValue _pickingOrder;
    public ConditionValue xdfgetPickingOrder()
    { if (_pickingOrder == null) { _pickingOrder = nCV(); }
      return _pickingOrder; }
    protected ConditionValue xgetCValuePickingOrder() { return xdfgetPickingOrder(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_PickingOrder_Asc() { regOBA("PICKING_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_PickingOrder_Desc() { regOBD("PICKING_ORDER"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMZoneCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMZoneCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMZoneCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMZoneCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMZoneCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMZoneCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMZoneCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMZoneCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMZoneCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMZoneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMZoneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MZoneCQ bq = (MZoneCQ)bqs;
        MZoneCQ uq = (MZoneCQ)uqs;
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MWarehouseCQ queryMWarehouse() {
        return xdfgetConditionQueryMWarehouse();
    }
    public MWarehouseCQ xdfgetConditionQueryMWarehouse() {
        String prop = "mWarehouse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMWarehouse()); xsetupOuterJoinMWarehouse(); }
        return xgetQueRlMap(prop);
    }
    protected MWarehouseCQ xcreateQueryMWarehouse() {
        String nrp = xresolveNRP("M_ZONE", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_ZONE", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MZoneCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MZoneCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MZoneCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MZoneCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MZoneCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MZoneCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MZoneCQ> _myselfExistsMap;
    public Map<String, MZoneCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MZoneCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MZoneCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MZoneCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MZoneCB.class.getName(); }
    protected String xCQ() { return MZoneCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
