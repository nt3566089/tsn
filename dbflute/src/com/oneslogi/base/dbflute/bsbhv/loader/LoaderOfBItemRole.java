package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_ITEM_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ITEM_ROLE_ID
 *
 * [column]
 *     ITEM_ROLE_ID, ROLE_ID, ITEM_ID, VISIBLE, EDITABLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ROLE, B_ITEM, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bRole, bItem, bClassDtlByVisible, bClassDtlByEditable
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBItemRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BItemRole> _selectedList;
    protected BehaviorSelector _selector;
    protected BItemRoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBItemRole ready(List<BItemRole> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BItemRoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BItemRoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBRole _foreignBRoleLoader;
    public LoaderOfBRole pulloutBRole() {
        if (_foreignBRoleLoader == null)
        { _foreignBRoleLoader = new LoaderOfBRole().ready(myBhv().pulloutBRole(_selectedList), _selector); }
        return _foreignBRoleLoader;
    }

    protected LoaderOfBItem _foreignBItemLoader;
    public LoaderOfBItem pulloutBItem() {
        if (_foreignBItemLoader == null)
        { _foreignBItemLoader = new LoaderOfBItem().ready(myBhv().pulloutBItem(_selectedList), _selector); }
        return _foreignBItemLoader;
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
    public List<BItemRole> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
