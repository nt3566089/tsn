package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOG_ID
 *
 * [column]
 *     LOG_ID, LOG_STATUS, LOG_GROUP_CD, LOG_GROUP_NM, LOG_GROUP_PROCESS_ID, PGM_CD, PGM_NM, PROCESS_START_DT, PROCESS_END_DT, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByLogStatus)
 *
 * [referrer table]
 *     B_LOG_DTL
 *
 * [foreign property]
 *     bClassDtlByLogStatus
 *
 * [referrer property]
 *     bLogDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BLog> _selectedList;
    protected BehaviorSelector _selector;
    protected BLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBLog ready(List<BLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BLogDtl> _referrerBLogDtlList;

    /**
     * Load referrer of BLogDtlList by the set-upper of referrer. <br>
     * B_LOG_DTL by LOG_ID, named 'BLogDtlList'.
     * <pre>
     * <span style="color: #0000C0">bLogBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bLogList</span>, <span style="color: #553000">logLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logLoader</span>.<span style="color: #CC4747">loadBLogDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BLog bLog : <span style="color: #553000">bLogList</span>) {
     *     ... = bLog.<span style="color: #CC4747">getBLogDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLogId_InScope(pkList);
     * cb.query().addOrderBy_LogId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBLogDtl> loadBLogDtlList(ConditionBeanSetupper<BLogDtlCB> refCBLambda) {
        myBhv().loadBLogDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBLogDtlList = refLs);
        return hd -> hd.handle(new LoaderOfBLogDtl().ready(_referrerBLogDtlList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByLogStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLogStatus() {
        if (_foreignBClassDtlByLogStatusLoader == null)
        { _foreignBClassDtlByLogStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLogStatus(_selectedList), _selector); }
        return _foreignBClassDtlByLogStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
