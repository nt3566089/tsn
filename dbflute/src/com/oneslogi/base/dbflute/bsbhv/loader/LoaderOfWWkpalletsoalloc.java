package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKPALLETSOALLOC as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKPALLETSOALLOC_ID
 *
 * [column]
 *     WKPALLETSOALLOC_ID, TRPALLET_ID, PALLETNO, LOT_ID, RECEIVE_PLAN_H_ID, RCVLINENO, PRINTEDFLG, PRINTINGDATE, FIRMCARRYNO, TRANSPORTNO, SOURCECD, SCHDATE, RECEIVECD, RCVDATE, RECEIVEDATE, LOCATION_ID, PRODUCT_CD, LOT3, LIMITDATE, BATARTICLESIGN, OTHERLOT1, RECEIVEQTYCASE, RECEIVEQTYBOWL, RECEIVEQTY, RESTQTYCASE, RESTQTYBOWL, RESTQTY, ALLOCQTY1, TEMPALLOCQTYCASE, TEMPALLOCQTYBOWL, FULLPALLETFLG, PALLETSTS, PLURALPRODUCTIONKBN, PALLETCUTTINGKBN, RCVPALLETNO, PALLETADDFLG, ACCEPTUSERCD, ACCEPTDATE, CLIENT_ID, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKPALLETSOALLOC_ID
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
public class LoaderOfWWkpalletsoalloc {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkpalletsoalloc> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkpalletsoallocBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkpalletsoalloc ready(List<WWkpalletsoalloc> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkpalletsoallocBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkpalletsoallocBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkpalletsoalloc> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
