package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRIMALLOCSTOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIMALLOCSTOCK_ID
 *
 * [column]
 *     TRIMALLOCSTOCK_ID, TRIMALLOC_H_ID, STOCK_ID, ALLOC_IMP_KEY, ALC_IMP_STKG_NO, LOCATION_CD, DESIGN_FLG, MANUFACTUREDATE, MONTH_FLG, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSTOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STOCK
 *
 * [referrer table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign property]
 *     tStock
 *
 * [referrer property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrimallocstock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrimallocstock> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrimallocstockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrimallocstock ready(List<TTrimallocstock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrimallocstockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrimallocstockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrimallocadjust> _referrerTTrimallocadjustList;

    /**
     * Load referrer of TTrimallocadjustList by the set-upper of referrer. <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrimallocstockList</span>, <span style="color: #553000">trimallocstockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocstockLoader</span>.<span style="color: #CC4747">loadTTrimallocadjustList</span>(<span style="color: #553000">trimallocadjustCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trimallocadjustCB</span>.setupSelect...
     *         <span style="color: #553000">trimallocadjustCB</span>.query().set...
     *         <span style="color: #553000">trimallocadjustCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trimallocadjustLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trimallocadjustLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrimallocstock tTrimallocstock : <span style="color: #553000">tTrimallocstockList</span>) {
     *     ... = tTrimallocstock.<span style="color: #CC4747">getTTrimallocadjustList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocstockId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocstockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrimallocadjust> loadTTrimallocadjustList(ConditionBeanSetupper<TTrimallocadjustCB> refCBLambda) {
        myBhv().loadTTrimallocadjustList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrimallocadjustList = refLs);
        return hd -> hd.handle(new LoaderOfTTrimallocadjust().ready(_referrerTTrimallocadjustList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrimallocstock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
