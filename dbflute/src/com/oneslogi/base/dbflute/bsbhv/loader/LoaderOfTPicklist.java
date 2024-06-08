package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_PICKLIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     T_PICKLIST_ID
 *
 * [column]
 *     T_PICKLIST_ID, PICKLISTKEY, WORKALLOCATEID, FLOOR, LISTKBN, LOCATION_ID, LOT_ID, PRODUCT_ID, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, NOSHIPPINGFLG, PICKSCHDATE, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, PICKEDQTY1, PICKEDQTY2, PICKEDQTY3, SORTRECIEVEDQTY1, SORTRECIEVEDQTY2, SORTRECIEVEDQTY3, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_PICKLIST_ID
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
public class LoaderOfTPicklist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPicklist> _selectedList;
    protected BehaviorSelector _selector;
    protected TPicklistBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPicklist ready(List<TPicklist> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPicklistBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPicklistBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPicklist> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
