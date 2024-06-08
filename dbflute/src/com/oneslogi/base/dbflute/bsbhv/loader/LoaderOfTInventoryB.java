package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_INVENTORY_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, PRODUCT_CD, FIRMTRANSPORT_CD, MANUFACTURE_DT, MANUFACTURE_SYMBOL, FCFLG, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, INVENTORY_INPUT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, T_INVENTORY_H, M_STOCK_TYPE, M_LOCATION, M_WAREHOUSE, T_STORE_NO, T_MOVE_INST_H, T_LOT, T_STOCK, M_SHAPE, M_PRODUCT, B_CLASS_DTL(ByInputType), T_INVENTORY_R(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_INP_HIST, T_INVENTORY_R
 *
 * [foreign property]
 *     mCustomerByDepositId, tInventoryH, mStockType, mLocation, mWarehouse, tStoreNo, mCustomerBySupplierId, tMoveInstH, tLot, tStock, mShape, mProduct, bClassDtlByInputType, bClassDtlByStockAdjustFlg, tInventoryRAsOne
 *
 * [referrer property]
 *     tInventoryInpHistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryB> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryB ready(List<TInventoryB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TInventoryInpHist> _referrerTInventoryInpHistList;

    /**
     * Load referrer of TInventoryInpHistList by the set-upper of referrer. <br>
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tInventoryBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTInventoryInpHistList</span>(<span style="color: #553000">histCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">histCB</span>.setupSelect...
     *         <span style="color: #553000">histCB</span>.query().set...
     *         <span style="color: #553000">histCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">histLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    histLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TInventoryB tInventoryB : <span style="color: #553000">tInventoryBList</span>) {
     *     ... = tInventoryB.<span style="color: #CC4747">getTInventoryInpHistList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryBId_InScope(pkList);
     * cb.query().addOrderBy_InventoryBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryInpHist> loadTInventoryInpHistList(ConditionBeanSetupper<TInventoryInpHistCB> refCBLambda) {
        myBhv().loadTInventoryInpHistList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryInpHistList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryInpHist().ready(_referrerTInventoryInpHistList, _selector));
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

    protected LoaderOfTInventoryH _foreignTInventoryHLoader;
    public LoaderOfTInventoryH pulloutTInventoryH() {
        if (_foreignTInventoryHLoader == null)
        { _foreignTInventoryHLoader = new LoaderOfTInventoryH().ready(myBhv().pulloutTInventoryH(_selectedList), _selector); }
        return _foreignTInventoryHLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

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

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerBySupplierIdLoader;
    public LoaderOfMCustomer pulloutMCustomerBySupplierId() {
        if (_foreignMCustomerBySupplierIdLoader == null)
        { _foreignMCustomerBySupplierIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerBySupplierId(_selectedList), _selector); }
        return _foreignMCustomerBySupplierIdLoader;
    }

    protected LoaderOfTMoveInstH _foreignTMoveInstHLoader;
    public LoaderOfTMoveInstH pulloutTMoveInstH() {
        if (_foreignTMoveInstHLoader == null)
        { _foreignTMoveInstHLoader = new LoaderOfTMoveInstH().ready(myBhv().pulloutTMoveInstH(_selectedList), _selector); }
        return _foreignTMoveInstHLoader;
    }

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockAdjustFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockAdjustFlg() {
        if (_foreignBClassDtlByStockAdjustFlgLoader == null)
        { _foreignBClassDtlByStockAdjustFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockAdjustFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockAdjustFlgLoader;
    }

    protected LoaderOfTInventoryR _foreignTInventoryRAsOneLoader;
    public LoaderOfTInventoryR pulloutTInventoryRAsOne() {
        if (_foreignTInventoryRAsOneLoader == null)
        { _foreignTInventoryRAsOneLoader = new LoaderOfTInventoryR().ready(myBhv().pulloutTInventoryRAsOne(_selectedList), _selector); }
        return _foreignTInventoryRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInventoryB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
