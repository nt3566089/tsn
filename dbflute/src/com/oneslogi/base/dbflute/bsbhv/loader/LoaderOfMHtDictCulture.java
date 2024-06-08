package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_HT_DICT_CULTURE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DICT_CULTURE_ID
 *
 * [column]
 *     DICT_CULTURE_ID, DICT_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT_CULTURE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bDictCulture
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMHtDictCulture {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MHtDictCulture> _selectedList;
    protected BehaviorSelector _selector;
    protected MHtDictCultureBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMHtDictCulture ready(List<MHtDictCulture> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MHtDictCultureBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MHtDictCultureBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDictCulture _foreignBDictCultureLoader;
    public LoaderOfBDictCulture pulloutBDictCulture() {
        if (_foreignBDictCultureLoader == null)
        { _foreignBDictCultureLoader = new LoaderOfBDictCulture().ready(myBhv().pulloutBDictCulture(_selectedList), _selector); }
        return _foreignBDictCultureLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MHtDictCulture> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
