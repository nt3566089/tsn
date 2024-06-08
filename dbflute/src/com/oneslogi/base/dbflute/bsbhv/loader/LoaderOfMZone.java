package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_ZONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZONE_ID
 *
 * [column]
 *     ZONE_ID, WAREHOUSE_ID, ZONE_CD, ZONE_NM, PICKING_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZONE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_WAREHOUSE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_LOCATION, M_PARAM, T_INVENTORY_INST
 *
 * [foreign property]
 *     mWarehouse, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mLocationList, mParamList, tInventoryInstList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMZone {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MZone> _selectedList;
    protected BehaviorSelector _selector;
    protected MZoneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMZone ready(List<MZone> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MZoneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MZoneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MLocation> _referrerMLocationList;

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by ZONE_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mZoneList</span>, <span style="color: #553000">zoneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneLoader</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneId_InScope(pkList);
     * cb.query().addOrderBy_ZoneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationList, _selector));
    }

    protected List<MParam> _referrerMParamList;

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by EM_REPLENISH_ZONE_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mZoneList</span>, <span style="color: #553000">zoneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneLoader</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">paramCB</span>.setupSelect...
     *         <span style="color: #553000">paramCB</span>.query().set...
     *         <span style="color: #553000">paramCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">paramLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    paramLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEmReplenishZoneId_InScope(pkList);
     * cb.query().addOrderBy_EmReplenishZoneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMParam> loadMParamList(ConditionBeanSetupper<MParamCB> refCBLambda) {
        myBhv().loadMParamList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMParamList = refLs);
        return hd -> hd.handle(new LoaderOfMParam().ready(_referrerMParamList, _selector));
    }

    protected List<TInventoryInst> _referrerTInventoryInstList;

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by ZONE_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mZoneList</span>, <span style="color: #553000">zoneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneLoader</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">instCB</span>.setupSelect...
     *         <span style="color: #553000">instCB</span>.query().set...
     *         <span style="color: #553000">instCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">instLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    instLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneId_InScope(pkList);
     * cb.query().addOrderBy_ZoneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryInst> loadTInventoryInstList(ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        myBhv().loadTInventoryInstList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryInstList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryInst().ready(_referrerTInventoryInstList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MZone> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
