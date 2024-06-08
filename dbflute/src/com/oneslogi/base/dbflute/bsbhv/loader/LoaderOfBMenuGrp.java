package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_MENU_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     MENU_GRP_ID
 *
 * [column]
 *     MENU_GRP_ID, MENU_GRP_CD, DICT_ID, PARENT_MENU_GRP_ID, VIEW_ORDER, VISIBLE_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_MENU_GRP, V_DICT, V_HT_DICT
 *
 * [referrer table]
 *     B_MENU, B_MENU_GRP
 *
 * [foreign property]
 *     bDict, bMenuGrpSelf, vDict, vHtDict
 *
 * [referrer property]
 *     bMenuList, bMenuGrpSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBMenuGrp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BMenuGrp> _selectedList;
    protected BehaviorSelector _selector;
    protected BMenuGrpBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBMenuGrp ready(List<BMenuGrp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BMenuGrpBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BMenuGrpBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BMenu> _referrerBMenuList;

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by MENU_GRP_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bMenuGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">menuCB</span>.setupSelect...
     *         <span style="color: #553000">menuCB</span>.query().set...
     *         <span style="color: #553000">menuCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">menuLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    menuLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BMenuGrp bMenuGrp : <span style="color: #553000">bMenuGrpList</span>) {
     *     ... = bMenuGrp.<span style="color: #CC4747">getBMenuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMenuGrpId_InScope(pkList);
     * cb.query().addOrderBy_MenuGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBMenu> loadBMenuList(ConditionBeanSetupper<BMenuCB> refCBLambda) {
        myBhv().loadBMenuList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBMenuList = refLs);
        return hd -> hd.handle(new LoaderOfBMenu().ready(_referrerBMenuList, _selector));
    }

    protected List<BMenuGrp> _referrerBMenuGrpSelfList;

    /**
     * Load referrer of BMenuGrpSelfList by the set-upper of referrer. <br>
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfList'.
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bMenuGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadBMenuGrpSelfList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BMenuGrp bMenuGrp : <span style="color: #553000">bMenuGrpList</span>) {
     *     ... = bMenuGrp.<span style="color: #CC4747">getBMenuGrpSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentMenuGrpId_InScope(pkList);
     * cb.query().addOrderBy_ParentMenuGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBMenuGrp> loadBMenuGrpSelfList(ConditionBeanSetupper<BMenuGrpCB> refCBLambda) {
        myBhv().loadBMenuGrpSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBMenuGrpSelfList = refLs);
        return hd -> hd.handle(new LoaderOfBMenuGrp().ready(_referrerBMenuGrpSelfList, _selector));
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

    protected LoaderOfBMenuGrp _foreignBMenuGrpSelfLoader;
    public LoaderOfBMenuGrp pulloutBMenuGrpSelf() {
        if (_foreignBMenuGrpSelfLoader == null)
        { _foreignBMenuGrpSelfLoader = new LoaderOfBMenuGrp().ready(myBhv().pulloutBMenuGrpSelf(_selectedList), _selector); }
        return _foreignBMenuGrpSelfLoader;
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
    public List<BMenuGrp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
