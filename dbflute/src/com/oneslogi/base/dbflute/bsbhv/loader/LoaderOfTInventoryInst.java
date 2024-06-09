package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_INVENTORY_INST as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, INVENTORY_H_ID, DEPOSIT_ID, STOCK_TYPE_ID, FROM_LOCATION_CD, TO_LOCATION_CD, ZONE_ID, FROM_STOCK_INOUT_DT, TO_STOCK_INOUT_DT, STOCK_EXIST_ONLY_FLG, INVENTORY_INST_KBN, LINE_BLOCK, DIRECTIONAL_PISTON, SORTING_ORDER, SORTING_NUM_TIMES, LOCATION_CD, PRODUCT_CD, PRODUCT_DIVISION, LOCATION_GRP, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, T_INVENTORY_H, M_STOCK_TYPE, M_ZONE, B_CLASS_DTL(ByStockExistOnlyFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, tInventoryH, mStockType, mZone, bClassDtlByStockExistOnlyFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryInst {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryInst> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryInstBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryInst ready(List<TInventoryInst> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryInstBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryInstBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
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

    protected LoaderOfMZone _foreignMZoneLoader;
    public LoaderOfMZone pulloutMZone() {
        if (_foreignMZoneLoader == null)
        { _foreignMZoneLoader = new LoaderOfMZone().ready(myBhv().pulloutMZone(_selectedList), _selector); }
        return _foreignMZoneLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockExistOnlyFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockExistOnlyFlg() {
        if (_foreignBClassDtlByStockExistOnlyFlgLoader == null)
        { _foreignBClassDtlByStockExistOnlyFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockExistOnlyFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockExistOnlyFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInventoryInst> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
