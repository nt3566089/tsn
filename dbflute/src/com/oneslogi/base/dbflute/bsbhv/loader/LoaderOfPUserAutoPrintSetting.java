package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_USER_AUTO_PRINT_SETTING as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [column]
 *     USER_AUTO_PRINT_SETTING_ID, USER_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT_LAYOUT(ByReportLayoutId), P_PRINTER_GROUP(ByPrinterGroupId), P_PRINTER(ByPrinterId), P_PRINTER_ATTRIBUTE(ByPrinterAttributeId)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pReportLayoutByReportLayoutId, pPrinterGroupByPrinterGroupId, pPrinterByPrinterId, pPrinterAttributeByPrinterAttributeId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPUserAutoPrintSetting {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PUserAutoPrintSetting> _selectedList;
    protected BehaviorSelector _selector;
    protected PUserAutoPrintSettingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPUserAutoPrintSetting ready(List<PUserAutoPrintSetting> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PUserAutoPrintSettingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PUserAutoPrintSettingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPReportLayout _foreignPReportLayoutByReportLayoutIdLoader;
    public LoaderOfPReportLayout pulloutPReportLayoutByReportLayoutId() {
        if (_foreignPReportLayoutByReportLayoutIdLoader == null)
        { _foreignPReportLayoutByReportLayoutIdLoader = new LoaderOfPReportLayout().ready(myBhv().pulloutPReportLayoutByReportLayoutId(_selectedList), _selector); }
        return _foreignPReportLayoutByReportLayoutIdLoader;
    }

    protected LoaderOfPPrinterGroup _foreignPPrinterGroupByPrinterGroupIdLoader;
    public LoaderOfPPrinterGroup pulloutPPrinterGroupByPrinterGroupId() {
        if (_foreignPPrinterGroupByPrinterGroupIdLoader == null)
        { _foreignPPrinterGroupByPrinterGroupIdLoader = new LoaderOfPPrinterGroup().ready(myBhv().pulloutPPrinterGroupByPrinterGroupId(_selectedList), _selector); }
        return _foreignPPrinterGroupByPrinterGroupIdLoader;
    }

    protected LoaderOfPPrinter _foreignPPrinterByPrinterIdLoader;
    public LoaderOfPPrinter pulloutPPrinterByPrinterId() {
        if (_foreignPPrinterByPrinterIdLoader == null)
        { _foreignPPrinterByPrinterIdLoader = new LoaderOfPPrinter().ready(myBhv().pulloutPPrinterByPrinterId(_selectedList), _selector); }
        return _foreignPPrinterByPrinterIdLoader;
    }

    protected LoaderOfPPrinterAttribute _foreignPPrinterAttributeByPrinterAttributeIdLoader;
    public LoaderOfPPrinterAttribute pulloutPPrinterAttributeByPrinterAttributeId() {
        if (_foreignPPrinterAttributeByPrinterAttributeIdLoader == null)
        { _foreignPPrinterAttributeByPrinterAttributeIdLoader = new LoaderOfPPrinterAttribute().ready(myBhv().pulloutPPrinterAttributeByPrinterAttributeId(_selectedList), _selector); }
        return _foreignPPrinterAttributeByPrinterAttributeIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PUserAutoPrintSetting> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
