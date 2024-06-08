package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSHIPINSPECTRMDR as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INSPECTION_REMAINING_ID
 *
 * [column]
 *     SHIPPING_INSPECTION_REMAINING_ID, SHIPINSPECTRMDRKEY, PICKING_INST_DETAIL_ID, TAGCD, ROOTPACKKEY, PACKKEY, SOID, SODETAILID, DELIVERYGROUPKEY, WBKEY, WAREHOUSECD, PRODUCT_ID, LOT_ID, INSPECTEDQTY1, EXPECTQTY1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INSPECTION_REMAINING_ID
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
public class LoaderOfTTrshipinspectrmdr {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrshipinspectrmdr> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrshipinspectrmdrBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrshipinspectrmdr ready(List<TTrshipinspectrmdr> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrshipinspectrmdrBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrshipinspectrmdrBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrshipinspectrmdr> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
