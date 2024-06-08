package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TREXAMRESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TREXAMRESULT_ID
 *
 * [column]
 *     TREXAMRESULT_ID, CLIENT_ID, CENTER_ID, SUPPLIERRCVNO, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOT_ID, EXAMSTS, EXAMENDSTS, ADDFLG, RECEIVEDATE, SENDFLG, EXAMQTY, RES40QTY, INFERIORQTY, NOTEXAMQTY, FIRSTEXAMSENDFLG, QUALITYEXAMFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TREXAMRESULT_ID
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
public class LoaderOfTTrexamresult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrexamresult> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrexamresultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrexamresult ready(List<TTrexamresult> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrexamresultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrexamresultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrexamresult> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
