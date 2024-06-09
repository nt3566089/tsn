package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_MOVE_INST_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_H_ID
 *
 * [column]
 *     MOVE_INST_H_ID, CLIENT_ID, CENTER_ID, INST_DT, MOVE_SLIP_NO, PROCESS_TYPE_ID, MOVE_INST_STATUS, INPUT_TYPE, MOVE_INST_COMMENT, SOURCE_BATCH_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_PROCESS_TYPE, B_CLASS_DTL(ByInputType), T_MOVE_INST_R(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_B, T_MOVE_INST_B, T_MOVE_RECORD_B, T_MOVE_INST_R
 *
 * [foreign property]
 *     mCenter, mClient, mProcessType, bClassDtlByInputType, bClassDtlByMoveInstStatus, tMoveInstRAsOne
 *
 * [referrer property]
 *     tInventoryBList, tMoveInstBList, tMoveRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTMoveInstH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TMoveInstH> _selectedList;
    protected BehaviorSelector _selector;
    protected TMoveInstHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTMoveInstH ready(List<TMoveInstH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TMoveInstHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TMoveInstHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by MOVE_INST_H_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tMoveInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBList;

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by MOVE_INST_H_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tMoveInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBList, _selector));
    }

    protected List<TMoveRecordB> _referrerTMoveRecordBList;

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * T_MOVE_RECORD_B by MOVE_INST_H_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tMoveInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveRecordB> loadTMoveRecordBList(ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        myBhv().loadTMoveRecordBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveRecordBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveRecordB().ready(_referrerTMoveRecordBList, _selector));
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

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMoveInstStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMoveInstStatus() {
        if (_foreignBClassDtlByMoveInstStatusLoader == null)
        { _foreignBClassDtlByMoveInstStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMoveInstStatus(_selectedList), _selector); }
        return _foreignBClassDtlByMoveInstStatusLoader;
    }

    protected LoaderOfTMoveInstR _foreignTMoveInstRAsOneLoader;
    public LoaderOfTMoveInstR pulloutTMoveInstRAsOne() {
        if (_foreignTMoveInstRAsOneLoader == null)
        { _foreignTMoveInstRAsOneLoader = new LoaderOfTMoveInstR().ready(myBhv().pulloutTMoveInstRAsOne(_selectedList), _selector); }
        return _foreignTMoveInstRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TMoveInstH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
