package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_REPORT_LAYOUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPORT_LAYOUT_ID
 *
 * [column]
 *     REPORT_LAYOUT_ID, REPORT_ID, REPORT_LAYOUT_NM, REPORT_LAYOUT_DATA, UPDATABLE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, AUTO_PRINT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT, B_CLASS_DTL(ByUpdatable), P_LAYOUT_PRINT_SETTING(AsOne), P_SUBREP_LAYOUT(AsOne)
 *
 * [referrer table]
 *     P_REPORT_LAYOUT_ITEM, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET, P_LAYOUT_PRINT_SETTING, P_SUBREP_LAYOUT
 *
 * [foreign property]
 *     pReport, bClassDtlByUpdatable, bClassDtlByAutoPrintTargetFlg, pLayoutPrintSettingAsOne, pSubrepLayoutAsOne
 *
 * [referrer property]
 *     pReportLayoutItemList, pUserAutoPrintSettingByReportLayoutIdList, pTerminalAutoPrintSetByReportLayoutIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPReportLayout {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PReportLayout> _selectedList;
    protected BehaviorSelector _selector;
    protected PReportLayoutBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPReportLayout ready(List<PReportLayout> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PReportLayoutBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PReportLayoutBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PReportLayoutItem> _referrerPReportLayoutItemList;

    /**
     * Load referrer of PReportLayoutItemList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pReportLayoutList</span>, <span style="color: #553000">layoutLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">layoutLoader</span>.<span style="color: #CC4747">loadPReportLayoutItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.<span style="color: #CC4747">getPReportLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPReportLayoutItem> loadPReportLayoutItemList(ConditionBeanSetupper<PReportLayoutItemCB> refCBLambda) {
        myBhv().loadPReportLayoutItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPReportLayoutItemList = refLs);
        return hd -> hd.handle(new LoaderOfPReportLayoutItem().ready(_referrerPReportLayoutItemList, _selector));
    }

    protected List<PUserAutoPrintSetting> _referrerPUserAutoPrintSettingByReportLayoutIdList;

    /**
     * Load referrer of PUserAutoPrintSettingByReportLayoutIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pReportLayoutList</span>, <span style="color: #553000">layoutLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">layoutLoader</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByReportLayoutIdList</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.<span style="color: #CC4747">getPUserAutoPrintSettingByReportLayoutIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPUserAutoPrintSetting> loadPUserAutoPrintSettingByReportLayoutIdList(ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        myBhv().loadPUserAutoPrintSettingByReportLayoutIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPUserAutoPrintSettingByReportLayoutIdList = refLs);
        return hd -> hd.handle(new LoaderOfPUserAutoPrintSetting().ready(_referrerPUserAutoPrintSettingByReportLayoutIdList, _selector));
    }

    protected List<PTerminalAutoPrintSet> _referrerPTerminalAutoPrintSetByReportLayoutIdList;

    /**
     * Load referrer of PTerminalAutoPrintSetByReportLayoutIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pReportLayoutList</span>, <span style="color: #553000">layoutLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">layoutLoader</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByReportLayoutIdList</span>(<span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">setCB</span>.setupSelect...
     *         <span style="color: #553000">setCB</span>.query().set...
     *         <span style="color: #553000">setCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">setLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    setLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.<span style="color: #CC4747">getPTerminalAutoPrintSetByReportLayoutIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPTerminalAutoPrintSet> loadPTerminalAutoPrintSetByReportLayoutIdList(ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        myBhv().loadPTerminalAutoPrintSetByReportLayoutIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPTerminalAutoPrintSetByReportLayoutIdList = refLs);
        return hd -> hd.handle(new LoaderOfPTerminalAutoPrintSet().ready(_referrerPTerminalAutoPrintSetByReportLayoutIdList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPReport _foreignPReportLoader;
    public LoaderOfPReport pulloutPReport() {
        if (_foreignPReportLoader == null)
        { _foreignPReportLoader = new LoaderOfPReport().ready(myBhv().pulloutPReport(_selectedList), _selector); }
        return _foreignPReportLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByUpdatableLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByUpdatable() {
        if (_foreignBClassDtlByUpdatableLoader == null)
        { _foreignBClassDtlByUpdatableLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByUpdatable(_selectedList), _selector); }
        return _foreignBClassDtlByUpdatableLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAutoPrintTargetFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAutoPrintTargetFlg() {
        if (_foreignBClassDtlByAutoPrintTargetFlgLoader == null)
        { _foreignBClassDtlByAutoPrintTargetFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAutoPrintTargetFlg(_selectedList), _selector); }
        return _foreignBClassDtlByAutoPrintTargetFlgLoader;
    }

    protected LoaderOfPLayoutPrintSetting _foreignPLayoutPrintSettingAsOneLoader;
    public LoaderOfPLayoutPrintSetting pulloutPLayoutPrintSettingAsOne() {
        if (_foreignPLayoutPrintSettingAsOneLoader == null)
        { _foreignPLayoutPrintSettingAsOneLoader = new LoaderOfPLayoutPrintSetting().ready(myBhv().pulloutPLayoutPrintSettingAsOne(_selectedList), _selector); }
        return _foreignPLayoutPrintSettingAsOneLoader;
    }

    protected LoaderOfPSubrepLayout _foreignPSubrepLayoutAsOneLoader;
    public LoaderOfPSubrepLayout pulloutPSubrepLayoutAsOne() {
        if (_foreignPSubrepLayoutAsOneLoader == null)
        { _foreignPSubrepLayoutAsOneLoader = new LoaderOfPSubrepLayout().ready(myBhv().pulloutPSubrepLayoutAsOne(_selectedList), _selector); }
        return _foreignPSubrepLayoutAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PReportLayout> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
