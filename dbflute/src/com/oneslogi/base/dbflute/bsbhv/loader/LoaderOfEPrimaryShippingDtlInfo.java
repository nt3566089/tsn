package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRIMARY_SHIPPING_DTL_INFO as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
 *
 * [column]
 *     PRIMARY_SHIPPING_DTL_INFO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZBUKRS, ZZSNDYMD, RCDID, ZZREFENO, BNWHCD, HDRID, DTLNO, SPNDDA, PDLGTM, ZZSENDNO, PRCSORG, EKGRP, SPCD, SPSKPLCD, RCCD, RCSKPLCD, ZZRCVYMD, ZZSHTYPE, AGCD, ZZCBXQTY, ZZPLTQTY, ZZTPLQTY, ZZSHPCLS, ZZREFE01, ZZREFE02, ZZREFE03, ZZREFE04, ZZREFE05, ZZREFE06, ZZREFE07, ZZREFE08, ZZREFE09, ZZREFE10, DTLQA, ZZREFENO2, OPRTNO, BLOCKNM, ZZMATNR, LOTNO, QUANTY, GRPCSD, SFPOQA, DSSKPLCD, MFINF, SFTHDES, CNFATCL, LASTGR, SFLASTDES, SHNO, PLTNO, TRADELIVNO, BATJMFYM, SFFIL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
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
public class LoaderOfEPrimaryShippingDtlInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EPrimaryShippingDtlInfo> _selectedList;
    protected BehaviorSelector _selector;
    protected EPrimaryShippingDtlInfoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEPrimaryShippingDtlInfo ready(List<EPrimaryShippingDtlInfo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EPrimaryShippingDtlInfoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EPrimaryShippingDtlInfoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EPrimaryShippingDtlInfo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
