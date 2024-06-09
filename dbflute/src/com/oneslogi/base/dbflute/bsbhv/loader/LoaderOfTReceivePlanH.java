package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_RECEIVE_PLAN_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, T_RECEIVE_PLAN_H, T_PICKING_H, M_CUSTOMER, M_PROCESS_TYPE, M_STOCK_TYPE, B_CLASS_DTL(ByCenterTransitFlg), T_RECEIVE_PLAN_R(AsOne), T_TRRCV(AsOne)
 *
 * [referrer table]
 *     T_RECEIVE_PLAN_B, T_RECEIVE_PLAN_H, T_STORE_RECORD_H, T_RECEIVE_PLAN_R, T_TRRCV
 *
 * [foreign property]
 *     mCenter, mClient, tReceivePlanHSelf, tPickingH, mCustomerByPlanDepositId, mCustomerByPlanSupplierId, mProcessType, mStockType, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne, tTrrcvAsOne
 *
 * [referrer property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanH> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanH ready(List<TReceivePlanH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReceivePlanB> _referrerTReceivePlanBList;

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanB> loadTReceivePlanBList(ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        myBhv().loadTReceivePlanBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanBList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanB().ready(_referrerTReceivePlanBList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHSelfList;

    /**
     * Load referrer of TReceivePlanHSelfList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTReceivePlanHSelfList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTReceivePlanHSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_OldReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHSelfList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHSelfList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHSelfList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHList;

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHList, _selector));
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

    protected LoaderOfTReceivePlanH _foreignTReceivePlanHSelfLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanHSelf() {
        if (_foreignTReceivePlanHSelfLoader == null)
        { _foreignTReceivePlanHSelfLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanHSelf(_selectedList), _selector); }
        return _foreignTReceivePlanHSelfLoader;
    }

    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByPlanDepositIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByPlanDepositId() {
        if (_foreignMCustomerByPlanDepositIdLoader == null)
        { _foreignMCustomerByPlanDepositIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByPlanDepositId(_selectedList), _selector); }
        return _foreignMCustomerByPlanDepositIdLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByPlanSupplierIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByPlanSupplierId() {
        if (_foreignMCustomerByPlanSupplierIdLoader == null)
        { _foreignMCustomerByPlanSupplierIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByPlanSupplierId(_selectedList), _selector); }
        return _foreignMCustomerByPlanSupplierIdLoader;
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

    protected LoaderOfBClassDtl _foreignBClassDtlByCenterTransitFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCenterTransitFlg() {
        if (_foreignBClassDtlByCenterTransitFlgLoader == null)
        { _foreignBClassDtlByCenterTransitFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCenterTransitFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCenterTransitFlgLoader;
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

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveDeliveryStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveDeliveryStatus() {
        if (_foreignBClassDtlByReceiveDeliveryStatusLoader == null)
        { _foreignBClassDtlByReceiveDeliveryStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveDeliveryStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveDeliveryStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveStatus() {
        if (_foreignBClassDtlByReceiveStatusLoader == null)
        { _foreignBClassDtlByReceiveStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveStatusLoader;
    }

    protected LoaderOfTReceivePlanR _foreignTReceivePlanRAsOneLoader;
    public LoaderOfTReceivePlanR pulloutTReceivePlanRAsOne() {
        if (_foreignTReceivePlanRAsOneLoader == null)
        { _foreignTReceivePlanRAsOneLoader = new LoaderOfTReceivePlanR().ready(myBhv().pulloutTReceivePlanRAsOne(_selectedList), _selector); }
        return _foreignTReceivePlanRAsOneLoader;
    }

    protected LoaderOfTTrrcv _foreignTTrrcvAsOneLoader;
    public LoaderOfTTrrcv pulloutTTrrcvAsOne() {
        if (_foreignTTrrcvAsOneLoader == null)
        { _foreignTTrrcvAsOneLoader = new LoaderOfTTrrcv().ready(myBhv().pulloutTTrrcvAsOne(_selectedList), _selector); }
        return _foreignTTrrcvAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
