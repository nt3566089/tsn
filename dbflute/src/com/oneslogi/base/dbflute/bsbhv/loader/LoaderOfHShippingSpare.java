package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_SHIPPING_SPARE as TABLE. <br>
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
 *     H_SHIPPING_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hShippingB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHShippingSpare {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HShippingSpare> _selectedList;
    protected BehaviorSelector _selector;
    protected HShippingSpareBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHShippingSpare ready(List<HShippingSpare> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HShippingSpareBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HShippingSpareBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHShippingB _foreignHShippingBLoader;
    public LoaderOfHShippingB pulloutHShippingB() {
        if (_foreignHShippingBLoader == null)
        { _foreignHShippingBLoader = new LoaderOfHShippingB().ready(myBhv().pulloutHShippingB(_selectedList), _selector); }
        return _foreignHShippingBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HShippingSpare> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
