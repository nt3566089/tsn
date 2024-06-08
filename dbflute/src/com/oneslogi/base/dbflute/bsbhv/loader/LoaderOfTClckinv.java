package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CLCKINV as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLCKINV_ID
 *
 * [column]
 *     CLCKINV_ID, CENTER_ID, LOCATION_ID, PRESRCBQA, PRESRCTQA, LCKCBIVQ, LCKCTIVQ, DSCBQA, DSCTQA, TOSPLCBQA, TOSPLCTQA, PRESPLCBQA, PRESPLCTQA, TSTINVCB, TSTINVCT, TSPLCB, TSPLCT, TPRESPLCB, TPRESPLCT, TINVMDTCB, TINVMDTCT, CSPLNUN, UPFG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLCKINV_ID
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
public class LoaderOfTClckinv {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TClckinv> _selectedList;
    protected BehaviorSelector _selector;
    protected TClckinvBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTClckinv ready(List<TClckinv> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TClckinvBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TClckinvBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TClckinv> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
