package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRIMALLOC_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIMALLOC_H_ID
 *
 * [column]
 *     TRIMALLOC_H_ID, ALLOC_IMP_KEY, WAREHOUSECD, PRODUCT_CD, SHIPSCH_DATE, PICK_BATCH_KEY, RESTOCK_FLG, PRIORITIES, PICKADJUST_STS, ALCIMRSN_FLG, QTY_ADJUST_FLG, CENTER_ID, CLIENT_ID, RCV_STKEXA_DATE, STOCK_SHORTAGE_QTY, STOCK_SUM_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOC_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_TRIMALLOCSCHKRI
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tTrimallocschkriList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrimallocH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrimallocH> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrimallocHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrimallocH ready(List<TTrimallocH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrimallocHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrimallocHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrimallocschkri> _referrerTTrimallocschkriList;

    /**
     * Load referrer of TTrimallocschkriList by the set-upper of referrer. <br>
     * T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrimallocHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTTrimallocschkriList</span>(<span style="color: #553000">trimallocschkriCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trimallocschkriCB</span>.setupSelect...
     *         <span style="color: #553000">trimallocschkriCB</span>.query().set...
     *         <span style="color: #553000">trimallocschkriCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trimallocschkriLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trimallocschkriLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrimallocH tTrimallocH : <span style="color: #553000">tTrimallocHList</span>) {
     *     ... = tTrimallocH.<span style="color: #CC4747">getTTrimallocschkriList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocHId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrimallocschkri> loadTTrimallocschkriList(ConditionBeanSetupper<TTrimallocschkriCB> refCBLambda) {
        myBhv().loadTTrimallocschkriList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrimallocschkriList = refLs);
        return hd -> hd.handle(new LoaderOfTTrimallocschkri().ready(_referrerTTrimallocschkriList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrimallocH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
