package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_EC_ORDER_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     EC_ORDER_B_ID
 *
 * [column]
 *     EC_ORDER_B_ID, EC_ORDER_H_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_OPTION, ORDER_NUM, UNIT_PRICE, UNIT_TOTAL_PRICE, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_H, B_CLASS_DTL(ByErrorFlg)
 *
 * [referrer table]
 *     T_AMAZON_ORDER, T_RAKUTEN_ORDER, T_YAHOO_ORDER
 *
 * [foreign property]
 *     tEcOrderH, bClassDtlByErrorFlg
 *
 * [referrer property]
 *     tAmazonOrderList, tRakutenOrderList, tYahooOrderList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTEcOrderB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TEcOrderB> _selectedList;
    protected BehaviorSelector _selector;
    protected TEcOrderBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTEcOrderB ready(List<TEcOrderB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TEcOrderBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TEcOrderBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TAmazonOrder> _referrerTAmazonOrderList;

    /**
     * Load referrer of TAmazonOrderList by the set-upper of referrer. <br>
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tEcOrderBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTAmazonOrderList</span>(<span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">orderCB</span>.setupSelect...
     *         <span style="color: #553000">orderCB</span>.query().set...
     *         <span style="color: #553000">orderCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">orderLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    orderLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.<span style="color: #CC4747">getTAmazonOrderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAmazonOrder> loadTAmazonOrderList(ConditionBeanSetupper<TAmazonOrderCB> refCBLambda) {
        myBhv().loadTAmazonOrderList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAmazonOrderList = refLs);
        return hd -> hd.handle(new LoaderOfTAmazonOrder().ready(_referrerTAmazonOrderList, _selector));
    }

    protected List<TRakutenOrder> _referrerTRakutenOrderList;

    /**
     * Load referrer of TRakutenOrderList by the set-upper of referrer. <br>
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tEcOrderBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTRakutenOrderList</span>(<span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">orderCB</span>.setupSelect...
     *         <span style="color: #553000">orderCB</span>.query().set...
     *         <span style="color: #553000">orderCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">orderLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    orderLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.<span style="color: #CC4747">getTRakutenOrderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTRakutenOrder> loadTRakutenOrderList(ConditionBeanSetupper<TRakutenOrderCB> refCBLambda) {
        myBhv().loadTRakutenOrderList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTRakutenOrderList = refLs);
        return hd -> hd.handle(new LoaderOfTRakutenOrder().ready(_referrerTRakutenOrderList, _selector));
    }

    protected List<TYahooOrder> _referrerTYahooOrderList;

    /**
     * Load referrer of TYahooOrderList by the set-upper of referrer. <br>
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tEcOrderBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTYahooOrderList</span>(<span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">orderCB</span>.setupSelect...
     *         <span style="color: #553000">orderCB</span>.query().set...
     *         <span style="color: #553000">orderCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">orderLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    orderLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.<span style="color: #CC4747">getTYahooOrderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTYahooOrder> loadTYahooOrderList(ConditionBeanSetupper<TYahooOrderCB> refCBLambda) {
        myBhv().loadTYahooOrderList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTYahooOrderList = refLs);
        return hd -> hd.handle(new LoaderOfTYahooOrder().ready(_referrerTYahooOrderList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTEcOrderH _foreignTEcOrderHLoader;
    public LoaderOfTEcOrderH pulloutTEcOrderH() {
        if (_foreignTEcOrderHLoader == null)
        { _foreignTEcOrderHLoader = new LoaderOfTEcOrderH().ready(myBhv().pulloutTEcOrderH(_selectedList), _selector); }
        return _foreignTEcOrderHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TEcOrderB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
