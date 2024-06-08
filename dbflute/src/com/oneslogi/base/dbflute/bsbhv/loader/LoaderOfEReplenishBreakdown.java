package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_REPLENISH_BREAKDOWN as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPLENISH_BREAKDOWN_ID
 *
 * [column]
 *     REPLENISH_BREAKDOWN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, TRANSPORTCD, SHIPCD, SHIPSCHDATA, SUPPLIER_CD, SHIPTOSCHDATA, PRODUCT_CD, QTY, MANUFACTURDATE, DESIGNCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPLENISH_BREAKDOWN_ID
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
public class LoaderOfEReplenishBreakdown {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EReplenishBreakdown> _selectedList;
    protected BehaviorSelector _selector;
    protected EReplenishBreakdownBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEReplenishBreakdown ready(List<EReplenishBreakdown> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EReplenishBreakdownBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EReplenishBreakdownBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EReplenishBreakdown> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
