package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CENTER_CLASS_DTL_SUB as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CLASS_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_DTL_ID, OTHERCD1, OTHERCD2, OTHERCD3, OTHERCD4, OTHERCD5, OTHER1_COMMENT, OTHER2_COMMENT, OTHER3_COMMENT, OTHER4_COMMENT, OTHER5_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_CENTER_CLASS_DTL
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenterClassDtl
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterClassDtlSub {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterClassDtlSub> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterClassDtlSubBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterClassDtlSub ready(List<MCenterClassDtlSub> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterClassDtlSubBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterClassDtlSubBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtl() {
        if (_foreignMCenterClassDtlLoader == null)
        { _foreignMCenterClassDtlLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtl(_selectedList), _selector); }
        return _foreignMCenterClassDtlLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterClassDtlSub> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
