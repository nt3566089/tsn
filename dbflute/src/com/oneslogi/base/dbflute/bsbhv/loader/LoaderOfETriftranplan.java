package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_TRIFTRANPLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     UJTYPE, RECNO
 *
 * [column]
 *     UJTYPE, RECNO, WAREHOUSECD, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, DATATYPE, PRODUCT_CD, QTY, SUBWAREHOUSECD, RESULTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfETriftranplan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ETriftranplan> _selectedList;
    protected BehaviorSelector _selector;
    protected ETriftranplanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfETriftranplan ready(List<ETriftranplan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ETriftranplanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ETriftranplanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ETriftranplan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}