package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_TRIFTRNODR as TABLE. <br>
 * <pre>
 * [primary key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, NEXUSPKEY, ORDERNO, ORDERTYPE, CUSTORDERNO, TRANTYPE, RMANO, TRANSDETAILTYPE, SCHDATE, SCHTIME, ACTUALDATE, ACTUALTIME, WAREHOUSECD, FROMCOMPANYCD, FROMOWNERCD, TOCOMPANYCD, TOOWNERCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PRIORITY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfETriftrnodr {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ETriftrnodr> _selectedList;
    protected BehaviorSelector _selector;
    protected ETriftrnodrBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfETriftrnodr ready(List<ETriftrnodr> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ETriftrnodrBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ETriftrnodrBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ETriftrnodr> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
