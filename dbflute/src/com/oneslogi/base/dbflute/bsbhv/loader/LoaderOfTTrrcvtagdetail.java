package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRRCVTAGDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRRCVTAGDETAIL_ID
 *
 * [column]
 *     TRRCVTAGDETAIL_ID, RCVTAGKEY, ACCEPTKEY, ACCEPTLINENO, RCVKEY, RCVLINENO, STS, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOGISTICSCD, WAREHOUSECD, SLOTFLG, TOLOCCD, LOCCD, LOTKEY, TAGCD, ODDSFLG, INSTRUCTQTY1, INSTRUCTQTY2, INSTRUCTQTY3, LOADQTY1, LOADQTY2, LOADQTY3, LABELPRINTEDFLG, NOTES, SOKEY, SOLINENO, TRIGGERTYPE, PROSPECTFLG, PROSPECTUPDATEFLG, SLOTTYPE, SLOTTEDUSERCD, XDOCKORDERKEY, PICKKEY, FULLPALLETKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVTAGDETAIL_ID
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
public class LoaderOfTTrrcvtagdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrcvtagdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrcvtagdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrcvtagdetail ready(List<TTrrcvtagdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrcvtagdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrcvtagdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrcvtagdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
