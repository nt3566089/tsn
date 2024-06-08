package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CDTLVMKADM as TABLE. <br>
 * <pre>
 * [primary key]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID
 *
 * [column]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID, ZZORGNCD, SRYMD, SROPRTCNT, DLVYMD, DPCD, DED, PSTNID, LINBLK, SRRNK, MKDTM, LSTDSYMD, SRLINCD, SRSRRNK, SPECIFICATION_PRINTEDFLG, LABEL_PRINTEDFLG, REPORT_ID, REPORT_NM, STOCK_NUM, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID
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
public class LoaderOfTCdtlvmkadm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCdtlvmkadm> _selectedList;
    protected BehaviorSelector _selector;
    protected TCdtlvmkadmBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCdtlvmkadm ready(List<TCdtlvmkadm> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCdtlvmkadmBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCdtlvmkadmBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCdtlvmkadm> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
