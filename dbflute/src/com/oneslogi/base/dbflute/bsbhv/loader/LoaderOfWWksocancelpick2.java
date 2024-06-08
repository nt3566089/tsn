package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKSOCANCELPICK2 as TABLE. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     PRINTKEY, WAREHOUSECD, WAREHOUSE_SNAME, PICKEDDATE, WORKALLOCATEID, FLOOR, LOCCD, PRODUCT_CD, ITEM_SNAME, LOT1, LOT4, LOT3, PICKEDQTY_C, PICKEDQTY_B, PICKEDQTY_P, PICKEDQTY_C2, USERNUM3, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfWWksocancelpick2 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWksocancelpick2> _selectedList;
    protected BehaviorSelector _selector;
    protected WWksocancelpick2Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWksocancelpick2 ready(List<WWksocancelpick2> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWksocancelpick2Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWksocancelpick2Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWksocancelpick2> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
