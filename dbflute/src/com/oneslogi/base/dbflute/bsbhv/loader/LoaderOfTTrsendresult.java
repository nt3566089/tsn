package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSENDRESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSENDRESULT_ID
 *
 * [column]
 *     TRSENDRESULT_ID, WAREHOUSECD, REFNO, PRODUCT_CD, ORDERNO, CASEQTY, FRACTQTY, PLANQTY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSENDRESULT_ID
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
public class LoaderOfTTrsendresult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsendresult> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsendresultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsendresult ready(List<TTrsendresult> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsendresultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsendresultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsendresult> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
