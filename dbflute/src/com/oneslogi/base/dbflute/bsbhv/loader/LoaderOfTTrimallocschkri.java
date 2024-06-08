package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRIMALLOCSCHKRI as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIMALLOCSCH_ID
 *
 * [column]
 *     TRIMALLOCSCH_ID, TRIMALLOC_H_ID, TRSODETAIL_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_No, LOCATION_ID, LOCATION_CD, EXPECT_QTY, MANUFACTUREDATE, DESIGN_FLG, ALCIMEXP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSCH_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_YTRSODETAIL, T_TRIMALLOC_H
 *
 * [referrer table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign property]
 *     tYtrsodetail, tTrimallocH
 *
 * [referrer property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrimallocschkri {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrimallocschkri> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrimallocschkriBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrimallocschkri ready(List<TTrimallocschkri> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrimallocschkriBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrimallocschkriBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrimallocadjust> _referrerTTrimallocadjustList;

    /**
     * Load referrer of TTrimallocadjustList by the set-upper of referrer. <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrimallocschkriList</span>, <span style="color: #553000">trimallocschkriLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocschkriLoader</span>.<span style="color: #CC4747">loadTTrimallocadjustList</span>(<span style="color: #553000">trimallocadjustCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trimallocadjustCB</span>.setupSelect...
     *         <span style="color: #553000">trimallocadjustCB</span>.query().set...
     *         <span style="color: #553000">trimallocadjustCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trimallocadjustLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trimallocadjustLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrimallocschkri tTrimallocschkri : <span style="color: #553000">tTrimallocschkriList</span>) {
     *     ... = tTrimallocschkri.<span style="color: #CC4747">getTTrimallocadjustList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocschId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocschId_Asc();
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
    protected LoaderOfTYtrsodetail _foreignTYtrsodetailLoader;
    public LoaderOfTYtrsodetail pulloutTYtrsodetail() {
        if (_foreignTYtrsodetailLoader == null)
        { _foreignTYtrsodetailLoader = new LoaderOfTYtrsodetail().ready(myBhv().pulloutTYtrsodetail(_selectedList), _selector); }
        return _foreignTYtrsodetailLoader;
    }

    protected LoaderOfTTrimallocH _foreignTTrimallocHLoader;
    public LoaderOfTTrimallocH pulloutTTrimallocH() {
        if (_foreignTTrimallocHLoader == null)
        { _foreignTTrimallocHLoader = new LoaderOfTTrimallocH().ready(myBhv().pulloutTTrimallocH(_selectedList), _selector); }
        return _foreignTTrimallocHLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrimallocschkri> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
