package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_HT_SERIAL_RECEIVE_INSP as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_SERIAL_RECEIVE_INSP_ID
 *
 * [column]
 *     HT_SERIAL_RECEIVE_INSP_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, RECEIVE_SLIP_NO, CUSTOMER_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, SERIAL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_SERIAL_RECEIVE_INSP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CUSTOMER, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCustomer, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWHtSerialReceiveInsp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WHtSerialReceiveInsp> _selectedList;
    protected BehaviorSelector _selector;
    protected WHtSerialReceiveInspBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWHtSerialReceiveInsp ready(List<WHtSerialReceiveInsp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WHtSerialReceiveInspBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WHtSerialReceiveInspBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WHtSerialReceiveInsp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
