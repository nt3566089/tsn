package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_ALLOC_INST_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     ALLOC_INST_B_ID
 *
 * [column]
 *     ALLOC_INST_B_ID, ALLOC_INST_H_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, LIMIT_DT_REVERSE_FLG, SHIPPING_LIMIT_DT, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, UNIT_NUM, INST_NUM, PROCESS_NO, ALLOC_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_LOT, M_WAREHOUSE, M_CUSTOMER, M_LOCATION, M_PRODUCT, M_SHAPE, T_STORE_NO, M_STOCK_TYPE, T_ALLOC_INST_H, B_CLASS_DTL(ByLimitDtManagFlg), T_ALLOC_LOT(AsOne)
 *
 * [referrer table]
 *     T_PACKING_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK_INOUT, T_ALLOC_LOT
 *
 * [foreign property]
 *     tLot, mWarehouse, mCustomer, mLocation, mProduct, mShape, tStoreNo, mStockType, tAllocInstH, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, tAllocLotAsOne
 *
 * [referrer property]
 *     tPackingBList, tPickingBList, tShippingInstBList, tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTAllocInstB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TAllocInstB> _selectedList;
    protected BehaviorSelector _selector;
    protected TAllocInstBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTAllocInstB ready(List<TAllocInstB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TAllocInstBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TAllocInstBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPackingB> _referrerTPackingBList;

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingB> loadTPackingBList(ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        myBhv().loadTPackingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingB().ready(_referrerTPackingBList, _selector));
    }

    protected List<TPickingB> _referrerTPickingBList;

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingB> loadTPickingBList(ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        myBhv().loadTPickingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingB().ready(_referrerTPickingBList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    protected List<TStockInout> _referrerTStockInoutList;

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockInout> loadTStockInoutList(ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        myBhv().loadTStockInoutList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockInoutList = refLs);
        return hd -> hd.handle(new LoaderOfTStockInout().ready(_referrerTStockInoutList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfTAllocInstH _foreignTAllocInstHLoader;
    public LoaderOfTAllocInstH pulloutTAllocInstH() {
        if (_foreignTAllocInstHLoader == null)
        { _foreignTAllocInstHLoader = new LoaderOfTAllocInstH().ready(myBhv().pulloutTAllocInstH(_selectedList), _selector); }
        return _foreignTAllocInstHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtManagFlg() {
        if (_foreignBClassDtlByLimitDtManagFlgLoader == null)
        { _foreignBClassDtlByLimitDtManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtManagFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtReverseFlg() {
        if (_foreignBClassDtlByLimitDtReverseFlgLoader == null)
        { _foreignBClassDtlByLimitDtReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLotManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLotManagFlg() {
        if (_foreignBClassDtlByLotManagFlgLoader == null)
        { _foreignBClassDtlByLotManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLotManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLotManagFlgLoader;
    }

    protected LoaderOfTAllocLot _foreignTAllocLotAsOneLoader;
    public LoaderOfTAllocLot pulloutTAllocLotAsOne() {
        if (_foreignTAllocLotAsOneLoader == null)
        { _foreignTAllocLotAsOneLoader = new LoaderOfTAllocLot().ready(myBhv().pulloutTAllocLotAsOne(_selectedList), _selector); }
        return _foreignTAllocLotAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TAllocInstB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
