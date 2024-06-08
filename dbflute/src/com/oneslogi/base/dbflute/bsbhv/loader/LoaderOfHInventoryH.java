package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_INVENTORY_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_H_ID
 *
 * [column]
 *     INVENTORY_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, INVENTORY_DT, BATCH_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     
 *
 * [referrer table]
 *     H_INVENTORY_B
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     hInventoryBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHInventoryH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HInventoryH> _selectedList;
    protected BehaviorSelector _selector;
    protected HInventoryHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHInventoryH ready(List<HInventoryH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HInventoryHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HInventoryHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HInventoryB> _referrerHInventoryBList;

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by INVENTORY_H_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hInventoryHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hInventoryHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HInventoryH hInventoryH : <span style="color: #553000">hInventoryHList</span>) {
     *     ... = hInventoryH.<span style="color: #CC4747">getHInventoryBList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfHInventoryB> loadHInventoryBList(ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        myBhv().loadHInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfHInventoryB().ready(_referrerHInventoryBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HInventoryH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
