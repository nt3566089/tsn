package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TR_PICKLIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     T_TR_PICKLIST_ID
 *
 * [column]
 *     T_TR_PICKLIST_ID, TRPICKDETAIL_ID, PICK_LIST_KEY, PICKLIST_G_NO, PL_BATCH_KEY, STOCK_ID, LOT_ID, PICKLIST_DATE, PRODUCT_CD, MANUFACTURE_DATE, DESIGN_FLG, MONTH_FLG, DAILY_FLG, FRONT_RACK_FLG, LOC_FLG, STD_DIF_FLG, ORDER_TYPE, SHIP_TOSUB, RMA_NO, SOTED_LOCATION_ID, SOTED_LOCATION_CD, ALLOC_LOCATION_ID, ALLOC_LOCATION_CD, ROOT_OUT_SEQ, DIRECTION_COMMENT, QTY_CASE, QTY_BOWL, QTY, HT_QTY_CASE, HT_QTY_BOWL, HT_QTY, COMPLETE_STS, START_TIME, END_TIME, USER_CD, SUPPLIERCD, SCHDATE, CASE_OUT_NUMBER, CENTER_ID, CLIENT_ID, LINE_BLOCK, SORTING_RACK_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_TR_PICKLIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRPICKDETAIL
 *
 * [referrer table]
 *     T_TRPICKLISTEXP
 *
 * [foreign property]
 *     tTrpickdetail
 *
 * [referrer property]
 *     tTrpicklistexpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrPicklist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrPicklist> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrPicklistBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrPicklist ready(List<TTrPicklist> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrPicklistBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrPicklistBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrpicklistexp> _referrerTTrpicklistexpList;

    /**
     * Load referrer of TTrpicklistexpList by the set-upper of referrer. <br>
     * T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpList'.
     * <pre>
     * <span style="color: #0000C0">tTrPicklistBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrPicklistList</span>, <span style="color: #553000">picklistLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">picklistLoader</span>.<span style="color: #CC4747">loadTTrpicklistexpList</span>(<span style="color: #553000">trpicklistexpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trpicklistexpCB</span>.setupSelect...
     *         <span style="color: #553000">trpicklistexpCB</span>.query().set...
     *         <span style="color: #553000">trpicklistexpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trpicklistexpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trpicklistexpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrPicklist tTrPicklist : <span style="color: #553000">tTrPicklistList</span>) {
     *     ... = tTrPicklist.<span style="color: #CC4747">getTTrpicklistexpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTTrpicklistId_InScope(pkList);
     * cb.query().addOrderBy_TTrpicklistId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrpicklistexp> loadTTrpicklistexpList(ConditionBeanSetupper<TTrpicklistexpCB> refCBLambda) {
        myBhv().loadTTrpicklistexpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrpicklistexpList = refLs);
        return hd -> hd.handle(new LoaderOfTTrpicklistexp().ready(_referrerTTrpicklistexpList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrpickdetail _foreignTTrpickdetailLoader;
    public LoaderOfTTrpickdetail pulloutTTrpickdetail() {
        if (_foreignTTrpickdetailLoader == null)
        { _foreignTTrpickdetailLoader = new LoaderOfTTrpickdetail().ready(myBhv().pulloutTTrpickdetail(_selectedList), _selector); }
        return _foreignTTrpickdetailLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrPicklist> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
