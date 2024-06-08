package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_SHAPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHAPE_ID
 *
 * [column]
 *     SHAPE_ID, SHAPE_CD, SHAPE_DICT_ID, SHAPE_UNIT_DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     H_INVENTORY_B, H_STOCK, M_SHAPE_GRP_DTL, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK
 *
 * [foreign property]
 *     bDictByShapeDictId, bDictByShapeUnitDictId, vDictByShapeDictId, vDictByShapeUnitDictId, bClassDtlByDelFlg
 *
 * [referrer property]
 *     hInventoryBList, hStockList, mShapeGrpDtlList, tAllocInstBList, tInventoryBList, tMoveInstBList, tPickingBList, tShippingInstBList, tStockList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMShape {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MShape> _selectedList;
    protected BehaviorSelector _selector;
    protected MShapeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMShape ready(List<MShape> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MShapeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MShapeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HInventoryB> _referrerHInventoryBList;

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getHInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHInventoryB> loadHInventoryBList(ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        myBhv().loadHInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfHInventoryB().ready(_referrerHInventoryBList, _selector));
    }

    protected List<HStock> _referrerHStockList;

    /**
     * Load referrer of HStockList by the set-upper of referrer. <br>
     * H_STOCK by SHAPE_ID, named 'HStockList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadHStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getHStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHStock> loadHStockList(ConditionBeanSetupper<HStockCB> refCBLambda) {
        myBhv().loadHStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHStockList = refLs);
        return hd -> hd.handle(new LoaderOfHStock().ready(_referrerHStockList, _selector));
    }

    protected List<MShapeGrpDtl> _referrerMShapeGrpDtlList;

    /**
     * Load referrer of MShapeGrpDtlList by the set-upper of referrer. <br>
     * M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadMShapeGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getMShapeGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShapeGrpDtl> loadMShapeGrpDtlList(ConditionBeanSetupper<MShapeGrpDtlCB> refCBLambda) {
        myBhv().loadMShapeGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShapeGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMShapeGrpDtl().ready(_referrerMShapeGrpDtlList, _selector));
    }

    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBList;

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBList, _selector));
    }

    protected List<TPickingB> _referrerTPickingBList;

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by SHAPE_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingB> loadTPickingBList(ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        myBhv().loadTPickingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingB().ready(_referrerTPickingBList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    protected List<TStock> _referrerTStockList;

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by SHAPE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">shapeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictByShapeDictIdLoader;
    public LoaderOfBDict pulloutBDictByShapeDictId() {
        if (_foreignBDictByShapeDictIdLoader == null)
        { _foreignBDictByShapeDictIdLoader = new LoaderOfBDict().ready(myBhv().pulloutBDictByShapeDictId(_selectedList), _selector); }
        return _foreignBDictByShapeDictIdLoader;
    }

    protected LoaderOfBDict _foreignBDictByShapeUnitDictIdLoader;
    public LoaderOfBDict pulloutBDictByShapeUnitDictId() {
        if (_foreignBDictByShapeUnitDictIdLoader == null)
        { _foreignBDictByShapeUnitDictIdLoader = new LoaderOfBDict().ready(myBhv().pulloutBDictByShapeUnitDictId(_selectedList), _selector); }
        return _foreignBDictByShapeUnitDictIdLoader;
    }

    protected LoaderOfVDict _foreignVDictByShapeDictIdLoader;
    public LoaderOfVDict pulloutVDictByShapeDictId() {
        if (_foreignVDictByShapeDictIdLoader == null)
        { _foreignVDictByShapeDictIdLoader = new LoaderOfVDict().ready(myBhv().pulloutVDictByShapeDictId(_selectedList), _selector); }
        return _foreignVDictByShapeDictIdLoader;
    }

    protected LoaderOfVDict _foreignVDictByShapeUnitDictIdLoader;
    public LoaderOfVDict pulloutVDictByShapeUnitDictId() {
        if (_foreignVDictByShapeUnitDictIdLoader == null)
        { _foreignVDictByShapeUnitDictIdLoader = new LoaderOfVDict().ready(myBhv().pulloutVDictByShapeUnitDictId(_selectedList), _selector); }
        return _foreignVDictByShapeUnitDictIdLoader;
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
    public List<MShape> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
