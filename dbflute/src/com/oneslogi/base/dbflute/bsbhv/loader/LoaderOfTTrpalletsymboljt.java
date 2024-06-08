package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRPALLETSYMBOLJT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PALLET_INDIVIDUAL_INFO_ID
 *
 * [column]
 *     PALLET_INDIVIDUAL_INFO_ID, PALLETSYMBOLKEY, PALLETKEY, SOJTID, SOJTLINENO, OWNERSONO, SOPALLETNO, RCVID, CENTER_SYMBOL_ID, SORTEDQTY1, LOT_ID, PACKEDFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfTTrpalletsymboljt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpalletsymboljt> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpalletsymboljtBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpalletsymboljt ready(List<TTrpalletsymboljt> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpalletsymboljtBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpalletsymboljtBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpalletsymboljt> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
