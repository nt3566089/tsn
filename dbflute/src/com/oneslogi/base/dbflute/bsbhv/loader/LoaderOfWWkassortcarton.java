package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKASSORTCARTON as TABLE. <br>
 * <pre>
 * [primary key]
 *     SEQNO, SYMBOLNO
 *
 * [column]
 *     SEQNO, SYMBOLNO, MOVEQTY, MOVEQTYBOWL, TOSYMBOLNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfWWkassortcarton {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkassortcarton> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkassortcartonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkassortcarton ready(List<WWkassortcarton> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkassortcartonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkassortcartonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkassortcarton> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
