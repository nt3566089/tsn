package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_USER_CLIENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_CLIENT_ID
 *
 * [column]
 *     USER_CLIENT_ID, USER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_CLIENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMUserClient {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MUserClient> _selectedList;
    protected BehaviorSelector _selector;
    protected MUserClientBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMUserClient ready(List<MUserClient> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MUserClientBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MUserClientBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
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
    public List<MUserClient> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
