package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKRCVREVERSE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO
 *
 * [column]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO, WAREHOUSECD, WAREHOUSENAME, TRANSPORTNO, RCVSCHDATE, SUPPLIERCD, SUPPLIERNAME, PRODUCT_CD, ITEMNAME, RCVLIMITDATE, RCVDESIGNCD, RCVQTY, WORKDATETIME, LOC, LOCCD, LIMITDAY, DESIGNCD, QTYCASE, QTYBOWL, FLG, INSIDE_OUTSIDE_KBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfWWkrcvreverse {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkrcvreverse> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkrcvreverseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkrcvreverse ready(List<WWkrcvreverse> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkrcvreverseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkrcvreverseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkrcvreverse> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
