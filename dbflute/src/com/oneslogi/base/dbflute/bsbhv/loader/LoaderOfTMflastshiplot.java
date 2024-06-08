package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_MFLASTSHIPLOT as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFLASTSHIPLOT_ID
 *
 * [column]
 *     MFLASTSHIPLOT_ID, CUSTOMER_CD, PRODUCT_ID, LOT5, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFLASTSHIPLOT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTMflastshiplot {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TMflastshiplot> _selectedList;
    protected BehaviorSelector _selector;
    protected TMflastshiplotBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTMflastshiplot ready(List<TMflastshiplot> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TMflastshiplotBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TMflastshiplotBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TMflastshiplot> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
