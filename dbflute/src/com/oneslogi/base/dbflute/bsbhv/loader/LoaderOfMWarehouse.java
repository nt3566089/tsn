package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_WAREHOUSE as TABLE. <br>
 * <pre>
 * [primary key]
 *     WAREHOUSE_ID
 *
 * [column]
 *     WAREHOUSE_ID, CENTER_ID, WAREHOUSE_CD, WAREHOUSE_NM, WAREHOUSE_ABBR, FOREIGN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WAREHOUSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_WEB_HT_INFO, M_ZONE, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_RECEIVE_PLAN_B, T_SHIPPING_INST_B, T_STOCK, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE
 *
 * [foreign property]
 *     mCenter, bClassDtlByDelFlg, bClassDtlByForeignFlg
 *
 * [referrer property]
 *     mWebHtInfoList, mZoneList, tAllocInstBList, tInventoryBList, tMoveInstBList, tReceivePlanBList, tShippingInstBList, tStockList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMWarehouse {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWarehouse> _selectedList;
    protected BehaviorSelector _selector;
    protected MWarehouseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWarehouse ready(List<MWarehouse> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWarehouseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWarehouseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MWebHtInfo> _referrerMWebHtInfoList;

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by WAREHOUSE_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWebHtInfo> loadMWebHtInfoList(ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        myBhv().loadMWebHtInfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWebHtInfoList = refLs);
        return hd -> hd.handle(new LoaderOfMWebHtInfo().ready(_referrerMWebHtInfoList, _selector));
    }

    protected List<MZone> _referrerMZoneList;

    /**
     * Load referrer of MZoneList by the set-upper of referrer. <br>
     * M_ZONE by WAREHOUSE_ID, named 'MZoneList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadMZoneList</span>(<span style="color: #553000">zoneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">zoneCB</span>.setupSelect...
     *         <span style="color: #553000">zoneCB</span>.query().set...
     *         <span style="color: #553000">zoneCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">zoneLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    zoneLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getMZoneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMZone> loadMZoneList(ConditionBeanSetupper<MZoneCB> refCBLambda) {
        myBhv().loadMZoneList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMZoneList = refLs);
        return hd -> hd.handle(new LoaderOfMZone().ready(_referrerMZoneList, _selector));
    }

    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by WAREHOUSE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by WAREHOUSE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBList;

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by WAREHOUSE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBList, _selector));
    }

    protected List<TReceivePlanB> _referrerTReceivePlanBList;

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_PlanWarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanB> loadTReceivePlanBList(ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        myBhv().loadTReceivePlanBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanBList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanB().ready(_referrerTReceivePlanBList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by WAREHOUSE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    protected List<TStock> _referrerTStockList;

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by WAREHOUSE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by WAREHOUSE_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtInventoryInputProd> loadWHtInventoryInputProdList(ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        myBhv().loadWHtInventoryInputProdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtInventoryInputProdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtInventoryInputProd().ready(_referrerWHtInventoryInputProdList, _selector));
    }

    protected List<WHtReceiveInspection> _referrerWHtReceiveInspectionList;

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by WAREHOUSE_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveInspection> loadWHtReceiveInspectionList(ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        myBhv().loadWHtReceiveInspectionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveInspectionList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveInspection().ready(_referrerWHtReceiveInspectionList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspList;

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspList, _selector));
    }

    protected List<WHtReceiveStore> _referrerWHtReceiveStoreList;

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by WAREHOUSE_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">warehouseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveStore> loadWHtReceiveStoreList(ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        myBhv().loadWHtReceiveStoreList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveStoreList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveStore().ready(_referrerWHtReceiveStoreList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByForeignFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByForeignFlg() {
        if (_foreignBClassDtlByForeignFlgLoader == null)
        { _foreignBClassDtlByForeignFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByForeignFlg(_selectedList), _selector); }
        return _foreignBClassDtlByForeignFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWarehouse> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
