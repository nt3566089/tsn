package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRODUCT_TRACKING_DOMES as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_TRACKING_DOMES_ID
 *
 * [column]
 *     PRODUCT_TRACKING_DOMES_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, USERNUM1, ITEM_ADMIN, TRACEKEY, WAREHOUSECD, FACTORYCD, PRODUCT_CD, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINEMO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, ITEMCD_WH, DESIGNCD, INV_NUM, SORT_NUM, ADOPT_NUM, DT_EXTDATA2, RESERVEAREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_TRACKING_DOMES_ID
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
public class LoaderOfEProductTrackingDomes {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EProductTrackingDomes> _selectedList;
    protected BehaviorSelector _selector;
    protected EProductTrackingDomesBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEProductTrackingDomes ready(List<EProductTrackingDomes> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EProductTrackingDomesBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EProductTrackingDomesBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EProductTrackingDomes> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
