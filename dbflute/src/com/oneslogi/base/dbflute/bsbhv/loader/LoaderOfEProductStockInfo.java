package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRODUCT_STOCK_INFO as TABLE. <br>
 * <pre>
 * [primary key]
 *     E_PRODUCT_STOCK_INFO_ID
 *
 * [column]
 *     E_PRODUCT_STOCK_INFO_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_ID, CLIENT_ID, SEQ, IN_OUT_KBN, CENTER_CD, CENTER_NM, EXECUTE_DATE, PRODUCT_CD, PRODUCT_NM, STOCK_LOCATION, STOCK_LOCATION_NM, MANUFACTURE_DATE, DESIGN_KBN, LOCATION_CD, TRANSPORT_CD, FIRM_CARRY_NO, SOURCE_CD, SOURCE_NM, SCH_DATE, RCV_DATE, P_TDAY_TOTAL_DIFF_QTY, P_QTY, P_INVENTORY_NUM, P_YDAY_TOTAL_DIFF_QTY, P_TDAY_DIFF_QTY, SL_YDAY_TOTAL_DIFF_QTY, SL_TDAY_DIFF_QTY, QTY, INVENTORY_NUM, USER_USE4, LOT_ATRB1_TITLE, USER_NUM4, USER_NUM3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_PRODUCT_STOCK_INFO_ID
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
public class LoaderOfEProductStockInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EProductStockInfo> _selectedList;
    protected BehaviorSelector _selector;
    protected EProductStockInfoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEProductStockInfo ready(List<EProductStockInfo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EProductStockInfoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EProductStockInfoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EProductStockInfo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
