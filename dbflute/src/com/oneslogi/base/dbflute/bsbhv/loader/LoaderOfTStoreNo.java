package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_STORE_NO as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_NO_ID
 *
 * [column]
 *     STORE_NO_ID, STORE_LABEL_NO, OLD_STORE_NUM_ID, SUPPLIER_ID, STORE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_NO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STORE_NO, M_CUSTOMER, T_STORE_NO_R(AsOne)
 *
 * [referrer table]
 *     T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_SHIPPING_INST_B, T_STOCK, T_STORE_NO, T_STORE_NO_R
 *
 * [foreign property]
 *     tStoreNoSelf, mCustomer, tStoreNoRAsOne
 *
 * [referrer property]
 *     tAllocInstBList, tInventoryBList, tMoveInstBList, tShippingInstBList, tStockList, tStoreNoSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStoreNo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStoreNo> _selectedList;
    protected BehaviorSelector _selector;
    protected TStoreNoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStoreNo ready(List<TStoreNo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStoreNoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStoreNoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by STORE_NO_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
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
     * T_INVENTORY_B by STORE_NO_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
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
     * T_MOVE_INST_B by STORE_NO_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
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
     * T_SHIPPING_INST_B by STORE_NO_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
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
     * T_STOCK by STORE_NO_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<TStoreNo> _referrerTStoreNoSelfList;

    /**
     * Load referrer of TStoreNoSelfList by the set-upper of referrer. <br>
     * T_STORE_NO by OLD_STORE_NUM_ID, named 'TStoreNoSelfList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noLoader</span>.<span style="color: #CC4747">loadTStoreNoSelfList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTStoreNoSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldStoreNumId_InScope(pkList);
     * cb.query().addOrderBy_OldStoreNumId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreNo> loadTStoreNoSelfList(ConditionBeanSetupper<TStoreNoCB> refCBLambda) {
        myBhv().loadTStoreNoSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreNoSelfList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreNo().ready(_referrerTStoreNoSelfList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTStoreNo _foreignTStoreNoSelfLoader;
    public LoaderOfTStoreNo pulloutTStoreNoSelf() {
        if (_foreignTStoreNoSelfLoader == null)
        { _foreignTStoreNoSelfLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNoSelf(_selectedList), _selector); }
        return _foreignTStoreNoSelfLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfTStoreNoR _foreignTStoreNoRAsOneLoader;
    public LoaderOfTStoreNoR pulloutTStoreNoRAsOne() {
        if (_foreignTStoreNoRAsOneLoader == null)
        { _foreignTStoreNoRAsOneLoader = new LoaderOfTStoreNoR().ready(myBhv().pulloutTStoreNoRAsOne(_selectedList), _selector); }
        return _foreignTStoreNoRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStoreNo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
