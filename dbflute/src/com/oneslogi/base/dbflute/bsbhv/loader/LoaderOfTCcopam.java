package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CCOPAM as TABLE. <br>
 * <pre>
 * [primary key]
 *     CCOPAM_ID
 *
 * [column]
 *     CCOPAM_ID, CENTER_ID, CLIENT_ID, ZZORGNCD, SNNO1, SNNO2, SNNO3, CARNO, SNYMD, ARVYMD, SFCD, STCD, GNLPLTQA, OTPLTQA, PLNCARKND, AMCARKND, SELNO1, SELNO2, SELNO3, TRANNM, CHGID, TDRELAYID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CCOPAM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTCcopam {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCcopam> _selectedList;
    protected BehaviorSelector _selector;
    protected TCcopamBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCcopam ready(List<TCcopam> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCcopamBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCcopamBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCcopam> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
