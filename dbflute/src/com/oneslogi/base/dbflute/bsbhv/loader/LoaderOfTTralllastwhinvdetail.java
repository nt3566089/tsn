package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRALLLASTWHINVDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     ALLLASTWHINVDETAILKEY
 *
 * [column]
 *     ALLLASTWHINVDETAILKEY, PRODUCT_CD, PRODUCTDATE, DESIGNCD, INVNUM, INVKBNCD, INVKBN, TRANSPORTCD, FIRMCARRYNO, ASSORTEDUNIT, LOCCD, SCHDATE, RECEIVEDATE, OUTPUTTYPE, OUTPUTORG, USETYPE, PROCFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLLASTWHINVDETAILKEY
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
public class LoaderOfTTralllastwhinvdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTralllastwhinvdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTralllastwhinvdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTralllastwhinvdetail ready(List<TTralllastwhinvdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTralllastwhinvdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTralllastwhinvdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTralllastwhinvdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
