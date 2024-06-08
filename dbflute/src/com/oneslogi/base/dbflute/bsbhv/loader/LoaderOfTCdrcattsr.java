package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CDRCATTSR as TABLE. <br>
 * <pre>
 * [primary key]
 *     HOUMEN_SORT_ID
 *
 * [column]
 *     HOUMEN_SORT_ID, ZZORGNCD, DPCD, DLVYMD, DRCCD, ZZPSTNID, SRLIN, SRRNK, SNMPRTRNKAD, SRWKDY, COMT, SPRPRSID, ODDVID, HDRDBXUSID, SROPRTCNT, IOID, WRKMFG, IKEIINCLDFLG, SORT_DATE, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_SORT_ID
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
public class LoaderOfTCdrcattsr {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCdrcattsr> _selectedList;
    protected BehaviorSelector _selector;
    protected TCdrcattsrBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCdrcattsr ready(List<TCdrcattsr> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCdrcattsrBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCdrcattsrBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCdrcattsr> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}