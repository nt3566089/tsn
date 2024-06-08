package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRCASEINVENTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRCASEINVENTORY_ID
 *
 * [column]
 *     TRCASEINVENTORY_ID, CASEINVENTORYNO, CASECD, INVENTORYKEY, INVENTORY_B_ID, CASEINVQTY, DEFECTIVENUM, TOTALSORTEDNUM, SORTEDDIFNUM, INVENTORYDATETIME, TRACECREATESTS, ACTFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASEINVENTORY_ID
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
public class LoaderOfTTrcaseinventory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrcaseinventory> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrcaseinventoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrcaseinventory ready(List<TTrcaseinventory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrcaseinventoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrcaseinventoryBhv.class); return _myBhv; } }

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
    public List<TTrcaseinventory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
