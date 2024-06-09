package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_STOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WAREHOUSE_ID, WAREHOUSE_CD, WAREHOUSE_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, STOCK_TYPE_ID, ZONE_ID, ZONE_CD, ZONE_NM, LOCATION_ID, LOCATION_CD, LOCATION_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, DEPOSIT_ABBR, LOT_ID, LOT, LIMIT_DT, SHAPE_ID, STORE_NO_ID, STORE_LABEL_NO, OLD_STORE_NUM_ID, OLD_STORE_LABEL_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, SUPPLIER_ABBR, STORE_DT, UNIT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_SHAPE, M_STOCK_TYPE
 *
 * [referrer table]
 *     H_INVENTORY_B, H_MOVE_B, H_PACKING_B, H_RECEIVE_B, H_STOCK_INOUT, H_STOCK_REPORT
 *
 * [foreign property]
 *     mShape, mStockType
 *
 * [referrer property]
 *     hInventoryBList, hMoveBList, hPackingBList, hReceiveBList, hStockInoutList, hStockReportList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HStock> _selectedList;
    protected BehaviorSelector _selector;
    protected HStockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHStock ready(List<HStock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HStockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HStockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HInventoryB> _referrerHInventoryBList;

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHInventoryBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHInventoryB> loadHInventoryBList(ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        myBhv().loadHInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfHInventoryB().ready(_referrerHInventoryBList, _selector));
    }

    protected List<HMoveB> _referrerHMoveBList;

    /**
     * Load referrer of HMoveBList by the set-upper of referrer. <br>
     * H_MOVE_B by STOCK_ID, named 'HMoveBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadHMoveBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHMoveBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHMoveB> loadHMoveBList(ConditionBeanSetupper<HMoveBCB> refCBLambda) {
        myBhv().loadHMoveBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHMoveBList = refLs);
        return hd -> hd.handle(new LoaderOfHMoveB().ready(_referrerHMoveBList, _selector));
    }

    protected List<HPackingB> _referrerHPackingBList;

    /**
     * Load referrer of HPackingBList by the set-upper of referrer. <br>
     * H_PACKING_B by STOCK_ID, named 'HPackingBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadHPackingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHPackingBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHPackingB> loadHPackingBList(ConditionBeanSetupper<HPackingBCB> refCBLambda) {
        myBhv().loadHPackingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHPackingBList = refLs);
        return hd -> hd.handle(new LoaderOfHPackingB().ready(_referrerHPackingBList, _selector));
    }

    protected List<HReceiveB> _referrerHReceiveBList;

    /**
     * Load referrer of HReceiveBList by the set-upper of referrer. <br>
     * H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadHReceiveBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHReceiveBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHReceiveB> loadHReceiveBList(ConditionBeanSetupper<HReceiveBCB> refCBLambda) {
        myBhv().loadHReceiveBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHReceiveBList = refLs);
        return hd -> hd.handle(new LoaderOfHReceiveB().ready(_referrerHReceiveBList, _selector));
    }

    protected List<HStockInout> _referrerHStockInoutList;

    /**
     * Load referrer of HStockInoutList by the set-upper of referrer. <br>
     * H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadHStockInoutList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHStockInoutList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHStockInout> loadHStockInoutList(ConditionBeanSetupper<HStockInoutCB> refCBLambda) {
        myBhv().loadHStockInoutList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHStockInoutList = refLs);
        return hd -> hd.handle(new LoaderOfHStockInout().ready(_referrerHStockInoutList, _selector));
    }

    protected List<HStockReport> _referrerHStockReportList;

    /**
     * Load referrer of HStockReportList by the set-upper of referrer. <br>
     * H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadHStockReportList</span>(<span style="color: #553000">reportCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">reportCB</span>.setupSelect...
     *         <span style="color: #553000">reportCB</span>.query().set...
     *         <span style="color: #553000">reportCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">reportLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    reportLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHStockReportList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHStockReport> loadHStockReportList(ConditionBeanSetupper<HStockReportCB> refCBLambda) {
        myBhv().loadHStockReportList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHStockReportList = refLs);
        return hd -> hd.handle(new LoaderOfHStockReport().ready(_referrerHStockReportList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HStock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
