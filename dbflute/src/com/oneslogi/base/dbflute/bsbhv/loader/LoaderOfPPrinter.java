package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_PRINTER as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTER_ID
 *
 * [column]
 *     PRINTER_ID, PRINTER_GROUP_ID, PRINTER_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER_GROUP, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER_ATTRIBUTE, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     pPrinterGroup, bClassDtlByVisible
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pPrinterAttributeList, pUserAutoPrintSettingByPrinterIdList, pTerminalAutoPrintSetByPrinterIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrinter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrinter> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrinterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrinter ready(List<PPrinter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrinterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrinterBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PLayoutPrintSetting> _referrerPLayoutPrintSettingList;

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">printerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">printerLoader</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPLayoutPrintSetting> loadPLayoutPrintSettingList(ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        myBhv().loadPLayoutPrintSettingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPLayoutPrintSettingList = refLs);
        return hd -> hd.handle(new LoaderOfPLayoutPrintSetting().ready(_referrerPLayoutPrintSettingList, _selector));
    }

    protected List<PPrinterAttribute> _referrerPPrinterAttributeList;

    /**
     * Load referrer of PPrinterAttributeList by the set-upper of referrer. <br>
     * P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">printerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">printerLoader</span>.<span style="color: #CC4747">loadPPrinterAttributeList</span>(<span style="color: #553000">attributeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">attributeCB</span>.setupSelect...
     *         <span style="color: #553000">attributeCB</span>.query().set...
     *         <span style="color: #553000">attributeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">attributeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    attributeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPPrinterAttributeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPPrinterAttribute> loadPPrinterAttributeList(ConditionBeanSetupper<PPrinterAttributeCB> refCBLambda) {
        myBhv().loadPPrinterAttributeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPPrinterAttributeList = refLs);
        return hd -> hd.handle(new LoaderOfPPrinterAttribute().ready(_referrerPPrinterAttributeList, _selector));
    }

    protected List<PUserAutoPrintSetting> _referrerPUserAutoPrintSettingByPrinterIdList;

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">printerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">printerLoader</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterIdList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterIdList(ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        myBhv().loadPUserAutoPrintSettingByPrinterIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPUserAutoPrintSettingByPrinterIdList = refLs);
        return hd -> hd.handle(new LoaderOfPUserAutoPrintSetting().ready(_referrerPUserAutoPrintSettingByPrinterIdList, _selector));
    }

    protected List<PTerminalAutoPrintSet> _referrerPTerminalAutoPrintSetByPrinterIdList;

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">printerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">printerLoader</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterIdList</span>(<span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">setCB</span>.setupSelect...
     *         <span style="color: #553000">setCB</span>.query().set...
     *         <span style="color: #553000">setCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">setLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    setLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterIdList(ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        myBhv().loadPTerminalAutoPrintSetByPrinterIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPTerminalAutoPrintSetByPrinterIdList = refLs);
        return hd -> hd.handle(new LoaderOfPTerminalAutoPrintSet().ready(_referrerPTerminalAutoPrintSetByPrinterIdList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPPrinterGroup _foreignPPrinterGroupLoader;
    public LoaderOfPPrinterGroup pulloutPPrinterGroup() {
        if (_foreignPPrinterGroupLoader == null)
        { _foreignPPrinterGroupLoader = new LoaderOfPPrinterGroup().ready(myBhv().pulloutPPrinterGroup(_selectedList), _selector); }
        return _foreignPPrinterGroupLoader;
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
    public List<PPrinter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
