package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKGDITMSTOCKDIFFHISTORYB as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTKEY, WAREHOUSECD, DIFFADDDATE, DIFFOCCAREA, PRODUCT_CD
 *
 * [column]
 *     PRINTKEY, WAREHOUSECD, WAREHOUSENAME, DIFFADDDATE, DIFFOCCAREA, PRODUCT_CD, ITEMNAME, DIFFQTY, INOUTKBN, ITEMORDERBY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfWWkgditmstockdiffhistoryb {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWkgditmstockdiffhistoryb> _selectedList;
    protected BehaviorSelector _selector;
    protected WWkgditmstockdiffhistorybBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWkgditmstockdiffhistoryb ready(List<WWkgditmstockdiffhistoryb> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWkgditmstockdiffhistorybBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWkgditmstockdiffhistorybBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWkgditmstockdiffhistoryb> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
