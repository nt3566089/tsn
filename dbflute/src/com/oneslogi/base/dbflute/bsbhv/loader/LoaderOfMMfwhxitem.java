package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_MFWHxITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFWH_ITEM_ID
 *
 * [column]
 *     MFWH_ITEM_ID, CLIENT_ID, CENTER_ID, PRODUCT_CD, SLOTLOCNAME, PICKLOCNAME, PHYSICALTYPE, PHYSICALCYCLE, PHYSICALGROUP, PHYSICALDATE, REORDERTYPE, REORDERINTERVAL, REORDERPOINT, REORDERQTY, REORDERLEADTIME, REORDERLASTDAY, SUPPLIERCD, REPLENISHPOINT, MAXQTY, CAUSELOC, SHIPPINGTYPE, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, PROCESSWORKINGKEY, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, SERIALFLG, FULLPALLETFLG, PLSLOTLOCNAME, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFWH_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT, M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMMfwhxitem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MMfwhxitem> _selectedList;
    protected BehaviorSelector _selector;
    protected MMfwhxitemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMMfwhxitem ready(List<MMfwhxitem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MMfwhxitemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MMfwhxitemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
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
    public List<MMfwhxitem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
