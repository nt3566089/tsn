package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_STOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, SHAPE_ID, STORE_NO_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, COMPANYCD, LOGICFLG1, LOGICFLG2, LOGICFLG3, TAGCD, QTY2AVG, QTY3AVG, QTY1INSTRUCTED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CUSTOMER, M_LOCATION, T_LOT, M_PRODUCT, M_SHAPE, M_STOCK_TYPE, T_STORE_NO, M_WAREHOUSE, T_STOCK_REPORT(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_B, T_PALLET, T_PICKING_B, T_STOCK_INOUT, T_TRIMALLOCSTOCK, T_TRPICKDETAIL, T_STOCK_REPORT
 *
 * [foreign property]
 *     mClient, mCustomer, mLocation, tLot, mProduct, mShape, mStockType, tStoreNo, mWarehouse, tStockReportAsOne
 *
 * [referrer property]
 *     tInventoryBList, tPalletList, tPickingBList, tStockInoutList, tTrimallocstockList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStock> _selectedList;
    protected BehaviorSelector _selector;
    protected TStockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStock ready(List<TStock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TPallet> _referrerTPalletList;

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by STOCK_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">palletCB</span>.setupSelect...
     *         <span style="color: #553000">palletCB</span>.query().set...
     *         <span style="color: #553000">palletCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">palletLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    palletLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTPalletList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPallet> loadTPalletList(ConditionBeanSetupper<TPalletCB> refCBLambda) {
        myBhv().loadTPalletList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPalletList = refLs);
        return hd -> hd.handle(new LoaderOfTPallet().ready(_referrerTPalletList, _selector));
    }

    protected List<TPickingB> _referrerTPickingBList;

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by STOCK_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingB> loadTPickingBList(ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        myBhv().loadTPickingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingB().ready(_referrerTPickingBList, _selector));
    }

    protected List<TStockInout> _referrerTStockInoutList;

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockInout> loadTStockInoutList(ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        myBhv().loadTStockInoutList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockInoutList = refLs);
        return hd -> hd.handle(new LoaderOfTStockInout().ready(_referrerTStockInoutList, _selector));
    }

    protected List<TTrimallocstock> _referrerTTrimallocstockList;

    /**
     * Load referrer of TTrimallocstockList by the set-upper of referrer. <br>
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTTrimallocstockList</span>(<span style="color: #553000">trimallocstockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trimallocstockCB</span>.setupSelect...
     *         <span style="color: #553000">trimallocstockCB</span>.query().set...
     *         <span style="color: #553000">trimallocstockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trimallocstockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trimallocstockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTTrimallocstockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrimallocstock> loadTTrimallocstockList(ConditionBeanSetupper<TTrimallocstockCB> refCBLambda) {
        myBhv().loadTTrimallocstockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrimallocstockList = refLs);
        return hd -> hd.handle(new LoaderOfTTrimallocstock().ready(_referrerTTrimallocstockList, _selector));
    }

    protected List<TTrpickdetail> _referrerTTrpickdetailList;

    /**
     * Load referrer of TTrpickdetailList by the set-upper of referrer. <br>
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTTrpickdetailList</span>(<span style="color: #553000">trpickdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trpickdetailCB</span>.setupSelect...
     *         <span style="color: #553000">trpickdetailCB</span>.query().set...
     *         <span style="color: #553000">trpickdetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trpickdetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trpickdetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTTrpickdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrpickdetail> loadTTrpickdetailList(ConditionBeanSetupper<TTrpickdetailCB> refCBLambda) {
        myBhv().loadTTrpickdetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrpickdetailList = refLs);
        return hd -> hd.handle(new LoaderOfTTrpickdetail().ready(_referrerTTrpickdetailList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfTStockReport _foreignTStockReportAsOneLoader;
    public LoaderOfTStockReport pulloutTStockReportAsOne() {
        if (_foreignTStockReportAsOneLoader == null)
        { _foreignTStockReportAsOneLoader = new LoaderOfTStockReport().ready(myBhv().pulloutTStockReportAsOne(_selectedList), _selector); }
        return _foreignTStockReportAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
