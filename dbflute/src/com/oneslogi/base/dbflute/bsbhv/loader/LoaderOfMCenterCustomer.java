package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CENTER_CUSTOMER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CUSTOMER_ID
 *
 * [column]
 *     CENTER_CUSTOMER_ID, CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID, DELIVERY_ORDER, DELIVERY_READ_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CUSTOMER, M_DELIVERY_COURSE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     T_ALLOC_INST_H
 *
 * [foreign property]
 *     mCenter, mCustomer, mDeliveryCourse, bClassDtlByDelFlg
 *
 * [referrer property]
 *     tAllocInstHByDelivCustomerIdList, tAllocInstHBySupplyCustomerIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterCustomer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterCustomer> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterCustomerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterCustomer ready(List<MCenterCustomer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterCustomerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterCustomerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TAllocInstH> _referrerTAllocInstHByDelivCustomerIdList;

    /**
     * Load referrer of TAllocInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTAllocInstHByDelivCustomerIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenterCustomer mCenterCustomer : <span style="color: #553000">mCenterCustomerList</span>) {
     *     ... = mCenterCustomer.<span style="color: #CC4747">getTAllocInstHByDelivCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHByDelivCustomerIdList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHByDelivCustomerIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHByDelivCustomerIdList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHByDelivCustomerIdList, _selector));
    }

    protected List<TAllocInstH> _referrerTAllocInstHBySupplyCustomerIdList;

    /**
     * Load referrer of TAllocInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTAllocInstHBySupplyCustomerIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenterCustomer mCenterCustomer : <span style="color: #553000">mCenterCustomerList</span>) {
     *     ... = mCenterCustomer.<span style="color: #CC4747">getTAllocInstHBySupplyCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHBySupplyCustomerIdList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHBySupplyCustomerIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHBySupplyCustomerIdList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHBySupplyCustomerIdList, _selector));
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

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMDeliveryCourse _foreignMDeliveryCourseLoader;
    public LoaderOfMDeliveryCourse pulloutMDeliveryCourse() {
        if (_foreignMDeliveryCourseLoader == null)
        { _foreignMDeliveryCourseLoader = new LoaderOfMDeliveryCourse().ready(myBhv().pulloutMDeliveryCourse(_selectedList), _selector); }
        return _foreignMDeliveryCourseLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterCustomer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
