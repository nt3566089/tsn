package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_LOT as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOT_ID
 *
 * [column]
 *     LOT_ID, PRODUCT_ID, LOT, LOT_SORT, LIMIT_DT, LOT1, LOT2, LOT3, LOT4, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, TRANCEPORT_CD, SOURCE_CD, SOURCE_NM, SCH_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT
 *
 * [referrer table]
 *     T_ALLOC_INST_B, T_ALLOC_LOT, T_INVENTORY_B, T_KEEPING_LOT, T_LAST_LOT, T_MOVE_INST_B, T_SHIPPING_INST_B, T_STOCK, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING_PICKING
 *
 * [foreign property]
 *     mProduct
 *
 * [referrer property]
 *     tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tMoveInstBList, tShippingInstBList, tStockList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingPickingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTLot {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TLot> _selectedList;
    protected BehaviorSelector _selector;
    protected TLotBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTLot ready(List<TLot> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TLotBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TLotBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by LOT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TAllocLot> _referrerTAllocLotList;

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * T_ALLOC_LOT by LOT_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTAllocLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocLot> loadTAllocLotList(ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        myBhv().loadTAllocLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocLotList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocLot().ready(_referrerTAllocLotList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by LOT_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TKeepingLot> _referrerTKeepingLotList;

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * T_KEEPING_LOT by LOT_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTKeepingLot> loadTKeepingLotList(ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        myBhv().loadTKeepingLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTKeepingLotList = refLs);
        return hd -> hd.handle(new LoaderOfTKeepingLot().ready(_referrerTKeepingLotList, _selector));
    }

    protected List<TLastLot> _referrerTLastLotList;

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * T_LAST_LOT by LOT_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTLastLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTLastLot> loadTLastLotList(ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        myBhv().loadTLastLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTLastLotList = refLs);
        return hd -> hd.handle(new LoaderOfTLastLot().ready(_referrerTLastLotList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBList;

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by LOT_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by LOT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
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
     * T_STOCK by LOT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
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
     * W_HT_INVENTORY_INPUT_PROD by LOT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
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
     * W_HT_RECEIVE_INSPECTION by LOT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
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
     * W_HT_RECEIVE_NO_PLAN_INSP by LOT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
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
     * W_HT_RECEIVE_STORE by LOT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveStore> loadWHtReceiveStoreList(ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        myBhv().loadWHtReceiveStoreList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveStoreList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveStore().ready(_referrerWHtReceiveStoreList, _selector));
    }

    protected List<WHtShippingPicking> _referrerWHtShippingPickingList;

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING_PICKING by LOT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">tLotBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tLotList</span>, <span style="color: #553000">lotLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TLot tLot : <span style="color: #553000">tLotList</span>) {
     *     ... = tLot.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLotId_InScope(pkList);
     * cb.query().addOrderBy_LotId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShippingPicking> loadWHtShippingPickingList(ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        myBhv().loadWHtShippingPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShippingPicking().ready(_referrerWHtShippingPickingList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TLot> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
