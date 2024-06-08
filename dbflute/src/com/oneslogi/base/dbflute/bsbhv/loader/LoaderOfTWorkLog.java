package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_WORK_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     WORK_LOG_ID
 *
 * [column]
 *     WORK_LOG_ID, CLIENT_CD, CENTER_CD, USER_CD, WORK_CD, WORK_DT, WORK_START_DT, WORK_END_DT, WORK_QTY, TRACE_ITEM, MAC_ADDRESS, WORK_STATUS, WORK_LOG_OUT_FLG, WORK_LOG_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByWorkStatus)
 *
 * [referrer table]
 *     T_WORK_DATA
 *
 * [foreign property]
 *     bClassDtlByWorkStatus, bClassDtlByWorkLogOutFlg
 *
 * [referrer property]
 *     tWorkDataList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTWorkLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TWorkLog> _selectedList;
    protected BehaviorSelector _selector;
    protected TWorkLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTWorkLog ready(List<TWorkLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TWorkLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TWorkLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TWorkData> _referrerTWorkDataList;

    /**
     * Load referrer of TWorkDataList by the set-upper of referrer. <br>
     * T_WORK_DATA by WORK_LOG_ID, named 'TWorkDataList'.
     * <pre>
     * <span style="color: #0000C0">tWorkLogBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tWorkLogList</span>, <span style="color: #553000">logLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logLoader</span>.<span style="color: #CC4747">loadTWorkDataList</span>(<span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dataCB</span>.setupSelect...
     *         <span style="color: #553000">dataCB</span>.query().set...
     *         <span style="color: #553000">dataCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dataLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dataLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TWorkLog tWorkLog : <span style="color: #553000">tWorkLogList</span>) {
     *     ... = tWorkLog.<span style="color: #CC4747">getTWorkDataList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkLogId_InScope(pkList);
     * cb.query().addOrderBy_WorkLogId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTWorkData> loadTWorkDataList(ConditionBeanSetupper<TWorkDataCB> refCBLambda) {
        myBhv().loadTWorkDataList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTWorkDataList = refLs);
        return hd -> hd.handle(new LoaderOfTWorkData().ready(_referrerTWorkDataList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByWorkStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByWorkStatus() {
        if (_foreignBClassDtlByWorkStatusLoader == null)
        { _foreignBClassDtlByWorkStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByWorkStatus(_selectedList), _selector); }
        return _foreignBClassDtlByWorkStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByWorkLogOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByWorkLogOutFlg() {
        if (_foreignBClassDtlByWorkLogOutFlgLoader == null)
        { _foreignBClassDtlByWorkLogOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByWorkLogOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByWorkLogOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TWorkLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
