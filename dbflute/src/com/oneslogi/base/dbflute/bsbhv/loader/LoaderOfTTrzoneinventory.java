package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRZONEINVENTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRZONEINVENTORYKEY, WAREHOUSECD, FLOOR, ZONE
 *
 * [column]
 *     TRZONEINVENTORYKEY, WAREHOUSECD, FLOOR, ZONE, PALLETCAPACITY, PALLETSPACE, ZONEINVFLG, QTY1ALLOCATED, RCVQTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfTTrzoneinventory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrzoneinventory> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrzoneinventoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrzoneinventory ready(List<TTrzoneinventory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrzoneinventoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrzoneinventoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrzoneinventory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
