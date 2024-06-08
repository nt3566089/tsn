package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_TRALLINV as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRALLINV_ID
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, TAG_TYPE, INOUTKBN, PRODUCT_ID, QTY1, QTY2, QTY3, QTY4, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRALLINV_ID
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
public class LoaderOfWTrallinv {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WTrallinv> _selectedList;
    protected BehaviorSelector _selector;
    protected WTrallinvBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWTrallinv ready(List<WTrallinv> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WTrallinvBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WTrallinvBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WTrallinv> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
