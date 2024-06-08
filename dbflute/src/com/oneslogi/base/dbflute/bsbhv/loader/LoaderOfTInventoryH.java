package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_INVENTORY_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_H_ID
 *
 * [column]
 *     INVENTORY_H_ID, CLIENT_ID, CENTER_ID, BATCH_NUM, INVENTORY_DT, INVENTORY_KEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     T_INVENTORY_B, T_INVENTORY_INST
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     tInventoryBList, tInventoryInstList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryH> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryH ready(List<TInventoryH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by INVENTORY_H_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tInventoryHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tInventoryHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TInventoryH tInventoryH : <span style="color: #553000">tInventoryHList</span>) {
     *     ... = tInventoryH.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryHId_InScope(pkList);
     * cb.query().addOrderBy_InventoryHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TInventoryInst> _referrerTInventoryInstList;

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by INVENTORY_H_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">tInventoryHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tInventoryHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">instCB</span>.setupSelect...
     *         <span style="color: #553000">instCB</span>.query().set...
     *         <span style="color: #553000">instCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">instLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    instLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TInventoryH tInventoryH : <span style="color: #553000">tInventoryHList</span>) {
     *     ... = tInventoryH.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryHId_InScope(pkList);
     * cb.query().addOrderBy_InventoryHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryInst> loadTInventoryInstList(ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        myBhv().loadTInventoryInstList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryInstList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryInst().ready(_referrerTInventoryInstList, _selector));
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
    public List<TInventoryH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
