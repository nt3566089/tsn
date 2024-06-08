package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_ORDER_SPLIT_DATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     ORDER_SPLIT_DATA_ID
 *
 * [column]
 *     ORDER_SPLIT_DATA_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, REC_FLG, SRWHCD, DPCD, DED, PSTNID, DLVRNK, DLVSNM, SROPRTCNT, SSCD, DLVYMD, ZZORDYMD, SLPMRGTMG, ORDGR, S, H, M, SRYMD, RLYBSCD, KEEPAREAH1, SLPTYP, CMPCD, SLPNO, SLEDIV, CNGPRTSLPNO, SPPLYMD, CGGDID, KEEPAREAH2, ZZMATNR, BOXNO, BOXTYPE, ZZMATNRTOTAL, BOXNOCNSNM, BXOSZL, BXOSZH, BXOSZW, BOXTOTALWEIGH, WEIGHTYPE, BOXTOTALNUMBER, KEEPAREAM1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_SPLIT_DATA_ID
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
public class LoaderOfEOrderSplitData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EOrderSplitData> _selectedList;
    protected BehaviorSelector _selector;
    protected EOrderSplitDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEOrderSplitData ready(List<EOrderSplitData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EOrderSplitDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EOrderSplitDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EOrderSplitData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
