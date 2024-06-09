package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_PICKING_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_B_ID
 *
 * [column]
 *     PICKING_B_ID, PICKING_H_ID, SHIPPING_INST_B_ID, ALLOC_INST_B_ID, STOCK_ID, PICKING_NUM, TEMP_NO, TRANSIT_NUM, SHAPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_B, T_PICKING_H, M_SHAPE, T_SHIPPING_INST_B, T_STOCK
 *
 * [referrer table]
 *     T_PACKING_B
 *
 * [foreign property]
 *     tAllocInstB, tPickingH, mShape, tShippingInstB, tStock
 *
 * [referrer property]
 *     tPackingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPickingB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPickingB> _selectedList;
    protected BehaviorSelector _selector;
    protected TPickingBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPickingB ready(List<TPickingB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPickingBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPickingBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPackingB> _referrerTPackingBList;

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by PICKING_B_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPickingBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPickingB tPickingB : <span style="color: #553000">tPickingBList</span>) {
     *     ... = tPickingB.<span style="color: #CC4747">getTPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingBId_InScope(pkList);
     * cb.query().addOrderBy_PickingBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingB> loadTPackingBList(ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        myBhv().loadTPackingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingB().ready(_referrerTPackingBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTAllocInstB _foreignTAllocInstBLoader;
    public LoaderOfTAllocInstB pulloutTAllocInstB() {
        if (_foreignTAllocInstBLoader == null)
        { _foreignTAllocInstBLoader = new LoaderOfTAllocInstB().ready(myBhv().pulloutTAllocInstB(_selectedList), _selector); }
        return _foreignTAllocInstBLoader;
    }

    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfTShippingInstB _foreignTShippingInstBLoader;
    public LoaderOfTShippingInstB pulloutTShippingInstB() {
        if (_foreignTShippingInstBLoader == null)
        { _foreignTShippingInstBLoader = new LoaderOfTShippingInstB().ready(myBhv().pulloutTShippingInstB(_selectedList), _selector); }
        return _foreignTShippingInstBLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPickingB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
