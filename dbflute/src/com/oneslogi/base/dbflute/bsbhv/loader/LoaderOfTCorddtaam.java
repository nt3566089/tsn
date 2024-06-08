package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CORDDTAAM as TABLE. <br>
 * <pre>
 * [primary key]
 *     ORDER_RECORD_ID
 *
 * [column]
 *     ORDER_RECORD_ID, ORDER_H_ID, SRWHCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, HPYNID, IPYNID, SRDED, SRPSTNID, SRYMD, SROPRTCNT, SRLINCD, SRRNK, DLVSNM, DLVDTLSNM, SSCD, SSNM, HDVID, DTLSNM, ZZMATNR, SLQACB, SLQACT, SLQANUM, LINBLK, LOCNO, LOCID, DLVPRTRNK, SRDLVYMD, SRHPYNID, SRIPYNID, SRSRLINCD, SRSRRNK, SRDLVSNM, SRDLVDTLSNM, SRDLVPRTRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, TTSROPRTCNT, BXMTRID, SPPLYMD, SLPTYP, SEQNO, OTORGCD, ORDORGCD, RLYBSCD, DLVRNK, LMPDLVNO, DIVMTD, SLEDIV, HVRTRSN, HVRTINOTYMD, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, SLPOTYMD, CMPCD, STSCD, STGVAL, SLPNO, TTTOPDEDRNK, CORDRCVCNT, ORDDVFG, LBCBQA, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, IKEIINCLDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_RECORD_ID
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
public class LoaderOfTCorddtaam {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCorddtaam> _selectedList;
    protected BehaviorSelector _selector;
    protected TCorddtaamBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCorddtaam ready(List<TCorddtaam> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCorddtaamBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCorddtaamBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCorddtaam> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
