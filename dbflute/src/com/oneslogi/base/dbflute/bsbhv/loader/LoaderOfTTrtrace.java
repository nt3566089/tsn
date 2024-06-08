package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRTRACE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRTRACE_ID
 *
 * [column]
 *     TRTRACE_ID, TRACEKEY, SNDRCVDATETIME, WAREHOUSECD, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, PRODUCT_CD, ITEMCD_IN, ITEMCD_WH, DESIGNCD_CASE, DESIGNCD_IN, DESIGNCD_WH, SOURCECASECD, SENDFLG, FROMFLG, SUPPLIERRCVNO, MIXEDFLG, SYMBOLPASTDATE, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, MAKERCASENO, LENDFLG, CASEINNUMCALC, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, OTHERREFNO2, ORDERTYPE, LIMITDATENOW, CASECREATETYPE, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, LOCGROUP, LOCCD, SHIPDATE, SHIPTOCD, EXAMSTS, TOKUHANCD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, RESERVEAREA, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, DT_EXTDATA2, PALLET_NO, PICK_LIST_KEY, FRONT_BACK_CASE_CD, CENTER_ID, CLIENT_ID, TRANSPORT_PRIORITY, USE_TYPE, OUTPUT_ORDER, FACTORY_ORDER, WAREHOUSE_ORDER, LINEBLOCK_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrtrace {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrtrace> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrtraceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrtrace ready(List<TTrtrace> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrtraceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrtraceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrtrace> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
