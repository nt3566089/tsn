package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_STORE_WORK_INFO_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_WORK_INFO_SEND_ID
 *
 * [column]
 *     STORE_WORK_INFO_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, WarehouseGroup, SUPPLIERRCVNO, WAREHOUSE_CD, RECEIVE_PLAN_DT, OTHERREFNO1, CARRIERNO, PRODUCT_CD, LOT3, LOT4, LOT1, FROMFAX, LOT2, CARRIERSNAME, FOREIGNCARGOFLG, CARRIERWBNO, FROMPHONE, RCVKEY, EXPECTQTY1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_WORK_INFO_SEND_ID
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
public class LoaderOfEStoreWorkInfoSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EStoreWorkInfoSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EStoreWorkInfoSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEStoreWorkInfoSend ready(List<EStoreWorkInfoSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EStoreWorkInfoSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EStoreWorkInfoSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EStoreWorkInfoSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
