package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRODUCT_SUPANDDEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_SUPANDDEM_ID
 *
 * [column]
 *     PRODUCT_SUPANDDEM_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SUPANDDEM_ID
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
public class LoaderOfEProductSupanddem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EProductSupanddem> _selectedList;
    protected BehaviorSelector _selector;
    protected EProductSupanddemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEProductSupanddem ready(List<EProductSupanddem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EProductSupanddemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EProductSupanddemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EProductSupanddem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
