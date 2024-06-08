package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRFLEXIBILACCEPTPLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRFLEXIBILACCEPTPLAN_ID
 *
 * [column]
 *     TRFLEXIBILACCEPTPLAN_ID, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, PRODUCT_ID, QTY, VA_EXTDATA1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILACCEPTPLAN_ID
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
public class LoaderOfTTrflexibilacceptplan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrflexibilacceptplan> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrflexibilacceptplanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrflexibilacceptplan ready(List<TTrflexibilacceptplan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrflexibilacceptplanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrflexibilacceptplanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrflexibilacceptplan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
