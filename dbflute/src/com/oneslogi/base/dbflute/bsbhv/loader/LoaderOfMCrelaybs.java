package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CRELAYBS as TABLE. <br>
 * <pre>
 * [primary key]
 *     CRELAYBS_ID
 *
 * [column]
 *     CRELAYBS_ID, RLYBSCD, DLVDPCD, RLYBSNM, RLYBSSNM, RLYBSP, RLYBSACD, RLYBSCCD, RLYBSAR, RLYBSTL, RLYBSFN, RLYBSID, RLYSHAN, DELYMD, CHNGYD, UPDTM, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CRELAYBS_ID
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
public class LoaderOfMCrelaybs {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCrelaybs> _selectedList;
    protected BehaviorSelector _selector;
    protected MCrelaybsBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCrelaybs ready(List<MCrelaybs> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCrelaybsBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCrelaybsBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCrelaybs> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
