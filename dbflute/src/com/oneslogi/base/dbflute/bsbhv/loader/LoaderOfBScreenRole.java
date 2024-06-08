package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_SCREEN_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SCREEN_ROLE_ID
 *
 * [column]
 *     SCREEN_ROLE_ID, ROLE_ID, SCREEN_ID, VISIBLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SCREEN_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ROLE, B_SCREEN, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bRole, bScreen, bClassDtlByVisible
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBScreenRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BScreenRole> _selectedList;
    protected BehaviorSelector _selector;
    protected BScreenRoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBScreenRole ready(List<BScreenRole> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BScreenRoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BScreenRoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBRole _foreignBRoleLoader;
    public LoaderOfBRole pulloutBRole() {
        if (_foreignBRoleLoader == null)
        { _foreignBRoleLoader = new LoaderOfBRole().ready(myBhv().pulloutBRole(_selectedList), _selector); }
        return _foreignBRoleLoader;
    }

    protected LoaderOfBScreen _foreignBScreenLoader;
    public LoaderOfBScreen pulloutBScreen() {
        if (_foreignBScreenLoader == null)
        { _foreignBScreenLoader = new LoaderOfBScreen().ready(myBhv().pulloutBScreen(_selectedList), _selector); }
        return _foreignBScreenLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByVisibleLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByVisible() {
        if (_foreignBClassDtlByVisibleLoader == null)
        { _foreignBClassDtlByVisibleLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByVisible(_selectedList), _selector); }
        return _foreignBClassDtlByVisibleLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BScreenRole> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
