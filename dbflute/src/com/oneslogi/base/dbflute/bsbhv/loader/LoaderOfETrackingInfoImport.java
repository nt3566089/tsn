package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_TRACKING_INFO_IMPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRACKING_INFO_IMPORT_ID
 *
 * [column]
 *     TRACKING_INFO_IMPORT_ID, SYMBOLPOSKEY, WAREHOUSECD, WAREHOUSE_SNAME, FACTORY_SNAME, FACTORYCD, ITEMCD_CASE, ITEM_SNAME_CASE, ITEMCD_WH, ITEM_SNAME_WH, RCVKEY, MACHINENO, CREATENO, LIMITDATENOW, DESIGNCD_CASE, LOT1, MANUFACTURECD, OTHERLOT1, CASECREATETYPE, CASECREATETYPE_NM, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, INITNUM, MIXEDFLG, LENDFLG, LOCGROUP, LOCCD, SHIPDATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, ADDDATETIME, TRACETYPE, OTHERCD1, EXAMSTS, CASEINNUMBOWL, SHIPNUMBOWL, SUPPLIERRCVNO, TOKUHANCD, TOKUHAN_NM, MAKERCASENO, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACKING_INFO_IMPORT_ID
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
public class LoaderOfETrackingInfoImport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ETrackingInfoImport> _selectedList;
    protected BehaviorSelector _selector;
    protected ETrackingInfoImportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfETrackingInfoImport ready(List<ETrackingInfoImport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ETrackingInfoImportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ETrackingInfoImportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ETrackingInfoImport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
