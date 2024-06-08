package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRREFNOCTLDM as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRREFNOCTLDM_ID
 *
 * [column]
 *     TRREFNOCTLDM_ID, REFNO, PLANRCVFLG, FTSRCVFLG, TRRCVADDFLG, WAREHOUSECD, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRREFNOCTLDM_ID
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
public class LoaderOfTTrrefnoctldm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrefnoctldm> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrefnoctldmBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrefnoctldm ready(List<TTrrefnoctldm> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrefnoctldmBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrefnoctldmBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrefnoctldm> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
