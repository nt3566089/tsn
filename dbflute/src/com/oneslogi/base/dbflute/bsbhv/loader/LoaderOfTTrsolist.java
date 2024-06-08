package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSOLIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_LIST_PRINT_ID
 *
 * [column]
 *     SHIPPING_LIST_PRINT_ID, TRSOLISTKEY, LISTKBN, PRINTEDFLG, TRSOLISTSTS, PRINTDATETIME, SHIPSCHDATE, WORKALLOCATEID, RMANO, OWNERSONO, SHIPTOCD, ITEMCD, SOID, SODETAILID, SOPALLETNO, FLOOR, PICKING_INST_ID, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_LIST_PRINT_ID
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
public class LoaderOfTTrsolist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsolist> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsolistBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsolist ready(List<TTrsolist> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsolistBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsolistBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsolist> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
