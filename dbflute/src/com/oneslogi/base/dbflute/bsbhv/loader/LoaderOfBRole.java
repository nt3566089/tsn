package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ROLE_ID
 *
 * [column]
 *     ROLE_ID, ROLE_CD, DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT
 *
 * [referrer table]
 *     B_COL_ROLE, B_FUNC_ROLE, B_ITEM_ROLE, B_ROLE_GRP_DTL, B_SCREEN_ROLE
 *
 * [foreign property]
 *     bDict, vDict
 *
 * [referrer property]
 *     bColRoleList, bFuncRoleList, bItemRoleList, bRoleGrpDtlList, bScreenRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BRole> _selectedList;
    protected BehaviorSelector _selector;
    protected BRoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBRole ready(List<BRole> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BRoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BRoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BColRole> _referrerBColRoleList;

    /**
     * Load referrer of BColRoleList by the set-upper of referrer. <br>
     * B_COL_ROLE by ROLE_ID, named 'BColRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleLoader</span>.<span style="color: #CC4747">loadBColRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBColRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBColRole> loadBColRoleList(ConditionBeanSetupper<BColRoleCB> refCBLambda) {
        myBhv().loadBColRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBColRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBColRole().ready(_referrerBColRoleList, _selector));
    }

    protected List<BFuncRole> _referrerBFuncRoleList;

    /**
     * Load referrer of BFuncRoleList by the set-upper of referrer. <br>
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleLoader</span>.<span style="color: #CC4747">loadBFuncRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBFuncRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBFuncRole> loadBFuncRoleList(ConditionBeanSetupper<BFuncRoleCB> refCBLambda) {
        myBhv().loadBFuncRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBFuncRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBFuncRole().ready(_referrerBFuncRoleList, _selector));
    }

    protected List<BItemRole> _referrerBItemRoleList;

    /**
     * Load referrer of BItemRoleList by the set-upper of referrer. <br>
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleLoader</span>.<span style="color: #CC4747">loadBItemRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBItemRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBItemRole> loadBItemRoleList(ConditionBeanSetupper<BItemRoleCB> refCBLambda) {
        myBhv().loadBItemRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBItemRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBItemRole().ready(_referrerBItemRoleList, _selector));
    }

    protected List<BRoleGrpDtl> _referrerBRoleGrpDtlList;

    /**
     * Load referrer of BRoleGrpDtlList by the set-upper of referrer. <br>
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleLoader</span>.<span style="color: #CC4747">loadBRoleGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBRoleGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBRoleGrpDtl> loadBRoleGrpDtlList(ConditionBeanSetupper<BRoleGrpDtlCB> refCBLambda) {
        myBhv().loadBRoleGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBRoleGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfBRoleGrpDtl().ready(_referrerBRoleGrpDtlList, _selector));
    }

    protected List<BScreenRole> _referrerBScreenRoleList;

    /**
     * Load referrer of BScreenRoleList by the set-upper of referrer. <br>
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleLoader</span>.<span style="color: #CC4747">loadBScreenRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBScreenRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBScreenRole> loadBScreenRoleList(ConditionBeanSetupper<BScreenRoleCB> refCBLambda) {
        myBhv().loadBScreenRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBScreenRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBScreenRole().ready(_referrerBScreenRoleList, _selector));
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BRole> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
