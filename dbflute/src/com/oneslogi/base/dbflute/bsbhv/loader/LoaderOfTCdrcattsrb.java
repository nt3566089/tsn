package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CDRCATTSRB as TABLE. <br>
 * <pre>
 * [primary key]
 *     HOUMEN_SORT_BLOCK_ID
 *
 * [column]
 *     HOUMEN_SORT_BLOCK_ID, ZZORGNCD, DPCD, DLVYMD, DRCCD, ZZPSTNID, SROPRTCNT, IOID, SRLIN, BLKCD, BLKSRRNKS, BLKSRRNK, BLKSWUNIT, BLKSWNUM, COMT, WRKMFG, SORT_DATE, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_SORT_BLOCK_ID
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
public class LoaderOfTCdrcattsrb {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCdrcattsrb> _selectedList;
    protected BehaviorSelector _selector;
    protected TCdrcattsrbBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCdrcattsrb ready(List<TCdrcattsrb> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCdrcattsrbBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCdrcattsrbBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCdrcattsrb> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
