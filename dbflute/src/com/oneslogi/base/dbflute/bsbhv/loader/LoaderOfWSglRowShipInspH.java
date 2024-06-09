package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of W_SGL_ROW_SHIP_INSP_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_H_ID, CLIENT_ID, CENTER_ID, PICKING_GROUP_NO, TEMP_NO, PRODUCT_ID, WORK_INST_NUM, SLIP_NUM, INSPECTED_SLIP_NUM, BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_BOX, M_CENTER, M_CLIENT, M_PRODUCT
 *
 * [referrer table]
 *     W_SGL_ROW_SHIP_INSP_B
 *
 * [foreign property]
 *     mBox, mCenter, mClient, mProduct
 *
 * [referrer property]
 *     wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWSglRowShipInspH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WSglRowShipInspH> _selectedList;
    protected BehaviorSelector _selector;
    protected WSglRowShipInspHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWSglRowShipInspH ready(List<WSglRowShipInspH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WSglRowShipInspHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WSglRowShipInspHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WSglRowShipInspB> _referrerWSglRowShipInspBList;

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">wSglRowShipInspHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WSglRowShipInspH wSglRowShipInspH : <span style="color: #553000">wSglRowShipInspHList</span>) {
     *     ... = wSglRowShipInspH.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSglRowShipInspHId_InScope(pkList);
     * cb.query().addOrderBy_SglRowShipInspHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspB> loadWSglRowShipInspBList(ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        myBhv().loadWSglRowShipInspBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspBList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspB().ready(_referrerWSglRowShipInspBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
    }

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

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WSglRowShipInspH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
