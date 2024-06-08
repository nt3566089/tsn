package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_REPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPORT_ID
 *
 * [column]
 *     REPORT_ID, REPORT_CD, REPORT_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     P_REPORT_LAYOUT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     pReportLayoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPReport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PReport> _selectedList;
    protected BehaviorSelector _selector;
    protected PReportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPReport ready(List<PReport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PReportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PReportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PReportLayout> _referrerPReportLayoutList;

    /**
     * Load referrer of PReportLayoutList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT by REPORT_ID, named 'PReportLayoutList'.
     * <pre>
     * <span style="color: #0000C0">pReportBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pReportList</span>, <span style="color: #553000">reportLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reportLoader</span>.<span style="color: #CC4747">loadPReportLayoutList</span>(<span style="color: #553000">layoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">layoutCB</span>.setupSelect...
     *         <span style="color: #553000">layoutCB</span>.query().set...
     *         <span style="color: #553000">layoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">layoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    layoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PReport pReport : <span style="color: #553000">pReportList</span>) {
     *     ... = pReport.<span style="color: #CC4747">getPReportLayoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportId_InScope(pkList);
     * cb.query().addOrderBy_ReportId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPReportLayout> loadPReportLayoutList(ConditionBeanSetupper<PReportLayoutCB> refCBLambda) {
        myBhv().loadPReportLayoutList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPReportLayoutList = refLs);
        return hd -> hd.handle(new LoaderOfPReportLayout().ready(_referrerPReportLayoutList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PReport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
