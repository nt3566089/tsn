package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRFLEXIBILITY as TABLE. <br>
 * <pre>
 * [primary key]
 *     FLEXIBLE_TRANSPORT_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_INFO_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, STS, INSTRACTDATETIME, VA_EXTDATA1, NM_EXTDATA1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_TRFLEXIBILITYDETAIL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tTrflexibilitydetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrflexibility {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrflexibility> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrflexibilityBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrflexibility ready(List<TTrflexibility> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrflexibilityBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrflexibilityBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrflexibilitydetail> _referrerTTrflexibilitydetailList;

    /**
     * Load referrer of TTrflexibilitydetailList by the set-upper of referrer. <br>
     * T_TRFLEXIBILITYDETAIL by FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibilitydetailList'.
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrflexibilityList</span>, <span style="color: #553000">trflexibilityLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trflexibilityLoader</span>.<span style="color: #CC4747">loadTTrflexibilitydetailList</span>(<span style="color: #553000">trflexibilitydetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trflexibilitydetailCB</span>.setupSelect...
     *         <span style="color: #553000">trflexibilitydetailCB</span>.query().set...
     *         <span style="color: #553000">trflexibilitydetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trflexibilitydetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trflexibilitydetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrflexibility tTrflexibility : <span style="color: #553000">tTrflexibilityList</span>) {
     *     ... = tTrflexibility.<span style="color: #CC4747">getTTrflexibilitydetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFlexibleTransportInfoId_InScope(pkList);
     * cb.query().addOrderBy_FlexibleTransportInfoId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrflexibilitydetail> loadTTrflexibilitydetailList(ConditionBeanSetupper<TTrflexibilitydetailCB> refCBLambda) {
        myBhv().loadTTrflexibilitydetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrflexibilitydetailList = refLs);
        return hd -> hd.handle(new LoaderOfTTrflexibilitydetail().ready(_referrerTTrflexibilitydetailList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrflexibility> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
