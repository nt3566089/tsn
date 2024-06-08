package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKPALLETSYMBOLJT as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKSOJTKEY, SYMBOLNO
 *
 * [column]
 *     WKSOJTKEY, PALLETNO, OWNERSONO, SOPALLETNO, RCVKEY, SYMBOLNO, SORTEDQTY1, LOTKEY, PACKEDFLG, ENTERFLG, ACTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfWWkpalletsymboljt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkpalletsymboljt> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkpalletsymboljtBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkpalletsymboljt ready(List<WWkpalletsymboljt> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkpalletsymboljtBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkpalletsymboljtBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkpalletsymboljt> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
