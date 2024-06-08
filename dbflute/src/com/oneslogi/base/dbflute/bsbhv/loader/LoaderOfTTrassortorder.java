package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRASSORTORDER as TABLE. <br>
 * <pre>
 * [primary key]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO
 *
 * [column]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO, ACTFLG, WAREHOUSECD, RCVDATE, SHIPORDER, RANGESTART, RANGEEND, DPWAREHOUSECD, DELIVERYDATE, ITEMCD, LINECD, SOTEDUNIT, ASSORTEDORDER, DELIVERYSEQNO, DELIVERYBRANCHNO, CASENO, CASESERIAL, SOTEDLOC, PRODUCT_CD, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, SROPRTCNT, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DIRECTIONORDERKEY
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
public class LoaderOfTTrassortorder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrassortorder> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrassortorderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrassortorder ready(List<TTrassortorder> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrassortorderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrassortorderBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrassortorder> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
