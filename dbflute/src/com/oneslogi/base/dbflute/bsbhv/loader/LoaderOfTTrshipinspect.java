package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSHIPINSPECT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INSPECTION_ID
 *
 * [column]
 *     SHIPPING_INSPECTION_ID, SHIPINSPECTKEY, PICKING_INST_DETAIL_ID, TAGCD, ROOTPACKKEY, PACKKEY, SHIPPING_INSPECTION_REMAINING_ID, SOID, SODETAILID, DELIVERYGROUPKEY, WBKEY, WAREHOUSECD, PRODUCT_ID, LOT_ID, INSPECTEDQTY1, INSPECTUSERCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INSPECTION_ID
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
public class LoaderOfTTrshipinspect {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrshipinspect> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrshipinspectBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrshipinspect ready(List<TTrshipinspect> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrshipinspectBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrshipinspectBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrshipinspect> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
