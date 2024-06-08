package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKSOSHIP as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKSORECEIVE_ID
 *
 * [column]
 *     WKSORECEIVE_ID, SO_KEY, SOLINENO, PLNO, PRODUCT_CD, LOT4, PALLET_BARCODE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKSORECEIVE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWWksoship {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWksoship> _selectedList;
    protected BehaviorSelector _selector;
    protected WWksoshipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWksoship ready(List<WWksoship> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWksoshipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWksoshipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWksoship> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
