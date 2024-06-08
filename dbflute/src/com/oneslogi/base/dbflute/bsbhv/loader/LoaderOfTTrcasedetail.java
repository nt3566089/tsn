package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRCASEDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRCASEDETAIL_ID
 *
 * [column]
 *     TRCASEDETAIL_ID, CASEDETAILNO, TRSYMBOL_ID, CREATEDATETIME, TRACETYPEDT, OPERATIONNUM, ASSORTINITNUM, ASSORTNUM, ASSORTEDCD, ASSORTEDUNIT, ASSORTEDINDEX, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, DIRECTIONNUM, SHIPORDER, CUSTOMERCD, CASESERIAL, DISTWAREHOUSECD, SENDSTS, DT_EXTDATA1, DT_EXTDATA2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASEDETAIL_ID
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
public class LoaderOfTTrcasedetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrcasedetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrcasedetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrcasedetail ready(List<TTrcasedetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrcasedetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrcasedetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrcasedetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
