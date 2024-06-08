package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_SUBREP_LAYOUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SUBREP_LAYOUT_ID
 *
 * [column]
 *     SUBREP_LAYOUT_ID, REPORT_LAYOUT_ID, SUBREP_LAYOUT_DATA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SUBREP_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT_LAYOUT
 *
 * [referrer table]
 *     P_SUBREP_LAYOUT_ITEM
 *
 * [foreign property]
 *     pReportLayout
 *
 * [referrer property]
 *     pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPSubrepLayout {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PSubrepLayout> _selectedList;
    protected BehaviorSelector _selector;
    protected PSubrepLayoutBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPSubrepLayout ready(List<PSubrepLayout> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PSubrepLayoutBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PSubrepLayoutBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PSubrepLayoutItem> _referrerPSubrepLayoutItemList;

    /**
     * Load referrer of PSubrepLayoutItemList by the set-upper of referrer. <br>
     * P_SUBREP_LAYOUT_ITEM by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pSubrepLayoutList</span>, <span style="color: #553000">layoutLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">layoutLoader</span>.<span style="color: #CC4747">loadPSubrepLayoutItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PSubrepLayout pSubrepLayout : <span style="color: #553000">pSubrepLayoutList</span>) {
     *     ... = pSubrepLayout.<span style="color: #CC4747">getPSubrepLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSubrepLayoutId_InScope(pkList);
     * cb.query().addOrderBy_SubrepLayoutId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPSubrepLayoutItem> loadPSubrepLayoutItemList(ConditionBeanSetupper<PSubrepLayoutItemCB> refCBLambda) {
        myBhv().loadPSubrepLayoutItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPSubrepLayoutItemList = refLs);
        return hd -> hd.handle(new LoaderOfPSubrepLayoutItem().ready(_referrerPSubrepLayoutItemList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPReportLayout _foreignPReportLayoutLoader;
    public LoaderOfPReportLayout pulloutPReportLayout() {
        if (_foreignPReportLayoutLoader == null)
        { _foreignPReportLayoutLoader = new LoaderOfPReportLayout().ready(myBhv().pulloutPReportLayout(_selectedList), _selector); }
        return _foreignPReportLayoutLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PSubrepLayout> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
