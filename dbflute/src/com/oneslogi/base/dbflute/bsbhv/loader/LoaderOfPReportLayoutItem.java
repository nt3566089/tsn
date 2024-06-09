package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_REPORT_LAYOUT_ITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPORT_LAYOUT_ITEM_ID
 *
 * [column]
 *     REPORT_LAYOUT_ITEM_ID, REPORT_LAYOUT_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, ITEM_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, P_REPORT_LAYOUT, V_DICT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bDict, pReportLayout, vDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPReportLayoutItem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PReportLayoutItem> _selectedList;
    protected BehaviorSelector _selector;
    protected PReportLayoutItemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPReportLayoutItem ready(List<PReportLayoutItem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PReportLayoutItemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PReportLayoutItemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfPReportLayout _foreignPReportLayoutLoader;
    public LoaderOfPReportLayout pulloutPReportLayout() {
        if (_foreignPReportLayoutLoader == null)
        { _foreignPReportLayoutLoader = new LoaderOfPReportLayout().ready(myBhv().pulloutPReportLayout(_selectedList), _selector); }
        return _foreignPReportLayoutLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PReportLayoutItem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
