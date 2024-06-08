package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRDIRECTREST as TABLE. <br>
 * <pre>
 * [primary key]
 *     WAREHOUSECD, STOCKDATE, RECNO
 *
 * [column]
 *     WAREHOUSECD, STOCKDATE, RECNO, SOTEDUNIT, ZONE, ASSORTEDORDER, SOTEDLOC, PRODUCT_CD, DELIVERYDATE, DPWAREHOUSECD, DIRECTIONCD, PISTONTYPE, COMT, SROPRTCNT, CSROPRTCNT, CUTTOPDIRASSORD, STOCKCASESU, STOCKCARTONSU, SELLSHOPCNT, LINECD, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfTTrdirectrest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrdirectrest> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrdirectrestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrdirectrest ready(List<TTrdirectrest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrdirectrestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrdirectrestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrdirectrest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
