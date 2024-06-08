package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEDDER_FLG, ZZORGNCD, DPCD, ORDGR, RMANO, SSCD, SLPTYP, SLPNO, SEQNO, ZZORDYMD, ZZWAYMD1, OTORGCD, ORDORGCD, RLYBSCD, DED, PSTNID, DLVRNK, LMPDLVNO, DIVMTD, HDVID, NAME1, ZREGPRCA, ZREGPRCC, ZZSALTAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, LOGISTICSCD, SLEDIV, HVRTRSN, ZZVBELNB, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, ZZBLOTDT, CGGDID, MATNR, KWMENG, MVGR1, MVGR4, KZWI3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
public class LoaderOfEShippingPlanBulkInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShippingPlanBulkInput> _selectedList;
    protected BehaviorSelector _selector;
    protected EShippingPlanBulkInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShippingPlanBulkInput ready(List<EShippingPlanBulkInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShippingPlanBulkInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShippingPlanBulkInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShippingPlanBulkInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
