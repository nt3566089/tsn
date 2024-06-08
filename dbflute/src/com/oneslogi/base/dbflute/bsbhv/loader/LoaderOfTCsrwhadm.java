package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CSRWHADM as TABLE. <br>
 * <pre>
 * [primary key]
 *     SORT_PLACE_MANAGE_ID
 *
 * [column]
 *     SORT_PLACE_MANAGE_ID, CENTER_ID, ZZORGNCD, SRYMD, SROPRTCNT, PRESPLCNT, SRPMTFG, MNTPMTFG, CORDRCVCNT, REFVALUE, SFTPCLMGN, TDAYESRCOMPFG, LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SORTING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_PLACE_MANAGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTCsrwhadm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCsrwhadm> _selectedList;
    protected BehaviorSelector _selector;
    protected TCsrwhadmBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCsrwhadm ready(List<TCsrwhadm> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCsrwhadmBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCsrwhadmBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCsrwhadm> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
