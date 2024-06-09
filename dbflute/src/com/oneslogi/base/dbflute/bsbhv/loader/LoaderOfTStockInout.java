package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_STOCK_INOUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_INOUT_ID
 *
 * [column]
 *     STOCK_INOUT_ID, FS_STOCK_INOUT_ID, BF_STOCK_INOUT_ID, MOVE_RECORD_B_ID, STORE_RECORD_B_ID, ALLOC_INST_B_ID, PROCESS_DT, PROCESS_TYPE_ID, PROCESS_NO, CORRECT_TYPE, STOCK_ID, INOUT_TYPE, STOCK_INOUT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_B, T_STOCK_INOUT, T_MOVE_RECORD_B, M_PROCESS_TYPE, T_STOCK, T_STORE_RECORD_B, B_CLASS_DTL(ByCorrectType)
 *
 * [referrer table]
 *     T_STOCK_INOUT
 *
 * [foreign property]
 *     tAllocInstB, tStockInoutByBfStockInoutIdSelf, tStockInoutByFsStockInoutIdSelf, tMoveRecordB, mProcessType, tStock, tStoreRecordB, bClassDtlByCorrectType, bClassDtlByInoutType
 *
 * [referrer property]
 *     tStockInoutByBfStockInoutIdSelfList, tStockInoutByFsStockInoutIdSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStockInout {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStockInout> _selectedList;
    protected BehaviorSelector _selector;
    protected TStockInoutBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStockInout ready(List<TStockInout> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStockInoutBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStockInoutBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TStockInout> _referrerTStockInoutByBfStockInoutIdSelfList;

    /**
     * Load referrer of TStockInoutByBfStockInoutIdSelfList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfList'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockInoutList</span>, <span style="color: #553000">inoutLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutLoader</span>.<span style="color: #CC4747">loadTStockInoutByBfStockInoutIdSelfList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStockInout tStockInout : <span style="color: #553000">tStockInoutList</span>) {
     *     ... = tStockInout.<span style="color: #CC4747">getTStockInoutByBfStockInoutIdSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBfStockInoutId_InScope(pkList);
     * cb.query().addOrderBy_BfStockInoutId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockInout> loadTStockInoutByBfStockInoutIdSelfList(ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        myBhv().loadTStockInoutByBfStockInoutIdSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockInoutByBfStockInoutIdSelfList = refLs);
        return hd -> hd.handle(new LoaderOfTStockInout().ready(_referrerTStockInoutByBfStockInoutIdSelfList, _selector));
    }

    protected List<TStockInout> _referrerTStockInoutByFsStockInoutIdSelfList;

    /**
     * Load referrer of TStockInoutByFsStockInoutIdSelfList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfList'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockInoutList</span>, <span style="color: #553000">inoutLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutLoader</span>.<span style="color: #CC4747">loadTStockInoutByFsStockInoutIdSelfList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStockInout tStockInout : <span style="color: #553000">tStockInoutList</span>) {
     *     ... = tStockInout.<span style="color: #CC4747">getTStockInoutByFsStockInoutIdSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFsStockInoutId_InScope(pkList);
     * cb.query().addOrderBy_FsStockInoutId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockInout> loadTStockInoutByFsStockInoutIdSelfList(ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        myBhv().loadTStockInoutByFsStockInoutIdSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockInoutByFsStockInoutIdSelfList = refLs);
        return hd -> hd.handle(new LoaderOfTStockInout().ready(_referrerTStockInoutByFsStockInoutIdSelfList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTAllocInstB _foreignTAllocInstBLoader;
    public LoaderOfTAllocInstB pulloutTAllocInstB() {
        if (_foreignTAllocInstBLoader == null)
        { _foreignTAllocInstBLoader = new LoaderOfTAllocInstB().ready(myBhv().pulloutTAllocInstB(_selectedList), _selector); }
        return _foreignTAllocInstBLoader;
    }

    protected LoaderOfTStockInout _foreignTStockInoutByBfStockInoutIdSelfLoader;
    public LoaderOfTStockInout pulloutTStockInoutByBfStockInoutIdSelf() {
        if (_foreignTStockInoutByBfStockInoutIdSelfLoader == null)
        { _foreignTStockInoutByBfStockInoutIdSelfLoader = new LoaderOfTStockInout().ready(myBhv().pulloutTStockInoutByBfStockInoutIdSelf(_selectedList), _selector); }
        return _foreignTStockInoutByBfStockInoutIdSelfLoader;
    }

    protected LoaderOfTStockInout _foreignTStockInoutByFsStockInoutIdSelfLoader;
    public LoaderOfTStockInout pulloutTStockInoutByFsStockInoutIdSelf() {
        if (_foreignTStockInoutByFsStockInoutIdSelfLoader == null)
        { _foreignTStockInoutByFsStockInoutIdSelfLoader = new LoaderOfTStockInout().ready(myBhv().pulloutTStockInoutByFsStockInoutIdSelf(_selectedList), _selector); }
        return _foreignTStockInoutByFsStockInoutIdSelfLoader;
    }

    protected LoaderOfTMoveRecordB _foreignTMoveRecordBLoader;
    public LoaderOfTMoveRecordB pulloutTMoveRecordB() {
        if (_foreignTMoveRecordBLoader == null)
        { _foreignTMoveRecordBLoader = new LoaderOfTMoveRecordB().ready(myBhv().pulloutTMoveRecordB(_selectedList), _selector); }
        return _foreignTMoveRecordBLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    protected LoaderOfTStoreRecordB _foreignTStoreRecordBLoader;
    public LoaderOfTStoreRecordB pulloutTStoreRecordB() {
        if (_foreignTStoreRecordBLoader == null)
        { _foreignTStoreRecordBLoader = new LoaderOfTStoreRecordB().ready(myBhv().pulloutTStoreRecordB(_selectedList), _selector); }
        return _foreignTStoreRecordBLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCorrectTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCorrectType() {
        if (_foreignBClassDtlByCorrectTypeLoader == null)
        { _foreignBClassDtlByCorrectTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCorrectType(_selectedList), _selector); }
        return _foreignBClassDtlByCorrectTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInoutTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInoutType() {
        if (_foreignBClassDtlByInoutTypeLoader == null)
        { _foreignBClassDtlByInoutTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInoutType(_selectedList), _selector); }
        return _foreignBClassDtlByInoutTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStockInout> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
