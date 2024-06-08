package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKFLEXPICK as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZIP_INPUT_ID
 *
 * [column]
 *     ZIP_INPUT_ID, PrintKey, FlexibityNo, FlexPickListNo, FlexPickListLNo, WarehouseCd, WarehouseName, ShipCd, Ship_Name, SchDate, TransportCd, PRODUCT_CD, Item_Name, ManufacturDate, DesignCd, QtyCase, QtyBowl, RootOutSeq, UserNum1, UserNum3, VA_ExtData1, VA_ExtData2, VA_ExtData3, NV_ExtData1, NV_ExtData2, NV_ExtData3, NM_ExtData1, NM_ExtData2, NM_ExtData3, DT_ExtData1, DT_ExtData2, DT_ExtData3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_INPUT_ID
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
public class LoaderOfWWkflexpick {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkflexpick> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkflexpickBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkflexpick ready(List<WWkflexpick> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkflexpickBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkflexpickBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkflexpick> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
