package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSODETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     SODETAILID
 *
 * [column]
 *     SODETAILID, SOID, SOLINENO, ORDERLINENO, OWNERORDERLINENO, CUSTORDERLINENO, ORIGINALPOLINENO, PRODUCT_ID, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, STOCK_TYPE_CD, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, XDOCKQTY1, ALLOCQTY1, PICKEDQTY1, SORTEDQTY1, INSPECTEDQTY1, SHIPPEDQTY1, ADJUSTQTY1, PRICE1, PRICE2, PRICE3, NOTES, LOTRESERVEFLG, PICKQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SODETAILID
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
public class LoaderOfTTrsodetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsodetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsodetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsodetail ready(List<TTrsodetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsodetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsodetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsodetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
