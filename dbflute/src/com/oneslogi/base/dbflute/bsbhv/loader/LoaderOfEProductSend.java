package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRODUCT_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_SEND_ID
 *
 * [column]
 *     PRODUCT_SEND_ID, SEND_CD, SEND_ROW_ID, PROCESSED_FLG, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, PRICE_BUY, UNIT2, BX_PER_NUMBER, P_BX_COUNT, F_USER1, LENGTH1, WIDTH1, HEIGHT1, P_ODD, SP_OPERATOR1, MANUITEMCD, USERUSE3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SEND_ID
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
public class LoaderOfEProductSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EProductSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EProductSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEProductSend ready(List<EProductSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EProductSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EProductSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EProductSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
