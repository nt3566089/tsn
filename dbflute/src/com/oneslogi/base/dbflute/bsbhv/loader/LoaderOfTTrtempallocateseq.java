package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRTEMPALLOCATESEQ as TABLE. <br>
 * <pre>
 * [primary key]
 *     TEMPORARY_ALLOC_ID
 *
 * [column]
 *     TEMPORARY_ALLOC_ID, PICKING_INST_ID, ALLOCATESEQ, LOT_ID, LOCATION_ID, LISTKBN, TEMPPICKEDQTY1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TEMPORARY_ALLOC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_TRTEMPALLOCATESEQDETAIL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tTrtempallocateseqdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrtempallocateseq {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrtempallocateseq> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrtempallocateseqBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrtempallocateseq ready(List<TTrtempallocateseq> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrtempallocateseqBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrtempallocateseqBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrtempallocateseqdetail> _referrerTTrtempallocateseqdetailList;

    /**
     * Load referrer of TTrtempallocateseqdetailList by the set-upper of referrer. <br>
     * T_TRTEMPALLOCATESEQDETAIL by TEMPORARY_ALLOC_ID, named 'TTrtempallocateseqdetailList'.
     * <pre>
     * <span style="color: #0000C0">tTrtempallocateseqBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrtempallocateseqList</span>, <span style="color: #553000">trtempallocateseqLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trtempallocateseqLoader</span>.<span style="color: #CC4747">loadTTrtempallocateseqdetailList</span>(<span style="color: #553000">trtempallocateseqdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trtempallocateseqdetailCB</span>.setupSelect...
     *         <span style="color: #553000">trtempallocateseqdetailCB</span>.query().set...
     *         <span style="color: #553000">trtempallocateseqdetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trtempallocateseqdetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trtempallocateseqdetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrtempallocateseq tTrtempallocateseq : <span style="color: #553000">tTrtempallocateseqList</span>) {
     *     ... = tTrtempallocateseq.<span style="color: #CC4747">getTTrtempallocateseqdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTemporaryAllocId_InScope(pkList);
     * cb.query().addOrderBy_TemporaryAllocId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrtempallocateseqdetail> loadTTrtempallocateseqdetailList(ConditionBeanSetupper<TTrtempallocateseqdetailCB> refCBLambda) {
        myBhv().loadTTrtempallocateseqdetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrtempallocateseqdetailList = refLs);
        return hd -> hd.handle(new LoaderOfTTrtempallocateseqdetail().ready(_referrerTTrtempallocateseqdetailList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrtempallocateseq> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
