package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_ALLOC_INST_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     ALLOC_INST_H_ID
 *
 * [column]
 *     ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_DELIVERY_COURSE, M_CUSTOMER, M_PROCESS_TYPE, T_PICKING_H, M_CENTER_CUSTOMER(ByDelivCustomerId), B_CLASS_DTL(ByDelivTz)
 *
 * [referrer table]
 *     T_ALLOC_INST_B, T_PACKING_H, T_PICKING_H, T_SHIPPING_INST_H
 *
 * [foreign property]
 *     mCenter, mClient, mDeliveryCourse, mCustomerByDelivCustomerId, mProcessType, mCustomerBySupplyCustomerId, tPickingH, mCenterCustomerByDelivCustomerId, mCenterCustomerBySupplyCustomerId, bClassDtlByDelivTz
 *
 * [referrer property]
 *     tAllocInstBList, tPackingHList, tPickingHList, tShippingInstHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTAllocInstH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TAllocInstH> _selectedList;
    protected BehaviorSelector _selector;
    protected TAllocInstHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTAllocInstH ready(List<TAllocInstH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TAllocInstHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TAllocInstHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by ALLOC_INST_H_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TPackingH> _referrerTPackingHList;

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by ALLOC_INST_H_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHList, _selector));
    }

    protected List<TPickingH> _referrerTPickingHList;

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by ALLOC_INST_H_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingH> loadTPickingHList(ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        myBhv().loadTPickingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingH().ready(_referrerTPickingHList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHList;

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by ALLOC_INST_H_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHList, _selector));
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

    protected LoaderOfMDeliveryCourse _foreignMDeliveryCourseLoader;
    public LoaderOfMDeliveryCourse pulloutMDeliveryCourse() {
        if (_foreignMDeliveryCourseLoader == null)
        { _foreignMDeliveryCourseLoader = new LoaderOfMDeliveryCourse().ready(myBhv().pulloutMDeliveryCourse(_selectedList), _selector); }
        return _foreignMDeliveryCourseLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByDelivCustomerIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByDelivCustomerId() {
        if (_foreignMCustomerByDelivCustomerIdLoader == null)
        { _foreignMCustomerByDelivCustomerIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByDelivCustomerId(_selectedList), _selector); }
        return _foreignMCustomerByDelivCustomerIdLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerBySupplyCustomerIdLoader;
    public LoaderOfMCustomer pulloutMCustomerBySupplyCustomerId() {
        if (_foreignMCustomerBySupplyCustomerIdLoader == null)
        { _foreignMCustomerBySupplyCustomerIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerBySupplyCustomerId(_selectedList), _selector); }
        return _foreignMCustomerBySupplyCustomerIdLoader;
    }

    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfMCenterCustomer _foreignMCenterCustomerByDelivCustomerIdLoader;
    public LoaderOfMCenterCustomer pulloutMCenterCustomerByDelivCustomerId() {
        if (_foreignMCenterCustomerByDelivCustomerIdLoader == null)
        { _foreignMCenterCustomerByDelivCustomerIdLoader = new LoaderOfMCenterCustomer().ready(myBhv().pulloutMCenterCustomerByDelivCustomerId(_selectedList), _selector); }
        return _foreignMCenterCustomerByDelivCustomerIdLoader;
    }

    protected LoaderOfMCenterCustomer _foreignMCenterCustomerBySupplyCustomerIdLoader;
    public LoaderOfMCenterCustomer pulloutMCenterCustomerBySupplyCustomerId() {
        if (_foreignMCenterCustomerBySupplyCustomerIdLoader == null)
        { _foreignMCenterCustomerBySupplyCustomerIdLoader = new LoaderOfMCenterCustomer().ready(myBhv().pulloutMCenterCustomerBySupplyCustomerId(_selectedList), _selector); }
        return _foreignMCenterCustomerBySupplyCustomerIdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelivTzLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelivTz() {
        if (_foreignBClassDtlByDelivTzLoader == null)
        { _foreignBClassDtlByDelivTzLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelivTz(_selectedList), _selector); }
        return _foreignBClassDtlByDelivTzLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TAllocInstH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
