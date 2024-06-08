package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_MOVE_RECORD_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, MOVE_INST_B_ID, PROCESS_NO, LOCATION_ID, MOVE_DT, MOVE_NUM, STORE_NO_MERGE_FLG, ALL_SHIPPING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_MOVE_INST_B, T_MOVE_INST_H, M_LOCATION, B_CLASS_DTL(ByAllShippingFlg)
 *
 * [referrer table]
 *     T_STOCK_INOUT
 *
 * [foreign property]
 *     tMoveInstB, tMoveInstH, mLocation, bClassDtlByAllShippingFlg, bClassDtlByStoreNoMergeFlg
 *
 * [referrer property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTMoveRecordB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TMoveRecordB> _selectedList;
    protected BehaviorSelector _selector;
    protected TMoveRecordBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTMoveRecordB ready(List<TMoveRecordB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TMoveRecordBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TMoveRecordBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TStockInout> _referrerTStockInoutList;

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tMoveRecordBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TMoveRecordB tMoveRecordB : <span style="color: #553000">tMoveRecordBList</span>) {
     *     ... = tMoveRecordB.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveRecordBId_InScope(pkList);
     * cb.query().addOrderBy_MoveRecordBId_Asc();
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
    protected LoaderOfTMoveInstB _foreignTMoveInstBLoader;
    public LoaderOfTMoveInstB pulloutTMoveInstB() {
        if (_foreignTMoveInstBLoader == null)
        { _foreignTMoveInstBLoader = new LoaderOfTMoveInstB().ready(myBhv().pulloutTMoveInstB(_selectedList), _selector); }
        return _foreignTMoveInstBLoader;
    }

    protected LoaderOfTMoveInstH _foreignTMoveInstHLoader;
    public LoaderOfTMoveInstH pulloutTMoveInstH() {
        if (_foreignTMoveInstHLoader == null)
        { _foreignTMoveInstHLoader = new LoaderOfTMoveInstH().ready(myBhv().pulloutTMoveInstH(_selectedList), _selector); }
        return _foreignTMoveInstHLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAllShippingFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAllShippingFlg() {
        if (_foreignBClassDtlByAllShippingFlgLoader == null)
        { _foreignBClassDtlByAllShippingFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAllShippingFlg(_selectedList), _selector); }
        return _foreignBClassDtlByAllShippingFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStoreNoMergeFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStoreNoMergeFlg() {
        if (_foreignBClassDtlByStoreNoMergeFlgLoader == null)
        { _foreignBClassDtlByStoreNoMergeFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStoreNoMergeFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStoreNoMergeFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TMoveRecordB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
