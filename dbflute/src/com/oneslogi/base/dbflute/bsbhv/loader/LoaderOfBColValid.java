package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_COL_VALID as TABLE. <br>
 * <pre>
 * [primary key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, INPUT_LIMIT, LIMIT_MESSAGE_CD, MIN_CHARS, MAX_CHARS, MIN_NUMBER, MAX_NUMBER, INTEGER_LENGTH, DECIMAL_LENGTH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_COL
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bCol
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBColValid {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BColValid> _selectedList;
    protected BehaviorSelector _selector;
    protected BColValidBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBColValid ready(List<BColValid> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BColValidBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BColValidBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCol _foreignBColLoader;
    public LoaderOfBCol pulloutBCol() {
        if (_foreignBColLoader == null)
        { _foreignBColLoader = new LoaderOfBCol().ready(myBhv().pulloutBCol(_selectedList), _selector); }
        return _foreignBColLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BColValid> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
