package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRIMALLOCADJUST as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIMALLOCADJUST_ID
 *
 * [column]
 *     TRIMALLOCADJUST_ID, TRIMALLOCSTOCK_ID, TRIMALLOCSCH_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_NO, ALC_IMP_STKG_NO, ADJUSTED_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCADJUST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRIMALLOCSTOCK, T_TRIMALLOCSCHKRI
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrimallocstock, tTrimallocschkri
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrimallocadjust {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrimallocadjust> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrimallocadjustBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrimallocadjust ready(List<TTrimallocadjust> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrimallocadjustBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrimallocadjustBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrimallocstock _foreignTTrimallocstockLoader;
    public LoaderOfTTrimallocstock pulloutTTrimallocstock() {
        if (_foreignTTrimallocstockLoader == null)
        { _foreignTTrimallocstockLoader = new LoaderOfTTrimallocstock().ready(myBhv().pulloutTTrimallocstock(_selectedList), _selector); }
        return _foreignTTrimallocstockLoader;
    }

    protected LoaderOfTTrimallocschkri _foreignTTrimallocschkriLoader;
    public LoaderOfTTrimallocschkri pulloutTTrimallocschkri() {
        if (_foreignTTrimallocschkriLoader == null)
        { _foreignTTrimallocschkriLoader = new LoaderOfTTrimallocschkri().ready(myBhv().pulloutTTrimallocschkri(_selectedList), _selector); }
        return _foreignTTrimallocschkriLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrimallocadjust> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
