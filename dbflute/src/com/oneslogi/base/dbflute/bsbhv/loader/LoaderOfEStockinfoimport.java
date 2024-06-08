package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_STOCKINFOIMPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SEQNO, ADDDATETIME, WAREHOUSECD, WAREHOUSE_SNAME, PRODUCT_CD, ITEM_NAME, LIMITDATE, DESIGN_CD, OTHERLOT1, ADDRESS3, QTY1, REFNO, FIRMCARRYNO, MANUFACTURECD, SOURCE_CD, SOURCE_NAME, SHIPSCHDATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_ORDERBY, USETYPE, LOCGROUP, LOCGROUPNAME, OTHERREFNO1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_STOCK_INFO_SEND_ID
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
public class LoaderOfEStockinfoimport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EStockinfoimport> _selectedList;
    protected BehaviorSelector _selector;
    protected EStockinfoimportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEStockinfoimport ready(List<EStockinfoimport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EStockinfoimportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EStockinfoimportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EStockinfoimport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
