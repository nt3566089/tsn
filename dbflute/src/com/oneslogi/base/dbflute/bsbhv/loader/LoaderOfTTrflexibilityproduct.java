package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRFLEXIBILITYPRODUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRFLEXIBILITYPRODUCT_ID
 *
 * [column]
 *     TRFLEXIBILITYPRODUCT_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, OWNERCD, INSTRACTDATETIME, RCVMAKEFLG, REFLINENO, PRODUCT_CD, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, CASEINFOFLG, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, OPERATIONNUM, RCVKEY, FIRMCARRYNO, BATJPRODUCTIONYM, COMETODATE, RECEIVEDATE, CARDBOARDNO, RCVPALLETNO, TAXPALLETNO, ITEMCD_IN, ITEMCD_WH, DESIGNCD_IN, DESIGNCD_WH, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILITYPRODUCT_ID
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
public class LoaderOfTTrflexibilityproduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrflexibilityproduct> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrflexibilityproductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrflexibilityproduct ready(List<TTrflexibilityproduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrflexibilityproductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrflexibilityproductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrflexibilityproduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
