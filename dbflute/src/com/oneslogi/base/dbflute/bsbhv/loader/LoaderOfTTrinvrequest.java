package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRINVREQUEST as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRINVREQUEST_ID
 *
 * [column]
 *     TRINVREQUEST_ID, INVINQKEY, QUESTLINENO, INVINQNO, INVINQDATE, COMPANYCD, PRODUCT_CD, STS, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVREQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrinvrequest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrinvrequest> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrinvrequestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrinvrequest ready(List<TTrinvrequest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrinvrequestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrinvrequestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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
    public List<TTrinvrequest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
