package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_SCREEN as TABLE. <br>
 * <pre>
 * [primary key]
 *     SCREEN_ID
 *
 * [column]
 *     SCREEN_ID, SCREEN_CD, DICT_ID, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SCREEN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, V_HT_DICT
 *
 * [referrer table]
 *     B_ITEM, B_MENU, B_SCREEN_ROLE, M_CENTER_SCREEN, M_CLIENT_SCREEN
 *
 * [foreign property]
 *     bDict, vDict, vHtDict
 *
 * [referrer property]
 *     bItemList, bMenuList, bScreenRoleList, mCenterScreenList, mClientScreenList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBScreen {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BScreen> _selectedList;
    protected BehaviorSelector _selector;
    protected BScreenBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBScreen ready(List<BScreen> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BScreenBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BScreenBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BItem> _referrerBItemList;

    /**
     * Load referrer of BItemList by the set-upper of referrer. <br>
     * B_ITEM by SCREEN_ID, named 'BItemList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenLoader</span>.<span style="color: #CC4747">loadBItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getBItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
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
     * B_MENU by SCREEN_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenLoader</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">menuCB</span>.setupSelect...
     *         <span style="color: #553000">menuCB</span>.query().set...
     *         <span style="color: #553000">menuCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">menuLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    menuLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getBMenuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBMenu> loadBMenuList(ConditionBeanSetupper<BMenuCB> refCBLambda) {
        myBhv().loadBMenuList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBMenuList = refLs);
        return hd -> hd.handle(new LoaderOfBMenu().ready(_referrerBMenuList, _selector));
    }

    protected List<BScreenRole> _referrerBScreenRoleList;

    /**
     * Load referrer of BScreenRoleList by the set-upper of referrer. <br>
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenLoader</span>.<span style="color: #CC4747">loadBScreenRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getBScreenRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBScreenRole> loadBScreenRoleList(ConditionBeanSetupper<BScreenRoleCB> refCBLambda) {
        myBhv().loadBScreenRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBScreenRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBScreenRole().ready(_referrerBScreenRoleList, _selector));
    }

    protected List<MCenterScreen> _referrerMCenterScreenList;

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenLoader</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterScreen> loadMCenterScreenList(ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        myBhv().loadMCenterScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterScreen().ready(_referrerMCenterScreenList, _selector));
    }

    protected List<MClientScreen> _referrerMClientScreenList;

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenLoader</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientScreen> loadMClientScreenList(ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        myBhv().loadMClientScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMClientScreen().ready(_referrerMClientScreenList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    protected LoaderOfVHtDict _foreignVHtDictLoader;
    public LoaderOfVHtDict pulloutVHtDict() {
        if (_foreignVHtDictLoader == null)
        { _foreignVHtDictLoader = new LoaderOfVHtDict().ready(myBhv().pulloutVHtDict(_selectedList), _selector); }
        return _foreignVHtDictLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BScreen> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
