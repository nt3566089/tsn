package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSORCVDIRECT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SoRcvDirectKey, InstructionsDate, OwnerDirectNo, SalesType, SalesTypeCd, ShipToCode, OriginalPONo, PRODUCT_ID, ExpectQty, PlanPrice, PlanPriceTotal, PlanName, PlanPost, PlanAddress1, PlanAddress2, PlanItemName, WareHousePlant, WareHousePlantName, WareHouseName, OrderDate, DeliveryDate, PurchaseNumber, OrderNumber, ItemLineNo, SkuCode, CardBoard, CarTon, TotalExpectQty, TotalCardBoardQty, TotalCarTonQty, Note, Reserve2, Reserve3, Reserve, CenterId, ClientId, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
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
public class LoaderOfTTrsorcvdirect {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsorcvdirect> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsorcvdirectBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsorcvdirect ready(List<TTrsorcvdirect> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsorcvdirectBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsorcvdirectBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsorcvdirect> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
