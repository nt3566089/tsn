package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_COL_EXT_USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     COL_EXT_USER_ID
 *
 * [column]
 *     COL_EXT_USER_ID, ITEM_ID, COL_CD, USER_ID, COL_ORDER, COL_WIDTH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_EXT_USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ITEM
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bItem
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBColExtUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BColExtUser> _selectedList;
    protected BehaviorSelector _selector;
    protected BColExtUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBColExtUser ready(List<BColExtUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BColExtUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BColExtUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBItem _foreignBItemLoader;
    public LoaderOfBItem pulloutBItem() {
        if (_foreignBItemLoader == null)
        { _foreignBItemLoader = new LoaderOfBItem().ready(myBhv().pulloutBItem(_selectedList), _selector); }
        return _foreignBItemLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BColExtUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
