package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRIFDTLTRANS as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIFDTLTRANS_ID
 *
 * [column]
 *     TRIFDTLTRANS_ID, REFNO, REFLINENO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, PRODUCT_CD, QTY, PRODUCTIONYM, DESIGNCD, QANO, RCVPALLETNO, FIRMCARRYNO, BATJPRODUCTIONYM, SUBWAREHOUSECD, RESULTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIFDTLTRANS_ID
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
public class LoaderOfTTrifdtltrans {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrifdtltrans> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrifdtltransBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrifdtltrans ready(List<TTrifdtltrans> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrifdtltransBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrifdtltransBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrifdtltrans> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
