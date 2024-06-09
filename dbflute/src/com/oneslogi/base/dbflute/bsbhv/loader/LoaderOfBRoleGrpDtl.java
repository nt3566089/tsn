package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_ROLE_GRP_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     ROLE_GRP_DTL_ID
 *
 * [column]
 *     ROLE_GRP_DTL_ID, ROLE_GRP_ID, ROLE_ID, APPLY_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ROLE_GRP, B_ROLE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bRoleGrp, bRole
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBRoleGrpDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BRoleGrpDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected BRoleGrpDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBRoleGrpDtl ready(List<BRoleGrpDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BRoleGrpDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BRoleGrpDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBRoleGrp _foreignBRoleGrpLoader;
    public LoaderOfBRoleGrp pulloutBRoleGrp() {
        if (_foreignBRoleGrpLoader == null)
        { _foreignBRoleGrpLoader = new LoaderOfBRoleGrp().ready(myBhv().pulloutBRoleGrp(_selectedList), _selector); }
        return _foreignBRoleGrpLoader;
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
    public List<BRoleGrpDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
