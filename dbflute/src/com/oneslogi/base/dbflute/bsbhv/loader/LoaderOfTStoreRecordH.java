package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_STORE_RECORD_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, CLIENT_RECEIVE_NO, SUPPLIER_ID, DEPOSIT_ID, STORE_RECORD_H_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, T_RECEIVE_PLAN_H, M_CENTER, M_PROCESS_TYPE, M_STOCK_TYPE, M_CLIENT, T_STORE_RECORD_R(AsOne)
 *
 * [referrer table]
 *     T_STORE_RECORD_B, T_STORE_RECORD_R
 *
 * [foreign property]
 *     mCustomerByDepositId, tReceivePlanH, mCenter, mCustomerBySupplierId, mProcessType, mStockType, mClient, tStoreRecordRAsOne
 *
 * [referrer property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStoreRecordH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStoreRecordH> _selectedList;
    protected BehaviorSelector _selector;
    protected TStoreRecordHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStoreRecordH ready(List<TStoreRecordH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStoreRecordHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStoreRecordHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TStoreRecordB> _referrerTStoreRecordBList;

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * T_STORE_RECORD_B by STORE_RECORD_H_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStoreRecordHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStoreRecordH tStoreRecordH : <span style="color: #553000">tStoreRecordHList</span>) {
     *     ... = tStoreRecordH.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreRecordHId_InScope(pkList);
     * cb.query().addOrderBy_StoreRecordHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordB> loadTStoreRecordBList(ConditionBeanSetupper<TStoreRecordBCB> refCBLambda) {
        myBhv().loadTStoreRecordBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordBList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordB().ready(_referrerTStoreRecordBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCustomer _foreignMCustomerByDepositIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByDepositId() {
        if (_foreignMCustomerByDepositIdLoader == null)
        { _foreignMCustomerByDepositIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByDepositId(_selectedList), _selector); }
        return _foreignMCustomerByDepositIdLoader;
    }

    protected LoaderOfTReceivePlanH _foreignTReceivePlanHLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanH() {
        if (_foreignTReceivePlanHLoader == null)
        { _foreignTReceivePlanHLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanH(_selectedList), _selector); }
        return _foreignTReceivePlanHLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerBySupplierIdLoader;
    public LoaderOfMCustomer pulloutMCustomerBySupplierId() {
        if (_foreignMCustomerBySupplierIdLoader == null)
        { _foreignMCustomerBySupplierIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerBySupplierId(_selectedList), _selector); }
        return _foreignMCustomerBySupplierIdLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfTStoreRecordR _foreignTStoreRecordRAsOneLoader;
    public LoaderOfTStoreRecordR pulloutTStoreRecordRAsOne() {
        if (_foreignTStoreRecordRAsOneLoader == null)
        { _foreignTStoreRecordRAsOneLoader = new LoaderOfTStoreRecordR().ready(myBhv().pulloutTStoreRecordRAsOne(_selectedList), _selector); }
        return _foreignTStoreRecordRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStoreRecordH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
