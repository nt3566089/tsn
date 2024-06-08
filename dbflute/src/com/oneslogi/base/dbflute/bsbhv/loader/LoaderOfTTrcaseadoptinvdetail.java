package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRCASEADOPTINVDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     T_TRCASEADOPTINVDETAIL_ID
 *
 * [column]
 *     T_TRCASEADOPTINVDETAIL_ID, CENTER_ID, CLIENT_ID, INVENTORY_KEY, INVENTORY_B_ID, PRODUCT_CD, QR_DATA, CASE_INV_QTY, MANUFACTURE_DATE, DESIGN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_TRCASEADOPTINVDETAIL_ID
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
public class LoaderOfTTrcaseadoptinvdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrcaseadoptinvdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrcaseadoptinvdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrcaseadoptinvdetail ready(List<TTrcaseadoptinvdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrcaseadoptinvdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrcaseadoptinvdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrcaseadoptinvdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
