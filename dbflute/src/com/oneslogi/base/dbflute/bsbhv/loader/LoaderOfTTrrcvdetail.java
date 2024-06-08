package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRRCVDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, RCVLINENO, SUPPLIERRCVLINENO, XDOCFLG, POKEY, POLINENO, POTYPE, OWNERPOLINENO, ORIGINALPONO, ORIGINALPOLINENO, PODATE, OWNERCD, ITEMADMIN, PRODUCT_CD, ITEMCD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, RECEIVEDQTY1, RECEIVEDQTY2, RECEIVEDQTY3, ADJUSTQTY1, ADJUSTQTY2, ADJUSTQTY3, RCVTAGQTY1, XDOCFREEQTY1, INSPECTEDQTY1, INSPECTEDQTY2, INSPECTEDQTY3, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, NOTES, ICDATE, ORDERKEY, ORDERLINENO, OWNERORDERNO, OWNERORDERLINENO, CUSTORDERNO, CUSTORDERLINENO, ORDERTYPE, RCVQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, MOVELINENO, ASSYLINENO, PRODUCELINENO, CHECKLASTLOTFLG, TRPALLET_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRRCV, T_RECEIVE_PLAN_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrrcv, tReceivePlanB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrrcvdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrcvdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrcvdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrcvdetail ready(List<TTrrcvdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrcvdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrcvdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrrcv _foreignTTrrcvLoader;
    public LoaderOfTTrrcv pulloutTTrrcv() {
        if (_foreignTTrrcvLoader == null)
        { _foreignTTrrcvLoader = new LoaderOfTTrrcv().ready(myBhv().pulloutTTrrcv(_selectedList), _selector); }
        return _foreignTTrrcvLoader;
    }

    protected LoaderOfTReceivePlanB _foreignTReceivePlanBLoader;
    public LoaderOfTReceivePlanB pulloutTReceivePlanB() {
        if (_foreignTReceivePlanBLoader == null)
        { _foreignTReceivePlanBLoader = new LoaderOfTReceivePlanB().ready(myBhv().pulloutTReceivePlanB(_selectedList), _selector); }
        return _foreignTReceivePlanBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrcvdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
