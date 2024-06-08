package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRPALLETSYMBOL as TABLE. <br>
 * <pre>
 * [primary key]
 *     PALLET_INDIVIDUAL_INFO_ID
 *
 * [column]
 *     PALLET_INDIVIDUAL_INFO_ID, PALLETSYMBOLKEY, PALLETKEY, SOID, SODETAILID, OWNERSONO, SOPALLETNO, RCVID, CENTER_SYMBOL_ID, SORTEDQTY1, LOT_ID, PALLETSYMBOLPRINTFLG, PACKEDFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PALLET_INDIVIDUAL_INFO_ID
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
public class LoaderOfTTrpalletsymbol {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpalletsymbol> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpalletsymbolBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpalletsymbol ready(List<TTrpalletsymbol> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpalletsymbolBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpalletsymbolBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpalletsymbol> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
