package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_MH_STOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     MH_STOCK_ID
 *
 * [column]
 *     MH_STOCK_ID, COMPANY_CD, LINBLK, ZONE_CD, LOCNO, LOCKBN, PRODUCT_CD, TSTINVCB, TSTINVCT, TOSPLCBQA, TOSPLCTQA, TSPLCB, TSPLCT, PRESPLCBQA, PRESPLCTQA, TPRESPLCB, TPRESPLCT, TINVMDTCBS, TINVMDTCB, TINVMDTCTS, TINVMDTCT, CSPLNUN, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_STOCK_ID
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
public class LoaderOfEMhStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EMhStock> _selectedList;
    protected BehaviorSelector _selector;
    protected EMhStockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEMhStock ready(List<EMhStock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EMhStockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EMhStockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EMhStock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
