package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_YTRSO as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSR_ID
 *
 * [column]
 *     TRSR_ID, CENTER_ID, CLIENT_ID, SO_KEY, SR_STATUS, RESTOCK_NUMBER, RESTOCK_KBN, SORTING_RACK_NO, RESTOCK_SORT_KEY, SHIP_SCH_DATE, SHIP_DATE, CENTER_CD, SORT_RESTOCK_FLG, DELIVERY_CENTER_CD, LINE_BLOCK, DELIVERY_DIRECTION, PICK_BATCH_KEY, PICKLIST_COMMENT, FROM_PICKLIST_NO, TO_PICKLIST_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSR_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     T_YTRSODETAIL
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     tYtrsodetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTYtrso {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TYtrso> _selectedList;
    protected BehaviorSelector _selector;
    protected TYtrsoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTYtrso ready(List<TYtrso> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TYtrsoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TYtrsoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TYtrsodetail> _referrerTYtrsodetailList;

    /**
     * Load referrer of TYtrsodetailList by the set-upper of referrer. <br>
     * T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tYtrsoList</span>, <span style="color: #553000">ytrsoLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ytrsoLoader</span>.<span style="color: #CC4747">loadTYtrsodetailList</span>(<span style="color: #553000">ytrsodetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ytrsodetailCB</span>.setupSelect...
     *         <span style="color: #553000">ytrsodetailCB</span>.query().set...
     *         <span style="color: #553000">ytrsodetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ytrsodetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ytrsodetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TYtrso tYtrso : <span style="color: #553000">tYtrsoList</span>) {
     *     ... = tYtrso.<span style="color: #CC4747">getTYtrsodetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsoId_InScope(pkList);
     * cb.query().addOrderBy_TrsoId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTYtrsodetail> loadTYtrsodetailList(ConditionBeanSetupper<TYtrsodetailCB> refCBLambda) {
        myBhv().loadTYtrsodetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTYtrsodetailList = refLs);
        return hd -> hd.handle(new LoaderOfTYtrsodetail().ready(_referrerTYtrsodetailList, _selector));
    }

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
    public List<TYtrso> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
