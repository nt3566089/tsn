package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_CLASS_GRP_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS_GRP_DTL_ID
 *
 * [column]
 *     CLASS_GRP_DTL_ID, CLASS_GRP_ID, CLASS_DTL_ID, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL, B_CLASS_GRP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtl, bClassGrp
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBClassGrpDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BClassGrpDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected BClassGrpDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBClassGrpDtl ready(List<BClassGrpDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BClassGrpDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BClassGrpDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlLoader;
    public LoaderOfBClassDtl pulloutBClassDtl() {
        if (_foreignBClassDtlLoader == null)
        { _foreignBClassDtlLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtl(_selectedList), _selector); }
        return _foreignBClassDtlLoader;
    }

    protected LoaderOfBClassGrp _foreignBClassGrpLoader;
    public LoaderOfBClassGrp pulloutBClassGrp() {
        if (_foreignBClassGrpLoader == null)
        { _foreignBClassGrpLoader = new LoaderOfBClassGrp().ready(myBhv().pulloutBClassGrp(_selectedList), _selector); }
        return _foreignBClassGrpLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BClassGrpDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
