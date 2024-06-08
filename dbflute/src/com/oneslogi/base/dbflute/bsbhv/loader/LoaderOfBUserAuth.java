package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_USER_AUTH as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, PASSWORD, SALT, PASSWORD_RESET, PASSWORD_MODIFIED_DATE, LAST_LOGIN_DATE, LAST_FAILED_LOGIN_DATE, FAILED_LOGIN_ATTEMPTS, LOCKOUT, LOCKOUT_DATE, AVAILABLE_START_DATE, AVAILABLE_END_DATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, B_CLASS_DTL(ByPasswordReset)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, bClassDtlByPasswordReset, bClassDtlByLockout
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBUserAuth {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BUserAuth> _selectedList;
    protected BehaviorSelector _selector;
    protected BUserAuthBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBUserAuth ready(List<BUserAuth> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BUserAuthBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BUserAuthBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPasswordResetLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPasswordReset() {
        if (_foreignBClassDtlByPasswordResetLoader == null)
        { _foreignBClassDtlByPasswordResetLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPasswordReset(_selectedList), _selector); }
        return _foreignBClassDtlByPasswordResetLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLockoutLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLockout() {
        if (_foreignBClassDtlByLockoutLoader == null)
        { _foreignBClassDtlByLockoutLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLockout(_selectedList), _selector); }
        return _foreignBClassDtlByLockoutLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BUserAuth> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
