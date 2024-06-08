package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRBADITEMCASE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRBADITEMCASE_ID
 *
 * [column]
 *     TRBADITEMCASE_ID, TARGETMON, BADITEMCD, PRODUCT_CD, ITEMCD, LBLKBN, INOUTKBN, CREATEDDATE, REPRINTEDFLG, EXPITEMCD, WAREHOUSECD, CREATEDNUM, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRBADITEMCASE_ID
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
public class LoaderOfTTrbaditemcase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrbaditemcase> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrbaditemcaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrbaditemcase ready(List<TTrbaditemcase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrbaditemcaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrbaditemcaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrbaditemcase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
