package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_RECEIVE_PLAN_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, LINE_NO, RECEIVE_STATUS, PLAN_CLIENT_ORDER_NO, PLAN_WAREHOUSE_ID, PLAN_WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_LOCATION_ID, PLAN_LOCATION_CD, PLAN_STORE_LABEL_NO, PLAN_NUM, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_LOCATION, M_WAREHOUSE, M_PRODUCT, T_RECEIVE_PLAN_H, B_CLASS_DTL(ByErrorFlg), T_RECEIVE_PLAN_SPARE(AsOne), T_TRRCVDETAIL(AsOne)
 *
 * [referrer table]
 *     T_STORE_RECORD_B, T_RECEIVE_PLAN_SPARE, T_TRRCVDETAIL
 *
 * [foreign property]
 *     mLocation, mWarehouse, mProduct, tReceivePlanH, bClassDtlByErrorFlg, bClassDtlByReceiveStatus, tReceivePlanSpareAsOne, tTrrcvdetailAsOne
 *
 * [referrer property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanB> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanB ready(List<TReceivePlanB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TStoreRecordB> _referrerTStoreRecordBList;

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * T_STORE_RECORD_B by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanB tReceivePlanB : <span style="color: #553000">tReceivePlanBList</span>) {
     *     ... = tReceivePlanB.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanBId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanBId_Asc();
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
    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfTReceivePlanH _foreignTReceivePlanHLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanH() {
        if (_foreignTReceivePlanHLoader == null)
        { _foreignTReceivePlanHLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanH(_selectedList), _selector); }
        return _foreignTReceivePlanHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveStatus() {
        if (_foreignBClassDtlByReceiveStatusLoader == null)
        { _foreignBClassDtlByReceiveStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveStatusLoader;
    }

    protected LoaderOfTReceivePlanSpare _foreignTReceivePlanSpareAsOneLoader;
    public LoaderOfTReceivePlanSpare pulloutTReceivePlanSpareAsOne() {
        if (_foreignTReceivePlanSpareAsOneLoader == null)
        { _foreignTReceivePlanSpareAsOneLoader = new LoaderOfTReceivePlanSpare().ready(myBhv().pulloutTReceivePlanSpareAsOne(_selectedList), _selector); }
        return _foreignTReceivePlanSpareAsOneLoader;
    }

    protected LoaderOfTTrrcvdetail _foreignTTrrcvdetailAsOneLoader;
    public LoaderOfTTrrcvdetail pulloutTTrrcvdetailAsOne() {
        if (_foreignTTrrcvdetailAsOneLoader == null)
        { _foreignTTrrcvdetailAsOneLoader = new LoaderOfTTrrcvdetail().ready(myBhv().pulloutTTrrcvdetailAsOne(_selectedList), _selector); }
        return _foreignTTrrcvdetailAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
