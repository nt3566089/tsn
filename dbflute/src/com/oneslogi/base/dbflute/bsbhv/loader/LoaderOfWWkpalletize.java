package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKPALLETIZE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SEQNO, SYMBOLNO
 *
 * [column]
 *     SEQNO, SYMBOLNO, PRODUCT_CD, ANAME, LOT3, LOT1, LOT4, LOT2, RESTQTY, PALLETNO, LOCCD, LOTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfWWkpalletize {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkpalletize> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkpalletizeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkpalletize ready(List<WWkpalletize> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkpalletizeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkpalletizeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkpalletize> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
