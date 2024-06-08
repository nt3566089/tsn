package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_CORDHDR as TABLE. <br>
 * <pre>
 * [primary key]
 *     ORDER_H_ID
 *
 * [column]
 *     ORDER_H_ID, CENTER_ID, CLIENT_ID, ZZORGNCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, IOID, CTQA, STA, WRKMFG, SROPRTCNT, CORDRCVCNT, COMPLETE_FLG, RCV_FLG, SKIP_KBN, SORT_DATE, COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     T_CORDDTAEC, T_CORDDTASR
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     tCorddtaecList, tCorddtasrList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTCordhdr {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCordhdr> _selectedList;
    protected BehaviorSelector _selector;
    protected TCordhdrBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCordhdr ready(List<TCordhdr> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCordhdrBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCordhdrBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TCorddtaec> _referrerTCorddtaecList;

    /**
     * Load referrer of TCorddtaecList by the set-upper of referrer. <br>
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'.
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tCordhdrList</span>, <span style="color: #553000">cordhdrLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cordhdrLoader</span>.<span style="color: #CC4747">loadTCorddtaecList</span>(<span style="color: #553000">corddtaecCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">corddtaecCB</span>.setupSelect...
     *         <span style="color: #553000">corddtaecCB</span>.query().set...
     *         <span style="color: #553000">corddtaecCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">corddtaecLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    corddtaecLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TCordhdr tCordhdr : <span style="color: #553000">tCordhdrList</span>) {
     *     ... = tCordhdr.<span style="color: #CC4747">getTCorddtaecList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrderHId_InScope(pkList);
     * cb.query().addOrderBy_OrderHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCorddtaec> loadTCorddtaecList(ConditionBeanSetupper<TCorddtaecCB> refCBLambda) {
        myBhv().loadTCorddtaecList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCorddtaecList = refLs);
        return hd -> hd.handle(new LoaderOfTCorddtaec().ready(_referrerTCorddtaecList, _selector));
    }

    protected List<TCorddtasr> _referrerTCorddtasrList;

    /**
     * Load referrer of TCorddtasrList by the set-upper of referrer. <br>
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'.
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tCordhdrList</span>, <span style="color: #553000">cordhdrLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cordhdrLoader</span>.<span style="color: #CC4747">loadTCorddtasrList</span>(<span style="color: #553000">corddtasrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">corddtasrCB</span>.setupSelect...
     *         <span style="color: #553000">corddtasrCB</span>.query().set...
     *         <span style="color: #553000">corddtasrCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">corddtasrLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    corddtasrLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TCordhdr tCordhdr : <span style="color: #553000">tCordhdrList</span>) {
     *     ... = tCordhdr.<span style="color: #CC4747">getTCorddtasrList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrderHId_InScope(pkList);
     * cb.query().addOrderBy_OrderHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCorddtasr> loadTCorddtasrList(ConditionBeanSetupper<TCorddtasrCB> refCBLambda) {
        myBhv().loadTCorddtasrList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCorddtasrList = refLs);
        return hd -> hd.handle(new LoaderOfTCorddtasr().ready(_referrerTCorddtasrList, _selector));
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
    public List<TCordhdr> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
