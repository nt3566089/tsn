package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRRCVEXTEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, SBWAREHOUSECD, IINO, RCVSCHDATE, CARRIERNO, WAREHOUSECD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, LOT2, EXPECTQTY1, FROMFAX, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, FROMREFNAME, CARRIERNAME, CUSTORDERNO, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, BATNO, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_TRRCV
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrrcv
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrrcvextend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrcvextend> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrcvextendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrcvextend ready(List<TTrrcvextend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrcvextendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrcvextendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrrcv _foreignTTrrcvLoader;
    public LoaderOfTTrrcv pulloutTTrrcv() {
        if (_foreignTTrrcvLoader == null)
        { _foreignTTrrcvLoader = new LoaderOfTTrrcv().ready(myBhv().pulloutTTrrcv(_selectedList), _selector); }
        return _foreignTTrrcvLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrcvextend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
