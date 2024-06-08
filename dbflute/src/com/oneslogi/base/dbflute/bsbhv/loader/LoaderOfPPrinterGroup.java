package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_PRINTER_GROUP as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTER_GROUP_ID
 *
 * [column]
 *     PRINTER_GROUP_ID, PRINTER_GROUP_NM, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_GROUP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pPrinterList, pUserAutoPrintSettingByPrinterGroupIdList, pTerminalAutoPrintSetByPrinterGroupIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrinterGroup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrinterGroup> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrinterGroupBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrinterGroup ready(List<PPrinterGroup> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrinterGroupBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrinterGroupBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PLayoutPrintSetting> _referrerPLayoutPrintSettingList;

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterGroupBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterGroupList</span>, <span style="color: #553000">groupLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupLoader</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterGroup pPrinterGroup : <span style="color: #553000">pPrinterGroupList</span>) {
     *     ... = pPrinterGroup.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterGroupId_InScope(pkList);
     * cb.query().addOrderBy_PrinterGroupId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPLayoutPrintSetting> loadPLayoutPrintSettingList(ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        myBhv().loadPLayoutPrintSettingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPLayoutPrintSettingList = refLs);
        return hd -> hd.handle(new LoaderOfPLayoutPrintSetting().ready(_referrerPLayoutPrintSettingList, _selector));
    }

    protected List<PPrinter> _referrerPPrinterList;

    /**
     * Load referrer of PPrinterList by the set-upper of referrer. <br>
     * P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterGroupBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterGroupList</span>, <span style="color: #553000">groupLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupLoader</span>.<span style="color: #CC4747">loadPPrinterList</span>(<span style="color: #553000">printerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">printerCB</span>.setupSelect...
     *         <span style="color: #553000">printerCB</span>.query().set...
     *         <span style="color: #553000">printerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">printerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    printerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterGroup pPrinterGroup : <span style="color: #553000">pPrinterGroupList</span>) {
     *     ... = pPrinterGroup.<span style="color: #CC4747">getPPrinterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterGroupId_InScope(pkList);
     * cb.query().addOrderBy_PrinterGroupId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPPrinter> loadPPrinterList(ConditionBeanSetupper<PPrinterCB> refCBLambda) {
        myBhv().loadPPrinterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPPrinterList = refLs);
        return hd -> hd.handle(new LoaderOfPPrinter().ready(_referrerPPrinterList, _selector));
    }

    protected List<PUserAutoPrintSetting> _referrerPUserAutoPrintSettingByPrinterGroupIdList;

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterGroupIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingByPrinterGroupIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterGroupBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterGroupList</span>, <span style="color: #553000">groupLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupLoader</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterGroupIdList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterGroup pPrinterGroup : <span style="color: #553000">pPrinterGroupList</span>) {
     *     ... = pPrinterGroup.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterGroupIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterGroupId_InScope(pkList);
     * cb.query().addOrderBy_PrinterGroupId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterGroupIdList(ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        myBhv().loadPUserAutoPrintSettingByPrinterGroupIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPUserAutoPrintSettingByPrinterGroupIdList = refLs);
        return hd -> hd.handle(new LoaderOfPUserAutoPrintSetting().ready(_referrerPUserAutoPrintSettingByPrinterGroupIdList, _selector));
    }

    protected List<PTerminalAutoPrintSet> _referrerPTerminalAutoPrintSetByPrinterGroupIdList;

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterGroupIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetByPrinterGroupIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterGroupBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrinterGroupList</span>, <span style="color: #553000">groupLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupLoader</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterGroupIdList</span>(<span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">setCB</span>.setupSelect...
     *         <span style="color: #553000">setCB</span>.query().set...
     *         <span style="color: #553000">setCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">setLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    setLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrinterGroup pPrinterGroup : <span style="color: #553000">pPrinterGroupList</span>) {
     *     ... = pPrinterGroup.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterGroupIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterGroupId_InScope(pkList);
     * cb.query().addOrderBy_PrinterGroupId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterGroupIdList(ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        myBhv().loadPTerminalAutoPrintSetByPrinterGroupIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPTerminalAutoPrintSetByPrinterGroupIdList = refLs);
        return hd -> hd.handle(new LoaderOfPTerminalAutoPrintSet().ready(_referrerPTerminalAutoPrintSetByPrinterGroupIdList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrinterGroup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
