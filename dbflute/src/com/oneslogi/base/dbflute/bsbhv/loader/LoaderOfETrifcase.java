package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_TRIFCASE as TABLE. <br>
 * <pre>
 * [primary key]
 *     JTSYMBOLNO
 *
 * [column]
 *     JTSYMBOLNO, FACTORYCD, PRODUCT_CD, MACHINENO, LIMITDATE, ORDERNO, CREATENO, SKUCD, DESTINATIONCD, MANUFACTURECD, DATETIME, DISTRIBUTIONCD, PALLETID, TRANSPORTCD, SHIPTOCD, HEAD_ORDERNO, CASEQTY, FRACTQTY, SYMBOLADDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfETrifcase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ETrifcase> _selectedList;
    protected BehaviorSelector _selector;
    protected ETrifcaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfETrifcase ready(List<ETrifcase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ETrifcaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ETrifcaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ETrifcase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
