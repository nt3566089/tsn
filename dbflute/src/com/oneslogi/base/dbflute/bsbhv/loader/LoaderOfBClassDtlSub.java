package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_CLASS_DTL_SUB as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS_DTL_ID
 *
 * [column]
 *     CLASS_DTL_ID, OTHERCD1, OTHERCD2, OTHERCD3, OTHERCD4, OTHERCD5, OTHER1_COMMENT, OTHER2_COMMENT, OTHER3_COMMENT, OTHER4_COMMENT, OTHER5_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     B_CLASS_DTL
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtl
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBClassDtlSub {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BClassDtlSub> _selectedList;
    protected BehaviorSelector _selector;
    protected BClassDtlSubBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBClassDtlSub ready(List<BClassDtlSub> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BClassDtlSubBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BClassDtlSubBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlLoader;
    public LoaderOfBClassDtl pulloutBClassDtl() {
        if (_foreignBClassDtlLoader == null)
        { _foreignBClassDtlLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtl(_selectedList), _selector); }
        return _foreignBClassDtlLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BClassDtlSub> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
