package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SERIAL_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SERIAL_INPUT_ID
 *
 * [column]
 *     SERIAL_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PROCESS_TYPE, PRODUCT_CD, SERIAL_NO, SUPPLIER_CD, SUPPLIER_NM, RECEIVE_SLIP_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, PICKING_WORK_NO, WORK_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SERIAL_INPUT_ID
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
public class LoaderOfESerialInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ESerialInput> _selectedList;
    protected BehaviorSelector _selector;
    protected ESerialInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfESerialInput ready(List<ESerialInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ESerialInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ESerialInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ESerialInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
