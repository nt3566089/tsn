package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_BTRPICKDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_INST_DETAIL_ID
 *
 * [column]
 *     PICKING_INST_DETAIL_ID, PICKING_INST_ID, PICKBATCHLINENO, SOID, SODETAILID, STS, PRODUCT_ID, IF_PRODUCT_ID, LOT_ID, LOCATION_ID, LOCGROUP, LOCTYPE, PICKTYPE, ALLOCTYPE, TAGCD, ACTUALTAGCD, FROM_LOCATION_ID, FROMTAGCD, TO_LOCATION_ID, TOTAGCD, EXPECTQTY1, PICKEDQTY1, PALLETTYPE, SORTEDQTY1, SHIPPEDQTY1, RCVKEY, RCVLINENO, PICKUSERCD, LOTRESERVEFLG, LABELPRINTEDFLG, ALLOCSTYLETYPE, FULLPALLETKEY, PICKINGUNIT, WORKALLOCATEID, WORKALLOCATENAME, ALERTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_DETAIL_ID
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
public class LoaderOfTBtrpickdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBtrpickdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TBtrpickdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBtrpickdetail ready(List<TBtrpickdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBtrpickdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBtrpickdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBtrpickdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
