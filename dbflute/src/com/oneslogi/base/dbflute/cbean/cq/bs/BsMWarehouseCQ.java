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
 * The base condition-query of M_WAREHOUSE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMWarehouseCQ extends AbstractBsMWarehouseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MWarehouseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMWarehouseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_WAREHOUSE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MWarehouseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MWarehouseCIQ xcreateCIQ() {
        MWarehouseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MWarehouseCIQ xnewCIQ() {
        return new MWarehouseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_WAREHOUSE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MWarehouseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MWarehouseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    public Map<String, MWebHtInfoCQ> xdfgetWarehouseId_ExistsReferrer_MWebHtInfoList() { return xgetSQueMap("warehouseId_ExistsReferrer_MWebHtInfoList"); }
    public String keepWarehouseId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, MZoneCQ> xdfgetWarehouseId_ExistsReferrer_MZoneList() { return xgetSQueMap("warehouseId_ExistsReferrer_MZoneList"); }
    public String keepWarehouseId_ExistsReferrer_MZoneList(MZoneCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_MZoneList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetWarehouseId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("warehouseId_ExistsReferrer_TAllocInstBList"); }
    public String keepWarehouseId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetWarehouseId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("warehouseId_ExistsReferrer_TInventoryBList"); }
    public String keepWarehouseId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetWarehouseId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("warehouseId_ExistsReferrer_TMoveInstBList"); }
    public String keepWarehouseId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetWarehouseId_ExistsReferrer_TReceivePlanBList() { return xgetSQueMap("warehouseId_ExistsReferrer_TReceivePlanBList"); }
    public String keepWarehouseId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetWarehouseId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("warehouseId_ExistsReferrer_TShippingInstBList"); }
    public String keepWarehouseId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetWarehouseId_ExistsReferrer_TStockList() { return xgetSQueMap("warehouseId_ExistsReferrer_TStockList"); }
    public String keepWarehouseId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_TStockList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetWarehouseId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("warehouseId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepWarehouseId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetWarehouseId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("warehouseId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepWarehouseId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetWarehouseId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("warehouseId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepWarehouseId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetWarehouseId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("warehouseId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepWarehouseId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("warehouseId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetWarehouseId_NotExistsReferrer_MWebHtInfoList() { return xgetSQueMap("warehouseId_NotExistsReferrer_MWebHtInfoList"); }
    public String keepWarehouseId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, MZoneCQ> xdfgetWarehouseId_NotExistsReferrer_MZoneList() { return xgetSQueMap("warehouseId_NotExistsReferrer_MZoneList"); }
    public String keepWarehouseId_NotExistsReferrer_MZoneList(MZoneCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_MZoneList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetWarehouseId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("warehouseId_NotExistsReferrer_TAllocInstBList"); }
    public String keepWarehouseId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetWarehouseId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("warehouseId_NotExistsReferrer_TInventoryBList"); }
    public String keepWarehouseId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetWarehouseId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("warehouseId_NotExistsReferrer_TMoveInstBList"); }
    public String keepWarehouseId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetWarehouseId_NotExistsReferrer_TReceivePlanBList() { return xgetSQueMap("warehouseId_NotExistsReferrer_TReceivePlanBList"); }
    public String keepWarehouseId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetWarehouseId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("warehouseId_NotExistsReferrer_TShippingInstBList"); }
    public String keepWarehouseId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetWarehouseId_NotExistsReferrer_TStockList() { return xgetSQueMap("warehouseId_NotExistsReferrer_TStockList"); }
    public String keepWarehouseId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_TStockList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetWarehouseId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("warehouseId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepWarehouseId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetWarehouseId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("warehouseId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepWarehouseId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetWarehouseId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("warehouseId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepWarehouseId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetWarehouseId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("warehouseId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepWarehouseId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("warehouseId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_MWebHtInfoList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_MWebHtInfoList", sq); }

    public Map<String, MZoneCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_MZoneList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_MZoneList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_MZoneList(MZoneCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_MZoneList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_TReceivePlanBList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_TReceivePlanBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_TStockList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetWarehouseId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("warehouseId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepWarehouseId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("warehouseId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetWarehouseId_QueryDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepWarehouseId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_MWebHtInfoList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_MWebHtInfoListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepWarehouseId_QueryDerivedReferrer_MWebHtInfoListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_MWebHtInfoList", pm); }

    public Map<String, MZoneCQ> xdfgetWarehouseId_QueryDerivedReferrer_MZoneList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_MZoneList"); }
    public String keepWarehouseId_QueryDerivedReferrer_MZoneList(MZoneCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_MZoneList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_MZoneListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_MZoneList"); }
    public String keepWarehouseId_QueryDerivedReferrer_MZoneListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_MZoneList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetWarehouseId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TInventoryBCQ> xdfgetWarehouseId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetWarehouseId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TReceivePlanBCQ> xdfgetWarehouseId_QueryDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_TReceivePlanBList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_TReceivePlanBListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TReceivePlanBListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_TReceivePlanBList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetWarehouseId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetWarehouseId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_TStockList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_TStockList"); }
    public String keepWarehouseId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetWarehouseId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetWarehouseId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetWarehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetWarehouseId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("warehouseId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("warehouseId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetWarehouseId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("warehouseId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepWarehouseId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("warehouseId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _warehouseNm;
    public ConditionValue xdfgetWarehouseNm()
    { if (_warehouseNm == null) { _warehouseNm = nCV(); }
      return _warehouseNm; }
    protected ConditionValue xgetCValueWarehouseNm() { return xdfgetWarehouseNm(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseNm_Asc() { regOBA("WAREHOUSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseNm_Desc() { regOBD("WAREHOUSE_NM"); return this; }

    protected ConditionValue _warehouseAbbr;
    public ConditionValue xdfgetWarehouseAbbr()
    { if (_warehouseAbbr == null) { _warehouseAbbr = nCV(); }
      return _warehouseAbbr; }
    protected ConditionValue xgetCValueWarehouseAbbr() { return xdfgetWarehouseAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseAbbr_Asc() { regOBA("WAREHOUSE_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_WarehouseAbbr_Desc() { regOBD("WAREHOUSE_ABBR"); return this; }

    protected ConditionValue _foreignFlg;
    public ConditionValue xdfgetForeignFlg()
    { if (_foreignFlg == null) { _foreignFlg = nCV(); }
      return _foreignFlg; }
    protected ConditionValue xgetCValueForeignFlg() { return xdfgetForeignFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGN_FLG: {char(1), FK to B_CLASS_DTL, classification=ForeignFlg}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_ForeignFlg_Asc() { regOBA("FOREIGN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGN_FLG: {char(1), FK to B_CLASS_DTL, classification=ForeignFlg}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_ForeignFlg_Desc() { regOBD("FOREIGN_FLG"); return this; }

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
    public BsMWarehouseCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMWarehouseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMWarehouseCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMWarehouseCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMWarehouseCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMWarehouseCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMWarehouseCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMWarehouseCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMWarehouseCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMWarehouseCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMWarehouseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMWarehouseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MWarehouseCQ bq = (MWarehouseCQ)bqs;
        MWarehouseCQ uq = (MWarehouseCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByForeignFlg()) {
            uq.queryBClassDtlByForeignFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByForeignFlg(), uq.queryBClassDtlByForeignFlg());
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
        String nrp = xresolveNRP("M_WAREHOUSE", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("M_WAREHOUSE", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my FOREIGN_FLG, named 'BClassDtlByForeignFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByForeignFlg() {
        return xdfgetConditionQueryBClassDtlByForeignFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByForeignFlg() {
        String prop = "bClassDtlByForeignFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByForeignFlg()); xsetupOuterJoinBClassDtlByForeignFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByForeignFlg() {
        String nrp = xresolveNRP("M_WAREHOUSE", "bClassDtlByForeignFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByForeignFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByForeignFlg() { xregOutJo("bClassDtlByForeignFlg"); }
    public boolean hasConditionQueryBClassDtlByForeignFlg() { return xhasQueRlMap("bClassDtlByForeignFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MWarehouseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MWarehouseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MWarehouseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MWarehouseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MWarehouseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MWarehouseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MWarehouseCQ> _myselfExistsMap;
    public Map<String, MWarehouseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MWarehouseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MWarehouseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MWarehouseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MWarehouseCB.class.getName(); }
    protected String xCQ() { return MWarehouseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
