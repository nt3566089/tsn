package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_SHIPPING_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SHIPPING_INST_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, WAREHOUSE_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, STOCK_TYPE_ID, LOCATION_ID, LOCATION_CD, LOCATION_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, SHAPE_NM, UNIT_NUM, INST_NUM, SHIPPING_NUM, UNIT_PRICE, PRICE, TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_SHIPPING_H, M_STOCK_TYPE, H_SHIPPING_SPARE(AsOne)
 *
 * [referrer table]
 *     H_PACKING_B, H_SHIPPING_SPARE
 *
 * [foreign property]
 *     hShippingH, mStockType, hShippingSpareAsOne
 *
 * [referrer property]
 *     hPackingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHShippingB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HShippingB> _selectedList;
    protected BehaviorSelector _selector;
    protected HShippingBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHShippingB ready(List<HShippingB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HShippingBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HShippingBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HPackingB> _referrerHPackingBList;

    /**
     * Load referrer of HPackingBList by the set-upper of referrer. <br>
     * H_PACKING_B by SHIPPING_INST_B_ID, named 'HPackingBList'.
     * <pre>
     * <span style="color: #0000C0">hShippingBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hShippingBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadHPackingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HShippingB hShippingB : <span style="color: #553000">hShippingBList</span>) {
     *     ... = hShippingB.<span style="color: #CC4747">getHPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstBId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHPackingB> loadHPackingBList(ConditionBeanSetupper<HPackingBCB> refCBLambda) {
        myBhv().loadHPackingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHPackingBList = refLs);
        return hd -> hd.handle(new LoaderOfHPackingB().ready(_referrerHPackingBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHShippingH _foreignHShippingHLoader;
    public LoaderOfHShippingH pulloutHShippingH() {
        if (_foreignHShippingHLoader == null)
        { _foreignHShippingHLoader = new LoaderOfHShippingH().ready(myBhv().pulloutHShippingH(_selectedList), _selector); }
        return _foreignHShippingHLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfHShippingSpare _foreignHShippingSpareAsOneLoader;
    public LoaderOfHShippingSpare pulloutHShippingSpareAsOne() {
        if (_foreignHShippingSpareAsOneLoader == null)
        { _foreignHShippingSpareAsOneLoader = new LoaderOfHShippingSpare().ready(myBhv().pulloutHShippingSpareAsOne(_selectedList), _selector); }
        return _foreignHShippingSpareAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HShippingB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
