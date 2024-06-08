package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_STOCK_INOUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_INOUT_ID
 *
 * [column]
 *     STOCK_INOUT_ID, HIST_DT, FS_STOCK_INOUT_ID, BF_STOCK_INOUT_ID, PROCESS_DT, PROCESS_TYPE_ID, PROCESS_NO, CORRECT_TYPE, STOCK_ID, INOUT_TYPE, STOCK_INOUT_NUM, LogicFlg1, LogicFlg2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PROCESS_TYPE, H_STOCK, B_CLASS_DTL(ByCorrectType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProcessType, hStock, bClassDtlByCorrectType, bClassDtlByInoutType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHStockInout {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HStockInout> _selectedList;
    protected BehaviorSelector _selector;
    protected HStockInoutBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHStockInout ready(List<HStockInout> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HStockInoutBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HStockInoutBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfHStock _foreignHStockLoader;
    public LoaderOfHStock pulloutHStock() {
        if (_foreignHStockLoader == null)
        { _foreignHStockLoader = new LoaderOfHStock().ready(myBhv().pulloutHStock(_selectedList), _selector); }
        return _foreignHStockLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCorrectTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCorrectType() {
        if (_foreignBClassDtlByCorrectTypeLoader == null)
        { _foreignBClassDtlByCorrectTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCorrectType(_selectedList), _selector); }
        return _foreignBClassDtlByCorrectTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInoutTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInoutType() {
        if (_foreignBClassDtlByInoutTypeLoader == null)
        { _foreignBClassDtlByInoutTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInoutType(_selectedList), _selector); }
        return _foreignBClassDtlByInoutTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HStockInout> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
