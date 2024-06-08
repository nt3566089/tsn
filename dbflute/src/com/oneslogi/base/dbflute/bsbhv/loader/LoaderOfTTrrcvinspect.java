package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRRCVINSPECT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRRCVINSPECT_ID
 *
 * [column]
 *     TRRCVINSPECT_ID, ACCEPTKEY, RCVKEY, RCVLINENO, INSPECTUSERCD, INSPECTEDQTY1, INSPECTEDQTY2, INSPECTEDQTY3, INSTRUCTQTY1, INSTRUCTQTY2, INSTRUCTQTY3, WAREHOUSECD, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOTKEY, NOTES, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVINSPECT_ID
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
public class LoaderOfTTrrcvinspect {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrcvinspect> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrcvinspectBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrcvinspect ready(List<TTrrcvinspect> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrcvinspectBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrcvinspectBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrcvinspect> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
