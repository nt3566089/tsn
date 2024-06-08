package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKREKAKUNOU as TABLE. <br>
 * <pre>
 * [primary key]
 *     REKAKUNOU_ID
 *
 * [column]
 *     REKAKUNOU_ID, CENTER_ID, CLIENT_ID, REKAKUNOUKEY, REKAKUNOULINENO, PALLETSYMBOLKEY, PALLETKEY, SOJTKEY, SOJTLINENO, OWNERSONO, SOPALLETNO, RCVKEY, TRSYMBOL_ID, SORTEDQTY1, LOT_ID, PACKEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REKAKUNOU_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWWkrekakunou {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkrekakunou> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkrekakunouBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkrekakunou ready(List<WWkrekakunou> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkrekakunouBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkrekakunouBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkrekakunou> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
