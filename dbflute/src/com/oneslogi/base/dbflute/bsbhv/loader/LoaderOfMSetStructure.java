package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_SET_STRUCTURE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SET_STRUCTURE_ID
 *
 * [column]
 *     SET_STRUCTURE_ID, SET_PARENT_ID, PRODUCT_ID, UNIT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SET_STRUCTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT, M_SET_PARENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, mSetParent
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMSetStructure {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MSetStructure> _selectedList;
    protected BehaviorSelector _selector;
    protected MSetStructureBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMSetStructure ready(List<MSetStructure> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MSetStructureBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MSetStructureBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMSetParent _foreignMSetParentLoader;
    public LoaderOfMSetParent pulloutMSetParent() {
        if (_foreignMSetParentLoader == null)
        { _foreignMSetParentLoader = new LoaderOfMSetParent().ready(myBhv().pulloutMSetParent(_selectedList), _selector); }
        return _foreignMSetParentLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MSetStructure> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
