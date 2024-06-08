package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRFLEXIBILITYDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID, FLEXIBLE_TRANSPORT_INFO_ID, FLEXIBITYLINENO, PRODUCT_ID, STDDIFFLG, FLEXPICKLISTNO, PRINTEDFLG, COMPLETEFLG, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, HTQTYCASE, HTQTYBOWL, NV_EXTDATA1, CENTER_ID, CLIENT_ID, SOID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRFLEXIBILITY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrflexibility
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrflexibilitydetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrflexibilitydetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrflexibilitydetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrflexibilitydetail ready(List<TTrflexibilitydetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrflexibilitydetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrflexibilitydetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrflexibility _foreignTTrflexibilityLoader;
    public LoaderOfTTrflexibility pulloutTTrflexibility() {
        if (_foreignTTrflexibilityLoader == null)
        { _foreignTTrflexibilityLoader = new LoaderOfTTrflexibility().ready(myBhv().pulloutTTrflexibility(_selectedList), _selector); }
        return _foreignTTrflexibilityLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrflexibilitydetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
