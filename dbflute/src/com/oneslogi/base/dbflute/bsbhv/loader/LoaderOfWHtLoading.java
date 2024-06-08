package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_HT_LOADING as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_LOADING_ID
 *
 * [column]
 *     HT_LOADING_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, PACKING_H_ID, CARRIER_TRACE_NUM, SHIPPING_PACKING_NO, DELIVERY_COURSE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_LOADING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_DELIVERY_COURSE, M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mDeliveryCourse, mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWHtLoading {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WHtLoading> _selectedList;
    protected BehaviorSelector _selector;
    protected WHtLoadingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWHtLoading ready(List<WHtLoading> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WHtLoadingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WHtLoadingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMDeliveryCourse _foreignMDeliveryCourseLoader;
    public LoaderOfMDeliveryCourse pulloutMDeliveryCourse() {
        if (_foreignMDeliveryCourseLoader == null)
        { _foreignMDeliveryCourseLoader = new LoaderOfMDeliveryCourse().ready(myBhv().pulloutMDeliveryCourse(_selectedList), _selector); }
        return _foreignMDeliveryCourseLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WHtLoading> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
