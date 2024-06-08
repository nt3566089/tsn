package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_PALLET_SYMBOL_JT as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKSOJTKEY
 *
 * [column]
 *     WKSOJTKEY, CENTER_ID, CLIENT_ID, TRPALLET_ID, PALLET_NO, OWNER_SO_NO, SO_PALLET_NO, TRSYMBOL_ID, SYMBOL_NO, SORTED_QTY, ENTER_FLG, PACKED_FLG, RCV_KEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKSOJTKEY
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
public class LoaderOfWPalletSymbolJt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WPalletSymbolJt> _selectedList;
    protected BehaviorSelector _selector;
    protected WPalletSymbolJtBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWPalletSymbolJt ready(List<WPalletSymbolJt> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WPalletSymbolJtBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WPalletSymbolJtBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WPalletSymbolJt> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
