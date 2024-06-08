package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_DICT as TABLE. <br>
 * <pre>
 * [primary key]
 *     DICT_ID
 *
 * [column]
 *     DICT_ID, DICT_NM, DATA_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByDataType), B_DICT_VALID(AsOne), M_HT_DICT(AsOne)
 *
 * [referrer table]
 *     B_ARG, B_CLASS_DTL, B_COL, B_CULTURE, B_DICT_CULTURE, B_ITEM, B_MENU, B_MENU_GRP, B_ROLE, B_ROLE_GRP, B_SCREEN, M_CENTER_CLASS_DTL, M_CENTER_COL, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_PROCESS_TYPE, M_SHAPE, M_STOCK_TYPE, P_REPORT_LAYOUT_ITEM, P_SUBREP_LAYOUT_ITEM, B_DICT_VALID, M_HT_DICT
 *
 * [foreign property]
 *     bClassDtlByDataType, bDictValidAsOne, mHtDictAsOne
 *
 * [referrer property]
 *     bArgList, bClassDtlList, bColList, bCultureList, bDictCultureList, bItemList, bMenuList, bMenuGrpList, bRoleList, bRoleGrpList, bScreenList, mCenterClassDtlList, mCenterColList, mCenterItemList, mCenterScreenList, mClientColList, mClientItemList, mClientScreenList, mProcessTypeList, mShapeByShapeDictIdList, mShapeByShapeUnitDictIdList, mStockTypeList, pReportLayoutItemList, pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBDict {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BDict> _selectedList;
    protected BehaviorSelector _selector;
    protected BDictBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBDict ready(List<BDict> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BDictBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BDictBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BArg> _referrerBArgList;

    /**
     * Load referrer of BArgList by the set-upper of referrer. <br>
     * B_ARG by DICT_ID, named 'BArgList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBArgList</span>(<span style="color: #553000">argCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">argCB</span>.setupSelect...
     *         <span style="color: #553000">argCB</span>.query().set...
     *         <span style="color: #553000">argCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">argLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    argLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBArgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBArg> loadBArgList(ConditionBeanSetupper<BArgCB> refCBLambda) {
        myBhv().loadBArgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBArgList = refLs);
        return hd -> hd.handle(new LoaderOfBArg().ready(_referrerBArgList, _selector));
    }

    protected List<BClassDtl> _referrerBClassDtlList;

    /**
     * Load referrer of BClassDtlList by the set-upper of referrer. <br>
     * B_CLASS_DTL by DICT_ID, named 'BClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBClassDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBClassDtl> loadBClassDtlList(ConditionBeanSetupper<BClassDtlCB> refCBLambda) {
        myBhv().loadBClassDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBClassDtlList = refLs);
        return hd -> hd.handle(new LoaderOfBClassDtl().ready(_referrerBClassDtlList, _selector));
    }

    protected List<BCol> _referrerBColList;

    /**
     * Load referrer of BColList by the set-upper of referrer. <br>
     * B_COL by DICT_ID, named 'BColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBCol> loadBColList(ConditionBeanSetupper<BColCB> refCBLambda) {
        myBhv().loadBColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBColList = refLs);
        return hd -> hd.handle(new LoaderOfBCol().ready(_referrerBColList, _selector));
    }

    protected List<BCulture> _referrerBCultureList;

    /**
     * Load referrer of BCultureList by the set-upper of referrer. <br>
     * B_CULTURE by DICT_ID, named 'BCultureList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBCultureList</span>(<span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cultureCB</span>.setupSelect...
     *         <span style="color: #553000">cultureCB</span>.query().set...
     *         <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cultureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cultureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBCultureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBCulture> loadBCultureList(ConditionBeanSetupper<BCultureCB> refCBLambda) {
        myBhv().loadBCultureList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBCultureList = refLs);
        return hd -> hd.handle(new LoaderOfBCulture().ready(_referrerBCultureList, _selector));
    }

    protected List<BDictCulture> _referrerBDictCultureList;

    /**
     * Load referrer of BDictCultureList by the set-upper of referrer. <br>
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBDictCultureList</span>(<span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cultureCB</span>.setupSelect...
     *         <span style="color: #553000">cultureCB</span>.query().set...
     *         <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cultureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cultureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBDictCultureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBDictCulture> loadBDictCultureList(ConditionBeanSetupper<BDictCultureCB> refCBLambda) {
        myBhv().loadBDictCultureList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBDictCultureList = refLs);
        return hd -> hd.handle(new LoaderOfBDictCulture().ready(_referrerBDictCultureList, _selector));
    }

    protected List<BItem> _referrerBItemList;

    /**
     * Load referrer of BItemList by the set-upper of referrer. <br>
     * B_ITEM by DICT_ID, named 'BItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBItem> loadBItemList(ConditionBeanSetupper<BItemCB> refCBLambda) {
        myBhv().loadBItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBItemList = refLs);
        return hd -> hd.handle(new LoaderOfBItem().ready(_referrerBItemList, _selector));
    }

    protected List<BMenu> _referrerBMenuList;

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by DICT_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">menuCB</span>.setupSelect...
     *         <span style="color: #553000">menuCB</span>.query().set...
     *         <span style="color: #553000">menuCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">menuLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    menuLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBMenuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBMenu> loadBMenuList(ConditionBeanSetupper<BMenuCB> refCBLambda) {
        myBhv().loadBMenuList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBMenuList = refLs);
        return hd -> hd.handle(new LoaderOfBMenu().ready(_referrerBMenuList, _selector));
    }

    protected List<BMenuGrp> _referrerBMenuGrpList;

    /**
     * Load referrer of BMenuGrpList by the set-upper of referrer. <br>
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBMenuGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBMenuGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBMenuGrp> loadBMenuGrpList(ConditionBeanSetupper<BMenuGrpCB> refCBLambda) {
        myBhv().loadBMenuGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBMenuGrpList = refLs);
        return hd -> hd.handle(new LoaderOfBMenuGrp().ready(_referrerBMenuGrpList, _selector));
    }

    protected List<BRole> _referrerBRoleList;

    /**
     * Load referrer of BRoleList by the set-upper of referrer. <br>
     * B_ROLE by DICT_ID, named 'BRoleList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBRole> loadBRoleList(ConditionBeanSetupper<BRoleCB> refCBLambda) {
        myBhv().loadBRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBRole().ready(_referrerBRoleList, _selector));
    }

    protected List<BRoleGrp> _referrerBRoleGrpList;

    /**
     * Load referrer of BRoleGrpList by the set-upper of referrer. <br>
     * B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBRoleGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBRoleGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBRoleGrp> loadBRoleGrpList(ConditionBeanSetupper<BRoleGrpCB> refCBLambda) {
        myBhv().loadBRoleGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBRoleGrpList = refLs);
        return hd -> hd.handle(new LoaderOfBRoleGrp().ready(_referrerBRoleGrpList, _selector));
    }

    protected List<BScreen> _referrerBScreenList;

    /**
     * Load referrer of BScreenList by the set-upper of referrer. <br>
     * B_SCREEN by DICT_ID, named 'BScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadBScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBScreen> loadBScreenList(ConditionBeanSetupper<BScreenCB> refCBLambda) {
        myBhv().loadBScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBScreenList = refLs);
        return hd -> hd.handle(new LoaderOfBScreen().ready(_referrerBScreenList, _selector));
    }

    protected List<MCenterClassDtl> _referrerMCenterClassDtlList;

    /**
     * Load referrer of MCenterClassDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMCenterClassDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterClassDtl> loadMCenterClassDtlList(ConditionBeanSetupper<MCenterClassDtlCB> refCBLambda) {
        myBhv().loadMCenterClassDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterClassDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterClassDtl().ready(_referrerMCenterClassDtlList, _selector));
    }

    protected List<MCenterCol> _referrerMCenterColList;

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by DICT_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCol> loadMCenterColList(ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        myBhv().loadMCenterColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterColList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCol().ready(_referrerMCenterColList, _selector));
    }

    protected List<MCenterItem> _referrerMCenterItemList;

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterItem> loadMCenterItemList(ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        myBhv().loadMCenterItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterItemList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterItem().ready(_referrerMCenterItemList, _selector));
    }

    protected List<MCenterScreen> _referrerMCenterScreenList;

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterScreen> loadMCenterScreenList(ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        myBhv().loadMCenterScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterScreen().ready(_referrerMCenterScreenList, _selector));
    }

    protected List<MClientCol> _referrerMClientColList;

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by DICT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCol> loadMClientColList(ConditionBeanSetupper<MClientColCB> refCBLambda) {
        myBhv().loadMClientColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientColList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCol().ready(_referrerMClientColList, _selector));
    }

    protected List<MClientItem> _referrerMClientItemList;

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientItem> loadMClientItemList(ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        myBhv().loadMClientItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientItemList = refLs);
        return hd -> hd.handle(new LoaderOfMClientItem().ready(_referrerMClientItemList, _selector));
    }

    protected List<MClientScreen> _referrerMClientScreenList;

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientScreen> loadMClientScreenList(ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        myBhv().loadMClientScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMClientScreen().ready(_referrerMClientScreenList, _selector));
    }

    protected List<MProcessType> _referrerMProcessTypeList;

    /**
     * Load referrer of MProcessTypeList by the set-upper of referrer. <br>
     * M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMProcessTypeList</span>(<span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">typeCB</span>.setupSelect...
     *         <span style="color: #553000">typeCB</span>.query().set...
     *         <span style="color: #553000">typeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">typeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    typeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMProcessTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProcessType> loadMProcessTypeList(ConditionBeanSetupper<MProcessTypeCB> refCBLambda) {
        myBhv().loadMProcessTypeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProcessTypeList = refLs);
        return hd -> hd.handle(new LoaderOfMProcessType().ready(_referrerMProcessTypeList, _selector));
    }

    protected List<MShape> _referrerMShapeByShapeDictIdList;

    /**
     * Load referrer of MShapeByShapeDictIdList by the set-upper of referrer. <br>
     * M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMShapeByShapeDictIdList</span>(<span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shapeCB</span>.setupSelect...
     *         <span style="color: #553000">shapeCB</span>.query().set...
     *         <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shapeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shapeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMShapeByShapeDictIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeDictId_InScope(pkList);
     * cb.query().addOrderBy_ShapeDictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShape> loadMShapeByShapeDictIdList(ConditionBeanSetupper<MShapeCB> refCBLambda) {
        myBhv().loadMShapeByShapeDictIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShapeByShapeDictIdList = refLs);
        return hd -> hd.handle(new LoaderOfMShape().ready(_referrerMShapeByShapeDictIdList, _selector));
    }

    protected List<MShape> _referrerMShapeByShapeUnitDictIdList;

    /**
     * Load referrer of MShapeByShapeUnitDictIdList by the set-upper of referrer. <br>
     * M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMShapeByShapeUnitDictIdList</span>(<span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shapeCB</span>.setupSelect...
     *         <span style="color: #553000">shapeCB</span>.query().set...
     *         <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shapeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shapeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMShapeByShapeUnitDictIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeUnitDictId_InScope(pkList);
     * cb.query().addOrderBy_ShapeUnitDictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShape> loadMShapeByShapeUnitDictIdList(ConditionBeanSetupper<MShapeCB> refCBLambda) {
        myBhv().loadMShapeByShapeUnitDictIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShapeByShapeUnitDictIdList = refLs);
        return hd -> hd.handle(new LoaderOfMShape().ready(_referrerMShapeByShapeUnitDictIdList, _selector));
    }

    protected List<MStockType> _referrerMStockTypeList;

    /**
     * Load referrer of MStockTypeList by the set-upper of referrer. <br>
     * M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadMStockTypeList</span>(<span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">typeCB</span>.setupSelect...
     *         <span style="color: #553000">typeCB</span>.query().set...
     *         <span style="color: #553000">typeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">typeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    typeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMStockTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMStockType> loadMStockTypeList(ConditionBeanSetupper<MStockTypeCB> refCBLambda) {
        myBhv().loadMStockTypeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMStockTypeList = refLs);
        return hd -> hd.handle(new LoaderOfMStockType().ready(_referrerMStockTypeList, _selector));
    }

    protected List<PReportLayoutItem> _referrerPReportLayoutItemList;

    /**
     * Load referrer of PReportLayoutItemList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadPReportLayoutItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getPReportLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPReportLayoutItem> loadPReportLayoutItemList(ConditionBeanSetupper<PReportLayoutItemCB> refCBLambda) {
        myBhv().loadPReportLayoutItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPReportLayoutItemList = refLs);
        return hd -> hd.handle(new LoaderOfPReportLayoutItem().ready(_referrerPReportLayoutItemList, _selector));
    }

    protected List<PSubrepLayoutItem> _referrerPSubrepLayoutItemList;

    /**
     * Load referrer of PSubrepLayoutItemList by the set-upper of referrer. <br>
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dictLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dictLoader</span>.<span style="color: #CC4747">loadPSubrepLayoutItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getPSubrepLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPSubrepLayoutItem> loadPSubrepLayoutItemList(ConditionBeanSetupper<PSubrepLayoutItemCB> refCBLambda) {
        myBhv().loadPSubrepLayoutItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPSubrepLayoutItemList = refLs);
        return hd -> hd.handle(new LoaderOfPSubrepLayoutItem().ready(_referrerPSubrepLayoutItemList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByDataTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDataType() {
        if (_foreignBClassDtlByDataTypeLoader == null)
        { _foreignBClassDtlByDataTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDataType(_selectedList), _selector); }
        return _foreignBClassDtlByDataTypeLoader;
    }

    protected LoaderOfBDictValid _foreignBDictValidAsOneLoader;
    public LoaderOfBDictValid pulloutBDictValidAsOne() {
        if (_foreignBDictValidAsOneLoader == null)
        { _foreignBDictValidAsOneLoader = new LoaderOfBDictValid().ready(myBhv().pulloutBDictValidAsOne(_selectedList), _selector); }
        return _foreignBDictValidAsOneLoader;
    }

    protected LoaderOfMHtDict _foreignMHtDictAsOneLoader;
    public LoaderOfMHtDict pulloutMHtDictAsOne() {
        if (_foreignMHtDictAsOneLoader == null)
        { _foreignMHtDictAsOneLoader = new LoaderOfMHtDict().ready(myBhv().pulloutMHtDictAsOne(_selectedList), _selector); }
        return _foreignMHtDictAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BDict> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
