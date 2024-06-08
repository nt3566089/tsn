package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKSORTSUB as TABLE. <br>
 * <pre>
 * [primary key]
 *     SORTSUBKEY, SORTSUBLINENO
 *
 * [column]
 *     SORTSUBKEY, SORTSUBLINENO, SOKEY, PLNO, SYMBOLNO, LOTKEY, LOCCD, QTY, PICKEDFLG, SORTEDFLG, MANUALSYMBOLNO, ASSORTSEQ, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfWWksortsub {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWksortsub> _selectedList;
    protected BehaviorSelector _selector;
    protected WWksortsubBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWksortsub ready(List<WWksortsub> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWksortsubBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWksortsubBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWksortsub> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
