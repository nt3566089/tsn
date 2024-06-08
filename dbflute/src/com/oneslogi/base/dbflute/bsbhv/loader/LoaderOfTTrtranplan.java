package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRTRANPLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRTRANPLAN_ID
 *
 * [column]
 *     TRTRANPLAN_ID, SHIPTOCD, REFNO, PRODUCT_CD, WAREHOUSECD, SHIPCD, SHIPSCHDATE, SHIPTOSCHDATE, DATATYPE, QTY, SUBWAREHOUSECD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRTRANPLAN_ID
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
public class LoaderOfTTrtranplan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrtranplan> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrtranplanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrtranplan ready(List<TTrtranplan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrtranplanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrtranplanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrtranplan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
