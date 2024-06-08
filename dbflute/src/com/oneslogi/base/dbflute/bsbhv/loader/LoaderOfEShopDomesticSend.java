package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHOP_DOMESTIC_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHOP_DOMESTIC_SEND_ID
 *
 * [column]
 *     SHOP_DOMESTIC_SEND_ID, SEND_CD, SEND_ROW_CD, WORK_FLG, USERNUM1, TRACEKEY, WAREHOUSECD, WAREHOUSENAME, FACTORYCD, FACTORYNAME, PRODUCT_CD, ITEMNAME, SKUCD, RECEIVECD, PRODUCTMARK, ORDERNO, PRINTERNO, MAKENO, LOT4, MAKETIME, TRANSPORTCD, DISTRIBUTIONCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, TRACETYPENAME, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, DISTWAREHOUSENAME, INV_NUM, SORT_NUM, ADOPT_NUM, WH_ITEMCD, WH_ITEMNAME, WH_DESIGNCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOP_DOMESTIC_SEND_ID
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
public class LoaderOfEShopDomesticSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShopDomesticSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EShopDomesticSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShopDomesticSend ready(List<EShopDomesticSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShopDomesticSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShopDomesticSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShopDomesticSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
