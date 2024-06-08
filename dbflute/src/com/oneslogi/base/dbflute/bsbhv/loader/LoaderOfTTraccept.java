package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRACCEPT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRACCEPT_ID
 *
 * [column]
 *     TRACCEPT_ID, PREKEY, ACCEPTTYPE, ACCEPTGROUP, NOTES, LOGISTICSCD, WAREHOUSECD, LOCCD, INSPECTEDUSERCD, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, ACTUALTIME, COMPLETETIME, ACCEPTLINETOTAL, TAGLABELPRINTFLG, RECEIVE_PLAN_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACCEPT_ID
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
public class LoaderOfTTraccept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTraccept> _selectedList;
    protected BehaviorSelector _selector;
    protected TTracceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTraccept ready(List<TTraccept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTracceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTracceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTraccept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
