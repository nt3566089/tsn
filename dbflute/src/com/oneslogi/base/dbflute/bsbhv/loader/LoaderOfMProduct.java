package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_PRODUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, CLIENT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_ID, NMFC_CODE, FREIGHT_CLS, COUNNTRY_OF_ORIGIN, UNIT_VAL, HTS_CD, ITEMGROUP, ACTFLG, INVTYPE, SETITEMFLG, OWNERITEMCD, SUPPLIERITEMCD, POSITEMCD, ITFCD, MANUITEMCD, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, ALLOCPOLICYKEY, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, ABCTYPE, QTY1TYPE, UNIT1, UNIT1STYLE, LENGTH1, WIDTH1, HEIGHT1, GROSSWEIGHT1, NETWEIGHT1, CUBE1, LITER1, UNIT2, UNIT2STYLE, LENGTH2, WIDTH2, HEIGHT2, GROSSWEIGHT2, NETWEIGHT2, CUBE2, LITER2, UNIT3, UNIT3STYLE, LENGTH3, WIDTH3, HEIGHT3, GROSSWEIGHT3, NETWEIGHT3, CUBE3, LITER3, P_QTY, P_HEIGHT, P_ODD, P_DESCRIPTION, NOTES, QTY2USEDFLG, QTY2STYLE, QTY3USEDFLG, QTY3STYLE, SP_CALCFLG, SP_LOTATRB1USEDFLG, SP_OPERATOR1, SP_LOTATRB2USEDFLG, SP_OPERATOR2, SP_LOTATRB3USEDFLG, SP_OPERATOR3, SP_RATE, LOTATRB1TITLE, LOTATRB2TITLE, LOTATRB3TITLE, LOTATRB4TITLE, LOTATRB5TITLE, LOTATRB6TITLE, LOTATRB7TITLE, LOTATRB8TITLE, LOTATRB9TITLE, LOTATRB10TITLE, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, ITEM40, PRICE_INSURANCE, LIMITDAY, DELIVERABLEDAY, PRINTDATEFLG, SUPPLIERCD, DISPATCHQTYTYPE, TARIFFQTYTYPE, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, LOT1NULLFLG, LOT2NULLFLG, LOT3NULLFLG, LOT4NULLFLG, LOT5NULLFLG, OTHERLOT1NULLFLG, OTHERLOT2NULLFLG, OTHERLOT3NULLFLG, OTHERLOT4NULLFLG, OTHERLOT5NULLFLG, ITEMPRINTNAME, PRICELEVEL, ITEMCATALOGURL, USERNUM1, USERNUM2, USERNUM3, USERNUM4, USERNUM5, USERDATE1, USERDATE2, USERDATE3, USERDATE4, USERDATE5, CGGDID, BRCTG, CTWEIGHT, BXOSZL, BXOSZW, BXOSZH, BXCPY, BXWEIGHT, ITEM_ADMIN, SNAME, FractionPieceWeight, TaxEquivalentNumber, SYHNKBNJT, IOID_CLS, ITFCD_CLS, MANUITEMCD_CLS, CTCPY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP, B_CLASS_DTL(ByDelFlg), M_PRODUCT_TERM(AsOne), M_SET_PARENT(AsOne)
 *
 * [referrer table]
 *     M_LOCATION, M_MFWHxITEM, M_PRODUCT_SHAPE, M_SET_STRUCTURE, T_ALLOC_INST_B, T_ALLOC_LOT, T_INVENTORY_B, T_KEEPING_LOT, T_LAST_LOT, T_LOT, T_MOVE_INST_B, T_RECEIVE_PLAN_B, T_SERIAL_NO, T_SHIPPING_INST_B, T_STOCK, T_TRINVCHECKINFO, T_YTRSODETAIL, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT, M_PRODUCT, M_PRODUCT_TERM, M_SET_PARENT
 *
 * [foreign property]
 *     mClient, mProductSelf, mShapeGrp, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, mProductSelfAsOne, mProductTermAsOne, mSetParentAsOne
 *
 * [referrer property]
 *     mLocationList, mMfwhxitemList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tTrinvcheckinfoList, tYtrsodetailList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMProduct ready(List<MProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MLocation> _referrerMLocationList;

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationList, _selector));
    }

    protected List<MMfwhxitem> _referrerMMfwhxitemList;

    /**
     * Load referrer of MMfwhxitemList by the set-upper of referrer. <br>
     * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMMfwhxitemList</span>(<span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">entityCB</span>.setupSelect...
     *         <span style="color: #553000">entityCB</span>.query().set...
     *         <span style="color: #553000">entityCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">entityLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    entityLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMMfwhxitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfwhxitem> loadMMfwhxitemList(ConditionBeanSetupper<MMfwhxitemCB> refCBLambda) {
        myBhv().loadMMfwhxitemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfwhxitemList = refLs);
        return hd -> hd.handle(new LoaderOfMMfwhxitem().ready(_referrerMMfwhxitemList, _selector));
    }

    protected List<MProductShape> _referrerMProductShapeList;

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shapeCB</span>.setupSelect...
     *         <span style="color: #553000">shapeCB</span>.query().set...
     *         <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shapeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shapeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMProductShapeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProductShape> loadMProductShapeList(ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        myBhv().loadMProductShapeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProductShapeList = refLs);
        return hd -> hd.handle(new LoaderOfMProductShape().ready(_referrerMProductShapeList, _selector));
    }

    protected List<MSetStructure> _referrerMSetStructureList;

    /**
     * Load referrer of MSetStructureList by the set-upper of referrer. <br>
     * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMSetStructureList</span>(<span style="color: #553000">structureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">structureCB</span>.setupSelect...
     *         <span style="color: #553000">structureCB</span>.query().set...
     *         <span style="color: #553000">structureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">structureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    structureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMSetStructureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMSetStructure> loadMSetStructureList(ConditionBeanSetupper<MSetStructureCB> refCBLambda) {
        myBhv().loadMSetStructureList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMSetStructureList = refLs);
        return hd -> hd.handle(new LoaderOfMSetStructure().ready(_referrerMSetStructureList, _selector));
    }

    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TAllocLot> _referrerTAllocLotList;

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTAllocLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocLot> loadTAllocLotList(ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        myBhv().loadTAllocLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocLotList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocLot().ready(_referrerTAllocLotList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TKeepingLot> _referrerTKeepingLotList;

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTKeepingLot> loadTKeepingLotList(ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        myBhv().loadTKeepingLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTKeepingLotList = refLs);
        return hd -> hd.handle(new LoaderOfTKeepingLot().ready(_referrerTKeepingLotList, _selector));
    }

    protected List<TLastLot> _referrerTLastLotList;

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTLastLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTLastLot> loadTLastLotList(ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        myBhv().loadTLastLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTLastLotList = refLs);
        return hd -> hd.handle(new LoaderOfTLastLot().ready(_referrerTLastLotList, _selector));
    }

    protected List<TLot> _referrerTLotList;

    /**
     * Load referrer of TLotList by the set-upper of referrer. <br>
     * T_LOT by PRODUCT_ID, named 'TLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTLot> loadTLotList(ConditionBeanSetupper<TLotCB> refCBLambda) {
        myBhv().loadTLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTLotList = refLs);
        return hd -> hd.handle(new LoaderOfTLot().ready(_referrerTLotList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBList;

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBList, _selector));
    }

    protected List<TReceivePlanB> _referrerTReceivePlanBList;

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanB> loadTReceivePlanBList(ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        myBhv().loadTReceivePlanBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanBList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanB().ready(_referrerTReceivePlanBList, _selector));
    }

    protected List<TSerialNo> _referrerTSerialNoList;

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTSerialNo> loadTSerialNoList(ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        myBhv().loadTSerialNoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTSerialNoList = refLs);
        return hd -> hd.handle(new LoaderOfTSerialNo().ready(_referrerTSerialNoList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
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
     * T_STOCK by PRODUCT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<TTrinvcheckinfo> _referrerTTrinvcheckinfoList;

    /**
     * Load referrer of TTrinvcheckinfoList by the set-upper of referrer. <br>
     * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTTrinvcheckinfoList</span>(<span style="color: #553000">trinvcheckinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvcheckinfoCB</span>.setupSelect...
     *         <span style="color: #553000">trinvcheckinfoCB</span>.query().set...
     *         <span style="color: #553000">trinvcheckinfoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvcheckinfoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvcheckinfoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTTrinvcheckinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrinvcheckinfo> loadTTrinvcheckinfoList(ConditionBeanSetupper<TTrinvcheckinfoCB> refCBLambda) {
        myBhv().loadTTrinvcheckinfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrinvcheckinfoList = refLs);
        return hd -> hd.handle(new LoaderOfTTrinvcheckinfo().ready(_referrerTTrinvcheckinfoList, _selector));
    }

    protected List<TYtrsodetail> _referrerTYtrsodetailList;

    /**
     * Load referrer of TYtrsodetailList by the set-upper of referrer. <br>
     * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTYtrsodetailList</span>(<span style="color: #553000">ytrsodetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ytrsodetailCB</span>.setupSelect...
     *         <span style="color: #553000">ytrsodetailCB</span>.query().set...
     *         <span style="color: #553000">ytrsodetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ytrsodetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ytrsodetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTYtrsodetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTYtrsodetail> loadTYtrsodetailList(ConditionBeanSetupper<TYtrsodetailCB> refCBLambda) {
        myBhv().loadTYtrsodetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTYtrsodetailList = refLs);
        return hd -> hd.handle(new LoaderOfTYtrsodetail().ready(_referrerTYtrsodetailList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtInventoryInputProd> loadWHtInventoryInputProdList(ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        myBhv().loadWHtInventoryInputProdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtInventoryInputProdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtInventoryInputProd().ready(_referrerWHtInventoryInputProdList, _selector));
    }

    protected List<WHtReceiveInspection> _referrerWHtReceiveInspectionList;

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveInspection> loadWHtReceiveInspectionList(ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        myBhv().loadWHtReceiveInspectionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveInspectionList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveInspection().ready(_referrerWHtReceiveInspectionList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspList;

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspList, _selector));
    }

    protected List<WHtReceiveStore> _referrerWHtReceiveStoreList;

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveStore> loadWHtReceiveStoreList(ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        myBhv().loadWHtReceiveStoreList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveStoreList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveStore().ready(_referrerWHtReceiveStoreList, _selector));
    }

    protected List<WHtShipping> _referrerWHtShippingList;

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShipping> loadWHtShippingList(ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        myBhv().loadWHtShippingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShipping().ready(_referrerWHtShippingList, _selector));
    }

    protected List<WHtShippingPicking> _referrerWHtShippingPickingList;

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShippingPicking> loadWHtShippingPickingList(ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        myBhv().loadWHtShippingPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShippingPicking().ready(_referrerWHtShippingPickingList, _selector));
    }

    protected List<WSglRowShipInspH> _referrerWSglRowShipInspHList;

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspH> loadWSglRowShipInspHList(ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        myBhv().loadWSglRowShipInspHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspHList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspH().ready(_referrerWSglRowShipInspHList, _selector));
    }

    protected List<WShippingInterrupt> _referrerWShippingInterruptList;

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWShippingInterrupt> loadWShippingInterruptList(ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        myBhv().loadWShippingInterruptList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWShippingInterruptList = refLs);
        return hd -> hd.handle(new LoaderOfWShippingInterrupt().ready(_referrerWShippingInterruptList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMProduct _foreignMProductSelfLoader;
    public LoaderOfMProduct pulloutMProductSelf() {
        if (_foreignMProductSelfLoader == null)
        { _foreignMProductSelfLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProductSelf(_selectedList), _selector); }
        return _foreignMProductSelfLoader;
    }

    protected LoaderOfMShapeGrp _foreignMShapeGrpLoader;
    public LoaderOfMShapeGrp pulloutMShapeGrp() {
        if (_foreignMShapeGrpLoader == null)
        { _foreignMShapeGrpLoader = new LoaderOfMShapeGrp().ready(myBhv().pulloutMShapeGrp(_selectedList), _selector); }
        return _foreignMShapeGrpLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtManagFlg() {
        if (_foreignBClassDtlByLimitDtManagFlgLoader == null)
        { _foreignBClassDtlByLimitDtManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtManagFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtReverseFlg() {
        if (_foreignBClassDtlByLimitDtReverseFlgLoader == null)
        { _foreignBClassDtlByLimitDtReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLotManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLotManagFlg() {
        if (_foreignBClassDtlByLotManagFlgLoader == null)
        { _foreignBClassDtlByLotManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLotManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLotManagFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLotReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLotReverseFlg() {
        if (_foreignBClassDtlByLotReverseFlgLoader == null)
        { _foreignBClassDtlByLotReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLotReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLotReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMergeClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMergeCls() {
        if (_foreignBClassDtlByMergeClsLoader == null)
        { _foreignBClassDtlByMergeClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMergeCls(_selectedList), _selector); }
        return _foreignBClassDtlByMergeClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByShippingStopFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByShippingStopFlg() {
        if (_foreignBClassDtlByShippingStopFlgLoader == null)
        { _foreignBClassDtlByShippingStopFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByShippingStopFlg(_selectedList), _selector); }
        return _foreignBClassDtlByShippingStopFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFreightClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByFreightCls() {
        if (_foreignBClassDtlByFreightClsLoader == null)
        { _foreignBClassDtlByFreightClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFreightCls(_selectedList), _selector); }
        return _foreignBClassDtlByFreightClsLoader;
    }

    protected LoaderOfMProduct _foreignMProductSelfAsOneLoader;
    public LoaderOfMProduct pulloutMProductSelfAsOne() {
        if (_foreignMProductSelfAsOneLoader == null)
        { _foreignMProductSelfAsOneLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProductSelfAsOne(_selectedList), _selector); }
        return _foreignMProductSelfAsOneLoader;
    }

    protected LoaderOfMProductTerm _foreignMProductTermAsOneLoader;
    public LoaderOfMProductTerm pulloutMProductTermAsOne() {
        if (_foreignMProductTermAsOneLoader == null)
        { _foreignMProductTermAsOneLoader = new LoaderOfMProductTerm().ready(myBhv().pulloutMProductTermAsOne(_selectedList), _selector); }
        return _foreignMProductTermAsOneLoader;
    }

    protected LoaderOfMSetParent _foreignMSetParentAsOneLoader;
    public LoaderOfMSetParent pulloutMSetParentAsOne() {
        if (_foreignMSetParentAsOneLoader == null)
        { _foreignMSetParentAsOneLoader = new LoaderOfMSetParent().ready(myBhv().pulloutMSetParentAsOne(_selectedList), _selector); }
        return _foreignMSetParentAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
