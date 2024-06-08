package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CARRIER_BOX as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_BOX_ID
 *
 * [column]
 *     CARRIER_BOX_ID, CARRIER_ID, BOX_ID, BOX_SIZE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_BOX_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CARRIER, M_BOX
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCarrier, mBox
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierBox {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierBox> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierBoxBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierBox ready(List<MCarrierBox> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierBoxBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierBoxBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCarrier _foreignMCarrierLoader;
    public LoaderOfMCarrier pulloutMCarrier() {
        if (_foreignMCarrierLoader == null)
        { _foreignMCarrierLoader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrier(_selectedList), _selector); }
        return _foreignMCarrierLoader;
    }

    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierBox> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
