package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKRECEIVEPLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     W_WKRECEIVEPLAN_ID
 *
 * [column]
 *     W_WKRECEIVEPLAN_ID, PRINTKEY, LINE_NO, RECEIVE_PLAN_H_ID, RCVLINENO, WAREHOUSECD, WAREHOUSE_SNAME, SLOTLOCNAME, RCVSCHDATE, RECEIVE_LOT4, RECEIVE_LOT3, LOCATION_CD, CASEQTY_CAPACITY, FLOOR, FROMFAX, FROMPHONE, SUPPLIERRCVNO, PRODUCT_CD, ITEMNAME, ZONE, EXPECTQTY, RCVPAL, RCVCASE, LOT1, LOT4, LOT3, QTYCASE, QTYBOWL, QTYPAL, INOUTKBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfWWkreceiveplan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkreceiveplan> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkreceiveplanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkreceiveplan ready(List<WWkreceiveplan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkreceiveplanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkreceiveplanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkreceiveplan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
