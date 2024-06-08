package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_IMPORT_TYPE_B_COPY_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPORT_TYPE_B_COPY_H_ID
 *
 * [column]
 *     IMPORT_TYPE_B_COPY_H_ID, IMPORT_TYPE_B_ID, COPY_H_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_B_COPY_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_IMPORT_TYPE_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mImportTypeB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMImportTypeBCopyH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MImportTypeBCopyH> _selectedList;
    protected BehaviorSelector _selector;
    protected MImportTypeBCopyHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMImportTypeBCopyH ready(List<MImportTypeBCopyH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MImportTypeBCopyHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MImportTypeBCopyHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMImportTypeB _foreignMImportTypeBLoader;
    public LoaderOfMImportTypeB pulloutMImportTypeB() {
        if (_foreignMImportTypeBLoader == null)
        { _foreignMImportTypeBLoader = new LoaderOfMImportTypeB().ready(myBhv().pulloutMImportTypeB(_selectedList), _selector); }
        return _foreignMImportTypeBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MImportTypeBCopyH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
