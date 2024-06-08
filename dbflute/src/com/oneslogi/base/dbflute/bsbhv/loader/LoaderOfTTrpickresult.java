package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRPICKRESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_DETAIL_ID
 *
 * [column]
 *     PICKING_DETAIL_ID, WORKALLOCATEID, FLOOR, LISTKBN, LOCATION_ID, LOT_ID, PALLET_ID, CENTER_SYMBOL_ID, PICKEDQTY1, SORTEDQTY1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_DETAIL_ID
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
public class LoaderOfTTrpickresult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpickresult> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpickresultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpickresult ready(List<TTrpickresult> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpickresultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpickresultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpickresult> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
