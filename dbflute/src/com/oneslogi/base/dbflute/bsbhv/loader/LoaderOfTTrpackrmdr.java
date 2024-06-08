package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRPACKRMDR as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_REMAINING_ID
 *
 * [column]
 *     PACKING_REMAINING_ID, PACKRMDRKEY, PICKING_INST_DETAIL_ID, TAGCD, SOKEY, SOLINENO, ACTFLG, DELIVERYGROUPKEY, WBKEY, WAREHOUSECD, OWNERCD, ITEMADMIN, PRODUCT_CD, LOTKEY, PACKEDQTY1, PACKEDQTY2, PACKEDQTY3, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_REMAINING_ID
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
public class LoaderOfTTrpackrmdr {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpackrmdr> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpackrmdrBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpackrmdr ready(List<TTrpackrmdr> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpackrmdrBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpackrmdrBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpackrmdr> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
