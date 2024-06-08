package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_DATA_INPUT_TYPE_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     DATA_INPUT_TYPE_B_ID
 *
 * [column]
 *     DATA_INPUT_TYPE_B_ID, DATA_INPUT_TYPE_ID, COL_NO, COL_NM, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DATA_INPUT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_DATA_INPUT_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mDataInputType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMDataInputTypeB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MDataInputTypeB> _selectedList;
    protected BehaviorSelector _selector;
    protected MDataInputTypeBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMDataInputTypeB ready(List<MDataInputTypeB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MDataInputTypeBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MDataInputTypeBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMDataInputType _foreignMDataInputTypeLoader;
    public LoaderOfMDataInputType pulloutMDataInputType() {
        if (_foreignMDataInputTypeLoader == null)
        { _foreignMDataInputTypeLoader = new LoaderOfMDataInputType().ready(myBhv().pulloutMDataInputType(_selectedList), _selector); }
        return _foreignMDataInputTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MDataInputTypeB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
