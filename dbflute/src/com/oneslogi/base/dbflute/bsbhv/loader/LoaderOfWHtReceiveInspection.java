package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_HT_RECEIVE_INSPECTION as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_RECEIVE_INSPECTION_ID
 *
 * [column]
 *     HT_RECEIVE_INSPECTION_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, STOCK_TYPE_ID, STK_CLS_NM, PIECE_QTY_RCV_ORD, PIECE_QTY_RCV, RCV_LOC_ID, RCV_LOC_CD, RCV_LOC_NM, HT_WORK_NO, ONS_NUM, LOT_ID, LOT, LIMIT_DT, LABEL_SELECT, WORK_START_DT, WORK_END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_RECEIVE_INSPECTION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_PRODUCT, M_CENTER, M_LOCATION, M_WAREHOUSE, T_LOT, M_STOCK_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mProduct, mCenter, mLocation, mWarehouse, tLot, mStockType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWHtReceiveInspection {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WHtReceiveInspection> _selectedList;
    protected BehaviorSelector _selector;
    protected WHtReceiveInspectionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWHtReceiveInspection ready(List<WHtReceiveInspection> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WHtReceiveInspectionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WHtReceiveInspectionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
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

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WHtReceiveInspection> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
