package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSYMBOLTRACE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSYMBOLTRACE_ID
 *
 * [column]
 *     TRSYMBOLTRACE_ID, SYMBOLTRACEKEY, TRSYMBOL_ID, CREATEDATETIME, WAREHOUSECD, TRACETYPE, INITNUM, CASEINNUM, ASSORTNUM, DIRECTIONNUM, CUSTOMERCD, DISTWAREHOUSECD, MIXEDFLG, LOCCD, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, NOSHIPPINGFLG, IFITEMCD, SENDFLG, RCVKEY, PALLETNO, SOKEY, FAX1, ORIGINALPONO, MOSJTSENDFLG, SHIPDATE, DELIVNAME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOLTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrsymboltrace {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsymboltrace> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsymboltraceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsymboltrace ready(List<TTrsymboltrace> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsymboltraceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsymboltraceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsymboltrace> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
