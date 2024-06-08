package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_PACKING_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_B_ID
 *
 * [column]
 *     PACKING_B_ID, PACKING_H_ID, SHIPPING_INST_B_ID, STOCK_ID, PACKING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_PACKING_H, H_SHIPPING_B, H_STOCK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hPackingH, hShippingB, hStock
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHPackingB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HPackingB> _selectedList;
    protected BehaviorSelector _selector;
    protected HPackingBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHPackingB ready(List<HPackingB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HPackingBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HPackingBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHPackingH _foreignHPackingHLoader;
    public LoaderOfHPackingH pulloutHPackingH() {
        if (_foreignHPackingHLoader == null)
        { _foreignHPackingHLoader = new LoaderOfHPackingH().ready(myBhv().pulloutHPackingH(_selectedList), _selector); }
        return _foreignHPackingHLoader;
    }

    protected LoaderOfHShippingB _foreignHShippingBLoader;
    public LoaderOfHShippingB pulloutHShippingB() {
        if (_foreignHShippingBLoader == null)
        { _foreignHShippingBLoader = new LoaderOfHShippingB().ready(myBhv().pulloutHShippingB(_selectedList), _selector); }
        return _foreignHShippingBLoader;
    }

    protected LoaderOfHStock _foreignHStockLoader;
    public LoaderOfHStock pulloutHStock() {
        if (_foreignHStockLoader == null)
        { _foreignHStockLoader = new LoaderOfHStock().ready(myBhv().pulloutHStock(_selectedList), _selector); }
        return _foreignHStockLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HPackingB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
