package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CLIENT_CENTER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_CENTER_ID
 *
 * [column]
 *     CLIENT_CENTER_ID, CLIENT_ID, CENTER_ID, SYSTEM_DT, BATCH_PROGRESS_FLG, BEFORE_SYSTEM_DT, CUSTOMER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_CUSTOMER, B_CLASS_DTL(ByBatchProgressFlg), M_PARAM(AsOne)
 *
 * [referrer table]
 *     M_PARAM
 *
 * [foreign property]
 *     mCenter, mClient, mCustomer, bClassDtlByBatchProgressFlg, bClassDtlByDelFlg, mParamAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMClientCenter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MClientCenter> _selectedList;
    protected BehaviorSelector _selector;
    protected MClientCenterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMClientCenter ready(List<MClientCenter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MClientCenterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MClientCenterBhv.class); return _myBhv; } }

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

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByBatchProgressFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByBatchProgressFlg() {
        if (_foreignBClassDtlByBatchProgressFlgLoader == null)
        { _foreignBClassDtlByBatchProgressFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByBatchProgressFlg(_selectedList), _selector); }
        return _foreignBClassDtlByBatchProgressFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfMParam _foreignMParamAsOneLoader;
    public LoaderOfMParam pulloutMParamAsOne() {
        if (_foreignMParamAsOneLoader == null)
        { _foreignMParamAsOneLoader = new LoaderOfMParam().ready(myBhv().pulloutMParamAsOne(_selectedList), _selector); }
        return _foreignMParamAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MClientCenter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
