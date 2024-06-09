package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRPICKDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRPICKDETAIL_ID
 *
 * [column]
 *     TRPICKDETAIL_ID, TRSODETAIL_ID, MOVE_INST_H_ID, STOCK_ID, LOCATION_ID, PICK_BATCH_KEY, PICK_BATCH_LINE_NO, PRODUCT_CD, IFITEM_CD, LOT_ID, LOCATION_CD, EXPECT_QTY, PICKED_QTY, SORTED_QTY, SHIPPED_QTY, PICK_USER_CD, LABEL_PRINTED_FLG, MONTH_FLG, PL_BATCH_KEY, WORKALLOCATENAME, ALERTFLG, REVERSE_FLG, REVERSE_LIST_OUTPUT__FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPICKDETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_LOCATION, T_STOCK, T_YTRSODETAIL
 *
 * [referrer table]
 *     T_TR_PICKLIST
 *
 * [foreign property]
 *     mLocation, tStock, tYtrsodetail
 *
 * [referrer property]
 *     tTrPicklistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrpickdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpickdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpickdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpickdetail ready(List<TTrpickdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpickdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpickdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrPicklist> _referrerTTrPicklistList;

    /**
     * Load referrer of TTrPicklistList by the set-upper of referrer. <br>
     * T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistList'.
     * <pre>
     * <span style="color: #0000C0">tTrpickdetailBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrpickdetailList</span>, <span style="color: #553000">trpickdetailLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpickdetailLoader</span>.<span style="color: #CC4747">loadTTrPicklistList</span>(<span style="color: #553000">picklistCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">picklistCB</span>.setupSelect...
     *         <span style="color: #553000">picklistCB</span>.query().set...
     *         <span style="color: #553000">picklistCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">picklistLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    picklistLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrpickdetail tTrpickdetail : <span style="color: #553000">tTrpickdetailList</span>) {
     *     ... = tTrpickdetail.<span style="color: #CC4747">getTTrPicklistList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrpickdetailId_InScope(pkList);
     * cb.query().addOrderBy_TrpickdetailId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrPicklist> loadTTrPicklistList(ConditionBeanSetupper<TTrPicklistCB> refCBLambda) {
        myBhv().loadTTrPicklistList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrPicklistList = refLs);
        return hd -> hd.handle(new LoaderOfTTrPicklist().ready(_referrerTTrPicklistList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    protected LoaderOfTYtrsodetail _foreignTYtrsodetailLoader;
    public LoaderOfTYtrsodetail pulloutTYtrsodetail() {
        if (_foreignTYtrsodetailLoader == null)
        { _foreignTYtrsodetailLoader = new LoaderOfTYtrsodetail().ready(myBhv().pulloutTYtrsodetail(_selectedList), _selector); }
        return _foreignTYtrsodetailLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpickdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
