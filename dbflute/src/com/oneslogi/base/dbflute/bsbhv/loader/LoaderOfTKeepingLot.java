package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_KEEPING_LOT as TABLE. <br>
 * <pre>
 * [primary key]
 *     KEEPING_LOT_ID
 *
 * [column]
 *     KEEPING_LOT_ID, CUSTOMER_ID, PRODUCT_ID, LOT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     KEEPING_LOT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, M_PRODUCT, T_LOT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, mProduct, tLot
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTKeepingLot {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TKeepingLot> _selectedList;
    protected BehaviorSelector _selector;
    protected TKeepingLotBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTKeepingLot ready(List<TKeepingLot> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TKeepingLotBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TKeepingLotBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TKeepingLot> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
