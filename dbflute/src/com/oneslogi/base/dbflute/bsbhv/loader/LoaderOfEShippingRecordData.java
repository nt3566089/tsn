package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIPPING_RECORD_DATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_RECORD_DATA_ID
 *
 * [column]
 *     SHIPPING_RECORD_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, DATA_FLG, RECORD_DATA, TRANSPORTCD, ITEMCD_H, ORDERNO_H, CASEQTY, FRACTQTY, SHIPTOCD, FACTORYCD, ITEMCD_M, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO_M, MACHINENO, CREATENO, LIMITDATE, CASELOT4, DISTRIBUTIONCD, PALLETID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_DATA_ID
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
public class LoaderOfEShippingRecordData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShippingRecordData> _selectedList;
    protected BehaviorSelector _selector;
    protected EShippingRecordDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShippingRecordData ready(List<EShippingRecordData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShippingRecordDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShippingRecordDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShippingRecordData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
