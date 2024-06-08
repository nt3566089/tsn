package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_PRODUCT_SHAPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_SHAPE_ID
 *
 * [column]
 *     PRODUCT_SHAPE_ID, PRODUCT_ID, SHAPE_GRP_DTL_ID, UNIT_NUM, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SHAPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT, M_SHAPE_GRP_DTL, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_LOCATION
 *
 * [foreign property]
 *     mProduct, mShapeGrpDtl, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mLocationByMaxStoreProductShapeIdList, mLocationByReplenishPProductShapeIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMProductShape {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MProductShape> _selectedList;
    protected BehaviorSelector _selector;
    protected MProductShapeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMProductShape ready(List<MProductShape> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MProductShapeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MProductShapeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MLocation> _referrerMLocationByMaxStoreProductShapeIdList;

    /**
     * Load referrer of MLocationByMaxStoreProductShapeIdList by the set-upper of referrer. <br>
     * M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdList'.
     * <pre>
     * <span style="color: #0000C0">mProductShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadMLocationByMaxStoreProductShapeIdList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProductShape mProductShape : <span style="color: #553000">mProductShapeList</span>) {
     *     ... = mProductShape.<span style="color: #CC4747">getMLocationByMaxStoreProductShapeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMaxStoreProductShapeId_InScope(pkList);
     * cb.query().addOrderBy_MaxStoreProductShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationByMaxStoreProductShapeIdList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationByMaxStoreProductShapeIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationByMaxStoreProductShapeIdList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationByMaxStoreProductShapeIdList, _selector));
    }

    protected List<MLocation> _referrerMLocationByReplenishPProductShapeIdList;

    /**
     * Load referrer of MLocationByReplenishPProductShapeIdList by the set-upper of referrer. <br>
     * M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdList'.
     * <pre>
     * <span style="color: #0000C0">mProductShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadMLocationByReplenishPProductShapeIdList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProductShape mProductShape : <span style="color: #553000">mProductShapeList</span>) {
     *     ... = mProductShape.<span style="color: #CC4747">getMLocationByReplenishPProductShapeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishPProductShapeId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishPProductShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationByReplenishPProductShapeIdList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationByReplenishPProductShapeIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationByReplenishPProductShapeIdList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationByReplenishPProductShapeIdList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMShapeGrpDtl _foreignMShapeGrpDtlLoader;
    public LoaderOfMShapeGrpDtl pulloutMShapeGrpDtl() {
        if (_foreignMShapeGrpDtlLoader == null)
        { _foreignMShapeGrpDtlLoader = new LoaderOfMShapeGrpDtl().ready(myBhv().pulloutMShapeGrpDtl(_selectedList), _selector); }
        return _foreignMShapeGrpDtlLoader;
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
    public List<MProductShape> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
