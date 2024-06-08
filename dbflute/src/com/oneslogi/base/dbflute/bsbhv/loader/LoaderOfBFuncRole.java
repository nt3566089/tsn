package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_FUNC_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     FUNC_ROLE_ID
 *
 * [column]
 *     FUNC_ROLE_ID, FUNC_ID, ROLE_ID, USABLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FUNC_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_FUNC, B_ROLE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bFunc, bRole
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBFuncRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BFuncRole> _selectedList;
    protected BehaviorSelector _selector;
    protected BFuncRoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBFuncRole ready(List<BFuncRole> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BFuncRoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BFuncRoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBFunc _foreignBFuncLoader;
    public LoaderOfBFunc pulloutBFunc() {
        if (_foreignBFuncLoader == null)
        { _foreignBFuncLoader = new LoaderOfBFunc().ready(myBhv().pulloutBFunc(_selectedList), _selector); }
        return _foreignBFuncLoader;
    }

    protected LoaderOfBRole _foreignBRoleLoader;
    public LoaderOfBRole pulloutBRole() {
        if (_foreignBRoleLoader == null)
        { _foreignBRoleLoader = new LoaderOfBRole().ready(myBhv().pulloutBRole(_selectedList), _selector); }
        return _foreignBRoleLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BFuncRole> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
