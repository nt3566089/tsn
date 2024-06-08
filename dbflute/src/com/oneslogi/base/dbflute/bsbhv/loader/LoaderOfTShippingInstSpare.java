package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_SHIPPING_INST_SPARE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_SHIPPING_INST_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingInstB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstSpare {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstSpare> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstSpareBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstSpare ready(List<TShippingInstSpare> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstSpareBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstSpareBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTShippingInstB _foreignTShippingInstBLoader;
    public LoaderOfTShippingInstB pulloutTShippingInstB() {
        if (_foreignTShippingInstBLoader == null)
        { _foreignTShippingInstBLoader = new LoaderOfTShippingInstB().ready(myBhv().pulloutTShippingInstB(_selectedList), _selector); }
        return _foreignTShippingInstBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstSpare> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}