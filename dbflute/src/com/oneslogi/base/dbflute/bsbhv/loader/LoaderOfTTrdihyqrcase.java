package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRDIHYQRCASE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRDIHYQRCASE_ID
 *
 * [column]
 *     TRDIHYQRCASE_ID, QRCASEKEY, QRDATA, TRANSPORTCD, PRODUCT_CD, DIHYQRHEADER, DIHYQRDETAIL, FLGUNITBOWL, CASEFLG, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRDIHYQRCASE_ID
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
public class LoaderOfTTrdihyqrcase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrdihyqrcase> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrdihyqrcaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrdihyqrcase ready(List<TTrdihyqrcase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrdihyqrcaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrdihyqrcaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrdihyqrcase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
