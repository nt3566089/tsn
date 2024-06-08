package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_STORE_RECORD_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, RECEIVE_PLAN_B_ID, PROCESS_NO, CLIENT_ORDER_NO, LOT, LIMIT_DT, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, INPUT_TYPE, HT_STORE_INSPECTION_DT, HT_STORE_INSPECTION_USER_ID, STORE_RECORD_B_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_LOCATION, T_STORE_RECORD_H, T_RECEIVE_PLAN_B, B_CLASS_DTL(ByInputType)
 *
 * [referrer table]
 *     T_STOCK_INOUT
 *
 * [foreign property]
 *     mLocation, tStoreRecordH, tReceivePlanB, bClassDtlByInputType, bClassDtlByStoreFlg
 *
 * [referrer property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStoreRecordB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStoreRecordB> _selectedList;
    protected BehaviorSelector _selector;
    protected TStoreRecordBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStoreRecordB ready(List<TStoreRecordB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStoreRecordBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStoreRecordBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TStockInout> _referrerTStockInoutList;

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by STORE_RECORD_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreRecordBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreRecordB tStoreRecordB : <span style="color: #553000">tStoreRecordBList</span>) {
     *     ... = tStoreRecordB.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreRecordBId_InScope(pkList);
     * cb.query().addOrderBy_StoreRecordBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockInout> loadTStockInoutList(ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        myBhv().loadTStockInoutList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockInoutList = refLs);
        return hd -> hd.handle(new LoaderOfTStockInout().ready(_referrerTStockInoutList, _selector));
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

    protected LoaderOfTStoreRecordH _foreignTStoreRecordHLoader;
    public LoaderOfTStoreRecordH pulloutTStoreRecordH() {
        if (_foreignTStoreRecordHLoader == null)
        { _foreignTStoreRecordHLoader = new LoaderOfTStoreRecordH().ready(myBhv().pulloutTStoreRecordH(_selectedList), _selector); }
        return _foreignTStoreRecordHLoader;
    }

    protected LoaderOfTReceivePlanB _foreignTReceivePlanBLoader;
    public LoaderOfTReceivePlanB pulloutTReceivePlanB() {
        if (_foreignTReceivePlanBLoader == null)
        { _foreignTReceivePlanBLoader = new LoaderOfTReceivePlanB().ready(myBhv().pulloutTReceivePlanB(_selectedList), _selector); }
        return _foreignTReceivePlanBLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStoreFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStoreFlg() {
        if (_foreignBClassDtlByStoreFlgLoader == null)
        { _foreignBClassDtlByStoreFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStoreFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStoreFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStoreRecordB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
