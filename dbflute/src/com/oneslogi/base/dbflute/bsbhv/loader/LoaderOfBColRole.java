package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_COL_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     COL_ROLE_ID
 *
 * [column]
 *     COL_ROLE_ID, COL_ID, ROLE_ID, VISIBLE, EDITABLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_COL, B_ROLE, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bCol, bRole, bClassDtlByVisible, bClassDtlByEditable
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBColRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BColRole> _selectedList;
    protected BehaviorSelector _selector;
    protected BColRoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBColRole ready(List<BColRole> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BColRoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BColRoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCol _foreignBColLoader;
    public LoaderOfBCol pulloutBCol() {
        if (_foreignBColLoader == null)
        { _foreignBColLoader = new LoaderOfBCol().ready(myBhv().pulloutBCol(_selectedList), _selector); }
        return _foreignBColLoader;
    }

    protected LoaderOfBRole _foreignBRoleLoader;
    public LoaderOfBRole pulloutBRole() {
        if (_foreignBRoleLoader == null)
        { _foreignBRoleLoader = new LoaderOfBRole().ready(myBhv().pulloutBRole(_selectedList), _selector); }
        return _foreignBRoleLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByVisibleLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByVisible() {
        if (_foreignBClassDtlByVisibleLoader == null)
        { _foreignBClassDtlByVisibleLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByVisible(_selectedList), _selector); }
        return _foreignBClassDtlByVisibleLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEditableLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEditable() {
        if (_foreignBClassDtlByEditableLoader == null)
        { _foreignBClassDtlByEditableLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEditable(_selectedList), _selector); }
        return _foreignBClassDtlByEditableLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BColRole> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
