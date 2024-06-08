package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_PACKING_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, SHIPPING_INST_H_ID, PROCESS_TYPE_ID, CARRIER_TRACE_NUM, BOX_ID, BOX_CD, BOX_NM, GROSS_WEIGHT, TOTAL_VOLUME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_SHIPPING_H
 *
 * [referrer table]
 *     H_PACKING_B
 *
 * [foreign property]
 *     hShippingH
 *
 * [referrer property]
 *     hPackingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHPackingH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HPackingH> _selectedList;
    protected BehaviorSelector _selector;
    protected HPackingHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHPackingH ready(List<HPackingH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HPackingHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HPackingHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HPackingB> _referrerHPackingBList;

    /**
     * Load referrer of HPackingBList by the set-upper of referrer. <br>
     * H_PACKING_B by PACKING_H_ID, named 'HPackingBList'.
     * <pre>
     * <span style="color: #0000C0">hPackingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hPackingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHPackingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HPackingH hPackingH : <span style="color: #553000">hPackingHList</span>) {
     *     ... = hPackingH.<span style="color: #CC4747">getHPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHPackingB> loadHPackingBList(ConditionBeanSetupper<HPackingBCB> refCBLambda) {
        myBhv().loadHPackingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHPackingBList = refLs);
        return hd -> hd.handle(new LoaderOfHPackingB().ready(_referrerHPackingBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHShippingH _foreignHShippingHLoader;
    public LoaderOfHShippingH pulloutHShippingH() {
        if (_foreignHShippingHLoader == null)
        { _foreignHShippingHLoader = new LoaderOfHShippingH().ready(myBhv().pulloutHShippingH(_selectedList), _selector); }
        return _foreignHShippingHLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HPackingH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
