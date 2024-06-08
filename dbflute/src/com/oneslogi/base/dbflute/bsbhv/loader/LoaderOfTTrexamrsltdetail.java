package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TREXAMRSLTDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TREXAMRSLTDETAIL_ID
 *
 * [column]
 *     TREXAMRSLTDETAIL_ID, TREXAMRESULT_ID, EXAMLINENO, ZAIKOINV_ID, ZAIKOINV, EXAMQTY, RES40QTY1, RES40QTY2, INFERIORQTY, AFTZAIKOINV_ID, AFTZAIKOINV, RESERVATIONFLG, EXAMDETAILSTS, EXAMDATE, NOTEXAMQTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TREXAMRSLTDETAIL_ID
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
public class LoaderOfTTrexamrsltdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrexamrsltdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrexamrsltdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrexamrsltdetail ready(List<TTrexamrsltdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrexamrsltdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrexamrsltdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrexamrsltdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
