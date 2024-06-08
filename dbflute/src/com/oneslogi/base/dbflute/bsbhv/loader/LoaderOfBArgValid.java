package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_ARG_VALID as TABLE. <br>
 * <pre>
 * [primary key]
 *     ARG_ID
 *
 * [column]
 *     ARG_ID, INPUT_LIMIT, LIMIT_MESSAGE_CD, MIN_CHARS, MAX_CHARS, MIN_NUMBER, MAX_NUMBER, INTEGER_LENGTH, DECIMAL_LENGTH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ARG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ARG
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bArg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBArgValid {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BArgValid> _selectedList;
    protected BehaviorSelector _selector;
    protected BArgValidBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBArgValid ready(List<BArgValid> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BArgValidBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BArgValidBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBArg _foreignBArgLoader;
    public LoaderOfBArg pulloutBArg() {
        if (_foreignBArgLoader == null)
        { _foreignBArgLoader = new LoaderOfBArg().ready(myBhv().pulloutBArg(_selectedList), _selector); }
        return _foreignBArgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BArgValid> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
