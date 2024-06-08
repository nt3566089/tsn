package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKCUTLOCMOVE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SEQNO, SYMBOLNO
 *
 * [column]
 *     SEQNO, SYMBOLNO, PRODUCT_CD, LOT3, LOT1, LOT4, LOT2, OTHERLOT1, QTY, QTYBOWL, MIXEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfWWkcutlocmove {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkcutlocmove> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkcutlocmoveBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkcutlocmove ready(List<WWkcutlocmove> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkcutlocmoveBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkcutlocmoveBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkcutlocmove> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
