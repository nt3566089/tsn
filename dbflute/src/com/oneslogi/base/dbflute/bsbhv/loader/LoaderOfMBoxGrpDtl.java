package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_BOX_GRP_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     BOX_GRP_DTL_ID
 *
 * [column]
 *     BOX_GRP_DTL_ID, BOX_GRP_ID, BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_BOX, M_BOX_GRP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mBox, mBoxGrp
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMBoxGrpDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MBoxGrpDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected MBoxGrpDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMBoxGrpDtl ready(List<MBoxGrpDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MBoxGrpDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MBoxGrpDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
    }

    protected LoaderOfMBoxGrp _foreignMBoxGrpLoader;
    public LoaderOfMBoxGrp pulloutMBoxGrp() {
        if (_foreignMBoxGrpLoader == null)
        { _foreignMBoxGrpLoader = new LoaderOfMBoxGrp().ready(myBhv().pulloutMBoxGrp(_selectedList), _selector); }
        return _foreignMBoxGrpLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MBoxGrpDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
