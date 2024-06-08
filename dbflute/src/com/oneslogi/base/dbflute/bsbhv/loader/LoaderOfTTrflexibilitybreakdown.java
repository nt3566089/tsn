package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRFLEXIBILITYBREAKDOWN as TABLE. <br>
 * <pre>
 * [primary key]
 *     FLEXIBLE_BREAKDOWN_INFO_ID
 *
 * [column]
 *     FLEXIBLE_BREAKDOWN_INFO_ID, BREAKDOWNKEY, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, PRODUCT_ID, QTY, MANUFACTUREDATE, DESIGNCD, VA_EXTDATA1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_BREAKDOWN_INFO_ID
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
public class LoaderOfTTrflexibilitybreakdown {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrflexibilitybreakdown> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrflexibilitybreakdownBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrflexibilitybreakdown ready(List<TTrflexibilitybreakdown> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrflexibilitybreakdownBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrflexibilitybreakdownBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrflexibilitybreakdown> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
