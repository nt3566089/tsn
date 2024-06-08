package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CENTER_CLASS_GRP_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CLASS_GRP_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_GRP_DTL_ID, CENTER_CLASS_GRP_ID, CENTER_CLASS_DTL_ID, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER_CLASS_DTL, M_CENTER_CLASS_GRP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenterClassDtl, mCenterClassGrp
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterClassGrpDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterClassGrpDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterClassGrpDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterClassGrpDtl ready(List<MCenterClassGrpDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterClassGrpDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterClassGrpDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtl() {
        if (_foreignMCenterClassDtlLoader == null)
        { _foreignMCenterClassDtlLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtl(_selectedList), _selector); }
        return _foreignMCenterClassDtlLoader;
    }

    protected LoaderOfMCenterClassGrp _foreignMCenterClassGrpLoader;
    public LoaderOfMCenterClassGrp pulloutMCenterClassGrp() {
        if (_foreignMCenterClassGrpLoader == null)
        { _foreignMCenterClassGrpLoader = new LoaderOfMCenterClassGrp().ready(myBhv().pulloutMCenterClassGrp(_selectedList), _selector); }
        return _foreignMCenterClassGrpLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterClassGrpDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
