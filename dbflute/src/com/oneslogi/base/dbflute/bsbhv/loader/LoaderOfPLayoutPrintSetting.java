package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_LAYOUT_PRINT_SETTING as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAYOUT_PRINT_SETTING_ID
 *
 * [column]
 *     LAYOUT_PRINT_SETTING_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAYOUT_PRINT_SETTING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER_ATTRIBUTE, P_PRINTER_GROUP, P_PRINTER, P_REPORT_LAYOUT, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrinterAttribute, pPrinterGroup, pPrinter, pReportLayout, bClassDtlBySheetCollate
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPLayoutPrintSetting {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PLayoutPrintSetting> _selectedList;
    protected BehaviorSelector _selector;
    protected PLayoutPrintSettingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPLayoutPrintSetting ready(List<PLayoutPrintSetting> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PLayoutPrintSettingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PLayoutPrintSettingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPPrinterAttribute _foreignPPrinterAttributeLoader;
    public LoaderOfPPrinterAttribute pulloutPPrinterAttribute() {
        if (_foreignPPrinterAttributeLoader == null)
        { _foreignPPrinterAttributeLoader = new LoaderOfPPrinterAttribute().ready(myBhv().pulloutPPrinterAttribute(_selectedList), _selector); }
        return _foreignPPrinterAttributeLoader;
    }

    protected LoaderOfPPrinterGroup _foreignPPrinterGroupLoader;
    public LoaderOfPPrinterGroup pulloutPPrinterGroup() {
        if (_foreignPPrinterGroupLoader == null)
        { _foreignPPrinterGroupLoader = new LoaderOfPPrinterGroup().ready(myBhv().pulloutPPrinterGroup(_selectedList), _selector); }
        return _foreignPPrinterGroupLoader;
    }

    protected LoaderOfPPrinter _foreignPPrinterLoader;
    public LoaderOfPPrinter pulloutPPrinter() {
        if (_foreignPPrinterLoader == null)
        { _foreignPPrinterLoader = new LoaderOfPPrinter().ready(myBhv().pulloutPPrinter(_selectedList), _selector); }
        return _foreignPPrinterLoader;
    }

    protected LoaderOfPReportLayout _foreignPReportLayoutLoader;
    public LoaderOfPReportLayout pulloutPReportLayout() {
        if (_foreignPReportLayoutLoader == null)
        { _foreignPReportLayoutLoader = new LoaderOfPReportLayout().ready(myBhv().pulloutPReportLayout(_selectedList), _selector); }
        return _foreignPReportLayoutLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySheetCollateLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySheetCollate() {
        if (_foreignBClassDtlBySheetCollateLoader == null)
        { _foreignBClassDtlBySheetCollateLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySheetCollate(_selectedList), _selector); }
        return _foreignBClassDtlBySheetCollateLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PLayoutPrintSetting> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
