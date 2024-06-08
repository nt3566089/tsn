package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_MOVE_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_H_ID
 *
 * [column]
 *     MOVE_INST_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, MOVE_INST_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_PROCESS_TYPE
 *
 * [referrer table]
 *     H_INVENTORY_B, H_MOVE_B
 *
 * [foreign property]
 *     mProcessType
 *
 * [referrer property]
 *     hInventoryBList, hMoveBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHMoveH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HMoveH> _selectedList;
    protected BehaviorSelector _selector;
    protected HMoveHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHMoveH ready(List<HMoveH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HMoveHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HMoveHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HInventoryB> _referrerHInventoryBList;

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by MOVE_INST_H_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hMoveHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HMoveH hMoveH : <span style="color: #553000">hMoveHList</span>) {
     *     ... = hMoveH.<span style="color: #CC4747">getHInventoryBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHInventoryB> loadHInventoryBList(ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        myBhv().loadHInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfHInventoryB().ready(_referrerHInventoryBList, _selector));
    }

    protected List<HMoveB> _referrerHMoveBList;

    /**
     * Load referrer of HMoveBList by the set-upper of referrer. <br>
     * H_MOVE_B by MOVE_INST_H_ID, named 'HMoveBList'.
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hMoveHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHMoveBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HMoveH hMoveH : <span style="color: #553000">hMoveHList</span>) {
     *     ... = hMoveH.<span style="color: #CC4747">getHMoveBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHMoveB> loadHMoveBList(ConditionBeanSetupper<HMoveBCB> refCBLambda) {
        myBhv().loadHMoveBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHMoveBList = refLs);
        return hd -> hd.handle(new LoaderOfHMoveB().ready(_referrerHMoveBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HMoveH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
