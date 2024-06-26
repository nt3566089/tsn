package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_MFRCVITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     RCVITEM_ID
 *
 * [column]
 *     RCVITEM_ID, CLIENT_ID, RCVITEMKEY, ITEMCD_FROM, DESIGNCD_FROM, ITEMCD_TO, DESIGNCD_TO, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, ITEM_NM_FROM, ITEM_NM_TO, FCFLG, USERNUM3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RCVITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMMfrcvitem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MMfrcvitem> _selectedList;
    protected BehaviorSelector _selector;
    protected MMfrcvitemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMMfrcvitem ready(List<MMfrcvitem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MMfrcvitemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MMfrcvitemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MMfrcvitem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
