package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_ALLOC_LOT as TABLE. <br>
 * <pre>
 * [primary key]
 *     ALLOC_INST_B_ID
 *
 * [column]
 *     ALLOC_INST_B_ID, CUSTOMER_ID, PRODUCT_ID, LOT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_LOT, M_PRODUCT, T_ALLOC_INST_B, M_CUSTOMER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tLot, mProduct, tAllocInstB, mCustomer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTAllocLot {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TAllocLot> _selectedList;
    protected BehaviorSelector _selector;
    protected TAllocLotBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTAllocLot ready(List<TAllocLot> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TAllocLotBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TAllocLotBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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

    protected LoaderOfTAllocInstB _foreignTAllocInstBLoader;
    public LoaderOfTAllocInstB pulloutTAllocInstB() {
        if (_foreignTAllocInstBLoader == null)
        { _foreignTAllocInstBLoader = new LoaderOfTAllocInstB().ready(myBhv().pulloutTAllocInstB(_selectedList), _selector); }
        return _foreignTAllocInstBLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TAllocLot> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
