package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_SHAPE_GRP_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHAPE_GRP_DTL_ID
 *
 * [column]
 *     SHAPE_GRP_DTL_ID, SHAPE_GRP_ID, SHAPE_ID, GTIN14_SYMBOL, CASE_PICK_FLG, SHAPE_SORT, EM_REPLENISH_SHAPE_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_SHAPE_GRP, M_SHAPE, B_CLASS_DTL(ByCasePickFlg)
 *
 * [referrer table]
 *     M_PRODUCT_SHAPE
 *
 * [foreign property]
 *     mShapeGrp, mShape, bClassDtlByCasePickFlg, bClassDtlByEmReplenishShapeFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mProductShapeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMShapeGrpDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MShapeGrpDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected MShapeGrpDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMShapeGrpDtl ready(List<MShapeGrpDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MShapeGrpDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MShapeGrpDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MProductShape> _referrerMProductShapeList;

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeGrpDtlList</span>, <span style="color: #553000">dtlLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlLoader</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shapeCB</span>.setupSelect...
     *         <span style="color: #553000">shapeCB</span>.query().set...
     *         <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shapeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shapeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShapeGrpDtl mShapeGrpDtl : <span style="color: #553000">mShapeGrpDtlList</span>) {
     *     ... = mShapeGrpDtl.<span style="color: #CC4747">getMProductShapeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpDtlId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpDtlId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProductShape> loadMProductShapeList(ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        myBhv().loadMProductShapeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProductShapeList = refLs);
        return hd -> hd.handle(new LoaderOfMProductShape().ready(_referrerMProductShapeList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMShapeGrp _foreignMShapeGrpLoader;
    public LoaderOfMShapeGrp pulloutMShapeGrp() {
        if (_foreignMShapeGrpLoader == null)
        { _foreignMShapeGrpLoader = new LoaderOfMShapeGrp().ready(myBhv().pulloutMShapeGrp(_selectedList), _selector); }
        return _foreignMShapeGrpLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCasePickFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCasePickFlg() {
        if (_foreignBClassDtlByCasePickFlgLoader == null)
        { _foreignBClassDtlByCasePickFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCasePickFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCasePickFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEmReplenishShapeFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEmReplenishShapeFlg() {
        if (_foreignBClassDtlByEmReplenishShapeFlgLoader == null)
        { _foreignBClassDtlByEmReplenishShapeFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEmReplenishShapeFlg(_selectedList), _selector); }
        return _foreignBClassDtlByEmReplenishShapeFlgLoader;
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
    public List<MShapeGrpDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
