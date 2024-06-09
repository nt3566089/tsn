package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_SHIPPING_INST_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_H, M_CENTER, M_CLIENT, M_DELIVERY_COURSE, M_CUSTOMER, M_PROCESS_TYPE, M_ZIP(ForDeliv), B_CLASS_DTL(ByDelivTz)
 *
 * [referrer table]
 *     T_EC_ORDER_H, T_SHIPPING_INST_B
 *
 * [foreign property]
 *     tAllocInstH, mCenter, mClient, mDeliveryCourse, mCustomerByDelivCustomerId, mProcessType, mCustomerBySupplyCustomerId, mZipForDeliv, bClassDtlByDelivTz, bClassDtlByEmergencyFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByShippingStatus, bClassDtlByStockOutFlg
 *
 * [referrer property]
 *     tEcOrderHList, tShippingInstBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstH> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstH ready(List<TShippingInstH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TEcOrderH> _referrerTEcOrderHList;

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstH tShippingInstH : <span style="color: #553000">tShippingInstHList</span>) {
     *     ... = tShippingInstH.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderH> loadTEcOrderHList(ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        myBhv().loadTEcOrderHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderHList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderH().ready(_referrerTEcOrderHList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstH tShippingInstH : <span style="color: #553000">tShippingInstHList</span>) {
     *     ... = tShippingInstH.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTAllocInstH _foreignTAllocInstHLoader;
    public LoaderOfTAllocInstH pulloutTAllocInstH() {
        if (_foreignTAllocInstHLoader == null)
        { _foreignTAllocInstHLoader = new LoaderOfTAllocInstH().ready(myBhv().pulloutTAllocInstH(_selectedList), _selector); }
        return _foreignTAllocInstHLoader;
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

    protected LoaderOfMZip _foreignMZipForDelivLoader;
    public LoaderOfMZip pulloutMZipForDeliv() {
        if (_foreignMZipForDelivLoader == null)
        { _foreignMZipForDelivLoader = new LoaderOfMZip().ready(myBhv().pulloutMZipForDeliv(_selectedList), _selector); }
        return _foreignMZipForDelivLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelivTzLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelivTz() {
        if (_foreignBClassDtlByDelivTzLoader == null)
        { _foreignBClassDtlByDelivTzLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelivTz(_selectedList), _selector); }
        return _foreignBClassDtlByDelivTzLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEmergencyFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEmergencyFlg() {
        if (_foreignBClassDtlByEmergencyFlgLoader == null)
        { _foreignBClassDtlByEmergencyFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEmergencyFlg(_selectedList), _selector); }
        return _foreignBClassDtlByEmergencyFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByShippingStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByShippingStatus() {
        if (_foreignBClassDtlByShippingStatusLoader == null)
        { _foreignBClassDtlByShippingStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByShippingStatus(_selectedList), _selector); }
        return _foreignBClassDtlByShippingStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockOutFlg() {
        if (_foreignBClassDtlByStockOutFlgLoader == null)
        { _foreignBClassDtlByStockOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
