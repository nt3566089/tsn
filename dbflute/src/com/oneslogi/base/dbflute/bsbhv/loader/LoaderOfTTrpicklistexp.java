package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRPICKLISTEXP as TABLE. <br>
 * <pre>
 * [primary key]
 *     T_TRPICKLISTEXP_ID
 *
 * [column]
 *     T_TRPICKLISTEXP_ID, T_TRPICKLIST_ID, PICKLIST_KEY, PICKLIST_G_NO, CASE_CD, DUMMY_CASE_KBN, READ_SD_KBN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_TR_PICKLIST
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrPicklist
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrpicklistexp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpicklistexp> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpicklistexpBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpicklistexp ready(List<TTrpicklistexp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpicklistexpBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpicklistexpBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrPicklist _foreignTTrPicklistLoader;
    public LoaderOfTTrPicklist pulloutTTrPicklist() {
        if (_foreignTTrPicklistLoader == null)
        { _foreignTTrPicklistLoader = new LoaderOfTTrPicklist().ready(myBhv().pulloutTTrPicklist(_selectedList), _selector); }
        return _foreignTTrPicklistLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpicklistexp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
