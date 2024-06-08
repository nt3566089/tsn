package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRRCVPLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRRCVPLAN_ID
 *
 * [column]
 *     TRRCVPLAN_ID, RECEIVE_PLAN_H_ID, RCVLINENO, RCVPLANSTS, PRODUCT_CD, LOT1, LOT3, LOT4, LOT2, WAREHOUSECD, TOLOCCD, TRRCVQTY1, RCVINNO, PRINTEDFLG, LOADQTY1, RECEIVEDQTY1, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVPLAN_ID
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
public class LoaderOfTTrrcvplan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrcvplan> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrcvplanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrcvplan ready(List<TTrrcvplan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrcvplanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrcvplanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrcvplan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
