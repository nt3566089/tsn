package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKPALLET as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKPALLET_ID
 *
 * [column]
 *     WKPALLET_ID, PALLETNO, PRINTKEY, LotKey, RcvKey, RcvLineNo, PRINTEDFLG, PrintingDate, LOT1, TRANSPORTNO, SourceCd, SchDate, ReceiveCd, RcvDate, ReceiveDate, WAREHOUSECD, PRODUCT_CD, LOT3, LOT4, LOT2, ReceiveQtyCase, ReceiveQtyBowl, ReceiveQty, RestQtyCase, RestQtyBowl, RestQty, PalletSts, PluralproductionKBN, RtnRcvKbn, ShTypeCd, PALLETCUTTINGKBN, LOCCD, RcvPalletNo, IMAGENAME1, IMAGENAME2, IMAGENAME3, WAREHOUSE_SNAME, ITEM_SNAME, FOREIGNCARGOCD, CARRIERSEQ, OTHERLOT1, USERNUM3, ADDRESS2, AcceptUserCd, AcceptDate, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKPALLET_ID
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
public class LoaderOfWWkpallet {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkpallet> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkpalletBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkpallet ready(List<WWkpallet> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkpalletBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkpalletBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkpallet> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
