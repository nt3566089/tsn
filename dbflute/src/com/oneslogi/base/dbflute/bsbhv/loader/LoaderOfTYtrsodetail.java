package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_YTRSODETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSODETAIL_ID
 *
 * [column]
 *     TRSODETAIL_ID, TRSO_ID, PRODUCT_ID, SO_LINE_NO, PRODUCT_CD, IFITEM_CD, LOCATION_ID, LOCATION_CD, DAMAGE_FLG, NO_SHIPPING_FLG, EXPECT_QTY, ALLOC_QTY, PICKED_QTY, SORTED_QTY, INSPECTED_QTY, SHIPPED_QTY, ADJUST_QTY, LOC_FLG, STD_DIF_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSODETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_YTRSO, M_PRODUCT
 *
 * [referrer table]
 *     T_TRIMALLOCSCHKRI, T_TRPICKDETAIL
 *
 * [foreign property]
 *     tYtrso, mProduct
 *
 * [referrer property]
 *     tTrimallocschkriList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTYtrsodetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TYtrsodetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TYtrsodetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTYtrsodetail ready(List<TYtrsodetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TYtrsodetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TYtrsodetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrimallocschkri> _referrerTTrimallocschkriList;

    /**
     * Load referrer of TTrimallocschkriList by the set-upper of referrer. <br>
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tYtrsodetailList</span>, <span style="color: #553000">ytrsodetailLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ytrsodetailLoader</span>.<span style="color: #CC4747">loadTTrimallocschkriList</span>(<span style="color: #553000">trimallocschkriCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trimallocschkriCB</span>.setupSelect...
     *         <span style="color: #553000">trimallocschkriCB</span>.query().set...
     *         <span style="color: #553000">trimallocschkriCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trimallocschkriLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trimallocschkriLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TYtrsodetail tYtrsodetail : <span style="color: #553000">tYtrsodetailList</span>) {
     *     ... = tYtrsodetail.<span style="color: #CC4747">getTTrimallocschkriList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsodetailId_InScope(pkList);
     * cb.query().addOrderBy_TrsodetailId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrimallocschkri> loadTTrimallocschkriList(ConditionBeanSetupper<TTrimallocschkriCB> refCBLambda) {
        myBhv().loadTTrimallocschkriList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrimallocschkriList = refLs);
        return hd -> hd.handle(new LoaderOfTTrimallocschkri().ready(_referrerTTrimallocschkriList, _selector));
    }

    protected List<TTrpickdetail> _referrerTTrpickdetailList;

    /**
     * Load referrer of TTrpickdetailList by the set-upper of referrer. <br>
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tYtrsodetailList</span>, <span style="color: #553000">ytrsodetailLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ytrsodetailLoader</span>.<span style="color: #CC4747">loadTTrpickdetailList</span>(<span style="color: #553000">trpickdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trpickdetailCB</span>.setupSelect...
     *         <span style="color: #553000">trpickdetailCB</span>.query().set...
     *         <span style="color: #553000">trpickdetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trpickdetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trpickdetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TYtrsodetail tYtrsodetail : <span style="color: #553000">tYtrsodetailList</span>) {
     *     ... = tYtrsodetail.<span style="color: #CC4747">getTTrpickdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsodetailId_InScope(pkList);
     * cb.query().addOrderBy_TrsodetailId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrpickdetail> loadTTrpickdetailList(ConditionBeanSetupper<TTrpickdetailCB> refCBLambda) {
        myBhv().loadTTrpickdetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrpickdetailList = refLs);
        return hd -> hd.handle(new LoaderOfTTrpickdetail().ready(_referrerTTrpickdetailList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTYtrso _foreignTYtrsoLoader;
    public LoaderOfTYtrso pulloutTYtrso() {
        if (_foreignTYtrsoLoader == null)
        { _foreignTYtrsoLoader = new LoaderOfTYtrso().ready(myBhv().pulloutTYtrso(_selectedList), _selector); }
        return _foreignTYtrsoLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TYtrsodetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
