package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_PRINTER_ATTRIBUTE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [column]
 *     PRINTER_ATTRIBUTE_ID, PRINTER_ID, TRAY_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     pPrinter, bClassDtlByVisible
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pUserAutoPrintSettingByPrinterAttributeIdList, pTerminalAutoPrintSetByPrinterAttributeIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrinterAttribute {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrinterAttribute> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrinterAttributeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrinterAttribute ready(List<PPrinterAttribute> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrinterAttributeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrinterAttributeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PLayoutPrintSetting> _referrerPLayoutPrintSettingList;

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterAttributeList</span>, <span style="color: #553000">attributeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeLoader</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPLayoutPrintSetting> loadPLayoutPrintSettingList(ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        myBhv().loadPLayoutPrintSettingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPLayoutPrintSettingList = refLs);
        return hd -> hd.handle(new LoaderOfPLayoutPrintSetting().ready(_referrerPLayoutPrintSettingList, _selector));
    }

    protected List<PUserAutoPrintSetting> _referrerPUserAutoPrintSettingByPrinterAttributeIdList;

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterAttributeIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingByPrinterAttributeIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterAttributeList</span>, <span style="color: #553000">attributeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeLoader</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterAttributeIdList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterAttributeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterAttributeIdList(ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        myBhv().loadPUserAutoPrintSettingByPrinterAttributeIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPUserAutoPrintSettingByPrinterAttributeIdList = refLs);
        return hd -> hd.handle(new LoaderOfPUserAutoPrintSetting().ready(_referrerPUserAutoPrintSettingByPrinterAttributeIdList, _selector));
    }

    protected List<PTerminalAutoPrintSet> _referrerPTerminalAutoPrintSetByPrinterAttributeIdList;

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterAttributeIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetByPrinterAttributeIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterAttributeList</span>, <span style="color: #553000">attributeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeLoader</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterAttributeIdList</span>(<span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">setCB</span>.setupSelect...
     *         <span style="color: #553000">setCB</span>.query().set...
     *         <span style="color: #553000">setCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">setLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    setLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterAttributeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterAttributeIdList(ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        myBhv().loadPTerminalAutoPrintSetByPrinterAttributeIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPTerminalAutoPrintSetByPrinterAttributeIdList = refLs);
        return hd -> hd.handle(new LoaderOfPTerminalAutoPrintSet().ready(_referrerPTerminalAutoPrintSetByPrinterAttributeIdList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPPrinter _foreignPPrinterLoader;
    public LoaderOfPPrinter pulloutPPrinter() {
        if (_foreignPPrinterLoader == null)
        { _foreignPPrinterLoader = new LoaderOfPPrinter().ready(myBhv().pulloutPPrinter(_selectedList), _selector); }
        return _foreignPPrinterLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByVisibleLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByVisible() {
        if (_foreignBClassDtlByVisibleLoader == null)
        { _foreignBClassDtlByVisibleLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByVisible(_selectedList), _selector); }
        return _foreignBClassDtlByVisibleLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrinterAttribute> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
