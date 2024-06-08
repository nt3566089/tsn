package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_TIME_ZONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TIME_ZONE_ID
 *
 * [column]
 *     TIME_ZONE_ID, TIME_ZONE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TIME_ZONE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     B_SYSTEM, M_CENTER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bSystemList, mCenterList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBTimeZone {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BTimeZone> _selectedList;
    protected BehaviorSelector _selector;
    protected BTimeZoneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBTimeZone ready(List<BTimeZone> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BTimeZoneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BTimeZoneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BSystem> _referrerBSystemList;

    /**
     * Load referrer of BSystemList by the set-upper of referrer. <br>
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemList'.
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bTimeZoneList</span>, <span style="color: #553000">zoneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneLoader</span>.<span style="color: #CC4747">loadBSystemList</span>(<span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">systemCB</span>.setupSelect...
     *         <span style="color: #553000">systemCB</span>.query().set...
     *         <span style="color: #553000">systemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">systemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    systemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BTimeZone bTimeZone : <span style="color: #553000">bTimeZoneList</span>) {
     *     ... = bTimeZone.<span style="color: #CC4747">getBSystemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTimeZoneId_InScope(pkList);
     * cb.query().addOrderBy_TimeZoneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBSystem> loadBSystemList(ConditionBeanSetupper<BSystemCB> refCBLambda) {
        myBhv().loadBSystemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBSystemList = refLs);
        return hd -> hd.handle(new LoaderOfBSystem().ready(_referrerBSystemList, _selector));
    }

    protected List<MCenter> _referrerMCenterList;

    /**
     * Load referrer of MCenterList by the set-upper of referrer. <br>
     * M_CENTER by TIME_ZONE_ID, named 'MCenterList'.
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bTimeZoneList</span>, <span style="color: #553000">zoneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneLoader</span>.<span style="color: #CC4747">loadMCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BTimeZone bTimeZone : <span style="color: #553000">bTimeZoneList</span>) {
     *     ... = bTimeZone.<span style="color: #CC4747">getMCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTimeZoneId_InScope(pkList);
     * cb.query().addOrderBy_TimeZoneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenter> loadMCenterList(ConditionBeanSetupper<MCenterCB> refCBLambda) {
        myBhv().loadMCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMCenter().ready(_referrerMCenterList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BTimeZone> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
